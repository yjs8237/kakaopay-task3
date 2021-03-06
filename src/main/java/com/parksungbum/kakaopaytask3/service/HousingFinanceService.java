package com.parksungbum.kakaopaytask3.service;

import com.parksungbum.kakaopaytask3.domain.housingfinance.HousingFinance;
import com.parksungbum.kakaopaytask3.domain.housingfinance.HousingFinanceRepository;
import com.parksungbum.kakaopaytask3.domain.housingfinance.Month;
import com.parksungbum.kakaopaytask3.domain.housingfinance.Year;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HousingFinanceService {
    private final HousingFinanceRepository housingFinanceRepository;

    public HousingFinanceService(final HousingFinanceRepository housingFinanceRepository) {
        this.housingFinanceRepository = housingFinanceRepository;
    }

    @Transactional()
    public HousingFinance save(final int year, final int month) {
        HousingFinance housingFinance = new HousingFinance(new Year(year), new Month(month));
        return housingFinanceRepository.save(housingFinance);
    }
}

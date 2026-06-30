package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes9.dex */
public class MobileRemittanceServiceImpl extends com.tencent.kinda.framework.sns_cross.BaseSnsSceneService {
    @Override // com.tencent.kinda.framework.sns_cross.BaseSnsSceneService, com.tencent.kinda.framework.sns_cross.ISnsSceneService
    public com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData() {
        com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData = super.generateSnsUseCaseData();
        if (this.mBean.getPayInfo() != null && this.mBean.getPayInfo().f192122u != null) {
            generateSnsUseCaseData.putString("cashier_desc", this.mBean.getPayInfo().f192122u.getString("extinfo_key_12"));
        }
        return generateSnsUseCaseData;
    }
}

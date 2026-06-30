package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes9.dex */
public class T2BSceneServiceImpl extends com.tencent.kinda.framework.sns_cross.BaseSnsSceneService {
    @Override // com.tencent.kinda.framework.sns_cross.BaseSnsSceneService, com.tencent.kinda.framework.sns_cross.ISnsSceneService
    public com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData() {
        com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData = super.generateSnsUseCaseData();
        if (this.mBean.getPayInfo() != null && this.mBean.getPayInfo().f192122u != null) {
            android.os.Bundle bundle = this.mBean.getPayInfo().f192122u;
            generateSnsUseCaseData.putString("cashier_desc", this.mBean.getContext().getString(com.tencent.mm.R.string.f492813hz0, this.mBean.getContext().getString(com.tencent.mm.R.string.aev, bundle.getString("extinfo_key_3"), bundle.getString("extinfo_key_4")) + this.mBean.getTrueName()));
        }
        return generateSnsUseCaseData;
    }
}

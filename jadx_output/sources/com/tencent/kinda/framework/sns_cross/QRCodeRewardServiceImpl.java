package com.tencent.kinda.framework.sns_cross;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class QRCodeRewardServiceImpl extends com.tencent.kinda.framework.sns_cross.BaseSnsSceneService {
    @Override // com.tencent.kinda.framework.sns_cross.BaseSnsSceneService, com.tencent.kinda.framework.sns_cross.ISnsSceneService
    public com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData() {
        com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData = super.generateSnsUseCaseData();
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.mBean.getPayInfo();
        generateSnsUseCaseData.putString("rece_desc", "收款方");
        generateSnsUseCaseData.putString("rece_name", this.mBean.getPayInfo().f192122u.getString("extinfo_key_28"));
        generateSnsUseCaseData.putString(dm.i4.COL_USERNAME, this.mBean.getReceiverName());
        generateSnsUseCaseData.putString("rece_img_url", this.mBean.getPayInfo().f192122u.getString("extinfo_key_27"));
        generateSnsUseCaseData.putString("cashier_desc", this.mBean.getContext().getString(com.tencent.mm.R.string.hox));
        generateSnsUseCaseData.putString("rece_remark", this.mBean.getPayInfo().f192122u.getString("extinfo_key_3"));
        generateSnsUseCaseData.putString("payee_remark", this.mBean.getPayInfo().f192122u.getString("extinfo_key_7"));
        generateSnsUseCaseData.putInt("chat_type", payInfo.f192122u.getInt("chat_type"));
        generateSnsUseCaseData.putInt("send_type", payInfo.f192122u.getInt("send_type"));
        return generateSnsUseCaseData;
    }
}

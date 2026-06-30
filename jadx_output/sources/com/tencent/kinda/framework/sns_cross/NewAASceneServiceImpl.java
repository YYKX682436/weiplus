package com.tencent.kinda.framework.sns_cross;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class NewAASceneServiceImpl extends com.tencent.kinda.framework.sns_cross.BaseSnsSceneService {
    @Override // com.tencent.kinda.framework.sns_cross.BaseSnsSceneService, com.tencent.kinda.framework.sns_cross.ISnsSceneService
    public com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData() {
        android.os.Bundle bundle;
        com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData = super.generateSnsUseCaseData();
        java.lang.String receiverText = com.tencent.kinda.framework.sns_cross.SnsTextUtil.getReceiverText(this.mBean.getContext(), this.mBean.getReceiverName(), this.mBean.getTrueName());
        generateSnsUseCaseData.putString("prepay_page_payee", receiverText);
        generateSnsUseCaseData.putString("cashier_desc", this.mBean.getContext().getString(com.tencent.mm.R.string.kwo, receiverText));
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.mBean.getPayInfo();
        if (payInfo != null && (bundle = payInfo.f192122u) != null) {
            generateSnsUseCaseData.putInt("chat_type", bundle.getInt("chat_type"));
            generateSnsUseCaseData.putInt("send_type", payInfo.f192122u.getInt("send_type"));
        }
        return generateSnsUseCaseData;
    }
}

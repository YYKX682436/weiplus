package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes9.dex */
public class HongBaoServiceImpl extends com.tencent.kinda.framework.sns_cross.BaseSnsSceneService {
    @Override // com.tencent.kinda.framework.sns_cross.BaseSnsSceneService, com.tencent.kinda.framework.sns_cross.ISnsSceneService
    public com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData() {
        android.os.Bundle bundle;
        com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData = super.generateSnsUseCaseData();
        java.lang.String string = this.mBean.getContext().getResources().getString(com.tencent.mm.R.string.f492445go2);
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.mBean.getPayInfo();
        generateSnsUseCaseData.putString("cashier_desc", string);
        if (payInfo != null && (bundle = payInfo.f192122u) != null) {
            generateSnsUseCaseData.putInt("chat_type", bundle.getInt("chat_type"));
            generateSnsUseCaseData.putInt("send_type", payInfo.f192122u.getInt("send_type"));
            generateSnsUseCaseData.putString("biz_id", payInfo.f192122u.getString("biz_id"));
        }
        return generateSnsUseCaseData;
    }
}

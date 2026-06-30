package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes9.dex */
public class DefaultSnsServiceImpl extends com.tencent.kinda.framework.sns_cross.BaseSnsSceneService {
    @Override // com.tencent.kinda.framework.sns_cross.BaseSnsSceneService, com.tencent.kinda.framework.sns_cross.ISnsSceneService
    public com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData() {
        android.os.Bundle bundle;
        com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData = super.generateSnsUseCaseData();
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.mBean.getPayInfo();
        if (payInfo != null && (bundle = payInfo.f192122u) != null) {
            generateSnsUseCaseData.putString("cashier_desc", bundle.getString("cashier_desc"));
            generateSnsUseCaseData.putString("succ_tip", bundle.getString("succ_tip"));
            generateSnsUseCaseData.putString("prepay_page_payee", bundle.getString("prepay_page_payee"));
            generateSnsUseCaseData.putString("receiver_username", bundle.getString("receiver_username"));
            generateSnsUseCaseData.putString("openim_cashier_format", bundle.getString("openim_cashier_format"));
            generateSnsUseCaseData.putString("openim_succ_format", bundle.getString("openim_succ_format"));
            generateSnsUseCaseData.putString("openim_nickname", bundle.getString("openim_nickname"));
            generateSnsUseCaseData.putString("openim_truename", bundle.getString("openim_truename"));
            generateSnsUseCaseData.putString("openim_businessname", bundle.getString("openim_businessname"));
            generateSnsUseCaseData.putBool("need_kinda_cashier_Loading", bundle.getBoolean("need_kinda_cashier_Loading", false));
            generateSnsUseCaseData.putBool("yunshanfu_disabled", bundle.getBoolean("yunshanfu_disabled"));
            generateSnsUseCaseData.putInt("chat_type", payInfo.f192122u.getInt("chat_type"));
            generateSnsUseCaseData.putInt("send_type", payInfo.f192122u.getInt("send_type"));
            generateSnsUseCaseData.putString("selected_contact_user_name_display", bundle.getString("selected_contact_user_name_display"));
            generateSnsUseCaseData.putString("qrcodeSenderName", payInfo.f192122u.getString("qrcodeSenderName"));
            generateSnsUseCaseData.putString("qrcodeSenderMsgId", payInfo.f192122u.getString("qrcodeSenderMsgId"));
            generateSnsUseCaseData.putInt("payChannel", payInfo.f192111g);
            generateSnsUseCaseData.putString("biz_id", payInfo.f192122u.getString("biz_id"));
            generateSnsUseCaseData.putString("initRawUrl", payInfo.f192122u.getString("payInitRawUrl", ""));
            generateSnsUseCaseData.putLong("initTimestamp", payInfo.f192122u.getLong("payInitTimestamp", 0L));
            generateSnsUseCaseData.putString("latestUrl", payInfo.f192122u.getString("qrcode_url", ""));
            if (this.mBean.getPayScene() == 32 || this.mBean.getPayScene() == 33) {
                generateSnsUseCaseData.putBinary("after_place_order_commreq", bundle.getByteArray("after_place_order_commreq"));
                generateSnsUseCaseData.putString("suc_page_extend", bundle.getString("suc_page_extend"));
                generateSnsUseCaseData.putInt("fault_flag", bundle.getInt("fault_flag"));
                generateSnsUseCaseData.putString("suc_page_name", bundle.getString("suc_page_name"));
                generateSnsUseCaseData.putString("rece_photo_url", bundle.getString("rece_photo_url"));
            }
        }
        return generateSnsUseCaseData;
    }
}

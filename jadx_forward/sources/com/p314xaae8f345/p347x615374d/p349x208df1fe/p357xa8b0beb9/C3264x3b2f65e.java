package com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9;

/* renamed from: com.tencent.kinda.framework.sns_cross.DefaultSnsServiceImpl */
/* loaded from: classes9.dex */
public class C3264x3b2f65e extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.AbstractC3263xf194af0 {
    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.AbstractC3263xf194af0, com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3266xa5a26a98
    /* renamed from: generateSnsUseCaseData */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e mo25994x63ee79de() {
        android.os.Bundle bundle;
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e mo25994x63ee79de = super.mo25994x63ee79de();
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 m26002xed93140 = this.f12492x61f89bd.m26002xed93140();
        if (m26002xed93140 != null && (bundle = m26002xed93140.f273655u) != null) {
            mo25994x63ee79de.mo27566xe4673800("cashier_desc", bundle.getString("cashier_desc"));
            mo25994x63ee79de.mo27566xe4673800("succ_tip", bundle.getString("succ_tip"));
            mo25994x63ee79de.mo27566xe4673800("prepay_page_payee", bundle.getString("prepay_page_payee"));
            mo25994x63ee79de.mo27566xe4673800("receiver_username", bundle.getString("receiver_username"));
            mo25994x63ee79de.mo27566xe4673800("openim_cashier_format", bundle.getString("openim_cashier_format"));
            mo25994x63ee79de.mo27566xe4673800("openim_succ_format", bundle.getString("openim_succ_format"));
            mo25994x63ee79de.mo27566xe4673800("openim_nickname", bundle.getString("openim_nickname"));
            mo25994x63ee79de.mo27566xe4673800("openim_truename", bundle.getString("openim_truename"));
            mo25994x63ee79de.mo27566xe4673800("openim_businessname", bundle.getString("openim_businessname"));
            mo25994x63ee79de.mo27556xf2e34299("need_kinda_cashier_Loading", bundle.getBoolean("need_kinda_cashier_Loading", false));
            mo25994x63ee79de.mo27556xf2e34299("yunshanfu_disabled", bundle.getBoolean("yunshanfu_disabled"));
            mo25994x63ee79de.mo27557xc5c55e60("chat_type", m26002xed93140.f273655u.getInt("chat_type"));
            mo25994x63ee79de.mo27557xc5c55e60("send_type", m26002xed93140.f273655u.getInt("send_type"));
            mo25994x63ee79de.mo27566xe4673800("selected_contact_user_name_display", bundle.getString("selected_contact_user_name_display"));
            mo25994x63ee79de.mo27566xe4673800("qrcodeSenderName", m26002xed93140.f273655u.getString("qrcodeSenderName"));
            mo25994x63ee79de.mo27566xe4673800("qrcodeSenderMsgId", m26002xed93140.f273655u.getString("qrcodeSenderMsgId"));
            mo25994x63ee79de.mo27557xc5c55e60("payChannel", m26002xed93140.f273644g);
            mo25994x63ee79de.mo27566xe4673800("biz_id", m26002xed93140.f273655u.getString("biz_id"));
            mo25994x63ee79de.mo27566xe4673800("initRawUrl", m26002xed93140.f273655u.getString("payInitRawUrl", ""));
            mo25994x63ee79de.mo27564xf2e7ce2b("initTimestamp", m26002xed93140.f273655u.getLong("payInitTimestamp", 0L));
            mo25994x63ee79de.mo27566xe4673800("latestUrl", m26002xed93140.f273655u.getString("qrcode_url", ""));
            if (this.f12492x61f89bd.m26003xccd4de3a() == 32 || this.f12492x61f89bd.m26003xccd4de3a() == 33) {
                mo25994x63ee79de.mo27555xc6c7e3f0("after_place_order_commreq", bundle.getByteArray("after_place_order_commreq"));
                mo25994x63ee79de.mo27566xe4673800("suc_page_extend", bundle.getString("suc_page_extend"));
                mo25994x63ee79de.mo27557xc5c55e60("fault_flag", bundle.getInt("fault_flag"));
                mo25994x63ee79de.mo27566xe4673800("suc_page_name", bundle.getString("suc_page_name"));
                mo25994x63ee79de.mo27566xe4673800("rece_photo_url", bundle.getString("rece_photo_url"));
            }
        }
        return mo25994x63ee79de;
    }
}

package com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.kinda.framework.sns_cross.QRCodeRewardServiceImpl */
/* loaded from: classes9.dex */
public class C3273x8706adb8 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.AbstractC3263xf194af0 {
    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.AbstractC3263xf194af0, com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3266xa5a26a98
    /* renamed from: generateSnsUseCaseData */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e mo25994x63ee79de() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e mo25994x63ee79de = super.mo25994x63ee79de();
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 m26002xed93140 = this.f12492x61f89bd.m26002xed93140();
        mo25994x63ee79de.mo27566xe4673800("rece_desc", "收款方");
        mo25994x63ee79de.mo27566xe4673800("rece_name", this.f12492x61f89bd.m26002xed93140().f273655u.getString("extinfo_key_28"));
        mo25994x63ee79de.mo27566xe4673800(dm.i4.f66875xa013b0d5, this.f12492x61f89bd.m26004x33eedb90());
        mo25994x63ee79de.mo27566xe4673800("rece_img_url", this.f12492x61f89bd.m26002xed93140().f273655u.getString("extinfo_key_27"));
        mo25994x63ee79de.mo27566xe4673800("cashier_desc", this.f12492x61f89bd.m26001x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hox));
        mo25994x63ee79de.mo27566xe4673800("rece_remark", this.f12492x61f89bd.m26002xed93140().f273655u.getString("extinfo_key_3"));
        mo25994x63ee79de.mo27566xe4673800("payee_remark", this.f12492x61f89bd.m26002xed93140().f273655u.getString("extinfo_key_7"));
        mo25994x63ee79de.mo27557xc5c55e60("chat_type", m26002xed93140.f273655u.getInt("chat_type"));
        mo25994x63ee79de.mo27557xc5c55e60("send_type", m26002xed93140.f273655u.getInt("send_type"));
        return mo25994x63ee79de;
    }
}

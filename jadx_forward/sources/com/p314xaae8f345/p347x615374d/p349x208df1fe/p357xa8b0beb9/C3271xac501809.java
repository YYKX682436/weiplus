package com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.kinda.framework.sns_cross.NewAASceneServiceImpl */
/* loaded from: classes9.dex */
public class C3271xac501809 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.AbstractC3263xf194af0 {
    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.AbstractC3263xf194af0, com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3266xa5a26a98
    /* renamed from: generateSnsUseCaseData */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e mo25994x63ee79de() {
        android.os.Bundle bundle;
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e mo25994x63ee79de = super.mo25994x63ee79de();
        java.lang.String m26014x33f1a632 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3276xa07b1c47.m26014x33f1a632(this.f12492x61f89bd.m26001x76847179(), this.f12492x61f89bd.m26004x33eedb90(), this.f12492x61f89bd.m26006xe9c42aaf());
        mo25994x63ee79de.mo27566xe4673800("prepay_page_payee", m26014x33f1a632);
        mo25994x63ee79de.mo27566xe4673800("cashier_desc", this.f12492x61f89bd.m26001x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kwo, m26014x33f1a632));
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 m26002xed93140 = this.f12492x61f89bd.m26002xed93140();
        if (m26002xed93140 != null && (bundle = m26002xed93140.f273655u) != null) {
            mo25994x63ee79de.mo27557xc5c55e60("chat_type", bundle.getInt("chat_type"));
            mo25994x63ee79de.mo27557xc5c55e60("send_type", m26002xed93140.f273655u.getInt("send_type"));
        }
        return mo25994x63ee79de;
    }
}

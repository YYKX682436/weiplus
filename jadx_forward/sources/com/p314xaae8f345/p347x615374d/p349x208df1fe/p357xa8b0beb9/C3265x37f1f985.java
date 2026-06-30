package com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9;

/* renamed from: com.tencent.kinda.framework.sns_cross.HongBaoServiceImpl */
/* loaded from: classes9.dex */
public class C3265x37f1f985 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.AbstractC3263xf194af0 {
    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.AbstractC3263xf194af0, com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3266xa5a26a98
    /* renamed from: generateSnsUseCaseData */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e mo25994x63ee79de() {
        android.os.Bundle bundle;
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e mo25994x63ee79de = super.mo25994x63ee79de();
        java.lang.String string = this.f12492x61f89bd.m26001x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573978go2);
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 m26002xed93140 = this.f12492x61f89bd.m26002xed93140();
        mo25994x63ee79de.mo27566xe4673800("cashier_desc", string);
        if (m26002xed93140 != null && (bundle = m26002xed93140.f273655u) != null) {
            mo25994x63ee79de.mo27557xc5c55e60("chat_type", bundle.getInt("chat_type"));
            mo25994x63ee79de.mo27557xc5c55e60("send_type", m26002xed93140.f273655u.getInt("send_type"));
            mo25994x63ee79de.mo27566xe4673800("biz_id", m26002xed93140.f273655u.getString("biz_id"));
        }
        return mo25994x63ee79de;
    }
}

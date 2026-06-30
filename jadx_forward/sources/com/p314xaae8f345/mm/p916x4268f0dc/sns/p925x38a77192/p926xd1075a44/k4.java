package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final /* synthetic */ class k4 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.a {
    public k4(java.lang.Object obj) {
        super(0, obj, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1.class, "onConfirmed", "onConfirmed()V", 0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 c1Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1) this.f72685xcfcbe9ef;
        az0.d dVar = c1Var.f151410h;
        if (dVar != null) {
            az0.d.b(dVar, null, 1, null);
        }
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = c1Var.f151417o;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e5 e5Var = m5Var instanceof com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e5 ? (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e5) m5Var : null;
        if (e5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "now not select anything");
        } else {
            java.lang.String str = c1Var.f151413k;
            java.lang.String str2 = e5Var.f151610a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onConfirmed: " + str2 + ", same initialSelect");
                c1Var.c();
            } else {
                c1Var.f151408f.mo146xb9724478(e5Var.f151480p);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onConfirmed: " + str2);
                c1Var.f151407e.mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}

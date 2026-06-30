package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public class t0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 f218460a;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var) {
        this.f218460a = n1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var = this.f218460a;
        if (n1Var.h()) {
            return;
        }
        try {
            o72.e4 e4Var = (o72.e4) i95.n0.c(o72.e4.class);
            int Sg = n1Var.f().mo63365x1e89676e().Sg(str);
            android.app.Activity activity = (android.app.Activity) n1Var.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.v0 v0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.v0(n1Var);
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.s1) e4Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.g(Sg, 34, activity, v0Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "favoriteUrl fail, ex = " + e17.getMessage());
        }
    }
}

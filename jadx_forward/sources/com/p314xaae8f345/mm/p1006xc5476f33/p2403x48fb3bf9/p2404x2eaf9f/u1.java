package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class u1 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f263524a;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var) {
        this.f263524a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        return nf.z.d(url, "weixin://jump/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f263524a;
        if (!((e3Var.R.b().f273710d & 2) > 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e3Var.o1(), "ActivityJumpHandler not allow, no inner url generalcontrol, url = %s", url);
            return true;
        }
        try {
            e3Var.e0().m(url, e3Var.R.c().f(7));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(e3Var.o1(), "ActivityJumpHandler, ex = " + e17.getMessage());
        }
        return true;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class z1 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f263563a;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var) {
        this.f263563a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        return nf.z.d(url, "weixin://feedback/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f263563a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("MMActivity.OverrideEnterAnimation", 0);
        bundle.putInt("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        try {
            e3Var.e0().ng(7, bundle, e3Var.U());
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(e3Var.o1(), "FeedbackJumpHandler, ex = " + e17.getMessage());
            return true;
        }
    }
}

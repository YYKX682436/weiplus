package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class v1 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f263528a;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var) {
        this.f263528a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        return nf.z.d(url, "weixin://addfriend/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f263528a;
        if (!e3Var.R.c().f(5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e3Var.o1(), "AddFriendHandler, permission fail");
            return true;
        }
        java.lang.String substring = url.substring(19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(substring)) {
            return false;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("from_webview", true);
        bundle.putString("userName", substring);
        try {
            e3Var.e0().ng(8, bundle, e3Var.U());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(e3Var.o1(), "AddFriendHandler, ex = " + e17.getMessage());
        }
        return true;
    }
}

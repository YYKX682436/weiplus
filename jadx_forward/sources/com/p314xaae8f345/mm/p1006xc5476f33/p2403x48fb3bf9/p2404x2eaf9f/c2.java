package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class c2 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f263306a;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var) {
        this.f263306a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        return nf.z.d(url, "weixin://profile/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.String substring = url.substring(17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        boolean z17 = substring.length() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f263306a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e3Var.o1(), "handleUrl fail, username is null");
            return true;
        }
        if (e3Var.R.c().f(2)) {
            nw4.n g07 = e3Var.g0();
            if (g07.f422428i) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = g07.f422425f;
                if (n3Var != null) {
                    n3Var.mo50293x3498a0(new nw4.m0(g07, substring));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onGoProfile fail, not ready");
            }
        }
        return true;
    }
}

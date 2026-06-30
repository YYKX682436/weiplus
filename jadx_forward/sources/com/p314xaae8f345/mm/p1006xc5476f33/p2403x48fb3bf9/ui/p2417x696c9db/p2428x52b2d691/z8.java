package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class z8 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.z8 f268244d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.z8();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("url");
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenUrlByExtBrowser", "openUrlByExtBrowser url is null");
            env.f422396d.e(msg.f422546c, "open_url_by_ext_browser:fail", null);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenUrlByExtBrowser", "openUrlByExtBrowser url: %s", str);
        java.lang.String string = env.f422393a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (r26.i0.y(str, "http", false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.h.b(env.f422393a, str, string, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.v8(env, msg), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.w8(env, msg));
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(env.f422393a);
            u1Var.g(string);
            u1Var.n(env.f422393a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571535i4));
            u1Var.j(env.f422393a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
            u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.x8(str, env, msg));
            u1Var.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.y8(env, msg));
            u1Var.q(false);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 55;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openUrlByExtBrowser";
    }
}

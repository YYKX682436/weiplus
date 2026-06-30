package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class a6 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.a6 f267478d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.a6();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) msg.f422323a.get("action"), -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNotifyHotNewsFeedStatus", "notifyHotNewsFeedStatus, action:" + P);
        java.lang.String url = (java.lang.String) msg.f422323a.get("url");
        if (P != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiNotifyHotNewsFeedStatus", "wrong ctx");
            env.f422396d.e(msg.f422546c, msg.f422552i + ":fail", null);
            return false;
        }
        if (!z40.e.l4() || !((y40.i0) z40.e.get()).Di()) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0.f299596b.a(url, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.z5(env, msg));
            return true;
        }
        z40.e eVar = z40.e.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.y5 y5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.y5(env, msg);
        ((y40.i0) eVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0 a17 = a50.e1.f83004a.a();
        if (a17 == null) {
            return true;
        }
        a17.a(url, new y40.c(y5Var));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 522;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "notifyHotNewsFeedStatus";
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class i2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.i2 f267778d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.i2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNewLifeContact", "JsApiGetNewLifeContact");
        zg0.q2 a17 = env.a();
        if (a17 == null || (str = a17.i()) == null) {
            str = "";
        }
        zg0.q2 a18 = env.a();
        if (a18 == null || (str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a18).Z()) == null) {
            str2 = "";
        }
        if (!(str2.length() == 0)) {
            str = str2;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19438xcc6c6243("", "", str), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.f2.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.h2(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 369;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getNewLifeContact";
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class f6 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.f6 f267616d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.f6();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("urlList");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        nw4.g gVar = env.f422396d;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOnWebPageUrlExposed", "urlList is empty");
            gVar.e(msg.f422546c, msg.f422552i + ":fail", null);
            return true;
        }
        java.lang.Object obj = msg.f422323a.get("bizType");
        if (obj == null) {
            obj = "";
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("urlList", str);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "1");
        bundle.putInt("bizType", b17 ? 1 : 0);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.d6.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.e6(new java.lang.ref.WeakReference(gVar), b17 ? 1 : 0, msg.f422546c));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return vb1.g.f77262x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "onWebPageUrlExposed";
    }
}

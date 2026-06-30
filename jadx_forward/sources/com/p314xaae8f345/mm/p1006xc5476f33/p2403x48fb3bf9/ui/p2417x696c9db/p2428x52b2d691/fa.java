package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class fa extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.fa f267622d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.fa();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreloadFinderFeed", "preloadFinderFeed main process:%b", java.lang.Boolean.valueOf(n17));
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str2 = (java.lang.String) msg.f422323a.get("items");
        java.lang.Object obj = msg.f422323a.get("batchLoadScene");
        if (obj == null || (str = obj.toString()) == null) {
            str = "0";
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
        boolean z17 = str2 == null;
        nw4.g gVar = env.f422396d;
        if (z17) {
            gVar.e(msg.f422546c, msg.f422552i + ":param invalid", null);
            return false;
        }
        bundle.putString("KEY_REQUEST_DATA", str2);
        bundle.putInt("KEY_REQUEST_SCENE", P);
        if (n17) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ea().mo8834xb9724478(bundle, null);
            gVar.e(msg.f422546c, msg.f422552i + ":ok", null);
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ea.class, null);
            gVar.e(msg.f422546c, msg.f422552i + ":ok", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return -2;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "preloadFinderFeed";
    }
}

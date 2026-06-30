package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class g0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.g0 f267632d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.g0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = msg.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj instanceof java.lang.String ? (java.lang.String) obj : null, 0);
        java.lang.String str = (java.lang.String) msg.f422323a.get("itemShowTypes");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str != null) {
            cf.f.b(new org.json.JSONArray(str), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.f0(arrayList));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateWebViewForFastLoad", "createWebViewForFastLoad openScene: %d, itemShowTypeList: %s", java.lang.Integer.valueOf(D1), arrayList);
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).w(D1, arrayList);
        env.f422396d.e(msg.f422546c, "createWebViewForFastLoad:ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 341;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "createWebViewForFastLoad";
    }
}

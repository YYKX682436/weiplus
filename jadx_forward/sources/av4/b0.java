package av4;

/* loaded from: classes.dex */
public final class b0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.b0 f95799d = new av4.b0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        double doubleValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.OpenWXSearchHalfPageJSApi", "handleMsg params:" + msg.f422323a);
        java.util.Map map = msg.f422323a;
        int e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "query");
        int e18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "hiddenSearchHeader", 0);
        java.lang.String f18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "webviewHeightRatio");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f18)) {
            try {
                doubleValue = java.lang.Double.valueOf(f18).doubleValue();
            } catch (java.lang.Exception unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "forceFullPageSearch", true);
            boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "allowGestureClose", true);
            boolean c18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "halfScreenAdjustable", false);
            int e19 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "type", 0);
            java.lang.String f19 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "thirdExtParam");
            java.lang.String f27 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "extReqParams");
            android.content.Intent a17 = su4.r2.a();
            a17.putExtra("key_load_js_without_delay", true);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19211xe6c8088d(e17, e19), av4.x.class, new av4.a0(e17, f17, f19, e19, f27, e18, c18, a17, env, doubleValue, c17));
            return true;
        }
        doubleValue = 0.7d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "forceFullPageSearch", true);
        boolean c172 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "allowGestureClose", true);
        boolean c182 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "halfScreenAdjustable", false);
        int e192 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "type", 0);
        java.lang.String f192 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "thirdExtParam");
        java.lang.String f272 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "extReqParams");
        android.content.Intent a172 = su4.r2.a();
        a172.putExtra("key_load_js_without_delay", true);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19211xe6c8088d(e17, e192), av4.x.class, new av4.a0(e17, f17, f192, e192, f272, e18, c182, a172, env, doubleValue, c172));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54463x110bac93;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openWXSearchHalfPage";
    }
}

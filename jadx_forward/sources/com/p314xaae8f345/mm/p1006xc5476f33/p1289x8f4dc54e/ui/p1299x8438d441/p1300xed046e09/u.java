package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u f175984a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f175985b;

    /* renamed from: c, reason: collision with root package name */
    public static final r01.a3 f175986c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedList f175987d;

    /* renamed from: e, reason: collision with root package name */
    public static int f175988e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f175989f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f175990g;

    /* renamed from: h, reason: collision with root package name */
    public static final kk.l f175991h;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u();
        f175984a = uVar;
        f175985b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.l.f175868d);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        f175986c = new r01.a3(600000);
        f175987d = new java.util.LinkedList();
        f175988e = 1;
        f175989f = "";
        oe1.v1 h17 = oe1.v1.h();
        uVar.d();
        h17.getClass();
        java.lang.String str2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a : com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("abTest", uVar.d());
        com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(str2, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.i.f175799d, null);
        java.lang.String PROCESS_APPBRAND0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274591f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_APPBRAND0, "PROCESS_APPBRAND0");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean("abTest", uVar.d());
        com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_APPBRAND0, bundle2, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.j.f175854d, null);
        f175991h = new kk.l(10);
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u uVar) {
        int optInt;
        synchronized (uVar) {
            java.util.LinkedList linkedList = f175987d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList) || f175988e != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizVideoPreloadLogic", "doFetch fetchQueue null, jsContextStatus = " + f175988e);
                return;
            }
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k) linkedList.poll();
                if (kVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizVideoPreloadLogic", "doFetch fetchData = " + kVar);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    int i17 = kVar.f175863b;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f175864c)) {
                        try {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(kVar.f175864c);
                            i17 = jSONObject2.optInt("itemshowType");
                            optInt = jSONObject2.optInt("preloadType");
                        } catch (java.lang.Exception unused) {
                        }
                        jSONObject.put("itemShowType", i17);
                        jSONObject.put("preloadType", optInt);
                        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 90);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] doFetch url = " + kVar.f175862a + "   json:" + jSONObject);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1379L, 50L, 1L, false);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.f175904a;
                        nu4.a aVar = kVar.f175865d;
                        java.lang.String jSONObject3 = jSONObject.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                        n3Var.g(aVar, "fetch", kz5.c0.i(kVar.f175862a, jSONObject3), com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.o.f175911d);
                    }
                    optInt = 0;
                    jSONObject.put("itemShowType", i17);
                    jSONObject.put("preloadType", optInt);
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 90);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] doFetch url = " + kVar.f175862a + "   json:" + jSONObject);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1379L, 50L, 1L, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3 n3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.f175904a;
                    nu4.a aVar2 = kVar.f175865d;
                    java.lang.String jSONObject32 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject32, "toString(...)");
                    n3Var2.g(aVar2, "fetch", kz5.c0.i(kVar.f175862a, jSONObject32), com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.o.f175911d);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizVideoPreloadLogic", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public final synchronized void b(java.lang.String str, java.lang.String str2, long j17, long j18, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] cacheVideo url error");
            return;
        }
        java.lang.String f17 = oe1.v1.h().f(str2);
        kk.l lVar = f175991h;
        if (lVar.get(f17) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] cacheVideo lruList contains");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("url", str2);
        bundle.putLong("position", j17);
        bundle.putLong("length", j18);
        bundle.putBoolean("useThumbPlayer", true);
        bundle.putInt("videoType", i17);
        lVar.put(f17, bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] cacheVideo lruList.size = " + lVar.m77804x35e001() + ", position=" + j17 + ", length=" + j18 + ", videoType=" + i17 + ", url=" + str2);
        if (!f175990g) {
            c(str);
        }
    }

    public final synchronized void c(java.lang.String str) {
        kk.l lVar = f175991h;
        if (lVar.m77804x35e001() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] doCacheVideo lruList is empty");
            f175990g = false;
            return;
        }
        f175990g = true;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.util.Set m77802xbc5e1583 = lVar.m77802xbc5e1583();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m77802xbc5e1583, "keySet(...)");
        java.lang.String str2 = (java.lang.String) kz5.n0.h0(m77802xbc5e1583);
        if (str2 == null) {
            return;
        }
        android.os.Bundle bundle = (android.os.Bundle) lVar.get(str2);
        if (bundle == null) {
            return;
        }
        h0Var.f391656d = bundle;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n(str, h0Var, null), 3, null);
    }

    public final boolean d() {
        return ((java.lang.Boolean) f175985b.mo141623x754a37bb()).booleanValue();
    }

    public final void e(java.lang.String str, int i17) {
        f(str, i17, "");
    }

    public final void f(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizVideoPreloadLogic", "preloadVideo itemShowType:" + i17);
        if (d() && str != null) {
            if (hy4.i.l(str) || hy4.i.n(str)) {
                java.lang.String k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.k(str);
                r01.a3 a3Var = f175986c;
                if (a3Var.b(k17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] preloadLimiter contains id = ".concat(k17));
                } else {
                    a3Var.a(k17);
                    p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t(str, i17, str2, null), 2, null);
                }
            }
        }
    }
}

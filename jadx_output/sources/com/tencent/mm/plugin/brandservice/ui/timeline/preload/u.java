package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.preload.u f94451a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f94452b;

    /* renamed from: c, reason: collision with root package name */
    public static final r01.a3 f94453c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedList f94454d;

    /* renamed from: e, reason: collision with root package name */
    public static int f94455e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f94456f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f94457g;

    /* renamed from: h, reason: collision with root package name */
    public static final kk.l f94458h;

    static {
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.u uVar = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.u();
        f94451a = uVar;
        f94452b = jz5.h.b(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.f94335d);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f94453c = new r01.a3(600000);
        f94454d = new java.util.LinkedList();
        f94455e = 1;
        f94456f = "";
        oe1.v1 h17 = oe1.v1.h();
        uVar.d();
        h17.getClass();
        java.lang.String str2 = com.tencent.mm.pluginsdk.model.g4.b() ? com.tencent.mm.sdk.platformtools.w9.f193053a : com.tencent.mm.sdk.platformtools.w9.f193055c;
        kotlin.jvm.internal.o.d(str2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("abTest", uVar.d());
        com.tencent.mm.ipcinvoker.f.a(str2, bundle, com.tencent.mm.plugin.brandservice.ui.timeline.preload.i.f94266d, null);
        java.lang.String PROCESS_APPBRAND0 = com.tencent.mm.sdk.platformtools.w9.f193058f;
        kotlin.jvm.internal.o.f(PROCESS_APPBRAND0, "PROCESS_APPBRAND0");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean("abTest", uVar.d());
        com.tencent.mm.ipcinvoker.f.a(PROCESS_APPBRAND0, bundle2, com.tencent.mm.plugin.brandservice.ui.timeline.preload.j.f94321d, null);
        f94458h = new kk.l(10);
    }

    public static final void a(com.tencent.mm.plugin.brandservice.ui.timeline.preload.u uVar) {
        int optInt;
        synchronized (uVar) {
            java.util.LinkedList linkedList = f94454d;
            if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList) || f94455e != 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizVideoPreloadLogic", "doFetch fetchQueue null, jsContextStatus = " + f94455e);
                return;
            }
            try {
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.k kVar = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.k) linkedList.poll();
                if (kVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizVideoPreloadLogic", "doFetch fetchData = " + kVar);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    int i17 = kVar.f94330b;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(kVar.f94331c)) {
                        try {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(kVar.f94331c);
                            i17 = jSONObject2.optInt("itemshowType");
                            optInt = jSONObject2.optInt("preloadType");
                        } catch (java.lang.Exception unused) {
                        }
                        jSONObject.put("itemShowType", i17);
                        jSONObject.put("preloadType", optInt);
                        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 90);
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] doFetch url = " + kVar.f94329a + "   json:" + jSONObject);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1379L, 50L, 1L, false);
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3 n3Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94371a;
                        nu4.a aVar = kVar.f94332d;
                        java.lang.String jSONObject3 = jSONObject.toString();
                        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                        n3Var.g(aVar, "fetch", kz5.c0.i(kVar.f94329a, jSONObject3), com.tencent.mm.plugin.brandservice.ui.timeline.preload.o.f94378d);
                    }
                    optInt = 0;
                    jSONObject.put("itemShowType", i17);
                    jSONObject.put("preloadType", optInt);
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 90);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] doFetch url = " + kVar.f94329a + "   json:" + jSONObject);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1379L, 50L, 1L, false);
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3 n3Var2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94371a;
                    nu4.a aVar2 = kVar.f94332d;
                    java.lang.String jSONObject32 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject32, "toString(...)");
                    n3Var2.g(aVar2, "fetch", kz5.c0.i(kVar.f94329a, jSONObject32), com.tencent.mm.plugin.brandservice.ui.timeline.preload.o.f94378d);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizVideoPreloadLogic", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public final synchronized void b(java.lang.String str, java.lang.String str2, long j17, long j18, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] cacheVideo url error");
            return;
        }
        java.lang.String f17 = oe1.v1.h().f(str2);
        kk.l lVar = f94458h;
        if (lVar.get(f17) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] cacheVideo lruList contains");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("url", str2);
        bundle.putLong("position", j17);
        bundle.putLong("length", j18);
        bundle.putBoolean("useThumbPlayer", true);
        bundle.putInt("videoType", i17);
        lVar.put(f17, bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] cacheVideo lruList.size = " + lVar.size() + ", position=" + j17 + ", length=" + j18 + ", videoType=" + i17 + ", url=" + str2);
        if (!f94457g) {
            c(str);
        }
    }

    public final synchronized void c(java.lang.String str) {
        kk.l lVar = f94458h;
        if (lVar.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] doCacheVideo lruList is empty");
            f94457g = false;
            return;
        }
        f94457g = true;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.util.Set keySet = lVar.keySet();
        kotlin.jvm.internal.o.f(keySet, "keySet(...)");
        java.lang.String str2 = (java.lang.String) kz5.n0.h0(keySet);
        if (str2 == null) {
            return;
        }
        android.os.Bundle bundle = (android.os.Bundle) lVar.get(str2);
        if (bundle == null) {
            return;
        }
        h0Var.f310123d = bundle;
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.plugin.brandservice.ui.timeline.preload.n(str, h0Var, null), 3, null);
    }

    public final boolean d() {
        return ((java.lang.Boolean) f94452b.getValue()).booleanValue();
    }

    public final void e(java.lang.String str, int i17) {
        f(str, i17, "");
    }

    public final void f(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizVideoPreloadLogic", "preloadVideo itemShowType:" + i17);
        if (d() && str != null) {
            if (hy4.i.l(str) || hy4.i.n(str)) {
                java.lang.String k17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.k(str);
                r01.a3 a3Var = f94453c;
                if (a3Var.b(k17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] preloadLimiter contains id = ".concat(k17));
                } else {
                    a3Var.a(k17);
                    kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.brandservice.ui.timeline.preload.t(str, i17, str2, null), 2, null);
                }
            }
        }
    }
}

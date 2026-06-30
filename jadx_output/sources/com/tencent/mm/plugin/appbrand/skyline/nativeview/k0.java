package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.skyline.nativeview.k0 f88902a = new com.tencent.mm.plugin.appbrand.skyline.nativeview.k0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f88903b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f88904c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f88905d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static boolean f88906e;

    public final synchronized sh1.f a(int i17) {
        return (sh1.f) f88904c.get(java.lang.Integer.valueOf(i17));
    }

    public final synchronized sh1.g b(int i17) {
        return (sh1.g) f88905d.get(java.lang.Integer.valueOf(i17));
    }

    public final void c() {
        java.util.HashMap hashMap;
        if (f88906e) {
            return;
        }
        f88906e = true;
        com.tencent.mars.xlog.Log.i("SkylineNativeViewManager", "init process:" + bm5.f1.a());
        ((com.tencent.mm.feature.finder.live.b5) ((os5.q) i95.n0.c(os5.q.class))).getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveForSkylineService", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        sh1.h hVar = (sh1.h) i95.n0.c(sh1.h.class);
        com.tencent.mm.feature.finder.live.a5 a5Var = new com.tencent.mm.feature.finder.live.a5();
        ((com.tencent.mm.plugin.appbrand.skyline.nativeview.u0) hVar).getClass();
        com.tencent.mars.xlog.Log.i("SkylineNativeViewService", "registerViewFactory viewType:FinderLive mainProcess:true process:" + bm5.f1.a());
        synchronized (f88902a) {
            hashMap = f88903b;
            hashMap.put("FinderLive", new com.tencent.mm.plugin.appbrand.skyline.nativeview.t(true, a5Var));
        }
        nj1.g gVar = new nj1.g();
        synchronized (this) {
            hashMap.put("RichText", new com.tencent.mm.plugin.appbrand.skyline.nativeview.t(false, gVar));
        }
    }

    public final void d(int i17, java.lang.String params) {
        kotlin.jvm.internal.o.g(params, "params");
        synchronized (this) {
            f88904c.remove(java.lang.Integer.valueOf(i17));
        }
        sh1.g b17 = b(i17);
        if (b17 != null) {
            b17.c(params);
            synchronized (this) {
                f88905d.remove(java.lang.Integer.valueOf(i17));
            }
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(dm.i4.COL_ID, i17);
            bundle.putString("params", params);
            com.tencent.mm.ipcinvoker.d0.d(str, bundle, com.tencent.mm.plugin.appbrand.skyline.nativeview.b0.f88888d.getClass(), com.tencent.mm.plugin.appbrand.skyline.nativeview.c0.f88890d);
        }
    }
}

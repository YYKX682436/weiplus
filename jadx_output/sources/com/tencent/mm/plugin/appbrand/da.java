package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class da {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f77575a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f77576b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f77577c = new java.util.HashSet();

    public static void a() {
        java.util.HashSet hashSet;
        synchronized (com.tencent.mm.plugin.appbrand.da.class) {
            f77576b = true;
            f77575a = false;
            java.util.Set set = f77577c;
            hashSet = new java.util.HashSet(set);
            ((java.util.HashSet) set).clear();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "notifyPreloadDone callbacks[%d]", java.lang.Integer.valueOf(hashSet.size()));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.ca) it.next()).d();
        }
    }

    public static void b() {
        java.util.HashSet hashSet;
        synchronized (com.tencent.mm.plugin.appbrand.da.class) {
            f77576b = false;
            f77575a = false;
            java.util.Set set = f77577c;
            hashSet = new java.util.HashSet(set);
            ((java.util.HashSet) set).clear();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "notifyPreloadFailed callbacks[%d]", java.lang.Integer.valueOf(hashSet.size()));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.ca) it.next()).b();
        }
    }

    public static void c(com.tencent.mm.plugin.appbrand.ca caVar) {
        synchronized (com.tencent.mm.plugin.appbrand.da.class) {
            boolean z17 = f77575a;
            boolean z18 = f77576b;
            boolean z19 = true;
            if (!z18) {
                if (caVar != null) {
                    ((java.util.HashSet) f77577c).add(caVar);
                }
                f77575a = true;
                f77576b = false;
            }
            if (z17) {
                return;
            }
            if (z18) {
                if (caVar != null) {
                    caVar.d();
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "start init");
            int threadPriority = android.os.Process.getThreadPriority(android.os.Process.myTid());
            try {
                com.tencent.mm.sdk.platformtools.u3.m(-2);
                if (com.tencent.xweb.a3.j()) {
                    a();
                    return;
                }
                com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
                com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "startPreload, for process:" + bm5.f1.a());
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                l81.a.f317002a = java.lang.System.currentTimeMillis();
                sh0.e eVar = (sh0.e) i95.n0.c(sh0.e.class);
                com.tencent.xweb.f1 f1Var = com.tencent.xweb.WebView.f220189m;
                com.tencent.xweb.f1 f1Var2 = com.tencent.xweb.f1.WV_KIND_PINUS;
                com.tencent.mm.plugin.appbrand.ba baVar = new com.tencent.mm.plugin.appbrand.ba(pBool);
                ((th0.a0) eVar).getClass();
                com.tencent.mm.xwebutil.y0.b(f1Var2, baVar);
                if (pBool.value) {
                    a();
                } else {
                    b();
                }
                l81.a.f317003b = java.lang.System.currentTimeMillis();
                if (com.tencent.xweb.WebView.getCurrentModuleWebCoreType() != f1Var2 || !org.xwalk.core.XWalkEnvironment.o() || !org.xwalk.core.XWalkEnvironment.f(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST)) {
                    z19 = false;
                }
                if (!z19 && !com.tencent.mm.sdk.platformtools.x2.n()) {
                    android.util.DisplayMetrics displayMetrics = j65.f.f297939c;
                    com.tencent.mars.xlog.Log.i("AppBrandWidgetAccessibility", "forceResetOpenScreenAdaptive");
                    j65.f.f297942f = false;
                }
            } finally {
                com.tencent.mm.sdk.platformtools.u3.m(threadPriority);
            }
        }
    }
}

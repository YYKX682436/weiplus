package com.tencent.mm.plugin.appbrand.app;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.x9.class})
/* loaded from: classes7.dex */
public final class r9 extends i95.w implements l81.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final bm5.i1 f75256d = bm5.i1.a(new bm5.h1() { // from class: com.tencent.mm.plugin.appbrand.app.r9$$a
        @Override // bm5.h1
        public final java.lang.Object a() {
            com.tencent.mm.plugin.appbrand.app.r9 r9Var = com.tencent.mm.plugin.appbrand.app.r9.this;
            r9Var.requireAccountInitialized();
            java.lang.String str = gm0.j1.u().h() + "AppBrandComm.db";
            int hashCode = r9Var.hashCode();
            java.util.Map map = com.tencent.mm.plugin.appbrand.app.l.f75163a;
            java.util.HashMap hashMap = (java.util.HashMap) com.tencent.mm.plugin.appbrand.app.l.f75163a;
            java.util.HashMap hashMap2 = new java.util.HashMap(hashMap.size());
            for (final com.tencent.mm.plugin.appbrand.app.n nVar : hashMap.values()) {
                hashMap2.put(java.lang.Integer.valueOf(nVar.f75190a.hashCode()), new d95.c0() { // from class: com.tencent.mm.plugin.appbrand.app.l$$y0
                    @Override // d95.c0
                    public final java.lang.String[] a() {
                        return com.tencent.mm.plugin.appbrand.app.n.this.f75191b;
                    }
                });
            }
            return x51.l0.a(hashCode, str, hashMap2, true, true);
        }
    }, new bm5.g1() { // from class: com.tencent.mm.plugin.appbrand.app.r9$$b
        @Override // bm5.g1
        public final void a(java.lang.Object obj) {
            ((x51.k0) obj).W(com.tencent.mm.plugin.appbrand.app.r9.this.hashCode());
        }
    });

    /* renamed from: e, reason: collision with root package name */
    public final bm5.i1 f75257e = new bm5.i1(new com.tencent.mm.plugin.appbrand.app.r9$$c(), null);

    /* renamed from: f, reason: collision with root package name */
    public final bm5.i1 f75258f = bm5.i1.a(new com.tencent.mm.plugin.appbrand.app.r9$$d(), new com.tencent.mm.plugin.appbrand.app.r9$$e());

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.b5 f75259g = com.tencent.mm.plugin.appbrand.ui.b5.INSTANCE;

    public static com.tencent.mm.plugin.appbrand.task.checkdemo.d Ai() {
        return (com.tencent.mm.plugin.appbrand.task.checkdemo.d) fj(com.tencent.mm.plugin.appbrand.task.checkdemo.d.class);
    }

    public static com.tencent.mm.plugin.appbrand.appstorage.o Bi() {
        return (com.tencent.mm.plugin.appbrand.appstorage.o) fj(com.tencent.mm.plugin.appbrand.appstorage.o.class);
    }

    public static com.tencent.mm.plugin.appbrand.appcache.qa Di() {
        return (com.tencent.mm.plugin.appbrand.appcache.qa) fj(com.tencent.mm.plugin.appbrand.appcache.qa.class);
    }

    public static i91.d Ni() {
        mj();
        return (i91.d) wi().f75258f.b();
    }

    public static x51.k0 Ri() {
        if (mj()) {
            return (x51.k0) wi().f75256d.b();
        }
        return null;
    }

    public static k91.v Ui() {
        return (k91.v) fj(k91.v.class);
    }

    public static com.tencent.mm.plugin.appbrand.ui.b5 Vi() {
        if (wi() == null) {
            return null;
        }
        return wi().f75259g;
    }

    public static com.tencent.mm.plugin.appbrand.launching.i9 Zi() {
        return (com.tencent.mm.plugin.appbrand.launching.i9) fj(com.tencent.mm.plugin.appbrand.launching.i9.class);
    }

    public static com.tencent.mm.plugin.appbrand.launching.q9 aj() {
        return (com.tencent.mm.plugin.appbrand.launching.q9) fj(com.tencent.mm.plugin.appbrand.launching.q9.class);
    }

    public static i91.e bj() {
        mj();
        return (i91.e) wi().f75257e.b();
    }

    public static com.tencent.mm.plugin.appbrand.appusage.w2 cj() {
        return (com.tencent.mm.plugin.appbrand.appusage.w2) fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
    }

    public static java.lang.Object fj(java.lang.Class cls) {
        return (cls == k91.j4.class || cls == k91.m4.class) ? com.tencent.mm.plugin.appbrand.app.l.a(k91.m4.class) : com.tencent.mm.plugin.appbrand.app.l.a(cls);
    }

    public static com.tencent.mm.plugin.appbrand.appusage.f3 hj() {
        return (com.tencent.mm.plugin.appbrand.appusage.f3) fj(com.tencent.mm.plugin.appbrand.appusage.f3.class);
    }

    public static k91.m4 ij() {
        return (k91.m4) com.tencent.mm.plugin.appbrand.app.l.a(k91.m4.class);
    }

    public static boolean mj() {
        if (!gm0.j1.a()) {
            return false;
        }
        wi().requireAccountInitialized();
        return true;
    }

    public static void nj(java.lang.String str, com.tencent.mm.plugin.appbrand.service.x6 x6Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAppBrand", "AppBrandCompatCore tryPreloadNextTaskProcess (both waservice and wagame) reason[%s]", str);
        com.tencent.mm.plugin.appbrand.task.u0.C().P(com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e, x6Var);
        com.tencent.mm.plugin.appbrand.task.u0.C().P(com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f, x6Var);
    }

    public static com.tencent.mm.plugin.appbrand.app.r9 wi() {
        return (com.tencent.mm.plugin.appbrand.app.r9) i95.n0.c(com.tencent.mm.plugin.appbrand.app.r9.class);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        k91.k4.g();
        this.f75259g.getClass();
        java.text.SimpleDateFormat simpleDateFormat = com.tencent.mm.plugin.appbrand.keylogger.f0.f84150a;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = com.tencent.mm.sdk.platformtools.x2.d().getLong("MMTempKeyStepLogger-Last-Clean-Time", 0L);
            com.tencent.mars.xlog.Log.i("MicroMsg.DefaultKeyStepLogger", "cleanOldLogs now:%d lastCleanTime:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17));
            if (currentTimeMillis - j17 >= 604800000) {
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.keylogger.d0(), "MMTempKeyStepLogger#cleanOldLogs");
            }
        }
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u uVar = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77959a;
        t91.a aVar = t91.a.f416567a;
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "enableMonitorAsync");
        if (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77960b) {
            ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m(), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
        } else {
            aVar.b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "enableMonitorAsync, not in main process");
        }
        com.tencent.mm.plugin.appbrand.report.quality.w1.a();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        ((yv1.h) ((zv1.f1) i95.n0.c(zv1.f1.class))).Ai(com.tencent.mm.plugin.clean.cache.CacheClassifyType.APPBRAND, new n81.b());
        ((yv1.h) ((zv1.f1) i95.n0.c(zv1.f1.class))).Ai(com.tencent.mm.plugin.clean.cache.CacheClassifyType.MINI_GAME, new n81.q());
        nm.j.f338443g.a(new com.tencent.mm.plugin.appbrand.app.t9(this));
        ((ku5.t0) ku5.t0.f312615d).q(com.tencent.mm.plugin.appbrand.widget.recent.u.f92064d);
        com.tencent.mm.plugin.appbrand.launching.teenmode.k kVar = com.tencent.mm.plugin.appbrand.launching.teenmode.k.f85200a;
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        if (w2Var != null) {
            w2Var.add(com.tencent.mm.plugin.appbrand.launching.teenmode.e.f85194d);
        }
        com.tencent.mm.plugin.appbrand.appusage.z5 z5Var = (com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class);
        if (z5Var != null) {
            z5Var.add(com.tencent.mm.plugin.appbrand.launching.teenmode.g.f85196d);
        }
        com.tencent.mm.plugin.appbrand.launching.teenmode.k kVar2 = com.tencent.mm.plugin.appbrand.launching.teenmode.k.f85200a;
        ((ku5.t0) ku5.t0.f312615d).b(com.tencent.mm.plugin.appbrand.launching.teenmode.h.f85197d, "AppBrandTeenModeReporter");
        com.tencent.mm.plugin.appbrand.appstorage.t.f76321a.b();
        com.tencent.mm.plugin.appbrand.appstorage.c.f76149a.a();
        l75.q0 q0Var = com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.f86293a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "onLogin");
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        try {
            android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context2);
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context2, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.class));
            if (appWidgetIds.length != 0) {
                com.tencent.mm.plugin.appbrand.appusage.w2 w2Var2 = (com.tencent.mm.plugin.appbrand.appusage.w2) fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
                if (w2Var2 != null) {
                    w2Var2.add(xu5.b.a("AppBrandWidgetUpdateCollectionList"), com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.f86293a);
                }
                com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.c(context2, appWidgetManager, appWidgetIds);
            }
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandOuterWidget", e17, "Direct Boot Mode, Widget update exception", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.appbrand.launching.x6.f85412a.getClass();
        com.tencent.mm.plugin.appbrand.launching.j6.f84694c.a();
        com.tencent.mm.plugin.appbrand.launching.j6.f84695d.a();
        com.tencent.mm.plugin.appbrand.launching.j6.f84696e.a();
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("appbrand");
        yz5.r rVar = ((rk1.m) i95.n0.c(rk1.m.class)).f396437d;
        if (rVar != null) {
            com.tencent.mm.plugin.appbrand.launching.j6.f84697f.add(rVar);
        }
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.utils.m(new com.tencent.mm.plugin.appbrand.app.r9$$f()));
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.app.s9(this));
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        java.util.Map map = com.tencent.mm.plugin.appbrand.app.l.f75163a;
        wi().getClass();
        mj();
        ((java.util.HashMap) com.tencent.mm.plugin.appbrand.app.l.f75163a).clear();
        this.f75257e.c();
        this.f75258f.c();
        this.f75256d.c();
        com.tencent.mm.plugin.appbrand.appusage.c1.f76397m = null;
        k91.k4.f305663e.c();
        q81.z.i().h();
        java.util.Set set = com.tencent.mm.plugin.appbrand.utils.s0.f90550a;
        if (ik1.h0.f291830a != null) {
            synchronized (ik1.h0.class) {
                if (ik1.h0.f291830a != null) {
                    ik1.h0.f291830a.removeCallbacksAndMessages(null);
                }
            }
        }
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).vj(512);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).wj(7);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(144);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(4224);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).vj(8);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).wj(10);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(208);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(4240);
        this.f75259g.f89571d = Integer.MAX_VALUE;
        com.tencent.mm.plugin.appbrand.appstorage.a0 a0Var = com.tencent.mm.plugin.appbrand.appstorage.g0.f76181h;
        long longValue = new kk.v(gm0.j1.b().h()).longValue();
        java.util.Map map2 = com.tencent.mm.plugin.appbrand.appstorage.g0.f76182i;
        synchronized (map2) {
            map2.remove(java.lang.Long.valueOf(longValue));
            com.tencent.mars.xlog.Log.i("AppBrandMMKVStorage", "onAccountRelease remove cache uin:" + longValue);
        }
        com.tencent.mm.plugin.appbrand.appstorage.e eVar = com.tencent.mm.plugin.appbrand.appstorage.f.f76162i;
        long longValue2 = new kk.v(gm0.j1.b().h()).longValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" onAccountRelease before clear cache uin:");
        sb6.append(longValue2);
        sb6.append("   CACHE size=");
        java.util.Map map3 = com.tencent.mm.plugin.appbrand.appstorage.f.f76163m;
        sb6.append(map3.size());
        sb6.append("  MULTI_WRITE_MODE_CACHE size=");
        java.util.Map map4 = com.tencent.mm.plugin.appbrand.appstorage.f.f76164n;
        sb6.append(map4.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptMMKVStorage", sb6.toString());
        eVar.a(longValue2, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptMMKVStorage", " onAccountRelease after clear cache uin:" + longValue2 + "   CACHE size=" + map3.size() + "  MULTI_WRITE_MODE_CACHE size=" + map4.size());
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u uVar = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77959a;
        t91.a aVar = t91.a.f416567a;
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "disableMonitorAsync");
        if (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77960b) {
            ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.l(), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
        } else {
            aVar.b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "disableMonitorAsync, not in main process");
        }
        com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.b();
        ((java.util.HashMap) cj1.b.f41854a).clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopDataHelper", "onAccountRelease");
        com.tencent.mm.plugin.appbrand.widget.recent.v.f92068b = null;
        com.tencent.mm.plugin.appbrand.widget.recent.v.f92069c = null;
        com.tencent.mm.plugin.appbrand.widget.recent.v.f92070d = null;
        kj1.w wVar = kj1.w.f308379a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortLinkInfoCache", "clearAll");
        kj1.w.f308380b.d(-1);
        com.tencent.mm.plugin.appbrand.launching.x6.f85412a.getClass();
        com.tencent.mm.plugin.appbrand.launching.j6.f84694c.a();
        com.tencent.mm.plugin.appbrand.launching.j6.f84695d.a();
        com.tencent.mm.plugin.appbrand.launching.j6.f84696e.a();
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("appbrand");
        yz5.r rVar = ((rk1.m) i95.n0.c(rk1.m.class)).f396437d;
        if (rVar != null) {
            com.tencent.mm.plugin.appbrand.launching.j6.f84697f.remove(rVar);
        }
        synchronized (com.tencent.mm.plugin.appbrand.widget.recent.k.f91995b) {
            com.tencent.mm.plugin.appbrand.widget.recent.k.f91994a = null;
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.mm.sdk.platformtools.x2.n();
    }
}

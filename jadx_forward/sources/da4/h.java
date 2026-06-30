package da4;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static da4.h f309316e;

    /* renamed from: b, reason: collision with root package name */
    public boolean f309318b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f309319c = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2162xb06b1e56.p2163x46b5ab60.AbstractC17867xeb078afe f309317a = new da4.f(this, null);

    /* renamed from: d, reason: collision with root package name */
    public final da4.g f309320d = new da4.g(this, null);

    public static boolean a(da4.h hVar) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        hVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasWatcherInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        synchronized (hVar.f309319c) {
            try {
                z17 = !((java.util.HashMap) hVar.f309319c).isEmpty();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasWatcherInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasWatcherInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        return z17;
    }

    public static void b(da4.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        synchronized (hVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unregisterWatcher", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2162xb06b1e56.p2163x46b5ab60.AbstractC17867xeb078afe abstractC17867xeb078afe = hVar.f309317a;
                if (abstractC17867xeb078afe != null && hVar.f309318b) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(abstractC17867xeb078afe);
                    hVar.f309318b = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInstalledWatcherManager", "unregisterWatcher: the watcher is to be unregistered");
                }
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ApkInstalledWatcherManager", "unregister ApkInstalledWatcher failed");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unregisterWatcher", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }

    public static synchronized da4.h f() {
        da4.h hVar;
        synchronized (da4.h.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("instance", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            if (f309316e == null) {
                f309316e = new da4.h();
            }
            hVar = f309316e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("instance", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        }
        return hVar;
    }

    public static synchronized void i(da4.i iVar) {
        synchronized (da4.h.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("watchStatic", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            try {
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ApkInstalledWatcherManager", "watchStatic: watch info failed!");
            }
            if (za4.k.l()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ApkInstalledWatcherManager", "watchStatic, but disable register installReceiver");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("watchStatic", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            } else {
                f().h(iVar);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("watchStatic", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            }
        }
    }

    public final void c(da4.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        synchronized (this.f309319c) {
            try {
                ((java.util.HashMap) this.f309319c).put(iVar.f309321a, iVar);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }

    public final boolean d(da4.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        if (iVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            return false;
        }
        int i17 = iVar.f309330j;
        java.lang.String str = iVar.f309321a;
        if (i17 == 1 || i17 == 2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkWatchInfo is called, the apkPackage is ");
            sb6.append(str);
            sb6.append(", uxInfo is ");
            java.lang.String str2 = iVar.f309323c;
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInstalledWatcherManager", sb6.toString());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, str2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                return true;
            }
        }
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(iVar.f309322b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInstalledWatcherManager", "checkWatchInfo is called, the input param is invalid");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        return false;
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearWatcherInfoExpired", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        synchronized (this.f309319c) {
            try {
                java.util.Iterator it = ((java.util.HashMap) this.f309319c).entrySet().iterator();
                if (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (entry.getValue() != null) {
                        if (((da4.i) entry.getValue()).f309326f + 300000 < android.os.SystemClock.elapsedRealtime()) {
                            it.remove();
                        }
                    } else {
                        it.remove();
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearWatcherInfoExpired", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearWatcherInfoExpired", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }

    public final synchronized void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("registerWatcher", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        try {
            if (this.f309317a == null) {
                this.f309317a = new da4.f(this, null);
            }
            if (!this.f309318b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInstalledWatcherManager", "registerWatcher: the watcher is to be registered");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIntentFilter", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIntentFilter", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this.f309317a, intentFilter);
                this.f309318b = true;
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ApkInstalledWatcherManager", "register ApkInstalledWatcher failed");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerWatcher", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }

    public final synchronized void h(da4.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("watch", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInstalledWatcherManager", "watch is called");
        if (!d(iVar)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("watch", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            return;
        }
        g();
        c(iVar);
        e();
        da4.g gVar = this.f309320d;
        gVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startTimer", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$WatcherTimer");
        if (gVar.f309314d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInstalledWatcherManager", "startTimer is called, the timer is started!");
        } else {
            gVar.f309314d = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(gVar, 300000L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInstalledWatcherManager", "startTimer is called, the timer is to start.");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startTimer", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$WatcherTimer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("watch", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }
}

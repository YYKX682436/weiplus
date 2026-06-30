package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final /* synthetic */ class w1$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (gm0.j1.b().f273254q) {
            try {
                boolean z17 = com.tencent.mm.plugin.appbrand.ui.e4.g() && com.tencent.mm.plugin.appbrand.ui.e4.c();
                long j17 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().N.f77259d;
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_APP_BRAND_PRUNE_PKG_NEXT_TIME_SEC_LONG;
                long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
                long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
                if (i17 < longValue && !z17) {
                    long j18 = i17 + j17;
                    if (j18 < longValue) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPruner", "AccountScopedRunnable.run() invalid freq control mark, next:%d, now:%d, interval:%d", java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(i17), java.lang.Long.valueOf(j17));
                        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j18));
                        return;
                    }
                    return;
                }
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(i17 + j17));
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                try {
                    com.tencent.mm.plugin.appbrand.appcache.l3.f75641a.run();
                    com.tencent.mm.plugin.appbrand.jsruntime.r1.c();
                    com.tencent.mm.plugin.appbrand.jsruntime.c2.a();
                    com.tencent.mm.plugin.appbrand.jsruntime.k1.a();
                    com.tencent.mm.plugin.appbrand.appcache.s3.b(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                    com.tencent.mm.plugin.appbrand.appcache.i3.f75588a.run();
                    ((com.tencent.mm.plugin.appbrand.appcache.c4) ((com.tencent.mm.plugin.appbrand.appcache.cc) i95.n0.c(com.tencent.mm.plugin.appbrand.appcache.cc.class))).Ri();
                    s81.b bVar = (s81.b) com.tencent.mm.plugin.appbrand.app.r9.fj(s81.b.class);
                    if (bVar != null) {
                        bVar.z0();
                    }
                    ri1.g.b();
                    com.tencent.mm.plugin.appbrand.appstorage.s0.a();
                    com.tencent.mm.plugin.appbrand.appcache.g3.f75548a.run();
                    if (z17 && ((com.tencent.mm.plugin.appbrand.debugger.j0) i95.n0.c(com.tencent.mm.plugin.appbrand.debugger.j0.class)) != null && com.tencent.mm.plugin.appbrand.appcache.g7.f75555b == null) {
                        com.tencent.mm.plugin.appbrand.appcache.g7.f75555b = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.appbrand.appcache.f7(false, null), 2, null);
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.appbrand.appcache.s3.b(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                    throw th6;
                }
            } catch (java.lang.Exception e17) {
                if (!(e17 instanceof android.system.ErrnoException)) {
                    throw e17;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPruner", "runNow() get ErrnoException:%s", e17);
            }
        }
    }
}

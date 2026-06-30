package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final /* synthetic */ class c2$$b implements gi.l0 {
    @Override // gi.l0
    public final void a(rh.y2 y2Var) {
        int b17 = gi.d.b() + 1;
        java.lang.String valueOf = java.lang.String.valueOf(android.text.format.DateFormat.format("yyyyMMdd", java.lang.System.currentTimeMillis()));
        if (!android.text.TextUtils.isEmpty(valueOf)) {
            com.tencent.mm.sdk.platformtools.o4.L().putInt("battery_tkill_count_".concat(valueOf), b17);
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
        boolean z17 = false;
        for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry : y2Var.f395560a) {
            if (threadJiffiesEntry.f52568e.toUpperCase().contains("R")) {
                final java.lang.String str = threadJiffiesEntry.f52566c;
                final int i17 = threadJiffiesEntry.f52565b;
                if (ph.t.k().c().a() >= 1200000 && !android.text.TextUtils.isEmpty(str)) {
                    boolean hasOverlayWindow = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE.hasOverlayWindow();
                    boolean hasForegroundService = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE.hasForegroundService();
                    com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryCanaryConfigs", "floatView = " + hasOverlayWindow + ", fgSrv = " + hasForegroundService);
                    if (!hasOverlayWindow && !hasForegroundService) {
                        java.lang.String[] split = java.lang.String.valueOf(j62.e.g().a("clicfg_battery_thread_cooling_list", (mm.l.b() || mm.l.c()) ? ".raster;Loader:Extract;readercontainer;readercachepars;main.thread;video_jitter" : "raster", false, true)).split(";");
                        int length = split.length;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= length) {
                                break;
                            }
                            if (str.contains(split[i18])) {
                                com.tencent.mars.xlog.Log.w("Matrix.battery.BatteryCanaryConfigs", "cooling down thread: " + str + ", tid = " + i17);
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tid-");
                                sb6.append(i17);
                                ap.a.a(1, "coolingDown", null, null, str, sb6.toString());
                                ((ku5.t0) ku5.t0.f312615d).k(new java.lang.Runnable() { // from class: gi.d$$b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        java.lang.String str2 = str;
                                        int i19 = i17;
                                        boolean z18 = com.tencent.matrix.hook.junwind.JUnwindJni.f52645a;
                                        if (com.tencent.matrix.hook.junwind.JUnwindJni.f52645a) {
                                            com.tencent.mars.xlog.Log.w("Matrix.battery.BatteryCanaryConfigs", "tkill thread: " + str2 + ", tid = " + i19);
                                            int myPid = android.os.Process.myPid();
                                            if (!com.tencent.matrix.hook.junwind.JUnwindJni.f52645a) {
                                                throw new java.lang.RuntimeException("Check #isSupported() before calling!");
                                            }
                                            com.tencent.mars.xlog.Log.w("Matrix.battery.BatteryCanaryConfigs", "ret=" + com.tencent.matrix.hook.junwind.ThreadKillerJni.f52655a.nativeTgkill(true, myPid, i19, 6));
                                        }
                                    }
                                }, 60000L);
                                break;
                            }
                            i18++;
                        }
                    }
                }
            }
            if (mm.l.c() && !z17 && (threadJiffiesEntry.f52566c.contains("video_jitter_bu") || threadJiffiesEntry.f52566c.contains("JSBizRenderJsEn") || threadJiffiesEntry.f52566c.contains("readercachepars") || threadJiffiesEntry.f52566c.contains("readercontainer") || threadJiffiesEntry.f52566c.contains("main.thread"))) {
                z17 = true;
            }
        }
        if (z17) {
            final com.tencent.mm.plugin.performance.watchdogs.j jVar = com.tencent.mm.plugin.performance.watchdogs.j.f153064p;
            jVar.getClass();
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.performance.watchdogs.j$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.performance.watchdogs.j jVar2 = com.tencent.mm.plugin.performance.watchdogs.j.this;
                    jVar2.getClass();
                    try {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FDWatchDog", ">>>>>>>>>>>> FD DUMP: total count = %d", java.lang.Integer.valueOf(jVar2.a()));
                        jVar2.f();
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FDWatchDog", th6, "dump fd err", new java.lang.Object[0]);
                    }
                }
            });
        }
        tp3.a aVar = tp3.a.INSTANCE;
        if (((wp3.b) aVar.a(wp3.b.class)).f448396g.e()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PluginPerformance", "Dump pthread report");
            ((wp3.b) aVar.a(wp3.b.class)).s(false);
        }
    }
}

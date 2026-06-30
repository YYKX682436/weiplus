package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* renamed from: com.tencent.mm.feature.performance.c2$$b */
/* loaded from: classes12.dex */
public final /* synthetic */ class C10655x58a5d53 implements gi.l0 {
    @Override // gi.l0
    public final void a(rh.y2 y2Var) {
        int b17 = gi.d.b() + 1;
        java.lang.String valueOf = java.lang.String.valueOf(android.text.format.DateFormat.format("yyyyMMdd", java.lang.System.currentTimeMillis()));
        if (!android.text.TextUtils.isEmpty(valueOf)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("battery_tkill_count_".concat(valueOf), b17);
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
        boolean z17 = false;
        for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry : y2Var.f477093a) {
            if (threadJiffiesEntry.f134101e.toUpperCase().contains("R")) {
                final java.lang.String str = threadJiffiesEntry.f134099c;
                final int i17 = threadJiffiesEntry.f134098b;
                if (ph.t.k().c().a() >= 1200000 && !android.text.TextUtils.isEmpty(str)) {
                    boolean m41037x57bab7e6 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.f19946x4fbc8495.m41037x57bab7e6();
                    boolean m41022xd258878 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.f19940x4fbc8495.m41022xd258878();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryCanaryConfigs", "floatView = " + m41037x57bab7e6 + ", fgSrv = " + m41022xd258878);
                    if (!m41037x57bab7e6 && !m41022xd258878) {
                        java.lang.String[] split = java.lang.String.valueOf(j62.e.g().a("clicfg_battery_thread_cooling_list", (mm.l.b() || mm.l.c()) ? ".raster;Loader:Extract;readercontainer;readercachepars;main.thread;video_jitter" : "raster", false, true)).split(";");
                        int length = split.length;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= length) {
                                break;
                            }
                            if (str.contains(split[i18])) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.BatteryCanaryConfigs", "cooling down thread: " + str + ", tid = " + i17);
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tid-");
                                sb6.append(i17);
                                ap.a.a(1, "coolingDown", null, null, str, sb6.toString());
                                ((ku5.t0) ku5.t0.f394148d).k(new java.lang.Runnable() { // from class: gi.d$$b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        java.lang.String str2 = str;
                                        int i19 = i17;
                                        boolean z18 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4651xcb23ec9a.f134178a;
                                        if (com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4651xcb23ec9a.f134178a) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.BatteryCanaryConfigs", "tkill thread: " + str2 + ", tid = " + i19);
                                            int myPid = android.os.Process.myPid();
                                            if (!com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4651xcb23ec9a.f134178a) {
                                                throw new java.lang.RuntimeException("Check #isSupported() before calling!");
                                            }
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.BatteryCanaryConfigs", "ret=" + com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4653x6f786010.f134188a.m40923x902a6748(true, myPid, i19, 6));
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
            if (mm.l.c() && !z17 && (threadJiffiesEntry.f134099c.contains("video_jitter_bu") || threadJiffiesEntry.f134099c.contains("JSBizRenderJsEn") || threadJiffiesEntry.f134099c.contains("readercachepars") || threadJiffiesEntry.f134099c.contains("readercontainer") || threadJiffiesEntry.f134099c.contains("main.thread"))) {
                z17 = true;
            }
        }
        if (z17) {
            final com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.j.f234597p;
            jVar.getClass();
            ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.performance.watchdogs.j$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.j jVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.j.this;
                    jVar2.getClass();
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FDWatchDog", ">>>>>>>>>>>> FD DUMP: total count = %d", java.lang.Integer.valueOf(jVar2.a()));
                        jVar2.f();
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FDWatchDog", th6, "dump fd err", new java.lang.Object[0]);
                    }
                }
            });
        }
        tp3.a aVar = tp3.a.INSTANCE;
        if (((wp3.b) aVar.a(wp3.b.class)).f529929g.e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PluginPerformance", "Dump pthread report");
            ((wp3.b) aVar.a(wp3.b.class)).s(false);
        }
    }
}

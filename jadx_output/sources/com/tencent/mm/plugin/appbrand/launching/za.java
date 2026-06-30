package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class za implements com.tencent.mm.ui.da, com.tencent.mm.plugin.appbrand.launching.b7 {

    /* renamed from: d, reason: collision with root package name */
    public final int f85477d = com.tencent.mm.plugin.appbrand.launching.za.class.hashCode() & 65535;

    public final void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "dealCannotDownload reason:%s", str);
        if (fp.h.c(17)) {
            ((com.tencent.mm.plugin.appbrand.launching.precondition.d) this).f84946e.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if ((r0.c() && ((com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) r0.getBaseContext()).isDestroyed()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.tencent.mm.plugin.appbrand.launching.ab r8) {
        /*
            r7 = this;
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            int r0 = com.tencent.xweb.a3.f(r0)
            r1 = 400(0x190, float:5.6E-43)
            java.lang.String r2 = "MicroMsg.AppBrand.PreLaunchCheckForXWEB"
            if (r0 <= r1) goto L1a
            java.lang.String r8 = "have available version , no need check"
            com.tencent.mars.xlog.Log.i(r2, r8)
            r8 = r7
            com.tencent.mm.plugin.appbrand.launching.precondition.d r8 = (com.tencent.mm.plugin.appbrand.launching.precondition.d) r8
            java.lang.Runnable r8 = r8.f84946e
            r8.run()
            return
        L1a:
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.tencent.mm.storage.u3.APPBRAND_TBS_CHECK_INSTALL_LAST_TIME_IN_SECOND_LONG
            r3 = 0
            long r3 = r0.t(r1, r3)
            long r5 = com.tencent.mm.sdk.platformtools.t8.i1()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r5 = 1800(0x708, double:8.893E-321)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L44
            java.lang.String r8 = "check xweb download, not exceed interval, just return"
            com.tencent.mars.xlog.Log.i(r2, r8)
            java.lang.String r8 = "not exceed interval"
            r7.a(r8)
            return
        L44:
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            long r2 = com.tencent.mm.sdk.platformtools.t8.i1()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.x(r1, r2)
            java.lang.System.currentTimeMillis()
            java.lang.System.currentTimeMillis()
            if (r8 != 0) goto L65
            java.lang.String r8 = "ActivityProxy is null"
            r7.a(r8)
            goto L9b
        L65:
            com.tencent.mm.plugin.appbrand.launching.precondition.c r8 = (com.tencent.mm.plugin.appbrand.launching.precondition.c) r8
            com.tencent.mm.plugin.appbrand.launching.precondition.a r0 = r8.f84943a
            boolean r1 = r0.g()
            r2 = 1
            if (r1 != 0) goto L88
            boolean r1 = r0.c()
            r3 = 0
            if (r1 == 0) goto L85
            android.content.Context r0 = r0.getBaseContext()
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI r0 = (com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) r0
            boolean r0 = r0.isDestroyed()
            if (r0 == 0) goto L85
            r0 = r2
            goto L86
        L85:
            r0 = r3
        L86:
            if (r0 == 0) goto L89
        L88:
            r3 = r2
        L89:
            if (r3 == 0) goto L91
            java.lang.String r8 = "ActivityProxy destroyed or finishing"
            r7.a(r8)
            goto L9b
        L91:
            com.tencent.mm.plugin.appbrand.launching.za$$a r0 = new com.tencent.mm.plugin.appbrand.launching.za$$a
            r0.<init>()
            com.tencent.mm.plugin.appbrand.launching.precondition.a r8 = r8.f84943a
            r8.j(r0, r2)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.za.b(com.tencent.mm.plugin.appbrand.launching.ab):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.b7
    public boolean d() {
        return true;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (this.f85477d != i17) {
            return;
        }
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "onActivityResult, xweb download ok");
            com.tencent.mm.plugin.appbrand.task.u0.C().q(com.tencent.luggage.sdk.processes.c.f47630d);
            ((com.tencent.mm.plugin.appbrand.launching.precondition.d) this).f84946e.run();
        } else if (i18 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "onActivityResult, xweb cancel loading, download in background");
            ((com.tencent.mm.plugin.appbrand.launching.precondition.d) this).f84947f.e(null, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "onActivityResult, xweb download unknown error, resultCode = %d, apiLevel = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(366L, 8L, 1L, false);
            a("onActivityResult, xweb download unknown error");
        }
    }
}

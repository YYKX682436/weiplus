package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f78147a;

    /* renamed from: d, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.floatball.l f78150d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.floatball.p0 f78151e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.floatball.w0 f78152f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.floatball.t1 f78153g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.floatball.d f78154h;

    /* renamed from: i, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.floatball.k1 f78155i;

    /* renamed from: j, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.floatball.l0 f78156j;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Deque f78148b = new java.util.concurrent.LinkedBlockingDeque();

    /* renamed from: k, reason: collision with root package name */
    public boolean f78157k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f78158l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f78159m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f78160n = false;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f78161o = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final boolean f78149c = "1".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_wxa_appbrand_content_float_guide_enable, "1", true));

    public u(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f78147a = o6Var;
    }

    public static void g(com.tencent.mm.plugin.ball.service.d dVar, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        if (appBrandInitConfig instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "setReportInfo, floatBallHelper:%s, configAppName:%s", dVar, appBrandInitConfigWC.f77279e);
            dVar.t().f93087g = appBrandInitConfigWC.f77278d;
            dVar.t().f93089i = appBrandInitConfigWC.f77279e;
            dVar.t().f93088h = java.lang.String.valueOf(appBrandInitConfigWC.f47284z);
            com.tencent.mm.plugin.ball.model.BallReportInfo t17 = dVar.t();
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = appBrandInitConfigWC.f47269b2;
            t17.f93085e = appBrandStatObject == null ? 0 : appBrandStatObject.f87790f;
        }
    }

    public final boolean a(int i17) {
        if (this.f78150d != null) {
            this.f78150d.p();
        }
        if (this.f78150d != null && this.f78150d.m0(i17)) {
            return true;
        }
        if (this.f78151e != null && this.f78151e.m0(i17)) {
            return true;
        }
        if (this.f78152f != null) {
            this.f78152f.m0(i17);
        }
        if (this.f78154h != null && this.f78154h.m0(i17)) {
            return true;
        }
        if (this.f78153g != null) {
            this.f78153g.m0(i17);
        }
        if (this.f78155i != null && this.f78155i.m0(i17)) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.floatball.i c17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0.c(this.f78147a);
        return c17 != null && c17.m0(i17);
    }

    public final void b(com.tencent.mm.plugin.appbrand.o6 o6Var, boolean z17) {
        com.tencent.mm.plugin.appbrand.floatball.l lVar = new com.tencent.mm.plugin.appbrand.floatball.l(new com.tencent.mm.plugin.appbrand.floatball.n(o6Var.r0(), o6Var), o6Var);
        if (z17) {
            lVar.f78113w = true;
        }
        this.f78150d = lVar;
        lVar.b(1, qp1.n.a(o6Var.f74803n, o6Var.f74805p.f77281g));
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
        if (u07 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "updateBallInfoWithInitConfig, initConfig:%s", u07);
            lVar.f93132d.f93057r = lVar.f78112v.u0().f77280f;
            lVar.f93132d.f93063x = lVar.f78112v.u0().f77279e;
            if (lVar.f78112v.f74805p.f77281g == 1) {
                lVar.f93132d.f93065z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490041j9);
            } else if (lVar.f78112v.f74805p.f77281g == 2) {
                lVar.f93132d.f93065z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490040j8);
            } else {
                lVar.f93132d.f93065z = null;
            }
            lVar.f93132d.n("appId", lVar.f78112v.u0().f77278d);
            lVar.f93132d.n(dm.i4.COL_USERNAME, lVar.f78112v.u0().f47278x);
            lVar.f93132d.m("versionType", lVar.f78112v.u0().f77281g);
            g(lVar, u07);
            lVar.t().f93086f = 6;
            lVar.g();
        }
    }

    public void c(com.tencent.mm.plugin.appbrand.page.z zVar) {
        if (this.f78149c && this.f78160n) {
            if (zVar == null) {
                zVar = this.f78147a.D1;
            }
            if (zVar != null) {
                zVar.r(4);
            }
            this.f78160n = false;
        }
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "destroy, runtime:%s", this.f78147a.f74803n);
        if (this.f78159m) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandFloatBallLogic", "onPluginDestroy retry");
            return;
        }
        this.f78159m = true;
        if (this.f78150d != null) {
            this.f78150d.o0();
        }
        if (this.f78151e != null) {
            this.f78151e.o0();
        }
        if (this.f78152f != null) {
            this.f78152f.o0();
        }
        if (this.f78154h != null) {
            this.f78154h.o0();
        }
        if (this.f78153g != null) {
            this.f78153g.o0();
        }
        if (this.f78155i != null) {
            this.f78155i.o0();
        }
        com.tencent.mm.plugin.appbrand.floatball.i c17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0.c(this.f78147a);
        if (c17 != null) {
            c17.o0();
        }
        c(null);
    }

    public void e(boolean z17) {
        if (!z17) {
            this.f78157k = true;
            if (this.f78150d != null) {
                this.f78150d.o0();
                this.f78150d = null;
                return;
            }
            return;
        }
        if (this.f78147a.L0() || this.f78147a.S) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandFloatBallLogic", "initFloatBallHelper in work thread, but runtime finished");
            return;
        }
        if (this.f78147a.r0() == null) {
            this.f78157k = true;
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandFloatBallLogic", "init, context is null");
        } else {
            if (this.f78157k && this.f78150d == null) {
                b(this.f78147a, false);
            }
            this.f78157k = false;
        }
    }

    public void f(java.lang.Runnable runnable) {
        if (this.f78159m) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandFloatBallLogic", "runOnRuntimeInitialized plugin finishing, stack %s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
        } else if (this.f78158l) {
            runnable.run();
        } else {
            this.f78148b.offerLast(runnable);
        }
    }
}

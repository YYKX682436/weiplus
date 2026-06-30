package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public final class v extends nh1.a {
    static {
        new com.tencent.mm.plugin.appbrand.menu.r(null);
    }

    public v() {
        super(32);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        if (!com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.d(pageView) || str == null || !ti1.c.a(pageView.getRuntime())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegateGameLive", "gameLive is not permitted according to the configuration from back");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.y(pageView.getRuntime().S2(false).qe("gameLive"), false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegateGameLive", "gameLive is not permitted due to the develop_config");
            return;
        }
        ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).getClass();
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352169e, null, 0, null, 14, null), p60.q.class, null);
        java.lang.Boolean Bi = ((p60.u) ((p60.x) i95.n0.c(p60.x.class))).Bi(str, pageView.getRuntime().u0().f77281g);
        com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegateGameLive", "show the gameLive menu, isLiving:" + Bi + ", 1 is finish 0 is start");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        h63.v0 v0Var = (h63.v0) ((h63.r1) i95.n0.c(h63.r1.class));
        v0Var.f279292n = 5;
        v0Var.f279293o = currentTimeMillis;
        ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).Bi(1);
        if (g4Var != null) {
            kotlin.jvm.internal.o.d(Bi);
            g4Var.n(this.f337084a, context.getString(Bi.booleanValue() ? com.tencent.mm.R.string.f490635a25 : com.tencent.mm.R.string.a28), com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.finder_icon_live, i65.a.d(context, com.tencent.mm.R.color.f479096pv)), i65.a.d(context, com.tencent.mm.R.color.f479096pv));
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).Bi(2);
        com.tencent.mm.plugin.appbrand.report.v0.e(pageView.getAppId(), pageView.X1(), 49, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
        if (str == null) {
            return;
        }
        java.lang.Boolean Bi = ((p60.u) ((p60.x) i95.n0.c(p60.x.class))).Bi(str, pageView.getRuntime().u0().f77281g);
        kotlin.jvm.internal.o.d(Bi);
        if (Bi.booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegateGameLive", "click the gameLive menu, isLiving:" + Bi + ", 1 is exitGameLive 0 is send event");
            h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
            java.lang.String appId = pageView.getAppId();
            int i17 = pageView.getRuntime().u0().f77281g;
            com.tencent.mm.plugin.appbrand.menu.t[] tVarArr = com.tencent.mm.plugin.appbrand.menu.t.f85989d;
            ((h63.v0) r1Var).Ai(appId, i17, context, 1, null);
            return;
        }
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        if (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.T) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegateGameLive", "is voip talking");
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.g(i65.a.r(context, com.tencent.mm.R.string.a0x));
            u1Var.l(null);
            u1Var.a(true);
            u1Var.q(false);
            return;
        }
        if (!(tb1.b.f416889a.a().length == 0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegateGameLive", "is using camera");
            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var2.g(i65.a.r(context, com.tencent.mm.R.string.a0w));
            u1Var2.l(null);
            u1Var2.a(true);
            u1Var2.q(false);
            return;
        }
        com.tencent.mm.plugin.appbrand.menu.s sVar = new com.tencent.mm.plugin.appbrand.menu.s();
        com.tencent.mm.plugin.appbrand.menu.u[] uVarArr = com.tencent.mm.plugin.appbrand.menu.u.f85992d;
        sVar.t(kz5.b1.e(new jz5.l("event", 4)));
        sVar.v(pageView.getRuntime().C0(), pageView.getComponentId());
        sVar.m();
        com.tencent.mm.plugin.appbrand.report.v0.e(str, pageView.X1(), 49, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}

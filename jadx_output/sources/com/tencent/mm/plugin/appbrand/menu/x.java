package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public final class x extends nh1.a {
    public x() {
        super(33);
    }

    @Override // nh1.a
    public boolean b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_GameRewards", " attachTo ");
        if (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.d(pageView) && str != null) {
            if (ti1.c.b(pageView.getRuntime()) != null) {
                if (com.tencent.mm.sdk.platformtools.t8.y(pageView.getRuntime().S2(false).qe("gameComponent"), false)) {
                    boolean c17 = com.tencent.mm.plugin.appbrand.menu.l1.c(u0Var, "key_show_red_dot", false);
                    if (c17) {
                        com.tencent.mm.plugin.appbrand.menu.l1.d(u0Var, "key_show_red_dot", false);
                    }
                    java.lang.String string = context.getString(com.tencent.mm.R.string.miq);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    android.view.MenuItem l17 = g4Var != null ? g4Var.l(this.f337084a, string, com.tencent.mm.R.drawable.d5b, false) : null;
                    if (c17 && (l17 instanceof db5.h4)) {
                        ((db5.h4) l17).f228364e = true;
                    }
                    com.tencent.mm.plugin.appbrand.report.v0.e(pageView.getAppId(), pageView.X1(), 67, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_GameRewards", "gameRewards is not permitted due to the develop_config");
                }
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_GameRewards", "gameRewards is permitted isGameAppOnly or notAble");
        return true;
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.service.c0 C0;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        com.tencent.mm.plugin.appbrand.report.v0.e(pageView.getAppId(), pageView.X1(), 65, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
        com.tencent.mm.plugin.appbrand.o6 runtime = pageView.getRuntime();
        if (runtime == null || (C0 = runtime.C0()) == null) {
            return;
        }
        byte[] b17 = ti1.c.b(pageView.getRuntime());
        com.tencent.mm.plugin.appbrand.menu.w wVar = new com.tencent.mm.plugin.appbrand.menu.w();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (b17 != null) {
            if (!(b17.length == 0)) {
                r45.l63 l63Var = new r45.l63();
                l63Var.parseFrom(b17);
                str2 = l63Var.f379169d;
                hashMap.put("bizData", str2);
                wVar.t(hashMap);
                wVar.u(C0);
                wVar.m();
            }
        }
        str2 = null;
        hashMap.put("bizData", str2);
        wVar.t(hashMap);
        wVar.u(C0);
        wVar.m();
    }
}

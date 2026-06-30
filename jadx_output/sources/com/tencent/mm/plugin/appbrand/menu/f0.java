package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class f0 extends nh1.a {
    public f0() {
        super(29);
    }

    @Override // nh1.a
    public boolean b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        if (oc1.d.a("MicroMsg.MenuDelegate_SendHandoff", n7Var.getAppId(), n7Var.getRuntime().u0().f47284z) == 0) {
            boolean c17 = com.tencent.mm.plugin.appbrand.menu.l1.c(u0Var, "key_show_red_dot", false);
            if (c17) {
                com.tencent.mm.plugin.appbrand.menu.l1.d(u0Var, "key_show_red_dot", false);
            }
            android.view.MenuItem h17 = g4Var.h(29, context.getString(com.tencent.mm.R.string.a2v), com.tencent.mm.R.raw.icons_outlined_colorful_handoff, 0);
            if (c17) {
                ((db5.h4) h17).f228364e = true;
            }
            com.tencent.mm.plugin.appbrand.report.v0.e(str, n7Var.X1(), 45, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
        }
        return true;
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_SendHandoff", "performItemClick");
        com.tencent.mm.plugin.appbrand.menu.e0 e0Var = new com.tencent.mm.plugin.appbrand.menu.e0();
        e0Var.v(n7Var.getRuntime().C0(), n7Var.getComponentId());
        e0Var.f82374f = "";
        e0Var.m();
        com.tencent.mm.plugin.appbrand.report.v0.e(str, n7Var.X1(), 46, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}

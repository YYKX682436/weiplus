package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class z extends nh1.a {
    public z() {
        super(22);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.o6 runtime = ((com.tencent.mm.plugin.appbrand.page.n7) v5Var).getRuntime();
        com.tencent.mm.plugin.appbrand.floatball.u uVar = runtime.f86193y2;
        if (uVar != null) {
            uVar.c(null);
        }
        com.tencent.mm.plugin.appbrand.floatball.u uVar2 = runtime.f86193y2;
        if ((uVar2 != null ? uVar2.f78150d : null) != null && (!r0.f78112v.u0().f77292e2)) {
            boolean wi6 = ((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).wi(pv.b0.f358482g);
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.a2p);
            int color = context.getResources().getColor(com.tencent.mm.R.color.abw);
            java.util.Map map = i81.j.f289592a;
            db5.h4 h4Var = new db5.h4(g4Var.f228346f, this.f337084a, 0);
            h4Var.f228368i = string;
            h4Var.d(com.tencent.mm.R.raw.floating_window_regular, color);
            h4Var.f228375s = context instanceof com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI;
            h4Var.f228363d = wi6;
            h4Var.f228364e = false;
            ((java.util.ArrayList) g4Var.f228344d).add(h4Var);
        }
        d("view_exp");
        ((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).Ni(pv.b0.f358482g);
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        com.tencent.mm.plugin.appbrand.floatball.u uVar = n7Var.getRuntime().f86193y2;
        (uVar != null ? uVar.f78150d : null).A(true, 2);
        com.tencent.mm.plugin.appbrand.report.v0.e(n7Var.getAppId(), n7Var.X1(), 61, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
        d("view_clk");
        ((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).Ai(pv.b0.f358482g);
    }

    public final void d(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("btn_scene", 2);
        hashMap.put("view_id", "float_win_btn");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, hashMap, 33488);
    }
}

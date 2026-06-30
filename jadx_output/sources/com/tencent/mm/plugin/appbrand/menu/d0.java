package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class d0 extends nh1.a {
    public d0() {
        super(31);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        if (((com.tencent.mm.plugin.appbrand.page.n7) v5Var).H1(31).f85995c) {
            return;
        }
        g4Var.h(this.f337084a, context.getString(com.tencent.mm.R.string.a2u), com.tencent.mm.R.raw.appbrand_menu_sales_driving, context.getResources().getColor(com.tencent.mm.R.color.f478667dl));
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        com.tencent.mm.plugin.appbrand.report.v0.e(str, n7Var.X1(), 39, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
        xd1.b bVar = new xd1.b();
        java.util.HashMap hashMap = new java.util.HashMap();
        bVar.u(n7Var.U1());
        com.tencent.mars.xlog.Log.i("MicroMsg.OnSalesDrivingMessageJsEvent", "dispatch data");
        bVar.t(hashMap);
        bVar.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_SalesDriving", "performItemClick");
    }
}

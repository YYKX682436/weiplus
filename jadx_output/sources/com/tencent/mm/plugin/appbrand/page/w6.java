package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class w6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.x6 f87199d;

    public w6(com.tencent.mm.plugin.appbrand.page.x6 x6Var) {
        this.f87199d = x6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.x6 x6Var = this.f87199d;
        if (x6Var.f87250g.isRunning()) {
            java.util.List<com.tencent.mm.plugin.appbrand.menu.u0> G1 = x6Var.f87250g.G1();
            if (G1 == null || G1.size() <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageView", "showPageActionSheet appId[%s], url[%s], empty list skip", x6Var.f87250g.getAppId(), x6Var.f87250g.X1());
            } else {
                x6Var.f87250g.I2(G1, x6Var.f87248e, x6Var.f87249f);
            }
        }
    }
}

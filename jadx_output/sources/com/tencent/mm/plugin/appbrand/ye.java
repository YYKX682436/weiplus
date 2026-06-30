package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class ye {
    public static android.graphics.Bitmap a(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6) {
            return ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).Y1();
        }
        if (!com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.isGame(appBrandRuntime)) {
            com.tencent.mm.plugin.appbrand.page.w2 currentPage = appBrandRuntime.x0().getCurrentPage();
            if (currentPage == null) {
                return null;
            }
            return com.tencent.mm.plugin.appbrand.page.ie.b(currentPage);
        }
        ae.q qVar = (ae.q) ((com.tencent.mm.plugin.appbrand.service.c0) appBrandRuntime.C0()).z1(ae.q.class);
        if (qVar != null) {
            return ((ae.a) qVar).w().f48591o.d();
        }
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.RuntimeRestartHelper", new ae.s(), "hy: not game service", new java.lang.Object[0]);
        return null;
    }
}

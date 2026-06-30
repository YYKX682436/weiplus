package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class t5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.u5 f87112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(com.tencent.mm.plugin.appbrand.page.u5 u5Var) {
        super(0);
        this.f87112d = u5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.page.u5 u5Var = this.f87112d;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = u5Var.f87138d;
        boolean z17 = true;
        if (iCommLibReader != null) {
            java.lang.String[] strArr = {"lazyCodeLoading", "lazyCodeLoading2"};
            int i17 = 0;
            while (true) {
                if (i17 >= 2) {
                    z17 = false;
                    break;
                }
                java.lang.String qe6 = iCommLibReader.qe(strArr[i17]);
                if (!(qe6 == null || qe6.length() == 0)) {
                    break;
                }
                i17++;
            }
        }
        if (!z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("useLazyCodeLoadingMode return false, lib.version=[");
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader2 = u5Var.f87138d;
            sb6.append(iCommLibReader2 != null ? iCommLibReader2.Y0() : null);
            sb6.append(']');
            com.tencent.mars.xlog.Log.i("Luggage.WXA.FULL.AppBrandPageScriptInjectConfig", sb6.toString());
            return java.lang.Boolean.FALSE;
        }
        com.tencent.mm.plugin.appbrand.appcache.y3 y3Var = u5Var.f87139e;
        if (y3Var.d("common.app.js")) {
            com.tencent.mars.xlog.Log.i("Luggage.WXA.FULL.AppBrandPageScriptInjectConfig", "useLazyCodeLoadingMode return true, by common.app.js");
            return java.lang.Boolean.TRUE;
        }
        for (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo : y3Var.a()) {
            if (modulePkgInfo.independent) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(modulePkgInfo.name);
                java.lang.String name = modulePkgInfo.name;
                kotlin.jvm.internal.o.f(name, "name");
                sb7.append(r26.i0.n(name, "/", false) ? "" : "/");
                sb7.append("common.app.js");
                java.lang.String sb8 = sb7.toString();
                if (y3Var.d(sb8)) {
                    com.tencent.mars.xlog.Log.i("Luggage.WXA.FULL.AppBrandPageScriptInjectConfig", "useLazyCodeLoadingMode return true, by independent " + sb8);
                    return java.lang.Boolean.TRUE;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Luggage.WXA.FULL.AppBrandPageScriptInjectConfig", "useLazyCodeLoadingMode return false");
        return java.lang.Boolean.FALSE;
    }
}

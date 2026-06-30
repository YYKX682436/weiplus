package com.tencent.mm.plugin.appbrand.app;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public class za extends i95.w implements l81.q0 {
    public com.tencent.mm.plugin.appbrand.appcache.b4 wi(java.lang.String pkgKey, int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appcache.sa wxaPkgStorageRouter = ((com.tencent.mm.plugin.appbrand.app.PluginAppBrand) i95.n0.c(com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class)).getWxaPkgStorageRouter();
        wxaPkgStorageRouter.getClass();
        kotlin.jvm.internal.o.g(pkgKey, "pkgKey");
        return ((str == null || str.length() == 0) && !(r26.i0.n(pkgKey, "$__PLUGINCODE__", false) && com.tencent.mm.plugin.appbrand.appcache.g0.a(i17))) ? wxaPkgStorageRouter.f75963a : wxaPkgStorageRouter.f75964b;
    }
}

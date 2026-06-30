package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class f6 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    private static final int CTRL_INDEX = 97;
    private static final java.lang.String NAME = "getPublicLibVersion";

    public java.util.Map B(com.tencent.mm.plugin.appbrand.y yVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.luggage.sdk.config.AppBrandSysConfigLU appBrandSysConfigLU = (com.tencent.luggage.sdk.config.AppBrandSysConfigLU) yVar.b(com.tencent.luggage.sdk.config.AppBrandSysConfigLU.class);
        hashMap.put("appDebug", java.lang.Boolean.valueOf(appBrandSysConfigLU.f305852r.f75399d != 0));
        java.lang.String str = appBrandSysConfigLU.f305852r.f75372md5;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        hashMap.put("appMd5", str);
        hashMap.put("appVersion", java.lang.Integer.valueOf(appBrandSysConfigLU.f305852r.pkgVersion));
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = yVar.x();
        if (x17 != null) {
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) x17.getF90658d();
            hashMap.put("libDebug", java.lang.Boolean.valueOf(wxaPkgWrappingInfo.f75399d != 0));
            java.lang.String str2 = wxaPkgWrappingInfo.f75372md5;
            hashMap.put("libMd5", str2 != null ? str2 : "");
            hashMap.put("libVersion", java.lang.Integer.valueOf(wxaPkgWrappingInfo.pkgVersion));
        }
        hashMap.put("system", com.eclipsesource.mmv8.Platform.ANDROID);
        hashMap.put("systemVersion", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
        return hashMap;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        return !yVar.isRunning() ? o("fail js context not running") : p("ok", B(yVar));
    }
}

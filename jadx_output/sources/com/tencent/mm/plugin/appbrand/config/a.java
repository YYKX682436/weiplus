package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f77518a = com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyj);

    public static java.lang.String a(com.tencent.luggage.sdk.config.AppBrandSysConfigLU appBrandSysConfigLU) {
        com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.HttpSetting httpSetting;
        com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig appBrandGlobalSystemConfig = appBrandSysConfigLU.Y;
        java.lang.String str = (appBrandGlobalSystemConfig == null || (httpSetting = appBrandGlobalSystemConfig.f77221s) == null) ? "" : httpSetting.f77258n;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = f77518a;
        }
        return "https://" + str + "/" + appBrandSysConfigLU.f305842e + "/" + appBrandSysConfigLU.f305852r.pkgVersion + "/page-frame.html";
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.file.h b(com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU) {
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting wxaAttributes$WxaDynamicInfo$Setting = appBrandInitConfigLU.R;
        com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig b17 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b();
        com.tencent.mm.plugin.appbrand.jsapi.file.h hVar = new com.tencent.mm.plugin.appbrand.jsapi.file.h();
        long j17 = b17.f77209g;
        hVar.f81065e = j17;
        if (j17 <= 0) {
            hVar.f81065e = 300L;
        }
        long j18 = wxaAttributes$WxaDynamicInfo$Setting.f77421s;
        hVar.f81064d = j18;
        if (j18 <= 0) {
            hVar.f81064d = 10L;
        }
        long j19 = wxaAttributes$WxaDynamicInfo$Setting.f77422t;
        hVar.f81066f = j19;
        if (j19 <= 0) {
            hVar.f81066f = 300L;
        }
        long j27 = wxaAttributes$WxaDynamicInfo$Setting.f77423u;
        hVar.f81067g = j27;
        if (j27 <= 0) {
            hVar.f81067g = 100L;
        }
        long j28 = b17.P;
        hVar.f81068h = j28;
        if (j28 <= 0) {
            hVar.f81068h = 30L;
        }
        long j29 = wxaAttributes$WxaDynamicInfo$Setting.N;
        hVar.f81069i = j29;
        if (j29 <= 0) {
            hVar.f81069i = 200L;
        }
        return hVar;
    }

    public static boolean c(com.tencent.luggage.sdk.config.AppBrandSysConfigLU appBrandSysConfigLU) {
        boolean z17 = appBrandSysConfigLU.f305852r.f75399d == 1 || appBrandSysConfigLU.f305852r.f75399d == 2;
        return appBrandSysConfigLU.f47300z ? (z17 && appBrandSysConfigLU.f47299y) ? false : true : (z17 && appBrandSysConfigLU.f47296w) ? false : true;
    }
}

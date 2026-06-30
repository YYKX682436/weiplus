package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class qc {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.qc f85087a = new com.tencent.mm.plugin.appbrand.launching.qc();

    public final void a(java.lang.String appId, java.lang.String moduleName, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaVersionInfo, int i17, com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, r45.y50 cgiCommRequestSource, yz5.l onSuccess, yz5.p onError) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        kotlin.jvm.internal.o.g(wxaVersionInfo, "wxaVersionInfo");
        kotlin.jvm.internal.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        kotlin.jvm.internal.o.g(onError, "onError");
        int i18 = wxaVersionInfo.f77444d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WVADownloadInfoFetcher", "fetchWVADownloadInfo: appId=" + appId + ", moduleName=" + moduleName + ", version=" + i18);
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.a6.a(moduleName);
        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(appId);
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                str2 = "";
            } else {
                str2 = "$" + a17;
            }
            sb6.append(str2);
            str = sb6.toString();
        } else {
            str = null;
        }
        kotlin.jvm.internal.o.f(str, "toString(...)");
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo wxaAttributes$WxaWidgetInfo = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo) ((android.util.ArrayMap) com.tencent.mm.plugin.appbrand.launching.g8.f84628a.b(wxaVersionInfo, appId, true)).get(moduleName);
        if (wxaAttributes$WxaWidgetInfo != null && com.tencent.mm.plugin.appbrand.appcache.g0.b(i17)) {
            com.tencent.mm.plugin.appbrand.app.r9.Di().l(str, i17, i18, wxaAttributes$WxaWidgetInfo.f77475e, null);
        }
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo b17 = com.tencent.mm.plugin.appbrand.launching.v3.b(str, 0);
        com.tencent.mm.plugin.appbrand.launching.z6 z6Var = new com.tencent.mm.plugin.appbrand.launching.z6();
        z6Var.f85461d = appId;
        z6Var.f85462e = moduleName;
        z6Var.f85463f = 51;
        z6Var.f85464g = i17;
        z6Var.f85465h = i18;
        z6Var.f85467m = 1;
        if (b17 != null) {
            z6Var.f85468n = b17.pkgVersion();
            z6Var.f85467m = com.tencent.mm.plugin.appbrand.appcache.y8.f(b17.pkgPath());
        }
        com.tencent.mm.plugin.appbrand.launching.x5 x5Var = com.tencent.mm.plugin.appbrand.launching.x5.f85410a;
        java.util.List c17 = kz5.b0.c(z6Var);
        com.tencent.mm.plugin.appbrand.launching.oc ocVar = new com.tencent.mm.plugin.appbrand.launching.oc(z6Var, onError, str, i17, b17, onSuccess);
        com.tencent.mm.plugin.appbrand.launching.pc pcVar = new com.tencent.mm.plugin.appbrand.launching.pc(onError);
        int i19 = qualitySession != null ? qualitySession.f88138h : 0;
        java.lang.String str3 = qualitySession != null ? qualitySession.f88134d : null;
        x5Var.e(c17, ocVar, pcVar, i19, cgiCommRequestSource, str3 == null ? "" : str3);
    }
}

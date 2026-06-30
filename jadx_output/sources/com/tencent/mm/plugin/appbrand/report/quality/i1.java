package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public abstract class i1 {
    public static final void a(java.lang.String appId, int i17, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaVersionInfo, boolean z17, int i18) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(wxaVersionInfo, "wxaVersionInfo");
        if (i18 <= 120) {
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1906, i18);
        com.tencent.mm.plugin.appbrand.report.v0.i(appId, com.tencent.mm.plugin.appbrand.appcache.g0.b(i17) ? wxaVersionInfo.f77444d : 0, i17, 1906, i18, 1);
    }
}

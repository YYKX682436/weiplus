package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgStorageExportServiceIPC$PkgParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class t0<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {
    static {
        new com.tencent.mm.plugin.appbrand.appcache.predownload.export.t0();
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        k91.v5 k17;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo w07;
        t81.i y07;
        java.lang.String str = ((com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams) obj).f75770d;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
        boolean z17 = true;
        int i17 = 0;
        if (!(str == null || str.length() == 0)) {
            ((com.tencent.mm.plugin.appbrand.app.r9) i95.n0.c(com.tencent.mm.plugin.appbrand.app.r9.class)).getClass();
            com.tencent.mm.plugin.appbrand.app.r9.mj();
            java.lang.String f17 = k91.k4.f(str);
            if (f17 == null || f17.length() == 0) {
                f17 = (java.lang.String) k91.e3.f305573d.get(str);
            }
            if (f17 != null && f17.length() != 0) {
                z17 = false;
            }
            int i18 = (z17 || (y07 = ((t81.j) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.j.class)).y0(f17)) == null) ? 0 : y07.field_appVersion;
            if (i18 >= 0) {
                i17 = i18;
            } else {
                k91.m4 ij6 = com.tencent.mm.plugin.appbrand.app.r9.ij();
                if (ij6 != null && (k17 = ij6.k1(str, "versionInfo")) != null && (w07 = k17.w0()) != null) {
                    i17 = w07.f77444d;
                }
            }
        }
        return new com.tencent.mm.ipcinvoker.type.IPCInteger(i17);
    }
}

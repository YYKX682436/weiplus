package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgStorageExportServiceIPC$PkgParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class u0<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {
    static {
        new com.tencent.mm.plugin.appbrand.appcache.predownload.export.u0();
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams wxaPkgStorageExportServiceIPC$PkgParams = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams) obj;
        java.lang.String str = wxaPkgStorageExportServiceIPC$PkgParams.f75770d;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
        java.lang.String str2 = wxaPkgStorageExportServiceIPC$PkgParams.f75773g;
        boolean z17 = false;
        if (com.tencent.mm.vfs.w6.j(str2)) {
            if (!(str == null || str.length() == 0)) {
                java.lang.String str3 = null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str);
                    sb6.append(com.tencent.mm.sdk.platformtools.t8.K0(null) ? "" : "$null");
                    str3 = sb6.toString();
                }
                int i17 = wxaPkgStorageExportServiceIPC$PkgParams.f75772f;
                java.lang.String f17 = com.tencent.mm.plugin.appbrand.appcache.e9.f(str3, i17);
                if (com.tencent.mm.sdk.platformtools.k1.a(str2, f17, false)) {
                    try {
                        kotlin.jvm.internal.o.d(f17);
                        java.lang.String d17 = com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo.d(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(f17)));
                        com.tencent.mm.plugin.appbrand.appcache.n9 n9Var = new com.tencent.mm.plugin.appbrand.appcache.n9();
                        n9Var.field_appId = str;
                        n9Var.field_version = i17;
                        n9Var.field_debugType = 0;
                        n9Var.field_pkgPath = f17;
                        n9Var.field_versionMd5 = d17;
                        n9Var.field_NewMd5 = d17;
                        ((com.tencent.mm.plugin.appbrand.app.r9) i95.n0.c(com.tencent.mm.plugin.appbrand.app.r9.class)).getClass();
                        com.tencent.mm.plugin.appbrand.app.r9.mj();
                        com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
                        if (Di != null) {
                            z17 = Di.t(n9Var);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgStorageExportServiceImpl", "insertPkg failed: appId:" + str + ", version:" + i17 + ", filePath:" + str2 + ", storage is null");
                        }
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgStorageExportServiceImpl", "insertPkg(appId:" + str + ", version:" + i17 + ", filePath:" + str2 + "), get exception:" + e17);
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgStorageExportServiceImpl", "copy pkg failed: appId[%s] version[%d] from %s to %s", str, java.lang.Integer.valueOf(i17), str2, f17);
                }
            }
        }
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17);
    }
}

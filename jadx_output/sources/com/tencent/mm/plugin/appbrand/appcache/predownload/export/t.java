package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgParam;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class t<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.predownload.export.t f75830a = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.t();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgParam wxaPkgDownloaderExportServiceIPC$DownloadPkgParam = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgParam) obj;
        java.lang.String str = wxaPkgDownloaderExportServiceIPC$DownloadPkgParam.f75760d;
        int i17 = wxaPkgDownloaderExportServiceIPC$DownloadPkgParam.f75761e;
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0 m0Var = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0) com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0.f75819d.b();
        if (m0Var != null) {
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(m0Var.e6(str, i17));
        }
        if (gm0.j1.b().f273254q) {
            throw null;
        }
        throw new c01.c();
    }
}

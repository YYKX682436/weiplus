package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/content/ContentValues;", "it", "Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgStorageExportServiceIPC$PkgParams;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class s0<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.predownload.export.s0 f75829a = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.s0();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams wxaPkgStorageExportServiceIPC$PkgParams = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams) obj;
        java.lang.String str = wxaPkgStorageExportServiceIPC$PkgParams.f75770d;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
        com.tencent.mm.plugin.appbrand.appcache.n9 Dh = ((com.tencent.mm.plugin.appbrand.appcache.predownload.export.f1) c17).Dh(str, wxaPkgStorageExportServiceIPC$PkgParams.f75771e);
        if (Dh != null) {
            return Dh.convertTo();
        }
        return null;
    }
}

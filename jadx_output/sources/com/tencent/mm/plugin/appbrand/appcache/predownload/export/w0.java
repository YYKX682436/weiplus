package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public final class w0 extends i95.w implements com.tencent.mm.plugin.appbrand.service.o6 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.predownload.export.w0 f75835d = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.w0();

    @Override // com.tencent.mm.plugin.appbrand.service.o6
    public com.tencent.mm.plugin.appbrand.appcache.n9 Dh(java.lang.String str, int i17) {
        android.content.ContentValues contentValues;
        if ((str == null || str.length() == 0) || (contentValues = (android.content.ContentValues) uk0.a.d(new com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams(str, i17, 0, null, 12, null), com.tencent.mm.plugin.appbrand.appcache.predownload.export.s0.f75829a)) == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.appcache.n9 n9Var = new com.tencent.mm.plugin.appbrand.appcache.n9();
        n9Var.convertFrom(contentValues, true);
        return n9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.o6
    public void Uf(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return;
        }
        uk0.a.c(new com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams(str, 0, i17, null, 10, null), com.tencent.mm.plugin.appbrand.appcache.predownload.export.v0.f75833d, null, 4, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.o6
    public boolean l5(java.lang.String str, int i17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.o6
    public com.tencent.mm.plugin.appbrand.appcache.n9 q6(java.lang.String str, int i17, int i18) {
        android.content.ContentValues contentValues;
        if ((str == null || str.length() == 0) || (contentValues = (android.content.ContentValues) uk0.a.d(new com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams(str, i17, i18, null, 8, null), com.tencent.mm.plugin.appbrand.appcache.predownload.export.r0.f75828a)) == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.appcache.n9 n9Var = new com.tencent.mm.plugin.appbrand.appcache.n9();
        n9Var.convertFrom(contentValues, true);
        return n9Var;
    }
}

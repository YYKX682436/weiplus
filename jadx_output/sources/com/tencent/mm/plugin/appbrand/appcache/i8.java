package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class i8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.i8 f75598a = new com.tencent.mm.plugin.appbrand.appcache.i8();

    public static final com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo b(com.tencent.mm.plugin.appbrand.appcache.n9 n9Var) {
        kotlin.jvm.internal.o.g(n9Var, "<this>");
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = new com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo();
        int i17 = n9Var.field_debugType;
        wxaPkgWrappingInfo.pkgVersion = i17 == 0 ? n9Var.field_version : 0;
        wxaPkgWrappingInfo.f75400e = n9Var.field_createTime;
        wxaPkgWrappingInfo.f75399d = i17;
        wxaPkgWrappingInfo.pkgPath = n9Var.field_pkgPath;
        wxaPkgWrappingInfo.f75401f = false;
        java.lang.String str = n9Var.field_versionMd5;
        wxaPkgWrappingInfo.f75372md5 = str == null || str.length() == 0 ? com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo.d(new com.tencent.mm.vfs.r6(wxaPkgWrappingInfo.pkgPath)) : n9Var.field_versionMd5;
        return wxaPkgWrappingInfo;
    }

    public final boolean a(com.tencent.mm.plugin.appbrand.appcache.n9 n9Var) {
        kotlin.jvm.internal.o.g(n9Var, "<this>");
        if (999 == n9Var.field_debugType) {
            long j17 = n9Var.field_endTime;
            if (j17 > 0 && j17 <= com.tencent.mm.sdk.platformtools.t8.i1()) {
                com.tencent.mars.xlog.Log.e("Luggage.WxaCommLibVersionUtils", "checkIsValid BETA_LIBRARY expired, endTime:" + n9Var.field_endTime);
                return false;
            }
        }
        if (com.tencent.mm.vfs.w6.j(n9Var.field_pkgPath)) {
            try {
                java.lang.String d17 = com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo.d(new com.tencent.mm.vfs.r6(n9Var.field_pkgPath));
                kotlin.jvm.internal.o.d(d17);
                if (kotlin.jvm.internal.o.b(d17, n9Var.field_versionMd5) || kotlin.jvm.internal.o.b(d17, n9Var.field_NewMd5)) {
                    return true;
                }
                com.tencent.mars.xlog.Log.e("Luggage.WxaCommLibVersionUtils", "checkIsValid fileMd5 != md5, fileMd5:" + d17 + ", field_versionMd5:" + n9Var.field_versionMd5 + ", field_NewMd5:" + n9Var.field_NewMd5);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Luggage.WxaCommLibVersionUtils", "checkIsValid getFileMD5 failed " + e17 + ", path:" + n9Var.field_pkgPath + ", version:" + n9Var.field_version + ", versionType:" + n9Var.field_debugType);
            }
        }
        return false;
    }
}

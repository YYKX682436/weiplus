package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public enum WxaPkgIntegrityChecker {
    ;


    /* renamed from: d, reason: collision with root package name */
    public static final bm5.x0 f75392d = new bm5.x0(new com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$$a());

    public static android.util.Pair a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo;
        if (z17 && (!z18 || com.tencent.mm.plugin.appbrand.appcache.w8.f76027b != com.tencent.mm.plugin.appbrand.appcache.v8.DEVELOP)) {
            int f17 = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.f(true);
            if (f17 < 0 || com.tencent.mm.plugin.appbrand.appcache.w8.f76026a >= f17) {
                int i17 = com.tencent.mm.plugin.appbrand.appcache.w8.f76026a;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "use local library version = %d | query appId = %s, debugType = %d, pkgVersion = %d", java.lang.Integer.valueOf(i17), "@LibraryAppId", 0, java.lang.Integer.valueOf(f17));
                wxaPkgWrappingInfo = new com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo();
                wxaPkgWrappingInfo.pkgVersion = i17;
                wxaPkgWrappingInfo.f75401f = true;
            } else {
                wxaPkgWrappingInfo = null;
            }
            if (wxaPkgWrappingInfo != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "checkLibrary, dbMax %d, local %d, use local", java.lang.Integer.valueOf(f17), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.appcache.w8.f76026a));
                return android.util.Pair.create(com.tencent.mm.plugin.appbrand.appcache.l9.APP_READY, wxaPkgWrappingInfo);
            }
        }
        android.util.Pair b17 = b("@LibraryAppId", z17 ? 0 : 999, -1, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "checkLibrary, release %b, skipLocalDevPack %b, localPackMode %s, checkRecordResult %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), com.tencent.mm.plugin.appbrand.appcache.w8.f76027b, b17.first);
        return b17;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair b(java.lang.String r19, int r20, int r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.b(java.lang.String, int, int, java.lang.String):android.util.Pair");
    }

    private static java.lang.String checkFileMD5JNI(com.tencent.mm.vfs.r6 r6Var, boolean z17) {
        com.tencent.mm.plugin.appbrand.appcache.MD5JNILoadGuard.ensureNativeLibrariesLoaded();
        java.lang.String[] strArr = new java.lang.String[1];
        int mD5String = z17 ? com.tencent.mm.plugin.appbrand.appstorage.MD5JNI.getMD5String(com.tencent.mm.vfs.w6.i(r6Var.o(), false), strArr) : com.tencent.mm.plugin.appbrand.appstorage.MD5JNI.getMD5StringLegacy(com.tencent.mm.vfs.w6.i(r6Var.o(), false), strArr);
        if (mD5String != 0) {
            throw new java.io.IOException("MD5JNI ret=" + mD5String);
        }
        java.lang.String str = strArr[0];
        if (str != null) {
            return str;
        }
        throw new java.io.IOException("MD5JNI ret=null");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:46|47|(3:49|50|21)|26|27|28|29|30|(1:32)|33|34|21) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f2, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "checkFileMD5Legacy IOException = %s", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0 A[Catch: IOException -> 0x00f1, all -> 0x0156, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x00f1, blocks: (B:27:0x00d4, B:32:0x00e0, B:38:0x00f0, B:43:0x00ed), top: B:26:0x00d4, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.d(java.lang.String):java.lang.String");
    }

    private static boolean openMD5JNICheck() {
        return true;
    }

    private static boolean openMD5JNINewImplCheck() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_wxapkg_md5_check_use_jni_new_impl, 1) == 1;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker */
/* loaded from: classes7.dex */
public enum EnumC11664x177167f4 {
    ;


    /* renamed from: d, reason: collision with root package name */
    public static final bm5.x0 f156925d = new bm5.x0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11665x1630af6d());

    public static android.util.Pair a(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6;
        if (z17 && (!z18 || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157560b != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v8.DEVELOP)) {
            int f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.f(true);
            if (f17 < 0 || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a >= f17) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "use local library version = %d | query appId = %s, debugType = %d, pkgVersion = %d", java.lang.Integer.valueOf(i17), "@LibraryAppId", 0, java.lang.Integer.valueOf(f17));
                c11667xc7e59dd6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6();
                c11667xc7e59dd6.f33456x1c82a56c = i17;
                c11667xc7e59dd6.f156934f = true;
            } else {
                c11667xc7e59dd6 = null;
            }
            if (c11667xc7e59dd6 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "checkLibrary, dbMax %d, local %d, use local", java.lang.Integer.valueOf(f17), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a));
                return android.util.Pair.create(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l9.APP_READY, c11667xc7e59dd6);
            }
        }
        android.util.Pair b17 = b("@LibraryAppId", z17 ? 0 : 999, -1, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "checkLibrary, release %b, skipLocalDevPack %b, localPackMode %s, checkRecordResult %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157560b, b17.first);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.EnumC11664x177167f4.b(java.lang.String, int, int, java.lang.String):android.util.Pair");
    }

    /* renamed from: checkFileMD5JNI */
    private static java.lang.String m49220xa6269ceb(com.p314xaae8f345.mm.vfs.r6 r6Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11655x6ff60bd8.m49193x3797549();
        java.lang.String[] strArr = new java.lang.String[1];
        int m49645x40453099 = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11706x873c9d47.m49645x40453099(com.p314xaae8f345.mm.vfs.w6.i(r6Var.o(), false), strArr) : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11706x873c9d47.m49646x88aa79c2(com.p314xaae8f345.mm.vfs.w6.i(r6Var.o(), false), strArr);
        if (m49645x40453099 != 0) {
            throw new java.io.IOException("MD5JNI ret=" + m49645x40453099);
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
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "checkFileMD5Legacy IOException = %s", r8);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.EnumC11664x177167f4.d(java.lang.String):java.lang.String");
    }

    /* renamed from: openMD5JNICheck */
    private static boolean m49221x33587377() {
        return true;
    }

    /* renamed from: openMD5JNINewImplCheck */
    private static boolean m49222xaf4f57b9() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_wxapkg_md5_check_use_jni_new_impl, 1) == 1;
    }
}

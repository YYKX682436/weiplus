package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.ZipJNI */
/* loaded from: classes7.dex */
public class C11708x9f8fd4e4 {

    /* renamed from: ERR_ILLEGAL_PATH */
    public static final int f33492x17087028 = 1;

    /* renamed from: ERR_ZIP_FILE_NOT_FOUND */
    public static final int f33493xd578ce0b = 2;

    /* renamed from: UNZ_BADZIPFILE */
    public static final int f33494xf20c8a96 = -103;

    /* renamed from: UNZ_CRCERROR */
    public static final int f33495x6ad69a52 = -105;

    /* renamed from: UNZ_END_OF_LIST_OF_FILE */
    public static final int f33496x6c4879c9 = -100;

    /* renamed from: UNZ_ERRNO */
    public static final int f33497x205498e8 = -1;

    /* renamed from: UNZ_ERR_OPEN_WRITE */
    public static final int f33498xf95b63e2 = -106;

    /* renamed from: UNZ_INTERNALERROR */
    public static final int f33499x123c4e6d = -104;

    /* renamed from: UNZ_OK */
    public static final int f33500x95816dfa = 0;

    /* renamed from: UNZ_PARAMERROR */
    public static final int f33501xd8235bb9 = -102;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11708x9f8fd4e4.class.getClassLoader();
        fp.d0.n("appbrandcommon");
    }

    /* renamed from: unzip */
    public static native int m49651x6a495e8(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: vfsUnzip */
    public static int m49652xbea53fe5(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return m49651x6a495e8(com.p314xaae8f345.mm.vfs.w6.i(str, false), com.p314xaae8f345.mm.vfs.w6.i(str2, true), str3);
    }
}

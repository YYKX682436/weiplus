package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class ZipJNI {
    public static final int ERR_ILLEGAL_PATH = 1;
    public static final int ERR_ZIP_FILE_NOT_FOUND = 2;
    public static final int UNZ_BADZIPFILE = -103;
    public static final int UNZ_CRCERROR = -105;
    public static final int UNZ_END_OF_LIST_OF_FILE = -100;
    public static final int UNZ_ERRNO = -1;
    public static final int UNZ_ERR_OPEN_WRITE = -106;
    public static final int UNZ_INTERNALERROR = -104;
    public static final int UNZ_OK = 0;
    public static final int UNZ_PARAMERROR = -102;

    static {
        com.tencent.mm.plugin.appbrand.appstorage.ZipJNI.class.getClassLoader();
        fp.d0.n("appbrandcommon");
    }

    public static native int unzip(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static int vfsUnzip(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return unzip(com.tencent.mm.vfs.w6.i(str, false), com.tencent.mm.vfs.w6.i(str2, true), str3);
    }
}

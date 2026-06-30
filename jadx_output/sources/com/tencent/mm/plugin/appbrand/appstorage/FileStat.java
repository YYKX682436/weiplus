package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class FileStat {
    static {
        com.tencent.mm.plugin.appbrand.appstorage.FileStat.class.getClassLoader();
        fp.d0.n("appbrandcommon");
    }

    public static native int stat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat);

    public static int vfsStat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat) {
        return stat(com.tencent.mm.vfs.w6.i(str, false), fileStructStat);
    }
}

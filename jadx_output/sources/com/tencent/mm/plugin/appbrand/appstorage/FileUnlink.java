package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class FileUnlink {
    static {
        com.tencent.mm.plugin.appbrand.appstorage.FileUnlink.class.getClassLoader();
        fp.d0.n("appbrandcommon");
    }

    public static native int unlink(java.lang.String str);

    public static int vfsUnlink(java.lang.String str) {
        return unlink(com.tencent.mm.vfs.w6.i(str, true));
    }
}

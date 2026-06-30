package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes.dex */
public final class LuggageFlockWrapper {
    private static native int isFileLocked(java.lang.String str);

    public static boolean isFileLockedJNI(java.lang.String str) {
        return isFileLocked(str) == 1;
    }

    private static native int lockFile(java.lang.String str);

    public static void lockFileJNI(java.lang.String str) {
        lockFile(str);
    }
}

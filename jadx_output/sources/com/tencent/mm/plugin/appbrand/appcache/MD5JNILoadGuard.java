package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class MD5JNILoadGuard {
    private static final boolean[] sLoadedFlag = {false};

    private MD5JNILoadGuard() {
    }

    public static boolean ensureNativeLibrariesLoaded() {
        boolean[] zArr = sLoadedFlag;
        if (zArr[0]) {
            return true;
        }
        try {
            com.tencent.mm.plugin.appbrand.appcache.MD5JNILoadGuard.class.getClassLoader();
            fp.d0.n("appbrandcommon");
            zArr[0] = true;
            return true;
        } catch (java.lang.UnsatisfiedLinkError unused) {
            return false;
        }
    }
}

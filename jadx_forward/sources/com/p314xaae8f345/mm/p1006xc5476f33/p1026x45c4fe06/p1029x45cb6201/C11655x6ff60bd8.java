package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.MD5JNILoadGuard */
/* loaded from: classes7.dex */
public final class C11655x6ff60bd8 {

    /* renamed from: sLoadedFlag */
    private static final boolean[] f33443x6a7341e4 = {false};

    private C11655x6ff60bd8() {
    }

    /* renamed from: ensureNativeLibrariesLoaded */
    public static boolean m49193x3797549() {
        boolean[] zArr = f33443x6a7341e4;
        if (zArr[0]) {
            return true;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11655x6ff60bd8.class.getClassLoader();
            fp.d0.n("appbrandcommon");
            zArr[0] = true;
            return true;
        } catch (java.lang.UnsatisfiedLinkError unused) {
            return false;
        }
    }
}

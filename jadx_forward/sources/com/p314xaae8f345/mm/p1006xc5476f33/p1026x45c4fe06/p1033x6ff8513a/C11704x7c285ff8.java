package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.LuggageFlockWrapper */
/* loaded from: classes.dex */
public final class C11704x7c285ff8 {
    /* renamed from: isFileLocked */
    private static native int m49636xe08f0470(java.lang.String str);

    /* renamed from: isFileLockedJNI */
    public static boolean m49637x23168515(java.lang.String str) {
        return m49636xe08f0470(str) == 1;
    }

    /* renamed from: lockFile */
    private static native int m49638x71c7a147(java.lang.String str);

    /* renamed from: lockFileJNI */
    public static void m49639xae2a24de(java.lang.String str) {
        m49638x71c7a147(str);
    }
}

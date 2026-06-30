package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPDrm */
/* loaded from: classes13.dex */
public final class C26298x4c52183 {
    private static final java.lang.String TAG = "TPDrm";

    /* renamed from: mIsLibLoaded */
    private static boolean f51902xe0a15a33;

    static {
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101882x9ec66011(null);
            f51902xe0a15a33 = true;
        } catch (java.lang.UnsupportedOperationException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e17.getMessage());
            f51902xe0a15a33 = false;
        }
    }

    /* renamed from: getDRMCapabilities */
    public static int[] m101756xc5ab40bf() {
        if (!m101757x369448e0()) {
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("Failed to load native library.");
        }
        try {
            int[] m101758x5deb79e7 = m101758x5deb79e7();
            return m101758x5deb79e7 == null ? new int[0] : m101758x5deb79e7;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.toString());
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("Failed to call native func.");
        }
    }

    /* renamed from: isLibLoaded */
    private static boolean m101757x369448e0() {
        return f51902xe0a15a33;
    }

    /* renamed from: native_getDRMCapabilities */
    public static native int[] m101758x5deb79e7();
}

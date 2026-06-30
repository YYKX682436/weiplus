package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPFeatureCapability */
/* loaded from: classes13.dex */
public class C26299xd074bd92 {
    private static java.lang.String TAG = "TPFeatureCapability";

    /* renamed from: mIsLibLoaded */
    private static boolean f51903xe0a15a33;

    static {
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101882x9ec66011(null);
            f51903xe0a15a33 = true;
        } catch (java.lang.UnsupportedOperationException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e17.getMessage());
            f51903xe0a15a33 = false;
        }
    }

    /* renamed from: _isFeatureSupport */
    private static native boolean m101760xac416622(int i17);

    /* renamed from: isFeatureSupport */
    public static boolean m101761xbd3803c3(int i17) {
        if (!m101762x369448e0()) {
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("isFeatureSupport: Failed to load native library.");
        }
        try {
            return m101760xac416622(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("Failed to call _isFeatureSupport.");
        }
    }

    /* renamed from: isLibLoaded */
    private static boolean m101762x369448e0() {
        return f51903xe0a15a33;
    }
}

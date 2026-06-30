package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3030xaf3f8342;

/* renamed from: com.tencent.thumbplayer.core.config.TPPlayerCoreConfig */
/* loaded from: classes16.dex */
public class C26337x95a3941e {

    /* renamed from: mCoreEventProcessEnable */
    private static boolean f52468xfd7f724 = false;

    /* renamed from: mMediaDrmReuseEnable */
    private static boolean f52469x7365f54f = false;

    /* renamed from: mVideoMediaCodecCoexistMaxCnt */
    private static int f52470xb61829f0 = 0;

    /* renamed from: mVideoMediaCodecStuckCheckEnable */
    private static boolean f52471xa86b16cf = true;

    /* renamed from: mWidevineProvisioningServerUrl */
    private static java.lang.String f52472xdcca7455 = "";

    /* renamed from: _setMediaDrmReuseEnable */
    private static native void m102001xb7a66259(boolean z17);

    /* renamed from: _setWidevineProvisioningServerUrl */
    private static native void m102002x2159cdf(java.lang.String str);

    /* renamed from: getCoreEventProcessEnable */
    public static boolean m102003xb33f814d() {
        return f52468xfd7f724;
    }

    /* renamed from: getMediaDrmReuseEnable */
    public static boolean m102004xe0f9c3c6() {
        return f52469x7365f54f;
    }

    /* renamed from: getVideoMediaCodecCoexistMaxCnt */
    public static int m102005x850fb159() {
        return f52470xb61829f0;
    }

    /* renamed from: getWidevineProvisioningServerUrl */
    public static java.lang.String m102006xecc3da0c() {
        return f52472xdcca7455;
    }

    /* renamed from: setCoreEventProcessEnable */
    public static void m102007xe5831d59(boolean z17) {
        f52468xfd7f724 = z17;
    }

    /* renamed from: setMediaDrmReuseEnable */
    public static void m102008x2f3e833a(boolean z17) {
        if (!com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101877x369448e0()) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(3, "setMediaDrmReuseEnable, PlayerCore library has not been loaded");
            return;
        }
        f52469x7365f54f = z17;
        try {
            m102001xb7a66259(z17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.toString());
        }
    }

    /* renamed from: setVideoMediaCodecCoexistMaxCnt */
    public static void m102009x7ff91465(int i17) {
        f52470xb61829f0 = i17;
    }

    /* renamed from: setVideoMediaCodecStuckCheckEnable */
    public static void m102010x7d1f1c3a(java.lang.Boolean bool) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "setVideoMediaCodecStuckCheckEnable, enable:" + bool);
        f52471xa86b16cf = bool.booleanValue();
    }

    /* renamed from: setWidevineProvisioningServerUrl */
    public static void m102011x4f06d880(java.lang.String str) {
        if (!com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101877x369448e0()) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(3, "setWidevineProvisioningServerUrl,PlayerCore library has not been loaded");
            return;
        }
        f52472xdcca7455 = str;
        try {
            m102002x2159cdf(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.toString());
        }
    }
}

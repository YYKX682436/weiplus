package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.videobase.SystemDisplayInfo */
/* loaded from: classes14.dex */
public class C3827xa4fd52c1 {
    private static final java.lang.String TAG = "SystemDisplayInfo";

    /* renamed from: getDefaultDisplayByWindowManager */
    private static android.view.Display m31232xf47c3d4f() {
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        if (m29240x6e669035 == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "context is null.");
            return null;
        }
        try {
            return ((android.view.WindowManager) m29240x6e669035.getSystemService("window")).getDefaultDisplay();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "error getting display from window service.", th6);
            return null;
        }
    }

    /* renamed from: getDisplay */
    public static android.view.Display m31233xa172548c() {
        if (m31240x5015c927() == 0) {
            android.view.Display m31234x4e5c856e = m31234x4e5c856e();
            return m31234x4e5c856e != null ? m31234x4e5c856e : m31232xf47c3d4f();
        }
        android.view.Display m31232xf47c3d4f = m31232xf47c3d4f();
        return m31232xf47c3d4f != null ? m31232xf47c3d4f : m31234x4e5c856e();
    }

    /* renamed from: getDisplayByDisplayManager */
    private static android.view.Display m31234x4e5c856e() {
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 32) {
            return null;
        }
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        if (m29240x6e669035 == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "context is null.");
            return null;
        }
        try {
            return ((android.hardware.display.DisplayManager) m29240x6e669035.getSystemService("display")).getDisplay(0);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "error getting display from display service.", th6);
            return null;
        }
    }

    /* renamed from: getDisplayRotation */
    public static com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31235x9abe7c2a() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31236xb50ccb28 = m31236xb50ccb28();
        if (m31236xb50ccb28 != null) {
            return m31236xb50ccb28;
        }
        try {
            android.view.Display m31233xa172548c = m31233xa172548c();
            if (m31233xa172548c != null) {
                return m31241x6dcccb25(m31233xa172548c.getRotation());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "error getting display rotation.", e17);
        }
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL;
    }

    /* renamed from: getDisplayRotationCorrection */
    private static com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31236xb50ccb28() {
        int m31239x72c3b6df = m31239x72c3b6df();
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.b(m31239x72c3b6df)) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(m31239x72c3b6df);
        }
        return null;
    }

    /* renamed from: getDisplayRotationDegree */
    public static int m31237xc0808f96() {
        return m31235x9abe7c2a().f14773xbee9dd04;
    }

    /* renamed from: getDisplaySize */
    public static com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 m31238x400482ad() {
        try {
            android.view.Display m31233xa172548c = m31233xa172548c();
            if (m31233xa172548c != null) {
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                m31233xa172548c.getRealMetrics(displayMetrics);
                return new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "error getting display size.", e17);
        }
        return new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1280);
    }

    /* renamed from: nativeGetDisplayRotationCorrection */
    private static native synchronized int m31239x72c3b6df();

    /* renamed from: nativeGetDisplayRotationObtainMethod */
    private static native synchronized int m31240x5015c927();

    /* renamed from: surfaceRotationEnumToRotation */
    private static com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31241x6dcccb25(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270 : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_180 : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90;
    }
}

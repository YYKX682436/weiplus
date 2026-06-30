package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.common.HDRCapability */
/* loaded from: classes13.dex */
public class C3812x1967048e {
    private static final java.lang.String TAG = "HDRCapability";

    /* renamed from: sIsHDR10Supported */
    private static java.lang.Boolean f14906x85c82f6;

    /* renamed from: sSequenceTaskRunner */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l f14907x943b0589 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkIsHDR10Supported */
    public static void m30981xa4969d8b() {
        synchronized (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3812x1967048e.class) {
            if (f14906x85c82f6 != null) {
                return;
            }
            try {
                boolean m30984x4b91e95e = m30984x4b91e95e();
                boolean m30983x802149e0 = m30983x802149e0();
                synchronized (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3812x1967048e.class) {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(m30984x4b91e95e && m30983x802149e0);
                    f14906x85c82f6 = valueOf;
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "the device supports hdr10 %b", valueOf);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "check hdr capability error ", th6);
            }
        }
    }

    /* renamed from: hasHDR10ProfileLevel */
    private static boolean m30982xfd550416(android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == 4096) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isDecoderSupportHDR10 */
    private static boolean m30983x802149e0() {
        for (android.media.MediaCodecInfo mediaCodecInfo : new android.media.MediaCodecList(0).getCodecInfos()) {
            for (java.lang.String str : mediaCodecInfo.getSupportedTypes()) {
                if (str.contains("video/hevc") && m30982xfd550416(mediaCodecInfo.getCapabilitiesForType("video/hevc").profileLevels)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: isDisplaySupportHDR10 */
    private static boolean m30984x4b91e95e() {
        android.view.WindowManager windowManager;
        android.view.Display.HdrCapabilities hdrCapabilities;
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        if (m29240x6e669035 == null || (windowManager = (android.view.WindowManager) m29240x6e669035.getSystemService("window")) == null || (hdrCapabilities = windowManager.getDefaultDisplay().getHdrCapabilities()) == null) {
            return false;
        }
        for (int i17 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i17 == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isHDRSupported */
    public static synchronized boolean m30985x3553cca2(int i17) {
        synchronized (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3812x1967048e.class) {
            if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 24) {
                return false;
            }
            if (i17 != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.b.HDR10.f14908xbee9dd04) {
                return false;
            }
            java.lang.Boolean bool = f14906x85c82f6;
            if (bool != null) {
                return bool.booleanValue();
            }
            f14907x943b0589.a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.a.a());
            return false;
        }
    }
}

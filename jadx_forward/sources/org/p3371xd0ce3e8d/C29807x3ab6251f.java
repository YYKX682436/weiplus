package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.MediaCodecUtils */
/* loaded from: classes16.dex */
class C29807x3ab6251f {

    /* renamed from: EXYNOS_PREFIX */
    static final java.lang.String f75539xbdfba745 = "OMX.Exynos.";

    /* renamed from: INTEL_PREFIX */
    static final java.lang.String f75540xb3529e3b = "OMX.Intel.";

    /* renamed from: NVIDIA_PREFIX */
    static final java.lang.String f75541x709a3e16 = "OMX.Nvidia.";

    /* renamed from: QCOM_PREFIX */
    static final java.lang.String f75542x3a058e41 = "OMX.qcom.";
    private static final java.lang.String TAG = "MediaCodecUtils";

    /* renamed from: SOFTWARE_IMPLEMENTATION_PREFIXES */
    static final java.lang.String[] f75543x66210e15 = {"OMX.google.", "OMX.SEC.", "c2.android"};

    /* renamed from: COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka */
    static final int f75535x1d12f880 = 2141391873;

    /* renamed from: COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka */
    static final int f75534x19e1a546 = 2141391874;

    /* renamed from: COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka */
    static final int f75536x4b245890 = 2141391875;

    /* renamed from: COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m */
    static final int f75533xfc21d62c = 2141391876;

    /* renamed from: DECODER_COLOR_FORMATS */
    static final int[] f75537x86737965 = {19, 21, 2141391872, f75535x1d12f880, f75534x19e1a546, f75536x4b245890, f75533xfc21d62c};

    /* renamed from: ENCODER_COLOR_FORMATS */
    static final int[] f75538xb7bcf83d = {19, 21, 2141391872, f75533xfc21d62c};

    /* renamed from: TEXTURE_COLOR_FORMATS */
    static final int[] f75544x4561ddfc = m155692x44d51ffe();

    /* renamed from: org.webrtc.MediaCodecUtils$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$org$webrtc$VideoCodecMimeType */
        static final /* synthetic */ int[] f75545x80263600;

        static {
            int[] iArr = new int[org.p3371xd0ce3e8d.EnumC29887xf25c2329.m156502xcee59d22().length];
            f75545x80263600 = iArr;
            try {
                iArr[org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP8.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f75545x80263600[org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP9.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f75545x80263600[org.p3371xd0ce3e8d.EnumC29887xf25c2329.AV1.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f75545x80263600[org.p3371xd0ce3e8d.EnumC29887xf25c2329.H264.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private C29807x3ab6251f() {
    }

    /* renamed from: codecSupportsType */
    public static boolean m155690x21998f14(android.media.MediaCodecInfo mediaCodecInfo, org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329) {
        for (java.lang.String str : mediaCodecInfo.getSupportedTypes()) {
            if (enumC29887xf25c2329.m156503xad05ed8e().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getCodecProperties */
    public static java.util.Map<java.lang.String, java.lang.String> m155691x9bbba7b3(org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329, boolean z17) {
        int i17 = org.p3371xd0ce3e8d.C29807x3ab6251f.AnonymousClass1.f75545x80263600[enumC29887xf25c2329.ordinal()];
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            return new java.util.HashMap();
        }
        if (i17 == 4) {
            return org.p3371xd0ce3e8d.C29785x836a9c69.m155565xcf5f2519(z17);
        }
        throw new java.lang.IllegalArgumentException("Unsupported codec: " + enumC29887xf25c2329);
    }

    /* renamed from: getTextureColorFormats */
    private static int[] m155692x44d51ffe() {
        return new int[]{com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48031x5e80f9d5};
    }

    /* renamed from: isHardwareAccelerated */
    public static boolean m155693xca6d2895(android.media.MediaCodecInfo mediaCodecInfo) {
        return android.os.Build.VERSION.SDK_INT >= 29 ? m155694x501e000e(mediaCodecInfo) : !m155695x7800bc3d(mediaCodecInfo);
    }

    /* renamed from: isHardwareAcceleratedQOrHigher */
    private static boolean m155694x501e000e(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    /* renamed from: isSoftwareOnly */
    public static boolean m155695x7800bc3d(android.media.MediaCodecInfo mediaCodecInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return m155696xb4120966(mediaCodecInfo);
        }
        java.lang.String name = mediaCodecInfo.getName();
        for (java.lang.String str : f75543x66210e15) {
            if (name.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isSoftwareOnlyQOrHigher */
    private static boolean m155696xb4120966(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    /* renamed from: selectColorFormat */
    public static java.lang.Integer m155697x80967a9e(int[] iArr, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (int i17 : iArr) {
            for (int i18 : codecCapabilities.colorFormats) {
                if (i18 == i17) {
                    return java.lang.Integer.valueOf(i18);
                }
            }
        }
        return null;
    }
}

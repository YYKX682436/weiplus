package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.HardwareVideoEncoderFactory */
/* loaded from: classes16.dex */
public class C29789xf91b6a81 implements org.p3371xd0ce3e8d.InterfaceC29895x64274189 {

    /* renamed from: H264_HW_EXCEPTION_MODELS */
    private static final java.util.List<java.lang.String> f75481x69a05813 = java.util.Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");

    /* renamed from: QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS */
    private static final int f75482x7f16ff61 = 15000;

    /* renamed from: QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS */
    private static final int f75483x7f1773c0 = 20000;

    /* renamed from: QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS */
    private static final int f75484x7f17e81f = 15000;
    private static final java.lang.String TAG = "HardwareVideoEncoderFactory";

    /* renamed from: codecAllowedPredicate */
    private final org.p3371xd0ce3e8d.InterfaceC29840x2718c997<android.media.MediaCodecInfo> f75485x2cb28d25;

    /* renamed from: enableH264HighProfile */
    private final boolean f75486x347caf7c;

    /* renamed from: enableIntelVp8Encoder */
    private final boolean f75487xf897cbf1;

    /* renamed from: sharedContext */
    private final org.p3371xd0ce3e8d.InterfaceC29762x8958813e.Context f75488x2748558a;

    /* renamed from: org.webrtc.HardwareVideoEncoderFactory$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$org$webrtc$VideoCodecMimeType */
        static final /* synthetic */ int[] f75489x80263600;

        static {
            int[] iArr = new int[org.p3371xd0ce3e8d.EnumC29887xf25c2329.m156502xcee59d22().length];
            f75489x80263600 = iArr;
            try {
                iArr[org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP8.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f75489x80263600[org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP9.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f75489x80263600[org.p3371xd0ce3e8d.EnumC29887xf25c2329.H264.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f75489x80263600[org.p3371xd0ce3e8d.EnumC29887xf25c2329.AV1.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public C29789xf91b6a81(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, boolean z17, boolean z18) {
        this(context, z17, z18, null);
    }

    /* renamed from: createBitrateAdjuster */
    private org.p3371xd0ce3e8d.InterfaceC29729xaf9676e9 m155601xdfd33e6d(org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329, java.lang.String str) {
        return str.startsWith("OMX.Exynos.") ? enumC29887xf25c2329 == org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP8 ? new org.p3371xd0ce3e8d.C29758xd7b35cea() : new org.p3371xd0ce3e8d.C29779xf76aef9c() : new org.p3371xd0ce3e8d.C29728x6ba59bd8();
    }

    /* renamed from: findCodecForType */
    private android.media.MediaCodecInfo m155602xd8d0e306(org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329) {
        int i17 = 0;
        while (true) {
            android.media.MediaCodecInfo mediaCodecInfo = null;
            if (i17 >= android.media.MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                mediaCodecInfo = android.media.MediaCodecList.getCodecInfoAt(i17);
            } catch (java.lang.IllegalArgumentException e17) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Cannot retrieve encoder codec info", e17);
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && m155611x32ad8fd2(mediaCodecInfo, enumC29887xf25c2329)) {
                return mediaCodecInfo;
            }
            i17++;
        }
    }

    /* renamed from: getForcedKeyFrameIntervalMs */
    private int m155603xefae5e68(org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329, java.lang.String str) {
        return (enumC29887xf25c2329 == org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP8 && str.startsWith("OMX.qcom.")) ? 15000 : 0;
    }

    /* renamed from: getKeyFrameIntervalSec */
    private int m155604xceca56e8(org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329) {
        int i17 = org.p3371xd0ce3e8d.C29789xf91b6a81.AnonymousClass1.f75489x80263600[enumC29887xf25c2329.ordinal()];
        if (i17 == 1 || i17 == 2) {
            return 100;
        }
        if (i17 == 3) {
            return 20;
        }
        if (i17 == 4) {
            return 100;
        }
        throw new java.lang.IllegalArgumentException("Unsupported VideoCodecMimeType " + enumC29887xf25c2329);
    }

    /* renamed from: isH264HighProfileSupported */
    private boolean m155605x15971339(android.media.MediaCodecInfo mediaCodecInfo) {
        return this.f75486x347caf7c && mediaCodecInfo.getName().startsWith("OMX.Exynos.");
    }

    /* renamed from: isHardwareSupportedInCurrentSdk */
    private boolean m155606xc412d0c2(android.media.MediaCodecInfo mediaCodecInfo, org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329) {
        int i17 = org.p3371xd0ce3e8d.C29789xf91b6a81.AnonymousClass1.f75489x80263600[enumC29887xf25c2329.ordinal()];
        if (i17 == 1) {
            return m155608x4994b09c(mediaCodecInfo);
        }
        if (i17 == 2) {
            return m155609x4994b09d(mediaCodecInfo);
        }
        if (i17 != 3) {
            return false;
        }
        return m155607xe8fa1cea(mediaCodecInfo);
    }

    /* renamed from: isHardwareSupportedInCurrentSdkH264 */
    private boolean m155607xe8fa1cea(android.media.MediaCodecInfo mediaCodecInfo) {
        if (f75481x69a05813.contains(android.os.Build.MODEL)) {
            return false;
        }
        java.lang.String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
    }

    /* renamed from: isHardwareSupportedInCurrentSdkVp8 */
    private boolean m155608x4994b09c(android.media.MediaCodecInfo mediaCodecInfo) {
        java.lang.String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.") || (name.startsWith("OMX.Intel.") && this.f75487xf897cbf1);
    }

    /* renamed from: isHardwareSupportedInCurrentSdkVp9 */
    private boolean m155609x4994b09d(android.media.MediaCodecInfo mediaCodecInfo) {
        java.lang.String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
    }

    /* renamed from: isMediaCodecAllowed */
    private boolean m155610xdeb45eac(android.media.MediaCodecInfo mediaCodecInfo) {
        org.p3371xd0ce3e8d.InterfaceC29840x2718c997<android.media.MediaCodecInfo> interfaceC29840x2718c997 = this.f75485x2cb28d25;
        if (interfaceC29840x2718c997 == null) {
            return true;
        }
        return interfaceC29840x2718c997.mo155569x364492(mediaCodecInfo);
    }

    /* renamed from: isSupportedCodec */
    private boolean m155611x32ad8fd2(android.media.MediaCodecInfo mediaCodecInfo, org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329) {
        return org.p3371xd0ce3e8d.C29807x3ab6251f.m155690x21998f14(mediaCodecInfo, enumC29887xf25c2329) && org.p3371xd0ce3e8d.C29807x3ab6251f.m155697x80967a9e(org.p3371xd0ce3e8d.C29807x3ab6251f.f75538xb7bcf83d, mediaCodecInfo.getCapabilitiesForType(enumC29887xf25c2329.m156503xad05ed8e())) != null && m155606xc412d0c2(mediaCodecInfo, enumC29887xf25c2329) && m155610xdeb45eac(mediaCodecInfo);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29895x64274189
    /* renamed from: createEncoder */
    public org.p3371xd0ce3e8d.InterfaceC29894xa1376c41 mo155392x2618a880(org.p3371xd0ce3e8d.C29886x94209fc9 c29886x94209fc9) {
        org.p3371xd0ce3e8d.EnumC29887xf25c2329 m156500x1d43fb0c = org.p3371xd0ce3e8d.EnumC29887xf25c2329.m156500x1d43fb0c(c29886x94209fc9.m156495xfb82e301());
        android.media.MediaCodecInfo m155602xd8d0e306 = m155602xd8d0e306(m156500x1d43fb0c);
        if (m155602xd8d0e306 == null) {
            return null;
        }
        java.lang.String name = m155602xd8d0e306.getName();
        java.lang.String m156503xad05ed8e = m156500x1d43fb0c.m156503xad05ed8e();
        java.lang.Integer m155697x80967a9e = org.p3371xd0ce3e8d.C29807x3ab6251f.m155697x80967a9e(org.p3371xd0ce3e8d.C29807x3ab6251f.f75544x4561ddfc, m155602xd8d0e306.getCapabilitiesForType(m156503xad05ed8e));
        java.lang.Integer m155697x80967a9e2 = org.p3371xd0ce3e8d.C29807x3ab6251f.m155697x80967a9e(org.p3371xd0ce3e8d.C29807x3ab6251f.f75538xb7bcf83d, m155602xd8d0e306.getCapabilitiesForType(m156503xad05ed8e));
        if (m156500x1d43fb0c == org.p3371xd0ce3e8d.EnumC29887xf25c2329.H264) {
            boolean m155566xffdd9cb1 = org.p3371xd0ce3e8d.C29785x836a9c69.m155566xffdd9cb1(c29886x94209fc9.f76047xc4aaf986, org.p3371xd0ce3e8d.C29807x3ab6251f.m155691x9bbba7b3(m156500x1d43fb0c, true));
            boolean m155566xffdd9cb12 = org.p3371xd0ce3e8d.C29785x836a9c69.m155566xffdd9cb1(c29886x94209fc9.f76047xc4aaf986, org.p3371xd0ce3e8d.C29807x3ab6251f.m155691x9bbba7b3(m156500x1d43fb0c, false));
            if (!m155566xffdd9cb1 && !m155566xffdd9cb12) {
                return null;
            }
            if (m155566xffdd9cb1 && !m155605x15971339(m155602xd8d0e306)) {
                return null;
            }
        }
        return new org.p3371xd0ce3e8d.C29787x5502ea49(new org.p3371xd0ce3e8d.C29811x50f01a09(), name, m156500x1d43fb0c, m155697x80967a9e, m155697x80967a9e2, c29886x94209fc9.f76047xc4aaf986, m155604xceca56e8(m156500x1d43fb0c), m155603xefae5e68(m156500x1d43fb0c, name), m155601xdfd33e6d(m156500x1d43fb0c, name), this.f75488x2748558a);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29895x64274189
    /* renamed from: getSupportedCodecs */
    public org.p3371xd0ce3e8d.C29886x94209fc9[] mo155393xd8a0cb35() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.p3371xd0ce3e8d.EnumC29887xf25c2329[] enumC29887xf25c2329Arr = {org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP8, org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP9, org.p3371xd0ce3e8d.EnumC29887xf25c2329.H264, org.p3371xd0ce3e8d.EnumC29887xf25c2329.AV1};
        for (int i17 = 0; i17 < 4; i17++) {
            org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329 = enumC29887xf25c2329Arr[i17];
            android.media.MediaCodecInfo m155602xd8d0e306 = m155602xd8d0e306(enumC29887xf25c2329);
            if (m155602xd8d0e306 != null) {
                java.lang.String m156504x7fcb405d = enumC29887xf25c2329.m156504x7fcb405d();
                if (enumC29887xf25c2329 == org.p3371xd0ce3e8d.EnumC29887xf25c2329.H264 && m155605x15971339(m155602xd8d0e306)) {
                    arrayList.add(new org.p3371xd0ce3e8d.C29886x94209fc9(m156504x7fcb405d, org.p3371xd0ce3e8d.C29807x3ab6251f.m155691x9bbba7b3(enumC29887xf25c2329, true)));
                }
                arrayList.add(new org.p3371xd0ce3e8d.C29886x94209fc9(m156504x7fcb405d, org.p3371xd0ce3e8d.C29807x3ab6251f.m155691x9bbba7b3(enumC29887xf25c2329, false)));
            }
        }
        return (org.p3371xd0ce3e8d.C29886x94209fc9[]) arrayList.toArray(new org.p3371xd0ce3e8d.C29886x94209fc9[arrayList.size()]);
    }

    public C29789xf91b6a81(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, boolean z17, boolean z18, org.p3371xd0ce3e8d.InterfaceC29840x2718c997<android.media.MediaCodecInfo> interfaceC29840x2718c997) {
        if (context instanceof org.p3371xd0ce3e8d.InterfaceC29762x8958813e.Context) {
            this.f75488x2748558a = (org.p3371xd0ce3e8d.InterfaceC29762x8958813e.Context) context;
        } else {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "No shared EglBase.Context.  Encoders will not use texture mode.");
            this.f75488x2748558a = null;
        }
        this.f75487xf897cbf1 = z17;
        this.f75486x347caf7c = z18;
        this.f75485x2cb28d25 = interfaceC29840x2718c997;
    }

    @java.lang.Deprecated
    public C29789xf91b6a81(boolean z17, boolean z18) {
        this(null, z17, z18);
    }
}

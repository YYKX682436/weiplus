package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer.capture.CameraControllerInterface */
/* loaded from: classes14.dex */
public abstract class AbstractC3838xfae8f978 {

    /* renamed from: CAMERA_ERROR_DEVICE */
    public static final int f15031x9497f767 = 4;

    /* renamed from: CAMERA_ERROR_DISABLED */
    public static final int f15032x9c810f4d = 2;

    /* renamed from: CAMERA_ERROR_OCCUPIED */
    public static final int f15033xbb9b376f = 1;

    /* renamed from: CAMERA_ERROR_SERVER_DIED */
    public static final int f15034x12a7c8ef = 3;

    /* renamed from: CAMERA_ERROR_UNKNOWN */
    public static final int f15035x9073f539 = 0;
    private static final java.lang.String TAG = "CameraControllerInterface";

    /* renamed from: com.tencent.liteav.videoproducer.capture.CameraControllerInterface$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128526a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978.a.m31381xcee59d22().length];
            f128526a = iArr;
            try {
                iArr[com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978.a.CAMERA_2.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f128526a[com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978.a.CAMERA_1.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.CameraControllerInterface$a */
    /* loaded from: classes14.dex */
    public enum a {
        MOCK(0),
        CAMERA_1(1),
        CAMERA_2(2);


        /* renamed from: mValue */
        private final int f15036xbee9dd04;

        a(int i17) {
            this.f15036xbee9dd04 = i17;
        }

        public static com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978.a a(int i17) {
            for (com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978.a aVar : m31381xcee59d22()) {
                if (aVar.f15036xbee9dd04 == i17) {
                    return aVar;
                }
            }
            return CAMERA_1;
        }
    }

    /* renamed from: createCameraController */
    public static com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978 m31358xa66085bd(int i17, final android.os.Handler handler) {
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978 aVar;
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978.a a17 = com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978.a.a(i17);
        if (com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978.AnonymousClass1.f128526a[a17.ordinal()] != 1) {
            aVar = new com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.a.a();
        } else {
            handler.getClass();
            aVar = new com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a(new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.s(handler) { // from class: com.tencent.liteav.videoproducer.capture.a

                /* renamed from: a, reason: collision with root package name */
                private final android.os.Handler f128549a;

                {
                    this.f128549a = handler;
                }

                @Override // com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.s
                public final void a(java.lang.Runnable runnable) {
                    this.f128549a.post(runnable);
                }
            });
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "createCameraController, CameraAPIType:" + a17 + ", return camera controller: " + aVar);
        return aVar;
    }

    /* renamed from: hasCameraPermission */
    public static boolean m31359xcef8dd8e() {
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        return m29240x6e669035 == null || com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 23 || m29240x6e669035.checkPermission("android.permission.CAMERA", android.os.Process.myPid(), android.os.Process.myUid()) == 0;
    }

    /* renamed from: enableCameraFpsCorrectionLogic */
    public abstract void mo31360xae3cf71f(boolean z17);

    /* renamed from: enableTapToFocus */
    public abstract void mo31361x60c0efdd(boolean z17);

    /* renamed from: getCameraSystemRotation */
    public abstract com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k mo31362x99ffadc8();

    /* renamed from: getCameraSystemRotationValue */
    public abstract int mo31363x5df75089();

    /* renamed from: getMaxZoom */
    public abstract int mo31364x70202721();

    /* renamed from: getPreviewSize */
    public abstract com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 mo31365x8cdf5ab3();

    /* renamed from: isCameraAutoFocusFaceModeSupported */
    public abstract boolean mo31366x8a09f1d4();

    /* renamed from: isCameraFocusPositionInPreviewSupported */
    public abstract boolean mo31367x56cf6e1d();

    /* renamed from: isCurrentPreviewSizeAspectRatioMatch */
    public abstract boolean mo31368xcce9f68c(int i17, int i18, boolean z17);

    /* renamed from: isTorchSupported */
    public abstract boolean mo31369x1fa163dc();

    /* renamed from: isZoomSupported */
    public abstract boolean mo31370x8a69c511();

    /* renamed from: setCameraRotationCorrectionValue */
    public abstract void mo31371x5895ab2e(int i17);

    /* renamed from: setExposureCompensation */
    public abstract void mo31372xf5004e83(float f17);

    /* renamed from: setZoom */
    public abstract void mo31373x76535355(float f17);

    /* renamed from: startAutoFocusAtPosition */
    public abstract void mo31374x5248a403(int i17, int i18);

    /* renamed from: startCapture */
    public abstract boolean mo31375x18ec4884(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3837xdcded927 c3837xdcded927, android.graphics.SurfaceTexture surfaceTexture, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.InterfaceC3839xf211f5ba interfaceC3839xf211f5ba);

    /* renamed from: stopCapture */
    public abstract void mo31376xd45bb0e4();

    /* renamed from: turnOnTorch */
    public abstract void mo31377xda01aa20(boolean z17);
}

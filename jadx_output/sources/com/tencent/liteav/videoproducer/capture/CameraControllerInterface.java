package com.tencent.liteav.videoproducer.capture;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public abstract class CameraControllerInterface {
    public static final int CAMERA_ERROR_DEVICE = 4;
    public static final int CAMERA_ERROR_DISABLED = 2;
    public static final int CAMERA_ERROR_OCCUPIED = 1;
    public static final int CAMERA_ERROR_SERVER_DIED = 3;
    public static final int CAMERA_ERROR_UNKNOWN = 0;
    private static final java.lang.String TAG = "CameraControllerInterface";

    /* renamed from: com.tencent.liteav.videoproducer.capture.CameraControllerInterface$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46993a;

        static {
            int[] iArr = new int[com.tencent.liteav.videoproducer.capture.CameraControllerInterface.a.values().length];
            f46993a = iArr;
            try {
                iArr[com.tencent.liteav.videoproducer.capture.CameraControllerInterface.a.CAMERA_2.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f46993a[com.tencent.liteav.videoproducer.capture.CameraControllerInterface.a.CAMERA_1.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes14.dex */
    public enum a {
        MOCK(0),
        CAMERA_1(1),
        CAMERA_2(2);

        private final int mValue;

        a(int i17) {
            this.mValue = i17;
        }

        public static com.tencent.liteav.videoproducer.capture.CameraControllerInterface.a a(int i17) {
            for (com.tencent.liteav.videoproducer.capture.CameraControllerInterface.a aVar : values()) {
                if (aVar.mValue == i17) {
                    return aVar;
                }
            }
            return CAMERA_1;
        }
    }

    public static com.tencent.liteav.videoproducer.capture.CameraControllerInterface createCameraController(int i17, final android.os.Handler handler) {
        com.tencent.liteav.videoproducer.capture.CameraControllerInterface aVar;
        com.tencent.liteav.videoproducer.capture.CameraControllerInterface.a a17 = com.tencent.liteav.videoproducer.capture.CameraControllerInterface.a.a(i17);
        if (com.tencent.liteav.videoproducer.capture.CameraControllerInterface.AnonymousClass1.f46993a[a17.ordinal()] != 1) {
            aVar = new com.tencent.liteav.videoproducer.capture.a.a();
        } else {
            handler.getClass();
            aVar = new com.tencent.liteav.videoproducer.capture.b.a(new com.tencent.liteav.base.util.s(handler) { // from class: com.tencent.liteav.videoproducer.capture.a

                /* renamed from: a, reason: collision with root package name */
                private final android.os.Handler f47016a;

                {
                    this.f47016a = handler;
                }

                @Override // com.tencent.liteav.base.util.s
                public final void a(java.lang.Runnable runnable) {
                    this.f47016a.post(runnable);
                }
            });
        }
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "createCameraController, CameraAPIType:" + a17 + ", return camera controller: " + aVar);
        return aVar;
    }

    public static boolean hasCameraPermission() {
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        return applicationContext == null || com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 23 || applicationContext.checkPermission("android.permission.CAMERA", android.os.Process.myPid(), android.os.Process.myUid()) == 0;
    }

    public abstract void enableCameraFpsCorrectionLogic(boolean z17);

    public abstract void enableTapToFocus(boolean z17);

    public abstract com.tencent.liteav.base.util.k getCameraSystemRotation();

    public abstract int getCameraSystemRotationValue();

    public abstract int getMaxZoom();

    public abstract com.tencent.liteav.base.util.Size getPreviewSize();

    public abstract boolean isCameraAutoFocusFaceModeSupported();

    public abstract boolean isCameraFocusPositionInPreviewSupported();

    public abstract boolean isCurrentPreviewSizeAspectRatioMatch(int i17, int i18, boolean z17);

    public abstract boolean isTorchSupported();

    public abstract boolean isZoomSupported();

    public abstract void setCameraRotationCorrectionValue(int i17);

    public abstract void setExposureCompensation(float f17);

    public abstract void setZoom(float f17);

    public abstract void startAutoFocusAtPosition(int i17, int i18);

    public abstract boolean startCapture(com.tencent.liteav.videoproducer.capture.CameraCaptureParams cameraCaptureParams, android.graphics.SurfaceTexture surfaceTexture, com.tencent.liteav.videoproducer.capture.CameraEventCallback cameraEventCallback);

    public abstract void stopCapture();

    public abstract void turnOnTorch(boolean z17);
}

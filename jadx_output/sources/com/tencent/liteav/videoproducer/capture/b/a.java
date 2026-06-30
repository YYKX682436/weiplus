package com.tencent.liteav.videoproducer.capture.b;

/* loaded from: classes14.dex */
public final class a extends com.tencent.liteav.videoproducer.capture.CameraControllerInterface {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f47036c;
    private com.tencent.liteav.videoproducer.capture.CameraEventCallback A;

    /* renamed from: g, reason: collision with root package name */
    private final com.tencent.liteav.base.util.s f47041g;

    /* renamed from: l, reason: collision with root package name */
    private android.hardware.camera2.CaptureRequest f47046l;

    /* renamed from: m, reason: collision with root package name */
    private android.hardware.camera2.CaptureRequest.Builder f47047m;

    /* renamed from: n, reason: collision with root package name */
    private com.tencent.liteav.base.util.Size f47048n;

    /* renamed from: r, reason: collision with root package name */
    private android.graphics.SurfaceTexture f47052r;

    /* renamed from: y, reason: collision with root package name */
    private java.util.concurrent.CountDownLatch f47059y;

    /* renamed from: z, reason: collision with root package name */
    private java.util.concurrent.CountDownLatch f47060z;

    /* renamed from: b, reason: collision with root package name */
    private static final java.util.HashMap<java.lang.String, android.hardware.camera2.CameraCharacteristics> f47035b = new java.util.HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f47037d = "";

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f47038e = "";

    /* renamed from: f, reason: collision with root package name */
    private final android.os.Handler f47040f = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f47042h = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference<android.hardware.camera2.CameraDevice> f47043i = new java.util.concurrent.atomic.AtomicReference<>();

    /* renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f47044j = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference<android.hardware.camera2.CameraCaptureSession> f47045k = new java.util.concurrent.atomic.AtomicReference<>();

    /* renamed from: o, reason: collision with root package name */
    private com.tencent.liteav.base.util.k f47049o = com.tencent.liteav.base.util.k.NORMAL;

    /* renamed from: p, reason: collision with root package name */
    private com.tencent.liteav.base.util.k f47050p = null;

    /* renamed from: q, reason: collision with root package name */
    private boolean f47051q = true;

    /* renamed from: s, reason: collision with root package name */
    private boolean f47053s = true;

    /* renamed from: t, reason: collision with root package name */
    private boolean f47054t = true;

    /* renamed from: u, reason: collision with root package name */
    private boolean f47055u = true;

    /* renamed from: v, reason: collision with root package name */
    private int f47056v = -1;

    /* renamed from: w, reason: collision with root package name */
    private com.tencent.liteav.videoproducer.capture.b.a.EnumC0013a f47057w = com.tencent.liteav.videoproducer.capture.b.a.EnumC0013a.IDLE;

    /* renamed from: x, reason: collision with root package name */
    private boolean f47058x = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f47039a = false;
    private float B = 0.0f;
    private float C = 0.0f;
    private final android.hardware.camera2.CameraDevice.StateCallback D = new android.hardware.camera2.CameraDevice.StateCallback() { // from class: com.tencent.liteav.videoproducer.capture.b.a.1
        private void a(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            if (com.tencent.liteav.videoproducer.capture.b.a.this.f47042h.get()) {
                com.tencent.liteav.videoproducer.capture.b.a.b(com.tencent.liteav.videoproducer.capture.b.a.this, i17);
            } else {
                com.tencent.liteav.videoproducer.capture.b.a.this.a(false, cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
            com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "CameraDevice onClosed!" + a(cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
            com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "CameraDevice onDisconnected!" + a(cameraDevice));
            a(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "CameraDevice onError!" + a(cameraDevice) + ", error:" + i17);
            int i18 = 3;
            if (i17 == 3) {
                i18 = 2;
            } else if (i17 == 1) {
                i18 = 1;
            } else if (i17 != 5) {
                i18 = 4;
                if (i17 != 4) {
                    i18 = 0;
                }
            }
            a(cameraDevice, i18);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
            com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "CameraDevice onOpen!" + a(cameraDevice));
            com.tencent.liteav.videoproducer.capture.b.a.this.a(true, cameraDevice);
        }

        private static java.lang.String a(android.hardware.camera2.CameraDevice cameraDevice) {
            if (cameraDevice == null) {
                return "null";
            }
            return "CameraDevice[id:" + cameraDevice.getId() + "]";
        }
    };
    private final android.hardware.camera2.CameraCaptureSession.StateCallback E = new android.hardware.camera2.CameraCaptureSession.StateCallback() { // from class: com.tencent.liteav.videoproducer.capture.b.a.2
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "CameraCaptureSession onConfigureFailed!");
            com.tencent.liteav.videoproducer.capture.b.a.this.a(false, cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "CameraCaptureSession onConfigured!");
            com.tencent.liteav.videoproducer.capture.b.a.this.a(true, cameraCaptureSession);
        }
    };
    private final android.hardware.camera2.CameraManager.AvailabilityCallback F = new android.hardware.camera2.CameraManager.AvailabilityCallback() { // from class: com.tencent.liteav.videoproducer.capture.b.a.3
        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            super.onCameraAccessPrioritiesChanged();
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(java.lang.String str) {
            super.onCameraAvailable(str);
            com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "onCameraAvailable: ".concat(java.lang.String.valueOf(str)));
            if (!com.tencent.liteav.videoproducer.capture.b.a.this.f() && com.tencent.liteav.videoproducer.capture.b.a.b(com.tencent.liteav.videoproducer.capture.b.a.this.f47053s).equals(str) && com.tencent.liteav.videoproducer.capture.b.a.this.f47042h.get()) {
                com.tencent.liteav.base.util.LiteavLog.w("Camera2Controller", "Current camera is available, it could be interrupted by system app.");
                com.tencent.liteav.videoproducer.capture.b.a aVar = com.tencent.liteav.videoproducer.capture.b.a.this;
                aVar.a(false, (android.hardware.camera2.CameraDevice) aVar.f47043i.get());
                com.tencent.liteav.videoproducer.capture.b.a.b(com.tencent.liteav.videoproducer.capture.b.a.this, 1);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(java.lang.String str) {
            super.onCameraUnavailable(str);
            com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "onCameraUnavailable: ".concat(java.lang.String.valueOf(str)));
        }
    };
    private final android.hardware.camera2.CameraCaptureSession.CaptureCallback G = new com.tencent.liteav.videoproducer.capture.b.a.AnonymousClass4();

    /* renamed from: com.tencent.liteav.videoproducer.capture.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public enum EnumC0013a {
        IDLE,
        PREVIEWING
    }

    public a(com.tencent.liteav.base.util.s sVar) {
        this.f47041g = sVar;
    }

    public static /* synthetic */ boolean e(com.tencent.liteav.videoproducer.capture.b.a aVar) {
        aVar.f47058x = false;
        return false;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableCameraFpsCorrectionLogic(boolean z17) {
        this.f47051q = z17;
        com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "set enable camera fps correction logic value is: ".concat(java.lang.String.valueOf(z17)));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableTapToFocus(boolean z17) {
        this.f47054t = z17;
        if (this.f47058x) {
            return;
        }
        c(z17);
        d();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final com.tencent.liteav.base.util.k getCameraSystemRotation() {
        return this.f47049o;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getCameraSystemRotationValue() {
        return this.f47049o.mValue;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getMaxZoom() {
        return 100;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final com.tencent.liteav.base.util.Size getPreviewSize() {
        return this.f47048n;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraAutoFocusFaceModeSupported() {
        return a() != null && ((java.lang.Integer) a().get(android.hardware.camera2.CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue() > 0;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraFocusPositionInPreviewSupported() {
        return a() != null && ((java.lang.Integer) a().get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCurrentPreviewSizeAspectRatioMatch(int i17, int i18, boolean z17) {
        com.tencent.liteav.base.util.k kVar = this.f47050p;
        if (kVar == null) {
            kVar = this.f47049o;
        }
        com.tencent.liteav.base.util.Size a17 = com.tencent.liteav.videoproducer.capture.b.a(e(), kVar, i17, i18);
        boolean z18 = (!z17 || java.lang.Math.abs(a17.aspectRatio() - this.f47048n.aspectRatio()) <= 0.001d) ? a17.getArea() <= this.f47048n.getArea() : false;
        com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "isCurrentPreviewSizeAspectRatioMatch:".concat(java.lang.String.valueOf(z18)));
        return z18;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isTorchSupported() {
        return a() != null && ((java.lang.Boolean) a().get(android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isZoomSupported() {
        return a() != null && ((java.lang.Float) a().get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue() > 0.0f;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setCameraRotationCorrectionValue(int i17) {
        this.f47050p = com.tencent.liteav.base.util.k.b(i17) ? com.tencent.liteav.base.util.k.a(i17) : null;
        com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "camera rotation correction is " + this.f47050p);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setExposureCompensation(float f17) {
        this.B = f17;
        b(f17);
        d();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setZoom(float f17) {
        this.C = f17;
        a(f17);
        d();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void startAutoFocusAtPosition(int i17, int i18) {
        double d17;
        double d18;
        if (this.f47054t && this.f47055u) {
            if (f() || this.f47058x) {
                com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "autoFocus not preview, mCameraStatus:" + this.f47057w + " mIsAutoFocusing:" + this.f47058x);
                return;
            }
            android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.f47045k.get();
            if (cameraCaptureSession == null) {
                com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "CameraCaptureSession get fail");
                return;
            }
            if (i17 >= 0) {
                com.tencent.liteav.base.util.Size size = this.f47048n;
                if (i17 < size.width && i18 >= 0 && i18 < size.height) {
                    com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "Start auto focus at (%d, %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    double d19 = i17;
                    double d27 = i18;
                    android.graphics.Rect rect = (android.graphics.Rect) this.f47046l.get(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION);
                    if (rect == null) {
                        com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "getMeteringRect can't get crop region");
                        rect = (android.graphics.Rect) a().get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    }
                    int width = rect.width();
                    int height = rect.height();
                    com.tencent.liteav.base.util.Size size2 = this.f47048n;
                    int i19 = size2.height;
                    int i27 = i19 * width;
                    int i28 = size2.width;
                    double d28 = 0.0d;
                    if (i27 > i28 * height) {
                        d17 = (height * 1.0d) / i19;
                        d18 = 0.0d;
                        d28 = (width - (i28 * d17)) / 2.0d;
                    } else {
                        d17 = (width * 1.0d) / i28;
                        d18 = (height - (i19 * d17)) / 2.0d;
                    }
                    double d29 = (d19 * d17) + d28 + rect.left;
                    double d37 = (d27 * d17) + d18 + rect.top;
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    rect2.left = com.tencent.liteav.base.util.g.a((int) (d29 - (rect.width() * 0.05d)), 0, rect.width());
                    rect2.right = com.tencent.liteav.base.util.g.a((int) (d29 + (rect.width() * 0.05d)), 0, rect.width());
                    rect2.top = com.tencent.liteav.base.util.g.a((int) (d37 - (rect.height() * 0.05d)), 0, rect.height());
                    rect2.bottom = com.tencent.liteav.base.util.g.a((int) (d37 + (rect.height() * 0.05d)), 0, rect.height());
                    try {
                        this.f47047m.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS, new android.hardware.camera2.params.MeteringRectangle[]{new android.hardware.camera2.params.MeteringRectangle(rect2, 1000)});
                        this.f47047m.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS, new android.hardware.camera2.params.MeteringRectangle[]{new android.hardware.camera2.params.MeteringRectangle(rect2, 1000)});
                        this.f47047m.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 1);
                        this.f47047m.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.f47047m.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                        this.f47058x = true;
                        this.f47039a = false;
                        this.f47047m.setTag(this);
                        cameraCaptureSession.setRepeatingRequest(this.f47047m.build(), this.G, this.f47040f);
                        return;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "startAutoFocusAtPosition exception:".concat(java.lang.String.valueOf(th6)));
                        return;
                    }
                }
            }
            com.tencent.liteav.base.util.LiteavLog.w("Camera2Controller", "Start auto focus at (%d, %d) invalid ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean startCapture(com.tencent.liteav.videoproducer.capture.CameraCaptureParams r13, android.graphics.SurfaceTexture r14, com.tencent.liteav.videoproducer.capture.CameraEventCallback r15) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.capture.b.a.startCapture(com.tencent.liteav.videoproducer.capture.CameraCaptureParams, android.graphics.SurfaceTexture, com.tencent.liteav.videoproducer.capture.CameraEventCallback):boolean");
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void stopCapture() {
        java.util.concurrent.CountDownLatch countDownLatch = this.f47059y;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        this.f47059y = null;
        java.util.concurrent.CountDownLatch countDownLatch2 = this.f47060z;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
        this.f47060z = null;
        b();
        c();
        this.f47046l = null;
        this.f47039a = false;
        this.f47042h.set(false);
        this.f47052r = null;
        this.f47056v = -1;
        this.f47057w = com.tencent.liteav.videoproducer.capture.b.a.EnumC0013a.IDLE;
        com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "stopCapture success");
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void turnOnTorch(boolean z17) {
        if (f()) {
            com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "turnOnTorch error mCameraStatus:" + this.f47057w);
            return;
        }
        boolean z18 = true;
        if (z17 && this.f47056v != 2) {
            this.f47056v = 2;
        } else if (z17) {
            z18 = false;
        } else {
            this.f47056v = 0;
        }
        com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "turnOnTorch:" + z17 + ", mode:" + this.f47056v + ", updateView:" + z18);
        if (z18) {
            this.f47047m.set(android.hardware.camera2.CaptureRequest.FLASH_MODE, java.lang.Integer.valueOf(this.f47056v));
            d();
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.b.a$4, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass4 extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        public AnonymousClass4() {
        }

        private static boolean a(android.hardware.camera2.CaptureRequest captureRequest) {
            return (captureRequest.getTag() instanceof com.tencent.liteav.videoproducer.capture.b.a) && !((com.tencent.liteav.videoproducer.capture.b.a) captureRequest.getTag()).f47039a;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            com.tencent.liteav.videoproducer.capture.b.a.this.f47041g.a(com.tencent.liteav.videoproducer.capture.b.c.a(this, totalCaptureResult, captureRequest));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
            com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "onCaptureFailed failure reason:" + captureFailure.getReason());
            com.tencent.liteav.videoproducer.capture.b.a.this.f47041g.a(com.tencent.liteav.videoproducer.capture.b.d.a(this, captureRequest));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureResult captureResult) {
        }

        private void a(android.hardware.camera2.CaptureRequest captureRequest, boolean z17) {
            if (com.tencent.liteav.videoproducer.capture.b.a.this.f()) {
                return;
            }
            com.tencent.liteav.videoproducer.capture.b.a.e(com.tencent.liteav.videoproducer.capture.b.a.this);
            try {
                com.tencent.liteav.videoproducer.capture.b.a.this.f47047m.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 2);
                com.tencent.liteav.videoproducer.capture.b.a.this.f47047m.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, 1);
                com.tencent.liteav.videoproducer.capture.b.a.this.f47047m.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 3);
                com.tencent.liteav.videoproducer.capture.b.a.this.d();
                if (captureRequest.getTag() instanceof com.tencent.liteav.videoproducer.capture.b.a) {
                    com.tencent.liteav.videoproducer.capture.b.a.a((com.tencent.liteav.videoproducer.capture.b.a) captureRequest.getTag(), z17);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "mAfCaptureCallback exception:".concat(java.lang.String.valueOf(th6)));
            }
        }

        public static /* synthetic */ void a(com.tencent.liteav.videoproducer.capture.b.a.AnonymousClass4 anonymousClass4, android.hardware.camera2.CaptureRequest captureRequest) {
            if (!a(captureRequest)) {
                com.tencent.liteav.videoproducer.capture.b.a.e(com.tencent.liteav.videoproducer.capture.b.a.this);
            } else {
                anonymousClass4.a(captureRequest, false);
            }
        }

        public static /* synthetic */ void a(com.tencent.liteav.videoproducer.capture.b.a.AnonymousClass4 anonymousClass4, android.hardware.camera2.TotalCaptureResult totalCaptureResult, android.hardware.camera2.CaptureRequest captureRequest) {
            if (!a(captureRequest)) {
                com.tencent.liteav.videoproducer.capture.b.a.e(com.tencent.liteav.videoproducer.capture.b.a.this);
                return;
            }
            java.lang.Integer num = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "handleCaptureCompleted get afState fail");
                anonymousClass4.a(captureRequest, false);
            } else if (4 == num.intValue() || 5 == num.intValue()) {
                anonymousClass4.a(captureRequest, true);
            }
        }
    }

    private void b(float f17) {
        float f18;
        int i17;
        if (this.f47047m != null && a() != null) {
            android.util.Range range = (android.util.Range) a().get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
            int intValue = ((java.lang.Integer) range.getLower()).intValue();
            int intValue2 = ((java.lang.Integer) range.getUpper()).intValue();
            if (intValue == 0 && intValue2 == 0) {
                com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "camera doesn't support exposure compensation");
                return;
            }
            float a17 = com.tencent.liteav.base.util.g.a(f17, -1.0f);
            if (a17 == 0.0f) {
                i17 = 0;
            } else {
                if (a17 > 0.0f) {
                    f18 = intValue2;
                } else {
                    a17 = java.lang.Math.abs(a17);
                    f18 = intValue;
                }
                i17 = (int) (a17 * f18);
            }
            this.f47047m.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, java.lang.Integer.valueOf(com.tencent.liteav.base.util.g.a(i17, intValue, intValue2)));
            return;
        }
        com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "setExposureCompensation fail, value:" + f17 + " mCameraStatus:" + this.f47057w);
    }

    private void c() {
        android.hardware.camera2.CameraDevice andSet = this.f47043i.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.close();
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "closeCamera fail, Exception:".concat(java.lang.String.valueOf(th6)));
            }
        }
        ((android.hardware.camera2.CameraManager) com.tencent.liteav.base.ContextUtils.getApplicationContext().getSystemService("camera")).unregisterAvailabilityCallback(this.F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        android.hardware.camera2.CaptureRequest.Builder builder;
        android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.f47045k.get();
        if (cameraCaptureSession == null || (builder = this.f47047m) == null) {
            return;
        }
        try {
            cameraCaptureSession.setRepeatingRequest(builder.build(), null, null);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "updatePreview exception:".concat(java.lang.String.valueOf(th6)));
        }
    }

    private java.util.List<com.tencent.liteav.base.util.Size> e() {
        if (a() == null) {
            com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "getPreviewSizes error, Characteristics is null");
            return null;
        }
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) a().get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "getPreviewSizes map null");
            return null;
        }
        android.util.Size[] outputSizes = streamConfigurationMap.getOutputSizes(android.graphics.SurfaceTexture.class);
        if (outputSizes == null) {
            com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "getPreviewSizes choices is null");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : outputSizes) {
            arrayList.add(new com.tencent.liteav.base.util.Size(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return a() == null || this.f47047m == null || this.f47057w != com.tencent.liteav.videoproducer.capture.b.a.EnumC0013a.PREVIEWING;
    }

    private void a(float f17) {
        if (this.f47047m != null && a() != null) {
            this.f47047m.set(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION, c(f17));
            return;
        }
        com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "setZoom fail, scale:" + f17 + " mPreviewBuilder is null.");
    }

    private void c(boolean z17) {
        android.hardware.camera2.CaptureRequest.Builder builder = this.f47047m;
        if (builder == null) {
            return;
        }
        int i17 = z17 ? 1 : 3;
        builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, java.lang.Integer.valueOf(i17));
        com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "setFocusModeWithoutUpdatePreview to ".concat(java.lang.String.valueOf(i17)));
    }

    public static /* synthetic */ void a(com.tencent.liteav.videoproducer.capture.b.a aVar, int i17) {
        if (aVar.f()) {
            com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "onCameraError, but camera is invalid, do not send camera error.");
            return;
        }
        com.tencent.liteav.videoproducer.capture.CameraEventCallback cameraEventCallback = aVar.A;
        if (cameraEventCallback != null) {
            cameraEventCallback.onCameraError(aVar, i17);
        }
    }

    private android.graphics.Rect c(float f17) {
        android.graphics.Rect rect = (android.graphics.Rect) a().get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        float floatValue = ((java.lang.Float) a().get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        float f18 = floatValue - 1.0f;
        float a17 = (com.tencent.liteav.base.util.g.a(f17, 0.0f) * f18) + 1.0f;
        int width = (int) (rect.width() / floatValue);
        int width2 = rect.width() - width;
        int height = rect.height() - ((int) (rect.height() / floatValue));
        float f19 = a17 - 1.0f;
        int i17 = (int) (((width2 * f19) / f18) / 2.0f);
        int i18 = (int) (((height * f19) / f18) / 2.0f);
        android.graphics.Rect rect2 = new android.graphics.Rect(i17, i18, rect.width() - i17, rect.height() - i18);
        com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "calculateZoomRect calculatedZoomLevel:" + a17 + " rect:" + rect + " newRect2:" + rect2);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z17, android.hardware.camera2.CameraDevice cameraDevice) {
        java.util.concurrent.CountDownLatch countDownLatch = this.f47059y;
        this.f47042h.set(z17);
        this.f47043i.set(cameraDevice);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String b(boolean z17) {
        return z17 ? !android.text.TextUtils.isEmpty(f47038e) ? f47038e : f47037d : !android.text.TextUtils.isEmpty(f47037d) ? f47037d : f47038e;
    }

    private void b() {
        android.hardware.camera2.CameraCaptureSession andSet = this.f47045k.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.close();
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "closePreviewSession fail, Exception:".concat(java.lang.String.valueOf(th6)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z17, android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        java.util.concurrent.CountDownLatch countDownLatch = this.f47060z;
        this.f47044j.set(z17);
        this.f47045k.set(cameraCaptureSession);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static /* synthetic */ void b(com.tencent.liteav.videoproducer.capture.b.a aVar, int i17) {
        aVar.f47041g.a(com.tencent.liteav.videoproducer.capture.b.b.a(aVar, i17));
    }

    private android.hardware.camera2.CameraCharacteristics a() {
        java.lang.String b17 = b(this.f47053s);
        if (android.text.TextUtils.isEmpty(b17)) {
            return null;
        }
        return f47035b.get(b17);
    }

    private boolean a(int i17, int i18) {
        java.lang.String b17 = b(this.f47053s);
        if (a() == null) {
            com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "openCamera fail getCameraCharacteristics null");
            return false;
        }
        com.tencent.liteav.base.util.k a17 = com.tencent.liteav.base.util.k.a(((java.lang.Integer) a().get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION)).intValue());
        this.f47049o = a17;
        com.tencent.liteav.base.util.k kVar = this.f47050p;
        if (kVar != null) {
            a17 = kVar;
        }
        this.f47048n = com.tencent.liteav.videoproducer.capture.b.a(e(), a17, i17, i18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openCamera ,id:");
        sb6.append(b17);
        sb6.append(",");
        sb6.append(this.f47053s ? "front camera" : "back camera");
        sb6.append(" mPreviewSize ");
        sb6.append(this.f47048n);
        sb6.append(" cameraRotation ");
        sb6.append(a17);
        sb6.append(" mIsCameraSupportAutoFocus ");
        sb6.append(this.f47055u);
        com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", sb6.toString());
        try {
            this.f47059y = new java.util.concurrent.CountDownLatch(1);
            android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) com.tencent.liteav.base.ContextUtils.getApplicationContext().getSystemService("camera");
            android.hardware.camera2.CameraDevice.StateCallback stateCallback = this.D;
            android.os.Handler handler = this.f47040f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(handler);
            arrayList.add(stateCallback);
            arrayList.add(b17);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(cameraManager, arrayList.toArray(), "com/tencent/liteav/videoproducer/capture/b/a", "a", "(II)Z", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V");
            this.f47059y.await();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "openCamera exception:".concat(java.lang.String.valueOf(th6)));
            a(false, (android.hardware.camera2.CameraDevice) null);
        }
        return this.f47042h.get();
    }

    private boolean a(android.graphics.SurfaceTexture surfaceTexture) {
        android.hardware.camera2.CameraDevice cameraDevice;
        try {
            cameraDevice = this.f47043i.get();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e("Camera2Controller", "startPreview exception", th6);
            a(false, (android.hardware.camera2.CameraCaptureSession) null);
        }
        if (cameraDevice != null && surfaceTexture != null) {
            b();
            android.graphics.SurfaceTexture surfaceTexture2 = this.f47052r;
            com.tencent.liteav.base.util.Size size = this.f47048n;
            surfaceTexture2.setDefaultBufferSize(size.width, size.height);
            android.view.Surface surface = new android.view.Surface(this.f47052r);
            android.hardware.camera2.CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
            this.f47047m = createCaptureRequest;
            createCaptureRequest.addTarget(surface);
            java.util.List<android.view.Surface> singletonList = java.util.Collections.singletonList(surface);
            this.f47060z = new java.util.concurrent.CountDownLatch(1);
            cameraDevice.createCaptureSession(singletonList, this.E, this.f47040f);
            this.f47060z.await();
            return this.f47044j.get();
        }
        throw new java.io.IOException("startPreview cameraDevice null!");
    }

    private static com.tencent.liteav.videoproducer.a.a[] a(android.util.Range<java.lang.Integer>[] rangeArr) {
        if (rangeArr == null || rangeArr.length <= 0) {
            return new com.tencent.liteav.videoproducer.a.a[0];
        }
        com.tencent.liteav.videoproducer.a.a[] aVarArr = new com.tencent.liteav.videoproducer.a.a[rangeArr.length];
        for (int i17 = 0; i17 < rangeArr.length; i17++) {
            aVarArr[i17] = new com.tencent.liteav.videoproducer.a.a(rangeArr[i17].getLower().intValue(), rangeArr[i17].getUpper().intValue());
        }
        return aVarArr;
    }

    public static /* synthetic */ void a(com.tencent.liteav.videoproducer.capture.b.a aVar, boolean z17) {
        com.tencent.liteav.base.util.LiteavLog.i("Camera2Controller", "onFocusCallback success:".concat(java.lang.String.valueOf(z17)));
        aVar.f47039a = true;
        boolean z18 = aVar.f47054t;
        if (z18) {
            return;
        }
        aVar.c(z18);
        aVar.d();
    }
}

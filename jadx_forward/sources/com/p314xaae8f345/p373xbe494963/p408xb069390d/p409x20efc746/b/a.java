package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b;

/* loaded from: classes14.dex */
public final class a extends com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978 {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f128569c;
    private com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.InterfaceC3839xf211f5ba A;

    /* renamed from: g, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.s f128574g;

    /* renamed from: l, reason: collision with root package name */
    private android.hardware.camera2.CaptureRequest f128579l;

    /* renamed from: m, reason: collision with root package name */
    private android.hardware.camera2.CaptureRequest.Builder f128580m;

    /* renamed from: n, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 f128581n;

    /* renamed from: r, reason: collision with root package name */
    private android.graphics.SurfaceTexture f128585r;

    /* renamed from: y, reason: collision with root package name */
    private java.util.concurrent.CountDownLatch f128592y;

    /* renamed from: z, reason: collision with root package name */
    private java.util.concurrent.CountDownLatch f128593z;

    /* renamed from: b, reason: collision with root package name */
    private static final java.util.HashMap<java.lang.String, android.hardware.camera2.CameraCharacteristics> f128568b = new java.util.HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f128570d = "";

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f128571e = "";

    /* renamed from: f, reason: collision with root package name */
    private final android.os.Handler f128573f = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f128575h = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference<android.hardware.camera2.CameraDevice> f128576i = new java.util.concurrent.atomic.AtomicReference<>();

    /* renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f128577j = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference<android.hardware.camera2.CameraCaptureSession> f128578k = new java.util.concurrent.atomic.AtomicReference<>();

    /* renamed from: o, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k f128582o = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL;

    /* renamed from: p, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k f128583p = null;

    /* renamed from: q, reason: collision with root package name */
    private boolean f128584q = true;

    /* renamed from: s, reason: collision with root package name */
    private boolean f128586s = true;

    /* renamed from: t, reason: collision with root package name */
    private boolean f128587t = true;

    /* renamed from: u, reason: collision with root package name */
    private boolean f128588u = true;

    /* renamed from: v, reason: collision with root package name */
    private int f128589v = -1;

    /* renamed from: w, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.EnumC30883a f128590w = com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.EnumC30883a.IDLE;

    /* renamed from: x, reason: collision with root package name */
    private boolean f128591x = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f128572a = false;
    private float B = 0.0f;
    private float C = 0.0f;
    private final android.hardware.camera2.CameraDevice.StateCallback D = new android.hardware.camera2.CameraDevice.StateCallback() { // from class: com.tencent.liteav.videoproducer.capture.b.a.1
        private void a(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            if (com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.f128575h.get()) {
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.b(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this, i17);
            } else {
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.a(false, cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "CameraDevice onClosed!" + a(cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "CameraDevice onDisconnected!" + a(cameraDevice));
            a(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "CameraDevice onError!" + a(cameraDevice) + ", error:" + i17);
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
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "CameraDevice onOpen!" + a(cameraDevice));
            com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.a(true, cameraDevice);
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
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "CameraCaptureSession onConfigureFailed!");
            com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.a(false, cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "CameraCaptureSession onConfigured!");
            com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.a(true, cameraCaptureSession);
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
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "onCameraAvailable: ".concat(java.lang.String.valueOf(str)));
            if (!com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.f() && com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.b(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.f128586s).equals(str) && com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.f128575h.get()) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w("Camera2Controller", "Current camera is available, it could be interrupted by system app.");
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a aVar = com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this;
                aVar.a(false, (android.hardware.camera2.CameraDevice) aVar.f128576i.get());
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.b(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this, 1);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(java.lang.String str) {
            super.onCameraUnavailable(str);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "onCameraUnavailable: ".concat(java.lang.String.valueOf(str)));
        }
    };
    private final android.hardware.camera2.CameraCaptureSession.CaptureCallback G = new com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.AnonymousClass4();

    /* renamed from: com.tencent.liteav.videoproducer.capture.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public enum EnumC30883a {
        IDLE,
        PREVIEWING
    }

    public a(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.s sVar) {
        this.f128574g = sVar;
    }

    public static /* synthetic */ boolean e(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a aVar) {
        aVar.f128591x = false;
        return false;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: enableCameraFpsCorrectionLogic */
    public final void mo31360xae3cf71f(boolean z17) {
        this.f128584q = z17;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "set enable camera fps correction logic value is: ".concat(java.lang.String.valueOf(z17)));
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: enableTapToFocus */
    public final void mo31361x60c0efdd(boolean z17) {
        this.f128587t = z17;
        if (this.f128591x) {
            return;
        }
        c(z17);
        d();
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: getCameraSystemRotation */
    public final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k mo31362x99ffadc8() {
        return this.f128582o;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: getCameraSystemRotationValue */
    public final int mo31363x5df75089() {
        return this.f128582o.f14773xbee9dd04;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: getMaxZoom */
    public final int mo31364x70202721() {
        return 100;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: getPreviewSize */
    public final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 mo31365x8cdf5ab3() {
        return this.f128581n;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: isCameraAutoFocusFaceModeSupported */
    public final boolean mo31366x8a09f1d4() {
        return a() != null && ((java.lang.Integer) a().get(android.hardware.camera2.CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue() > 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: isCameraFocusPositionInPreviewSupported */
    public final boolean mo31367x56cf6e1d() {
        return a() != null && ((java.lang.Integer) a().get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: isCurrentPreviewSizeAspectRatioMatch */
    public final boolean mo31368xcce9f68c(int i17, int i18, boolean z17) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar = this.f128583p;
        if (kVar == null) {
            kVar = this.f128582o;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 a17 = com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a(e(), kVar, i17, i18);
        boolean z18 = (!z17 || java.lang.Math.abs(a17.m29554x41194293() - this.f128581n.m29554x41194293()) <= 0.001d) ? a17.m29556xfb7d3903() <= this.f128581n.m29556xfb7d3903() : false;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "isCurrentPreviewSizeAspectRatioMatch:".concat(java.lang.String.valueOf(z18)));
        return z18;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: isTorchSupported */
    public final boolean mo31369x1fa163dc() {
        return a() != null && ((java.lang.Boolean) a().get(android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: isZoomSupported */
    public final boolean mo31370x8a69c511() {
        return a() != null && ((java.lang.Float) a().get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue() > 0.0f;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: setCameraRotationCorrectionValue */
    public final void mo31371x5895ab2e(int i17) {
        this.f128583p = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.b(i17) ? com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(i17) : null;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "camera rotation correction is " + this.f128583p);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: setExposureCompensation */
    public final void mo31372xf5004e83(float f17) {
        this.B = f17;
        b(f17);
        d();
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: setZoom */
    public final void mo31373x76535355(float f17) {
        this.C = f17;
        a(f17);
        d();
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: startAutoFocusAtPosition */
    public final void mo31374x5248a403(int i17, int i18) {
        double d17;
        double d18;
        if (this.f128587t && this.f128588u) {
            if (f() || this.f128591x) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "autoFocus not preview, mCameraStatus:" + this.f128590w + " mIsAutoFocusing:" + this.f128591x);
                return;
            }
            android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.f128578k.get();
            if (cameraCaptureSession == null) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "CameraCaptureSession get fail");
                return;
            }
            if (i17 >= 0) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = this.f128581n;
                if (i17 < c3779x275421.f14764x6be2dc6 && i18 >= 0 && i18 < c3779x275421.f14763xb7389127) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "Start auto focus at (%d, %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    double d19 = i17;
                    double d27 = i18;
                    android.graphics.Rect rect = (android.graphics.Rect) this.f128579l.get(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION);
                    if (rect == null) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "getMeteringRect can't get crop region");
                        rect = (android.graphics.Rect) a().get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    }
                    int width = rect.width();
                    int height = rect.height();
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x2754212 = this.f128581n;
                    int i19 = c3779x2754212.f14763xb7389127;
                    int i27 = i19 * width;
                    int i28 = c3779x2754212.f14764x6be2dc6;
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
                    rect2.left = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a((int) (d29 - (rect.width() * 0.05d)), 0, rect.width());
                    rect2.right = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a((int) (d29 + (rect.width() * 0.05d)), 0, rect.width());
                    rect2.top = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a((int) (d37 - (rect.height() * 0.05d)), 0, rect.height());
                    rect2.bottom = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a((int) (d37 + (rect.height() * 0.05d)), 0, rect.height());
                    try {
                        this.f128580m.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS, new android.hardware.camera2.params.MeteringRectangle[]{new android.hardware.camera2.params.MeteringRectangle(rect2, 1000)});
                        this.f128580m.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS, new android.hardware.camera2.params.MeteringRectangle[]{new android.hardware.camera2.params.MeteringRectangle(rect2, 1000)});
                        this.f128580m.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 1);
                        this.f128580m.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.f128580m.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                        this.f128591x = true;
                        this.f128572a = false;
                        this.f128580m.setTag(this);
                        cameraCaptureSession.setRepeatingRequest(this.f128580m.build(), this.G, this.f128573f);
                        return;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "startAutoFocusAtPosition exception:".concat(java.lang.String.valueOf(th6)));
                        return;
                    }
                }
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w("Camera2Controller", "Start auto focus at (%d, %d) invalid ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: startCapture */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo31375x18ec4884(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3837xdcded927 r13, android.graphics.SurfaceTexture r14, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.InterfaceC3839xf211f5ba r15) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.mo31375x18ec4884(com.tencent.liteav.videoproducer.capture.CameraCaptureParams, android.graphics.SurfaceTexture, com.tencent.liteav.videoproducer.capture.CameraEventCallback):boolean");
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: stopCapture */
    public final void mo31376xd45bb0e4() {
        java.util.concurrent.CountDownLatch countDownLatch = this.f128592y;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        this.f128592y = null;
        java.util.concurrent.CountDownLatch countDownLatch2 = this.f128593z;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
        this.f128593z = null;
        b();
        c();
        this.f128579l = null;
        this.f128572a = false;
        this.f128575h.set(false);
        this.f128585r = null;
        this.f128589v = -1;
        this.f128590w = com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.EnumC30883a.IDLE;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "stopCapture success");
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: turnOnTorch */
    public final void mo31377xda01aa20(boolean z17) {
        if (f()) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "turnOnTorch error mCameraStatus:" + this.f128590w);
            return;
        }
        boolean z18 = true;
        if (z17 && this.f128589v != 2) {
            this.f128589v = 2;
        } else if (z17) {
            z18 = false;
        } else {
            this.f128589v = 0;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "turnOnTorch:" + z17 + ", mode:" + this.f128589v + ", updateView:" + z18);
        if (z18) {
            this.f128580m.set(android.hardware.camera2.CaptureRequest.FLASH_MODE, java.lang.Integer.valueOf(this.f128589v));
            d();
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.b.a$4, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass4 extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        public AnonymousClass4() {
        }

        private static boolean a(android.hardware.camera2.CaptureRequest captureRequest) {
            return (captureRequest.getTag() instanceof com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a) && !((com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a) captureRequest.getTag()).f128572a;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.f128574g.a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.c.a(this, totalCaptureResult, captureRequest));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "onCaptureFailed failure reason:" + captureFailure.getReason());
            com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.f128574g.a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.d.a(this, captureRequest));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureResult captureResult) {
        }

        private void a(android.hardware.camera2.CaptureRequest captureRequest, boolean z17) {
            if (com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.f()) {
                return;
            }
            com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.e(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this);
            try {
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.f128580m.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 2);
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.f128580m.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, 1);
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.f128580m.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 3);
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this.d();
                if (captureRequest.getTag() instanceof com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a) {
                    com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.a((com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a) captureRequest.getTag(), z17);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "mAfCaptureCallback exception:".concat(java.lang.String.valueOf(th6)));
            }
        }

        public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.AnonymousClass4 anonymousClass4, android.hardware.camera2.CaptureRequest captureRequest) {
            if (!a(captureRequest)) {
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.e(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this);
            } else {
                anonymousClass4.a(captureRequest, false);
            }
        }

        public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.AnonymousClass4 anonymousClass4, android.hardware.camera2.TotalCaptureResult totalCaptureResult, android.hardware.camera2.CaptureRequest captureRequest) {
            if (!a(captureRequest)) {
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.e(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.this);
                return;
            }
            java.lang.Integer num = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "handleCaptureCompleted get afState fail");
                anonymousClass4.a(captureRequest, false);
            } else if (4 == num.intValue() || 5 == num.intValue()) {
                anonymousClass4.a(captureRequest, true);
            }
        }
    }

    private void b(float f17) {
        float f18;
        int i17;
        if (this.f128580m != null && a() != null) {
            android.util.Range range = (android.util.Range) a().get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
            int intValue = ((java.lang.Integer) range.getLower()).intValue();
            int intValue2 = ((java.lang.Integer) range.getUpper()).intValue();
            if (intValue == 0 && intValue2 == 0) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "camera doesn't support exposure compensation");
                return;
            }
            float a17 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a(f17, -1.0f);
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
            this.f128580m.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, java.lang.Integer.valueOf(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a(i17, intValue, intValue2)));
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "setExposureCompensation fail, value:" + f17 + " mCameraStatus:" + this.f128590w);
    }

    private void c() {
        android.hardware.camera2.CameraDevice andSet = this.f128576i.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.close();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "closeCamera fail, Exception:".concat(java.lang.String.valueOf(th6)));
            }
        }
        ((android.hardware.camera2.CameraManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("camera")).unregisterAvailabilityCallback(this.F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        android.hardware.camera2.CaptureRequest.Builder builder;
        android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.f128578k.get();
        if (cameraCaptureSession == null || (builder = this.f128580m) == null) {
            return;
        }
        try {
            cameraCaptureSession.setRepeatingRequest(builder.build(), null, null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "updatePreview exception:".concat(java.lang.String.valueOf(th6)));
        }
    }

    private java.util.List<com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421> e() {
        if (a() == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "getPreviewSizes error, Characteristics is null");
            return null;
        }
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) a().get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "getPreviewSizes map null");
            return null;
        }
        android.util.Size[] outputSizes = streamConfigurationMap.getOutputSizes(android.graphics.SurfaceTexture.class);
        if (outputSizes == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "getPreviewSizes choices is null");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : outputSizes) {
            arrayList.add(new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return a() == null || this.f128580m == null || this.f128590w != com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.EnumC30883a.PREVIEWING;
    }

    private void a(float f17) {
        if (this.f128580m != null && a() != null) {
            this.f128580m.set(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION, c(f17));
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "setZoom fail, scale:" + f17 + " mPreviewBuilder is null.");
    }

    private void c(boolean z17) {
        android.hardware.camera2.CaptureRequest.Builder builder = this.f128580m;
        if (builder == null) {
            return;
        }
        int i17 = z17 ? 1 : 3;
        builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "setFocusModeWithoutUpdatePreview to ".concat(java.lang.String.valueOf(i17)));
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a aVar, int i17) {
        if (aVar.f()) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "onCameraError, but camera is invalid, do not send camera error.");
            return;
        }
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.InterfaceC3839xf211f5ba interfaceC3839xf211f5ba = aVar.A;
        if (interfaceC3839xf211f5ba != null) {
            interfaceC3839xf211f5ba.mo31382x95dbd684(aVar, i17);
        }
    }

    private android.graphics.Rect c(float f17) {
        android.graphics.Rect rect = (android.graphics.Rect) a().get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        float floatValue = ((java.lang.Float) a().get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        float f18 = floatValue - 1.0f;
        float a17 = (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a(f17, 0.0f) * f18) + 1.0f;
        int width = (int) (rect.width() / floatValue);
        int width2 = rect.width() - width;
        int height = rect.height() - ((int) (rect.height() / floatValue));
        float f19 = a17 - 1.0f;
        int i17 = (int) (((width2 * f19) / f18) / 2.0f);
        int i18 = (int) (((height * f19) / f18) / 2.0f);
        android.graphics.Rect rect2 = new android.graphics.Rect(i17, i18, rect.width() - i17, rect.height() - i18);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "calculateZoomRect calculatedZoomLevel:" + a17 + " rect:" + rect + " newRect2:" + rect2);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z17, android.hardware.camera2.CameraDevice cameraDevice) {
        java.util.concurrent.CountDownLatch countDownLatch = this.f128592y;
        this.f128575h.set(z17);
        this.f128576i.set(cameraDevice);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String b(boolean z17) {
        return z17 ? !android.text.TextUtils.isEmpty(f128571e) ? f128571e : f128570d : !android.text.TextUtils.isEmpty(f128570d) ? f128570d : f128571e;
    }

    private void b() {
        android.hardware.camera2.CameraCaptureSession andSet = this.f128578k.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.close();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "closePreviewSession fail, Exception:".concat(java.lang.String.valueOf(th6)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z17, android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        java.util.concurrent.CountDownLatch countDownLatch = this.f128593z;
        this.f128577j.set(z17);
        this.f128578k.set(cameraCaptureSession);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static /* synthetic */ void b(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a aVar, int i17) {
        aVar.f128574g.a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.b.a(aVar, i17));
    }

    private android.hardware.camera2.CameraCharacteristics a() {
        java.lang.String b17 = b(this.f128586s);
        if (android.text.TextUtils.isEmpty(b17)) {
            return null;
        }
        return f128568b.get(b17);
    }

    private boolean a(int i17, int i18) {
        java.lang.String b17 = b(this.f128586s);
        if (a() == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "openCamera fail getCameraCharacteristics null");
            return false;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k a17 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(((java.lang.Integer) a().get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION)).intValue());
        this.f128582o = a17;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar = this.f128583p;
        if (kVar != null) {
            a17 = kVar;
        }
        this.f128581n = com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a(e(), a17, i17, i18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openCamera ,id:");
        sb6.append(b17);
        sb6.append(",");
        sb6.append(this.f128586s ? "front camera" : "back camera");
        sb6.append(" mPreviewSize ");
        sb6.append(this.f128581n);
        sb6.append(" cameraRotation ");
        sb6.append(a17);
        sb6.append(" mIsCameraSupportAutoFocus ");
        sb6.append(this.f128588u);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", sb6.toString());
        try {
            this.f128592y = new java.util.concurrent.CountDownLatch(1);
            android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("camera");
            android.hardware.camera2.CameraDevice.StateCallback stateCallback = this.D;
            android.os.Handler handler = this.f128573f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(handler);
            arrayList.add(stateCallback);
            arrayList.add(b17);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(cameraManager, arrayList.toArray(), "com/tencent/liteav/videoproducer/capture/b/a", "a", "(II)Z", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V");
            this.f128592y.await();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "openCamera exception:".concat(java.lang.String.valueOf(th6)));
            a(false, (android.hardware.camera2.CameraDevice) null);
        }
        return this.f128575h.get();
    }

    private boolean a(android.graphics.SurfaceTexture surfaceTexture) {
        android.hardware.camera2.CameraDevice cameraDevice;
        try {
            cameraDevice = this.f128576i.get();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Camera2Controller", "startPreview exception", th6);
            a(false, (android.hardware.camera2.CameraCaptureSession) null);
        }
        if (cameraDevice != null && surfaceTexture != null) {
            b();
            android.graphics.SurfaceTexture surfaceTexture2 = this.f128585r;
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = this.f128581n;
            surfaceTexture2.setDefaultBufferSize(c3779x275421.f14764x6be2dc6, c3779x275421.f14763xb7389127);
            android.view.Surface surface = new android.view.Surface(this.f128585r);
            android.hardware.camera2.CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
            this.f128580m = createCaptureRequest;
            createCaptureRequest.addTarget(surface);
            java.util.List<android.view.Surface> singletonList = java.util.Collections.singletonList(surface);
            this.f128593z = new java.util.concurrent.CountDownLatch(1);
            cameraDevice.createCaptureSession(singletonList, this.E, this.f128573f);
            this.f128593z.await();
            return this.f128577j.get();
        }
        throw new java.io.IOException("startPreview cameraDevice null!");
    }

    private static com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a[] a(android.util.Range<java.lang.Integer>[] rangeArr) {
        if (rangeArr == null || rangeArr.length <= 0) {
            return new com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a[0];
        }
        com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a[] aVarArr = new com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a[rangeArr.length];
        for (int i17 = 0; i17 < rangeArr.length; i17++) {
            aVarArr[i17] = new com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a(rangeArr[i17].getLower().intValue(), rangeArr[i17].getUpper().intValue());
        }
        return aVarArr;
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a aVar, boolean z17) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("Camera2Controller", "onFocusCallback success:".concat(java.lang.String.valueOf(z17)));
        aVar.f128572a = true;
        boolean z18 = aVar.f128587t;
        if (z18) {
            return;
        }
        aVar.c(z18);
        aVar.d();
    }
}

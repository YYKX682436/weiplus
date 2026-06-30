package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.a;

/* loaded from: classes14.dex */
public final class a extends com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978 implements android.hardware.Camera.ErrorCallback {

    /* renamed from: b, reason: collision with root package name */
    private android.hardware.Camera f128551b;

    /* renamed from: f, reason: collision with root package name */
    private android.graphics.SurfaceTexture f128555f;

    /* renamed from: g, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 f128556g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f128557h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f128558i;

    /* renamed from: l, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.InterfaceC3839xf211f5ba f128561l;

    /* renamed from: n, reason: collision with root package name */
    private float f128563n;

    /* renamed from: a, reason: collision with root package name */
    private boolean f128550a = true;

    /* renamed from: c, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k f128552c = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k f128553d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f128554e = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f128559j = true;

    /* renamed from: k, reason: collision with root package name */
    private int f128560k = 0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f128562m = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f128564o = false;

    /* renamed from: p, reason: collision with root package name */
    private float f128565p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    private final android.hardware.Camera.AutoFocusCallback f128566q = com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.a.b.a();

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: enableCameraFpsCorrectionLogic */
    public final void mo31360xae3cf71f(boolean z17) {
        this.f128554e = z17;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraController", "set enable camera fps correction logic value is:".concat(java.lang.String.valueOf(z17)));
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: enableTapToFocus */
    public final void mo31361x60c0efdd(boolean z17) {
        android.hardware.Camera.Parameters a17;
        this.f128559j = z17;
        if (this.f128551b == null || (a17 = a()) == null) {
            return;
        }
        try {
            a(a17, z17);
            this.f128551b.setParameters(a17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("CameraController", "enableTapToFocus failed.", th6);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: getCameraSystemRotation */
    public final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k mo31362x99ffadc8() {
        return this.f128552c;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: getCameraSystemRotationValue */
    public final int mo31363x5df75089() {
        return this.f128552c.f14773xbee9dd04;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: getMaxZoom */
    public final int mo31364x70202721() {
        int i17 = this.f128560k;
        if (i17 != 0) {
            return i17;
        }
        if (this.f128551b != null) {
            android.hardware.Camera.Parameters a17 = a();
            if (a17 == null) {
                return this.f128560k;
            }
            if (a17.getMaxZoom() > 0 && a17.isZoomSupported()) {
                this.f128560k = a17.getMaxZoom();
            }
        }
        return this.f128560k;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: getPreviewSize */
    public final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 mo31365x8cdf5ab3() {
        return this.f128556g;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: isCameraAutoFocusFaceModeSupported */
    public final boolean mo31366x8a09f1d4() {
        android.hardware.Camera.Parameters a17;
        return (this.f128551b == null || (a17 = a()) == null || a17.getMaxNumDetectedFaces() <= 0) ? false : true;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: isCameraFocusPositionInPreviewSupported */
    public final boolean mo31367x56cf6e1d() {
        return this.f128557h;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: isCurrentPreviewSizeAspectRatioMatch */
    public final boolean mo31368xcce9f68c(int i17, int i18, boolean z17) {
        if (this.f128551b != null) {
            android.hardware.Camera.Parameters a17 = a();
            if (a17 == null) {
                return true;
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar = this.f128553d;
            if (kVar == null) {
                kVar = this.f128552c;
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 a18 = a(a17, kVar, i17, i18);
            if (a18 != null) {
                int i19 = a18.f14764x6be2dc6 * a18.f14763xb7389127;
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = this.f128556g;
                r1 = i19 <= c3779x275421.f14763xb7389127 * c3779x275421.f14764x6be2dc6;
                if (z17 && java.lang.Math.abs(a18.m29554x41194293() - this.f128556g.m29554x41194293()) > 0.001d) {
                    r1 = false;
                }
            }
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraController", "isCurrentPreviewSizeAspectRatioMatch : ".concat(java.lang.String.valueOf(r1)));
        return r1;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: isTorchSupported */
    public final boolean mo31369x1fa163dc() {
        android.hardware.Camera.Parameters a17;
        java.util.List<java.lang.String> supportedFlashModes;
        return (this.f128551b == null || (a17 = a()) == null || (supportedFlashModes = a17.getSupportedFlashModes()) == null || !supportedFlashModes.contains("torch")) ? false : true;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: isZoomSupported */
    public final boolean mo31370x8a69c511() {
        android.hardware.Camera.Parameters a17;
        return this.f128551b != null && (a17 = a()) != null && a17.getMaxZoom() > 0 && a17.isZoomSupported();
    }

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i17, android.hardware.Camera camera) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("CameraController", "onError, error:".concat(java.lang.String.valueOf(i17)));
        if (i17 == 1 || i17 == 2 || i17 == 100) {
            int i18 = i17 != 2 ? i17 == 100 ? 3 : 0 : 1;
            com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.InterfaceC3839xf211f5ba interfaceC3839xf211f5ba = this.f128561l;
            if (interfaceC3839xf211f5ba != null) {
                interfaceC3839xf211f5ba.mo31382x95dbd684(this, i18);
            }
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: setCameraRotationCorrectionValue */
    public final void mo31371x5895ab2e(int i17) {
        this.f128553d = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.b(i17) ? com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(i17) : null;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraController", "camera rotation correction is " + this.f128553d);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: setExposureCompensation */
    public final void mo31372xf5004e83(float f17) {
        this.f128563n = f17;
        this.f128562m = true;
        if (this.f128551b == null) {
            return;
        }
        this.f128562m = false;
        android.hardware.Camera.Parameters a17 = a();
        if (a17 == null) {
            return;
        }
        a17.setExposureCompensation(a(a17, f17));
        try {
            this.f128551b.setParameters(a17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("CameraController", "set exposure compensation failed.", th6);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: setZoom */
    public final void mo31373x76535355(float f17) {
        this.f128565p = f17;
        this.f128564o = true;
        if (this.f128551b == null) {
            return;
        }
        this.f128564o = false;
        android.hardware.Camera.Parameters a17 = a();
        if (a17 == null) {
            return;
        }
        if (a17.getMaxZoom() <= 0 || !a17.isZoomSupported()) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraController", "camera doesn't support zoom!");
            return;
        }
        int maxZoom = a17.getMaxZoom();
        try {
            a17.setZoom(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a(java.lang.Math.round(f17 * maxZoom), 0, maxZoom));
            this.f128551b.setParameters(a17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("CameraController", "set zoom failed.", th6);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: startAutoFocusAtPosition */
    public final void mo31374x5248a403(int i17, int i18) {
        if (!this.f128559j || this.f128551b == null) {
            return;
        }
        if (i17 >= 0) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = this.f128556g;
            if (i17 < c3779x275421.f14764x6be2dc6 && i18 >= 0 && i18 < c3779x275421.f14763xb7389127) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraController", "Start auto focus at (%d, %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                try {
                    this.f128551b.cancelAutoFocus();
                    android.hardware.Camera.Parameters a17 = a();
                    if (a17 == null) {
                        return;
                    }
                    if (this.f128557h) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(new android.hardware.Camera.Area(a(i17, i18, 2.0f), 1000));
                        a17.setFocusAreas(arrayList);
                    }
                    if (this.f128558i) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(new android.hardware.Camera.Area(a(i17, i18, 3.0f), 1000));
                        a17.setMeteringAreas(arrayList2);
                    }
                    try {
                        this.f128551b.setParameters(a17);
                        this.f128551b.autoFocus(this.f128566q);
                        return;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("CameraController", "auto focus failed.", th6);
                        return;
                    }
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("CameraController", "cancel auto focus failed.", th7);
                    return;
                }
            }
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w("CameraController", "Start auto focus at (%d, %d) invalid ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0160 A[Catch: all -> 0x01a3, TryCatch #0 {all -> 0x01a3, blocks: (B:5:0x0013, B:7:0x0017, B:10:0x001e, B:13:0x0072, B:16:0x00a0, B:19:0x00ab, B:21:0x00b6, B:23:0x00c0, B:25:0x00c6, B:26:0x00d9, B:28:0x00dd, B:29:0x00e8, B:31:0x0105, B:32:0x014d, B:33:0x0156, B:35:0x0160, B:36:0x0177, B:38:0x016e, B:39:0x0115, B:41:0x0136, B:43:0x0145, B:46:0x019b, B:47:0x01a2), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e A[Catch: all -> 0x01a3, TryCatch #0 {all -> 0x01a3, blocks: (B:5:0x0013, B:7:0x0017, B:10:0x001e, B:13:0x0072, B:16:0x00a0, B:19:0x00ab, B:21:0x00b6, B:23:0x00c0, B:25:0x00c6, B:26:0x00d9, B:28:0x00dd, B:29:0x00e8, B:31:0x0105, B:32:0x014d, B:33:0x0156, B:35:0x0160, B:36:0x0177, B:38:0x016e, B:39:0x0115, B:41:0x0136, B:43:0x0145, B:46:0x019b, B:47:0x01a2), top: B:2:0x000f }] */
    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: startCapture */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo31375x18ec4884(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3837xdcded927 r19, android.graphics.SurfaceTexture r20, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.InterfaceC3839xf211f5ba r21) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.a.a.mo31375x18ec4884(com.tencent.liteav.videoproducer.capture.CameraCaptureParams, android.graphics.SurfaceTexture, com.tencent.liteav.videoproducer.capture.CameraEventCallback):boolean");
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: stopCapture */
    public final void mo31376xd45bb0e4() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraController", "stopCapture");
        try {
            android.hardware.Camera camera = this.f128551b;
            if (camera != null) {
                camera.setErrorCallback(null);
                this.f128551b.stopPreview();
                yj0.a.j(this.f128551b, "com/tencent/liteav/videoproducer/capture/a/a", "stopCapture", "()V", "android/hardware/Camera", "release", "()V");
                this.f128551b = null;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("CameraController", "closeCamera fail, Exception:".concat(java.lang.String.valueOf(th6)));
        }
        this.f128555f = null;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978
    /* renamed from: turnOnTorch */
    public final void mo31377xda01aa20(boolean z17) {
        java.util.List<java.lang.String> supportedFlashModes;
        if (this.f128551b == null) {
            return;
        }
        java.lang.String str = z17 ? "torch" : "off";
        android.hardware.Camera.Parameters a17 = a();
        if (a17 == null || (supportedFlashModes = a17.getSupportedFlashModes()) == null || !supportedFlashModes.contains(str)) {
            return;
        }
        try {
            a17.setFlashMode(str);
            this.f128551b.setParameters(a17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("CameraController", "enable torch failed.", th6);
        }
    }

    private android.graphics.Rect a(float f17, float f18, float f19) {
        int i17 = (int) (f19 * 200.0f);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = this.f128556g;
        int i18 = (int) (((f17 / c3779x275421.f14764x6be2dc6) * 2000.0f) - 1000.0f);
        int i19 = (int) (((f18 / c3779x275421.f14763xb7389127) * 2000.0f) - 1000.0f);
        int i27 = i17 / 2;
        int a17 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a(i18 - i27, -1000, 1000);
        int a18 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a(a17 + i17, -1000, 1000);
        int a19 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a(i19 - i27, -1000, 1000);
        return new android.graphics.Rect(a17, a19, a18, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a(i17 + a19, -1000, 1000));
    }

    private static int a(android.hardware.Camera.Parameters parameters, float f17) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        if (minExposureCompensation == 0 && maxExposureCompensation == 0) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraController", "camera doesn't support exposure compensation");
            return minExposureCompensation;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.a.a.a();
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a((int) (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a(f17, -1.0f) * maxExposureCompensation), minExposureCompensation, maxExposureCompensation);
    }

    private static int a(boolean z17, android.hardware.Camera.CameraInfo cameraInfo) {
        int i17 = -1;
        int i18 = -1;
        for (int i19 = 0; i19 < android.hardware.Camera.getNumberOfCameras(); i19++) {
            android.hardware.Camera.getCameraInfo(i19, cameraInfo);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraController", "get camera info, index: " + i19 + ", facing: " + cameraInfo.facing);
            if (i17 == -1 && cameraInfo.facing == 1) {
                i17 = i19;
            } else if (i18 == -1 && cameraInfo.facing == 0) {
                i18 = i19;
            }
        }
        if (!z17 ? i18 != -1 : i17 == -1) {
            i17 = i18;
        }
        android.hardware.Camera.getCameraInfo(i17, cameraInfo);
        return i17;
    }

    private static com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 a(android.hardware.Camera.Parameters parameters, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar, int i17, int i18) {
        java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (supportedPreviewSizes != null) {
            for (android.hardware.Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(size.width, size.height));
            }
        }
        return com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a(arrayList, kVar, i17, i18);
    }

    private static void a(android.hardware.Camera.Parameters parameters, boolean z17) {
        java.util.List<java.lang.String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            return;
        }
        if (z17 && supportedFocusModes.contains("auto")) {
            parameters.setFocusMode("auto");
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraController", "set focus mode to auto");
        } else if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraController", "set focus mode to continuous-video");
        }
    }

    private int a(int i17) {
        android.hardware.Camera.Parameters a17 = a();
        if (a17 == null) {
            return 1;
        }
        java.util.List<java.lang.Integer> supportedPreviewFrameRates = a17.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates != null && !supportedPreviewFrameRates.isEmpty()) {
            int intValue = supportedPreviewFrameRates.get(0).intValue();
            java.util.Iterator<java.lang.Integer> it = supportedPreviewFrameRates.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (java.lang.Math.abs(i17 - intValue2) < java.lang.Math.abs(i17 - intValue)) {
                    intValue = intValue2;
                }
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraController", "best matched frame rate: %d", java.lang.Integer.valueOf(intValue));
            return intValue;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("CameraController", "supported preview frame rates is empty");
        return 1;
    }

    private android.hardware.Camera.Parameters a() {
        try {
            android.hardware.Camera camera = this.f128551b;
            if (camera != null) {
                return camera.getParameters();
            }
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("CameraController", "getCameraParameters failed.", th6);
            return null;
        }
    }

    private static com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a[] a(java.util.List<int[]> list) {
        if (list == null || list.size() <= 0) {
            return new com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a[0];
        }
        com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a[] aVarArr = new com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            int[] iArr = list.get(i17);
            if (iArr != null && iArr.length >= 2) {
                aVarArr[i17] = new com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a(iArr[0], iArr[1]);
            }
        }
        return aVarArr;
    }
}

package com.tencent.liteav.videoproducer.capture.a;

/* loaded from: classes14.dex */
public final class a extends com.tencent.liteav.videoproducer.capture.CameraControllerInterface implements android.hardware.Camera.ErrorCallback {

    /* renamed from: b, reason: collision with root package name */
    private android.hardware.Camera f47018b;

    /* renamed from: f, reason: collision with root package name */
    private android.graphics.SurfaceTexture f47022f;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.liteav.base.util.Size f47023g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f47024h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f47025i;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.liteav.videoproducer.capture.CameraEventCallback f47028l;

    /* renamed from: n, reason: collision with root package name */
    private float f47030n;

    /* renamed from: a, reason: collision with root package name */
    private boolean f47017a = true;

    /* renamed from: c, reason: collision with root package name */
    private com.tencent.liteav.base.util.k f47019c = com.tencent.liteav.base.util.k.NORMAL;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.liteav.base.util.k f47020d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f47021e = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f47026j = true;

    /* renamed from: k, reason: collision with root package name */
    private int f47027k = 0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f47029m = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f47031o = false;

    /* renamed from: p, reason: collision with root package name */
    private float f47032p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    private final android.hardware.Camera.AutoFocusCallback f47033q = com.tencent.liteav.videoproducer.capture.a.b.a();

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableCameraFpsCorrectionLogic(boolean z17) {
        this.f47021e = z17;
        com.tencent.liteav.base.util.LiteavLog.i("CameraController", "set enable camera fps correction logic value is:".concat(java.lang.String.valueOf(z17)));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableTapToFocus(boolean z17) {
        android.hardware.Camera.Parameters a17;
        this.f47026j = z17;
        if (this.f47018b == null || (a17 = a()) == null) {
            return;
        }
        try {
            a(a17, z17);
            this.f47018b.setParameters(a17);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e("CameraController", "enableTapToFocus failed.", th6);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final com.tencent.liteav.base.util.k getCameraSystemRotation() {
        return this.f47019c;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getCameraSystemRotationValue() {
        return this.f47019c.mValue;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getMaxZoom() {
        int i17 = this.f47027k;
        if (i17 != 0) {
            return i17;
        }
        if (this.f47018b != null) {
            android.hardware.Camera.Parameters a17 = a();
            if (a17 == null) {
                return this.f47027k;
            }
            if (a17.getMaxZoom() > 0 && a17.isZoomSupported()) {
                this.f47027k = a17.getMaxZoom();
            }
        }
        return this.f47027k;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final com.tencent.liteav.base.util.Size getPreviewSize() {
        return this.f47023g;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraAutoFocusFaceModeSupported() {
        android.hardware.Camera.Parameters a17;
        return (this.f47018b == null || (a17 = a()) == null || a17.getMaxNumDetectedFaces() <= 0) ? false : true;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraFocusPositionInPreviewSupported() {
        return this.f47024h;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCurrentPreviewSizeAspectRatioMatch(int i17, int i18, boolean z17) {
        if (this.f47018b != null) {
            android.hardware.Camera.Parameters a17 = a();
            if (a17 == null) {
                return true;
            }
            com.tencent.liteav.base.util.k kVar = this.f47020d;
            if (kVar == null) {
                kVar = this.f47019c;
            }
            com.tencent.liteav.base.util.Size a18 = a(a17, kVar, i17, i18);
            if (a18 != null) {
                int i19 = a18.width * a18.height;
                com.tencent.liteav.base.util.Size size = this.f47023g;
                r1 = i19 <= size.height * size.width;
                if (z17 && java.lang.Math.abs(a18.aspectRatio() - this.f47023g.aspectRatio()) > 0.001d) {
                    r1 = false;
                }
            }
        }
        com.tencent.liteav.base.util.LiteavLog.i("CameraController", "isCurrentPreviewSizeAspectRatioMatch : ".concat(java.lang.String.valueOf(r1)));
        return r1;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isTorchSupported() {
        android.hardware.Camera.Parameters a17;
        java.util.List<java.lang.String> supportedFlashModes;
        return (this.f47018b == null || (a17 = a()) == null || (supportedFlashModes = a17.getSupportedFlashModes()) == null || !supportedFlashModes.contains("torch")) ? false : true;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isZoomSupported() {
        android.hardware.Camera.Parameters a17;
        return this.f47018b != null && (a17 = a()) != null && a17.getMaxZoom() > 0 && a17.isZoomSupported();
    }

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i17, android.hardware.Camera camera) {
        com.tencent.liteav.base.util.LiteavLog.e("CameraController", "onError, error:".concat(java.lang.String.valueOf(i17)));
        if (i17 == 1 || i17 == 2 || i17 == 100) {
            int i18 = i17 != 2 ? i17 == 100 ? 3 : 0 : 1;
            com.tencent.liteav.videoproducer.capture.CameraEventCallback cameraEventCallback = this.f47028l;
            if (cameraEventCallback != null) {
                cameraEventCallback.onCameraError(this, i18);
            }
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setCameraRotationCorrectionValue(int i17) {
        this.f47020d = com.tencent.liteav.base.util.k.b(i17) ? com.tencent.liteav.base.util.k.a(i17) : null;
        com.tencent.liteav.base.util.LiteavLog.i("CameraController", "camera rotation correction is " + this.f47020d);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setExposureCompensation(float f17) {
        this.f47030n = f17;
        this.f47029m = true;
        if (this.f47018b == null) {
            return;
        }
        this.f47029m = false;
        android.hardware.Camera.Parameters a17 = a();
        if (a17 == null) {
            return;
        }
        a17.setExposureCompensation(a(a17, f17));
        try {
            this.f47018b.setParameters(a17);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e("CameraController", "set exposure compensation failed.", th6);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setZoom(float f17) {
        this.f47032p = f17;
        this.f47031o = true;
        if (this.f47018b == null) {
            return;
        }
        this.f47031o = false;
        android.hardware.Camera.Parameters a17 = a();
        if (a17 == null) {
            return;
        }
        if (a17.getMaxZoom() <= 0 || !a17.isZoomSupported()) {
            com.tencent.liteav.base.util.LiteavLog.i("CameraController", "camera doesn't support zoom!");
            return;
        }
        int maxZoom = a17.getMaxZoom();
        try {
            a17.setZoom(com.tencent.liteav.base.util.g.a(java.lang.Math.round(f17 * maxZoom), 0, maxZoom));
            this.f47018b.setParameters(a17);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e("CameraController", "set zoom failed.", th6);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void startAutoFocusAtPosition(int i17, int i18) {
        if (!this.f47026j || this.f47018b == null) {
            return;
        }
        if (i17 >= 0) {
            com.tencent.liteav.base.util.Size size = this.f47023g;
            if (i17 < size.width && i18 >= 0 && i18 < size.height) {
                com.tencent.liteav.base.util.LiteavLog.i("CameraController", "Start auto focus at (%d, %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                try {
                    this.f47018b.cancelAutoFocus();
                    android.hardware.Camera.Parameters a17 = a();
                    if (a17 == null) {
                        return;
                    }
                    if (this.f47024h) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(new android.hardware.Camera.Area(a(i17, i18, 2.0f), 1000));
                        a17.setFocusAreas(arrayList);
                    }
                    if (this.f47025i) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(new android.hardware.Camera.Area(a(i17, i18, 3.0f), 1000));
                        a17.setMeteringAreas(arrayList2);
                    }
                    try {
                        this.f47018b.setParameters(a17);
                        this.f47018b.autoFocus(this.f47033q);
                        return;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.liteav.base.util.LiteavLog.e("CameraController", "auto focus failed.", th6);
                        return;
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.liteav.base.util.LiteavLog.e("CameraController", "cancel auto focus failed.", th7);
                    return;
                }
            }
        }
        com.tencent.liteav.base.util.LiteavLog.w("CameraController", "Start auto focus at (%d, %d) invalid ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0160 A[Catch: all -> 0x01a3, TryCatch #0 {all -> 0x01a3, blocks: (B:5:0x0013, B:7:0x0017, B:10:0x001e, B:13:0x0072, B:16:0x00a0, B:19:0x00ab, B:21:0x00b6, B:23:0x00c0, B:25:0x00c6, B:26:0x00d9, B:28:0x00dd, B:29:0x00e8, B:31:0x0105, B:32:0x014d, B:33:0x0156, B:35:0x0160, B:36:0x0177, B:38:0x016e, B:39:0x0115, B:41:0x0136, B:43:0x0145, B:46:0x019b, B:47:0x01a2), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e A[Catch: all -> 0x01a3, TryCatch #0 {all -> 0x01a3, blocks: (B:5:0x0013, B:7:0x0017, B:10:0x001e, B:13:0x0072, B:16:0x00a0, B:19:0x00ab, B:21:0x00b6, B:23:0x00c0, B:25:0x00c6, B:26:0x00d9, B:28:0x00dd, B:29:0x00e8, B:31:0x0105, B:32:0x014d, B:33:0x0156, B:35:0x0160, B:36:0x0177, B:38:0x016e, B:39:0x0115, B:41:0x0136, B:43:0x0145, B:46:0x019b, B:47:0x01a2), top: B:2:0x000f }] */
    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean startCapture(com.tencent.liteav.videoproducer.capture.CameraCaptureParams r19, android.graphics.SurfaceTexture r20, com.tencent.liteav.videoproducer.capture.CameraEventCallback r21) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.capture.a.a.startCapture(com.tencent.liteav.videoproducer.capture.CameraCaptureParams, android.graphics.SurfaceTexture, com.tencent.liteav.videoproducer.capture.CameraEventCallback):boolean");
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void stopCapture() {
        com.tencent.liteav.base.util.LiteavLog.i("CameraController", "stopCapture");
        try {
            android.hardware.Camera camera = this.f47018b;
            if (camera != null) {
                camera.setErrorCallback(null);
                this.f47018b.stopPreview();
                yj0.a.j(this.f47018b, "com/tencent/liteav/videoproducer/capture/a/a", "stopCapture", "()V", "android/hardware/Camera", "release", "()V");
                this.f47018b = null;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e("CameraController", "closeCamera fail, Exception:".concat(java.lang.String.valueOf(th6)));
        }
        this.f47022f = null;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void turnOnTorch(boolean z17) {
        java.util.List<java.lang.String> supportedFlashModes;
        if (this.f47018b == null) {
            return;
        }
        java.lang.String str = z17 ? "torch" : "off";
        android.hardware.Camera.Parameters a17 = a();
        if (a17 == null || (supportedFlashModes = a17.getSupportedFlashModes()) == null || !supportedFlashModes.contains(str)) {
            return;
        }
        try {
            a17.setFlashMode(str);
            this.f47018b.setParameters(a17);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e("CameraController", "enable torch failed.", th6);
        }
    }

    private android.graphics.Rect a(float f17, float f18, float f19) {
        int i17 = (int) (f19 * 200.0f);
        com.tencent.liteav.base.util.Size size = this.f47023g;
        int i18 = (int) (((f17 / size.width) * 2000.0f) - 1000.0f);
        int i19 = (int) (((f18 / size.height) * 2000.0f) - 1000.0f);
        int i27 = i17 / 2;
        int a17 = com.tencent.liteav.base.util.g.a(i18 - i27, -1000, 1000);
        int a18 = com.tencent.liteav.base.util.g.a(a17 + i17, -1000, 1000);
        int a19 = com.tencent.liteav.base.util.g.a(i19 - i27, -1000, 1000);
        return new android.graphics.Rect(a17, a19, a18, com.tencent.liteav.base.util.g.a(i17 + a19, -1000, 1000));
    }

    private static int a(android.hardware.Camera.Parameters parameters, float f17) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        if (minExposureCompensation == 0 && maxExposureCompensation == 0) {
            com.tencent.liteav.base.util.LiteavLog.i("CameraController", "camera doesn't support exposure compensation");
            return minExposureCompensation;
        }
        com.tencent.liteav.base.a.a.a();
        return com.tencent.liteav.base.util.g.a((int) (com.tencent.liteav.base.util.g.a(f17, -1.0f) * maxExposureCompensation), minExposureCompensation, maxExposureCompensation);
    }

    private static int a(boolean z17, android.hardware.Camera.CameraInfo cameraInfo) {
        int i17 = -1;
        int i18 = -1;
        for (int i19 = 0; i19 < android.hardware.Camera.getNumberOfCameras(); i19++) {
            android.hardware.Camera.getCameraInfo(i19, cameraInfo);
            com.tencent.liteav.base.util.LiteavLog.i("CameraController", "get camera info, index: " + i19 + ", facing: " + cameraInfo.facing);
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

    private static com.tencent.liteav.base.util.Size a(android.hardware.Camera.Parameters parameters, com.tencent.liteav.base.util.k kVar, int i17, int i18) {
        java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (supportedPreviewSizes != null) {
            for (android.hardware.Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new com.tencent.liteav.base.util.Size(size.width, size.height));
            }
        }
        return com.tencent.liteav.videoproducer.capture.b.a(arrayList, kVar, i17, i18);
    }

    private static void a(android.hardware.Camera.Parameters parameters, boolean z17) {
        java.util.List<java.lang.String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            return;
        }
        if (z17 && supportedFocusModes.contains("auto")) {
            parameters.setFocusMode("auto");
            com.tencent.liteav.base.util.LiteavLog.i("CameraController", "set focus mode to auto");
        } else if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
            com.tencent.liteav.base.util.LiteavLog.i("CameraController", "set focus mode to continuous-video");
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
            com.tencent.liteav.base.util.LiteavLog.i("CameraController", "best matched frame rate: %d", java.lang.Integer.valueOf(intValue));
            return intValue;
        }
        com.tencent.liteav.base.util.LiteavLog.e("CameraController", "supported preview frame rates is empty");
        return 1;
    }

    private android.hardware.Camera.Parameters a() {
        try {
            android.hardware.Camera camera = this.f47018b;
            if (camera != null) {
                return camera.getParameters();
            }
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e("CameraController", "getCameraParameters failed.", th6);
            return null;
        }
    }

    private static com.tencent.liteav.videoproducer.a.a[] a(java.util.List<int[]> list) {
        if (list == null || list.size() <= 0) {
            return new com.tencent.liteav.videoproducer.a.a[0];
        }
        com.tencent.liteav.videoproducer.a.a[] aVarArr = new com.tencent.liteav.videoproducer.a.a[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            int[] iArr = list.get(i17);
            if (iArr != null && iArr.length >= 2) {
                aVarArr[i17] = new com.tencent.liteav.videoproducer.a.a(iArr[0], iArr[1]);
            }
        }
        return aVarArr;
    }
}

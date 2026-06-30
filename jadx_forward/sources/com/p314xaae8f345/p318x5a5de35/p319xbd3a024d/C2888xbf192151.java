package com.p314xaae8f345.p318x5a5de35.p319xbd3a024d;

/* renamed from: com.tencent.cloud.aicamare.CameraHolder */
/* loaded from: classes14.dex */
public class C2888xbf192151 {

    /* renamed from: EVENT_AUTO_FOCUS_CAMERA */
    public static final int f9808xa6151a97 = 3;

    /* renamed from: EVENT_CHANGE_CAMERA_PARAMETER */
    public static final int f9809x5526cd9 = 8;

    /* renamed from: EVENT_CHANGE_ZOOM */
    public static final int f9810xcbe70cbd = 4;

    /* renamed from: EVENT_CLOSE_CAMERA */
    public static final int f9811xa45e5111 = 2;

    /* renamed from: EVENT_LIFE_CYCLE_START_PREVIEW */
    public static final int f9812xadd4f554 = 6;

    /* renamed from: EVENT_LIFE_CYCLE_STOP_PREVIEW */
    public static final int f9813xd2cec6a2 = 7;

    /* renamed from: EVENT_OPEN_CAMERA */
    public static final int f9814xaa7bc075 = 1;

    /* renamed from: EVENT_START_PREVIEW */
    public static final int f9815x70aaefa6 = 5;

    /* renamed from: PARAMETER_EXPOSURE_COMPENSATION */
    public static final java.lang.String f9816x6e0d345c = "camera_param_exposure";

    /* renamed from: PARAMETER_WHITE_BALANCE */
    public static final java.lang.String f9817x55228e50 = "camera_param_white_balance";

    /* renamed from: PARAMETER_ZOOM_VALUE */
    public static final java.lang.String f9818x7d34e05b = "camera_param_zoom";
    public static final java.lang.String TAG = "CameraHolder";

    /* renamed from: eventListener */
    public com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29 f9821xde76616e;

    /* renamed from: handler */
    public volatile android.os.Handler f9822x294b574a;

    /* renamed from: handlerThread */
    public android.os.HandlerThread f9823xe30131f4;

    /* renamed from: loggerCallBack */
    public com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2890x6b443cba f9825x15d95e15;

    /* renamed from: surfaceHolder */
    public android.view.SurfaceHolder f9827x62ab0b9;

    /* renamed from: surfaceTexture */
    public android.graphics.SurfaceTexture f9828x299653ae;

    /* renamed from: transformMatrix */
    public android.graphics.Matrix f9829xcd15ae4d;

    /* renamed from: isUseSurfaceHolder */
    public volatile boolean f9824x716e4bbc = true;

    /* renamed from: oldDist */
    public float f9826xadc0c46d = 1.0f;

    /* renamed from: cameraConfig */
    public com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.C2891xb691d6e7 f9819xacc682c7 = new com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.C2891xb691d6e7();

    /* renamed from: cameraHolderImp */
    public com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d f9820x88da78db = new com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d();

    /* renamed from: com.tencent.cloud.aicamare.CameraHolder$a */
    /* loaded from: classes14.dex */
    public class a extends android.os.Handler {
        public a(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            switch (message.what) {
                case 1:
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151.this.m21544xffcb6cfa();
                    return;
                case 2:
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151.this.m21541xd29319b2();
                    return;
                case 3:
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151.this.m21539xee42bc1e(message.arg1 == 1);
                    return;
                case 4:
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151.this.m21540x88504a8e(message.arg1 == 1);
                    return;
                case 5:
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151.this.m21545x94434d31();
                    return;
                case 6:
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151.this.m21543xbaad2d34();
                    return;
                case 7:
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151.this.m21542x9ab3730();
                    return;
                case 8:
                    try {
                        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151.this.m21548x5306baa5((java.util.Map) message.obj);
                        return;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151.TAG, "doEventChangeCameraParameter error " + e17.getLocalizedMessage(), com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151.this.f9825x15d95e15);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* renamed from: cleanAllListener */
    private void m21535xac77cb6c() {
        if (this.f9825x15d95e15 != null) {
            this.f9825x15d95e15 = null;
        }
        if (this.f9821xde76616e != null) {
            this.f9821xde76616e = null;
        }
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            if (dVar.f127388b != null) {
                dVar.f127388b = null;
            }
            if (dVar.f127389c != null) {
                dVar.f127389c = null;
            }
        }
    }

    /* renamed from: computePreviewMatrix */
    private android.graphics.Matrix m21536xe27e6ab2(android.view.TextureView textureView, android.graphics.Point point, android.graphics.Point point2) {
        float f17;
        float f18;
        float max;
        float f19;
        int i17;
        int i18;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        textureView.getTransform(matrix);
        matrix.reset();
        if (point.equals(point2)) {
            return matrix;
        }
        if (m21555x4f8b8507() % 180 != 0) {
            f17 = (point2.x * 1.0f) / point.y;
            f18 = (point2.y * 1.0f) / point.x;
            max = java.lang.Math.max(f17, f18);
            float f27 = point.y * max;
            f19 = point.x * max;
            i17 = (int) ((point2.x - f27) / 2.0f);
            i18 = point2.y;
        } else {
            f17 = (point2.x * 1.0f) / point.x;
            f18 = (point2.y * 1.0f) / point.y;
            max = java.lang.Math.max(f17, f18);
            float f28 = point.x * max;
            f19 = point.y * max;
            i17 = (int) ((point2.x - f28) / 2.0f);
            i18 = point2.y;
        }
        matrix.preScale(1.0f / f17, 1.0f / f18);
        matrix.postScale(max, max);
        matrix.postTranslate(i17, (int) ((i18 - f19) / 2.0f));
        return matrix;
    }

    /* renamed from: createHandlerThread */
    private void m21537x43b13a58() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("camera-preview");
        this.f9823xe30131f4 = handlerThread;
        handlerThread.start();
        this.f9822x294b574a = new com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151.a(this.f9823xe30131f4.getLooper());
    }

    /* renamed from: createTransformMatrix */
    private android.graphics.Matrix m21538xc1e52db1(android.view.TextureView textureView) {
        if (textureView == null) {
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "createTransformMatrix textureView == null", this.f9825x15d95e15);
            return null;
        }
        android.graphics.Matrix matrix = this.f9829xcd15ae4d;
        if (matrix != null) {
            return matrix;
        }
        android.hardware.Camera.Size m21551x7651b4bc = m21551x7651b4bc();
        if (m21551x7651b4bc != null) {
            android.graphics.Matrix m21536xe27e6ab2 = m21536xe27e6ab2(textureView, new android.graphics.Point(m21551x7651b4bc.width, m21551x7651b4bc.height), new android.graphics.Point(textureView.getWidth(), textureView.getHeight()));
            this.f9829xcd15ae4d = m21536xe27e6ab2;
            return m21536xe27e6ab2;
        }
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "createTransformMatrix size == null", this.f9825x15d95e15);
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29 interfaceC2889x4c929a29 = this.f9821xde76616e;
        if (interfaceC2889x4c929a29 != null) {
            interfaceC2889x4c929a29.mo21574x5a5ecd(3, "createTransformMatrix size is null");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doAutoFocus */
    public void m21539xee42bc1e(boolean z17) {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            if (dVar.f127391e) {
                dVar.a(4, "isFocusing!");
                return;
            }
            android.hardware.Camera camera = dVar.f127387a.f127393a;
            if (camera == null) {
                dVar.a(4, "current camera is null!");
                return;
            }
            try {
                android.hardware.Camera.Parameters parameters = camera.getParameters();
                if (parameters == null) {
                    dVar.a(4, "current camera  parameters is null!");
                    return;
                }
                dVar.f127391e = true;
                if ("auto".equals(parameters.getFocusMode()) && !z17) {
                    dVar.f127391e = false;
                    dVar.a(4, "there is no need change auto mode");
                    return;
                }
                if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                    parameters.setFocusMode("continuous-video");
                    camera.setParameters(parameters);
                }
                java.lang.String focusMode = parameters.getFocusMode();
                if ("continuous-video".equals(focusMode)) {
                    dVar.f127391e = false;
                    dVar.a(4, "there is no need change auto mode");
                } else {
                    if (!"auto".equals(focusMode)) {
                        parameters.setFocusMode("auto");
                        camera.setParameters(parameters);
                    }
                    camera.autoFocus(new com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.a(dVar));
                }
            } catch (java.lang.Exception e17) {
                dVar.b("there is some error with set auto mode + e: " + e17.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doChangeZoom */
    public void m21540x88504a8e(boolean z17) {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            android.hardware.Camera camera = dVar.f127387a.f127393a;
            if (camera == null) {
                dVar.a(4, "current camera is null");
                return;
            }
            try {
                android.hardware.Camera.Parameters parameters = camera.getParameters();
                if (!parameters.isZoomSupported()) {
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.a("CameraHolderImp", "this camera do not support", dVar.f127389c);
                    return;
                }
                int maxZoom = parameters.getMaxZoom();
                int zoom = parameters.getZoom();
                if (z17 && zoom < maxZoom) {
                    zoom++;
                } else if (zoom > 0) {
                    zoom--;
                }
                parameters.setZoom(zoom);
                camera.setParameters(parameters);
            } catch (java.lang.Exception e17) {
                dVar.b("doChangeZoom error: " + e17.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doCloseCamera */
    public void m21541xd29319b2() {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.a("CameraHolderImp", "do close camera", dVar.f127389c);
            android.hardware.Camera camera = dVar.f127387a.f127393a;
            if (camera == null) {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b("CameraHolderImp", "do close camera is null!", dVar.f127389c);
                return;
            }
            synchronized (com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d.class) {
                try {
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.a aVar = dVar.f127387a;
                    aVar.f127393a = null;
                    aVar.f127396d = null;
                    aVar.f127394b = 0;
                    aVar.f127395c = 0;
                    aVar.f127397e = 0;
                    camera.cancelAutoFocus();
                    camera.stopPreview();
                    camera.setOneShotPreviewCallback(null);
                    camera.setPreviewCallback(null);
                    yj0.a.j(camera, "com/tencent/cloud/aicamare/CameraHolder", "doCloseCamera", "()V", "android/hardware/Camera", "release", "()V");
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.a("CameraHolderImp", "close camera success！", dVar.f127389c);
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29 interfaceC2889x4c929a29 = dVar.f127388b;
                    if (interfaceC2889x4c929a29 != null) {
                        interfaceC2889x4c929a29.mo21571x21df6c70();
                    }
                } catch (java.lang.Exception e17) {
                    java.lang.String str = "some error happen in close e: " + e17.getMessage();
                    dVar.b(str);
                    dVar.a(2, str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doLifeOnPause */
    public void m21542x9ab3730() {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.a aVar;
        android.hardware.Camera camera;
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar == null || (aVar = dVar.f127387a) == null || (camera = aVar.f127393a) == null) {
            return;
        }
        try {
            camera.stopPreview();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "doLifeResume error: e " + e17.getLocalizedMessage(), this.f9825x15d95e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doLifeResume */
    public void m21543xbaad2d34() {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.a aVar;
        android.hardware.Camera camera;
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar == null || (aVar = dVar.f127387a) == null || (camera = aVar.f127393a) == null) {
            return;
        }
        try {
            this.f9820x88da78db.a(camera);
            yj0.a.j(camera, "com/tencent/cloud/aicamare/CameraHolder", "doLifeResume", "()V", "android/hardware/Camera", "startPreview", "()V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "doLifeResume error: e " + e17.getLocalizedMessage(), this.f9825x15d95e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doOpenCamera */
    public void m21544xffcb6cfa() {
        int i17;
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            int i18 = 0;
            if (android.hardware.Camera.getNumberOfCameras() < 0) {
                dVar.a(1, "There are not camera devices found!");
            } else {
                try {
                    boolean z17 = !dVar.f127390d.m21582xf3a427b6();
                    int numberOfCameras = android.hardware.Camera.getNumberOfCameras();
                    android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                    int i19 = 0;
                    while (true) {
                        if (i19 >= numberOfCameras) {
                            i19 = -808;
                            break;
                        }
                        android.hardware.Camera.getCameraInfo(i19, cameraInfo);
                        if (cameraInfo.facing == z17) {
                            break;
                        } else {
                            i19++;
                        }
                    }
                    if (i19 == -808) {
                        dVar.a(1, "can not find a suit camera devices!");
                    } else {
                        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.a aVar = dVar.f127387a;
                        aVar.f127394b = i19;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Integer.valueOf(i19));
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        aVar.f127393a = (android.hardware.Camera) yj0.a.k(obj, arrayList.toArray(), "com/tencent/cloud/aicamare/CameraHolder", "doOpenCamera", "()V", "android/hardware/Camera", "open", "(I)Landroid/hardware/Camera;");
                        java.lang.ref.WeakReference<android.content.Context> weakReference = dVar.f127392f;
                        android.content.Context context = weakReference == null ? null : weakReference.get();
                        if (context == null) {
                            dVar.a(1, "open camera context is null!");
                        } else {
                            int i27 = !dVar.f127390d.m21582xf3a427b6() ? 1 : 0;
                            int i28 = dVar.f127387a.f127394b;
                            android.hardware.Camera.CameraInfo cameraInfo2 = new android.hardware.Camera.CameraInfo();
                            android.hardware.Camera.getCameraInfo(i28, cameraInfo2);
                            int rotation = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
                            dVar.a("row DefaultDisplay rotation:" + (rotation * 90));
                            int i29 = 2;
                            int i37 = rotation != 1 ? rotation != 2 ? rotation != 3 ? 0 : 270 : 180 : 90;
                            int i38 = cameraInfo2.facing == 1 ? (360 - ((cameraInfo2.orientation + i37) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3)) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 : ((cameraInfo2.orientation - i37) + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CameraInfo.orientation: ");
                            sb6.append(cameraInfo2.orientation);
                            sb6.append(" | isLand: ");
                            sb6.append(dVar.f127390d.m21584xb9a56e35());
                            sb6.append(" | DeviceRotation: ");
                            sb6.append(i37);
                            sb6.append(" | FinalOrientation: ");
                            sb6.append(i38);
                            sb6.append(" | CameraFacing: ");
                            sb6.append(cameraInfo2.facing == 1 ? "Front" : "Back");
                            dVar.a(sb6.toString());
                            if (!dVar.f127390d.m21584xb9a56e35()) {
                                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.a("CameraHolderImp", "not land, and camera facing front", dVar.f127389c);
                                if (i38 == 180 && i37 == 270) {
                                    i38 = 90;
                                }
                            }
                            dVar.f127387a.f127397e = i38;
                            if (i38 == 90) {
                                i17 = 7;
                            } else if (i38 == 180) {
                                i17 = 3;
                            } else if (i38 == 270) {
                                i17 = 5;
                            } else {
                                dVar.a("camera rotate not 90 degree or 180 degree, input cameraRotate: " + i38);
                                i17 = 1;
                            }
                            if (i27 == 1) {
                                i18 = i17;
                            } else {
                                if (i17 != 1) {
                                    if (i17 == 2) {
                                        i18 = 1;
                                    } else {
                                        int i39 = 4;
                                        if (i17 != 3) {
                                            if (i17 == 4) {
                                                i18 = 3;
                                            } else {
                                                i39 = 8;
                                                if (i17 != 5) {
                                                    i29 = 6;
                                                    if (i17 == 6) {
                                                        i18 = 7;
                                                    } else if (i17 != 7) {
                                                        if (i17 == 8) {
                                                            i18 = 5;
                                                        } else {
                                                            dVar.a("[CameraSetting.transBackFacingCameraRatateTag] unsurported rotateTag: " + i17);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i18 = i39;
                                    }
                                }
                                i18 = i29;
                            }
                            dVar.a("cameraFacing: " + i27 + " rotateTag: " + i18);
                            dVar.f127387a.f127395c = i18;
                            i18 = 1;
                        }
                    }
                } catch (java.lang.RuntimeException e17) {
                    dVar.a(1, "open camera happen runtime error: " + e17.getLocalizedMessage());
                }
            }
            if (i18 == 0) {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b("CameraHolderImp", "localOpenCamera fail!", dVar.f127389c);
                return;
            }
            if (!dVar.a(dVar.f127390d.m21580x2e38f659(), dVar.f127390d.m21579x7f16daf4())) {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b("CameraHolderImp", "initCamera fail!", dVar.f127389c);
                return;
            }
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29 interfaceC2889x4c929a29 = dVar.f127388b;
            if (interfaceC2889x4c929a29 != null) {
                interfaceC2889x4c929a29.mo21572x771d13be();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doStartPreview */
    public void m21545x94434d31() {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            boolean z17 = this.f9824x716e4bbc;
            android.view.SurfaceHolder surfaceHolder = this.f9827x62ab0b9;
            android.graphics.SurfaceTexture surfaceTexture = this.f9828x299653ae;
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.a("CameraHolderImp", "start camera preview", dVar.f127389c);
            android.hardware.Camera camera = dVar.f127387a.f127393a;
            if (camera == null) {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b("CameraHolderImp", "start preview with currentCamera is null!", dVar.f127389c);
                dVar.a(6, "current camera is null!");
                return;
            }
            if (!dVar.a(camera)) {
                dVar.a(6, "add camera preview fail!");
                return;
            }
            if (z17 && surfaceHolder != null) {
                try {
                    camera.setPreviewDisplay(surfaceHolder);
                } catch (java.io.IOException | java.lang.RuntimeException e17) {
                    dVar.a(6, "set preview display error : " + e17.getMessage());
                    return;
                }
            }
            if (!z17 && surfaceTexture != null) {
                camera.setPreviewTexture(surfaceTexture);
            }
            yj0.a.j(camera, "com/tencent/cloud/aicamare/CameraHolder", "doStartPreview", "()V", "android/hardware/Camera", "startPreview", "()V");
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.a("CameraHolderImp", "start camera preview success", dVar.f127389c);
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29 interfaceC2889x4c929a29 = dVar.f127388b;
            if (interfaceC2889x4c929a29 != null) {
                interfaceC2889x4c929a29.mo21575xcf684919();
            } else {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b("CameraHolderImp", "start preview fail eventListener is null", dVar.f127389c);
            }
        }
    }

    /* renamed from: stopCurrentThread */
    private void m21546xeff3b401() {
        if (this.f9822x294b574a == null) {
            return;
        }
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.a(TAG, "clean handler and thread", this.f9825x15d95e15);
        this.f9822x294b574a.removeMessages(1);
        this.f9822x294b574a.removeMessages(2);
        this.f9822x294b574a.removeMessages(3);
        this.f9822x294b574a.removeMessages(4);
        this.f9822x294b574a.removeMessages(5);
        this.f9822x294b574a.removeMessages(7);
        this.f9822x294b574a.removeMessages(6);
        this.f9822x294b574a = null;
        android.os.HandlerThread handlerThread = this.f9823xe30131f4;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f9823xe30131f4.quitSafely();
    }

    /* renamed from: closeCamera */
    public void m21547xedf4333d() {
        if (this.f9819xacc682c7.m21585x9e2d0ded()) {
            m21541xd29319b2();
            return;
        }
        if (this.f9822x294b574a == null) {
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "close camera handler == null", this.f9825x15d95e15);
            m21541xd29319b2();
        } else {
            android.os.Message obtainMessage = this.f9822x294b574a.obtainMessage();
            obtainMessage.what = 2;
            this.f9822x294b574a.sendMessage(obtainMessage);
        }
    }

    /* renamed from: doEventChangeCameraParameter */
    public void m21548x5306baa5(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            android.hardware.Camera camera = dVar.f127387a.f127393a;
            if (camera == null || map == null) {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b("CameraHolderImp", "setEventChangeCameraParameter, currentCamera is null or parameter is null", dVar.f127389c);
                return;
            }
            try {
                android.hardware.Camera.Parameters parameters = camera.getParameters();
                if (map.containsKey(f9816x6e0d345c)) {
                    parameters.setExposureCompensation(((java.lang.Integer) map.get(f9816x6e0d345c)).intValue());
                }
                if (map.containsKey(f9818x7d34e05b)) {
                    parameters.setZoom(((java.lang.Integer) map.get(f9818x7d34e05b)).intValue());
                }
                if (map.containsKey(f9817x55228e50)) {
                    parameters.setWhiteBalance((java.lang.String) map.get(f9817x55228e50));
                }
                camera.setParameters(parameters);
            } catch (java.lang.RuntimeException e17) {
                dVar.b("changeCameraExposureInfo:" + e17.getLocalizedMessage());
            }
        }
    }

    /* renamed from: doFocus */
    public void m21549x6b67770d(boolean z17) {
        if (this.f9819xacc682c7.m21585x9e2d0ded()) {
            m21539xee42bc1e(z17);
            return;
        }
        if (this.f9822x294b574a == null) {
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "do focus handler == null", this.f9825x15d95e15);
            return;
        }
        android.os.Message obtainMessage = this.f9822x294b574a.obtainMessage();
        obtainMessage.what = 3;
        obtainMessage.arg1 = z17 ? 1 : 0;
        this.f9822x294b574a.sendMessage(obtainMessage);
    }

    /* renamed from: getCameraId */
    public int m21550x72efd496() {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            return dVar.f127387a.f127394b;
        }
        return 0;
    }

    /* renamed from: getCameraSize */
    public android.hardware.Camera.Size m21551x7651b4bc() {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            return dVar.f127387a.f127396d;
        }
        return null;
    }

    /* renamed from: getCurrentCamera */
    public android.hardware.Camera m21552x26ba6a48() {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            return dVar.f127387a.f127393a;
        }
        return null;
    }

    /* renamed from: getCurrentCameraInfo */
    public com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.a m21553x138edf16() {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            return dVar.f127387a;
        }
        return null;
    }

    /* renamed from: getCurrentRotate */
    public int m21554x411b847e() {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            return dVar.f127387a.f127395c;
        }
        return 0;
    }

    /* renamed from: getDisplayRotate */
    public int m21555x4f8b8507() {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            return dVar.f127387a.f127397e;
        }
        return 0;
    }

    /* renamed from: initCameraHolder */
    public void m21556x978b6e61(android.content.Context context, com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.C2891xb691d6e7 c2891xb691d6e7) {
        if (c2891xb691d6e7 != null) {
            this.f9819xacc682c7 = c2891xb691d6e7;
        }
        this.f9820x88da78db.a(context);
        this.f9820x88da78db.f127390d = c2891xb691d6e7;
        if (c2891xb691d6e7.m21585x9e2d0ded()) {
            return;
        }
        m21537x43b13a58();
    }

    /* renamed from: onTouchEvent */
    public void m21557x667eb1da(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            m21549x6b67770d(true);
            return;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 2) {
            if (action != 5) {
                return;
            }
            this.f9826xadc0c46d = com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.a.a(motionEvent);
            return;
        }
        float a17 = com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.a.a(motionEvent);
        float f17 = this.f9826xadc0c46d;
        if (a17 > f17) {
            m21569xbd3468d8(true);
        } else if (a17 < f17) {
            m21569xbd3468d8(false);
        }
        this.f9826xadc0c46d = a17;
    }

    /* renamed from: openCamera */
    public void m21558xf86b760f(android.content.Context context) {
        this.f9820x88da78db.a(context);
        if (this.f9819xacc682c7.m21585x9e2d0ded()) {
            m21544xffcb6cfa();
        } else {
            if (this.f9822x294b574a == null) {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "open camera handler == null", this.f9825x15d95e15);
                return;
            }
            android.os.Message obtainMessage = this.f9822x294b574a.obtainMessage();
            obtainMessage.what = 1;
            this.f9822x294b574a.sendMessage(obtainMessage);
        }
    }

    /* renamed from: release */
    public void m21559x41012807() {
        m21541xd29319b2();
        m21546xeff3b401();
        m21535xac77cb6c();
        if (this.f9828x299653ae != null) {
            this.f9828x299653ae = null;
        }
        if (this.f9827x62ab0b9 != null) {
            this.f9827x62ab0b9 = null;
        }
        if (this.f9829xcd15ae4d != null) {
            this.f9829xcd15ae4d = null;
        }
    }

    /* renamed from: setEventChangeCameraParameter */
    public void m21560xf150bbbc(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (this.f9819xacc682c7.m21585x9e2d0ded()) {
            m21548x5306baa5(map);
            return;
        }
        if (this.f9822x294b574a == null) {
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "set camera parameter handler == null", this.f9825x15d95e15);
            return;
        }
        android.os.Message obtainMessage = this.f9822x294b574a.obtainMessage();
        obtainMessage.what = 8;
        obtainMessage.obj = map;
        this.f9822x294b574a.sendMessage(obtainMessage);
    }

    /* renamed from: setEventListener */
    public void m21561x2eac842c(com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29 interfaceC2889x4c929a29) {
        this.f9821xde76616e = interfaceC2889x4c929a29;
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            dVar.f127388b = interfaceC2889x4c929a29;
        }
    }

    /* renamed from: setLoggerCallBack */
    public void m21563xcc679317(com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2890x6b443cba interfaceC2890x6b443cba, com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.LOG_LEVEL log_level) {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.f127398a = log_level;
        this.f9825x15d95e15 = interfaceC2890x6b443cba;
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar = this.f9820x88da78db;
        if (dVar != null) {
            dVar.f127389c = interfaceC2890x6b443cba;
        }
    }

    /* renamed from: setResolution */
    public boolean m21564xbd067eae(int i17, int i18) {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.a(TAG, "set resolution width: " + i17 + ", height: " + i18, this.f9825x15d95e15);
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.C2891xb691d6e7 c2891xb691d6e7 = this.f9819xacc682c7;
        if (c2891xb691d6e7 != null && this.f9820x88da78db != null) {
            c2891xb691d6e7.m21596x28f15765(i17);
            this.f9819xacc682c7.m21595xdb6a9b68(i18);
            return this.f9820x88da78db.a(i17, i18);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("camera config is null: ");
        sb6.append(this.f9819xacc682c7 == null);
        sb6.append(", holder is null: ");
        sb6.append(this.f9820x88da78db == null);
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, sb6.toString(), this.f9825x15d95e15);
        return false;
    }

    /* renamed from: startPreview */
    public void m21565xe5056506(android.view.SurfaceHolder surfaceHolder) {
        this.f9827x62ab0b9 = surfaceHolder;
        this.f9824x716e4bbc = true;
        if (this.f9819xacc682c7.m21585x9e2d0ded()) {
            m21545x94434d31();
        } else {
            if (this.f9822x294b574a == null) {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "start camera preview handler == null", this.f9825x15d95e15);
                return;
            }
            android.os.Message obtainMessage = this.f9822x294b574a.obtainMessage();
            obtainMessage.what = 5;
            this.f9822x294b574a.sendMessage(obtainMessage);
        }
    }

    /* renamed from: startPreviewByResume */
    public void m21566xe3fd468a() {
        if (this.f9819xacc682c7.m21585x9e2d0ded()) {
            m21543xbaad2d34();
        } else {
            if (this.f9822x294b574a == null) {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "do focus handler == null", this.f9825x15d95e15);
                return;
            }
            android.os.Message obtainMessage = this.f9822x294b574a.obtainMessage();
            obtainMessage.what = 6;
            this.f9822x294b574a.sendMessage(obtainMessage);
        }
    }

    /* renamed from: startPreviewWithTexture */
    public void m21567xb74e748f(android.view.TextureView textureView, android.graphics.SurfaceTexture surfaceTexture) {
        if (textureView != null) {
            m21538xc1e52db1(textureView);
            android.graphics.Matrix matrix = this.f9829xcd15ae4d;
            if (matrix != null) {
                textureView.setTransform(matrix);
            } else {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "transformMatrix do not create is null", this.f9825x15d95e15);
            }
        }
        this.f9824x716e4bbc = false;
        this.f9828x299653ae = surfaceTexture;
        if (this.f9819xacc682c7.m21585x9e2d0ded()) {
            m21545x94434d31();
        } else {
            if (this.f9822x294b574a == null) {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "start camera preview handler == null", this.f9825x15d95e15);
                return;
            }
            android.os.Message obtainMessage = this.f9822x294b574a.obtainMessage();
            obtainMessage.what = 5;
            this.f9822x294b574a.sendMessage(obtainMessage);
        }
    }

    /* renamed from: stopPreviewByOnPause */
    public void m21568x2d4e4c3a() {
        if (this.f9819xacc682c7.m21585x9e2d0ded()) {
            m21542x9ab3730();
        } else {
            if (this.f9822x294b574a == null) {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "do focus handler == null", this.f9825x15d95e15);
                return;
            }
            android.os.Message obtainMessage = this.f9822x294b574a.obtainMessage();
            obtainMessage.what = 7;
            this.f9822x294b574a.sendMessage(obtainMessage);
        }
    }

    /* renamed from: zoomCamera */
    public void m21569xbd3468d8(boolean z17) {
        if (this.f9819xacc682c7.m21585x9e2d0ded()) {
            m21540x88504a8e(z17);
            return;
        }
        if (this.f9822x294b574a == null) {
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b(TAG, "zoom camera handler == null", this.f9825x15d95e15);
            return;
        }
        android.os.Message obtainMessage = this.f9822x294b574a.obtainMessage();
        obtainMessage.what = 4;
        obtainMessage.arg1 = z17 ? 1 : 0;
        this.f9822x294b574a.sendMessage(obtainMessage);
    }

    /* renamed from: setLoggerCallBack */
    public void m21562xcc679317(com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2890x6b443cba interfaceC2890x6b443cba) {
        m21563xcc679317(interfaceC2890x6b443cba, com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.LOG_LEVEL.LEVEL_VERBOSE);
    }
}

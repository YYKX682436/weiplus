package com.tencent.cloud.aicamare;

/* loaded from: classes14.dex */
public class CameraHolder {
    public static final int EVENT_AUTO_FOCUS_CAMERA = 3;
    public static final int EVENT_CHANGE_CAMERA_PARAMETER = 8;
    public static final int EVENT_CHANGE_ZOOM = 4;
    public static final int EVENT_CLOSE_CAMERA = 2;
    public static final int EVENT_LIFE_CYCLE_START_PREVIEW = 6;
    public static final int EVENT_LIFE_CYCLE_STOP_PREVIEW = 7;
    public static final int EVENT_OPEN_CAMERA = 1;
    public static final int EVENT_START_PREVIEW = 5;
    public static final java.lang.String PARAMETER_EXPOSURE_COMPENSATION = "camera_param_exposure";
    public static final java.lang.String PARAMETER_WHITE_BALANCE = "camera_param_white_balance";
    public static final java.lang.String PARAMETER_ZOOM_VALUE = "camera_param_zoom";
    public static final java.lang.String TAG = "CameraHolder";
    public com.tencent.cloud.aicamare.callback.CameraEventListener eventListener;
    public volatile android.os.Handler handler;
    public android.os.HandlerThread handlerThread;
    public com.tencent.cloud.aicamare.callback.CameraLoggerCallBack loggerCallBack;
    public android.view.SurfaceHolder surfaceHolder;
    public android.graphics.SurfaceTexture surfaceTexture;
    public android.graphics.Matrix transformMatrix;
    public volatile boolean isUseSurfaceHolder = true;
    public float oldDist = 1.0f;
    public com.tencent.cloud.aicamare.entity.CameraConfig cameraConfig = new com.tencent.cloud.aicamare.entity.CameraConfig();
    public com.tencent.cloud.aicamare.d cameraHolderImp = new com.tencent.cloud.aicamare.d();

    /* loaded from: classes14.dex */
    public class a extends android.os.Handler {
        public a(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            switch (message.what) {
                case 1:
                    com.tencent.cloud.aicamare.CameraHolder.this.doOpenCamera();
                    return;
                case 2:
                    com.tencent.cloud.aicamare.CameraHolder.this.doCloseCamera();
                    return;
                case 3:
                    com.tencent.cloud.aicamare.CameraHolder.this.doAutoFocus(message.arg1 == 1);
                    return;
                case 4:
                    com.tencent.cloud.aicamare.CameraHolder.this.doChangeZoom(message.arg1 == 1);
                    return;
                case 5:
                    com.tencent.cloud.aicamare.CameraHolder.this.doStartPreview();
                    return;
                case 6:
                    com.tencent.cloud.aicamare.CameraHolder.this.doLifeResume();
                    return;
                case 7:
                    com.tencent.cloud.aicamare.CameraHolder.this.doLifeOnPause();
                    return;
                case 8:
                    try {
                        com.tencent.cloud.aicamare.CameraHolder.this.doEventChangeCameraParameter((java.util.Map) message.obj);
                        return;
                    } catch (java.lang.Exception e17) {
                        com.tencent.cloud.aicamare.util.CameraLogger.b(com.tencent.cloud.aicamare.CameraHolder.TAG, "doEventChangeCameraParameter error " + e17.getLocalizedMessage(), com.tencent.cloud.aicamare.CameraHolder.this.loggerCallBack);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    private void cleanAllListener() {
        if (this.loggerCallBack != null) {
            this.loggerCallBack = null;
        }
        if (this.eventListener != null) {
            this.eventListener = null;
        }
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            if (dVar.f45855b != null) {
                dVar.f45855b = null;
            }
            if (dVar.f45856c != null) {
                dVar.f45856c = null;
            }
        }
    }

    private android.graphics.Matrix computePreviewMatrix(android.view.TextureView textureView, android.graphics.Point point, android.graphics.Point point2) {
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
        if (getDisplayRotate() % 180 != 0) {
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

    private void createHandlerThread() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("camera-preview");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new com.tencent.cloud.aicamare.CameraHolder.a(this.handlerThread.getLooper());
    }

    private android.graphics.Matrix createTransformMatrix(android.view.TextureView textureView) {
        if (textureView == null) {
            com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "createTransformMatrix textureView == null", this.loggerCallBack);
            return null;
        }
        android.graphics.Matrix matrix = this.transformMatrix;
        if (matrix != null) {
            return matrix;
        }
        android.hardware.Camera.Size cameraSize = getCameraSize();
        if (cameraSize != null) {
            android.graphics.Matrix computePreviewMatrix = computePreviewMatrix(textureView, new android.graphics.Point(cameraSize.width, cameraSize.height), new android.graphics.Point(textureView.getWidth(), textureView.getHeight()));
            this.transformMatrix = computePreviewMatrix;
            return computePreviewMatrix;
        }
        com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "createTransformMatrix size == null", this.loggerCallBack);
        com.tencent.cloud.aicamare.callback.CameraEventListener cameraEventListener = this.eventListener;
        if (cameraEventListener != null) {
            cameraEventListener.onEventError(3, "createTransformMatrix size is null");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAutoFocus(boolean z17) {
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            if (dVar.f45858e) {
                dVar.a(4, "isFocusing!");
                return;
            }
            android.hardware.Camera camera = dVar.f45854a.f45860a;
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
                dVar.f45858e = true;
                if ("auto".equals(parameters.getFocusMode()) && !z17) {
                    dVar.f45858e = false;
                    dVar.a(4, "there is no need change auto mode");
                    return;
                }
                if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                    parameters.setFocusMode("continuous-video");
                    camera.setParameters(parameters);
                }
                java.lang.String focusMode = parameters.getFocusMode();
                if ("continuous-video".equals(focusMode)) {
                    dVar.f45858e = false;
                    dVar.a(4, "there is no need change auto mode");
                } else {
                    if (!"auto".equals(focusMode)) {
                        parameters.setFocusMode("auto");
                        camera.setParameters(parameters);
                    }
                    camera.autoFocus(new com.tencent.cloud.aicamare.a(dVar));
                }
            } catch (java.lang.Exception e17) {
                dVar.b("there is some error with set auto mode + e: " + e17.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doChangeZoom(boolean z17) {
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            android.hardware.Camera camera = dVar.f45854a.f45860a;
            if (camera == null) {
                dVar.a(4, "current camera is null");
                return;
            }
            try {
                android.hardware.Camera.Parameters parameters = camera.getParameters();
                if (!parameters.isZoomSupported()) {
                    com.tencent.cloud.aicamare.util.CameraLogger.a("CameraHolderImp", "this camera do not support", dVar.f45856c);
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
    public void doCloseCamera() {
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            com.tencent.cloud.aicamare.util.CameraLogger.a("CameraHolderImp", "do close camera", dVar.f45856c);
            android.hardware.Camera camera = dVar.f45854a.f45860a;
            if (camera == null) {
                com.tencent.cloud.aicamare.util.CameraLogger.b("CameraHolderImp", "do close camera is null!", dVar.f45856c);
                return;
            }
            synchronized (com.tencent.cloud.aicamare.d.class) {
                try {
                    com.tencent.cloud.aicamare.entity.a aVar = dVar.f45854a;
                    aVar.f45860a = null;
                    aVar.f45863d = null;
                    aVar.f45861b = 0;
                    aVar.f45862c = 0;
                    aVar.f45864e = 0;
                    camera.cancelAutoFocus();
                    camera.stopPreview();
                    camera.setOneShotPreviewCallback(null);
                    camera.setPreviewCallback(null);
                    yj0.a.j(camera, "com/tencent/cloud/aicamare/CameraHolder", "doCloseCamera", "()V", "android/hardware/Camera", "release", "()V");
                    com.tencent.cloud.aicamare.util.CameraLogger.a("CameraHolderImp", "close camera success！", dVar.f45856c);
                    com.tencent.cloud.aicamare.callback.CameraEventListener cameraEventListener = dVar.f45855b;
                    if (cameraEventListener != null) {
                        cameraEventListener.onCameraClosed();
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
    public void doLifeOnPause() {
        com.tencent.cloud.aicamare.entity.a aVar;
        android.hardware.Camera camera;
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar == null || (aVar = dVar.f45854a) == null || (camera = aVar.f45860a) == null) {
            return;
        }
        try {
            camera.stopPreview();
        } catch (java.lang.Exception e17) {
            com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "doLifeResume error: e " + e17.getLocalizedMessage(), this.loggerCallBack);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doLifeResume() {
        com.tencent.cloud.aicamare.entity.a aVar;
        android.hardware.Camera camera;
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar == null || (aVar = dVar.f45854a) == null || (camera = aVar.f45860a) == null) {
            return;
        }
        try {
            this.cameraHolderImp.a(camera);
            yj0.a.j(camera, "com/tencent/cloud/aicamare/CameraHolder", "doLifeResume", "()V", "android/hardware/Camera", "startPreview", "()V");
        } catch (java.lang.Exception e17) {
            com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "doLifeResume error: e " + e17.getLocalizedMessage(), this.loggerCallBack);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOpenCamera() {
        int i17;
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            int i18 = 0;
            if (android.hardware.Camera.getNumberOfCameras() < 0) {
                dVar.a(1, "There are not camera devices found!");
            } else {
                try {
                    boolean z17 = !dVar.f45857d.isBackCamera();
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
                        com.tencent.cloud.aicamare.entity.a aVar = dVar.f45854a;
                        aVar.f45861b = i19;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Integer.valueOf(i19));
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        aVar.f45860a = (android.hardware.Camera) yj0.a.k(obj, arrayList.toArray(), "com/tencent/cloud/aicamare/CameraHolder", "doOpenCamera", "()V", "android/hardware/Camera", "open", "(I)Landroid/hardware/Camera;");
                        java.lang.ref.WeakReference<android.content.Context> weakReference = dVar.f45859f;
                        android.content.Context context = weakReference == null ? null : weakReference.get();
                        if (context == null) {
                            dVar.a(1, "open camera context is null!");
                        } else {
                            int i27 = !dVar.f45857d.isBackCamera() ? 1 : 0;
                            int i28 = dVar.f45854a.f45861b;
                            android.hardware.Camera.CameraInfo cameraInfo2 = new android.hardware.Camera.CameraInfo();
                            android.hardware.Camera.getCameraInfo(i28, cameraInfo2);
                            int rotation = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
                            dVar.a("row DefaultDisplay rotation:" + (rotation * 90));
                            int i29 = 2;
                            int i37 = rotation != 1 ? rotation != 2 ? rotation != 3 ? 0 : 270 : 180 : 90;
                            int i38 = cameraInfo2.facing == 1 ? (360 - ((cameraInfo2.orientation + i37) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1)) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 : ((cameraInfo2.orientation - i37) + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CameraInfo.orientation: ");
                            sb6.append(cameraInfo2.orientation);
                            sb6.append(" | isLand: ");
                            sb6.append(dVar.f45857d.isLand());
                            sb6.append(" | DeviceRotation: ");
                            sb6.append(i37);
                            sb6.append(" | FinalOrientation: ");
                            sb6.append(i38);
                            sb6.append(" | CameraFacing: ");
                            sb6.append(cameraInfo2.facing == 1 ? "Front" : "Back");
                            dVar.a(sb6.toString());
                            if (!dVar.f45857d.isLand()) {
                                com.tencent.cloud.aicamare.util.CameraLogger.a("CameraHolderImp", "not land, and camera facing front", dVar.f45856c);
                                if (i38 == 180 && i37 == 270) {
                                    i38 = 90;
                                }
                            }
                            dVar.f45854a.f45864e = i38;
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
                            dVar.f45854a.f45862c = i18;
                            i18 = 1;
                        }
                    }
                } catch (java.lang.RuntimeException e17) {
                    dVar.a(1, "open camera happen runtime error: " + e17.getLocalizedMessage());
                }
            }
            if (i18 == 0) {
                com.tencent.cloud.aicamare.util.CameraLogger.b("CameraHolderImp", "localOpenCamera fail!", dVar.f45856c);
                return;
            }
            if (!dVar.a(dVar.f45857d.getPreWidth(), dVar.f45857d.getPreHeight())) {
                com.tencent.cloud.aicamare.util.CameraLogger.b("CameraHolderImp", "initCamera fail!", dVar.f45856c);
                return;
            }
            com.tencent.cloud.aicamare.callback.CameraEventListener cameraEventListener = dVar.f45855b;
            if (cameraEventListener != null) {
                cameraEventListener.onCameraSucceed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doStartPreview() {
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            boolean z17 = this.isUseSurfaceHolder;
            android.view.SurfaceHolder surfaceHolder = this.surfaceHolder;
            android.graphics.SurfaceTexture surfaceTexture = this.surfaceTexture;
            com.tencent.cloud.aicamare.util.CameraLogger.a("CameraHolderImp", "start camera preview", dVar.f45856c);
            android.hardware.Camera camera = dVar.f45854a.f45860a;
            if (camera == null) {
                com.tencent.cloud.aicamare.util.CameraLogger.b("CameraHolderImp", "start preview with currentCamera is null!", dVar.f45856c);
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
            com.tencent.cloud.aicamare.util.CameraLogger.a("CameraHolderImp", "start camera preview success", dVar.f45856c);
            com.tencent.cloud.aicamare.callback.CameraEventListener cameraEventListener = dVar.f45855b;
            if (cameraEventListener != null) {
                cameraEventListener.onPreviewSucceed();
            } else {
                com.tencent.cloud.aicamare.util.CameraLogger.b("CameraHolderImp", "start preview fail eventListener is null", dVar.f45856c);
            }
        }
    }

    private void stopCurrentThread() {
        if (this.handler == null) {
            return;
        }
        com.tencent.cloud.aicamare.util.CameraLogger.a(TAG, "clean handler and thread", this.loggerCallBack);
        this.handler.removeMessages(1);
        this.handler.removeMessages(2);
        this.handler.removeMessages(3);
        this.handler.removeMessages(4);
        this.handler.removeMessages(5);
        this.handler.removeMessages(7);
        this.handler.removeMessages(6);
        this.handler = null;
        android.os.HandlerThread handlerThread = this.handlerThread;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.handlerThread.quitSafely();
    }

    public void closeCamera() {
        if (this.cameraConfig.isMainThread()) {
            doCloseCamera();
            return;
        }
        if (this.handler == null) {
            com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "close camera handler == null", this.loggerCallBack);
            doCloseCamera();
        } else {
            android.os.Message obtainMessage = this.handler.obtainMessage();
            obtainMessage.what = 2;
            this.handler.sendMessage(obtainMessage);
        }
    }

    public void doEventChangeCameraParameter(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            android.hardware.Camera camera = dVar.f45854a.f45860a;
            if (camera == null || map == null) {
                com.tencent.cloud.aicamare.util.CameraLogger.b("CameraHolderImp", "setEventChangeCameraParameter, currentCamera is null or parameter is null", dVar.f45856c);
                return;
            }
            try {
                android.hardware.Camera.Parameters parameters = camera.getParameters();
                if (map.containsKey(PARAMETER_EXPOSURE_COMPENSATION)) {
                    parameters.setExposureCompensation(((java.lang.Integer) map.get(PARAMETER_EXPOSURE_COMPENSATION)).intValue());
                }
                if (map.containsKey(PARAMETER_ZOOM_VALUE)) {
                    parameters.setZoom(((java.lang.Integer) map.get(PARAMETER_ZOOM_VALUE)).intValue());
                }
                if (map.containsKey(PARAMETER_WHITE_BALANCE)) {
                    parameters.setWhiteBalance((java.lang.String) map.get(PARAMETER_WHITE_BALANCE));
                }
                camera.setParameters(parameters);
            } catch (java.lang.RuntimeException e17) {
                dVar.b("changeCameraExposureInfo:" + e17.getLocalizedMessage());
            }
        }
    }

    public void doFocus(boolean z17) {
        if (this.cameraConfig.isMainThread()) {
            doAutoFocus(z17);
            return;
        }
        if (this.handler == null) {
            com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "do focus handler == null", this.loggerCallBack);
            return;
        }
        android.os.Message obtainMessage = this.handler.obtainMessage();
        obtainMessage.what = 3;
        obtainMessage.arg1 = z17 ? 1 : 0;
        this.handler.sendMessage(obtainMessage);
    }

    public int getCameraId() {
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            return dVar.f45854a.f45861b;
        }
        return 0;
    }

    public android.hardware.Camera.Size getCameraSize() {
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            return dVar.f45854a.f45863d;
        }
        return null;
    }

    public android.hardware.Camera getCurrentCamera() {
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            return dVar.f45854a.f45860a;
        }
        return null;
    }

    public com.tencent.cloud.aicamare.entity.a getCurrentCameraInfo() {
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            return dVar.f45854a;
        }
        return null;
    }

    public int getCurrentRotate() {
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            return dVar.f45854a.f45862c;
        }
        return 0;
    }

    public int getDisplayRotate() {
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            return dVar.f45854a.f45864e;
        }
        return 0;
    }

    public void initCameraHolder(android.content.Context context, com.tencent.cloud.aicamare.entity.CameraConfig cameraConfig) {
        if (cameraConfig != null) {
            this.cameraConfig = cameraConfig;
        }
        this.cameraHolderImp.a(context);
        this.cameraHolderImp.f45857d = cameraConfig;
        if (cameraConfig.isMainThread()) {
            return;
        }
        createHandlerThread();
    }

    public void onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            doFocus(true);
            return;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 2) {
            if (action != 5) {
                return;
            }
            this.oldDist = com.tencent.cloud.aicamare.util.a.a(motionEvent);
            return;
        }
        float a17 = com.tencent.cloud.aicamare.util.a.a(motionEvent);
        float f17 = this.oldDist;
        if (a17 > f17) {
            zoomCamera(true);
        } else if (a17 < f17) {
            zoomCamera(false);
        }
        this.oldDist = a17;
    }

    public void openCamera(android.content.Context context) {
        this.cameraHolderImp.a(context);
        if (this.cameraConfig.isMainThread()) {
            doOpenCamera();
        } else {
            if (this.handler == null) {
                com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "open camera handler == null", this.loggerCallBack);
                return;
            }
            android.os.Message obtainMessage = this.handler.obtainMessage();
            obtainMessage.what = 1;
            this.handler.sendMessage(obtainMessage);
        }
    }

    public void release() {
        doCloseCamera();
        stopCurrentThread();
        cleanAllListener();
        if (this.surfaceTexture != null) {
            this.surfaceTexture = null;
        }
        if (this.surfaceHolder != null) {
            this.surfaceHolder = null;
        }
        if (this.transformMatrix != null) {
            this.transformMatrix = null;
        }
    }

    public void setEventChangeCameraParameter(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (this.cameraConfig.isMainThread()) {
            doEventChangeCameraParameter(map);
            return;
        }
        if (this.handler == null) {
            com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "set camera parameter handler == null", this.loggerCallBack);
            return;
        }
        android.os.Message obtainMessage = this.handler.obtainMessage();
        obtainMessage.what = 8;
        obtainMessage.obj = map;
        this.handler.sendMessage(obtainMessage);
    }

    public void setEventListener(com.tencent.cloud.aicamare.callback.CameraEventListener cameraEventListener) {
        this.eventListener = cameraEventListener;
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            dVar.f45855b = cameraEventListener;
        }
    }

    public void setLoggerCallBack(com.tencent.cloud.aicamare.callback.CameraLoggerCallBack cameraLoggerCallBack, com.tencent.cloud.aicamare.util.CameraLogger.LOG_LEVEL log_level) {
        com.tencent.cloud.aicamare.util.CameraLogger.f45865a = log_level;
        this.loggerCallBack = cameraLoggerCallBack;
        com.tencent.cloud.aicamare.d dVar = this.cameraHolderImp;
        if (dVar != null) {
            dVar.f45856c = cameraLoggerCallBack;
        }
    }

    public boolean setResolution(int i17, int i18) {
        com.tencent.cloud.aicamare.util.CameraLogger.a(TAG, "set resolution width: " + i17 + ", height: " + i18, this.loggerCallBack);
        com.tencent.cloud.aicamare.entity.CameraConfig cameraConfig = this.cameraConfig;
        if (cameraConfig != null && this.cameraHolderImp != null) {
            cameraConfig.setPreWidth(i17);
            this.cameraConfig.setPreHeight(i18);
            return this.cameraHolderImp.a(i17, i18);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("camera config is null: ");
        sb6.append(this.cameraConfig == null);
        sb6.append(", holder is null: ");
        sb6.append(this.cameraHolderImp == null);
        com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, sb6.toString(), this.loggerCallBack);
        return false;
    }

    public void startPreview(android.view.SurfaceHolder surfaceHolder) {
        this.surfaceHolder = surfaceHolder;
        this.isUseSurfaceHolder = true;
        if (this.cameraConfig.isMainThread()) {
            doStartPreview();
        } else {
            if (this.handler == null) {
                com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "start camera preview handler == null", this.loggerCallBack);
                return;
            }
            android.os.Message obtainMessage = this.handler.obtainMessage();
            obtainMessage.what = 5;
            this.handler.sendMessage(obtainMessage);
        }
    }

    public void startPreviewByResume() {
        if (this.cameraConfig.isMainThread()) {
            doLifeResume();
        } else {
            if (this.handler == null) {
                com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "do focus handler == null", this.loggerCallBack);
                return;
            }
            android.os.Message obtainMessage = this.handler.obtainMessage();
            obtainMessage.what = 6;
            this.handler.sendMessage(obtainMessage);
        }
    }

    public void startPreviewWithTexture(android.view.TextureView textureView, android.graphics.SurfaceTexture surfaceTexture) {
        if (textureView != null) {
            createTransformMatrix(textureView);
            android.graphics.Matrix matrix = this.transformMatrix;
            if (matrix != null) {
                textureView.setTransform(matrix);
            } else {
                com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "transformMatrix do not create is null", this.loggerCallBack);
            }
        }
        this.isUseSurfaceHolder = false;
        this.surfaceTexture = surfaceTexture;
        if (this.cameraConfig.isMainThread()) {
            doStartPreview();
        } else {
            if (this.handler == null) {
                com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "start camera preview handler == null", this.loggerCallBack);
                return;
            }
            android.os.Message obtainMessage = this.handler.obtainMessage();
            obtainMessage.what = 5;
            this.handler.sendMessage(obtainMessage);
        }
    }

    public void stopPreviewByOnPause() {
        if (this.cameraConfig.isMainThread()) {
            doLifeOnPause();
        } else {
            if (this.handler == null) {
                com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "do focus handler == null", this.loggerCallBack);
                return;
            }
            android.os.Message obtainMessage = this.handler.obtainMessage();
            obtainMessage.what = 7;
            this.handler.sendMessage(obtainMessage);
        }
    }

    public void zoomCamera(boolean z17) {
        if (this.cameraConfig.isMainThread()) {
            doChangeZoom(z17);
            return;
        }
        if (this.handler == null) {
            com.tencent.cloud.aicamare.util.CameraLogger.b(TAG, "zoom camera handler == null", this.loggerCallBack);
            return;
        }
        android.os.Message obtainMessage = this.handler.obtainMessage();
        obtainMessage.what = 4;
        obtainMessage.arg1 = z17 ? 1 : 0;
        this.handler.sendMessage(obtainMessage);
    }

    public void setLoggerCallBack(com.tencent.cloud.aicamare.callback.CameraLoggerCallBack cameraLoggerCallBack) {
        setLoggerCallBack(cameraLoggerCallBack, com.tencent.cloud.aicamare.util.CameraLogger.LOG_LEVEL.LEVEL_VERBOSE);
    }
}

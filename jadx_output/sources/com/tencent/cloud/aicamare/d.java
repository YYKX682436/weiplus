package com.tencent.cloud.aicamare;

/* loaded from: classes14.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.cloud.aicamare.entity.a f45854a = new com.tencent.cloud.aicamare.entity.a();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.cloud.aicamare.callback.CameraEventListener f45855b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.cloud.aicamare.callback.CameraLoggerCallBack f45856c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.cloud.aicamare.entity.CameraConfig f45857d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f45858e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference<android.content.Context> f45859f;

    public void b(java.lang.String str) {
        com.tencent.cloud.aicamare.util.CameraLogger.b("CameraHolderImp", str, this.f45856c);
    }

    public final boolean a(int i17, int i18) {
        java.lang.String str;
        float f17;
        float f18;
        int i19;
        int i27;
        int i28;
        java.lang.String str2 = "CameraHolderImp";
        java.lang.String str3 = "continuous-video";
        android.hardware.Camera camera = this.f45854a.f45860a;
        if (camera == null) {
            a(1, "init camera fail, current camera is null!");
            return false;
        }
        try {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            if (this.f45857d.isBackCamera()) {
                com.tencent.cloud.aicamare.enums.CameraZoom zoom = this.f45857d.getZoom();
                if (zoom != com.tencent.cloud.aicamare.enums.CameraZoom.ZOOM_1X) {
                    if (zoom == com.tencent.cloud.aicamare.enums.CameraZoom.ZOOM_1_5X) {
                        i28 = 150;
                    } else {
                        i28 = zoom == com.tencent.cloud.aicamare.enums.CameraZoom.ZOOM_2X ? 200 : 0;
                    }
                    try {
                        android.hardware.Camera camera2 = this.f45854a.f45860a;
                        if (camera2 != null) {
                            java.util.List<java.lang.Integer> zoomRatios = camera2.getParameters().getZoomRatios();
                            i27 = 0;
                            while (i27 < zoomRatios.size()) {
                                int intValue = zoomRatios.get(i27).intValue();
                                if (intValue == i28) {
                                    break;
                                }
                                if (intValue > i28) {
                                    int i29 = i27 - 1;
                                    if (intValue - i28 >= i28 - zoomRatios.get(i29).intValue()) {
                                        i27 = i29;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                        }
                    } catch (java.lang.RuntimeException e17) {
                        b("getZoomIndex error: " + e17.getLocalizedMessage());
                    }
                }
                i27 = 0;
                parameters.setZoom(i27);
            }
            java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            int max = java.lang.Math.max(i17, i18);
            int min = java.lang.Math.min(i17, i18);
            double d17 = max / min;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.hardware.Camera.Size size : supportedPreviewSizes) {
                double d18 = size.height / size.width;
                if (d18 == 0.75d) {
                    arrayList.add(size);
                }
                if (d18 == 0.5625d) {
                    arrayList.add(size);
                }
            }
            if (arrayList.size() != 0) {
                supportedPreviewSizes = arrayList;
            }
            java.util.Iterator<android.hardware.Camera.Size> it = supportedPreviewSizes.iterator();
            android.hardware.Camera.Size size2 = null;
            double d19 = Double.MAX_VALUE;
            while (it.hasNext()) {
                android.hardware.Camera.Size next = it.next();
                java.util.Iterator<android.hardware.Camera.Size> it6 = it;
                java.lang.String str4 = str2;
                java.lang.String str5 = str3;
                if (java.lang.Math.abs((next.width / next.height) - d17) <= 0.1d) {
                    double abs = java.lang.Math.abs(next.height - min);
                    if (abs < d19) {
                        d19 = abs;
                        size2 = next;
                    }
                }
                it = it6;
                str2 = str4;
                str3 = str5;
            }
            java.lang.String str6 = str2;
            java.lang.String str7 = str3;
            if (size2 == null) {
                double d27 = Double.MAX_VALUE;
                for (android.hardware.Camera.Size size3 : supportedPreviewSizes) {
                    if (java.lang.Math.abs(size3.height - min) < d27) {
                        d27 = java.lang.Math.abs(size3.height - min);
                        size2 = size3;
                    }
                }
            }
            java.util.Objects.toString(size2);
            try {
                parameters.setPreviewSize(size2.width, size2.height);
                a(parameters);
                camera.setParameters(parameters);
                try {
                    if (parameters.getSupportedFocusModes().contains(str7)) {
                        parameters.setFocusMode(str7);
                        camera.setParameters(parameters);
                    }
                    str = str6;
                } catch (java.lang.Exception unused) {
                    str = str6;
                    com.tencent.cloud.aicamare.util.CameraLogger.a(str, "This phone not support AutoFocus", this.f45856c);
                }
                try {
                    camera.setDisplayOrientation(this.f45854a.f45864e);
                    this.f45854a.f45863d = parameters.getPreviewSize();
                    com.tencent.cloud.aicamare.entity.a aVar = this.f45854a;
                    android.graphics.Point point = new android.graphics.Point(i17, i18);
                    com.tencent.cloud.aicamare.entity.a aVar2 = this.f45854a;
                    android.hardware.Camera.Size size4 = aVar2.f45863d;
                    if (aVar2.f45864e % 180 != 0) {
                        f17 = (point.x * 1.0f) / size4.height;
                        f18 = point.y * 1.0f;
                        i19 = size4.width;
                    } else {
                        f17 = (point.x * 1.0f) / size4.width;
                        f18 = point.y * 1.0f;
                        i19 = size4.height;
                    }
                    float max2 = java.lang.Math.max(f17, f18 / i19);
                    new android.graphics.Point((int) (size4.width * max2), (int) (size4.height * max2));
                    aVar.getClass();
                    com.tencent.cloud.aicamare.util.CameraLogger.a(str, "initCamera success!", this.f45856c);
                    return true;
                } catch (java.lang.Exception e18) {
                    e18.getLocalizedMessage();
                    a(7, "set display orientation error.");
                    return false;
                }
            } catch (java.lang.Exception e19) {
                e19.getLocalizedMessage();
                a(java.lang.String.format("exception, %s, %s", android.os.Looper.myLooper(), e19.getMessage()));
                a(1, "set preview parameter size error");
                return false;
            }
        } catch (java.lang.RuntimeException e27) {
            e27.getLocalizedMessage();
            a(1, "currentCamera, getParameters error!");
            return false;
        }
    }

    public final void a(android.hardware.Camera.Parameters parameters) {
        java.util.List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.size() == 0) {
            return;
        }
        int size = supportedPreviewFpsRange.size();
        int i17 = Integer.MIN_VALUE;
        int i18 = Integer.MIN_VALUE;
        boolean z17 = false;
        for (int i19 = 0; i19 < size; i19++) {
            int[] iArr = supportedPreviewFpsRange.get(i19);
            if (iArr != null && iArr.length > 1) {
                int i27 = iArr[0];
                int i28 = iArr[1];
                a(java.lang.String.format("dkfps %d:[%d %d]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28)));
                if (i27 >= 0 && i28 >= i27) {
                    if (i28 >= i18 && !z17) {
                        i18 = i28;
                        i17 = i27;
                    }
                    if (i28 >= 30000) {
                        z17 = true;
                    }
                }
            }
        }
        a(java.lang.String.format("dkfps get fit  [%d %d], max target fps %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 30));
        if (i17 == Integer.MAX_VALUE || i18 == Integer.MAX_VALUE) {
            return;
        }
        parameters.setPreviewFpsRange(i17, i18);
        a(java.lang.String.format("dkfps set fps range %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
    }

    public boolean a(android.hardware.Camera camera) {
        boolean z17;
        if (!this.f45857d.isByteDataBuffer()) {
            camera.setPreviewCallback(new com.tencent.cloud.aicamare.b(this, camera));
        } else {
            camera.setPreviewCallbackWithBuffer(new com.tencent.cloud.aicamare.c(this, camera));
            android.hardware.Camera.Size size = this.f45854a.f45863d;
            if (size != null) {
                camera.addCallbackBuffer(new byte[((size.width * size.height) * android.graphics.ImageFormat.getBitsPerPixel(17)) / 8]);
                z17 = true;
            } else {
                a(3, "current size is null");
                z17 = false;
            }
            if (!z17) {
                com.tencent.cloud.aicamare.util.CameraLogger.b("CameraHolderImp", "start Preview buffer happen error!", this.f45856c);
                return false;
            }
        }
        return true;
    }

    public void a(java.lang.String str) {
        com.tencent.cloud.aicamare.util.CameraLogger.a("CameraHolderImp", str, this.f45856c);
    }

    public void a(android.content.Context context) {
        if (context == null) {
            com.tencent.cloud.aicamare.util.CameraLogger.b("CameraHolderImp", "set context input a null", this.f45856c);
            return;
        }
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.f45859f;
        if ((weakReference == null ? null : weakReference.get()) == null) {
            this.f45859f = new java.lang.ref.WeakReference<>(context);
        }
    }

    public final void a(int i17, java.lang.String str) {
        com.tencent.cloud.aicamare.callback.CameraEventListener cameraEventListener = this.f45855b;
        if (cameraEventListener != null) {
            cameraEventListener.onEventError(i17, str);
            return;
        }
        b("sendEventError, code: " + i17 + " msg: " + str);
    }
}

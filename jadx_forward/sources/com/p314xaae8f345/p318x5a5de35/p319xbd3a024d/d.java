package com.p314xaae8f345.p318x5a5de35.p319xbd3a024d;

/* loaded from: classes14.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.a f127387a = new com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.a();

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29 f127388b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2890x6b443cba f127389c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.C2891xb691d6e7 f127390d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f127391e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference<android.content.Context> f127392f;

    public void b(java.lang.String str) {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b("CameraHolderImp", str, this.f127389c);
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
        android.hardware.Camera camera = this.f127387a.f127393a;
        if (camera == null) {
            a(1, "init camera fail, current camera is null!");
            return false;
        }
        try {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            if (this.f127390d.m21582xf3a427b6()) {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p322x5c30b92.EnumC2892xfee61cb8 m21581xfb888c49 = this.f127390d.m21581xfb888c49();
                if (m21581xfb888c49 != com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p322x5c30b92.EnumC2892xfee61cb8.ZOOM_1X) {
                    if (m21581xfb888c49 == com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p322x5c30b92.EnumC2892xfee61cb8.ZOOM_1_5X) {
                        i28 = 150;
                    } else {
                        i28 = m21581xfb888c49 == com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p322x5c30b92.EnumC2892xfee61cb8.ZOOM_2X ? 200 : 0;
                    }
                    try {
                        android.hardware.Camera camera2 = this.f127387a.f127393a;
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
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.a(str, "This phone not support AutoFocus", this.f127389c);
                }
                try {
                    camera.setDisplayOrientation(this.f127387a.f127397e);
                    this.f127387a.f127396d = parameters.getPreviewSize();
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.a aVar = this.f127387a;
                    android.graphics.Point point = new android.graphics.Point(i17, i18);
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.a aVar2 = this.f127387a;
                    android.hardware.Camera.Size size4 = aVar2.f127396d;
                    if (aVar2.f127397e % 180 != 0) {
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
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.a(str, "initCamera success!", this.f127389c);
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
        if (!this.f127390d.m21583xba2fa37c()) {
            camera.setPreviewCallback(new com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.b(this, camera));
        } else {
            camera.setPreviewCallbackWithBuffer(new com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.c(this, camera));
            android.hardware.Camera.Size size = this.f127387a.f127396d;
            if (size != null) {
                camera.addCallbackBuffer(new byte[((size.width * size.height) * android.graphics.ImageFormat.getBitsPerPixel(17)) / 8]);
                z17 = true;
            } else {
                a(3, "current size is null");
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b("CameraHolderImp", "start Preview buffer happen error!", this.f127389c);
                return false;
            }
        }
        return true;
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.a("CameraHolderImp", str, this.f127389c);
    }

    public void a(android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b("CameraHolderImp", "set context input a null", this.f127389c);
            return;
        }
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.f127392f;
        if ((weakReference == null ? null : weakReference.get()) == null) {
            this.f127392f = new java.lang.ref.WeakReference<>(context);
        }
    }

    public final void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29 interfaceC2889x4c929a29 = this.f127388b;
        if (interfaceC2889x4c929a29 != null) {
            interfaceC2889x4c929a29.mo21574x5a5ecd(i17, str);
            return;
        }
        b("sendEventError, code: " + i17 + " msg: " + str);
    }
}

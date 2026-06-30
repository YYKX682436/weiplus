package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes14.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f181548a;

    /* renamed from: b, reason: collision with root package name */
    public wo.d1 f181549b;

    /* renamed from: f, reason: collision with root package name */
    public boolean f181553f;

    /* renamed from: g, reason: collision with root package name */
    public int f181554g;

    /* renamed from: c, reason: collision with root package name */
    public boolean f181550c = false;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Point f181551d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Point f181552e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f181555h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f181556i = false;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Point f181557j = null;

    public n0(android.content.Context context) {
        this.f181548a = context;
    }

    public void a(android.graphics.SurfaceTexture surfaceTexture, boolean z17, int i17) {
        android.hardware.Camera.Parameters parameters;
        android.graphics.Point point;
        boolean z18;
        java.util.Iterator it;
        if (this.f181550c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceScanCamera", "in open(), previewing");
            b();
        }
        this.f181555h = z17;
        int d17 = uo.q.f511065a.d();
        int i18 = 0;
        while (true) {
            if (i18 >= d17) {
                i18 = -1;
                break;
            }
            android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
            android.hardware.Camera.getCameraInfo(i18, cameraInfo);
            int i19 = cameraInfo.facing;
            if ((i19 == 1 && this.f181555h) || (i19 == 0 && !this.f181555h)) {
                break;
            } else {
                i18++;
            }
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        wo.h d18 = wo.i.d(this.f181548a, i18, null);
        if (d18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceScanCamera", "in open(), openCameraRes == null");
            throw new java.io.IOException();
        }
        this.f181556i = true;
        android.os.SystemClock.elapsedRealtime();
        int i27 = d18.f529247b;
        this.f181554g = i27;
        boolean z27 = i27 % 180 != 0;
        this.f181553f = z27;
        wo.d1 d1Var = d18.f529246a;
        this.f181549b = d1Var;
        if (d1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceScanCamera", "in open(), camera == null, bNeedRotate=[%s]", java.lang.Boolean.valueOf(z27));
            throw new java.io.IOException();
        }
        d1Var.i(surfaceTexture);
        android.hardware.Camera.Parameters c17 = this.f181549b.c();
        android.graphics.Point point2 = this.f181552e;
        java.lang.String str = c17.get("preview-size-values");
        if (str == null) {
            str = c17.get("preview-size-value");
        }
        if (str != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(c17.getSupportedPreviewSizes());
            java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.m0(null));
            float f17 = point2.x / point2.y;
            long w17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.util.Iterator it6 = arrayList.iterator();
            float f18 = Float.POSITIVE_INFINITY;
            android.graphics.Point point3 = null;
            while (true) {
                if (it6.hasNext()) {
                    android.hardware.Camera.Size size = (android.hardware.Camera.Size) it6.next();
                    int i28 = size.width;
                    int i29 = size.height;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceScanCamera", "realWidth: %d, realHeight: %d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                    int i37 = i28 * i29;
                    if (i37 >= 150400 && i37 <= 983040) {
                        boolean z28 = i28 > i29;
                        int i38 = z28 ? i29 : i28;
                        int i39 = z28 ? i28 : i29;
                        if (i38 == point2.x && i39 == point2.y) {
                            parameters = c17;
                            it = it6;
                            if (((double) w17) / (((((((double) i38) * ((double) i39)) * 3.0d) / 2.0d) / 1024.0d) / 1024.0d) >= 5.0d) {
                                point = new android.graphics.Point(i28, i29);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceScanCamera", "Found preview size exactly matching screen size: " + point);
                                break;
                            }
                        } else {
                            parameters = c17;
                            it = it6;
                        }
                        float abs = java.lang.Math.abs((i38 / i39) - f17);
                        if (abs < f18) {
                            if (((double) w17) / (((((((double) i28) * ((double) i29)) * 3.0d) / 2.0d) / 1024.0d) / 1024.0d) >= 5.0d) {
                                f18 = abs;
                                point3 = new android.graphics.Point(i28, i29);
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceScanCamera", "diff:[%s] newdiff:[%s] w:[%s] h:[%s]", java.lang.Float.valueOf(f18), java.lang.Float.valueOf(abs), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                        c17 = parameters;
                        it6 = it;
                    }
                } else {
                    parameters = c17;
                    if (point3 == null) {
                        android.hardware.Camera.Size previewSize = parameters.getPreviewSize();
                        if (previewSize != null) {
                            point3 = new android.graphics.Point(previewSize.width, previewSize.height);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceScanCamera", "No suitable preview sizes, using default: " + point3);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceScanCamera", "hy: can not find default size!!");
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceScanCamera", "Found best approximate preview size: " + point3);
                    point = point3;
                }
            }
        } else {
            parameters = c17;
            point = null;
        }
        if (point == null) {
            throw null;
        }
        this.f181551d = point;
        this.f181557j = new android.graphics.Point(point);
        java.util.Objects.toString(this.f181552e);
        java.util.Objects.toString(this.f181551d);
        java.util.Objects.toString(this.f181557j);
        android.graphics.Point point4 = this.f181551d;
        android.hardware.Camera.Parameters parameters2 = parameters;
        parameters2.setPreviewSize(point4.x, point4.y);
        parameters2.setZoom(0);
        parameters2.setSceneMode("auto");
        try {
            if (parameters2.getSupportedFocusModes() == null || !parameters2.getSupportedFocusModes().contains("auto")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceScanCamera", "camera not support FOCUS_MODE_AUTO");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceScanCamera", "set FocusMode to FOCUS_MODE_AUTO");
                parameters2.setFocusMode("auto");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceScanCamera", "set focus mode error: %s", e17.getMessage());
        }
        java.util.List<java.lang.Integer> supportedPreviewFormats = parameters2.getSupportedPreviewFormats();
        java.util.Iterator<java.lang.Integer> it7 = supportedPreviewFormats.iterator();
        boolean z29 = false;
        while (true) {
            if (!it7.hasNext()) {
                z18 = false;
                break;
            }
            int intValue = it7.next().intValue();
            if (intValue == 17) {
                z18 = true;
                break;
            } else if (intValue == 842094169) {
                z29 = true;
            }
        }
        if (z18) {
            parameters2.setPreviewFormat(17);
        } else if (z29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceScanCamera", "Preview not support PixelFormat.YCbCr_420_SP, but hasYU12");
            parameters2.setPreviewFormat(842094169);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceScanCamera", "Preview not support PixelFormat.YCbCr_420_SP. Use format: %s", supportedPreviewFormats.get(0));
            parameters2.setPreviewFormat(supportedPreviewFormats.get(0).intValue());
        }
        if (this.f181553f) {
            parameters2.setRotation(this.f181554g);
        }
        this.f181549b.f(parameters2);
    }

    public void b() {
        if (this.f181549b != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            if (this.f181550c) {
                this.f181549b.g(null);
                this.f181549b.l();
                this.f181550c = false;
                android.os.SystemClock.elapsedRealtime();
            }
            android.os.SystemClock.elapsedRealtime();
            this.f181549b.d();
            this.f181549b = null;
            this.f181556i = false;
            android.os.SystemClock.elapsedRealtime();
        }
    }

    public void c(android.hardware.Camera.PreviewCallback previewCallback) {
        wo.d1 d1Var = this.f181549b;
        if (d1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceScanCamera", "hy: camera is null. setPreviewCallback failed");
            return;
        }
        try {
            android.graphics.Point point = this.f181551d;
            this.f181549b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s.f181566d.m(java.lang.Integer.valueOf(((point.x * point.y) * android.graphics.ImageFormat.getBitsPerPixel(d1Var.c().getPreviewFormat())) / 8)));
            this.f181549b.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.l0(this, previewCallback));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceScanCamera", e17, "setPreviewCallback error: %s", e17.getMessage());
        }
    }

    public void d(android.graphics.SurfaceTexture surfaceTexture) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        if (this.f181549b == null || this.f181550c) {
            return;
        }
        if (surfaceTexture != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceScanCamera", "hy: SurfaceTexture is not null");
            this.f181549b.i(surfaceTexture);
        }
        android.graphics.Point point = this.f181551d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s.o(point.x, point.y, 5);
        this.f181549b.k();
        this.f181550c = true;
        android.os.SystemClock.elapsedRealtime();
    }
}

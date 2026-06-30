package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes14.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f100015a;

    /* renamed from: b, reason: collision with root package name */
    public wo.d1 f100016b;

    /* renamed from: f, reason: collision with root package name */
    public boolean f100020f;

    /* renamed from: g, reason: collision with root package name */
    public int f100021g;

    /* renamed from: c, reason: collision with root package name */
    public boolean f100017c = false;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Point f100018d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Point f100019e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f100022h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f100023i = false;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Point f100024j = null;

    public n0(android.content.Context context) {
        this.f100015a = context;
    }

    public void a(android.graphics.SurfaceTexture surfaceTexture, boolean z17, int i17) {
        android.hardware.Camera.Parameters parameters;
        android.graphics.Point point;
        boolean z18;
        java.util.Iterator it;
        if (this.f100017c) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceScanCamera", "in open(), previewing");
            b();
        }
        this.f100022h = z17;
        int d17 = uo.q.f429532a.d();
        int i18 = 0;
        while (true) {
            if (i18 >= d17) {
                i18 = -1;
                break;
            }
            android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
            android.hardware.Camera.getCameraInfo(i18, cameraInfo);
            int i19 = cameraInfo.facing;
            if ((i19 == 1 && this.f100022h) || (i19 == 0 && !this.f100022h)) {
                break;
            } else {
                i18++;
            }
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        wo.h d18 = wo.i.d(this.f100015a, i18, null);
        if (d18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceScanCamera", "in open(), openCameraRes == null");
            throw new java.io.IOException();
        }
        this.f100023i = true;
        android.os.SystemClock.elapsedRealtime();
        int i27 = d18.f447714b;
        this.f100021g = i27;
        boolean z27 = i27 % 180 != 0;
        this.f100020f = z27;
        wo.d1 d1Var = d18.f447713a;
        this.f100016b = d1Var;
        if (d1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceScanCamera", "in open(), camera == null, bNeedRotate=[%s]", java.lang.Boolean.valueOf(z27));
            throw new java.io.IOException();
        }
        d1Var.i(surfaceTexture);
        android.hardware.Camera.Parameters c17 = this.f100016b.c();
        android.graphics.Point point2 = this.f100019e;
        java.lang.String str = c17.get("preview-size-values");
        if (str == null) {
            str = c17.get("preview-size-value");
        }
        if (str != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(c17.getSupportedPreviewSizes());
            java.util.Collections.sort(arrayList, new com.tencent.mm.plugin.facedetect.model.m0(null));
            float f17 = point2.x / point2.y;
            long w17 = com.tencent.mm.sdk.platformtools.t8.w(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.util.Iterator it6 = arrayList.iterator();
            float f18 = Float.POSITIVE_INFINITY;
            android.graphics.Point point3 = null;
            while (true) {
                if (it6.hasNext()) {
                    android.hardware.Camera.Size size = (android.hardware.Camera.Size) it6.next();
                    int i28 = size.width;
                    int i29 = size.height;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceScanCamera", "realWidth: %d, realHeight: %d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
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
                                com.tencent.mars.xlog.Log.i("MicroMsg.FaceScanCamera", "Found preview size exactly matching screen size: " + point);
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
                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceScanCamera", "diff:[%s] newdiff:[%s] w:[%s] h:[%s]", java.lang.Float.valueOf(f18), java.lang.Float.valueOf(abs), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                        c17 = parameters;
                        it6 = it;
                    }
                } else {
                    parameters = c17;
                    if (point3 == null) {
                        android.hardware.Camera.Size previewSize = parameters.getPreviewSize();
                        if (previewSize != null) {
                            point3 = new android.graphics.Point(previewSize.width, previewSize.height);
                            com.tencent.mars.xlog.Log.i("MicroMsg.FaceScanCamera", "No suitable preview sizes, using default: " + point3);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.FaceScanCamera", "hy: can not find default size!!");
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceScanCamera", "Found best approximate preview size: " + point3);
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
        this.f100018d = point;
        this.f100024j = new android.graphics.Point(point);
        java.util.Objects.toString(this.f100019e);
        java.util.Objects.toString(this.f100018d);
        java.util.Objects.toString(this.f100024j);
        android.graphics.Point point4 = this.f100018d;
        android.hardware.Camera.Parameters parameters2 = parameters;
        parameters2.setPreviewSize(point4.x, point4.y);
        parameters2.setZoom(0);
        parameters2.setSceneMode("auto");
        try {
            if (parameters2.getSupportedFocusModes() == null || !parameters2.getSupportedFocusModes().contains("auto")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceScanCamera", "camera not support FOCUS_MODE_AUTO");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceScanCamera", "set FocusMode to FOCUS_MODE_AUTO");
                parameters2.setFocusMode("auto");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceScanCamera", "set focus mode error: %s", e17.getMessage());
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
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceScanCamera", "Preview not support PixelFormat.YCbCr_420_SP, but hasYU12");
            parameters2.setPreviewFormat(842094169);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceScanCamera", "Preview not support PixelFormat.YCbCr_420_SP. Use format: %s", supportedPreviewFormats.get(0));
            parameters2.setPreviewFormat(supportedPreviewFormats.get(0).intValue());
        }
        if (this.f100020f) {
            parameters2.setRotation(this.f100021g);
        }
        this.f100016b.f(parameters2);
    }

    public void b() {
        if (this.f100016b != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            if (this.f100017c) {
                this.f100016b.g(null);
                this.f100016b.l();
                this.f100017c = false;
                android.os.SystemClock.elapsedRealtime();
            }
            android.os.SystemClock.elapsedRealtime();
            this.f100016b.d();
            this.f100016b = null;
            this.f100023i = false;
            android.os.SystemClock.elapsedRealtime();
        }
    }

    public void c(android.hardware.Camera.PreviewCallback previewCallback) {
        wo.d1 d1Var = this.f100016b;
        if (d1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceScanCamera", "hy: camera is null. setPreviewCallback failed");
            return;
        }
        try {
            android.graphics.Point point = this.f100018d;
            this.f100016b.a(com.tencent.mm.plugin.facedetect.model.s.f100033d.m(java.lang.Integer.valueOf(((point.x * point.y) * android.graphics.ImageFormat.getBitsPerPixel(d1Var.c().getPreviewFormat())) / 8)));
            this.f100016b.h(new com.tencent.mm.plugin.facedetect.model.l0(this, previewCallback));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceScanCamera", e17, "setPreviewCallback error: %s", e17.getMessage());
        }
    }

    public void d(android.graphics.SurfaceTexture surfaceTexture) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        if (this.f100016b == null || this.f100017c) {
            return;
        }
        if (surfaceTexture != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceScanCamera", "hy: SurfaceTexture is not null");
            this.f100016b.i(surfaceTexture);
        }
        android.graphics.Point point = this.f100018d;
        com.tencent.mm.plugin.facedetect.model.s.o(point.x, point.y, 5);
        this.f100016b.k();
        this.f100017c = true;
        android.os.SystemClock.elapsedRealtime();
    }
}

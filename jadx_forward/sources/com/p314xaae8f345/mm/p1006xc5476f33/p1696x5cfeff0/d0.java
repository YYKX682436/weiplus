package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 f218731a;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f218733c;

    /* renamed from: d, reason: collision with root package name */
    public wo.d1 f218734d;

    /* renamed from: e, reason: collision with root package name */
    public int f218735e;

    /* renamed from: f, reason: collision with root package name */
    public int f218736f;

    /* renamed from: g, reason: collision with root package name */
    public int f218737g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f218738h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f218739i;

    /* renamed from: p, reason: collision with root package name */
    public wo.h f218746p;

    /* renamed from: q, reason: collision with root package name */
    public android.content.Context f218747q;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.Point f218742l = null;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Point f218743m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Point f218744n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f218745o = 0;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.u f218748r = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.z(this);

    /* renamed from: k, reason: collision with root package name */
    public boolean f218741k = false;

    /* renamed from: b, reason: collision with root package name */
    public android.os.HandlerThread f218732b = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f218740j = false;

    public d0(android.content.Context context) {
        this.f218747q = context;
    }

    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var) {
        boolean z17;
        android.graphics.Point point;
        boolean z18;
        java.util.Iterator it;
        float f17;
        android.graphics.Point point2;
        d0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "start open camera");
        boolean z19 = false;
        d0Var.f218740j = false;
        boolean z27 = true;
        d0Var.f218739i = true;
        int numberOfCameras = android.hardware.Camera.getNumberOfCameras();
        int i17 = 0;
        while (true) {
            if (i17 >= numberOfCameras) {
                i17 = -1;
                break;
            }
            try {
                android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                android.hardware.Camera.getCameraInfo(i17, cameraInfo);
                int i18 = cameraInfo.facing;
                if (i18 == 1 && d0Var.f218739i) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerCamera", "openCamera found front Camera ");
                    break;
                }
                if (i18 == 0 && !d0Var.f218739i) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerCamera", "openCamera found front Camera");
                    break;
                }
                i17++;
            } catch (java.lang.Exception e17) {
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerCamera", "find camera info failed：%s", e17.getMessage());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "find camera info success");
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "not found available camera id");
        } else {
            boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (d0Var.f218746p == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "openCameraRes is null");
                try {
                    d0Var.f218746p = wo.i.d(d0Var.f218747q, i17, null);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerCamera", e18, "MicroMsg.FaceFlashManagerError", new java.lang.Object[0]);
                }
            }
            if (d0Var.f218746p == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerCamera", "in open(), openCameraRes == null");
            } else {
                d0Var.f218745o = i17;
                d0Var.f218740j = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "openCamera done, cameraId=[%s] costTime=[%s]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                wo.h hVar = d0Var.f218746p;
                int i19 = hVar.f529247b;
                d0Var.f218737g = i19;
                boolean z29 = i19 % 180 != 0;
                d0Var.f218738h = z29;
                wo.d1 d1Var = hVar.f529246a;
                d0Var.f218734d = d1Var;
                if (d1Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "in open(), camera == null, bNeedRotate=[%s]", java.lang.Boolean.valueOf(z29));
                } else {
                    try {
                        android.hardware.Camera.Parameters c17 = d1Var.c();
                        if (c17 != null) {
                            android.graphics.Point point3 = new android.graphics.Point(d0Var.f218747q.getResources().getDisplayMetrics().widthPixels, d0Var.f218747q.getResources().getDisplayMetrics().heightPixels);
                            d0Var.f218743m = point3;
                            java.lang.String str = c17.get("preview-size-values");
                            if (str == null) {
                                str = c17.get("preview-size-value");
                            }
                            if (str != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList(c17.getSupportedPreviewSizes());
                                java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.c0(null));
                                float f18 = point3.x / point3.y;
                                long w17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                java.util.Iterator it6 = arrayList.iterator();
                                float f19 = Float.POSITIVE_INFINITY;
                                android.graphics.Point point4 = null;
                                while (true) {
                                    if (it6.hasNext()) {
                                        android.hardware.Camera.Size size = (android.hardware.Camera.Size) it6.next();
                                        int i27 = size.width;
                                        int i28 = size.height;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "realWidth: %d, realHeight: %d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
                                        int i29 = i27 * i28;
                                        if (i29 >= 150400 && i29 <= 983040) {
                                            boolean z37 = i27 > i28 ? z27 : z19;
                                            int i37 = z37 ? i28 : i27;
                                            int i38 = z37 ? i27 : i28;
                                            if (i37 == point3.x && i38 == point3.y) {
                                                it = it6;
                                                if (((double) w17) / (((((((double) i37) * ((double) i38)) * 3.0d) / 2.0d) / 1024.0d) / 1024.0d) >= 5.0d) {
                                                    point = new android.graphics.Point(i27, i28);
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "Found preview size exactly matching screen size: " + point);
                                                    break;
                                                }
                                            } else {
                                                it = it6;
                                            }
                                            float abs = java.lang.Math.abs((i37 / i38) - f18);
                                            if (i27 % 10 == 0) {
                                                if (abs < f19) {
                                                    f17 = f18;
                                                    point2 = point3;
                                                    if (((double) w17) / (((((((double) i27) * ((double) i28)) * 3.0d) / 2.0d) / 1024.0d) / 1024.0d) >= 5.0d) {
                                                        f19 = abs;
                                                        point4 = new android.graphics.Point(i27, i28);
                                                    }
                                                } else {
                                                    f17 = f18;
                                                    point2 = point3;
                                                }
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "diff:[%s] newdiff:[%s] w:[%s] h:[%s]", java.lang.Float.valueOf(f19), java.lang.Float.valueOf(abs), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
                                                z19 = false;
                                                z27 = true;
                                                point3 = point2;
                                                f18 = f17;
                                                it6 = it;
                                            }
                                        } else {
                                            it = it6;
                                        }
                                        f17 = f18;
                                        point2 = point3;
                                        z19 = false;
                                        z27 = true;
                                        point3 = point2;
                                        f18 = f17;
                                        it6 = it;
                                    } else {
                                        if (point4 == null) {
                                            android.hardware.Camera.Size previewSize = c17.getPreviewSize();
                                            if (previewSize != null) {
                                                point4 = new android.graphics.Point(previewSize.width, previewSize.height);
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "No suitable preview sizes, using default: " + point4);
                                            } else {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerCamera", "hy: can not find default size!!");
                                            }
                                        }
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "Found best approximate preview size: " + point4);
                                        point = point4;
                                    }
                                }
                            } else {
                                point = null;
                            }
                            if (point == null) {
                                throw null;
                            }
                            d0Var.f218742l = point;
                            d0Var.f218744n = new android.graphics.Point(d0Var.f218742l);
                            java.util.Objects.toString(d0Var.f218743m);
                            java.util.Objects.toString(d0Var.f218742l);
                            java.util.Objects.toString(d0Var.f218744n);
                            android.graphics.Point point5 = d0Var.f218742l;
                            int i39 = point5.x;
                            d0Var.f218735e = i39;
                            int i47 = point5.y;
                            d0Var.f218736f = i47;
                            c17.setPreviewSize(i39, i47);
                            c17.setZoom(0);
                            c17.setSceneMode("auto");
                            try {
                                if (c17.getSupportedFocusModes() == null || !c17.getSupportedFocusModes().contains("auto")) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "camera not support FOCUS_MODE_AUTO");
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "set FocusMode to FOCUS_MODE_AUTO");
                                    c17.setFocusMode("auto");
                                }
                            } catch (java.lang.Exception e19) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerCamera", "set focus mode error: %s", e19.getMessage());
                            }
                            java.util.List<java.lang.Integer> supportedPreviewFormats = c17.getSupportedPreviewFormats();
                            java.util.Iterator<java.lang.Integer> it7 = supportedPreviewFormats.iterator();
                            boolean z38 = false;
                            while (true) {
                                if (!it7.hasNext()) {
                                    z18 = false;
                                    break;
                                }
                                int intValue = it7.next().intValue();
                                if (intValue == 17) {
                                    z18 = true;
                                    break;
                                }
                                if (intValue == 842094169) {
                                    z38 = true;
                                }
                            }
                            if (z18) {
                                c17.setPreviewFormat(17);
                            } else if (z38) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerCamera", "Preview not support PixelFormat.YCbCr_420_SP, but hasYU12");
                                c17.setPreviewFormat(842094169);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerCamera", "Preview not support PixelFormat.YCbCr_420_SP. Use format: %s", supportedPreviewFormats.get(0));
                                c17.setPreviewFormat(supportedPreviewFormats.get(0).intValue());
                            }
                            if (d0Var.f218738h) {
                                c17.setRotation(d0Var.f218737g);
                            }
                            if (wo.v1.f529355b.f529208t > 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "set frame rate > 0, do not try set preview fps range");
                            } else {
                                java.util.List<int[]> supportedPreviewFpsRange = c17.getSupportedPreviewFpsRange();
                                if (supportedPreviewFpsRange != null && supportedPreviewFpsRange.size() != 0) {
                                    int size2 = supportedPreviewFpsRange.size();
                                    int i48 = Integer.MIN_VALUE;
                                    int i49 = Integer.MIN_VALUE;
                                    boolean z39 = false;
                                    for (int i57 = 0; i57 < size2; i57++) {
                                        int[] iArr = supportedPreviewFpsRange.get(i57);
                                        if (iArr != null && iArr.length > 1) {
                                            int i58 = iArr[0];
                                            int i59 = iArr[1];
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "dkfps %d:[%d %d]", java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i58), java.lang.Integer.valueOf(i59));
                                            if (i58 >= 0 && i59 >= i58) {
                                                if (i59 >= i49 && !z39) {
                                                    i49 = i59;
                                                    i48 = i58;
                                                }
                                                if (i59 >= 30000) {
                                                    z39 = true;
                                                }
                                            }
                                        }
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "dkfps get fit  [%d %d], max target fps %d", java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i49), 30);
                                    if (i48 != Integer.MAX_VALUE && i49 != Integer.MAX_VALUE) {
                                        try {
                                            c17.setPreviewFpsRange(i48, i49);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "set fps range %d %d", java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i49));
                                        } catch (java.lang.Exception e27) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "trySetPreviewFpsRangeParameters Exception, %s, %s", android.os.Looper.myLooper(), e27.getMessage());
                                        }
                                    }
                                }
                            }
                            java.util.List<int[]> supportedPreviewFpsRange2 = c17.getSupportedPreviewFpsRange();
                            supportedPreviewFpsRange2.size();
                            for (int i66 = 0; i66 < supportedPreviewFpsRange2.size(); i66++) {
                                for (int i67 : supportedPreviewFpsRange2.get(i66)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "Camera SupportedPreviewFpsRange：", java.lang.Integer.valueOf(i67));
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "Camera preview-fps-range：" + c17.get("preview-fps-range"));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "Camera preview-fps-range：" + c17.get("preview-frame-rate"));
                            try {
                                d0Var.f218734d.f(c17);
                            } catch (java.lang.Exception e28) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerCamera", e28, "setParameters error", new java.lang.Object[0]);
                            }
                            return d0Var.f218740j;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "in open(), parameters == null");
                    } catch (java.lang.Exception e29) {
                        z17 = false;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerCamera", e29, "camera getParameters error: %s", e29.getMessage());
                    }
                }
            }
        }
        z17 = false;
        return z17;
    }

    public float b() {
        try {
            java.lang.String str = this.f218734d.c().get("preview-size");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "preview size:%s", str);
            java.lang.String[] split = str.split("x");
            return (java.lang.Integer.parseInt(split[0]) * 1.0f) / java.lang.Integer.parseInt(split[1]);
        } catch (java.lang.Exception unused) {
            return 1.0f;
        }
    }

    public android.graphics.Point c() {
        try {
            java.lang.String str = this.f218734d.c().get("preview-size");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "preview size:%s", str);
            java.lang.String[] split = str.split("x");
            this.f218735e = java.lang.Integer.parseInt(split[0]);
            this.f218736f = java.lang.Integer.parseInt(split[1]);
        } catch (java.lang.Exception unused) {
        }
        return new android.graphics.Point(this.f218735e, this.f218736f);
    }

    public void d(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 c21518xd171d8a0, com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0 b0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "openCameraForSurfaceTexture");
        this.f218731a = c21518xd171d8a0;
        if (this.f218732b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "start camera thread");
            int i17 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a("cameraBackground", 5);
            this.f218732b = a17;
            a17.start();
            this.f218733c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f218732b.getLooper());
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f218733c;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.v(this, b0Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "back thread is not running");
        }
    }

    public void e(android.hardware.Camera.PreviewCallback previewCallback) {
        wo.d1 d1Var = this.f218734d;
        if (d1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceFlashManagerCamera", "hy: camera is null. setPreviewCallback failed");
            return;
        }
        int bitsPerPixel = ((this.f218735e * this.f218736f) * android.graphics.ImageFormat.getBitsPerPixel(d1Var.c().getPreviewFormat())) / 8;
        for (int i17 = 0; i17 < 5; i17++) {
            this.f218734d.a(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s.f181566d.m(java.lang.Integer.valueOf(bitsPerPixel)));
        }
        this.f218734d.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.y(this, previewCallback));
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.b().a(this.f218748r);
    }

    public boolean f(android.graphics.SurfaceTexture surfaceTexture, com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0 b0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "mIsPreviewing is " + this.f218741k);
        if (this.f218734d != null && !this.f218741k) {
            this.f218741k = true;
            this.f218733c.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.x(this, surfaceTexture, b0Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "start preview, is previewing");
        }
        return this.f218741k;
    }

    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "stopPreview, isPreviewing: %s", java.lang.Boolean.valueOf(this.f218741k));
        wo.d1 d1Var = this.f218734d;
        if (d1Var == null || d1Var.f529187c || !this.f218741k) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "just stopPreview");
        this.f218734d.l();
        this.f218741k = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s.f181566d.c();
    }
}

package n72;

/* loaded from: classes14.dex */
public class q implements android.view.TextureView.SurfaceTextureListener {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1409x9e7e39d6.ui.C13539x6248de2f A;
    public android.widget.ImageView C;
    public android.widget.ImageView D;
    public android.graphics.Bitmap E;
    public boolean F;
    public final int G;
    public k72.i H;
    public wo.h I;
    public final boolean M;
    public final boolean N;
    public final android.hardware.Camera.PreviewCallback P;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.u Q;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 f416805d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f416806e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f416807f;

    /* renamed from: g, reason: collision with root package name */
    public wo.d1 f416808g;

    /* renamed from: h, reason: collision with root package name */
    public int f416809h;

    /* renamed from: i, reason: collision with root package name */
    public int f416810i;

    /* renamed from: m, reason: collision with root package name */
    public int f416811m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f416812n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f416813o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f416814p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f416815q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f416816r;

    /* renamed from: s, reason: collision with root package name */
    public int f416817s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f416818t;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 f416822x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f416823y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.C13533xbf67dc9f f416824z;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Point f416819u = null;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Point f416820v = null;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Point f416821w = null;
    public int B = 0;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f416804J = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("mPreviewHandlerThread");
    public final int K = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_face_action_cache_data_size, 5);
    public volatile java.util.concurrent.atomic.AtomicInteger L = new java.util.concurrent.atomic.AtomicInteger(0);

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7, k72.i iVar) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_action_copy_data, true);
        this.M = fj6;
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_action_old_ui_camera_preview_sy, false);
        this.N = fj7;
        this.P = new n72.c(this);
        this.Q = new n72.m(this);
        this.G = 2;
        this.f416822x = activityC13534x1dc4b4e7;
        this.f416814p = false;
        this.f416816r = false;
        this.f416806e = null;
        this.f416814p = false;
        this.F = false;
        this.H = iVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "clicfg_face_action_copy_data :%b，enableCameraPreviewSy：%b", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(fj7));
    }

    public static void a(n72.q qVar, android.graphics.SurfaceTexture surfaceTexture) {
        qVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "start Preview");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "mIsPreviewing is " + qVar.f416816r);
        if (qVar.f416808g == null || qVar.f416816r) {
            return;
        }
        try {
            qVar.f416808g.i(surfaceTexture);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "start Preview failed:" + e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s.o(qVar.f416809h, qVar.f416810i, 5);
        qVar.f416808g.k();
        qVar.f416816r = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "start preview, is previewing");
        if (qVar.G == 1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new n72.j(qVar), 500L);
        }
    }

    public static boolean b(n72.q qVar) {
        boolean z17;
        android.graphics.Point point;
        boolean z18;
        java.util.Iterator it;
        float f17;
        qVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "start open camera");
        boolean z19 = false;
        qVar.f416814p = false;
        boolean z27 = true;
        qVar.f416813o = true;
        int d17 = uo.q.f511065a.d();
        int i17 = 0;
        while (true) {
            if (i17 >= d17) {
                i17 = -1;
                break;
            }
            android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
            android.hardware.Camera.getCameraInfo(i17, cameraInfo);
            int i18 = cameraInfo.facing;
            if ((i18 == 1 && qVar.f416813o) || (i18 == 0 && !qVar.f416813o)) {
                break;
            }
            i17++;
        }
        if (i17 != -1) {
            boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "openCameraRes：" + qVar.I);
            if (qVar.I == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "openCameraRes is null");
                if (qVar.G == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "mFaceReflectController openCameraRe");
                    try {
                        qVar.I = wo.i.d(null, i17, null);
                    } catch (java.lang.Exception unused) {
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "mFaceActionUI openCameraRe");
                    qVar.I = wo.i.d(qVar.f416822x.mo55332x76847179(), i17, null);
                }
            }
            if (qVar.I != null) {
                qVar.B = i17;
                qVar.f416814p = true;
                android.os.SystemClock.elapsedRealtime();
                wo.h hVar = qVar.I;
                int i19 = hVar.f529247b;
                qVar.f416811m = i19;
                boolean z29 = i19 % 180 != 0;
                qVar.f416812n = z29;
                wo.d1 d1Var = hVar.f529246a;
                qVar.f416808g = d1Var;
                if (d1Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceReflectCam", "in open(), camera == null, bNeedRotate=[%s]", java.lang.Boolean.valueOf(z29));
                    try {
                        throw new java.io.IOException();
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "set cameraRotation exception" + e17.getMessage());
                    }
                }
                try {
                    android.hardware.Camera.Parameters c17 = qVar.f416808g.c();
                    if (qVar.G == 1) {
                        throw null;
                    }
                    int i27 = qVar.f416822x.getResources().getDisplayMetrics().widthPixels;
                    int i28 = qVar.f416822x.getResources().getDisplayMetrics().heightPixels;
                    if (c17 != null) {
                        android.graphics.Point point2 = new android.graphics.Point(i27, i28);
                        qVar.f416820v = point2;
                        java.lang.String str = c17.get("preview-size-values");
                        if (str == null) {
                            str = c17.get("preview-size-value");
                        }
                        if (str != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList(c17.getSupportedPreviewSizes());
                            java.util.Collections.sort(arrayList, new n72.p(null));
                            float f18 = point2.x / point2.y;
                            long w17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                            java.util.Iterator it6 = arrayList.iterator();
                            float f19 = Float.POSITIVE_INFINITY;
                            android.graphics.Point point3 = null;
                            while (true) {
                                if (it6.hasNext()) {
                                    android.hardware.Camera.Size size = (android.hardware.Camera.Size) it6.next();
                                    int i29 = size.width;
                                    int i37 = size.height;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "realWidth: %d, realHeight: %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
                                    int i38 = i29 * i37;
                                    if (i38 >= 150400 && i38 <= 983040) {
                                        boolean z37 = i29 > i37 ? z27 : z19;
                                        int i39 = z37 ? i37 : i29;
                                        int i47 = z37 ? i29 : i37;
                                        if (i39 == point2.x && i47 == point2.y) {
                                            it = it6;
                                            if (((double) w17) / (((((((double) i39) * ((double) i47)) * 3.0d) / 2.0d) / 1024.0d) / 1024.0d) >= 5.0d) {
                                                point = new android.graphics.Point(i29, i37);
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "Found preview size exactly matching screen size: " + point);
                                                break;
                                            }
                                        } else {
                                            it = it6;
                                        }
                                        float abs = java.lang.Math.abs((i39 / i47) - f18);
                                        if (i29 % 10 == 0) {
                                            if (abs < f19) {
                                                f17 = f18;
                                                if (((double) w17) / (((((((double) i29) * ((double) i37)) * 3.0d) / 2.0d) / 1024.0d) / 1024.0d) >= 5.0d) {
                                                    f19 = abs;
                                                    point3 = new android.graphics.Point(i29, i37);
                                                }
                                            } else {
                                                f17 = f18;
                                            }
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "diff:[%s] newdiff:[%s] w:[%s] h:[%s]", java.lang.Float.valueOf(f19), java.lang.Float.valueOf(abs), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
                                            z19 = false;
                                            z27 = true;
                                            f18 = f17;
                                            it6 = it;
                                        }
                                    } else {
                                        it = it6;
                                    }
                                    f17 = f18;
                                    z19 = false;
                                    z27 = true;
                                    f18 = f17;
                                    it6 = it;
                                } else {
                                    if (point3 == null) {
                                        android.hardware.Camera.Size previewSize = c17.getPreviewSize();
                                        if (previewSize != null) {
                                            point3 = new android.graphics.Point(previewSize.width, previewSize.height);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "No suitable preview sizes, using default: " + point3);
                                        } else {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceReflectCam", "hy: can not find default size!!");
                                        }
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "Found best approximate preview size: " + point3);
                                    point = point3;
                                }
                            }
                        } else {
                            point = null;
                        }
                        if (point == null) {
                            throw null;
                        }
                        qVar.f416819u = point;
                        qVar.f416821w = new android.graphics.Point(qVar.f416819u);
                        java.util.Objects.toString(qVar.f416820v);
                        java.util.Objects.toString(qVar.f416819u);
                        java.util.Objects.toString(qVar.f416821w);
                        android.graphics.Point point4 = qVar.f416819u;
                        int i48 = point4.x;
                        qVar.f416809h = i48;
                        int i49 = point4.y;
                        qVar.f416810i = i49;
                        c17.setPreviewSize(i48, i49);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceReflectCam", "mDesiredPreviewWidth：" + qVar.f416809h);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceReflectCam", "mDesiredPreviewHeight：" + qVar.f416810i);
                        c17.setZoom(0);
                        c17.setSceneMode("auto");
                        try {
                            if (c17.getSupportedFocusModes() == null || !c17.getSupportedFocusModes().contains("auto")) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "camera not support FOCUS_MODE_AUTO");
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "set FocusMode to FOCUS_MODE_AUTO");
                                c17.setFocusMode("auto");
                            }
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceReflectCam", "set focus mode error: %s", e18.getMessage());
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
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceReflectCam", "Preview not support PixelFormat.YCbCr_420_SP, but hasYU12");
                            c17.setPreviewFormat(842094169);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceReflectCam", "Preview not support PixelFormat.YCbCr_420_SP. Use format: %s", supportedPreviewFormats.get(0));
                            c17.setPreviewFormat(supportedPreviewFormats.get(0).intValue());
                        }
                        if (qVar.f416812n) {
                            c17.setRotation(qVar.f416811m);
                        }
                        double d18 = qVar.f416809h / qVar.f416810i;
                        if (qVar.A.m55298x424d923c() != d18) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new n72.i(qVar, d18));
                        }
                        if (wo.v1.f529355b.f529208t > 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "set frame rate > 0, do not try set preview fps range");
                        } else {
                            java.util.List<int[]> supportedPreviewFpsRange = c17.getSupportedPreviewFpsRange();
                            if (supportedPreviewFpsRange != null && supportedPreviewFpsRange.size() != 0) {
                                int size2 = supportedPreviewFpsRange.size();
                                int i57 = Integer.MIN_VALUE;
                                int i58 = Integer.MIN_VALUE;
                                boolean z39 = false;
                                for (int i59 = 0; i59 < size2; i59++) {
                                    int[] iArr = supportedPreviewFpsRange.get(i59);
                                    if (iArr != null && iArr.length > 1) {
                                        int i66 = iArr[0];
                                        int i67 = iArr[1];
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "dkfps %d:[%d %d]", java.lang.Integer.valueOf(i59), java.lang.Integer.valueOf(i66), java.lang.Integer.valueOf(i67));
                                        if (i66 >= 0 && i67 >= i66) {
                                            if (i67 >= i58 && !z39) {
                                                i58 = i67;
                                                i57 = i66;
                                            }
                                            if (i67 >= 30000) {
                                                z39 = true;
                                            }
                                        }
                                    }
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "dkfps get fit  [%d %d], max target fps %d", java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i58), 30);
                                if (i57 != Integer.MAX_VALUE && i58 != Integer.MAX_VALUE) {
                                    try {
                                        c17.setPreviewFpsRange(i57, i58);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "set fps range %d %d", java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i58));
                                    } catch (java.lang.Exception e19) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "trySetPreviewFpsRangeParameters Exception, %s, %s", android.os.Looper.myLooper(), e19.getMessage());
                                    }
                                }
                            }
                        }
                        java.util.List<int[]> supportedPreviewFpsRange2 = c17.getSupportedPreviewFpsRange();
                        supportedPreviewFpsRange2.size();
                        for (int i68 = 0; i68 < supportedPreviewFpsRange2.size(); i68++) {
                            for (int i69 : supportedPreviewFpsRange2.get(i68)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "Camera SupportedPreviewFpsRange：", java.lang.Integer.valueOf(i69));
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "Camera preview-fps-range：" + c17.get("preview-fps-range"));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "Camera preview-fps-range：" + c17.get("preview-frame-rate"));
                        try {
                            qVar.f416808g.f(c17);
                        } catch (java.lang.Exception e27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceReflectCam", e27, "setParameters error", new java.lang.Object[0]);
                        }
                        return qVar.f416814p;
                    }
                } catch (java.lang.Exception e28) {
                    z17 = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceReflectCam", e28, "camera getParameters error: %s", e28.getMessage());
                }
            } else {
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "in open(), openCameraRes == null");
                try {
                    throw new java.io.IOException();
                } catch (java.io.IOException e29) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "set cameraRes exception" + e29.getMessage());
                }
            }
            return z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "not found available camera id");
        z17 = false;
        return z17;
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "closeCamera start");
        this.f416805d = null;
        this.H = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f416804J;
        if (n3Var != null) {
            n3Var.mo50299x35224f();
            this.f416804J = null;
        }
        if (this.f416808g != null) {
            try {
                if (this.f416816r) {
                    this.f416816r = false;
                    this.f416808g.l();
                    this.f416808g.g(null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "stop preview, not previewing");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "Error setting camera preview: " + e17.getMessage());
            }
            try {
                try {
                    this.f416808g.d();
                    this.f416808g = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.b().d(this.Q);
                    k72.j.f386258a.f386263e = null;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "Error setting camera preview: " + e18.getMessage());
                }
            } finally {
                this.f416808g = null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "closeCamera end");
    }

    public final void d(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "openCameraForSurfaceTexture");
        if (this.G == 1) {
            throw null;
        }
        this.f416824z.setVisibility(0);
        g();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f416807f;
        if (n3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "back thread is not running");
        } else {
            n3Var.mo50293x3498a0(new n72.f(this));
            this.f416807f.mo50293x3498a0(new n72.g(this, surfaceTexture));
        }
    }

    public void e(android.hardware.Camera.PreviewCallback previewCallback) {
        wo.d1 d1Var = this.f416808g;
        if (d1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceReflectCam", "hy: camera is null. setPreviewCallback failed");
            return;
        }
        int bitsPerPixel = ((this.f416809h * this.f416810i) * android.graphics.ImageFormat.getBitsPerPixel(d1Var.c().getPreviewFormat())) / 8;
        for (int i17 = 0; i17 < this.K; i17++) {
            this.f416808g.a(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s.f181566d.m(java.lang.Integer.valueOf(bitsPerPixel)));
        }
        this.f416808g.h(new n72.b(this, previewCallback));
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.b().a(this.Q);
    }

    public void f(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 c21518xd171d8a0) {
        this.f416805d = c21518xd171d8a0;
        if (c21518xd171d8a0.isAvailable()) {
            d(c21518xd171d8a0.getSurfaceTexture());
        }
        this.f416805d.setSurfaceTextureListener(this);
        this.f416805d.setVisibility(0);
        this.f416805d.setAlpha(0.0f);
        if (this.G != 2 || this.F) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new n72.d(this), 700L);
    }

    public void g() {
        if (this.f416806e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "start camera thread");
            int i17 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a("cameraBackground", 5);
            this.f416806e = a17;
            a17.start();
            this.f416807f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f416806e.getLooper());
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "onSurfaceTextureAvailable, width: %s, height: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        d(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "surfaceDestroyed");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f416807f;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(new n72.h(this));
            if (this.f416806e != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "stop camera thread");
                try {
                    java.lang.Thread.sleep(500L, 0);
                } catch (java.lang.InterruptedException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "background thread sleep error：" + e17.getMessage());
                }
                this.f416806e.quitSafely();
                try {
                    this.f416806e.join();
                    this.f416806e = null;
                    this.f416807f = null;
                } catch (java.lang.InterruptedException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "stop xbackground thread error：" + e18.getMessage());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "stop camera thread finish");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "back thread is not running");
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }
}

package ts0;

/* loaded from: classes10.dex */
public class l extends ts0.b {
    public wo.h A;
    public final android.hardware.Camera.AutoFocusCallback B;
    public final di3.c C;
    public final di3.c D;
    public final di3.c E;
    public final di3.c F;
    public final di3.c G;
    public android.util.SparseIntArray H;
    public final java.util.ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.Object f503090J;
    public boolean K;
    public int L;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f503091w;

    /* renamed from: x, reason: collision with root package name */
    public final float f503092x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f503093y;

    /* renamed from: z, reason: collision with root package name */
    public wo.d1 f503094z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f503091w = "MicroMsg.CommonCamera1";
        this.f503092x = 10.0f;
        this.f503093y = new java.util.ArrayList();
        this.B = new ts0.e(this);
        this.C = new di3.c("prevcameraCallback");
        this.D = new di3.c("cameraCallback");
        this.E = new di3.c("cameraPreviewCallback");
        this.F = new di3.c("cameraCropCallback");
        this.G = new di3.c("finishCallbackTimeCallback");
        this.I = new java.util.ArrayList();
        this.f503090J = new java.lang.Object();
    }

    @Override // ts0.r
    public float[] A() {
        android.hardware.Camera.Parameters c17;
        java.util.List<java.lang.Integer> zoomRatios;
        if (this.H == null) {
            wo.d1 d1Var = this.f503094z;
            if (d1Var != null) {
                try {
                    c17 = d1Var.c();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f503091w, "getZoom error: %s", e17.getMessage());
                }
                if (c17.isZoomSupported()) {
                    zoomRatios = c17.getZoomRatios();
                    if (zoomRatios != null || zoomRatios.isEmpty()) {
                        this.H = new android.util.SparseIntArray();
                    } else {
                        int intValue = zoomRatios.get(zoomRatios.size() - 1).intValue();
                        int i17 = intValue / 10;
                        if ((intValue + 4) / 10 > i17) {
                            i17++;
                        }
                        this.H = new android.util.SparseIntArray(i17);
                        if (10 <= i17) {
                            int i18 = 10;
                            while (true) {
                                int i19 = i18 * 10;
                                if (zoomRatios.indexOf(java.lang.Integer.valueOf(i19)) < 0) {
                                    int i27 = 1;
                                    while (true) {
                                        if (i27 > 4) {
                                            break;
                                        }
                                        int i28 = i19 - i27;
                                        if (zoomRatios.indexOf(java.lang.Integer.valueOf(i28)) > 0) {
                                            android.util.SparseIntArray sparseIntArray = this.H;
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseIntArray);
                                            sparseIntArray.append(i18, i28);
                                            break;
                                        }
                                        int i29 = i19 + i27;
                                        if (zoomRatios.indexOf(java.lang.Integer.valueOf(i29)) > 0) {
                                            android.util.SparseIntArray sparseIntArray2 = this.H;
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseIntArray2);
                                            sparseIntArray2.append(i18, i29);
                                            break;
                                        }
                                        i27++;
                                    }
                                } else {
                                    android.util.SparseIntArray sparseIntArray3 = this.H;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseIntArray3);
                                    sparseIntArray3.append(i18, i19);
                                }
                                if (i18 == i17) {
                                    break;
                                }
                                i18++;
                            }
                        }
                    }
                }
            }
            zoomRatios = null;
            if (zoomRatios != null) {
            }
            this.H = new android.util.SparseIntArray();
        }
        android.util.SparseIntArray sparseIntArray4 = this.H;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseIntArray4);
        float[] fArr = new float[sparseIntArray4.size()];
        android.util.SparseIntArray sparseIntArray5 = this.H;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseIntArray5);
        int size = sparseIntArray5.size();
        for (int i37 = 0; i37 < size; i37++) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.H);
            fArr[i37] = (r4.keyAt(i37) * 1.0f) / 10;
        }
        return fArr;
    }

    @Override // ts0.r
    public void B(int i17) {
        gt0.c cVar;
        java.util.HashMap hashMap;
        gt0.b bVar;
        java.lang.Boolean bool;
        java.util.HashMap hashMap2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = ei3.y.f334722b.f334723a;
        boolean z17 = false;
        int i18 = c16528xd9aafd63 != null ? c16528xd9aafd63.f230363t : 0;
        wo.e eVar = wo.v1.f529355b;
        if ((eVar.f529211w != 1 || (i18 != 0 && i18 != 1)) && eVar.f529210v == 1 && (i18 == 0 || i18 == 5)) {
            z17 = true;
        }
        gt0.c cVar2 = this.f503064m;
        if (cVar2 != null) {
            if ((cVar2 != null ? cVar2.f356901a : null) != null) {
                if (((cVar2 == null || (hashMap2 = cVar2.f356901a) == null) ? null : (gt0.b) hashMap2.get(java.lang.Integer.valueOf(!this.f503058g ? 1 : 0))) != null && (cVar = this.f503064m) != null && (hashMap = cVar.f356901a) != null && (bVar = (gt0.b) hashMap.get(java.lang.Integer.valueOf(!this.f503058g ? 1 : 0))) != null && (bool = bVar.f356900d) != null) {
                    z17 = bool.booleanValue();
                }
            }
        }
        wo.d1 d1Var = this.f503094z;
        android.hardware.Camera.Parameters c17 = d1Var != null ? d1Var.c() : null;
        if (c17 != null) {
            if (z17) {
                Z(c17, i17);
            } else {
                Y(c17, i17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f503054c, "use fix mode %B, supported preview frame rates %s", java.lang.Boolean.valueOf(z17), c17.getSupportedPreviewFrameRates());
            wo.d1 d1Var2 = this.f503094z;
            if (d1Var2 != null) {
                d1Var2.f(c17);
            }
            wo.d1 d1Var3 = this.f503094z;
            if (d1Var3 != null) {
                d1Var3.k();
            }
        }
    }

    @Override // ts0.b
    public boolean D() {
        wo.h hVar = this.A;
        if (hVar == null) {
            return false;
        }
        int i17 = hVar.f529247b;
        return i17 == 90 || i17 == 270;
    }

    @Override // ts0.b
    public android.util.Size[] F() {
        android.hardware.Camera.Parameters c17;
        java.util.List<android.hardware.Camera.Size> supportedPreviewSizes;
        wo.d1 d1Var = this.f503094z;
        if (d1Var == null || (c17 = d1Var.c()) == null || (supportedPreviewSizes = c17.getSupportedPreviewSizes()) == null) {
            return null;
        }
        int size = supportedPreviewSizes.size();
        android.util.Size[] sizeArr = new android.util.Size[size];
        for (int i17 = 0; i17 < size; i17++) {
            android.hardware.Camera.Size size2 = supportedPreviewSizes.get(i17);
            sizeArr[i17] = new android.util.Size(size2.width, size2.height);
        }
        return sizeArr;
    }

    @Override // ts0.b
    public boolean J(int i17, int i18) {
        try {
            wo.d1 d1Var = this.f503094z;
            android.hardware.Camera.Parameters c17 = d1Var != null ? d1Var.c() : null;
            if (c17 != null) {
                c17.setPreviewSize(i17, i18);
            }
            wo.d1 d1Var2 = this.f503094z;
            if (d1Var2 == null) {
                return true;
            }
            d1Var2.f(c17);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // ts0.b
    public void L(android.view.SurfaceHolder surfaceHolder, boolean z17, int i17) {
        this.f503066o = surfaceHolder;
        this.f503060i = z17;
        this.f503067p = i17;
        if (z17) {
            W(null, surfaceHolder, i17);
        } else {
            X(null, surfaceHolder, i17);
        }
    }

    public final boolean N(byte[] frame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frame, "frame");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        synchronized (this.f503090J) {
            java.util.List list = this.f503093y;
            boolean z18 = false;
            if (list != null && ((java.util.ArrayList) list).size() != 0) {
                java.util.Iterator it = ((java.util.ArrayList) this.f503093y).iterator();
                while (it.hasNext()) {
                    z18 |= ((di3.o) it.next()).a(frame);
                }
                return z18;
            }
            return false;
        }
    }

    public boolean O(android.graphics.SurfaceTexture surfaceTexture, android.view.SurfaceHolder surfaceHolder) {
        wo.d1 d1Var = this.f503094z;
        if (d1Var == null) {
            return false;
        }
        java.lang.String str = this.f503091w;
        if (surfaceTexture == null && surfaceHolder == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doStartPreview error, surfaceTexture and surface is null");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 5L, 1L);
            return false;
        }
        if (surfaceTexture != null) {
            d1Var.i(surfaceTexture);
        } else {
            android.hardware.Camera camera = d1Var.f529185a;
            if (camera != null) {
                camera.setPreviewDisplay(surfaceHolder);
            }
        }
        d1Var.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doStartPreview finish");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenSuccess");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 4L, 1L);
        return true;
    }

    public final void P(android.hardware.Camera.Parameters parameters) {
        java.util.List<java.lang.Integer> zoomRatios;
        java.util.List<java.lang.Integer> zoomRatios2;
        java.lang.Integer num = (parameters == null || (zoomRatios2 = parameters.getZoomRatios()) == null) ? null : (java.lang.Integer) kz5.n0.X(zoomRatios2);
        int i17 = 0;
        int intValue = num == null ? 0 : num.intValue();
        java.util.ArrayList arrayList = this.I;
        arrayList.clear();
        arrayList.add(0);
        float f17 = this.f503092x;
        float f18 = intValue + f17;
        if (parameters == null || (zoomRatios = parameters.getZoomRatios()) == null) {
            return;
        }
        for (java.lang.Object obj : zoomRatios) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if ((((java.lang.Integer) obj) != null ? java.lang.Float.valueOf(r5.intValue()) : null).floatValue() > f18) {
                f18 += f17;
                arrayList.add(java.lang.Integer.valueOf(i17));
            }
            i17 = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: Exception -> 0x00ed, TryCatch #0 {Exception -> 0x00ed, blocks: (B:15:0x002a, B:17:0x002e, B:18:0x004c, B:20:0x0050, B:24:0x0059, B:26:0x0063, B:27:0x0083, B:29:0x0087, B:30:0x00a0, B:32:0x00a4, B:34:0x00b2, B:36:0x00c2, B:37:0x00c4, B:41:0x00e9, B:43:0x0035), top: B:14:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[Catch: Exception -> 0x00ed, TryCatch #0 {Exception -> 0x00ed, blocks: (B:15:0x002a, B:17:0x002e, B:18:0x004c, B:20:0x0050, B:24:0x0059, B:26:0x0063, B:27:0x0083, B:29:0x0087, B:30:0x00a0, B:32:0x00a4, B:34:0x00b2, B:36:0x00c2, B:37:0x00c4, B:41:0x00e9, B:43:0x0035), top: B:14:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[Catch: Exception -> 0x00ed, TryCatch #0 {Exception -> 0x00ed, blocks: (B:15:0x002a, B:17:0x002e, B:18:0x004c, B:20:0x0050, B:24:0x0059, B:26:0x0063, B:27:0x0083, B:29:0x0087, B:30:0x00a0, B:32:0x00a4, B:34:0x00b2, B:36:0x00c2, B:37:0x00c4, B:41:0x00e9, B:43:0x0035), top: B:14:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0035 A[Catch: Exception -> 0x00ed, TryCatch #0 {Exception -> 0x00ed, blocks: (B:15:0x002a, B:17:0x002e, B:18:0x004c, B:20:0x0050, B:24:0x0059, B:26:0x0063, B:27:0x0083, B:29:0x0087, B:30:0x00a0, B:32:0x00a4, B:34:0x00b2, B:36:0x00c2, B:37:0x00c4, B:41:0x00e9, B:43:0x0035), top: B:14:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q(int r18) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ts0.l.Q(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4 A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:5:0x000d, B:7:0x0018, B:8:0x0036, B:11:0x0078, B:13:0x00a0, B:17:0x00ad, B:19:0x00b4, B:21:0x00ba, B:23:0x00c8, B:27:0x00d5, B:30:0x00db, B:32:0x00e1, B:39:0x0072, B:40:0x001f), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:5:0x000d, B:7:0x0018, B:8:0x0036, B:11:0x0078, B:13:0x00a0, B:17:0x00ad, B:19:0x00b4, B:21:0x00ba, B:23:0x00c8, B:27:0x00d5, B:30:0x00db, B:32:0x00e1, B:39:0x0072, B:40:0x001f), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:5:0x000d, B:7:0x0018, B:8:0x0036, B:11:0x0078, B:13:0x00a0, B:17:0x00ad, B:19:0x00b4, B:21:0x00ba, B:23:0x00c8, B:27:0x00d5, B:30:0x00db, B:32:0x00e1, B:39:0x0072, B:40:0x001f), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1 A[Catch: Exception -> 0x010a, TRY_LEAVE, TryCatch #0 {Exception -> 0x010a, blocks: (B:5:0x000d, B:7:0x0018, B:8:0x0036, B:11:0x0078, B:13:0x00a0, B:17:0x00ad, B:19:0x00b4, B:21:0x00ba, B:23:0x00c8, B:27:0x00d5, B:30:0x00db, B:32:0x00e1, B:39:0x0072, B:40:0x001f), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean R(int r12, float r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ts0.l.R(int, float):boolean");
    }

    public final boolean S(float f17, int i17) {
        android.hardware.Camera.Parameters c17;
        wo.d1 d1Var = this.f503094z;
        java.lang.String str = this.f503091w;
        if (d1Var == null || this.A == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "maybe sth. is wrong ,camera is null");
            return false;
        }
        java.lang.Object obj = null;
        if (d1Var != null) {
            try {
                c17 = d1Var.c();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "setPreviewSize Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
                return false;
            }
        } else {
            c17 = null;
        }
        if (c17 == null) {
            return false;
        }
        java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = c17.getSupportedPreviewSizes();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(supportedPreviewSizes, "getSupportedPreviewSizes(...)");
        kz5.n0.F0(supportedPreviewSizes, new ts0.f());
        java.util.Iterator<T> it = supportedPreviewSizes.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            android.hardware.Camera.Size size = (android.hardware.Camera.Size) next;
            if (((double) java.lang.Math.abs(((((float) size.width) * 1.0f) / ((float) size.height)) - f17)) <= 0.1d && size.width <= i17) {
                obj = next;
                break;
            }
        }
        android.hardware.Camera.Size size2 = (android.hardware.Camera.Size) obj;
        if (size2 == null) {
            return false;
        }
        c17.setPreviewSize(size2.width, size2.height);
        di3.g0 g0Var = this.f503062k;
        g0Var.f314244c = size2.width;
        g0Var.f314243b = size2.height;
        this.f503070s = new android.graphics.Point(size2.width, size2.height);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "selectRatioAndResolutionLimitPreviewSize final select target:" + size2.width + 'x' + size2.height);
        wo.d1 d1Var2 = this.f503094z;
        if (d1Var2 != null) {
            d1Var2.f(c17);
        }
        return true;
    }

    public final void T() {
        android.hardware.Camera.Parameters c17;
        wo.d1 d1Var = this.f503094z;
        if (d1Var == null || d1Var == null) {
            return;
        }
        java.lang.String str = this.f503091w;
        if (d1Var != null) {
            try {
                c17 = d1Var.c();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "setPreviewCallbackImpl error: %s", e17.getMessage());
                return;
            }
        } else {
            c17 = null;
        }
        if (c17 == null) {
            return;
        }
        di3.g0 g0Var = this.f503062k;
        int bitsPerPixel = ((g0Var.f314244c * g0Var.f314243b) * android.graphics.ImageFormat.getBitsPerPixel(c17.getPreviewFormat())) / 8;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setPreviewCallbackImpl  size: " + bitsPerPixel);
        for (int i17 = 0; i17 < 5; i17++) {
            byte[] m17 = ei3.x.f334720d.m(java.lang.Integer.valueOf(bitsPerPixel));
            wo.d1 d1Var2 = this.f503094z;
            if (d1Var2 != null) {
                d1Var2.a(m17);
            }
        }
        this.C.d();
        this.D.d();
        this.E.d();
        this.F.d();
        this.G.d();
        wo.d1 d1Var3 = this.f503094z;
        if (d1Var3 != null) {
            d1Var3.h(new ts0.g(this));
        }
    }

    public void U() {
        java.lang.String str = this.f503091w;
        wo.d1 d1Var = this.f503094z;
        if (d1Var != null) {
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d1Var);
                android.hardware.Camera.Parameters c17 = d1Var.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setPreviewCallbackImpl");
                di3.g0 g0Var = this.f503062k;
                int i17 = g0Var.f314244c * g0Var.f314243b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
                int bitsPerPixel = (i17 * android.graphics.ImageFormat.getBitsPerPixel(c17.getPreviewFormat())) / 8;
                for (int i18 = 0; i18 < 5; i18++) {
                    byte[] m17 = ei3.x.f334720d.m(java.lang.Integer.valueOf(bitsPerPixel));
                    wo.d1 d1Var2 = this.f503094z;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d1Var2);
                    d1Var2.a(m17);
                }
                this.C.d();
                this.D.d();
                this.E.d();
                this.F.d();
                this.G.d();
                wo.d1 d1Var3 = this.f503094z;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d1Var3);
                d1Var3.h(new ts0.h(this));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "setPreviewCallbackImpl error: %s", e17.getMessage());
            }
        }
    }

    public void V() {
        wo.d1 d1Var;
        wo.d1 d1Var2;
        wo.d1 d1Var3;
        gt0.c cVar;
        java.util.HashMap hashMap;
        gt0.b bVar;
        java.util.HashMap hashMap2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = ei3.y.f334722b.f334723a;
        java.lang.Integer valueOf = c16528xd9aafd63 != null ? java.lang.Integer.valueOf(c16528xd9aafd63.f230363t) : 0;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = valueOf;
        wo.e eVar = wo.v1.f529355b;
        boolean z17 = true;
        objArr[1] = eVar.f529211w == 1 ? "Range" : eVar.f529210v == 1 ? "Fix" : "Error";
        objArr[2] = java.lang.Boolean.valueOf(eVar.f529212x == 1);
        objArr[3] = java.lang.Boolean.valueOf(eVar.f529213y == 1);
        objArr[4] = java.lang.Boolean.valueOf(eVar.f529214z == 1);
        objArr[5] = java.lang.Boolean.valueOf(eVar.A == 1);
        java.lang.String str = this.f503091w;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPreview Texture:: sightTest %s, config list: setFPS[%s], setYUV420SP[%B], useMetering[%B], useContinueFocus[%B] mUseContinueVideoFocusMode[%B]", objArr);
        boolean z18 = !(eVar.f529211w == 1 && (valueOf.intValue() == 0 || valueOf.intValue() == 1)) && eVar.f529210v == 1 && (valueOf.intValue() == 0 || valueOf.intValue() == 5);
        gt0.c cVar2 = this.f503064m;
        if (cVar2 != null) {
            if ((cVar2 != null ? cVar2.f356901a : null) != null) {
                if (((cVar2 == null || (hashMap2 = cVar2.f356901a) == null) ? null : (gt0.b) hashMap2.get(java.lang.Integer.valueOf(!this.f503058g ? 1 : 0))) != null && (cVar = this.f503064m) != null && (hashMap = cVar.f356901a) != null && (bVar = (gt0.b) hashMap.get(java.lang.Integer.valueOf(!this.f503058g ? 1 : 0))) != null) {
                    java.lang.Integer num = bVar.f356899c;
                    if (num != null) {
                        this.L = num.intValue();
                    }
                    java.lang.Boolean bool = bVar.f356900d;
                    if (bool != null) {
                        z18 = bool.booleanValue();
                    }
                }
            }
        }
        wo.d1 d1Var4 = this.f503094z;
        java.lang.String str2 = this.f503054c;
        if (d1Var4 != null) {
            try {
                android.hardware.Camera.Parameters c17 = d1Var4.c();
                if (z18) {
                    Z(c17, this.L);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
                    Y(c17, this.L);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "use fix mode %B, supported preview frame rates %s", java.lang.Boolean.valueOf(z18), c17.getSupportedPreviewFrameRates());
                d1Var4.f(c17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "setPreviewFrameRate Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            }
        }
        if (wo.v1.f529355b.f529212x == 1 && ((valueOf.intValue() == 0 || valueOf.intValue() == 2) && (d1Var3 = this.f503094z) != null)) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "safeSetPreviewFormat");
                android.hardware.Camera.Parameters c18 = d1Var3.c();
                java.util.List<java.lang.Integer> supportedPreviewFormats = c18.getSupportedPreviewFormats();
                if (supportedPreviewFormats == null || !supportedPreviewFormats.contains(17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "not support YCbCr_420_SP");
                }
                c18.setPreviewFormat(17);
                d1Var3.f(c18);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setPreviewFormat Exception, %s, %s", android.os.Looper.myLooper(), e18.getMessage());
            }
        }
        int i17 = wo.v1.f529362i.f529228i;
        if (i17 != -1 && i17 == 1 && fp.h.b(14) && (d1Var2 = this.f503094z) != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "safeSetMetering");
                android.hardware.Camera.Parameters c19 = d1Var2.c();
                if (c19.getMaxNumMeteringAreas() > 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(new android.hardware.Camera.Area(new android.graphics.Rect(-1000, -1000, 1000, 1000), 600));
                    c19.setMeteringAreas(arrayList);
                }
                d1Var2.f(c19);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "safeSetMetering Exception, %s, %s", android.os.Looper.myLooper(), e19.getMessage());
            }
        }
        if (wo.v1.f529355b.f529214z == 1 && ((valueOf.intValue() == 0 || valueOf.intValue() == 4) && (d1Var = this.f503094z) != null)) {
            try {
                android.hardware.Camera.Parameters c27 = d1Var.c();
                java.util.List<java.lang.String> supportedFocusModes = c27.getSupportedFocusModes();
                if (supportedFocusModes != null && supportedFocusModes.contains("continuous-picture")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "support continuous picture");
                    c27.setFocusMode("continuous-picture");
                } else if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "support continuous video");
                    c27.setFocusMode("continuous-video");
                } else if (supportedFocusModes == null || !supportedFocusModes.contains("auto")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "not support continuous video or auto focus");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "support auto focus");
                    c27.setFocusMode("auto");
                }
                this.f503056e.f511991l = c27.getFocusMode();
                d1Var.f(c27);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setFocusMode Exception, %s, %s", android.os.Looper.myLooper(), e27.getMessage());
            }
        }
        if (wo.v1.f529355b.A == 1 && valueOf.intValue() != 0) {
            valueOf.intValue();
        }
        try {
            wo.d1 d1Var5 = this.f503094z;
            android.hardware.Camera.Parameters c28 = d1Var5 != null ? d1Var5.c() : null;
            if (c28 == null || !c28.isZoomSupported()) {
                z17 = false;
            }
            if (z17) {
                c28.setZoom(0);
            }
            wo.d1 d1Var6 = this.f503094z;
            if (d1Var6 != null) {
                d1Var6.f(c28);
            }
        } catch (java.lang.Exception e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "safeResetZoom error: %s", e28.getMessage());
        }
        try {
            wo.d1 d1Var7 = this.f503094z;
            P(d1Var7 != null ? d1Var7.c() : null);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "current get parameters is null");
        }
    }

    public final void W(android.graphics.SurfaceTexture surfaceTexture, android.view.SurfaceHolder surfaceHolder, int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String str = "start startPreviewWithCPU,Looper.myLooper(): " + android.os.Looper.myLooper() + ",surfaceTexture:" + surfaceTexture + ", surface:" + surfaceHolder;
        java.lang.String str2 = this.f503091w;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (G()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "startPreviewWithCPU, camera previewing");
            return;
        }
        try {
            Q(i17);
            V();
            T();
            if (O(surfaceTexture, surfaceHolder)) {
                this.f503059h = ts0.a.f503049e;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "start preview FAILED, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 5L, 1L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "start preview end, use %dms %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), android.os.Looper.myLooper());
    }

    public void X(android.graphics.SurfaceTexture surfaceTexture, android.view.SurfaceHolder surfaceHolder, int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String str = "start startPreviewWithGPU,Looper.myLooper(): " + android.os.Looper.myLooper() + "  ,surfaceTexture:" + surfaceTexture + ", surface:" + surfaceHolder;
        java.lang.String str2 = this.f503091w;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (G()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "startPreviewWithGPU, camera previewing");
            return;
        }
        try {
            if (this.f503061j) {
                R(i17, 0.0f);
                U();
            } else {
                I(i17);
            }
            V();
            if (O(surfaceTexture, surfaceHolder)) {
                this.f503059h = ts0.a.f503049e;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "start preview FAILED, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 5L, 1L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "start preview end, use %dms %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), android.os.Looper.myLooper());
    }

    public void Y(android.hardware.Camera.Parameters p17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        int i18 = wo.v1.f529355b.f529208t;
        java.lang.String str = this.f503054c;
        if (i18 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "set frame rate > 0, do not try set preview fps range");
            return;
        }
        java.util.List<int[]> supportedPreviewFpsRange = p17.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.size() == 0) {
            return;
        }
        int size = supportedPreviewFpsRange.size();
        int i19 = Integer.MIN_VALUE;
        int i27 = Integer.MIN_VALUE;
        boolean z17 = false;
        for (int i28 = 0; i28 < size; i28++) {
            int[] iArr = supportedPreviewFpsRange.get(i28);
            if (iArr != null && iArr.length > 1) {
                int i29 = iArr[0];
                int i37 = iArr[1];
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f503091w, "dkfps %d:[%d %d]", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
                if (i29 >= 0 && i37 >= i29) {
                    if (i37 >= i27 && !z17) {
                        i27 = i37;
                        i19 = i29;
                    }
                    if (i17 != 0) {
                        if (i37 < i17 * 1000) {
                        }
                        z17 = true;
                    } else {
                        if (i37 < 30000) {
                        }
                        z17 = true;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "dkfps get fit  [%d %d], max target fps %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), 30);
        if (i19 == Integer.MAX_VALUE || i27 == Integer.MAX_VALUE) {
            return;
        }
        try {
            p17.setPreviewFpsRange(i19, i27);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "set fps range %d %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "trySetPreviewFpsRangeParameters Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
        }
    }

    public void Z(android.hardware.Camera.Parameters parameters, int i17) {
        int min;
        int i18 = wo.v1.f529355b.f529208t;
        java.lang.String str = this.f503054c;
        if (i18 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "set frame rate > 0, do not try set preview frame rate");
            return;
        }
        if (parameters == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f503091w, "trySetPreviewFrameRateParameters error, p is null!");
            return;
        }
        try {
            java.util.List<java.lang.Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
            if (supportedPreviewFrameRates == null || supportedPreviewFrameRates.size() <= 0) {
                return;
            }
            if (i17 != 0) {
                java.lang.Object max = java.util.Collections.max(supportedPreviewFrameRates);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(max, "max(...)");
                min = java.lang.Math.min(i17, ((java.lang.Number) max).intValue());
            } else {
                java.lang.Object max2 = java.util.Collections.max(supportedPreviewFrameRates);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(max2, "max(...)");
                min = java.lang.Math.min(30, ((java.lang.Number) max2).intValue());
            }
            parameters.setPreviewFrameRate(min);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "set preview frame rate %d", java.lang.Integer.valueOf(min));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "trySetPreviewFrameRateParameters Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
        }
    }

    @Override // ts0.r
    public boolean a() {
        android.hardware.Camera camera;
        java.lang.String str = this.f503091w;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "triggerAutoFocus");
            wo.d1 d1Var = this.f503094z;
            if (d1Var != null && (camera = d1Var.f529185a) != null) {
                camera.cancelAutoFocus();
            }
            wo.d1 d1Var2 = this.f503094z;
            if (d1Var2 == null) {
                return true;
            }
            d1Var2.b(this.B);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "autofocus fail, exception %s", e17.getMessage());
            return false;
        }
    }

    @Override // ts0.r
    public int b() {
        return 1;
    }

    @Override // ts0.r
    public boolean c(android.content.Context context, boolean z17) {
        java.lang.String str = this.f503091w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            if (this.f503073v) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initCamera, already open");
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpen");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 3L, 1L);
            this.f503058g = z17;
            mo167002x41012807();
            int a17 = z17 ? wo.i.a() : wo.i.b();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, "use camera id %d, SrvDeviceInfo id %d", java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(wo.v1.f529355b.B));
            this.A = new ts0.u().a(context, a17, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "open camera end, %s", android.os.Looper.myLooper());
            wo.h hVar = this.A;
            if (hVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "open camera FAILED, %s", android.os.Looper.myLooper());
                K();
                return false;
            }
            wo.d1 d1Var = hVar != null ? hVar.f529246a : null;
            this.f503094z = d1Var;
            if (d1Var != null) {
                d1Var.j("CommonCamera1");
            }
            this.K = false;
            di3.g0 g0Var = this.f503062k;
            wo.h hVar2 = this.A;
            g0Var.f314246e = hVar2 != null ? hVar2.f529247b : 0;
            if (this.f503094z != null) {
                this.f503073v = true;
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "start camera FAILED!");
            K();
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "init camera failed!", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 5L, 1L);
            return false;
        }
    }

    @Override // ts0.r
    public int d() {
        if (this.A == null || !G()) {
            return -1;
        }
        wo.h hVar = this.A;
        if (hVar != null) {
            return hVar.f529247b;
        }
        return 0;
    }

    @Override // ts0.r
    public int e() {
        return !this.f503058g ? 1 : 0;
    }

    @Override // ts0.r
    public void f(float f17, float f18, int i17, int i18, long j17) {
        if (G() && !fp.h.a(14)) {
            int i19 = us0.c.f511979n;
            us0.c cVar = this.f503056e;
            cVar.mo50303x856b99f0(4354);
            cVar.f511986g = f17;
            cVar.f511987h = f18;
            cVar.f511988i = i17;
            cVar.f511989j = i18;
            cVar.mo50311x7ab51103(cVar.mo50292x733c63a2(4354, this.f503094z), j17);
        }
    }

    @Override // ts0.b, ts0.r
    public boolean g(yz5.l dataCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataCallback, "dataCallback");
        wo.d1 d1Var = this.f503094z;
        java.lang.String str = this.f503091w;
        if (d1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "targetCamera is null");
            dataCallback.mo146xb9724478(null);
            return false;
        }
        android.hardware.Camera camera = d1Var.f529185a;
        if (!(camera != null ? camera.enableShutterSound(false) : false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "enableShutterSound fail");
            dataCallback.mo146xb9724478(null);
            return false;
        }
        try {
            ts0.i iVar = new ts0.i();
            ts0.j jVar = new ts0.j();
            ts0.k kVar = new ts0.k(this, dataCallback);
            if (camera == null) {
                return true;
            }
            camera.takePicture(iVar, jVar, kVar);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "takePhotoRawData fail, exception %s", e17.getMessage());
            dataCallback.mo146xb9724478(null);
            return false;
        }
    }

    @Override // ts0.r
    /* renamed from: getFlashMode */
    public int mo167001xbb0896fd() {
        android.hardware.Camera.Parameters c17;
        wo.d1 d1Var = this.f503094z;
        java.lang.String flashMode = (d1Var == null || (c17 = d1Var.c()) == null) ? null : c17.getFlashMode();
        if (flashMode == null) {
            return 2;
        }
        int hashCode = flashMode.hashCode();
        if (hashCode == 3551) {
            return !flashMode.equals("on") ? 2 : 1;
        }
        if (hashCode != 109935) {
            return (hashCode == 3005871 && flashMode.equals("auto")) ? 3 : 2;
        }
        flashMode.equals("off");
        return 2;
    }

    @Override // ts0.r
    public void h(java.lang.String tag, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
    }

    @Override // ts0.r
    public void i(java.lang.String tag, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
    }

    @Override // ts0.r
    public void j(yz5.l lVar) {
    }

    @Override // ts0.r
    public void k(di3.o oVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f503091w, "addFrameDataCallback " + oVar, new java.lang.Object[0]);
        if (oVar == null) {
            return;
        }
        synchronized (this.f503090J) {
            ((java.util.ArrayList) this.f503093y).add(oVar);
        }
    }

    @Override // ts0.r
    public void l(float f17) {
        wo.d1 d1Var;
        android.hardware.Camera.Parameters c17;
        if (this.f503072u || (d1Var = this.f503094z) == null) {
            return;
        }
        try {
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d1Var);
                c17 = d1Var.c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f503091w, "setForceZoomTargetRatio error: %s", e17.getMessage());
            }
            if (c17.isZoomSupported()) {
                if (this.H == null) {
                    return;
                }
                java.util.List<java.lang.Integer> zoomRatios = c17.getZoomRatios();
                android.util.SparseIntArray sparseIntArray = this.H;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseIntArray);
                int indexOf = zoomRatios.indexOf(java.lang.Integer.valueOf(sparseIntArray.get(a06.d.b(f17 * 10))));
                if (indexOf >= 0 && indexOf <= c17.getMaxZoom()) {
                    this.f503072u = true;
                    c17.setZoom(indexOf);
                    wo.d1 d1Var2 = this.f503094z;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d1Var2);
                    d1Var2.f(c17);
                }
            }
        } finally {
            this.f503072u = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    @Override // ts0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Rect m(float r7, float r8, float r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ts0.l.m(float, float, float, int, int):android.graphics.Rect");
    }

    @Override // ts0.r
    public java.lang.String n() {
        try {
            wo.d1 d1Var = this.f503094z;
            android.hardware.Camera.Parameters c17 = d1Var != null ? d1Var.c() : null;
            java.lang.String focusMode = c17 != null ? c17.getFocusMode() : null;
            if (focusMode == null) {
                focusMode = "auto";
            }
            int hashCode = focusMode.hashCode();
            if (hashCode != -194628547) {
                if (hashCode != 3005871) {
                    if (hashCode == 910005312 && focusMode.equals("continuous-picture")) {
                        int i17 = gt0.d.L0;
                        return "continue-picture";
                    }
                } else if (focusMode.equals("auto")) {
                    int i18 = gt0.d.L0;
                    return "auto";
                }
            } else if (focusMode.equals("continuous-video")) {
                int i19 = gt0.d.L0;
                return "continue-video";
            }
            int i27 = gt0.d.L0;
            return "auto";
        } catch (java.lang.Exception unused) {
            int i28 = gt0.d.L0;
            return "auto";
        }
    }

    @Override // ts0.r
    public void o() {
        if (G()) {
            int i17 = us0.c.f511979n;
            this.f503056e.mo50303x856b99f0(4354);
        }
    }

    @Override // ts0.r
    public void p(android.graphics.SurfaceTexture surfaceTexture, boolean z17, int i17) {
        this.f503065n = surfaceTexture;
        this.f503060i = z17;
        this.f503067p = i17;
        if (z17) {
            W(surfaceTexture, null, i17);
        } else {
            X(surfaceTexture, null, i17);
        }
    }

    @Override // ts0.r
    public void q(di3.o oVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f503091w, "removeFrameDataCallback " + oVar, new java.lang.Object[0]);
        if (oVar == null) {
            return;
        }
        synchronized (this.f503090J) {
            ((java.util.ArrayList) this.f503093y).remove(oVar);
        }
    }

    @Override // ts0.r
    public void r(android.graphics.SurfaceTexture surfaceTexture, boolean z17, java.lang.Float f17, int i17) {
        this.f503065n = surfaceTexture;
        this.f503060i = z17;
        this.f503067p = i17;
        this.f503069r = f17;
        if (f17 == null) {
            p(surfaceTexture, z17, i17);
            return;
        }
        java.lang.String str = this.f503091w;
        if (z17) {
            float floatValue = f17.floatValue();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start startPreviewWithCPURatio,Looper.myLooper(): " + android.os.Looper.myLooper() + ",surfaceTexture:" + surfaceTexture + ", surface:null");
            if (G()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPreviewWithCPU, camera previewing");
                return;
            }
            try {
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "start preview FAILED, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 5L, 1L);
            }
            if (!S(floatValue, i17)) {
                X(surfaceTexture, null, i17);
                return;
            }
            V();
            T();
            if (O(surfaceTexture, null)) {
                this.f503059h = ts0.a.f503049e;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start preview end, use %dms %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), android.os.Looper.myLooper());
            return;
        }
        float floatValue2 = f17.floatValue();
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start startPreviewWithGPU,Looper.myLooper(): " + android.os.Looper.myLooper() + "  ,surfaceTexture:" + surfaceTexture + ", surface:null");
        if (G()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPreviewWithGPU, camera previewing");
            return;
        }
        try {
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "start preview FAILED, %s, %s", android.os.Looper.myLooper(), e18.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 5L, 1L);
        }
        if (!S(floatValue2, i17)) {
            X(surfaceTexture, null, i17);
            return;
        }
        V();
        if (this.f503061j) {
            U();
        }
        if (O(surfaceTexture, null)) {
            this.f503059h = ts0.a.f503049e;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start preview end, use %dms %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), android.os.Looper.myLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[Catch: Exception -> 0x00ca, TryCatch #0 {Exception -> 0x00ca, blocks: (B:3:0x0007, B:6:0x003c, B:9:0x005a, B:12:0x0062, B:14:0x0066, B:16:0x0076, B:23:0x0088, B:25:0x008f, B:26:0x009a, B:28:0x009e, B:29:0x00a1, B:31:0x00a5, B:32:0x00a8, B:37:0x0093, B:39:0x0097, B:40:0x00c3), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e A[Catch: Exception -> 0x00ca, TryCatch #0 {Exception -> 0x00ca, blocks: (B:3:0x0007, B:6:0x003c, B:9:0x005a, B:12:0x0062, B:14:0x0066, B:16:0x0076, B:23:0x0088, B:25:0x008f, B:26:0x009a, B:28:0x009e, B:29:0x00a1, B:31:0x00a5, B:32:0x00a8, B:37:0x0093, B:39:0x0097, B:40:0x00c3), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5 A[Catch: Exception -> 0x00ca, TryCatch #0 {Exception -> 0x00ca, blocks: (B:3:0x0007, B:6:0x003c, B:9:0x005a, B:12:0x0062, B:14:0x0066, B:16:0x0076, B:23:0x0088, B:25:0x008f, B:26:0x009a, B:28:0x009e, B:29:0x00a1, B:31:0x00a5, B:32:0x00a8, B:37:0x0093, B:39:0x0097, B:40:0x00c3), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    @Override // ts0.r
    /* renamed from: release */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo167002x41012807() {
        /*
            r11 = this;
            java.lang.String r0 = r11.f503091w
            ts0.a r1 = ts0.a.f503048d
            r11.f503059h = r1
            r1 = 0
            di3.c r2 = r11.C     // Catch: java.lang.Exception -> Lca
            java.lang.String r2 = r2.c()     // Catch: java.lang.Exception -> Lca
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Exception -> Lca
            di3.c r2 = r11.D     // Catch: java.lang.Exception -> Lca
            java.lang.String r2 = r2.c()     // Catch: java.lang.Exception -> Lca
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Exception -> Lca
            di3.c r2 = r11.E     // Catch: java.lang.Exception -> Lca
            java.lang.String r2 = r2.c()     // Catch: java.lang.Exception -> Lca
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Exception -> Lca
            di3.c r2 = r11.F     // Catch: java.lang.Exception -> Lca
            java.lang.String r2 = r2.c()     // Catch: java.lang.Exception -> Lca
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Exception -> Lca
            di3.c r2 = r11.G     // Catch: java.lang.Exception -> Lca
            java.lang.String r2 = r2.c()     // Catch: java.lang.Exception -> Lca
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Exception -> Lca
            wo.d1 r2 = r11.f503094z     // Catch: java.lang.Exception -> Lca
            us0.c r3 = r11.f503056e
            r4 = 1
            r5 = 0
            if (r2 == 0) goto Lc3
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a     // Catch: java.lang.Exception -> Lca
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> Lca
            java.lang.String r2 = "release camera beg, %s"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> Lca
            android.os.Looper r9 = android.os.Looper.myLooper()     // Catch: java.lang.Exception -> Lca
            r8[r1] = r9     // Catch: java.lang.Exception -> Lca
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2, r8)     // Catch: java.lang.Exception -> Lca
            r3.mo50302x6b17ad39(r5)     // Catch: java.lang.Exception -> Lca
            r11.K = r4     // Catch: java.lang.Exception -> Lca
            gt0.c r2 = r11.f503064m     // Catch: java.lang.Exception -> Lca
            if (r2 == 0) goto L93
            if (r2 == 0) goto L5d
            java.util.HashSet r8 = r2.f356902b     // Catch: java.lang.Exception -> Lca
            goto L5e
        L5d:
            r8 = r5
        L5e:
            if (r8 == 0) goto L93
            if (r2 == 0) goto L73
            java.util.HashSet r2 = r2.f356902b     // Catch: java.lang.Exception -> Lca
            if (r2 == 0) goto L73
            int r8 = gt0.d.L0     // Catch: java.lang.Exception -> Lca
            java.lang.String r8 = "preview_callback_remove"
            boolean r2 = r2.contains(r8)     // Catch: java.lang.Exception -> Lca
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> Lca
            goto L74
        L73:
            r2 = r5
        L74:
            if (r2 == 0) goto L81
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> Lca
            boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r8)     // Catch: java.lang.Exception -> Lca
            if (r8 == 0) goto L7f
            goto L81
        L7f:
            r8 = r1
            goto L82
        L81:
            r8 = r4
        L82:
            if (r8 == 0) goto L85
            goto L86
        L85:
            r2 = r5
        L86:
            if (r2 == 0) goto L9a
            r2.booleanValue()     // Catch: java.lang.Exception -> Lca
            wo.d1 r2 = r11.f503094z     // Catch: java.lang.Exception -> Lca
            if (r2 == 0) goto L9a
            r2.g(r5)     // Catch: java.lang.Exception -> Lca
            goto L9a
        L93:
            wo.d1 r2 = r11.f503094z     // Catch: java.lang.Exception -> Lca
            if (r2 == 0) goto L9a
            r2.g(r5)     // Catch: java.lang.Exception -> Lca
        L9a:
            wo.d1 r2 = r11.f503094z     // Catch: java.lang.Exception -> Lca
            if (r2 == 0) goto La1
            r2.l()     // Catch: java.lang.Exception -> Lca
        La1:
            wo.d1 r2 = r11.f503094z     // Catch: java.lang.Exception -> Lca
            if (r2 == 0) goto La8
            r2.d()     // Catch: java.lang.Exception -> Lca
        La8:
            r11.f503094z = r5     // Catch: java.lang.Exception -> Lca
            java.lang.String r2 = "release camera end, use %dms, %s"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> Lca
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> Lca
            long r9 = r9 - r6
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Exception -> Lca
            r8[r1] = r6     // Catch: java.lang.Exception -> Lca
            android.os.Looper r6 = android.os.Looper.myLooper()     // Catch: java.lang.Exception -> Lca
            r8[r4] = r6     // Catch: java.lang.Exception -> Lca
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2, r8)     // Catch: java.lang.Exception -> Lca
        Lc3:
            r3.f511990k = r4     // Catch: java.lang.Exception -> Lca
            r11.f503070s = r5     // Catch: java.lang.Exception -> Lca
            r11.f503073v = r1     // Catch: java.lang.Exception -> Lca
            goto Ld2
        Lca:
            r2 = move-exception
            java.lang.String r3 = "cameraRelease error"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r2, r3, r1)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ts0.l.mo167002x41012807():void");
    }

    @Override // ts0.r
    public void s(boolean z17) {
        try {
            wo.d1 d1Var = this.f503094z;
            android.hardware.Camera.Parameters c17 = d1Var != null ? d1Var.c() : null;
            if (z17) {
                if (c17 != null) {
                    c17.setFlashMode("torch");
                }
            } else if (c17 != null) {
                c17.setFlashMode("off");
            }
            wo.d1 d1Var2 = this.f503094z;
            if (d1Var2 == null) {
                return;
            }
            d1Var2.f(c17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f503091w, e17, "set flash mode error", new java.lang.Object[0]);
        }
    }

    @Override // ts0.r
    /* renamed from: setFlashMode */
    public void mo167003x175c5771(int i17) {
        if (i17 == 1) {
            s(true);
        } else if (i17 == 2) {
            s(false);
        } else {
            if (i17 != 3) {
                return;
            }
            s(false);
        }
    }

    @Override // ts0.r
    public void t(boolean z17, boolean z18, int i17) {
        int intValue;
        if (this.f503094z == null || !G()) {
            return;
        }
        try {
            try {
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f503091w, "triggerSmallZoom error: %s", e17.getMessage());
            }
            if (this.f503072u) {
                return;
            }
            wo.d1 d1Var = this.f503094z;
            android.hardware.Camera.Parameters c17 = d1Var != null ? d1Var.c() : null;
            if (c17 != null && c17.isZoomSupported()) {
                this.f503072u = true;
                int zoom = c17.getZoom();
                java.util.ArrayList arrayList = this.I;
                int indexOf = arrayList.indexOf(java.lang.Integer.valueOf(zoom));
                int maxZoom = c17.getMaxZoom();
                if (z17) {
                    if (zoom >= maxZoom) {
                        return;
                    }
                    if (indexOf == arrayList.size() - 1) {
                        intValue = ((java.lang.Number) kz5.n0.i0(arrayList)).intValue();
                    } else {
                        java.lang.Object obj = arrayList.get(indexOf + 1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                        intValue = ((java.lang.Number) obj).intValue();
                    }
                } else {
                    if (zoom == 0) {
                        return;
                    }
                    if (indexOf == 0) {
                        intValue = ((java.lang.Number) kz5.n0.X(arrayList)).intValue();
                    } else {
                        java.lang.Object obj2 = arrayList.get(indexOf - 1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                        intValue = ((java.lang.Number) obj2).intValue();
                    }
                }
                c17.isSmoothZoomSupported();
                c17.setZoom(intValue);
                wo.d1 d1Var2 = this.f503094z;
                if (d1Var2 != null) {
                    d1Var2.f(c17);
                }
            }
        } finally {
            this.f503072u = false;
        }
    }

    @Override // ts0.r
    public void u(int i17, int i18) {
        if (this.f503071t > 0) {
            return;
        }
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i19 = h17.y;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), h17};
        java.lang.String str = this.f503091w;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "calcScrollZoomStep, recordButtonTopLocation: %s, screenSize: %s", objArr);
        if (i19 / 2 >= i17) {
            return;
        }
        try {
            wo.d1 d1Var = this.f503094z;
            if (d1Var != null) {
                android.hardware.Camera.Parameters c17 = d1Var != null ? d1Var.c() : null;
                int maxZoom = c17 != null ? c17.getMaxZoom() : 0;
                double d17 = maxZoom / ((i17 / 3.0d) / i18);
                if (d17 > 0.0d) {
                    this.f503071t = ((int) d17) + 1;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "scrollSmallZoomStep: %s, maxZoom: %s", java.lang.Integer.valueOf(this.f503071t), java.lang.Integer.valueOf(maxZoom));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "calcScrollZoomStep error: %s", e17.getMessage());
        }
    }

    @Override // ts0.r
    public android.graphics.Point v(boolean z17) {
        android.graphics.Point point;
        di3.g0 g0Var = this.f503062k;
        if (z17 && (point = this.f503070s) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point);
            return point;
        }
        return new android.graphics.Point(g0Var.f314244c, g0Var.f314243b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:3:0x0005, B:12:0x0022, B:14:0x0049, B:15:0x005a, B:20:0x005f, B:22:0x0053), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #0 {Exception -> 0x0062, blocks: (B:3:0x0005, B:12:0x0022, B:14:0x0049, B:15:0x005a, B:20:0x005f, B:22:0x0053), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:3:0x0005, B:12:0x0022, B:14:0x0049, B:15:0x005a, B:20:0x005f, B:22:0x0053), top: B:2:0x0005 }] */
    @Override // ts0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int w(int r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.f503091w
            java.lang.String r1 = "infoOrientation: "
            r2 = 0
            android.hardware.Camera$CameraInfo r3 = new android.hardware.Camera$CameraInfo     // Catch: java.lang.Exception -> L62
            r3.<init>()     // Catch: java.lang.Exception -> L62
            android.hardware.Camera.getCameraInfo(r5, r3)     // Catch: java.lang.Exception -> L62
            if (r6 == 0) goto L18
            r5 = 1
            if (r6 == r5) goto L20
            r5 = 2
            if (r6 == r5) goto L1d
            r5 = 3
            if (r6 == r5) goto L1a
        L18:
            r5 = r2
            goto L22
        L1a:
            r5 = 270(0x10e, float:3.78E-43)
            goto L22
        L1d:
            r5 = 180(0xb4, float:2.52E-43)
            goto L22
        L20:
            r5 = 90
        L22:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L62
            r6.<init>(r1)     // Catch: java.lang.Exception -> L62
            int r1 = r3.orientation     // Catch: java.lang.Exception -> L62
            r6.append(r1)     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = ", screenRotation: "
            r6.append(r1)     // Catch: java.lang.Exception -> L62
            r6.append(r5)     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = ", isBackCamera():"
            r6.append(r1)     // Catch: java.lang.Exception -> L62
            boolean r1 = r4.f503058g     // Catch: java.lang.Exception -> L62
            r6.append(r1)     // Catch: java.lang.Exception -> L62
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L62
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r6)     // Catch: java.lang.Exception -> L62
            boolean r6 = r4.f503058g     // Catch: java.lang.Exception -> L62
            if (r6 != 0) goto L53
            int r6 = r3.orientation     // Catch: java.lang.Exception -> L62
            int r6 = r6 + r5
            int r6 = r6 % 360
            int r5 = 360 - r6
            int r5 = r5 % 360
            goto L5a
        L53:
            int r6 = r3.orientation     // Catch: java.lang.Exception -> L62
            int r6 = r6 - r5
            int r6 = r6 + 360
            int r5 = r6 % 360
        L5a:
            wo.h r6 = r4.A     // Catch: java.lang.Exception -> L62
            if (r6 != 0) goto L5f
            goto L61
        L5f:
            r6.f529247b = r5     // Catch: java.lang.Exception -> L62
        L61:
            return r5
        L62:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "setCameraDisplayOrientation failed cause "
            r6.<init>(r1)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ts0.l.w(int, int):int");
    }

    @Override // ts0.r
    public boolean y(android.graphics.Rect focusArea, android.graphics.Rect meteringArea) {
        java.lang.String str = this.f503091w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusArea, "focusArea");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(meteringArea, "meteringArea");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "focus on area :: focus rect %s, meter rect %s", focusArea, meteringArea);
            wo.d1 d1Var = this.f503094z;
            android.hardware.Camera.Parameters c17 = d1Var != null ? d1Var.c() : null;
            java.util.List<java.lang.String> supportedFocusModes = c17 != null ? c17.getSupportedFocusModes() : null;
            if (supportedFocusModes != null && supportedFocusModes.contains("auto")) {
                c17.setFocusMode("auto");
            }
            if ((c17 != null ? c17.getMaxNumFocusAreas() : 0) > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                arrayList.add(new android.hardware.Camera.Area(focusArea, 1000));
                if (c17 != null) {
                    c17.setFocusAreas(arrayList);
                }
            }
            if ((c17 != null ? c17.getMaxNumMeteringAreas() : 0) > 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
                arrayList2.add(new android.hardware.Camera.Area(meteringArea, 1000));
                if (c17 != null) {
                    c17.setMeteringAreas(arrayList2);
                }
            }
            wo.d1 d1Var2 = this.f503094z;
            if (d1Var2 != null) {
                d1Var2.f(c17);
            }
            wo.d1 d1Var3 = this.f503094z;
            if (d1Var3 != null) {
                d1Var3.b(this.B);
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "autofocus with area fail, exception %s", e17.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    @Override // ts0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ts0.c z() {
        /*
            r7 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "generateCameraConfig"
            java.lang.String r3 = r7.f503091w
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(r3, r2, r1)
            wo.d1 r1 = r7.f503094z
            r2 = 0
            if (r1 != 0) goto L15
            java.lang.String r0 = "generateCameraConfig, camera is null!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            return r2
        L15:
            boolean r1 = r7.G()
            if (r1 != 0) goto L21
            java.lang.String r0 = "generateCameraConfig, camera not previewing"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            return r2
        L21:
            wo.d1 r1 = r7.f503094z
            di3.g0 r2 = r7.f503062k
            if (r1 != 0) goto L28
            goto L48
        L28:
            wo.h r1 = r7.A
            if (r1 == 0) goto L48
            boolean r1 = r7.f503060i     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto L37
            android.graphics.Point r1 = r7.f503070s     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto L37
            int r1 = r1.x     // Catch: java.lang.Exception -> L3a
            goto L49
        L37:
            int r1 = r2.f314244c     // Catch: java.lang.Exception -> L3a
            goto L49
        L3a:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r4 = "getPreviewWidth: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r4, r1)
        L48:
            r1 = r0
        L49:
            ts0.c r4 = r7.f503063l
            r4.getClass()
            ts0.c.f503076c = r1
            wo.d1 r1 = r7.f503094z
            if (r1 != 0) goto L55
            goto L75
        L55:
            wo.h r1 = r7.A
            if (r1 == 0) goto L75
            boolean r1 = r7.f503060i     // Catch: java.lang.Exception -> L67
            if (r1 == 0) goto L64
            android.graphics.Point r1 = r7.f503070s     // Catch: java.lang.Exception -> L67
            if (r1 == 0) goto L64
            int r1 = r1.y     // Catch: java.lang.Exception -> L67
            goto L76
        L64:
            int r1 = r2.f314243b     // Catch: java.lang.Exception -> L67
            goto L76
        L67:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r5 = "getPreviewHeight: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r5, r1)
        L75:
            r1 = r0
        L76:
            ts0.c.f503075b = r1
            wo.h r1 = r7.A
            r3 = 1
            if (r1 == 0) goto L89
            int r5 = r1.f529247b
            r6 = 90
            if (r5 == r6) goto L87
            r6 = 270(0x10e, float:3.78E-43)
            if (r5 != r6) goto L89
        L87:
            r5 = r3
            goto L8a
        L89:
            r5 = r0
        L8a:
            int r6 = r2.f314244c
            ts0.c.f503079f = r6
            int r2 = r2.f314243b
            ts0.c.f503080g = r2
            if (r5 == 0) goto L98
            ts0.c.f503079f = r2
            ts0.c.f503080g = r6
        L98:
            if (r1 == 0) goto La7
            boolean r1 = r7.G()
            if (r1 == 0) goto La7
            wo.h r1 = r7.A
            if (r1 == 0) goto La8
            int r0 = r1.f529247b
            goto La8
        La7:
            r0 = -1
        La8:
            ts0.c.f503077d = r0
            boolean r0 = r7.f503058g
            r0 = r0 ^ r3
            ts0.c.f503081h = r0
            boolean r0 = r7.f503060i
            ts0.c.f503082i = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ts0.l.z():ts0.c");
    }
}

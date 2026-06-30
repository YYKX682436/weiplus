package az0;

/* loaded from: classes14.dex */
public final class w2 implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.w0, android.graphics.SurfaceTexture.OnFrameAvailableListener {
    public static boolean A;
    public static jz5.o B;
    public static boolean C;
    public static java.lang.Boolean D;

    /* renamed from: e, reason: collision with root package name */
    public static yz5.r f97525e;

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4028xa5c0f76d f97526f;

    /* renamed from: g, reason: collision with root package name */
    public static rs0.h f97527g;

    /* renamed from: h, reason: collision with root package name */
    public static is0.c f97528h;

    /* renamed from: i, reason: collision with root package name */
    public static android.graphics.SurfaceTexture f97529i;

    /* renamed from: m, reason: collision with root package name */
    public static az0.n2 f97530m;

    /* renamed from: n, reason: collision with root package name */
    public static android.opengl.EGLSurface f97531n;

    /* renamed from: o, reason: collision with root package name */
    public static android.os.HandlerThread f97532o;

    /* renamed from: p, reason: collision with root package name */
    public static android.os.Handler f97533p;

    /* renamed from: q, reason: collision with root package name */
    public static android.view.Surface f97534q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f97535r;

    /* renamed from: t, reason: collision with root package name */
    public static int f97537t;

    /* renamed from: u, reason: collision with root package name */
    public static int f97538u;

    /* renamed from: v, reason: collision with root package name */
    public static int f97539v;

    /* renamed from: w, reason: collision with root package name */
    public static int f97540w;

    /* renamed from: x, reason: collision with root package name */
    public static java.util.concurrent.CountDownLatch f97541x;

    /* renamed from: y, reason: collision with root package name */
    public static java.util.concurrent.CountDownLatch f97542y;

    /* renamed from: z, reason: collision with root package name */
    public static java.util.concurrent.CountDownLatch f97543z;

    /* renamed from: d, reason: collision with root package name */
    public static final az0.w2 f97524d = new az0.w2();

    /* renamed from: s, reason: collision with root package name */
    public static az0.m2 f97536s = az0.m2.f97218d;
    public static boolean E = true;

    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4028xa5c0f76d a() {
        if (!d()) {
            return null;
        }
        java.util.concurrent.CountDownLatch countDownLatch = f97542y;
        if (countDownLatch != null) {
            countDownLatch.await();
        }
        return f97526f;
    }

    public final synchronized void b(boolean z17) {
        if (f97533p == null) {
            java.lang.String str = "maas-Camera" + hashCode();
            int i17 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a(str, -4);
            a17.start();
            android.os.Handler handler = new android.os.Handler(a17.getLooper());
            f97532o = a17;
            f97533p = handler;
            if (f97527g == null) {
                f97541x = new java.util.concurrent.CountDownLatch(1);
                android.opengl.EGLContext eGLContext = null;
                if (!z17) {
                    az0.i5 i5Var = az0.i5.f97090a;
                    if (i5Var.t()) {
                        eGLContext = i5Var.q().d();
                    }
                }
                android.os.Handler handler2 = f97533p;
                if (handler2 != null) {
                    handler2.post(new az0.r2(eGLContext));
                }
            }
        }
    }

    public final void c(float[] textureTransform, int i17, int i18) {
        is0.c cVar = f97528h;
        if (cVar != null) {
            int i19 = cVar.f375928e;
            az0.n2 n2Var = f97530m;
            if (n2Var != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureTransform, "textureTransform");
                if (n2Var.f97265c == -1) {
                    n2Var.f97263a = i17;
                    n2Var.f97264b = i18;
                    rs0.g gVar = rs0.i.f480829a;
                    n2Var.f97265c = gVar.h(i17, i18);
                    int q17 = gVar.q();
                    n2Var.f97266d = q17;
                    gVar.b(q17, n2Var.f97265c);
                }
                if (i18 != n2Var.f97264b || i17 != n2Var.f97263a) {
                    android.opengl.GLES20.glBindTexture(3553, n2Var.f97265c);
                    android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, i17, i18, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
                    n2Var.f97263a = i17;
                    n2Var.f97264b = i18;
                    android.opengl.GLES20.glBindTexture(3553, 0);
                }
                android.opengl.GLES20.glBindFramebuffer(36160, n2Var.f97266d);
                n2Var.b(i19, textureTransform, i17, i18, i17, i18, true);
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
            }
        }
    }

    public final boolean d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("usePreloadCaptureSession ");
        boolean z17 = false;
        sb6.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20422x11983563()) == 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMJCaptureSessionPreload", sb6.toString());
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20422x11983563()) == 1;
        java.lang.Boolean bool = D;
        if (bool == null) {
            return z18;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE);
        if (z18 && b17) {
            z17 = true;
        }
        return z17;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        rs0.h hVar;
        java.lang.Integer num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        try {
            surfaceTexture.updateTexImage();
            float[] fArr = new float[16];
            surfaceTexture.getTransformMatrix(fArr);
            if (A) {
                A = false;
                rs0.h hVar2 = f97527g;
                int i17 = -1;
                if (hVar2 != null) {
                    android.opengl.EGLDisplay eGLDisplay = hVar2.f480825a;
                    android.opengl.EGLSurface eGLSurface = hVar2.f480826b;
                    android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, hVar2.f480827c);
                    is0.c cVar = f97528h;
                    if (cVar != null) {
                        az0.n2 n2Var = f97530m;
                        if (n2Var != null) {
                            int i18 = cVar.f375928e;
                            int i19 = f97538u;
                            int i27 = f97537t;
                            rs0.g gVar = rs0.i.f480829a;
                            int h17 = gVar.h(i19, i27);
                            int q17 = gVar.q();
                            gVar.b(q17, h17);
                            n2Var.b(i18, fArr, i19, i27, i19, i27, true);
                            android.opengl.GLES20.glBindFramebuffer(36160, 0);
                            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{q17}, 0);
                            num = java.lang.Integer.valueOf(h17);
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            i17 = num.intValue();
                        }
                    }
                }
                android.opengl.GLES20.glFlush();
                B = new jz5.o(java.lang.Integer.valueOf(i17), new com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3980xd5210a8a(f97538u, f97537t), java.lang.Long.valueOf(surfaceTexture.getTimestamp()));
                java.util.concurrent.CountDownLatch countDownLatch = f97543z;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
            if (f97536s == az0.m2.f97218d) {
                return;
            }
            if (f97536s == az0.m2.f97219e) {
                rs0.h hVar3 = f97527g;
                if (hVar3 != null) {
                    android.opengl.EGLSurface eGLSurface2 = f97531n;
                    if (eGLSurface2 == null) {
                        return;
                    }
                    android.opengl.EGL14.eglMakeCurrent(hVar3.f480825a, eGLSurface2, eGLSurface2, hVar3.f480827c);
                    int i28 = f97537t;
                    int i29 = f97538u;
                    rs0.h hVar4 = f97527g;
                    if (hVar4 != null && f97535r) {
                        is0.c cVar2 = f97528h;
                        if (cVar2 != null) {
                            int i37 = cVar2.f375928e;
                            az0.n2 n2Var2 = f97530m;
                            if (n2Var2 != null) {
                                int i38 = f97539v;
                                int i39 = f97540w;
                                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                                n2Var2.b(i37, fArr, i28, i29, i38, i39, false);
                            }
                        }
                        android.opengl.EGL14.eglSwapBuffers(hVar4.f480825a, f97531n);
                    }
                }
            } else if (f97536s == az0.m2.f97220f && (hVar = f97527g) != null) {
                android.opengl.EGLDisplay eGLDisplay2 = hVar.f480825a;
                android.opengl.EGLSurface eGLSurface3 = hVar.f480826b;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface3, hVar.f480827c);
            }
            if (E) {
                E = false;
                i95.m c17 = i95.n0.c(pp0.m0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                pp0.m0.ee((pp0.m0) c17, "mjpublisher_first_camera_impression", null, "Completed", null, 8, null);
            }
            if (f97527g != null) {
                f97524d.c(fArr, f97538u, f97537t);
                android.opengl.GLES20.glFlush();
                az0.n2 n2Var3 = f97530m;
                java.lang.Integer valueOf = n2Var3 != null ? java.lang.Integer.valueOf(n2Var3.f97265c) : null;
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    yz5.r rVar = f97525e;
                    if (rVar != null) {
                        rVar.C(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(f97538u), java.lang.Integer.valueOf(f97537t), java.lang.Long.valueOf(surfaceTexture.getTimestamp()));
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMJCaptureSessionPreload", "onFrameAvailable " + e17);
        }
    }
}

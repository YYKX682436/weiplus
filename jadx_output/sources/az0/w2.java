package az0;

/* loaded from: classes14.dex */
public final class w2 implements com.tencent.maas.camstudio.w0, android.graphics.SurfaceTexture.OnFrameAvailableListener {
    public static boolean A;
    public static jz5.o B;
    public static boolean C;
    public static java.lang.Boolean D;

    /* renamed from: e, reason: collision with root package name */
    public static yz5.r f15992e;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.maas.camstudio.MJCaptureSession f15993f;

    /* renamed from: g, reason: collision with root package name */
    public static rs0.h f15994g;

    /* renamed from: h, reason: collision with root package name */
    public static is0.c f15995h;

    /* renamed from: i, reason: collision with root package name */
    public static android.graphics.SurfaceTexture f15996i;

    /* renamed from: m, reason: collision with root package name */
    public static az0.n2 f15997m;

    /* renamed from: n, reason: collision with root package name */
    public static android.opengl.EGLSurface f15998n;

    /* renamed from: o, reason: collision with root package name */
    public static android.os.HandlerThread f15999o;

    /* renamed from: p, reason: collision with root package name */
    public static android.os.Handler f16000p;

    /* renamed from: q, reason: collision with root package name */
    public static android.view.Surface f16001q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f16002r;

    /* renamed from: t, reason: collision with root package name */
    public static int f16004t;

    /* renamed from: u, reason: collision with root package name */
    public static int f16005u;

    /* renamed from: v, reason: collision with root package name */
    public static int f16006v;

    /* renamed from: w, reason: collision with root package name */
    public static int f16007w;

    /* renamed from: x, reason: collision with root package name */
    public static java.util.concurrent.CountDownLatch f16008x;

    /* renamed from: y, reason: collision with root package name */
    public static java.util.concurrent.CountDownLatch f16009y;

    /* renamed from: z, reason: collision with root package name */
    public static java.util.concurrent.CountDownLatch f16010z;

    /* renamed from: d, reason: collision with root package name */
    public static final az0.w2 f15991d = new az0.w2();

    /* renamed from: s, reason: collision with root package name */
    public static az0.m2 f16003s = az0.m2.f15685d;
    public static boolean E = true;

    public final com.tencent.maas.camstudio.MJCaptureSession a() {
        if (!d()) {
            return null;
        }
        java.util.concurrent.CountDownLatch countDownLatch = f16009y;
        if (countDownLatch != null) {
            countDownLatch.await();
        }
        return f15993f;
    }

    public final synchronized void b(boolean z17) {
        if (f16000p == null) {
            java.lang.String str = "maas-Camera" + hashCode();
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a(str, -4);
            a17.start();
            android.os.Handler handler = new android.os.Handler(a17.getLooper());
            f15999o = a17;
            f16000p = handler;
            if (f15994g == null) {
                f16008x = new java.util.concurrent.CountDownLatch(1);
                android.opengl.EGLContext eGLContext = null;
                if (!z17) {
                    az0.i5 i5Var = az0.i5.f15557a;
                    if (i5Var.t()) {
                        eGLContext = i5Var.q().d();
                    }
                }
                android.os.Handler handler2 = f16000p;
                if (handler2 != null) {
                    handler2.post(new az0.r2(eGLContext));
                }
            }
        }
    }

    public final void c(float[] textureTransform, int i17, int i18) {
        is0.c cVar = f15995h;
        if (cVar != null) {
            int i19 = cVar.f294395e;
            az0.n2 n2Var = f15997m;
            if (n2Var != null) {
                kotlin.jvm.internal.o.g(textureTransform, "textureTransform");
                if (n2Var.f15732c == -1) {
                    n2Var.f15730a = i17;
                    n2Var.f15731b = i18;
                    rs0.g gVar = rs0.i.f399296a;
                    n2Var.f15732c = gVar.h(i17, i18);
                    int q17 = gVar.q();
                    n2Var.f15733d = q17;
                    gVar.b(q17, n2Var.f15732c);
                }
                if (i18 != n2Var.f15731b || i17 != n2Var.f15730a) {
                    android.opengl.GLES20.glBindTexture(3553, n2Var.f15732c);
                    android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, i17, i18, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
                    n2Var.f15730a = i17;
                    n2Var.f15731b = i18;
                    android.opengl.GLES20.glBindTexture(3553, 0);
                }
                android.opengl.GLES20.glBindFramebuffer(36160, n2Var.f15733d);
                n2Var.b(i19, textureTransform, i17, i18, i17, i18, true);
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
            }
        }
    }

    public final boolean d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("usePreloadCaptureSession ");
        boolean z17 = false;
        sb6.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingAndroidCamo()) == 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMJCaptureSessionPreload", sb6.toString());
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingAndroidCamo()) == 1;
        java.lang.Boolean bool = D;
        if (bool == null) {
            return z18;
        }
        boolean b17 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE);
        if (z18 && b17) {
            z17 = true;
        }
        return z17;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        rs0.h hVar;
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        try {
            surfaceTexture.updateTexImage();
            float[] fArr = new float[16];
            surfaceTexture.getTransformMatrix(fArr);
            if (A) {
                A = false;
                rs0.h hVar2 = f15994g;
                int i17 = -1;
                if (hVar2 != null) {
                    android.opengl.EGLDisplay eGLDisplay = hVar2.f399292a;
                    android.opengl.EGLSurface eGLSurface = hVar2.f399293b;
                    android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, hVar2.f399294c);
                    is0.c cVar = f15995h;
                    if (cVar != null) {
                        az0.n2 n2Var = f15997m;
                        if (n2Var != null) {
                            int i18 = cVar.f294395e;
                            int i19 = f16005u;
                            int i27 = f16004t;
                            rs0.g gVar = rs0.i.f399296a;
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
                B = new jz5.o(java.lang.Integer.valueOf(i17), new com.tencent.maas.camerafun.MJPixelSize(f16005u, f16004t), java.lang.Long.valueOf(surfaceTexture.getTimestamp()));
                java.util.concurrent.CountDownLatch countDownLatch = f16010z;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
            if (f16003s == az0.m2.f15685d) {
                return;
            }
            if (f16003s == az0.m2.f15686e) {
                rs0.h hVar3 = f15994g;
                if (hVar3 != null) {
                    android.opengl.EGLSurface eGLSurface2 = f15998n;
                    if (eGLSurface2 == null) {
                        return;
                    }
                    android.opengl.EGL14.eglMakeCurrent(hVar3.f399292a, eGLSurface2, eGLSurface2, hVar3.f399294c);
                    int i28 = f16004t;
                    int i29 = f16005u;
                    rs0.h hVar4 = f15994g;
                    if (hVar4 != null && f16002r) {
                        is0.c cVar2 = f15995h;
                        if (cVar2 != null) {
                            int i37 = cVar2.f294395e;
                            az0.n2 n2Var2 = f15997m;
                            if (n2Var2 != null) {
                                int i38 = f16006v;
                                int i39 = f16007w;
                                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                                n2Var2.b(i37, fArr, i28, i29, i38, i39, false);
                            }
                        }
                        android.opengl.EGL14.eglSwapBuffers(hVar4.f399292a, f15998n);
                    }
                }
            } else if (f16003s == az0.m2.f15687f && (hVar = f15994g) != null) {
                android.opengl.EGLDisplay eGLDisplay2 = hVar.f399292a;
                android.opengl.EGLSurface eGLSurface3 = hVar.f399293b;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface3, hVar.f399294c);
            }
            if (E) {
                E = false;
                i95.m c17 = i95.n0.c(pp0.m0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                pp0.m0.ee((pp0.m0) c17, "mjpublisher_first_camera_impression", null, "Completed", null, 8, null);
            }
            if (f15994g != null) {
                f15991d.c(fArr, f16005u, f16004t);
                android.opengl.GLES20.glFlush();
                az0.n2 n2Var3 = f15997m;
                java.lang.Integer valueOf = n2Var3 != null ? java.lang.Integer.valueOf(n2Var3.f15732c) : null;
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    yz5.r rVar = f15992e;
                    if (rVar != null) {
                        rVar.C(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(f16005u), java.lang.Integer.valueOf(f16004t), java.lang.Long.valueOf(surfaceTexture.getTimestamp()));
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasMJCaptureSessionPreload", "onFrameAvailable " + e17);
        }
    }
}

package ft0;

/* loaded from: classes14.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final et0.r f347993a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f347994b;

    /* renamed from: c, reason: collision with root package name */
    public ms0.c f347995c;

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLContext f347996d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f347997e;

    /* renamed from: f, reason: collision with root package name */
    public final int f347998f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f347999g;

    public d(et0.r view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f347993a = view;
        this.f347994b = "MicroMsg.AbsPreviewController";
        this.f347998f = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        this.f347999g = new java.lang.Object();
    }

    public static /* synthetic */ void h(ft0.d dVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: release");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        dVar.g(z17, z18);
    }

    public di3.o a() {
        return null;
    }

    public final android.graphics.SurfaceTexture b() {
        android.graphics.SurfaceTexture surfaceTexture;
        ms0.c cVar = this.f347995c;
        if (cVar == null) {
            return null;
        }
        synchronized (cVar) {
            surfaceTexture = cVar.f412486i;
        }
        return surfaceTexture;
    }

    public final is0.c c() {
        ms0.c cVar = this.f347995c;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public final void d(javax.microedition.khronos.opengles.GL10 gl10) {
        ms0.c cVar = this.f347995c;
        if (cVar != null) {
            cVar.onDrawFrame(gl10);
        }
    }

    public final void e(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        ms0.c cVar = this.f347995c;
        if (cVar != null) {
            cVar.onSurfaceChanged(gl10, i17, i18);
        }
    }

    public final void f(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        this.f347996d = android.opengl.EGL14.eglGetCurrentContext();
        android.opengl.EGL14.eglGetCurrentSurface(12377);
        ms0.c cVar = this.f347995c;
        if (cVar != null) {
            cVar.onSurfaceCreated(gl10, eGLConfig);
        }
    }

    public final void g(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347994b, "release, needPostRenderThread:" + z17 + ", block:" + z18);
        ft0.b bVar = new ft0.b(this, z17, z18);
        if (!z17) {
            bVar.mo152xb9724478();
            return;
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347994b, "start post release");
        this.f347993a.l(bVar);
        if (z18) {
            synchronized (this.f347999g) {
                try {
                    this.f347999g.wait(100L);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f347994b, e17, "wait release error", new java.lang.Object[0]);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347994b, "wait release finished cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    public void i(ms0.c renderer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderer, "renderer");
        this.f347995c = renderer;
        renderer.f412495r = new ft0.c(this, renderer);
    }

    public void j(ts0.c cameraConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraConfig, "cameraConfig");
        int i17 = 0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f347994b, "updateCameraConfig: " + cameraConfig, new java.lang.Object[0]);
        android.graphics.Point point = new android.graphics.Point(ts0.c.f503076c, ts0.c.f503075b);
        ms0.c cVar = this.f347995c;
        if (cVar != null) {
            cVar.u(point.x, point.y);
        }
        ms0.c cVar2 = this.f347995c;
        if (cVar2 != null) {
            int i18 = ts0.c.f503078e;
            if (i18 == -1) {
                java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                i18 = ((android.view.WindowManager) systemService).getDefaultDisplay().getRotation();
            }
            if (i18 != 0) {
                if (i18 == 1) {
                    i17 = 90;
                } else if (i18 == 2) {
                    i17 = 180;
                } else if (i18 == 3) {
                    i17 = 270;
                }
            }
            int i19 = ts0.c.f503077d - i17;
            int i27 = this.f347998f;
            cVar2.r((i19 + i27) % i27);
        }
        ms0.c cVar3 = this.f347995c;
        if (cVar3 != null) {
            cVar3.m(ts0.c.f503081h);
        }
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.video.videoview;

/* loaded from: classes15.dex */
public abstract class AbstractVideoTextureView extends android.view.TextureView implements ff1.e0 {
    public static final /* synthetic */ int Q = 0;
    public final ye1.m A;
    public final ye1.n B;
    public final ye1.f C;
    public final ye1.l D;
    public final ye1.g E;
    public final ye1.j F;
    public long G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f83655J;
    public final android.view.TextureView.SurfaceTextureListener K;
    public boolean L;
    public long M;
    public final ff1.f0 N;
    public float P;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f83656d;

    /* renamed from: e, reason: collision with root package name */
    public int f83657e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.Surface f83658f;

    /* renamed from: g, reason: collision with root package name */
    public ye1.e f83659g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f83660h;

    /* renamed from: i, reason: collision with root package name */
    public int f83661i;

    /* renamed from: m, reason: collision with root package name */
    public int f83662m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f83663n;

    /* renamed from: o, reason: collision with root package name */
    public ff1.z f83664o;

    /* renamed from: p, reason: collision with root package name */
    public ff1.d0 f83665p;

    /* renamed from: q, reason: collision with root package name */
    public ff1.b0 f83666q;

    /* renamed from: r, reason: collision with root package name */
    public ff1.a0 f83667r;

    /* renamed from: s, reason: collision with root package name */
    public ff1.c0 f83668s;

    /* renamed from: t, reason: collision with root package name */
    public long f83669t;

    /* renamed from: u, reason: collision with root package name */
    public long f83670u;

    /* renamed from: v, reason: collision with root package name */
    public int f83671v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f83672w;

    /* renamed from: x, reason: collision with root package name */
    public oe1.s1 f83673x;

    /* renamed from: y, reason: collision with root package name */
    public final ye1.q f83674y;

    /* renamed from: z, reason: collision with root package name */
    public final ye1.p f83675z;

    public AbstractVideoTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(android.graphics.SurfaceTexture surfaceTexture) {
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, null);
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
        egl10.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, eGLConfigArr, 1, new int[1]);
        javax.microedition.khronos.egl.EGLConfig eGLConfig = eGLConfigArr[0];
        javax.microedition.khronos.egl.EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = egl10.eglCreateWindowSurface(eglGetDisplay, eGLConfig, surfaceTexture, new int[]{12344});
        egl10.eglMakeCurrent(eglGetDisplay, eglCreateWindowSurface, eglCreateWindowSurface, eglCreateContext);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        egl10.eglSwapBuffers(eglGetDisplay, eglCreateWindowSurface);
        egl10.eglDestroySurface(eglGetDisplay, eglCreateWindowSurface);
        javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
        egl10.eglTerminate(eglGetDisplay);
    }

    public abstract ye1.e b();

    public boolean c() {
        ye1.e eVar = this.f83659g;
        boolean isPlaying = (eVar == null || !this.f83660h || this.I || this.f83655J) ? false : eVar.isPlaying();
        d("is playing result [%b] pauseWhenUpdated[%b] mIsPrepared[%b]", java.lang.Boolean.valueOf(isPlaying), java.lang.Boolean.valueOf(this.I), java.lang.Boolean.valueOf(this.f83660h));
        return isPlaying;
    }

    public final void d(java.lang.String str, java.lang.Object... objArr) {
        java.util.Objects.toString(this.f83673x);
    }

    public final void e(java.lang.String str, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Video.AbstractVideoTextureView", this.f83673x + " " + str, objArr);
    }

    public final void f(java.lang.Throwable th6, java.lang.String str, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Video.AbstractVideoTextureView", th6, this.f83673x + " " + str, objArr);
    }

    public final void g(java.lang.String str, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.w("MicroMsg.Video.AbstractVideoTextureView", this.f83673x + " " + str, objArr);
    }

    @Override // ff1.e0
    public int getCurrentPosition() {
        ye1.e eVar = this.f83659g;
        return (eVar == null || !this.f83660h) ? eVar == null ? -1 : 0 : eVar.getCurrentPosition();
    }

    public int getDownloadPercent() {
        return this.f83671v;
    }

    @Override // ff1.e0
    public int getDuration() {
        ye1.e eVar = this.f83659g;
        if (eVar == null || !this.f83660h) {
            this.f83657e = -1;
            return -1;
        }
        int i17 = this.f83657e;
        if (i17 > 0) {
            return i17;
        }
        int duration = eVar.getDuration();
        this.f83657e = duration;
        return duration;
    }

    public double getLastProgresstime() {
        return 0.0d;
    }

    public long getLastSurfaceUpdateTime() {
        return this.G;
    }

    @Override // ff1.e0
    public java.lang.String getVideoPath() {
        return this.f83656d;
    }

    public final void h() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f83656d) || this.f83658f == null) {
            e("MicroMsg.Video.AbstractVideoTextureView", "openVideo, try later, url:%s, surface:%s", this.f83656d, this.f83658f);
            return;
        }
        j();
        e("MicroMsg.Video.AbstractVideoTextureView", "open video %s", this.f83656d);
        try {
            ye1.e b17 = b();
            this.f83659g = b17;
            b17.B(this.A);
            this.f83659g.g(this.f83674y);
            this.f83659g.s(this.f83675z);
            this.f83660h = false;
            this.f83657e = -1;
            this.f83671v = 0;
            this.f83659g.z(this.E);
            this.f83659g.r(this.F);
            this.f83659g.h(this.B);
            this.f83659g.d(this.C);
            this.f83659g.p(this.D);
            ff1.h hVar = new ff1.h(this);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f83656d)) {
                hVar.run();
            } else {
                this.f83659g.setMinBufferDuration(this.M);
                this.f83659g.u(this.f83656d, null, new ff1.i(this, hVar));
            }
            e("open video success player[%s]", this.f83659g);
        } catch (java.lang.Exception e17) {
            f(e17, "prepare async error path", new java.lang.Object[0]);
            ff1.z zVar = this.f83664o;
            if (zVar != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView) zVar).n(-1, -1);
            }
        }
    }

    public void i() {
        ye1.e eVar = this.f83659g;
        if (eVar != null && this.f83660h && eVar.isPlaying()) {
            d("pause video.", new java.lang.Object[0]);
            this.f83659g.pause();
        }
        this.f83663n = false;
    }

    public final void j() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(this.f83660h);
        objArr[1] = java.lang.Boolean.valueOf(this.f83659g == null);
        e("release media player isPrepared[%b] player is null[%b] ", objArr);
        ye1.e eVar = this.f83659g;
        if (eVar != null) {
            eVar.r(null);
            this.f83659g.g(null);
            this.f83659g.s(null);
            try {
                this.f83659g.stop();
            } catch (java.lang.Exception e17) {
                f(e17, "stop media player error", new java.lang.Object[0]);
            }
            ((ku5.t0) ku5.t0.f312615d).g(new ff1.f(this, this.f83659g));
            this.f83659g = null;
        }
    }

    public void k(double d17) {
        ye1.e eVar = this.f83659g;
        if (eVar != null) {
            eVar.seekTo((int) d17);
            this.f83663n = true;
            d("seek to time: " + d17 + " curr pos : " + this.f83659g.getCurrentPosition(), new java.lang.Object[0]);
        }
    }

    public boolean l() {
        if (this.f83658f == null) {
            g("it surface not ready, do not start", new java.lang.Object[0]);
            this.H = true;
            this.f83663n = true;
            return false;
        }
        long j17 = this.f83669t;
        if (j17 == 0) {
            j17 = com.tencent.mm.sdk.platformtools.t8.i1();
        }
        this.f83669t = j17;
        e("start %d mIsPrepared %b pauseWhenUpdated %b mediaPlayer %s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(this.f83660h), java.lang.Boolean.valueOf(this.I), this.f83659g);
        ye1.e eVar = this.f83659g;
        if (eVar != null && this.f83660h) {
            if (this.I) {
                this.I = false;
                setMute(this.L);
            }
            this.f83659g.start();
            this.f83663n = true;
            return true;
        }
        if (eVar != null || !this.f83660h) {
            this.f83663n = true;
            return false;
        }
        this.f83663n = true;
        h();
        requestLayout();
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f83661i == 0 || this.f83662m == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        int i19 = this.f83661i;
        int i27 = this.f83662m;
        ff1.f0 f0Var = this.N;
        if (f0Var.f261608c != defaultSize || f0Var.f261609d != defaultSize2 || f0Var.f261610e != i19 || f0Var.f261611f != i27) {
            f0Var.f261608c = defaultSize;
            f0Var.f261609d = defaultSize2;
            f0Var.f261610e = i19;
            f0Var.f261611f = i27;
            float f17 = (i19 * 1.0f) / i27;
            float f18 = defaultSize;
            float f19 = defaultSize2;
            float f27 = (1.0f * f18) / f19;
            oe1.m1 m1Var = f0Var.f261607b;
            if (m1Var == oe1.m1.DEFAULT) {
                f0Var.a(f17, f27);
            } else if (m1Var == oe1.m1.CONTAIN) {
                if (defaultSize < defaultSize2) {
                    int i28 = (int) (f18 / f17);
                    f0Var.f261613h = i28;
                    f0Var.f261612g = defaultSize;
                    if (i28 > defaultSize2) {
                        f0Var.f261612g = (int) (f19 * f17);
                        f0Var.f261613h = defaultSize2;
                    }
                } else {
                    int i29 = (int) (f19 * f17);
                    f0Var.f261612g = i29;
                    f0Var.f261613h = defaultSize2;
                    if (i29 > defaultSize) {
                        f0Var.f261613h = (int) (f18 / f17);
                        f0Var.f261612g = defaultSize;
                    }
                }
            } else if (m1Var == oe1.m1.FILL) {
                f0Var.f261613h = defaultSize2;
                f0Var.f261612g = defaultSize;
            } else if (m1Var != oe1.m1.COVER) {
                f0Var.a(f17, f27);
            } else if (defaultSize > defaultSize2) {
                int i37 = (int) (f18 / f17);
                f0Var.f261613h = i37;
                f0Var.f261612g = defaultSize;
                if (i37 < defaultSize2) {
                    f0Var.f261612g = (int) (f19 * f17);
                    f0Var.f261613h = defaultSize2;
                }
            } else {
                int i38 = (int) (f19 * f17);
                f0Var.f261612g = i38;
                f0Var.f261613h = defaultSize2;
                if (i38 < defaultSize) {
                    f0Var.f261613h = (int) (f18 / f17);
                    f0Var.f261612g = defaultSize;
                }
            }
        }
        setMeasuredDimension(f0Var.f261612g, f0Var.f261613h);
    }

    public void setForceScaleFullScreen(boolean z17) {
        this.N.f261606a = z17;
    }

    public void setLoop(boolean z17) {
        ye1.e eVar = this.f83659g;
        if (eVar != null) {
            eVar.b(z17);
        }
        this.f83672w = true;
    }

    @Override // ff1.e0
    public void setMinBufferDuration(long j17) {
        e("set minBufferDuration %d", java.lang.Long.valueOf(j17));
        this.M = j17;
        ye1.e eVar = this.f83659g;
        if (eVar != null) {
            eVar.setMinBufferDuration(j17);
        }
    }

    @Override // ff1.e0
    public void setMute(boolean z17) {
        e("set mute %b", java.lang.Boolean.valueOf(z17));
        this.L = z17;
        ye1.e eVar = this.f83659g;
        if (eVar != null) {
            if (z17) {
                eVar.c(0.0f, 0.0f);
            } else {
                eVar.c(1.0f, 1.0f);
            }
        }
    }

    @Override // ff1.e0
    public void setOnInfoCallback(ff1.a0 a0Var) {
        this.f83667r = a0Var;
    }

    @Override // ff1.e0
    public void setOnSeekCompleteCallback(ff1.b0 b0Var) {
        this.f83666q = b0Var;
    }

    @Override // ff1.e0
    public void setOnSurfaceCallback(ff1.c0 c0Var) {
        this.f83668s = c0Var;
    }

    @Override // ff1.e0
    public void setOneTimeVideoTextureUpdateCallback(ff1.d0 d0Var) {
        this.f83665p = d0Var;
    }

    public void setPlayProgressCallback(boolean z17) {
    }

    public void setScaleType(oe1.m1 m1Var) {
        ff1.f0 f0Var = this.N;
        com.tencent.mars.xlog.Log.i("MicroMsg.ViewSizeCache", "set scale type old[%s] new[%s]", f0Var.f261607b, m1Var);
        f0Var.f261607b = m1Var;
        f0Var.f261609d = 0;
        f0Var.f261608c = 0;
        f0Var.f261611f = 0;
        f0Var.f261610e = 0;
        f0Var.f261613h = 0;
        f0Var.f261612g = 0;
        requestLayout();
    }

    public void setThumb(android.graphics.Bitmap bitmap) {
    }

    @Override // ff1.e0
    public void setVideoCallback(ff1.z zVar) {
        this.f83664o = zVar;
    }

    public void setVideoContext(oe1.s1 s1Var) {
        this.f83673x = s1Var;
    }

    @Override // ff1.e0
    public void setVideoPath(java.lang.String str) {
        this.f83656d = str;
        this.f83663n = false;
        h();
        requestLayout();
    }

    public AbstractVideoTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f83658f = null;
        this.f83659g = null;
        this.f83669t = 0L;
        this.f83670u = 0L;
        this.f83671v = 0;
        this.f83672w = false;
        this.f83673x = null;
        this.f83674y = new ff1.j(this);
        this.f83675z = new ff1.k(this);
        this.A = new ff1.l(this);
        this.B = new ff1.m(this);
        this.C = new ff1.n(this);
        this.D = new ff1.a(this);
        this.E = new ff1.b(this);
        this.F = new ff1.c(this);
        this.G = 0L;
        this.H = false;
        this.I = false;
        this.f83655J = false;
        ff1.d dVar = new ff1.d(this);
        this.K = dVar;
        this.L = false;
        this.M = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        this.N = new ff1.f0();
        this.P = -1.0f;
        this.f83661i = 0;
        this.f83662m = 0;
        setSurfaceTextureListener(dVar);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView */
/* loaded from: classes15.dex */
public abstract class AbstractC12277x3bbbdb47 extends android.view.TextureView implements ff1.e0 {
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
    public boolean f165188J;
    public final android.view.TextureView.SurfaceTextureListener K;
    public boolean L;
    public long M;
    public final ff1.f0 N;
    public float P;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f165189d;

    /* renamed from: e, reason: collision with root package name */
    public int f165190e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.Surface f165191f;

    /* renamed from: g, reason: collision with root package name */
    public ye1.e f165192g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f165193h;

    /* renamed from: i, reason: collision with root package name */
    public int f165194i;

    /* renamed from: m, reason: collision with root package name */
    public int f165195m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f165196n;

    /* renamed from: o, reason: collision with root package name */
    public ff1.z f165197o;

    /* renamed from: p, reason: collision with root package name */
    public ff1.d0 f165198p;

    /* renamed from: q, reason: collision with root package name */
    public ff1.b0 f165199q;

    /* renamed from: r, reason: collision with root package name */
    public ff1.a0 f165200r;

    /* renamed from: s, reason: collision with root package name */
    public ff1.c0 f165201s;

    /* renamed from: t, reason: collision with root package name */
    public long f165202t;

    /* renamed from: u, reason: collision with root package name */
    public long f165203u;

    /* renamed from: v, reason: collision with root package name */
    public int f165204v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f165205w;

    /* renamed from: x, reason: collision with root package name */
    public oe1.s1 f165206x;

    /* renamed from: y, reason: collision with root package name */
    public final ye1.q f165207y;

    /* renamed from: z, reason: collision with root package name */
    public final ye1.p f165208z;

    public AbstractC12277x3bbbdb47(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        ye1.e eVar = this.f165192g;
        boolean mo1856xc00617a4 = (eVar == null || !this.f165193h || this.I || this.f165188J) ? false : eVar.mo1856xc00617a4();
        d("is playing result [%b] pauseWhenUpdated[%b] mIsPrepared[%b]", java.lang.Boolean.valueOf(mo1856xc00617a4), java.lang.Boolean.valueOf(this.I), java.lang.Boolean.valueOf(this.f165193h));
        return mo1856xc00617a4;
    }

    public final void d(java.lang.String str, java.lang.Object... objArr) {
        java.util.Objects.toString(this.f165206x);
    }

    public final void e(java.lang.String str, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.AbstractVideoTextureView", this.f165206x + " " + str, objArr);
    }

    public final void f(java.lang.Throwable th6, java.lang.String str, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Video.AbstractVideoTextureView", th6, this.f165206x + " " + str, objArr);
    }

    public final void g(java.lang.String str, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Video.AbstractVideoTextureView", this.f165206x + " " + str, objArr);
    }

    @Override // ff1.e0
    /* renamed from: getCurrentPosition */
    public int mo51447x9746038c() {
        ye1.e eVar = this.f165192g;
        return (eVar == null || !this.f165193h) ? eVar == null ? -1 : 0 : eVar.mo1851x9746038c();
    }

    /* renamed from: getDownloadPercent */
    public int m51448xd376dc67() {
        return this.f165204v;
    }

    @Override // ff1.e0
    /* renamed from: getDuration */
    public int mo51449x51e8b0a() {
        ye1.e eVar = this.f165192g;
        if (eVar == null || !this.f165193h) {
            this.f165190e = -1;
            return -1;
        }
        int i17 = this.f165190e;
        if (i17 > 0) {
            return i17;
        }
        int mo1852x51e8b0a = eVar.mo1852x51e8b0a();
        this.f165190e = mo1852x51e8b0a;
        return mo1852x51e8b0a;
    }

    /* renamed from: getLastProgresstime */
    public double m51450x9c2553a6() {
        return 0.0d;
    }

    /* renamed from: getLastSurfaceUpdateTime */
    public long m51451x53bc4617() {
        return this.G;
    }

    @Override // ff1.e0
    /* renamed from: getVideoPath */
    public java.lang.String mo51452x4edea88a() {
        return this.f165189d;
    }

    public final void h() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f165189d) || this.f165191f == null) {
            e("MicroMsg.Video.AbstractVideoTextureView", "openVideo, try later, url:%s, surface:%s", this.f165189d, this.f165191f);
            return;
        }
        j();
        e("MicroMsg.Video.AbstractVideoTextureView", "open video %s", this.f165189d);
        try {
            ye1.e b17 = b();
            this.f165192g = b17;
            b17.B(this.A);
            this.f165192g.g(this.f165207y);
            this.f165192g.s(this.f165208z);
            this.f165193h = false;
            this.f165190e = -1;
            this.f165204v = 0;
            this.f165192g.z(this.E);
            this.f165192g.r(this.F);
            this.f165192g.h(this.B);
            this.f165192g.d(this.C);
            this.f165192g.p(this.D);
            ff1.h hVar = new ff1.h(this);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f165189d)) {
                hVar.run();
            } else {
                this.f165192g.mo53286x3dc294a4(this.M);
                this.f165192g.u(this.f165189d, null, new ff1.i(this, hVar));
            }
            e("open video success player[%s]", this.f165192g);
        } catch (java.lang.Exception e17) {
            f(e17, "prepare async error path", new java.lang.Object[0]);
            ff1.z zVar = this.f165197o;
            if (zVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e) zVar).n(-1, -1);
            }
        }
    }

    public void i() {
        ye1.e eVar = this.f165192g;
        if (eVar != null && this.f165193h && eVar.mo1856xc00617a4()) {
            d("pause video.", new java.lang.Object[0]);
            this.f165192g.mo1857x65825f6();
        }
        this.f165196n = false;
    }

    public final void j() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(this.f165193h);
        objArr[1] = java.lang.Boolean.valueOf(this.f165192g == null);
        e("release media player isPrepared[%b] player is null[%b] ", objArr);
        ye1.e eVar = this.f165192g;
        if (eVar != null) {
            eVar.r(null);
            this.f165192g.g(null);
            this.f165192g.s(null);
            try {
                this.f165192g.mo1866x360802();
            } catch (java.lang.Exception e17) {
                f(e17, "stop media player error", new java.lang.Object[0]);
            }
            ((ku5.t0) ku5.t0.f394148d).g(new ff1.f(this, this.f165192g));
            this.f165192g = null;
        }
    }

    public void k(double d17) {
        ye1.e eVar = this.f165192g;
        if (eVar != null) {
            eVar.mo1861xc9fc1b13((int) d17);
            this.f165196n = true;
            d("seek to time: " + d17 + " curr pos : " + this.f165192g.mo1851x9746038c(), new java.lang.Object[0]);
        }
    }

    public boolean l() {
        if (this.f165191f == null) {
            g("it surface not ready, do not start", new java.lang.Object[0]);
            this.H = true;
            this.f165196n = true;
            return false;
        }
        long j17 = this.f165202t;
        if (j17 == 0) {
            j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        }
        this.f165202t = j17;
        e("start %d mIsPrepared %b pauseWhenUpdated %b mediaPlayer %s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(this.f165193h), java.lang.Boolean.valueOf(this.I), this.f165192g);
        ye1.e eVar = this.f165192g;
        if (eVar != null && this.f165193h) {
            if (this.I) {
                this.I = false;
                mo51456x764d819b(this.L);
            }
            this.f165192g.mo1865x68ac462();
            this.f165196n = true;
            return true;
        }
        if (eVar != null || !this.f165193h) {
            this.f165196n = true;
            return false;
        }
        this.f165196n = true;
        h();
        requestLayout();
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f165194i == 0 || this.f165195m == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        int i19 = this.f165194i;
        int i27 = this.f165195m;
        ff1.f0 f0Var = this.N;
        if (f0Var.f343141c != defaultSize || f0Var.f343142d != defaultSize2 || f0Var.f343143e != i19 || f0Var.f343144f != i27) {
            f0Var.f343141c = defaultSize;
            f0Var.f343142d = defaultSize2;
            f0Var.f343143e = i19;
            f0Var.f343144f = i27;
            float f17 = (i19 * 1.0f) / i27;
            float f18 = defaultSize;
            float f19 = defaultSize2;
            float f27 = (1.0f * f18) / f19;
            oe1.m1 m1Var = f0Var.f343140b;
            if (m1Var == oe1.m1.DEFAULT) {
                f0Var.a(f17, f27);
            } else if (m1Var == oe1.m1.CONTAIN) {
                if (defaultSize < defaultSize2) {
                    int i28 = (int) (f18 / f17);
                    f0Var.f343146h = i28;
                    f0Var.f343145g = defaultSize;
                    if (i28 > defaultSize2) {
                        f0Var.f343145g = (int) (f19 * f17);
                        f0Var.f343146h = defaultSize2;
                    }
                } else {
                    int i29 = (int) (f19 * f17);
                    f0Var.f343145g = i29;
                    f0Var.f343146h = defaultSize2;
                    if (i29 > defaultSize) {
                        f0Var.f343146h = (int) (f18 / f17);
                        f0Var.f343145g = defaultSize;
                    }
                }
            } else if (m1Var == oe1.m1.FILL) {
                f0Var.f343146h = defaultSize2;
                f0Var.f343145g = defaultSize;
            } else if (m1Var != oe1.m1.COVER) {
                f0Var.a(f17, f27);
            } else if (defaultSize > defaultSize2) {
                int i37 = (int) (f18 / f17);
                f0Var.f343146h = i37;
                f0Var.f343145g = defaultSize;
                if (i37 < defaultSize2) {
                    f0Var.f343145g = (int) (f19 * f17);
                    f0Var.f343146h = defaultSize2;
                }
            } else {
                int i38 = (int) (f19 * f17);
                f0Var.f343145g = i38;
                f0Var.f343146h = defaultSize2;
                if (i38 < defaultSize) {
                    f0Var.f343146h = (int) (f18 / f17);
                    f0Var.f343145g = defaultSize;
                }
            }
        }
        setMeasuredDimension(f0Var.f343145g, f0Var.f343146h);
    }

    /* renamed from: setForceScaleFullScreen */
    public void m51453x772f3ddc(boolean z17) {
        this.N.f343139a = z17;
    }

    /* renamed from: setLoop */
    public void m51454x764cf626(boolean z17) {
        ye1.e eVar = this.f165192g;
        if (eVar != null) {
            eVar.b(z17);
        }
        this.f165205w = true;
    }

    @Override // ff1.e0
    /* renamed from: setMinBufferDuration */
    public void mo51455x3dc294a4(long j17) {
        e("set minBufferDuration %d", java.lang.Long.valueOf(j17));
        this.M = j17;
        ye1.e eVar = this.f165192g;
        if (eVar != null) {
            eVar.mo53286x3dc294a4(j17);
        }
    }

    @Override // ff1.e0
    /* renamed from: setMute */
    public void mo51456x764d819b(boolean z17) {
        e("set mute %b", java.lang.Boolean.valueOf(z17));
        this.L = z17;
        ye1.e eVar = this.f165192g;
        if (eVar != null) {
            if (z17) {
                eVar.c(0.0f, 0.0f);
            } else {
                eVar.c(1.0f, 1.0f);
            }
        }
    }

    @Override // ff1.e0
    /* renamed from: setOnInfoCallback */
    public void mo51457xe6781b94(ff1.a0 a0Var) {
        this.f165200r = a0Var;
    }

    @Override // ff1.e0
    /* renamed from: setOnSeekCompleteCallback */
    public void mo51458x87223eb7(ff1.b0 b0Var) {
        this.f165199q = b0Var;
    }

    @Override // ff1.e0
    /* renamed from: setOnSurfaceCallback */
    public void mo51459x146557f1(ff1.c0 c0Var) {
        this.f165201s = c0Var;
    }

    @Override // ff1.e0
    /* renamed from: setOneTimeVideoTextureUpdateCallback */
    public void mo51460xfae314df(ff1.d0 d0Var) {
        this.f165198p = d0Var;
    }

    /* renamed from: setPlayProgressCallback */
    public void m51461xc2339c68(boolean z17) {
    }

    /* renamed from: setScaleType */
    public void m51462xebd28962(oe1.m1 m1Var) {
        ff1.f0 f0Var = this.N;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ViewSizeCache", "set scale type old[%s] new[%s]", f0Var.f343140b, m1Var);
        f0Var.f343140b = m1Var;
        f0Var.f343142d = 0;
        f0Var.f343141c = 0;
        f0Var.f343144f = 0;
        f0Var.f343143e = 0;
        f0Var.f343146h = 0;
        f0Var.f343145g = 0;
        requestLayout();
    }

    /* renamed from: setThumb */
    public void m51463x53bf7294(android.graphics.Bitmap bitmap) {
    }

    @Override // ff1.e0
    /* renamed from: setVideoCallback */
    public void mo51464x360a109e(ff1.z zVar) {
        this.f165197o = zVar;
    }

    /* renamed from: setVideoContext */
    public void m51465xc72d5636(oe1.s1 s1Var) {
        this.f165206x = s1Var;
    }

    @Override // ff1.e0
    /* renamed from: setVideoPath */
    public void mo51466xab3268fe(java.lang.String str) {
        this.f165189d = str;
        this.f165196n = false;
        h();
        requestLayout();
    }

    public AbstractC12277x3bbbdb47(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165191f = null;
        this.f165192g = null;
        this.f165202t = 0L;
        this.f165203u = 0L;
        this.f165204v = 0;
        this.f165205w = false;
        this.f165206x = null;
        this.f165207y = new ff1.j(this);
        this.f165208z = new ff1.k(this);
        this.A = new ff1.l(this);
        this.B = new ff1.m(this);
        this.C = new ff1.n(this);
        this.D = new ff1.a(this);
        this.E = new ff1.b(this);
        this.F = new ff1.c(this);
        this.G = 0L;
        this.H = false;
        this.I = false;
        this.f165188J = false;
        ff1.d dVar = new ff1.d(this);
        this.K = dVar;
        this.L = false;
        this.M = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        this.N = new ff1.f0();
        this.P = -1.0f;
        this.f165194i = 0;
        this.f165195m = 0;
        setSurfaceTextureListener(dVar);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}

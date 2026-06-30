package n84;

/* loaded from: classes14.dex */
public abstract class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f417193d;

    /* renamed from: e, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGL10 f417194e;

    /* renamed from: f, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLDisplay f417195f;

    /* renamed from: g, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLContext f417196g;

    /* renamed from: h, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLSurface f417197h;

    /* renamed from: i, reason: collision with root package name */
    public int f417198i;

    /* renamed from: m, reason: collision with root package name */
    public int f417199m;

    /* renamed from: q, reason: collision with root package name */
    public n84.z f417203q;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f417201o = false;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f417202p = new java.lang.Object();

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f417200n = true;

    public a0(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f417193d = surfaceTexture;
        this.f417198i = i17;
        this.f417199m = i18;
    }

    public abstract boolean a();

    public abstract void b();

    public final void c() {
        javax.microedition.khronos.egl.EGLConfig eGLConfig;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.f417194e = egl10;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.f417195f = eglGetDisplay;
        this.f417194e.eglInitialize(eglGetDisplay, new int[2]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("chooseEglConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        int[] iArr = new int[1];
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpenGLConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenGLConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        if (!this.f417194e.eglChooseConfig(this.f417195f, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
            java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("Failed to choose config: " + android.opengl.GLUtils.getEGLErrorString(this.f417194e.eglGetError()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseEglConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            throw illegalArgumentException;
        }
        if (iArr[0] > 0) {
            eGLConfig = eGLConfigArr[0];
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseEglConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseEglConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            eGLConfig = null;
        }
        javax.microedition.khronos.egl.EGL10 egl102 = this.f417194e;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f417195f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        javax.microedition.khronos.egl.EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        this.f417196g = eglCreateContext;
        javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = this.f417194e.eglCreateWindowSurface(this.f417195f, eGLConfig, this.f417193d, null);
        this.f417197h = eglCreateWindowSurface;
        if (eglCreateWindowSurface == null || eglCreateWindowSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("GL Error: " + android.opengl.GLUtils.getEGLErrorString(this.f417194e.eglGetError()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            throw runtimeException;
        }
        if (this.f417194e.eglMakeCurrent(this.f417195f, eglCreateWindowSurface, eglCreateWindowSurface, this.f417196g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            return;
        }
        java.lang.RuntimeException runtimeException2 = new java.lang.RuntimeException("GL Make current error: " + android.opengl.GLUtils.getEGLErrorString(this.f417194e.eglGetError()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        throw runtimeException2;
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        this.f417200n = false;
        this.f417201o = false;
        synchronized (this.f417202p) {
            try {
                this.f417202p.notifyAll();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
    }

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        this.f417201o = false;
        synchronized (this.f417202p) {
            try {
                this.f417202p.notifyAll();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryInitOpenGL", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        try {
            c();
            if (this.f417203q != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOpenGLInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                n84.w.e("AdAlphaPlayerView", "onOpenGLInit");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOpenGLInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryInitOpenGL", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            z17 = false;
        } catch (java.lang.Throwable th6) {
            n84.w.c("TextureSurfaceRenderer", "initGL failed", th6);
            if (this.f417203q != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a261 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261) this.f417203q;
                c17785x8a47a261.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOpenGLInitFailed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                n84.w.b("AdAlphaPlayerView", "onOpenGLInitFailed");
                n84.x.a().b(new n84.s(c17785x8a47a261));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOpenGLInitFailed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryInitOpenGL", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryInitOpenGLComponent", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        try {
            b();
            n84.z zVar = this.f417203q;
            if (zVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261) zVar).c();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryInitOpenGLComponent", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            z18 = false;
        } catch (java.lang.Throwable th7) {
            n84.w.c("TextureSurfaceRenderer", "initGLComponents failed", th7);
            if (this.f417203q != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a2612 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261) this.f417203q;
                c17785x8a47a2612.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOpenGLComponentsInitFailed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                n84.w.b("AdAlphaPlayerView", "onOpenGLComponentsInitFailed");
                n84.x.a().b(new n84.d(c17785x8a47a2612));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOpenGLComponentsInitFailed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryInitOpenGLComponent", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            z18 = true;
        }
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            return;
        }
        n84.w.a("TextureSurfaceRenderer", "OpenGL init OK.");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loopDraw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        synchronized (this.f417202p) {
            while (this.f417200n) {
                try {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (a()) {
                        this.f417194e.eglSwapBuffers(this.f417195f, this.f417197h);
                    }
                    long currentTimeMillis2 = 32 - (java.lang.System.currentTimeMillis() - currentTimeMillis);
                    if (currentTimeMillis2 > 0) {
                        try {
                            if (this.f417201o) {
                                this.f417202p.wait(300L);
                            } else {
                                this.f417202p.wait(currentTimeMillis2);
                            }
                        } catch (java.lang.InterruptedException e17) {
                            n84.w.d("TextureSurfaceRenderer", e17);
                        }
                    }
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loopDraw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                    throw th8;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loopDraw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        n84.v vVar = (n84.v) this;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseGLComponents", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        android.opengl.GLES20.glDeleteTextures(1, vVar.f417226t, 0);
        android.opengl.GLES20.glDeleteProgram(vVar.f417227u);
        vVar.f417230x.release();
        vVar.f417230x.setOnFrameAvailableListener(null);
        n84.w.a("AlphaTextureRenderer", "releaseGLComponents");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseGLComponents", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        n84.z zVar2 = this.f417203q;
        if (zVar2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261) zVar2).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOpenGLComponentsRelease", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            n84.w.e("AdAlphaPlayerView", "onOpenGLComponentsRelease");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOpenGLComponentsRelease", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        javax.microedition.khronos.egl.EGL10 egl10 = this.f417194e;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f417195f;
        javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        this.f417194e.eglDestroySurface(this.f417195f, this.f417197h);
        this.f417194e.eglDestroyContext(this.f417195f, this.f417196g);
        this.f417194e.eglTerminate(this.f417195f);
        n84.w.a("TextureSurfaceRenderer", "OpenGL deinit OK.");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        n84.z zVar3 = this.f417203q;
        if (zVar3 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261) zVar3).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOpenGLRelease", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            n84.w.e("AdAlphaPlayerView", "onOpenGLRelease");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOpenGLRelease", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
        n84.w.a("TextureSurfaceRenderer", "OpenGL loop end.");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
    }
}

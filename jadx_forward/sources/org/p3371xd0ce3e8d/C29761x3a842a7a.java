package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.EglBase10Impl */
/* loaded from: classes14.dex */
class C29761x3a842a7a implements org.p3371xd0ce3e8d.InterfaceC29760x8958813a {

    /* renamed from: EGL_CONTEXT_CLIENT_VERSION */
    private static final int f75316xdba4c4e9 = 12440;
    private static final java.lang.String TAG = "EglBase10Impl";
    private final javax.microedition.khronos.egl.EGL10 egl;

    /* renamed from: eglConfig */
    private javax.microedition.khronos.egl.EGLConfig f75317x145e47ec;

    /* renamed from: eglContext */
    private javax.microedition.khronos.egl.EGLContext f75318x77710645;

    /* renamed from: eglDisplay */
    private javax.microedition.khronos.egl.EGLDisplay f75319xa25ee958;

    /* renamed from: eglSurface */
    private javax.microedition.khronos.egl.EGLSurface f75320xd043bd43 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;

    /* renamed from: org.webrtc.EglBase10Impl$Context */
    /* loaded from: classes13.dex */
    public static class Context implements org.p3371xd0ce3e8d.InterfaceC29760x8958813a.Context {
        private final javax.microedition.khronos.egl.EGL10 egl;

        /* renamed from: eglContext */
        private final javax.microedition.khronos.egl.EGLContext f75323x77710645;

        /* renamed from: eglContextConfig */
        private final javax.microedition.khronos.egl.EGLConfig f75324x7ec6ede7;

        public Context(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLContext eGLContext, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
            this.egl = egl10;
            this.f75323x77710645 = eGLContext;
            this.f75324x7ec6ede7 = eGLConfig;
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context
        /* renamed from: getNativeEglContext */
        public long mo155427x545a932() {
            javax.microedition.khronos.egl.EGLContext eglGetCurrentContext = this.egl.eglGetCurrentContext();
            javax.microedition.khronos.egl.EGLDisplay eglGetCurrentDisplay = this.egl.eglGetCurrentDisplay();
            javax.microedition.khronos.egl.EGLSurface eglGetCurrentSurface = this.egl.eglGetCurrentSurface(12377);
            javax.microedition.khronos.egl.EGLSurface eglGetCurrentSurface2 = this.egl.eglGetCurrentSurface(12378);
            if (eglGetCurrentDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
                eglGetCurrentDisplay = this.egl.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
            }
            javax.microedition.khronos.egl.EGLSurface eGLSurface = null;
            try {
                if (eglGetCurrentContext != this.f75323x77710645) {
                    eGLSurface = this.egl.eglCreatePbufferSurface(eglGetCurrentDisplay, this.f75324x7ec6ede7, new int[]{12375, 1, 12374, 1, 12344});
                    if (!this.egl.eglMakeCurrent(eglGetCurrentDisplay, eGLSurface, eGLSurface, this.f75323x77710645)) {
                        throw new java.lang.RuntimeException("Failed to make temporary EGL surface active: " + this.egl.eglGetError());
                    }
                }
                return org.p3371xd0ce3e8d.C29761x3a842a7a.m155440xbbd77af0();
            } finally {
                if (0 != 0) {
                    this.egl.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface, eglGetCurrentSurface2, eglGetCurrentContext);
                    this.egl.eglDestroySurface(eglGetCurrentDisplay, null);
                }
            }
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29760x8958813a.Context
        /* renamed from: getRawContext */
        public javax.microedition.khronos.egl.EGLContext mo155439xca7ed05d() {
            return this.f75323x77710645;
        }
    }

    public C29761x3a842a7a(javax.microedition.khronos.egl.EGLContext eGLContext, int[] iArr) {
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.egl = egl10;
        javax.microedition.khronos.egl.EGLDisplay m155445x909fa14e = m155445x909fa14e();
        this.f75319xa25ee958 = m155445x909fa14e;
        this.f75317x145e47ec = m155444x13cbb936(egl10, m155445x909fa14e, iArr);
        int m155438xb07a7f91 = org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.EglBaseStatic.m155438xb07a7f91(iArr);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Using OpenGL ES version " + m155438xb07a7f91);
        this.f75318x77710645 = m155442xe4407861(eGLContext, this.f75319xa25ee958, this.f75317x145e47ec, m155438xb07a7f91);
    }

    /* renamed from: access$000 */
    public static /* synthetic */ long m155440xbbd77af0() {
        return m155446x9ff68a96();
    }

    /* renamed from: checkIsNotReleased */
    private void m155441xc337b97e() {
        if (this.f75319xa25ee958 == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY || this.f75318x77710645 == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT || this.f75317x145e47ec == null) {
            throw new java.lang.RuntimeException("This object has been released");
        }
    }

    /* renamed from: createEglContext */
    private javax.microedition.khronos.egl.EGLContext m155442xe4407861(javax.microedition.khronos.egl.EGLContext eGLContext, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17) {
        javax.microedition.khronos.egl.EGLContext eglCreateContext;
        if (eGLContext != null && eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            throw new java.lang.RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {f75316xdba4c4e9, i17, 12344};
        if (eGLContext == null) {
            eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        }
        synchronized (org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75310x32c52b) {
            eglCreateContext = this.egl.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
        if (eglCreateContext != javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw new java.lang.RuntimeException("Failed to create EGL context: 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
    }

    /* renamed from: createSurfaceInternal */
    private void m155443x5bc699ee(java.lang.Object obj) {
        if (!(obj instanceof android.view.SurfaceHolder) && !(obj instanceof android.graphics.SurfaceTexture)) {
            throw new java.lang.IllegalStateException("Input must be either a SurfaceHolder or SurfaceTexture");
        }
        m155441xc337b97e();
        if (this.f75320xd043bd43 != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            throw new java.lang.RuntimeException("Already has an EGLSurface");
        }
        javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.f75319xa25ee958, this.f75317x145e47ec, obj, new int[]{12344});
        this.f75320xd043bd43 = eglCreateWindowSurface;
        if (eglCreateWindowSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            return;
        }
        throw new java.lang.RuntimeException("Failed to create window surface: 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
    }

    /* renamed from: getEglConfig */
    private static javax.microedition.khronos.egl.EGLConfig m155444x13cbb936(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, int[] iArr) {
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            throw new java.lang.RuntimeException("eglChooseConfig failed: 0x" + java.lang.Integer.toHexString(egl10.eglGetError()));
        }
        if (iArr2[0] <= 0) {
            throw new java.lang.RuntimeException("Unable to find any matching EGL config");
        }
        javax.microedition.khronos.egl.EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new java.lang.RuntimeException("eglChooseConfig returned null");
    }

    /* renamed from: getEglDisplay */
    private javax.microedition.khronos.egl.EGLDisplay m155445x909fa14e() {
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = this.egl.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("Unable to get EGL10 display: 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
        }
        if (this.egl.eglInitialize(eglGetDisplay, new int[2])) {
            return eglGetDisplay;
        }
        throw new java.lang.RuntimeException("Unable to initialize EGL10: 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
    }

    /* renamed from: nativeGetCurrentNativeEGLContext */
    private static native long m155446x9ff68a96();

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: createDummyPbufferSurface */
    public void mo155408xc7ea9609() {
        mo155409xb71ce1f9(1, 1);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: createPbufferSurface */
    public void mo155409xb71ce1f9(int i17, int i18) {
        m155441xc337b97e();
        if (this.f75320xd043bd43 != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            throw new java.lang.RuntimeException("Already has an EGLSurface");
        }
        javax.microedition.khronos.egl.EGLSurface eglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(this.f75319xa25ee958, this.f75317x145e47ec, new int[]{12375, i17, 12374, i18, 12344});
        this.f75320xd043bd43 = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            return;
        }
        throw new java.lang.RuntimeException("Failed to create pixel buffer surface with size " + i17 + "x" + i18 + ": 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: createSurface */
    public void mo155411x17711011(android.view.Surface surface) {
        m155443x5bc699ee(new android.view.SurfaceHolder(surface) { // from class: org.webrtc.EglBase10Impl.1FakeSurfaceHolder

            /* renamed from: surface */
            private final android.view.Surface f75321x9189ecad;

            {
                this.f75321x9189ecad = surface;
            }

            @Override // android.view.SurfaceHolder
            public void addCallback(android.view.SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public android.view.Surface getSurface() {
                return this.f75321x9189ecad;
            }

            @Override // android.view.SurfaceHolder
            public android.graphics.Rect getSurfaceFrame() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public boolean isCreating() {
                return false;
            }

            @Override // android.view.SurfaceHolder
            public android.graphics.Canvas lockCanvas() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public void removeCallback(android.view.SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public void setFixedSize(int i17, int i18) {
            }

            @Override // android.view.SurfaceHolder
            public void setFormat(int i17) {
            }

            @Override // android.view.SurfaceHolder
            public void setKeepScreenOn(boolean z17) {
            }

            @Override // android.view.SurfaceHolder
            public void setSizeFromLayout() {
            }

            @Override // android.view.SurfaceHolder
            @java.lang.Deprecated
            public void setType(int i17) {
            }

            @Override // android.view.SurfaceHolder
            public void unlockCanvasAndPost(android.graphics.Canvas canvas) {
            }

            @Override // android.view.SurfaceHolder
            public android.graphics.Canvas lockCanvas(android.graphics.Rect rect) {
                return null;
            }
        });
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: detachCurrent */
    public void mo155412x6c0f2266() {
        synchronized (org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75310x32c52b) {
            javax.microedition.khronos.egl.EGL10 egl10 = this.egl;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f75319xa25ee958;
            javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT)) {
                throw new java.lang.RuntimeException("eglDetachCurrent failed: 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
            }
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: getEglBaseContext */
    public org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context mo155413x66100c2a() {
        return new org.p3371xd0ce3e8d.C29761x3a842a7a.Context(this.egl, this.f75318x77710645, this.f75317x145e47ec);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: hasSurface */
    public boolean mo155414xaadb0b3() {
        return this.f75320xd043bd43 != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: makeCurrent */
    public void mo155415x900967ab() {
        m155441xc337b97e();
        if (this.f75320xd043bd43 == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            throw new java.lang.RuntimeException("No EGLSurface - can't make current");
        }
        synchronized (org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75310x32c52b) {
            javax.microedition.khronos.egl.EGL10 egl10 = this.egl;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f75319xa25ee958;
            javax.microedition.khronos.egl.EGLSurface eGLSurface = this.f75320xd043bd43;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f75318x77710645)) {
                throw new java.lang.RuntimeException("eglMakeCurrent failed: 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
            }
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: release */
    public void mo155416x41012807() {
        m155441xc337b97e();
        mo155417xc6cc96a6();
        mo155412x6c0f2266();
        this.egl.eglDestroyContext(this.f75319xa25ee958, this.f75318x77710645);
        this.egl.eglTerminate(this.f75319xa25ee958);
        this.f75318x77710645 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        this.f75319xa25ee958 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        this.f75317x145e47ec = null;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: releaseSurface */
    public void mo155417xc6cc96a6() {
        javax.microedition.khronos.egl.EGLSurface eGLSurface = this.f75320xd043bd43;
        if (eGLSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            this.egl.eglDestroySurface(this.f75319xa25ee958, eGLSurface);
            this.f75320xd043bd43 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: surfaceHeight */
    public int mo155418x59c7434() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.f75319xa25ee958, this.f75320xd043bd43, 12374, iArr);
        return iArr[0];
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: surfaceWidth */
    public int mo155419xdffb3519() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.f75319xa25ee958, this.f75320xd043bd43, 12375, iArr);
        return iArr[0];
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: swapBuffers */
    public void mo155420x82211f20() {
        m155441xc337b97e();
        if (this.f75320xd043bd43 != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            synchronized (org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75310x32c52b) {
                this.egl.eglSwapBuffers(this.f75319xa25ee958, this.f75320xd043bd43);
            }
            return;
        }
        throw new java.lang.RuntimeException("No EGLSurface - can't swap buffers");
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: createSurface */
    public void mo155410x17711011(android.graphics.SurfaceTexture surfaceTexture) {
        m155443x5bc699ee(surfaceTexture);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: swapBuffers */
    public void mo155421x82211f20(long j17) {
        mo155420x82211f20();
    }
}

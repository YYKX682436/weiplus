package org.p3371xd0ce3e8d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.webrtc.EglBase14Impl */
/* loaded from: classes14.dex */
public class C29763x3abc887e implements org.p3371xd0ce3e8d.InterfaceC29762x8958813e {

    /* renamed from: CURRENT_SDK_VERSION */
    private static final int f75325xbcd03fad = android.os.Build.VERSION.SDK_INT;

    /* renamed from: EGLExt_SDK_VERSION */
    private static final int f75326xbe26af2b = 18;
    private static final java.lang.String TAG = "EglBase14Impl";

    /* renamed from: eglConfig */
    private android.opengl.EGLConfig f75327x145e47ec;

    /* renamed from: eglContext */
    private android.opengl.EGLContext f75328x77710645;

    /* renamed from: eglDisplay */
    private android.opengl.EGLDisplay f75329xa25ee958;

    /* renamed from: eglSurface */
    private android.opengl.EGLSurface f75330xd043bd43 = android.opengl.EGL14.EGL_NO_SURFACE;

    /* renamed from: org.webrtc.EglBase14Impl$Context */
    /* loaded from: classes14.dex */
    public static class Context implements org.p3371xd0ce3e8d.InterfaceC29762x8958813e.Context {

        /* renamed from: egl14Context */
        private final android.opengl.EGLContext f75331x16dc0d42;

        public Context(android.opengl.EGLContext eGLContext) {
            this.f75331x16dc0d42 = eGLContext;
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context
        /* renamed from: getNativeEglContext */
        public long mo155427x545a932() {
            return org.p3371xd0ce3e8d.C29763x3abc887e.f75325xbcd03fad >= 21 ? this.f75331x16dc0d42.getNativeHandle() : this.f75331x16dc0d42.getHandle();
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29762x8958813e.Context
        /* renamed from: getRawContext */
        public android.opengl.EGLContext mo155447xca7ed05d() {
            return this.f75331x16dc0d42;
        }
    }

    public C29763x3abc887e(android.opengl.EGLContext eGLContext, int[] iArr) {
        android.opengl.EGLDisplay m155454x909fa14e = m155454x909fa14e();
        this.f75329xa25ee958 = m155454x909fa14e;
        this.f75327x145e47ec = m155453x13cbb936(m155454x909fa14e, iArr);
        int m155438xb07a7f91 = org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.EglBaseStatic.m155438xb07a7f91(iArr);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Using OpenGL ES version " + m155438xb07a7f91);
        this.f75328x77710645 = m155451xe4407861(eGLContext, this.f75329xa25ee958, this.f75327x145e47ec, m155438xb07a7f91);
    }

    /* renamed from: checkIsNotReleased */
    private void m155450xc337b97e() {
        if (this.f75329xa25ee958 == android.opengl.EGL14.EGL_NO_DISPLAY || this.f75328x77710645 == android.opengl.EGL14.EGL_NO_CONTEXT || this.f75327x145e47ec == null) {
            throw new java.lang.RuntimeException("This object has been released");
        }
    }

    /* renamed from: createEglContext */
    private static android.opengl.EGLContext m155451xe4407861(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, int i17) {
        android.opengl.EGLContext eglCreateContext;
        if (eGLContext != null && eGLContext == android.opengl.EGL14.EGL_NO_CONTEXT) {
            throw new java.lang.RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {12440, i17, 12344};
        if (eGLContext == null) {
            eGLContext = android.opengl.EGL14.EGL_NO_CONTEXT;
        }
        synchronized (org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75310x32c52b) {
            eglCreateContext = android.opengl.EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eglCreateContext != android.opengl.EGL14.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw new java.lang.RuntimeException("Failed to create EGL context: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
    }

    /* renamed from: createSurfaceInternal */
    private void m155452x5bc699ee(java.lang.Object obj) {
        if (!(obj instanceof android.view.Surface) && !(obj instanceof android.graphics.SurfaceTexture)) {
            throw new java.lang.IllegalStateException("Input must be either a Surface or SurfaceTexture");
        }
        m155450xc337b97e();
        if (this.f75330xd043bd43 != android.opengl.EGL14.EGL_NO_SURFACE) {
            throw new java.lang.RuntimeException("Already has an EGLSurface");
        }
        android.opengl.EGLSurface eglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(this.f75329xa25ee958, this.f75327x145e47ec, obj, new int[]{12344}, 0);
        this.f75330xd043bd43 = eglCreateWindowSurface;
        if (eglCreateWindowSurface != android.opengl.EGL14.EGL_NO_SURFACE) {
            return;
        }
        throw new java.lang.RuntimeException("Failed to create window surface: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
    }

    /* renamed from: getEglConfig */
    private static android.opengl.EGLConfig m155453x13cbb936(android.opengl.EGLDisplay eGLDisplay, int[] iArr) {
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!android.opengl.EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            throw new java.lang.RuntimeException("eglChooseConfig failed: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
        }
        if (iArr2[0] <= 0) {
            throw new java.lang.RuntimeException("Unable to find any matching EGL config");
        }
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new java.lang.RuntimeException("eglChooseConfig returned null");
    }

    /* renamed from: getEglDisplay */
    private static android.opengl.EGLDisplay m155454x909fa14e() {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("Unable to get EGL14 display: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
        }
        int[] iArr = new int[2];
        if (android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        throw new java.lang.RuntimeException("Unable to initialize EGL14: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
    }

    /* renamed from: isEGL14Supported */
    public static boolean m155455xc7351f4b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SDK version: ");
        int i17 = f75325xbcd03fad;
        sb6.append(i17);
        sb6.append(". isEGL14Supported: ");
        sb6.append(i17 >= 18);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, sb6.toString());
        return i17 >= 18;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: createDummyPbufferSurface */
    public void mo155408xc7ea9609() {
        mo155409xb71ce1f9(1, 1);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: createPbufferSurface */
    public void mo155409xb71ce1f9(int i17, int i18) {
        m155450xc337b97e();
        if (this.f75330xd043bd43 != android.opengl.EGL14.EGL_NO_SURFACE) {
            throw new java.lang.RuntimeException("Already has an EGLSurface");
        }
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(this.f75329xa25ee958, this.f75327x145e47ec, new int[]{12375, i17, 12374, i18, 12344}, 0);
        this.f75330xd043bd43 = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface != android.opengl.EGL14.EGL_NO_SURFACE) {
            return;
        }
        throw new java.lang.RuntimeException("Failed to create pixel buffer surface with size " + i17 + "x" + i18 + ": 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: createSurface */
    public void mo155411x17711011(android.view.Surface surface) {
        m155452x5bc699ee(surface);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: detachCurrent */
    public void mo155412x6c0f2266() {
        synchronized (org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75310x32c52b) {
            android.opengl.EGLDisplay eGLDisplay = this.f75329xa25ee958;
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT)) {
                throw new java.lang.RuntimeException("eglDetachCurrent failed: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
            }
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: hasSurface */
    public boolean mo155414xaadb0b3() {
        return this.f75330xd043bd43 != android.opengl.EGL14.EGL_NO_SURFACE;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: makeCurrent */
    public void mo155415x900967ab() {
        m155450xc337b97e();
        if (this.f75330xd043bd43 == android.opengl.EGL14.EGL_NO_SURFACE) {
            throw new java.lang.RuntimeException("No EGLSurface - can't make current");
        }
        synchronized (org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75310x32c52b) {
            android.opengl.EGLDisplay eGLDisplay = this.f75329xa25ee958;
            android.opengl.EGLSurface eGLSurface = this.f75330xd043bd43;
            if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f75328x77710645)) {
                throw new java.lang.RuntimeException("eglMakeCurrent failed: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
            }
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: release */
    public void mo155416x41012807() {
        m155450xc337b97e();
        mo155417xc6cc96a6();
        mo155412x6c0f2266();
        synchronized (org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75310x32c52b) {
            android.opengl.EGL14.eglDestroyContext(this.f75329xa25ee958, this.f75328x77710645);
        }
        android.opengl.EGL14.eglReleaseThread();
        android.opengl.EGL14.eglTerminate(this.f75329xa25ee958);
        this.f75328x77710645 = android.opengl.EGL14.EGL_NO_CONTEXT;
        this.f75329xa25ee958 = android.opengl.EGL14.EGL_NO_DISPLAY;
        this.f75327x145e47ec = null;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: releaseSurface */
    public void mo155417xc6cc96a6() {
        android.opengl.EGLSurface eGLSurface = this.f75330xd043bd43;
        if (eGLSurface != android.opengl.EGL14.EGL_NO_SURFACE) {
            android.opengl.EGL14.eglDestroySurface(this.f75329xa25ee958, eGLSurface);
            this.f75330xd043bd43 = android.opengl.EGL14.EGL_NO_SURFACE;
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: surfaceHeight */
    public int mo155418x59c7434() {
        int[] iArr = new int[1];
        android.opengl.EGL14.eglQuerySurface(this.f75329xa25ee958, this.f75330xd043bd43, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: surfaceWidth */
    public int mo155419xdffb3519() {
        int[] iArr = new int[1];
        android.opengl.EGL14.eglQuerySurface(this.f75329xa25ee958, this.f75330xd043bd43, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: swapBuffers */
    public void mo155420x82211f20() {
        m155450xc337b97e();
        if (this.f75330xd043bd43 != android.opengl.EGL14.EGL_NO_SURFACE) {
            synchronized (org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75310x32c52b) {
                android.opengl.EGL14.eglSwapBuffers(this.f75329xa25ee958, this.f75330xd043bd43);
            }
            return;
        }
        throw new java.lang.RuntimeException("No EGLSurface - can't swap buffers");
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: createSurface */
    public void mo155410x17711011(android.graphics.SurfaceTexture surfaceTexture) {
        m155452x5bc699ee(surfaceTexture);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: getEglBaseContext */
    public org.p3371xd0ce3e8d.C29763x3abc887e.Context mo155413x66100c2a() {
        return new org.p3371xd0ce3e8d.C29763x3abc887e.Context(this.f75328x77710645);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29759xf7e285db
    /* renamed from: swapBuffers */
    public void mo155421x82211f20(long j17) {
        m155450xc337b97e();
        if (this.f75330xd043bd43 != android.opengl.EGL14.EGL_NO_SURFACE) {
            synchronized (org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75310x32c52b) {
                android.opengl.EGLExt.eglPresentationTimeANDROID(this.f75329xa25ee958, this.f75330xd043bd43, j17);
                android.opengl.EGL14.eglSwapBuffers(this.f75329xa25ee958, this.f75330xd043bd43);
            }
            return;
        }
        throw new java.lang.RuntimeException("No EGLSurface - can't swap buffers");
    }
}

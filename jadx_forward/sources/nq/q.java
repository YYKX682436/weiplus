package nq;

/* loaded from: classes13.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public long f420424a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f420425b;

    /* renamed from: c, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGL10 f420426c;

    /* renamed from: d, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLDisplay f420427d;

    /* renamed from: e, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLSurface f420428e;

    /* renamed from: f, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLConfig f420429f;

    /* renamed from: g, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLContext f420430g;

    /* renamed from: h, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLSurface f420431h;

    public q(java.lang.ref.WeakReference weakReference) {
        this.f420425b = weakReference;
    }

    public static java.lang.String d(java.lang.String str, int i17) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" failed: ");
        switch (i17) {
            case 12288:
                str2 = "EGL_SUCCESS";
                break;
            case 12289:
                str2 = "EGL_NOT_INITIALIZED";
                break;
            case 12290:
                str2 = "EGL_BAD_ACCESS";
                break;
            case 12291:
                str2 = "EGL_BAD_ALLOC";
                break;
            case 12292:
                str2 = "EGL_BAD_ATTRIBUTE";
                break;
            case 12293:
                str2 = "EGL_BAD_CONFIG";
                break;
            case 12294:
                str2 = "EGL_BAD_CONTEXT";
                break;
            case 12295:
                str2 = "EGL_BAD_CURRENT_SURFACE";
                break;
            case 12296:
                str2 = "EGL_BAD_DISPLAY";
                break;
            case 12297:
                str2 = "EGL_BAD_MATCH";
                break;
            case 12298:
                str2 = "EGL_BAD_NATIVE_PIXMAP";
                break;
            case 12299:
                str2 = "EGL_BAD_NATIVE_WINDOW";
                break;
            case 12300:
                str2 = "EGL_BAD_PARAMETER";
                break;
            case 12301:
                str2 = "EGL_BAD_SURFACE";
                break;
            case 12302:
                str2 = "EGL_CONTEXT_LOST";
                break;
            default:
                str2 = "0x" + java.lang.Integer.toHexString(i17);
                break;
        }
        sb6.append(str2);
        return sb6.toString();
    }

    public static void f(java.lang.String str, int i17) {
        java.lang.String d17 = d(str, i17);
        mq.h.a("MicroMsg.GLThread", "throwEglException tid=" + java.lang.Thread.currentThread().getId() + " " + d17, new java.lang.Object[0]);
        throw new java.lang.RuntimeException(d17);
    }

    public boolean a() {
        javax.microedition.khronos.egl.EGLSurface eGLSurface;
        mq.h.d("MicroMsg.GLThread", "createSurface()  tid=" + java.lang.Thread.currentThread().getId(), new java.lang.Object[0]);
        if (this.f420426c == null) {
            throw new java.lang.RuntimeException("egl not initialized");
        }
        if (this.f420427d == null) {
            throw new java.lang.RuntimeException("eglDisplay not initialized");
        }
        if (this.f420429f == null) {
            throw new java.lang.RuntimeException("mEglConfig not initialized");
        }
        b();
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb = (com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb) this.f420425b.get();
        if (surfaceHolderCallback2C10435xb52e77fb != null) {
            nq.p pVar = surfaceHolderCallback2C10435xb52e77fb.f146420n;
            javax.microedition.khronos.egl.EGL10 egl10 = this.f420426c;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f420427d;
            javax.microedition.khronos.egl.EGLConfig eGLConfig = this.f420429f;
            android.view.SurfaceHolder holder = surfaceHolderCallback2C10435xb52e77fb.getHolder();
            ((nq.m) pVar).getClass();
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, holder, null);
            } catch (java.lang.IllegalArgumentException e17) {
                mq.h.a("MicroMsg.GameGLSurfaceView", "eglCreateWindowSurface", e17);
                eGLSurface = null;
            }
            this.f420428e = eGLSurface;
        } else {
            this.f420428e = null;
        }
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f420428e;
        if (eGLSurface2 == null || eGLSurface2 == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            if (this.f420426c.eglGetError() == 12299) {
                mq.h.a("MicroMsg.GLThread", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.", new java.lang.Object[0]);
            }
            return false;
        }
        if (!this.f420426c.eglMakeCurrent(this.f420427d, eGLSurface2, eGLSurface2, this.f420430g)) {
            mq.h.d("EGLHelper", d("eglMakeCurrent", this.f420426c.eglGetError()), new java.lang.Object[0]);
            return false;
        }
        javax.microedition.khronos.egl.EGLSurface eGLSurface3 = this.f420431h;
        if (eGLSurface3 == null) {
            return true;
        }
        this.f420426c.eglDestroySurface(this.f420427d, eGLSurface3);
        this.f420431h = null;
        return true;
    }

    public final void b() {
        javax.microedition.khronos.egl.EGLSurface eGLSurface;
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f420428e;
        if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE)) {
            return;
        }
        this.f420426c.eglMakeCurrent(this.f420427d, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb = (com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb) this.f420425b.get();
        if (surfaceHolderCallback2C10435xb52e77fb != null) {
            nq.p pVar = surfaceHolderCallback2C10435xb52e77fb.f146420n;
            javax.microedition.khronos.egl.EGL10 egl10 = this.f420426c;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f420427d;
            javax.microedition.khronos.egl.EGLSurface eGLSurface3 = this.f420428e;
            ((nq.m) pVar).getClass();
            egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
        }
        this.f420428e = null;
    }

    public void c() {
        mq.h.d("MicroMsg.GLThread", "finish() tid=" + java.lang.Thread.currentThread().getId(), new java.lang.Object[0]);
        if (this.f420430g != null) {
            com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb = (com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb) this.f420425b.get();
            if (surfaceHolderCallback2C10435xb52e77fb != null) {
                nq.o oVar = surfaceHolderCallback2C10435xb52e77fb.f146419m;
                javax.microedition.khronos.egl.EGL10 egl10 = this.f420426c;
                javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f420427d;
                javax.microedition.khronos.egl.EGLContext eGLContext = this.f420430g;
                ((nq.l) oVar).getClass();
                mq.h.b("MicroMsg.GLThread", " destroyContext tid=" + java.lang.Thread.currentThread().getId(), new java.lang.Object[0]);
                if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    mq.h.a("MicroMsg.GLThread", "display:" + eGLDisplay + " context: " + eGLContext, new java.lang.Object[0]);
                    f("eglDestroyContex", egl10.eglGetError());
                    throw null;
                }
            }
            this.f420430g = null;
        }
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay2 = this.f420427d;
        if (eGLDisplay2 != null) {
            this.f420426c.eglTerminate(eGLDisplay2);
            this.f420427d = null;
        }
    }

    public void e() {
        javax.microedition.khronos.egl.EGLConfig eGLConfig;
        int i17;
        mq.h.d("MicroMsg.GLThread", "start() tid=" + java.lang.Thread.currentThread().getId(), new java.lang.Object[0]);
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.f420426c = egl10;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.f420427d = eglGetDisplay;
        if (eglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("eglGetDisplay failed");
        }
        if (!this.f420426c.eglInitialize(eglGetDisplay, new int[2])) {
            throw new java.lang.RuntimeException("eglInitialize failed");
        }
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb = (com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb) this.f420425b.get();
        if (surfaceHolderCallback2C10435xb52e77fb == null) {
            this.f420429f = null;
            this.f420430g = null;
            mq.h.d("MicroMsg.GameGLSurfaceView", "alvinluo EglHelper start but view is null and set mEglConfig = null, mEglContext = null", new java.lang.Object[0]);
        } else {
            nq.n nVar = surfaceHolderCallback2C10435xb52e77fb.f146418i;
            javax.microedition.khronos.egl.EGL10 egl102 = this.f420426c;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f420427d;
            nq.j jVar = (nq.j) nVar;
            int[] iArr = new int[1];
            if (!egl102.eglChooseConfig(eGLDisplay, jVar.f420415a, null, 0, iArr)) {
                throw new java.lang.IllegalArgumentException("eglChooseConfig failed");
            }
            int i18 = iArr[0];
            if (i18 <= 0) {
                throw new java.lang.IllegalArgumentException("No configs match configSpec");
            }
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i18];
            int i19 = i18;
            if (!egl102.eglChooseConfig(eGLDisplay, jVar.f420415a, eGLConfigArr, i18, iArr)) {
                throw new java.lang.IllegalArgumentException("eglChooseConfig#2 failed");
            }
            nq.k kVar = (nq.k) jVar;
            int i27 = 0;
            while (true) {
                if (i27 >= i19) {
                    eGLConfig = null;
                    break;
                }
                javax.microedition.khronos.egl.EGLConfig eGLConfig2 = eGLConfigArr[i27];
                int i28 = i27;
                int a17 = kVar.a(egl102, eGLDisplay, eGLConfig2, 12325, 0);
                int a18 = kVar.a(egl102, eGLDisplay, eGLConfig2, 12326, 0);
                if (a17 >= kVar.f420421g && a18 >= kVar.f420422h) {
                    int a19 = kVar.a(egl102, eGLDisplay, eGLConfig2, 12324, 0);
                    int a27 = kVar.a(egl102, eGLDisplay, eGLConfig2, 12323, 0);
                    int a28 = kVar.a(egl102, eGLDisplay, eGLConfig2, 12322, 0);
                    i17 = i19;
                    int a29 = kVar.a(egl102, eGLDisplay, eGLConfig2, 12321, 0);
                    if (a19 == kVar.f420417c && a27 == kVar.f420418d && a28 == kVar.f420419e && a29 == kVar.f420420f) {
                        eGLConfig = eGLConfig2;
                        break;
                    }
                } else {
                    i17 = i19;
                }
                i27 = i28 + 1;
                i19 = i17;
            }
            if (eGLConfig == null) {
                throw new java.lang.IllegalArgumentException("No config chosen");
            }
            this.f420429f = eGLConfig;
            mq.h.b("MicroMsg.GameGLSurfaceView", "alvinluo EglHelper start chooseConfig end config: %s, display: %s", java.lang.Integer.valueOf(eGLConfig.hashCode()), java.lang.Integer.valueOf(this.f420427d.hashCode()));
            nq.o oVar = surfaceHolderCallback2C10435xb52e77fb.f146419m;
            javax.microedition.khronos.egl.EGL10 egl103 = this.f420426c;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay2 = this.f420427d;
            javax.microedition.khronos.egl.EGLConfig eGLConfig3 = this.f420429f;
            javax.microedition.khronos.egl.EGLContext eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
            nq.l lVar = (nq.l) oVar;
            lVar.getClass();
            mq.h.b("MicroMsg.GLThread", "createContext", new java.lang.Object[0]);
            int i29 = lVar.f420423a.f146423q;
            int[] iArr2 = {12440, i29, 12344};
            if (i29 == 0) {
                iArr2 = null;
            }
            this.f420430g = egl103.eglCreateContext(eGLDisplay2, eGLConfig3, eGLContext, iArr2);
            mq.h.b("MicroMsg.GameGLSurfaceView", "alvinluo EglHelper start createContext end", new java.lang.Object[0]);
        }
        javax.microedition.khronos.egl.EGLContext eGLContext2 = this.f420430g;
        if (eGLContext2 == null || eGLContext2 == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            this.f420430g = null;
            f("createContext", this.f420426c.eglGetError());
            throw null;
        }
        mq.h.d("MicroMsg.GLThread", "createContext " + this.f420430g + " tid=" + java.lang.Thread.currentThread().getId(), new java.lang.Object[0]);
        javax.microedition.khronos.egl.EGLSurface eglCreatePbufferSurface = this.f420426c.eglCreatePbufferSurface(this.f420427d, this.f420429f, new int[]{12375, 16, 12374, 16, 12344});
        this.f420431h = eglCreatePbufferSurface;
        this.f420426c.eglMakeCurrent(this.f420427d, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f420430g);
        this.f420424a = android.opengl.EGL14.eglGetCurrentContext().getNativeHandle();
        this.f420428e = null;
    }
}

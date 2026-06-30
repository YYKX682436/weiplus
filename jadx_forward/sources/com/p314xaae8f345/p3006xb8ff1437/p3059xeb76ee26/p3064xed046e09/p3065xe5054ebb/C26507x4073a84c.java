package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.p3065xe5054ebb;

/* renamed from: com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface */
/* loaded from: classes14.dex */
public class C26507x4073a84c implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: EGL_OPENGL_ES2_BIT */
    static final int f54163x7af810d7 = 4;
    static final java.lang.String TAG = "OutputSurface";

    /* renamed from: VERBOSE */
    static final boolean f54164x3fb90562 = false;

    /* renamed from: mEGL */
    javax.microedition.khronos.egl.EGL10 f54165x32985d;

    /* renamed from: mEGLContext */
    javax.microedition.khronos.egl.EGLContext f54166xceef8292;

    /* renamed from: mEGLDisplay */
    javax.microedition.khronos.egl.EGLDisplay f54167xf9dd65a5;

    /* renamed from: mEGLSurface */
    javax.microedition.khronos.egl.EGLSurface f54168x27c23990;

    /* renamed from: mFrameAvailable */
    boolean f54169x37c755a9;

    /* renamed from: mFrameSyncObject */
    java.lang.Object f54170x82b99ada = new java.lang.Object();

    /* renamed from: mSurface */
    android.view.Surface f54171x2fa29f80;

    /* renamed from: mSurfaceTexture */
    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26498xa12119f7 f54172x30495d7b;

    /* renamed from: mTextureRender */
    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.p3065xe5054ebb.C26508x3ea1b271 f54173x6a108b24;

    public C26507x4073a84c(int i17, int i18) {
        if (i17 > 0 && i18 > 0) {
            m103475x1853893(i17, i18);
            m103477x900967ab();
            m103479x6843a7d();
            return;
        }
        throw new java.lang.IllegalArgumentException();
    }

    /* renamed from: awaitNewImage */
    public void m103471x13bc3b11() {
        synchronized (this.f54170x82b99ada) {
            while (!this.f54169x37c755a9) {
                try {
                    this.f54170x82b99ada.wait(5000L);
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
                if (!this.f54169x37c755a9) {
                    throw new java.lang.RuntimeException("Surface frame wait timed out");
                    break;
                }
            }
            this.f54169x37c755a9 = false;
        }
        this.f54173x6a108b24.m103483x15195fb("before updateTexImage");
        this.f54172x30495d7b.updateTexImage();
    }

    /* renamed from: changeFragmentShader */
    public void m103472xf686f625(java.lang.String str) {
        this.f54173x6a108b24.m103482xf686f625(str);
    }

    /* renamed from: checkEglError */
    public void m103473x90b29146(java.lang.String str) {
        boolean z17 = false;
        while (true) {
            int eglGetError = this.f54165x32985d.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            java.lang.Integer.toHexString(eglGetError);
            z17 = true;
        }
        if (z17) {
            throw new java.lang.RuntimeException("EGL error encountered (see log)");
        }
    }

    /* renamed from: drawImage */
    public void m103474x7863677() {
        this.f54173x6a108b24.m103484x75e3689(this.f54172x30495d7b);
    }

    /* renamed from: eglSetup */
    public void m103475x1853893(int i17, int i18) {
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.f54165x32985d = egl10;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.f54167xf9dd65a5 = eglGetDisplay;
        if (!this.f54165x32985d.eglInitialize(eglGetDisplay, null)) {
            throw new java.lang.RuntimeException("unable to initialize EGL10");
        }
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
        if (!this.f54165x32985d.eglChooseConfig(this.f54167xf9dd65a5, new int[]{12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
            throw new java.lang.RuntimeException("unable to find RGB888+pbuffer EGL config");
        }
        this.f54166xceef8292 = this.f54165x32985d.eglCreateContext(this.f54167xf9dd65a5, eGLConfigArr[0], javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        m103473x90b29146("eglCreateContext");
        if (this.f54166xceef8292 == null) {
            throw new java.lang.RuntimeException("null context");
        }
        this.f54168x27c23990 = this.f54165x32985d.eglCreatePbufferSurface(this.f54167xf9dd65a5, eGLConfigArr[0], new int[]{12375, i17, 12374, i18, 12344});
        m103473x90b29146("eglCreatePbufferSurface");
        if (this.f54168x27c23990 == null) {
            throw new java.lang.RuntimeException("surface was null");
        }
    }

    /* renamed from: getSurface */
    public android.view.Surface m103476xcf572877() {
        return this.f54171x2fa29f80;
    }

    /* renamed from: makeCurrent */
    public void m103477x900967ab() {
        if (this.f54165x32985d == null) {
            throw new java.lang.RuntimeException("not configured for makeCurrent");
        }
        m103473x90b29146("before makeCurrent");
        javax.microedition.khronos.egl.EGL10 egl10 = this.f54165x32985d;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f54167xf9dd65a5;
        javax.microedition.khronos.egl.EGLSurface eGLSurface = this.f54168x27c23990;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f54166xceef8292)) {
            throw new java.lang.RuntimeException("eglMakeCurrent failed");
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this.f54170x82b99ada) {
            if (this.f54169x37c755a9) {
                throw new java.lang.RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.f54169x37c755a9 = true;
            this.f54170x82b99ada.notifyAll();
        }
    }

    /* renamed from: release */
    public void m103478x41012807() {
        javax.microedition.khronos.egl.EGL10 egl10 = this.f54165x32985d;
        if (egl10 != null) {
            if (egl10.eglGetCurrentContext().equals(this.f54166xceef8292)) {
                javax.microedition.khronos.egl.EGL10 egl102 = this.f54165x32985d;
                javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f54167xf9dd65a5;
                javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
                egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            }
            this.f54165x32985d.eglDestroySurface(this.f54167xf9dd65a5, this.f54168x27c23990);
            this.f54165x32985d.eglDestroyContext(this.f54167xf9dd65a5, this.f54166xceef8292);
        }
        this.f54171x2fa29f80.release();
        this.f54167xf9dd65a5 = null;
        this.f54166xceef8292 = null;
        this.f54168x27c23990 = null;
        this.f54165x32985d = null;
        this.f54173x6a108b24 = null;
        this.f54171x2fa29f80 = null;
        this.f54172x30495d7b = null;
    }

    /* renamed from: setup */
    public void m103479x6843a7d() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.p3065xe5054ebb.C26508x3ea1b271 c26508x3ea1b271 = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.p3065xe5054ebb.C26508x3ea1b271();
        this.f54173x6a108b24 = c26508x3ea1b271;
        c26508x3ea1b271.m103486xbb66fd7b();
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26498xa12119f7 c26498xa12119f7 = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26498xa12119f7(this.f54173x6a108b24.m103485xc2ca74e0());
        this.f54172x30495d7b = c26498xa12119f7;
        c26498xa12119f7.m103439xb165a19d(new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26498xa12119f7.ActionCallback() { // from class: com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface.1
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26498xa12119f7.ActionCallback
            /* renamed from: onReleased */
            public void mo103440x843dfc3c() {
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.p3065xe5054ebb.C26507x4073a84c.TAG, "mSurfaceTexture:" + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.p3065xe5054ebb.C26507x4073a84c.this.f54172x30495d7b + " onReleased, release OutputSurface");
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.p3065xe5054ebb.C26507x4073a84c.this.m103478x41012807();
            }
        });
        this.f54172x30495d7b.setOnFrameAvailableListener(this);
        this.f54171x2fa29f80 = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26497x47b7b684(this.f54172x30495d7b);
    }

    public C26507x4073a84c() {
        m103479x6843a7d();
    }
}

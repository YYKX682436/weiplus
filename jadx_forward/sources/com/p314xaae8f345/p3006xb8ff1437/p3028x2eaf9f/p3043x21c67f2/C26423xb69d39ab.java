package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2;

/* renamed from: com.tencent.thumbplayer.core.postprocessor.DisplaySurface */
/* loaded from: classes14.dex */
public class C26423xb69d39ab {

    /* renamed from: EGL_GL_COLORSPACE_BT2020_HLG_EXT */
    private static final int f53520x603b5a2b = 13632;

    /* renamed from: EGL_GL_COLORSPACE_KHR */
    private static final int f53522xf24d195e = 12445;

    /* renamed from: EGL_OPENGL_ES2_BIT */
    private static final int f53523x7af810d7 = 4;

    /* renamed from: EGL_RECORDABLE_ANDROID */
    private static final int f53524x5a4fb9b0 = 12610;
    private static final java.lang.String TAG = "sifeng: DisplaySurface";

    /* renamed from: VERBOSE */
    private static final boolean f53527x3fb90562 = false;

    /* renamed from: mCurrentPlayMode */
    private int f53528xc5f84763 = 0;

    /* renamed from: mEGLContext */
    private android.opengl.EGLContext f53529xceef8292;

    /* renamed from: mEGLDisplay */
    private android.opengl.EGLDisplay f53530xf9dd65a5;

    /* renamed from: mEGLSurface */
    private android.opengl.EGLSurface f53531x27c23990;

    /* renamed from: mHeight */
    public int f53532x6a4b7f4;

    /* renamed from: mSurface */
    private android.view.Surface f53533x2fa29f80;

    /* renamed from: mType */
    private final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType f53534x6280547;

    /* renamed from: mWidth */
    public int f53535xbefb7959;

    /* renamed from: EGL_CONFIG_ATTRIBUTES_RGBA_1010102 */
    public static final int[] f53518x657a78a = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: EGL_CONFIG_ATTRIBUTES_RGBA_888 */
    public static final int[] f53519x539a2e8d = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};

    /* renamed from: EGL_GL_COLORSPACE_BT2020_PQ_EXT */
    private static final int f53521x8e535d = 13120;

    /* renamed from: EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ */
    private static final int[] f53526x972de736 = {12445, f53521x8e535d, 12344};

    /* renamed from: EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG */
    private static final int[] f53525x4e8ee12e = {12445, 13632, 12344};

    public C26423xb69d39ab(android.view.Surface surface, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType tPProcessType) {
        surface.getClass();
        this.f53533x2fa29f80 = surface;
        this.f53534x6280547 = tPProcessType;
    }

    /* renamed from: checkEglError */
    private void m102745x90b29146(java.lang.String str) {
        boolean z17 = false;
        while (true) {
            int eglGetError = android.opengl.EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
            z17 = true;
        }
        if (z17) {
            m102753x41012807();
            throw new java.lang.RuntimeException("EGL error encountered (see log)");
        }
    }

    /* renamed from: getEglConfig */
    private android.opengl.EGLConfig m102746x13cbb936() {
        int[] iArr = this.f53534x6280547 == com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType.TP_PROCESS_HDR2SDR ? f53518x657a78a : f53519x539a2e8d;
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        android.opengl.EGLDisplay eGLDisplay = this.f53530xf9dd65a5;
        if (eGLDisplay != null && android.opengl.EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "eglChooseConfig error");
        m102753x41012807();
        throw new java.lang.RuntimeException("unable to find RGB888+recordable ES2 EGL config");
    }

    /* renamed from: eglSetup */
    public void m102747x1853893() {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        this.f53530xf9dd65a5 = eglGetDisplay;
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "eglGetDisplay error");
            m102753x41012807();
            throw new java.lang.RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "eglInitialize error");
            m102753x41012807();
            throw new java.lang.RuntimeException("unable to initialize EGL14");
        }
        this.f53529xceef8292 = android.opengl.EGL14.eglCreateContext(this.f53530xf9dd65a5, m102746x13cbb936(), android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        m102745x90b29146("eglCreateContext");
        if (this.f53529xceef8292 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "eglCreateContext error");
            m102753x41012807();
            throw new java.lang.RuntimeException("null context");
        }
        m102755x1d0e264b(this.f53528xc5f84763, this.f53533x2fa29f80);
        if (this.f53531x27c23990 != null) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "eglCreateWindowSurface error");
        m102753x41012807();
        throw new java.lang.RuntimeException("surface was null");
    }

    /* renamed from: getSurface */
    public android.view.Surface m102748xcf572877() {
        return this.f53533x2fa29f80;
    }

    /* renamed from: getmHeight */
    public int m102749xe1395bde() {
        return this.f53532x6a4b7f4;
    }

    /* renamed from: getmWidth */
    public int m102750x5aadb02f() {
        return this.f53535xbefb7959;
    }

    /* renamed from: makeCurrent */
    public void m102751x900967ab() {
        android.opengl.EGLSurface eGLSurface = this.f53531x27c23990;
        if (eGLSurface == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "mEGLSurface is null");
        } else {
            if (android.opengl.EGL14.eglMakeCurrent(this.f53530xf9dd65a5, eGLSurface, eGLSurface, this.f53529xceef8292)) {
                return;
            }
            m102745x90b29146("makeCurrent");
        }
    }

    /* renamed from: querySurface */
    public void m102752xe7937ac5() {
        android.opengl.EGLSurface eGLSurface;
        this.f53535xbefb7959 = 0;
        this.f53532x6a4b7f4 = 0;
        android.opengl.EGLDisplay eGLDisplay = this.f53530xf9dd65a5;
        if (eGLDisplay == android.opengl.EGL14.EGL_NO_DISPLAY || (eGLSurface = this.f53531x27c23990) == null || eGLDisplay == null) {
            throw new java.lang.RuntimeException("querySurface failed");
        }
        int[] iArr = new int[1];
        if (android.opengl.EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            this.f53535xbefb7959 = iArr[0];
        }
        if (android.opengl.EGL14.eglQuerySurface(this.f53530xf9dd65a5, this.f53531x27c23990, 12374, iArr, 0)) {
            this.f53532x6a4b7f4 = iArr[0];
        }
    }

    /* renamed from: release */
    public void m102753x41012807() {
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "display surface release");
            if (android.opengl.EGL14.eglGetCurrentContext().equals(this.f53529xceef8292)) {
                android.opengl.EGLDisplay eGLDisplay = this.f53530xf9dd65a5;
                android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "eglMakeCurrent no surface,ret:" + android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT));
            }
            android.opengl.EGLSurface eGLSurface2 = this.f53531x27c23990;
            if (eGLSurface2 != null) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "eglDestroySurface,ret:" + android.opengl.EGL14.eglDestroySurface(this.f53530xf9dd65a5, eGLSurface2));
            }
            android.opengl.EGLContext eGLContext = this.f53529xceef8292;
            if (eGLContext != null) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "eglDestroyContext,ret:" + android.opengl.EGL14.eglDestroyContext(this.f53530xf9dd65a5, eGLContext));
            }
            this.f53530xf9dd65a5 = null;
            this.f53529xceef8292 = null;
            this.f53531x27c23990 = null;
            this.f53533x2fa29f80 = null;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "display render release failed!");
        }
    }

    /* renamed from: swapBuffers */
    public boolean m102754x82211f20() {
        return android.opengl.EGL14.eglSwapBuffers(this.f53530xf9dd65a5, this.f53531x27c23990);
    }

    /* renamed from: switchPlayMode */
    public void m102755x1d0e264b(int i17, android.view.Surface surface) {
        if (this.f53528xc5f84763 == i17 && surface == null) {
            return;
        }
        this.f53528xc5f84763 = i17;
        if (surface != null && surface.isValid()) {
            this.f53533x2fa29f80 = surface;
        }
        if (this.f53531x27c23990 != null) {
            android.opengl.EGLDisplay eGLDisplay = this.f53530xf9dd65a5;
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f53529xceef8292);
            android.opengl.EGL14.eglDestroySurface(this.f53530xf9dd65a5, this.f53531x27c23990);
        }
        int i18 = this.f53528xc5f84763;
        if (i18 == 4) {
            this.f53531x27c23990 = android.opengl.EGL14.eglCreateWindowSurface(this.f53530xf9dd65a5, m102746x13cbb936(), this.f53533x2fa29f80, f53526x972de736, 0);
        } else if (i18 != 5) {
            this.f53531x27c23990 = android.opengl.EGL14.eglCreateWindowSurface(this.f53530xf9dd65a5, m102746x13cbb936(), this.f53533x2fa29f80, new int[]{12344}, 0);
        } else {
            this.f53531x27c23990 = android.opengl.EGL14.eglCreateWindowSurface(this.f53530xf9dd65a5, m102746x13cbb936(), this.f53533x2fa29f80, f53525x4e8ee12e, 0);
        }
        m102745x90b29146("eglCreateWindowSurface mode:" + this.f53528xc5f84763);
    }
}

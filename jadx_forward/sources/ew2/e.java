package ew2;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ew2.f f338569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f338570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f338571f;

    public e(ew2.f fVar, yz5.a aVar, android.view.Surface surface) {
        this.f338569d = fVar;
        this.f338570e = aVar;
        this.f338571f = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ew2.f fVar = this.f338569d;
        fVar.f338583j = this.f338570e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.f338578e, android.opengl.EGL14.EGL_NO_SURFACE)) {
            android.opengl.EGLDisplay eGLDisplay = fVar.f338577d;
            android.opengl.EGLSurface EGL_NO_SURFACE = android.opengl.EGL14.EGL_NO_SURFACE;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_SURFACE, "EGL_NO_SURFACE");
            android.opengl.EGLSurface EGL_NO_SURFACE2 = android.opengl.EGL14.EGL_NO_SURFACE;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_SURFACE2, "EGL_NO_SURFACE");
            fVar.b(eGLDisplay, EGL_NO_SURFACE, EGL_NO_SURFACE2, fVar.f338576c);
            android.opengl.EGL14.eglDestroySurface(fVar.f338577d, fVar.f338578e);
        }
        int[] iArr = {12344};
        android.opengl.EGLDisplay eGLDisplay2 = fVar.f338577d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eGLDisplay2);
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (!android.opengl.EGL14.eglChooseConfig(eGLDisplay2, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new java.lang.RuntimeException("Unable to find suitable EGLConfig");
        }
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eGLConfig);
        android.opengl.EGLSurface eglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(eGLDisplay2, eGLConfig, this.f338571f, iArr, 0);
        if (eglCreateWindowSurface == android.opengl.EGL14.EGL_NO_SURFACE) {
            throw new android.opengl.GLException(android.opengl.EGL14.eglGetError(), "Failed to create window surface: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eglCreateWindowSurface);
        fVar.f338578e = eglCreateWindowSurface;
        android.opengl.EGLDisplay eGLDisplay3 = fVar.f338577d;
        android.opengl.EGLSurface eGLSurface = fVar.f338578e;
        fVar.b(eGLDisplay3, eGLSurface, eGLSurface, fVar.f338576c);
        if (fVar.f338582i) {
            fVar.a();
        }
    }
}

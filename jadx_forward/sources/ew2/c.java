package ew2;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ew2.f f338567d;

    public c(ew2.f fVar) {
        this.f338567d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ew2.f fVar = this.f338567d;
        ew2.h hVar = fVar.f338580g;
        if (hVar != null) {
            hVar.f338595f.release();
            hVar.f338594e.release();
        }
        int i17 = fVar.f338579f;
        if (i17 != 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[i17], 0);
            fVar.f338579f = 0;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.f338576c, android.opengl.EGL14.eglGetCurrentContext())) {
            ot5.g.d("FinderGLRender", "detachCurrent return for eglContext:" + fVar.f338576c + " current:" + android.opengl.EGL14.eglGetCurrentContext());
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.f338578e, android.opengl.EGL14.EGL_NO_SURFACE)) {
            ot5.g.d("FinderGLRender", "detachCurrent return for eglSurface");
        } else {
            android.opengl.EGLDisplay eGLDisplay = fVar.f338577d;
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT)) {
                throw new android.opengl.GLException(android.opengl.EGL14.eglGetError(), "eglDetachCurrent failed: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
            }
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.f338578e, android.opengl.EGL14.EGL_NO_SURFACE)) {
            android.opengl.EGL14.eglDestroySurface(fVar.f338577d, fVar.f338578e);
            android.opengl.EGLSurface EGL_NO_SURFACE = android.opengl.EGL14.EGL_NO_SURFACE;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_SURFACE, "EGL_NO_SURFACE");
            fVar.f338578e = EGL_NO_SURFACE;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.f338576c, android.opengl.EGL14.EGL_NO_CONTEXT)) {
            android.opengl.EGL14.eglDestroyContext(fVar.f338577d, fVar.f338576c);
        }
        android.opengl.EGL14.eglReleaseThread();
        android.opengl.EGL14.eglTerminate(fVar.f338577d);
    }
}

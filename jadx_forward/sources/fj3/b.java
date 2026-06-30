package fj3;

/* loaded from: classes14.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj3.f f344726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f344727e;

    public b(fj3.f fVar, android.opengl.EGLContext eGLContext) {
        this.f344726d = fVar;
        this.f344727e = eGLContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        android.opengl.EGLContext eGLContext = this.f344727e;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(rs0.i.f480829a.m(null, null, 1, 1, eGLContext));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        rs0.h hVar = null;
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        rs0.h hVar2 = (rs0.h) m143895xf1229813;
        fj3.f fVar = this.f344726d;
        if (hVar2 != null) {
            android.opengl.EGLDisplay eGLDisplay = hVar2.f480825a;
            android.opengl.EGLSurface eGLSurface = hVar2.f480826b;
            android.opengl.EGLSurface eGLSurface2 = eGLSurface == null ? android.opengl.EGL14.EGL_NO_SURFACE : eGLSurface;
            if (eGLSurface == null) {
                eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface, hVar2.f480827c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f344732a, "eglMakeCurrent");
            hVar = hVar2;
        } else {
            ((android.os.Handler) ((jz5.n) fVar.f344735d).mo141623x754a37bb()).post(new fj3.c(fVar));
            ((android.os.HandlerThread) ((jz5.n) fVar.f344734c).mo141623x754a37bb()).quitSafely();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(fVar.f344732a, "create gl environment error");
        }
        fVar.f344736e = hVar;
        fVar.f344733b = true;
    }
}

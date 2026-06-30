package ij3;

/* loaded from: classes14.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij3.k f373231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ij3.f f373232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f373233f;

    public a(ij3.k kVar, ij3.f fVar, java.lang.Runnable runnable) {
        this.f373231d = kVar;
        this.f373232e = fVar;
        this.f373233f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.h hVar;
        rs0.h hVar2;
        android.opengl.EGLSurface eGLSurface;
        if (!((ij3.i) this.f373231d).f373243a.f381541e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "surface not inUse " + ((ij3.i) this.f373231d).f373243a);
            return;
        }
        ij3.f fVar = this.f373232e;
        fj3.f fVar2 = fVar.f373237e;
        jj3.c cVar = ((ij3.i) this.f373231d).f373243a;
        fVar.getClass();
        if (fVar2 != null && (hVar2 = fVar2.f344736e) != null) {
            if (cVar.f381541e && ((eGLSurface = cVar.f381539c) == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eGLSurface, android.opengl.EGL14.EGL_NO_SURFACE))) {
                jj3.d a17 = cVar.a();
                if ((a17 != null ? a17.mo67061x8dd3293d() : null) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "eglCreateSurface for " + cVar);
                    jj3.d a18 = cVar.a();
                    java.lang.Object mo67061x8dd3293d = a18 != null ? a18.mo67061x8dd3293d() : null;
                    if (mo67061x8dd3293d != null) {
                        cVar.f381539c = rs0.i.f480829a.k(hVar2.f480825a, mo67061x8dd3293d);
                        android.opengl.EGLDisplay eGLDisplay = hVar2.f480825a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eGLDisplay, "<set-?>");
                        cVar.f381540d = eGLDisplay;
                    }
                }
            }
            android.opengl.EGLDisplay eGLDisplay2 = hVar2.f480825a;
            android.opengl.EGLSurface eGLSurface2 = cVar.f381539c;
            android.opengl.EGLSurface eGLSurface3 = eGLSurface2 == null ? android.opengl.EGL14.EGL_NO_SURFACE : eGLSurface2;
            if (eGLSurface2 == null) {
                eGLSurface2 = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface2, hVar2.f480827c);
        }
        this.f373233f.run();
        ij3.f fVar3 = this.f373232e;
        fj3.f fVar4 = fVar3.f373237e;
        jj3.c cVar2 = ((ij3.i) this.f373231d).f373243a;
        fVar3.getClass();
        if (fVar4 != null && (hVar = fVar4.f344736e) != null) {
            rs0.g gVar = rs0.i.f480829a;
            android.opengl.EGLDisplay eGLDisplay3 = hVar.f480825a;
            android.opengl.EGLSurface eGLSurface4 = cVar2.f381539c;
            if (eGLSurface4 == null) {
                eGLSurface4 = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            gVar.x(eGLDisplay3, eGLSurface4);
        }
        jj3.d a19 = ((ij3.i) this.f373231d).f373243a.a();
        if (a19 != null) {
            a19.a();
        }
    }
}

package lw1;

/* loaded from: classes14.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw1.k f403079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lw1.f f403080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f403081f;

    public a(lw1.k kVar, lw1.f fVar, java.lang.Runnable runnable) {
        this.f403079d = kVar;
        this.f403080e = fVar;
        this.f403081f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.h hVar;
        rs0.h hVar2;
        android.opengl.EGLSurface eGLSurface;
        if (!((lw1.i) this.f403079d).f403091a.f413227e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "surface not inUse " + ((lw1.i) this.f403079d).f403091a);
            return;
        }
        lw1.f fVar = this.f403080e;
        iw1.f fVar2 = fVar.f403085e;
        mw1.b bVar = ((lw1.i) this.f403079d).f403091a;
        fVar.getClass();
        if (fVar2 != null && (hVar2 = fVar2.f376741e) != null) {
            if (bVar.f413227e && ((eGLSurface = bVar.f413225c) == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eGLSurface, android.opengl.EGL14.EGL_NO_SURFACE))) {
                mw1.c a17 = bVar.a();
                if ((a17 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3) a17).m54522x8dd3293d() : null) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "eglCreateSurface for " + bVar);
                    mw1.c a18 = bVar.a();
                    java.lang.Object m54522x8dd3293d = a18 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3) a18).m54522x8dd3293d() : null;
                    if (m54522x8dd3293d != null) {
                        bVar.f413225c = rs0.i.f480829a.k(hVar2.f480825a, m54522x8dd3293d);
                        android.opengl.EGLDisplay eGLDisplay = hVar2.f480825a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eGLDisplay, "<set-?>");
                        bVar.f413226d = eGLDisplay;
                    }
                }
            }
            android.opengl.EGLDisplay eGLDisplay2 = hVar2.f480825a;
            android.opengl.EGLSurface eGLSurface2 = bVar.f413225c;
            android.opengl.EGLSurface eGLSurface3 = eGLSurface2 == null ? android.opengl.EGL14.EGL_NO_SURFACE : eGLSurface2;
            if (eGLSurface2 == null) {
                eGLSurface2 = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface2, hVar2.f480827c);
        }
        this.f403081f.run();
        lw1.f fVar3 = this.f403080e;
        iw1.f fVar4 = fVar3.f403085e;
        mw1.b bVar2 = ((lw1.i) this.f403079d).f403091a;
        fVar3.getClass();
        if (fVar4 != null && (hVar = fVar4.f376741e) != null) {
            rs0.g gVar = rs0.i.f480829a;
            android.opengl.EGLDisplay eGLDisplay3 = hVar.f480825a;
            android.opengl.EGLSurface eGLSurface4 = bVar2.f413225c;
            if (eGLSurface4 == null) {
                eGLSurface4 = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            gVar.x(eGLDisplay3, eGLSurface4);
        }
        ((lw1.i) this.f403079d).f403091a.a();
    }
}

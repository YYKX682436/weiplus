package dr4;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f324261a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f324262b;

    /* renamed from: c, reason: collision with root package name */
    public android.opengl.EGLSurface f324263c;

    /* renamed from: d, reason: collision with root package name */
    public final dr4.p f324264d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f324265e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f324266f;

    public q(android.view.Surface surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f324261a = "MicroMsg.OpenGLSurface@" + hashCode();
        this.f324263c = android.opengl.EGL14.EGL_NO_SURFACE;
        this.f324264d = new dr4.p();
        this.f324266f = new java.lang.Object();
        d(0, 0, i17, i18);
        this.f324262b = surface;
    }

    public final android.opengl.EGLSurface a() {
        android.opengl.EGLSurface eglSurface = this.f324263c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eglSurface, "eglSurface");
        return eglSurface;
    }

    public final boolean b() {
        java.lang.Object obj = this.f324262b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof android.graphics.SurfaceTexture) {
            return (fp.h.c(26) && ((android.graphics.SurfaceTexture) obj).isReleased()) ? false : true;
        }
        if (obj instanceof android.view.Surface) {
            return ((android.view.Surface) obj).isValid();
        }
        return false;
    }

    public final void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f324261a, "markSurfaceRemoved:" + z17);
        synchronized (this.f324266f) {
            this.f324265e = z17;
        }
    }

    public final void d(int i17, int i18, int i19, int i27) {
        dr4.p pVar = this.f324264d;
        pVar.getClass();
        pVar.getClass();
        pVar.f324230a = i19;
        pVar.f324231b = i27;
    }

    public q(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f324261a = "MicroMsg.OpenGLSurface@" + hashCode();
        this.f324263c = android.opengl.EGL14.EGL_NO_SURFACE;
        this.f324264d = new dr4.p();
        this.f324266f = new java.lang.Object();
        d(0, 0, i17, i18);
        this.f324262b = surface;
    }

    public q(int i17, int i18, int i19, int i27) {
        this.f324261a = "MicroMsg.OpenGLSurface@" + hashCode();
        this.f324263c = android.opengl.EGL14.EGL_NO_SURFACE;
        this.f324264d = new dr4.p();
        this.f324266f = new java.lang.Object();
        d(i17, i18, i19, i27);
    }
}

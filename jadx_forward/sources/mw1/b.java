package mw1;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f413223a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f413224b;

    /* renamed from: c, reason: collision with root package name */
    public android.opengl.EGLSurface f413225c;

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLDisplay f413226d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f413227e;

    public b(java.lang.String username, java.lang.ref.WeakReference wInfoHolder, android.opengl.EGLSurface eGLSurface, android.opengl.EGLDisplay eglDisplay, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        eGLSurface = (i17 & 4) != 0 ? null : eGLSurface;
        if ((i17 & 8) != 0) {
            eglDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eglDisplay, "EGL_NO_DISPLAY");
        }
        z17 = (i17 & 16) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wInfoHolder, "wInfoHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eglDisplay, "eglDisplay");
        this.f413223a = username;
        this.f413224b = wInfoHolder;
        this.f413225c = eGLSurface;
        this.f413226d = eglDisplay;
        this.f413227e = z17;
    }

    public final mw1.c a() {
        return (mw1.c) this.f413224b.get();
    }

    /* renamed from: equals */
    public boolean m148476xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw1.b)) {
            return false;
        }
        mw1.b bVar = (mw1.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413223a, bVar.f413223a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413224b, bVar.f413224b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413225c, bVar.f413225c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413226d, bVar.f413226d) && this.f413227e == bVar.f413227e;
    }

    /* renamed from: hashCode */
    public int m148477x8cdac1b() {
        int hashCode = ((this.f413223a.hashCode() * 31) + this.f413224b.hashCode()) * 31;
        android.opengl.EGLSurface eGLSurface = this.f413225c;
        return ((((hashCode + (eGLSurface == null ? 0 : eGLSurface.hashCode())) * 31) + this.f413226d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f413227e);
    }

    /* renamed from: toString */
    public java.lang.String m148478x9616526c() {
        return "RenderTarget(username=" + this.f413223a + ", wInfoHolder=" + this.f413224b + ", surface=" + this.f413225c + ", eglDisplay=" + this.f413226d + ", inUse=" + this.f413227e + ')';
    }
}

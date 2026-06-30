package jj3;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f381537a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f381538b;

    /* renamed from: c, reason: collision with root package name */
    public android.opengl.EGLSurface f381539c;

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLDisplay f381540d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f381541e;

    public c(java.lang.String username, java.lang.ref.WeakReference wInfoHolder, android.opengl.EGLSurface eGLSurface, android.opengl.EGLDisplay eglDisplay, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        eGLSurface = (i17 & 4) != 0 ? null : eGLSurface;
        if ((i17 & 8) != 0) {
            eglDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eglDisplay, "EGL_NO_DISPLAY");
        }
        z17 = (i17 & 16) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wInfoHolder, "wInfoHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eglDisplay, "eglDisplay");
        this.f381537a = username;
        this.f381538b = wInfoHolder;
        this.f381539c = eGLSurface;
        this.f381540d = eglDisplay;
        this.f381541e = z17;
    }

    public final jj3.d a() {
        return (jj3.d) this.f381538b.get();
    }

    /* renamed from: equals */
    public boolean m141046xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj3.c)) {
            return false;
        }
        jj3.c cVar = (jj3.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f381537a, cVar.f381537a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f381538b, cVar.f381538b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f381539c, cVar.f381539c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f381540d, cVar.f381540d) && this.f381541e == cVar.f381541e;
    }

    /* renamed from: hashCode */
    public int m141047x8cdac1b() {
        int hashCode = ((this.f381537a.hashCode() * 31) + this.f381538b.hashCode()) * 31;
        android.opengl.EGLSurface eGLSurface = this.f381539c;
        return ((((hashCode + (eGLSurface == null ? 0 : eGLSurface.hashCode())) * 31) + this.f381540d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f381541e);
    }

    /* renamed from: toString */
    public java.lang.String m141048x9616526c() {
        return "RenderTarget(username=" + this.f381537a + ", wInfoHolder=" + this.f381538b + ", surface=" + this.f381539c + ", eglDisplay=" + this.f381540d + ", inUse=" + this.f381541e + ')';
    }
}

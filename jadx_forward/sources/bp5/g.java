package bp5;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f104995a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f104996b;

    /* renamed from: c, reason: collision with root package name */
    public android.opengl.EGLSurface f104997c;

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLDisplay f104998d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f104999e;

    public g(int i17, java.lang.ref.WeakReference wInfoHolder, android.opengl.EGLSurface eGLSurface, android.opengl.EGLDisplay eglDisplay, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        eGLSurface = (i18 & 4) != 0 ? null : eGLSurface;
        if ((i18 & 8) != 0) {
            eglDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eglDisplay, "EGL_NO_DISPLAY");
        }
        z17 = (i18 & 16) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wInfoHolder, "wInfoHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eglDisplay, "eglDisplay");
        this.f104995a = i17;
        this.f104996b = wInfoHolder;
        this.f104997c = eGLSurface;
        this.f104998d = eglDisplay;
        this.f104999e = z17;
    }

    public final bp5.h a() {
        return (bp5.h) this.f104996b.get();
    }

    /* renamed from: equals */
    public boolean m11011xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp5.g)) {
            return false;
        }
        bp5.g gVar = (bp5.g) obj;
        return this.f104995a == gVar.f104995a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f104996b, gVar.f104996b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f104997c, gVar.f104997c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f104998d, gVar.f104998d) && this.f104999e == gVar.f104999e;
    }

    /* renamed from: hashCode */
    public int m11012x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f104995a) * 31) + this.f104996b.hashCode()) * 31;
        android.opengl.EGLSurface eGLSurface = this.f104997c;
        return ((((hashCode + (eGLSurface == null ? 0 : eGLSurface.hashCode())) * 31) + this.f104998d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f104999e);
    }

    /* renamed from: toString */
    public java.lang.String m11013x9616526c() {
        return "RenderTarget(key=" + this.f104995a + ", wInfoHolder=" + this.f104996b + ", surface=" + this.f104997c + ", eglDisplay=" + this.f104998d + ", inUse=" + this.f104999e + ')';
    }
}

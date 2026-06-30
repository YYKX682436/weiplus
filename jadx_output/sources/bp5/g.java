package bp5;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f23462a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f23463b;

    /* renamed from: c, reason: collision with root package name */
    public android.opengl.EGLSurface f23464c;

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLDisplay f23465d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f23466e;

    public g(int i17, java.lang.ref.WeakReference wInfoHolder, android.opengl.EGLSurface eGLSurface, android.opengl.EGLDisplay eglDisplay, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        eGLSurface = (i18 & 4) != 0 ? null : eGLSurface;
        if ((i18 & 8) != 0) {
            eglDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
            kotlin.jvm.internal.o.f(eglDisplay, "EGL_NO_DISPLAY");
        }
        z17 = (i18 & 16) != 0 ? true : z17;
        kotlin.jvm.internal.o.g(wInfoHolder, "wInfoHolder");
        kotlin.jvm.internal.o.g(eglDisplay, "eglDisplay");
        this.f23462a = i17;
        this.f23463b = wInfoHolder;
        this.f23464c = eGLSurface;
        this.f23465d = eglDisplay;
        this.f23466e = z17;
    }

    public final bp5.h a() {
        return (bp5.h) this.f23463b.get();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp5.g)) {
            return false;
        }
        bp5.g gVar = (bp5.g) obj;
        return this.f23462a == gVar.f23462a && kotlin.jvm.internal.o.b(this.f23463b, gVar.f23463b) && kotlin.jvm.internal.o.b(this.f23464c, gVar.f23464c) && kotlin.jvm.internal.o.b(this.f23465d, gVar.f23465d) && this.f23466e == gVar.f23466e;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f23462a) * 31) + this.f23463b.hashCode()) * 31;
        android.opengl.EGLSurface eGLSurface = this.f23464c;
        return ((((hashCode + (eGLSurface == null ? 0 : eGLSurface.hashCode())) * 31) + this.f23465d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f23466e);
    }

    public java.lang.String toString() {
        return "RenderTarget(key=" + this.f23462a + ", wInfoHolder=" + this.f23463b + ", surface=" + this.f23464c + ", eglDisplay=" + this.f23465d + ", inUse=" + this.f23466e + ')';
    }
}

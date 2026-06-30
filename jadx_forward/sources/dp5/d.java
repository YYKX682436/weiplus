package dp5;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.opengl.EGLDisplay f323813a;

    /* renamed from: b, reason: collision with root package name */
    public final android.opengl.EGLSurface f323814b;

    /* renamed from: c, reason: collision with root package name */
    public final android.opengl.EGLContext f323815c;

    public d(android.opengl.EGLDisplay display, android.opengl.EGLSurface eGLSurface, android.opengl.EGLContext eglContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(display, "display");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eglContext, "eglContext");
        this.f323813a = display;
        this.f323814b = eGLSurface;
        this.f323815c = eglContext;
    }

    /* renamed from: equals */
    public boolean m125869xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp5.d)) {
            return false;
        }
        dp5.d dVar = (dp5.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f323813a, dVar.f323813a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f323814b, dVar.f323814b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f323815c, dVar.f323815c);
    }

    /* renamed from: hashCode */
    public int m125870x8cdac1b() {
        int hashCode = this.f323813a.hashCode() * 31;
        android.opengl.EGLSurface eGLSurface = this.f323814b;
        return ((hashCode + (eGLSurface == null ? 0 : eGLSurface.hashCode())) * 31) + this.f323815c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m125871x9616526c() {
        return "GLEnv(display=" + this.f323813a + ", eglSurface=" + this.f323814b + ", eglContext=" + this.f323815c + ')';
    }
}

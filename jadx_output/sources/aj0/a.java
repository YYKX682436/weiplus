package aj0;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public android.opengl.EGLDisplay f5211a;

    /* renamed from: b, reason: collision with root package name */
    public android.opengl.EGLSurface f5212b;

    /* renamed from: c, reason: collision with root package name */
    public android.opengl.EGLContext f5213c;

    public a(android.opengl.EGLDisplay disPlay, android.opengl.EGLSurface eGLSurface, android.opengl.EGLContext eglContext) {
        kotlin.jvm.internal.o.g(disPlay, "disPlay");
        kotlin.jvm.internal.o.g(eglContext, "eglContext");
        this.f5211a = disPlay;
        this.f5212b = eGLSurface;
        this.f5213c = eglContext;
    }
}

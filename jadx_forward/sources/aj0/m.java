package aj0;

/* loaded from: classes14.dex */
public final class m implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj0.a f86802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj0.s f86803e;

    public m(aj0.a aVar, aj0.s sVar) {
        this.f86802d = aVar;
        this.f86803e = sVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        aj0.t tVar = aj0.t.f86820a;
        aj0.a eglEnvironment = this.f86802d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eglEnvironment, "eglEnvironment");
        android.opengl.EGLSurface eGLSurface = eglEnvironment.f86745b;
        if (eGLSurface != null) {
            android.opengl.EGL14.eglSwapBuffers(eglEnvironment.f86744a, eGLSurface);
            aj0.t.a(tVar, "eglSwapBuffers", null, 2, null);
        }
        this.f86803e.getClass();
    }
}

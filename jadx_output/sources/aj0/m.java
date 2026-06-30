package aj0;

/* loaded from: classes14.dex */
public final class m implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj0.a f5269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj0.s f5270e;

    public m(aj0.a aVar, aj0.s sVar) {
        this.f5269d = aVar;
        this.f5270e = sVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        aj0.t tVar = aj0.t.f5287a;
        aj0.a eglEnvironment = this.f5269d;
        kotlin.jvm.internal.o.g(eglEnvironment, "eglEnvironment");
        android.opengl.EGLSurface eGLSurface = eglEnvironment.f5212b;
        if (eGLSurface != null) {
            android.opengl.EGL14.eglSwapBuffers(eglEnvironment.f5211a, eGLSurface);
            aj0.t.a(tVar, "eglSwapBuffers", null, 2, null);
        }
        this.f5270e.getClass();
    }
}

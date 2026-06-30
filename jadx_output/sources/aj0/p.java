package aj0;

/* loaded from: classes14.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj0.s f5276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(aj0.s sVar) {
        super(0);
        this.f5276d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        aj0.s sVar = this.f5276d;
        sVar.getClass();
        io.flutter.Log.i("FlutterPreRenderOffscreenEGLSurface", "do release");
        aj0.a aVar = sVar.f5283e;
        if (aVar != null) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{sVar.f5284f}, 0);
            if (aVar.f5212b != android.opengl.EGL14.EGL_NO_DISPLAY) {
                android.opengl.EGLDisplay eGLDisplay = aVar.f5211a;
                android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
                android.opengl.EGL14.eglDestroySurface(aVar.f5211a, aVar.f5212b);
                io.flutter.Log.i("PreRenderGLUtil", "destroy eglContext: " + aVar.f5213c.getNativeHandle());
                android.opengl.EGL14.eglDestroyContext(aVar.f5211a, aVar.f5213c);
                android.opengl.EGL14.eglReleaseThread();
                android.opengl.EGL14.eglTerminate(aVar.f5211a);
            }
            android.opengl.EGLDisplay EGL_NO_DISPLAY = android.opengl.EGL14.EGL_NO_DISPLAY;
            kotlin.jvm.internal.o.f(EGL_NO_DISPLAY, "EGL_NO_DISPLAY");
            aVar.f5211a = EGL_NO_DISPLAY;
            android.opengl.EGLContext EGL_NO_CONTEXT = android.opengl.EGL14.EGL_NO_CONTEXT;
            kotlin.jvm.internal.o.f(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
            aVar.f5213c = EGL_NO_CONTEXT;
            aVar.f5212b = android.opengl.EGL14.EGL_NO_SURFACE;
            android.os.HandlerThread handlerThread = sVar.f5282d;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            sVar.f5281c = null;
            sVar.f5282d = null;
        }
        return jz5.f0.f302826a;
    }
}

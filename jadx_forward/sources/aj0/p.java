package aj0;

/* loaded from: classes14.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj0.s f86809d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(aj0.s sVar) {
        super(0);
        this.f86809d = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        aj0.s sVar = this.f86809d;
        sVar.getClass();
        io.p3284xd2ae381c.Log.i("FlutterPreRenderOffscreenEGLSurface", "do release");
        aj0.a aVar = sVar.f86816e;
        if (aVar != null) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{sVar.f86817f}, 0);
            if (aVar.f86745b != android.opengl.EGL14.EGL_NO_DISPLAY) {
                android.opengl.EGLDisplay eGLDisplay = aVar.f86744a;
                android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
                android.opengl.EGL14.eglDestroySurface(aVar.f86744a, aVar.f86745b);
                io.p3284xd2ae381c.Log.i("PreRenderGLUtil", "destroy eglContext: " + aVar.f86746c.getNativeHandle());
                android.opengl.EGL14.eglDestroyContext(aVar.f86744a, aVar.f86746c);
                android.opengl.EGL14.eglReleaseThread();
                android.opengl.EGL14.eglTerminate(aVar.f86744a);
            }
            android.opengl.EGLDisplay EGL_NO_DISPLAY = android.opengl.EGL14.EGL_NO_DISPLAY;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_DISPLAY, "EGL_NO_DISPLAY");
            aVar.f86744a = EGL_NO_DISPLAY;
            android.opengl.EGLContext EGL_NO_CONTEXT = android.opengl.EGL14.EGL_NO_CONTEXT;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
            aVar.f86746c = EGL_NO_CONTEXT;
            aVar.f86745b = android.opengl.EGL14.EGL_NO_SURFACE;
            android.os.HandlerThread handlerThread = sVar.f86815d;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            sVar.f86814c = null;
            sVar.f86815d = null;
        }
        return jz5.f0.f384359a;
    }
}

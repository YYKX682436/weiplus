package aj0;

/* loaded from: classes14.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj0.s f5278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(aj0.s sVar) {
        super(0);
        this.f5278d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        aj0.t tVar = aj0.t.f5287a;
        aj0.s sVar = this.f5278d;
        int i18 = sVar.f5279a;
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new java.lang.RuntimeException("unable to initialize EGL14");
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        android.opengl.EGL14.eglChooseConfig(eglGetDisplay, aj0.t.f5288b, 0, eGLConfigArr, 0, 1, new int[1], 0);
        aj0.a aVar = null;
        aj0.t.a(tVar, "eglCreateContext RGB888+recordable ES2", null, 2, null);
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
        aj0.t.a(tVar, "eglCreateContext", null, 2, null);
        io.flutter.Log.i("PreRenderGLUtil", "create eglContext: " + eglCreateContext.getNativeHandle());
        if (kotlin.jvm.internal.o.b(eglCreateContext, android.opengl.EGL14.EGL_NO_CONTEXT)) {
            io.flutter.Log.e("PreRenderGLUtil", "create EGL context failed");
        } else {
            android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr[0], (i18 <= 0 || (i17 = sVar.f5280b) <= 0) ? new int[]{12344} : new int[]{12375, i18, 12374, i17, 12344}, 0);
            aj0.t.a(tVar, "eglCreatePbufferSurface", null, 2, null);
            if (eglCreatePbufferSurface != null) {
                android.opengl.EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
                aj0.t.a(tVar, "eglMakeCurrent", null, 2, null);
            }
            kotlin.jvm.internal.o.d(eglGetDisplay);
            aVar = new aj0.a(eglGetDisplay, eglCreatePbufferSurface, eglCreateContext);
        }
        sVar.f5283e = aVar;
        return jz5.f0.f302826a;
    }
}

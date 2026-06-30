package az0;

/* loaded from: classes14.dex */
public final class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final az0.q2 f97364d = new az0.q2();

    @Override // java.lang.Runnable
    public final void run() {
        android.opengl.EGLSurface eGLSurface;
        rs0.h hVar = az0.w2.f97527g;
        if (hVar == null) {
            return;
        }
        if ((hVar != null ? hVar.f480825a : null) == null || hVar.f480826b == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar.f480827c, android.opengl.EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        android.opengl.EGLDisplay eGLDisplay = hVar.f480825a;
        android.opengl.EGLSurface eGLSurface2 = hVar.f480826b;
        if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, hVar.f480827c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaasMJCaptureSessionPreload", "destroyWindowSurface eglMakeCurrent failed");
        } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(az0.w2.f97531n, android.opengl.EGL14.EGL_NO_SURFACE) && (eGLSurface = az0.w2.f97531n) != null) {
            android.opengl.EGL14.eglDestroySurface(hVar.f480825a, eGLSurface);
            az0.w2.f97531n = null;
        }
        az0.w2.f97535r = false;
        az0.w2.f97536s = az0.m2.f97220f;
    }
}

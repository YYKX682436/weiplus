package az0;

/* loaded from: classes14.dex */
public final class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final az0.q2 f15831d = new az0.q2();

    @Override // java.lang.Runnable
    public final void run() {
        android.opengl.EGLSurface eGLSurface;
        rs0.h hVar = az0.w2.f15994g;
        if (hVar == null) {
            return;
        }
        if ((hVar != null ? hVar.f399292a : null) == null || hVar.f399293b == null || kotlin.jvm.internal.o.b(hVar.f399294c, android.opengl.EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        android.opengl.EGLDisplay eGLDisplay = hVar.f399292a;
        android.opengl.EGLSurface eGLSurface2 = hVar.f399293b;
        if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, hVar.f399294c)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MaasMJCaptureSessionPreload", "destroyWindowSurface eglMakeCurrent failed");
        } else if (!kotlin.jvm.internal.o.b(az0.w2.f15998n, android.opengl.EGL14.EGL_NO_SURFACE) && (eGLSurface = az0.w2.f15998n) != null) {
            android.opengl.EGL14.eglDestroySurface(hVar.f399292a, eGLSurface);
            az0.w2.f15998n = null;
        }
        az0.w2.f16002r = false;
        az0.w2.f16003s = az0.m2.f15687f;
    }
}

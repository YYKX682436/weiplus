package ro5;

/* loaded from: classes14.dex */
public final class h1 implements xo5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp5.g f479738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dp5.d f479739b;

    public h1(bp5.g gVar, dp5.d dVar) {
        this.f479738a = gVar;
        this.f479739b = dVar;
    }

    public boolean a() {
        android.opengl.EGLSurface eGLSurface = this.f479738a.f104997c;
        if (eGLSurface == null) {
            eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        }
        dp5.d dVar = this.f479739b;
        if (android.opengl.EGL14.eglMakeCurrent(dVar.f323813a, eGLSurface, eGLSurface, dVar.f323815c)) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.opengl.EGL14.eglGetCurrentContext(), dVar.f323815c)) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "Context binding verification failed");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "eglMakeCurrent failed: " + android.opengl.EGL14.eglGetError());
        return false;
    }

    public boolean b(java.lang.String tag) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        dp5.d dVar = this.f479739b;
        android.opengl.EGLDisplay eGLDisplay = dVar.f323813a;
        bp5.g gVar = this.f479738a;
        android.opengl.EGLSurface eGLSurface = gVar.f104997c;
        if (eGLSurface == null) {
            eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        }
        android.opengl.EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, java.lang.System.nanoTime());
        dp5.c cVar = dp5.c.f323811a;
        android.opengl.EGLSurface eGLSurface2 = gVar.f104997c;
        if (eGLSurface2 == null) {
            eGLSurface2 = android.opengl.EGL14.EGL_NO_SURFACE;
        }
        dp5.b bVar = (dp5.b) dp5.c.f323812b;
        bVar.getClass();
        android.opengl.EGLDisplay eGLDisplay2 = dVar.f323813a;
        if (eGLDisplay2 == null || eGLSurface2 == null) {
            z17 = false;
        } else {
            z17 = android.opengl.EGL14.eglSwapBuffers(eGLDisplay2, eGLSurface2);
            dp5.b.a(bVar, "eglSwapBuffers", null, 2, null);
        }
        if (z17) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "swapBufferWithCheck: " + tag + " error");
        return false;
    }
}

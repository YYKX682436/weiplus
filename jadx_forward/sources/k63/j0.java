package k63;

/* loaded from: classes14.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k63.m0 f386081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k63.m0 m0Var) {
        super(0);
        this.f386081d = m0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        k63.m0 m0Var = this.f386081d;
        if (m0Var.f386091i != 0 && m0Var.f386092m != 0) {
            java.lang.System.nanoTime();
            if (m0Var.f386093n != null) {
                android.opengl.EGLDisplay eGLDisplay = m0Var.c().f480825a;
                android.opengl.EGLSurface eGLSurface = m0Var.f386093n;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, m0Var.c().f480827c);
            }
            m0Var.f386090h.d(null);
            if (m0Var.f386093n != null) {
                android.opengl.EGL14.eglSwapBuffers(m0Var.c().f480825a, m0Var.f386093n);
            }
            if (java.lang.System.currentTimeMillis() - m0Var.f386095p >= 30) {
                m0Var.f386099t.run();
            }
            java.lang.System.nanoTime();
        }
        return jz5.f0.f384359a;
    }
}

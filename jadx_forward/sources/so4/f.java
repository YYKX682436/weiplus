package so4;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final so4.f f492308d = new so4.f();

    @Override // java.lang.Runnable
    public final void run() {
        rs0.h o17 = rs0.g.o(rs0.i.f480829a, null, 1, null);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o17.f480827c, android.opengl.EGL14.EGL_NO_CONTEXT)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocalEffectManager", "tryCreateX3DGlobalContext, create EGLContext failed");
            return;
        }
        so4.g.f492309a.h();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o17.f480826b, android.opengl.EGL14.EGL_NO_SURFACE)) {
            android.opengl.EGL14.eglDestroySurface(o17.f480825a, o17.f480826b);
        }
        android.opengl.EGL14.eglDestroyContext(o17.f480825a, o17.f480827c);
    }
}

package go0;

/* loaded from: classes14.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(go0.f0 f0Var) {
        super(0);
        this.f355337d = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        go0.f0 f0Var = this.f355337d;
        rs0.h hVar = f0Var.f355296i;
        android.opengl.EGLDisplay eGLDisplay = hVar != null ? hVar.f480825a : null;
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, hVar != null ? hVar.f480827c : null);
        android.opengl.EGLSurface eGLSurface2 = f0Var.f355298n;
        if (eGLSurface2 != null) {
            rs0.h hVar2 = f0Var.f355296i;
            if ((hVar2 != null ? hVar2.f480825a : null) != null) {
                android.opengl.EGL14.eglDestroySurface(hVar2 != null ? hVar2.f480825a : null, eGLSurface2);
                f0Var.f355298n = null;
                f0Var.f355299o = null;
            }
        }
        return jz5.f0.f384359a;
    }
}

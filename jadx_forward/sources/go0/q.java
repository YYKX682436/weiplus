package go0;

/* loaded from: classes14.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(go0.f0 f0Var) {
        super(0);
        this.f355349d = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.SurfaceTexture b17;
        go0.f0 f0Var = this.f355349d;
        ft0.d dVar = f0Var.f355297m;
        if (dVar != null && (b17 = dVar.b()) != null) {
            b17.updateTexImage();
        }
        java.lang.Object obj = f0Var.f355299o;
        if (obj != null) {
            if (f0Var.f355298n == null) {
                if ((obj instanceof android.view.Surface) && !((android.view.Surface) obj).isValid()) {
                    f0Var.f355298n = null;
                } else if (!(obj instanceof android.view.SurfaceHolder) || ((android.view.SurfaceHolder) obj).getSurface().isValid()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreRender", "makeOutputSurface");
                    rs0.g gVar = rs0.i.f480829a;
                    rs0.h hVar = f0Var.f355296i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
                    android.opengl.EGLSurface k17 = gVar.k(hVar.f480825a, obj);
                    f0Var.f355298n = k17;
                    rs0.h hVar2 = f0Var.f355296i;
                    android.opengl.EGL14.eglMakeCurrent(hVar2 != null ? hVar2.f480825a : null, k17, k17, hVar2 != null ? hVar2.f480827c : null);
                } else {
                    f0Var.f355298n = null;
                }
            }
            ft0.d dVar2 = f0Var.f355297m;
            if (dVar2 != null) {
                dVar2.d(null);
            }
            rs0.h hVar3 = f0Var.f355296i;
            if (hVar3 != null) {
                android.opengl.EGLDisplay eGLDisplay = hVar3.f480825a;
                android.opengl.EGLSurface eGLSurface = f0Var.f355298n;
                if (eGLSurface == null) {
                    eGLSurface = hVar3.f480826b;
                }
                android.opengl.EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
            }
        }
        return jz5.f0.f384359a;
    }
}

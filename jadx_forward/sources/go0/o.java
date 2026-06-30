package go0;

/* loaded from: classes14.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(go0.f0 f0Var) {
        super(0);
        this.f355340d = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        go0.f0 f0Var = this.f355340d;
        android.opengl.EGLSurface eGLSurface = f0Var.f355298n;
        if (eGLSurface != null) {
            rs0.h hVar = f0Var.f355296i;
            android.opengl.EGL14.eglDestroySurface(hVar != null ? hVar.f480825a : null, eGLSurface);
        }
        go0.f1 f1Var = f0Var.f355300p;
        if (f1Var != null) {
            f1Var.n(true);
        }
        ft0.d dVar = f0Var.f355297m;
        if (dVar != null) {
            ft0.d.h(dVar, false, false, 2, null);
        }
        rs0.h hVar2 = f0Var.f355296i;
        if (hVar2 != null) {
            rs0.i.f480829a.u(hVar2);
        }
        f0Var.f355295h.mo50302x6b17ad39(null);
        f0Var.f355294g.quitSafely();
        return jz5.f0.f384359a;
    }
}

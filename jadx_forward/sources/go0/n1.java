package go0;

/* loaded from: classes14.dex */
public final class n1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f355339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(go0.q1 q1Var) {
        super(0);
        this.f355339d = q1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        go0.q1 q1Var = this.f355339d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q1Var.f355355f, "unsetOutputSurface");
        q1Var.f355359m = null;
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        q1Var.f355362p = true;
        return jz5.f0.f384359a;
    }
}

package go0;

/* loaded from: classes14.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f355402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f355403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(go0.f0 f0Var, java.lang.Object obj, boolean z17) {
        super(0);
        this.f355401d = f0Var;
        this.f355402e = obj;
        this.f355403f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.opengl.EGLSurface eGLSurface;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setOutputSurface from ");
        go0.f0 f0Var = this.f355401d;
        java.lang.Object obj = f0Var.f355299o;
        sb6.append(obj != null ? obj.hashCode() : 0);
        sb6.append(" to ");
        java.lang.Object obj2 = this.f355402e;
        sb6.append(obj2 != null ? obj2.hashCode() : 0);
        sb6.append(",releaeOldSurface:");
        boolean z17 = this.f355403f;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreRender", sb6.toString());
        if (z17 && obj2 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, f0Var.f355299o) && (eGLSurface = f0Var.f355298n) != null) {
            rs0.h hVar = f0Var.f355296i;
            if ((hVar != null ? hVar.f480825a : null) != null) {
                android.opengl.EGL14.eglDestroySurface(hVar != null ? hVar.f480825a : null, eGLSurface);
                f0Var.f355298n = null;
                f0Var.f355299o = null;
            }
        }
        if (obj2 != null) {
            f0Var.f355298n = null;
            f0Var.f355299o = obj2;
        }
        return jz5.f0.f384359a;
    }
}

package k63;

/* loaded from: classes14.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k63.m0 f386073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f386074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(k63.m0 m0Var, android.view.Surface surface) {
        super(0);
        this.f386073d = m0Var;
        this.f386074e = surface;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.Surface surface = null;
        k63.m0 m0Var = this.f386073d;
        android.view.Surface surface2 = this.f386074e;
        if (surface2 != null) {
            k63.m0.a(m0Var);
            if (surface2.isValid()) {
                m0Var.f386093n = rs0.i.f480829a.k(m0Var.c().f480825a, surface2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameLiveRenderManager", "outputSurface is invalid, ignore!");
                m0Var.f386093n = null;
            }
            surface = surface2;
        } else {
            k63.m0.a(m0Var);
            m0Var.f386093n = null;
        }
        m0Var.f386097r = surface;
        return jz5.f0.f384359a;
    }
}

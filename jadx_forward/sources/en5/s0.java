package en5;

/* loaded from: classes14.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f337032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f337033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f337034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.g0 f337035g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c1.d0 f337036h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(fn5.n0 n0Var, n0.e5 e5Var, n0.v2 v2Var, g2.g0 g0Var, c1.d0 d0Var) {
        super(0);
        this.f337032d = n0Var;
        this.f337033e = e5Var;
        this.f337034f = v2Var;
        this.f337035g = g0Var;
        this.f337036h = d0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fn5.n0 n0Var = this.f337032d;
        n0Var.c7("");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((fn5.o0) this.f337033e.mo128745x754a37bb()).name(), "NO_START")) {
            n0Var.f346256f.mo523x53d8522f(fn5.o0.f346276d);
        }
        if (!((java.lang.Boolean) this.f337034f.mo128745x754a37bb()).booleanValue()) {
            g2.g0 g0Var = this.f337035g;
            if (g0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageQuerySearchBar", "input service is null");
            }
            if (g0Var != null && g0Var.f349235b.get() != null) {
                ((u26.o) ((g2.p0) g0Var.f349234a).f349274j).e(g2.h0.ShowKeyboard);
            }
            this.f337036h.a();
        }
        return jz5.f0.f384359a;
    }
}

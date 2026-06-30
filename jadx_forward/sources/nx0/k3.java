package nx0;

/* loaded from: classes5.dex */
public final class k3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.b3 f422685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.a3 f422686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f422687f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(nx0.b3 b3Var, nx0.a3 a3Var, int i17) {
        super(0);
        this.f422685d = b3Var;
        this.f422686e = a3Var;
        this.f422687f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nx0.b3 b3Var = this.f422685d;
        if (b3Var.f422612e) {
            b3Var.f422613f = true;
            nx0.a3 a3Var = this.f422686e;
            java.util.List list = a3Var.f422599d;
            int i17 = this.f422687f;
            ((nx0.b3) list.get(i17)).f422612e = false;
            a3Var.m8147xed6e4d18(i17);
        }
        return jz5.f0.f384359a;
    }
}

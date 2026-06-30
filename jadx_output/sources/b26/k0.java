package b26;

/* loaded from: classes16.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b26.s0 f17458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p16.h0 f17459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b26.c f17460f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(b26.s0 s0Var, p16.h0 h0Var, b26.c cVar) {
        super(0);
        this.f17458d = s0Var;
        this.f17459e = h0Var;
        this.f17460f = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b26.s0 s0Var = this.f17458d;
        b26.x0 a17 = s0Var.a(s0Var.f17513a.f17517c);
        java.util.List S0 = a17 != null ? kz5.n0.S0(s0Var.f17513a.f17515a.f17487e.b(a17, this.f17459e, this.f17460f)) : null;
        return S0 == null ? kz5.p0.f313996d : S0;
    }
}

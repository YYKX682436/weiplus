package b26;

/* loaded from: classes16.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b26.s0 f98991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p16.h0 f98992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b26.c f98993f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(b26.s0 s0Var, p16.h0 h0Var, b26.c cVar) {
        super(0);
        this.f98991d = s0Var;
        this.f98992e = h0Var;
        this.f98993f = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        b26.s0 s0Var = this.f98991d;
        b26.x0 a17 = s0Var.a(s0Var.f99046a.f99050c);
        java.util.List S0 = a17 != null ? kz5.n0.S0(s0Var.f99046a.f99048a.f99020e.b(a17, this.f98992e, this.f98993f)) : null;
        return S0 == null ? kz5.p0.f395529d : S0;
    }
}

package b26;

/* loaded from: classes16.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b26.s0 f99013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i16.u0 f99014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d26.n0 f99015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(b26.s0 s0Var, i16.u0 u0Var, d26.n0 n0Var) {
        super(0);
        this.f99013d = s0Var;
        this.f99014e = u0Var;
        this.f99015f = n0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        b26.s0 s0Var = this.f99013d;
        b26.x0 a17 = s0Var.a(s0Var.f99046a.f99050c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        b26.d dVar = s0Var.f99046a.f99048a.f99020e;
        f26.o0 mo132801x3df4e080 = this.f99015f.mo132801x3df4e080();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132801x3df4e080, "getReturnType(...)");
        return (t16.g) dVar.i(a17, this.f99014e, mo132801x3df4e080);
    }
}

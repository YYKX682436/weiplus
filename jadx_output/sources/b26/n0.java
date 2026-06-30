package b26;

/* loaded from: classes16.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b26.s0 f17472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i16.u0 f17473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d26.n0 f17474f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(b26.s0 s0Var, i16.u0 u0Var, d26.n0 n0Var) {
        super(0);
        this.f17472d = s0Var;
        this.f17473e = u0Var;
        this.f17474f = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b26.s0 s0Var = this.f17472d;
        b26.x0 a17 = s0Var.a(s0Var.f17513a.f17517c);
        kotlin.jvm.internal.o.d(a17);
        b26.d dVar = s0Var.f17513a.f17515a.f17487e;
        f26.o0 returnType = this.f17474f.getReturnType();
        kotlin.jvm.internal.o.f(returnType, "getReturnType(...)");
        return (t16.g) dVar.g(a17, this.f17473e, returnType);
    }
}

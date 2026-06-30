package b26;

/* loaded from: classes16.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b26.s0 f17463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f17464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i16.u0 f17465f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(b26.s0 s0Var, boolean z17, i16.u0 u0Var) {
        super(0);
        this.f17463d = s0Var;
        this.f17464e = z17;
        this.f17465f = u0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list;
        b26.s0 s0Var = this.f17463d;
        b26.x0 a17 = s0Var.a(s0Var.f17513a.f17517c);
        if (a17 != null) {
            b26.t tVar = s0Var.f17513a;
            boolean z17 = this.f17464e;
            i16.u0 u0Var = this.f17465f;
            list = z17 ? kz5.n0.S0(tVar.f17515a.f17487e.a(a17, u0Var)) : kz5.n0.S0(tVar.f17515a.f17487e.h(a17, u0Var));
        } else {
            list = null;
        }
        return list == null ? kz5.p0.f313996d : list;
    }
}

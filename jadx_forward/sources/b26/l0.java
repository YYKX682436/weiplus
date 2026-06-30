package b26;

/* loaded from: classes16.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b26.s0 f98996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f98997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i16.u0 f98998f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(b26.s0 s0Var, boolean z17, i16.u0 u0Var) {
        super(0);
        this.f98996d = s0Var;
        this.f98997e = z17;
        this.f98998f = u0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List list;
        b26.s0 s0Var = this.f98996d;
        b26.x0 a17 = s0Var.a(s0Var.f99046a.f99050c);
        if (a17 != null) {
            b26.t tVar = s0Var.f99046a;
            boolean z17 = this.f98997e;
            i16.u0 u0Var = this.f98998f;
            list = z17 ? kz5.n0.S0(tVar.f99048a.f99020e.a(a17, u0Var)) : kz5.n0.S0(tVar.f99048a.f99020e.h(a17, u0Var));
        } else {
            list = null;
        }
        return list == null ? kz5.p0.f395529d : list;
    }
}

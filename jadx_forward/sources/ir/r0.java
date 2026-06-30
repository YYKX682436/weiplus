package ir;

/* loaded from: classes15.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir.t0 f375429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir.k0 f375430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 f375431f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ir.t0 t0Var, ir.k0 k0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 c0Var) {
        super(0);
        this.f375429d = t0Var;
        this.f375430e = k0Var;
        this.f375431f = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ir.t0 t0Var = this.f375429d;
        ir.o0 o0Var = t0Var.f375436c;
        if (o0Var != null) {
            o0Var.b(this.f375430e);
        }
        this.f375431f.a(new ir.q0(t0Var));
        t0Var.f375435b = false;
        if (t0Var.f375434a) {
            t0Var.f375434a = false;
            t0Var.e();
        }
        return jz5.f0.f384359a;
    }
}

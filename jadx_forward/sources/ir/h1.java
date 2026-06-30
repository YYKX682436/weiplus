package ir;

/* loaded from: classes15.dex */
public final class h1 extends ir.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.v f375396d;

    /* renamed from: e, reason: collision with root package name */
    public ir.f1 f375397e;

    public h1(ir.v introInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(introInfo, "introInfo");
        this.f375396d = introInfo;
        this.f375397e = new ir.f1(introInfo);
    }

    @Override // ir.t0
    public ir.k0 a() {
        return new ir.f1(this.f375396d);
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f375397e;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        ir.f1 f1Var = (ir.f1) k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f1Var, "<set-?>");
        this.f375397e = f1Var;
    }
}

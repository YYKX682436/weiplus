package ir;

/* loaded from: classes15.dex */
public final class g1 extends ir.t0 {

    /* renamed from: d, reason: collision with root package name */
    public ir.t f375373d;

    /* renamed from: e, reason: collision with root package name */
    public ir.d1 f375374e;

    public g1(ir.t groupInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupInfo, "groupInfo");
        this.f375373d = groupInfo;
        this.f375374e = new ir.d1(this.f375373d, true);
    }

    @Override // ir.t0
    public ir.k0 a() {
        return new ir.d1(this.f375373d, false);
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f375374e;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        ir.d1 d1Var = (ir.d1) k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d1Var, "<set-?>");
        this.f375374e = d1Var;
    }
}

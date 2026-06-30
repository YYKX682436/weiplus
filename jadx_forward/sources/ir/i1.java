package ir;

/* loaded from: classes15.dex */
public final class i1 extends ir.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.u f375403d;

    /* renamed from: e, reason: collision with root package name */
    public ir.e1 f375404e;

    public i1(ir.u setInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setInfo, "setInfo");
        this.f375403d = setInfo;
        this.f375404e = new ir.e1(setInfo, true);
    }

    @Override // ir.t0
    public ir.k0 a() {
        return new ir.e1(this.f375403d, false);
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f375404e;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        ir.e1 e1Var = (ir.e1) k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e1Var, "<set-?>");
        this.f375404e = e1Var;
    }
}

package ir;

/* loaded from: classes15.dex */
public final class c1 extends ir.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.h f375355d;

    /* renamed from: e, reason: collision with root package name */
    public ir.b1 f375356e;

    public c1(ir.h config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f375355d = config;
        this.f375356e = new ir.b1(config.f375393s);
    }

    @Override // ir.t0
    public ir.k0 a() {
        return new ir.b1(this.f375355d.f375393s);
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f375356e;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        ir.b1 b1Var = (ir.b1) k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b1Var, "<set-?>");
        this.f375356e = b1Var;
    }
}

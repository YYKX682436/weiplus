package ir;

/* loaded from: classes15.dex */
public final class d extends ir.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.h f375357d;

    /* renamed from: e, reason: collision with root package name */
    public ir.c f375358e;

    public d(ir.h config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f375357d = config;
        this.f375358e = new ir.c(config.f375382h);
    }

    @Override // ir.t0
    public ir.k0 a() {
        return new ir.c(this.f375357d.f375382h);
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f375358e;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        ir.c cVar = (ir.c) k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<set-?>");
        this.f375358e = cVar;
    }
}

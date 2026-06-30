package ir;

/* loaded from: classes15.dex */
public final class f extends ir.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.h f375367d;

    /* renamed from: e, reason: collision with root package name */
    public ir.e f375368e;

    public f(ir.h config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f375367d = config;
        this.f375368e = new ir.e(config.f375380f, config.f375379e);
    }

    @Override // ir.t0
    public ir.k0 a() {
        ir.h hVar = this.f375367d;
        return new ir.e(hVar.f375380f, hVar.f375379e);
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f375368e;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        ir.e eVar = (ir.e) k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<set-?>");
        this.f375368e = eVar;
    }
}

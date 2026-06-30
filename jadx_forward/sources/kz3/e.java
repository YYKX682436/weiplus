package kz3;

/* loaded from: classes15.dex */
public final class e implements uy3.u {

    /* renamed from: d, reason: collision with root package name */
    public final kz3.l f395407d;

    /* renamed from: e, reason: collision with root package name */
    public final kz3.p f395408e;

    public e(kz3.l helper, kz3.p impl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(impl, "impl");
        this.f395407d = helper;
        this.f395408e = impl;
    }

    @Override // uy3.u
    public void a(int i17, float f17, float f18) {
        this.f395408e.a(i17, f17, f18);
    }

    @Override // uy3.u
    public void b() {
        this.f395408e.b();
    }

    @Override // uy3.u
    public void c() {
        this.f395408e.c();
    }

    @Override // uy3.u
    public void d(int i17, float f17, float f18) {
        this.f395408e.d(i17, f17, f18);
    }

    @Override // uy3.u
    public void e() {
        this.f395408e.e();
        sy3.a aVar = this.f395407d.f395421f;
        if (aVar != null) {
            aVar.mo144664x6761d4f();
        }
    }

    @Override // uy3.u
    public void f() {
        this.f395408e.f();
        sy3.a aVar = this.f395407d.f395421f;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // uy3.u
    public void h() {
        this.f395408e.h();
    }
}

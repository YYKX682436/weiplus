package qh;

/* loaded from: classes12.dex */
public final class a extends qh.b {

    /* renamed from: p, reason: collision with root package name */
    public final qh.f0 f444814p;

    public a(qh.f0 f0Var) {
        this.f444814p = f0Var;
    }

    @Override // qh.b
    public int c() {
        qh.f0 f0Var = this.f444814p;
        return wh.m.d(f0Var.d(), f0Var.f444876o);
    }

    @Override // qh.b
    public int d() {
        return wh.m.r(this.f444814p.d());
    }

    @Override // qh.b
    public long e() {
        return 0L;
    }

    @Override // qh.b
    public boolean f() {
        return wh.m.v(this.f444814p.d());
    }

    @Override // qh.b
    public boolean g() {
        return wh.m.w(this.f444814p.d());
    }

    @Override // qh.b
    public boolean h() {
        return this.f444814p.f444876o;
    }
}

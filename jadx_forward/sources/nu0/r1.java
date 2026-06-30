package nu0;

/* loaded from: classes5.dex */
public final class r1 implements hx0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421619a;

    public r1(nu0.b4 b4Var) {
        this.f421619a = b4Var;
    }

    @Override // hx0.b
    public void a() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f421619a.f421414q;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // hx0.b
    public boolean b() {
        if (this.f421619a.f421411o != nu0.c1.f421433m) {
            return false;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f421619a.f421414q;
        return r2Var != null && r2Var.a();
    }
}

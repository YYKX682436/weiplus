package gx0;

/* loaded from: classes5.dex */
public final class s5 implements hx0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358476a;

    public s5(gx0.w8 w8Var) {
        this.f358476a = w8Var;
    }

    @Override // hx0.b
    public void a() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f358476a.f358650t;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // hx0.b
    public boolean b() {
        if (this.f358476a.f358648r != gx0.y4.f358739m) {
            return false;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f358476a.f358650t;
        return r2Var != null && r2Var.a();
    }
}

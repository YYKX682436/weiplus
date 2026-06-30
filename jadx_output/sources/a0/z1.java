package a0;

/* loaded from: classes14.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.r2 f347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2.f f348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f350g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f351h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f352i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f354n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f355o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a0.r2 r2Var, p2.f fVar, n0.e5 e5Var, n0.e5 e5Var2, n0.e5 e5Var3, n0.v2 v2Var, n0.e5 e5Var4, kotlin.jvm.internal.g0 g0Var, n0.e5 e5Var5) {
        super(0);
        this.f347d = r2Var;
        this.f348e = fVar;
        this.f349f = e5Var;
        this.f350g = e5Var2;
        this.f351h = e5Var3;
        this.f352i = v2Var;
        this.f353m = e5Var4;
        this.f354n = g0Var;
        this.f355o = e5Var5;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean booleanValue = ((java.lang.Boolean) this.f349f.getValue()).booleanValue();
        a0.r2 r2Var = this.f347d;
        if (booleanValue) {
            long j17 = ((d1.e) this.f350g.getValue()).f225627a;
            yz5.l lVar = (yz5.l) this.f351h.getValue();
            p2.f fVar = this.f348e;
            long j18 = ((d1.e) lVar.invoke(fVar)).f225627a;
            r2Var.a(j17, d1.f.c(j18) ? d1.e.f(((d1.e) this.f352i.getValue()).f225627a, j18) : d1.e.f225625d, ((java.lang.Number) this.f353m.getValue()).floatValue());
            android.widget.Magnifier magnifier = ((a0.t2) r2Var).f298a;
            long a17 = p2.r.a(magnifier.getWidth(), magnifier.getHeight());
            kotlin.jvm.internal.g0 g0Var = this.f354n;
            if (!p2.q.a(a17, g0Var.f310121d)) {
                g0Var.f310121d = a17;
                yz5.l lVar2 = (yz5.l) this.f355o.getValue();
                if (lVar2 != null) {
                    lVar2.invoke(new p2.k(fVar.e(p2.r.b(a17))));
                }
            }
        } else {
            ((a0.t2) r2Var).f298a.dismiss();
        }
        return jz5.f0.f302826a;
    }
}

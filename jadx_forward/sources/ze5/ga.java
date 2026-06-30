package ze5;

/* loaded from: classes9.dex */
public class ga extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f553488b;

    public ga(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        this.f553487a = f9Var;
        this.f553488b = z17;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(this.f553487a.Q0())) {
            return;
        }
        boolean z18 = this.f553488b;
        long I0 = this.f553487a.I0();
        java.lang.String Q0 = this.f553487a.Q0();
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553487a;
        ((k90.b) u0Var).rj(f9Var, bm5.f0.f104104s, f9Var.z0(), false);
        el0.f fVar = el0.i.f335259g;
        if (fVar != null) {
            wl0.j jVar = (wl0.j) fVar;
            ((ku5.t0) ku5.t0.f394148d).r(new wl0.i(jVar, I0, z18, Q0), "KaraEvent");
        }
    }
}

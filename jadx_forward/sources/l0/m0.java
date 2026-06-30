package l0;

/* loaded from: classes14.dex */
public final class m0 implements m0.y {

    /* renamed from: a, reason: collision with root package name */
    public static final l0.m0 f395911a = new l0.m0();

    @Override // m0.y
    public m0.j a(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-1419762518);
        m0.j jVar = ((l0.i) y0Var.i(l0.k.f395847a)).l() ? ((double) e1.a0.g(((e1.y) y0Var.i(l0.p.f395949a)).f327855a)) > 0.5d ? m0.a0.f403959b : m0.a0.f403960c : m0.a0.f403961d;
        y0Var.o(false);
        return jVar;
    }

    @Override // m0.y
    public long b(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(550536719);
        long j17 = ((e1.y) y0Var.i(l0.p.f395949a)).f327855a;
        boolean l17 = ((l0.i) y0Var.i(l0.k.f395847a)).l();
        float g17 = e1.a0.g(j17);
        if (!l17 && g17 < 0.5d) {
            int i18 = e1.y.f327854l;
            j17 = e1.y.f327848f;
        }
        y0Var.o(false);
        return j17;
    }
}

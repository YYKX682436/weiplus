package r01;

/* loaded from: classes4.dex */
public abstract class e3 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.f f449590d;

    public e3(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        this.f449590d = fVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f449590d;
        if (m1Var == null || !(m1Var instanceof r01.f3)) {
            return;
        }
        try {
            fVar.mo11468x92b714fd(((r45.xm) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a).f471754e.f273689a);
        } catch (java.lang.Throwable unused) {
        }
        r01.v1 v1Var = (r01.v1) this;
        r45.c67 c67Var = (r45.c67) fVar;
        if (c67Var.f452872d != null) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("brandService", 1, null).H(r01.w1.a(v1Var.f449797e, 2, null), c67Var.f452872d.mo14344x5f01b1f6());
            } catch (java.lang.Throwable unused2) {
            }
        }
    }
}

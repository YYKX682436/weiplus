package ik3;

/* loaded from: classes8.dex */
public final class g implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik3.q f373426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.a40 f373427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f373428c;

    public g(ik3.q qVar, bw5.a40 a40Var, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        this.f373426a = qVar;
        this.f373427b = a40Var;
        this.f373428c = c16601x7ed0e40c;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.a
    /* renamed from: complete */
    public final void mo116804xdc453139(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAffFsc", "checkAndMove deleteByIdAndTypeAsync result: " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f373428c;
        bw5.a40 a40Var = this.f373427b;
        ik3.q qVar = this.f373426a;
        if (z17) {
            qVar.getClass();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.d.f299039b.f(a40Var, new ik3.k(true, true, c16601x7ed0e40c, qVar));
        } else {
            qVar.getClass();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.d.f299039b.f(a40Var, new ik3.k(false, true, c16601x7ed0e40c, qVar));
        }
    }
}

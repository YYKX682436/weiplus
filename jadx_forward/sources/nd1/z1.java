package nd1;

/* loaded from: classes7.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nd1.a2 f417963f;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, nd1.a2 a2Var) {
        this.f417961d = yVar;
        this.f417962e = i17;
        this.f417963f = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417961d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) yVar : yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) yVar).V0() : null;
        nd1.a2 a2Var = this.f417963f;
        int i17 = this.f417962e;
        if (V0 == null) {
            yVar.a(i17, a2Var.o("fail:page don't exist"));
        } else {
            V0.k3();
            yVar.a(i17, a2Var.o("ok"));
        }
    }
}

package nd1;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nd1.h f417835f;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, nd1.h hVar) {
        this.f417833d = yVar;
        this.f417834e = i17;
        this.f417835f = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417833d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) yVar : yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) yVar).V0() : null;
        nd1.h hVar = this.f417835f;
        int i17 = this.f417834e;
        if (V0 == null) {
            yVar.a(i17, hVar.o("fail:page don't exist"));
        } else {
            V0.e2();
            yVar.a(i17, hVar.o("ok"));
        }
    }
}

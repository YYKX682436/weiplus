package nd1;

/* loaded from: classes7.dex */
public abstract class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class f417827g;

    public e0(java.lang.Class cls) {
        this.f417827g = cls;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        nd1.d0 d0Var = new nd1.d0(this, yVar, i17, jSONObject);
        if ((yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) || !yVar.t3().Q1()) {
            d0Var.run();
        } else {
            yVar.t3().I1(d0Var);
        }
    }

    public abstract void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, org.json.JSONObject jSONObject, int i17, java.lang.Object obj);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}

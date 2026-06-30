package tj1;

/* loaded from: classes7.dex */
public final class w extends tj1.u {

    /* renamed from: i, reason: collision with root package name */
    public tj1.i f501254i;

    @Override // tj1.u, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: C */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        super.A(e9Var, jSONObject, i17);
        if (this.f501254i != null || e9Var == null) {
            return;
        }
        tj1.i iVar = new tj1.i();
        this.f501254i = iVar;
        p000.u uVar = iVar.f501229a;
        if (uVar != null) {
            p000.C0000xf9d93516.f81566d.b(uVar);
        }
        tj1.h hVar = new tj1.h(e9Var);
        iVar.f501229a = hVar;
        p000.C0000xf9d93516.f81566d.a(hVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = e9Var.t3();
        if (t37 != null) {
            t37.f156327J.add(new tj1.v(this));
        }
    }
}

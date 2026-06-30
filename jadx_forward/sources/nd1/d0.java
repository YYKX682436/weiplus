package nd1;

/* loaded from: classes7.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f417817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nd1.e0 f417818g;

    public d0(nd1.e0 e0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, org.json.JSONObject jSONObject) {
        this.f417818g = e0Var;
        this.f417815d = yVar;
        this.f417816e = i17;
        this.f417817f = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417815d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(yVar);
        int i17 = this.f417816e;
        nd1.e0 e0Var = this.f417818g;
        if (a17 == null) {
            yVar.a(i17, e0Var.o("fail:page don't exist"));
            return;
        }
        java.lang.Object B1 = a17.B1(e0Var.f417827g);
        if (B1 != null) {
            e0Var.C(yVar, this.f417817f, i17, B1);
        } else if (!a17.mo50262x39e05d35()) {
            yVar.a(i17, e0Var.o("fail:interrupted"));
        } else {
            if (a17.a0()) {
                throw new java.lang.IllegalAccessError(java.lang.String.format("%s Not Found", e0Var.f417827g.getName()));
            }
            yVar.a(i17, e0Var.o("fail:not supported"));
        }
    }
}

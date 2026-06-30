package nd1;

/* loaded from: classes7.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f417819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f417821f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nd1.e2 f417822g;

    public d2(nd1.e2 e2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f417822g = e2Var;
        this.f417819d = e9Var;
        this.f417820e = i17;
        this.f417821f = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f417819d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = e9Var.t3().x0().m52169xfdaa7672();
        boolean z17 = m52169xfdaa7672 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1;
        nd1.e2 e2Var = this.f417822g;
        int i17 = this.f417820e;
        if (!z17) {
            e9Var.a(i17, e2Var.o("fail:not TabBar page"));
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1) m52169xfdaa7672).m52251x308dc334().i(this.f417821f.optBoolean("animation", true));
            e9Var.a(i17, e2Var.o("ok"));
        }
    }
}

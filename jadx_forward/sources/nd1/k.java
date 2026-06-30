package nd1;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f417852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f417854f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nd1.l f417855g;

    public k(nd1.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f417855g = lVar;
        this.f417852d = e9Var;
        this.f417853e = i17;
        this.f417854f = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f417852d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = e9Var.t3().x0().m52169xfdaa7672();
        boolean z17 = m52169xfdaa7672 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1;
        nd1.l lVar = this.f417855g;
        int i17 = this.f417853e;
        if (!z17) {
            e9Var.a(i17, lVar.o("fail:not TabBar page"));
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1) m52169xfdaa7672).m52251x308dc334().d(this.f417854f.optBoolean("animation", true));
            e9Var.a(i17, lVar.o("ok"));
        }
    }
}

package vf1;

/* loaded from: classes7.dex */
public class d implements tb1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f517848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vf1.g f517849b;

    public d(vf1.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f517849b = gVar;
        this.f517848a = tVar;
    }

    @Override // tb1.z
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertXWebCamera", "onRelease");
        vf1.g gVar = this.f517849b;
        mi1.w0 w0Var = gVar.f517855h;
        if (w0Var != null) {
            w0Var.mo147359x63a3b28a();
            gVar.f517855h = null;
        }
    }

    @Override // tb1.z
    /* renamed from: onInit */
    public void mo166108xc39adf8f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertXWebCamera", "onInit");
        vf1.g gVar = this.f517849b;
        if (gVar.f517855h == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f517848a;
            if (tVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
                gVar.f517855h = mi1.c.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) tVar).mo32091x9a3f0ba2()).h(mi1.d.CAMERA);
            }
        }
    }
}

package uc1;

/* loaded from: classes13.dex */
public class o0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f507871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f507872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f507873f;

    public o0(uc1.i1 i1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f507871d = tVar;
        this.f507872e = str;
        this.f507873f = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w
    /* renamed from: onDestroy */
    public void mo32094xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertMap", "onDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f507871d;
        tVar.K(this);
        vc1.h3.a(this.f507872e, vc1.e3.b(tVar, this.f507873f));
    }
}

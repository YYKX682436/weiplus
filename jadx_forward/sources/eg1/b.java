package eg1;

/* loaded from: classes13.dex */
public class b implements vc1.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f334036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f334037b;

    public b(eg1.m mVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f334036a = i17;
        this.f334037b = lVar;
    }

    @Override // vc1.w2
    public void a(java.lang.String str, vc1.y1 y1Var) {
        uc1.g1 g1Var = new uc1.g1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f334036a);
            jSONObject.put("polylineId", str);
            jSONObject.put("longitude", y1Var.f516757b);
            jSONObject.put("latitude", y1Var.f516756a);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        g1Var.f163907f = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f334037b;
        lVar.i(g1Var, null);
        if (!(lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5)) {
            lVar.p(g1Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertXWebMap", "OnMapPolylineClickJsEvent:%s", jSONObject.toString());
    }
}

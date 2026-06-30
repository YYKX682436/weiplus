package uc1;

/* loaded from: classes13.dex */
public class l0 implements vc1.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f507863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f507864b;

    public l0(uc1.i1 i1Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f507863a = i17;
        this.f507864b = tVar;
    }

    @Override // vc1.v2
    public void a(java.util.ArrayList arrayList) {
        uc1.e1 e1Var = new uc1.e1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) arrayList);
        try {
            jSONObject.put("mapId", this.f507863a);
            jSONObject.put("show", jSONArray);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        e1Var.f163907f = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f507864b;
        tVar.i(e1Var, null);
        tVar.p(e1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertMap", "onShow:%s", jSONObject.toString());
    }

    @Override // vc1.v2
    public void b(java.util.ArrayList arrayList) {
        uc1.e1 e1Var = new uc1.e1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) arrayList);
        try {
            jSONObject.put("mapId", this.f507863a);
            jSONObject.put("hide", jSONArray);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        e1Var.f163907f = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f507864b;
        tVar.i(e1Var, null);
        tVar.p(e1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertMap", "onHide:%s", jSONObject.toString());
    }
}

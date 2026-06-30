package uc1;

/* loaded from: classes13.dex */
public class j0 implements vc1.k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f507848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f507849b;

    public j0(uc1.i1 i1Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f507848a = i17;
        this.f507849b = tVar;
    }

    @Override // vc1.k2
    /* renamed from: onAuthFail */
    public void mo127680xfa7237e5(int i17, java.lang.String str) {
        uc1.x0 x0Var = new uc1.x0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f507848a);
            jSONObject.put("errCode", i17);
            jSONObject.put("errMsg", str);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        x0Var.f163907f = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f507849b;
        tVar.i(x0Var, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertMap", "OnMapAuthFailJsEvent:%s", jSONObject.toString());
        tVar.p(x0Var);
    }

    @Override // vc1.k2
    /* renamed from: onAuthSuccess */
    public void mo127681x833155dc() {
        uc1.v0 v0Var = new uc1.v0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f507848a);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        v0Var.f163907f = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f507849b;
        tVar.i(v0Var, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertMap", "OnAuthSuccessJsEvent:%s", jSONObject.toString());
        tVar.p(v0Var);
    }
}

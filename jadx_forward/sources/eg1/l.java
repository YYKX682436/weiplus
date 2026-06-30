package eg1;

/* loaded from: classes13.dex */
public class l implements vc1.k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f334061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f334062b;

    public l(eg1.m mVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f334061a = i17;
        this.f334062b = lVar;
    }

    @Override // vc1.k2
    /* renamed from: onAuthFail */
    public void mo127680xfa7237e5(int i17, java.lang.String str) {
        uc1.x0 x0Var = new uc1.x0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f334061a);
            jSONObject.put("errCode", i17);
            jSONObject.put("errMsg", str);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        x0Var.f163907f = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f334062b;
        lVar.i(x0Var, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertXWebMap", "OnMapAuthFailJsEvent:%s", jSONObject.toString());
        if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
            return;
        }
        lVar.p(x0Var);
    }

    @Override // vc1.k2
    /* renamed from: onAuthSuccess */
    public void mo127681x833155dc() {
        uc1.v0 v0Var = new uc1.v0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f334061a);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        v0Var.f163907f = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f334062b;
        lVar.i(v0Var, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertXWebMap", "OnAuthSuccessJsEvent:%s", jSONObject.toString());
        if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
            return;
        }
        lVar.p(v0Var);
    }
}

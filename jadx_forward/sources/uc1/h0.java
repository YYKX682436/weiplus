package uc1;

/* loaded from: classes13.dex */
public class h0 implements vc1.t2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f507844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f507845b;

    public h0(uc1.i1 i1Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f507844a = i17;
        this.f507845b = tVar;
    }

    @Override // vc1.t2
    public void a(vc1.v1 v1Var) {
        uc1.a1 a1Var = new uc1.a1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f507844a);
            if (v1Var != null) {
                jSONObject.put("buildingId", v1Var.f516719a);
                jSONObject.put("buildingName", v1Var.f516720b);
                java.util.List list = v1Var.f516721c;
                if (list != null && list.size() > 0) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    for (vc1.w1 w1Var : v1Var.f516721c) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, w1Var.f516725a);
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("floorList", jSONArray);
                }
                jSONObject.put("floorIndex", v1Var.f516722d);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        a1Var.f163907f = jSONObject.toString();
        this.f507845b.i(a1Var, null);
        jSONObject.toString();
    }
}

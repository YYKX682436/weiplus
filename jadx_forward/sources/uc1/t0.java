package uc1;

/* loaded from: classes13.dex */
public class t0 implements vc1.u2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f507884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f507885b;

    public t0(uc1.i1 i1Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f507884a = i17;
        this.f507885b = tVar;
    }

    @Override // vc1.u2
    public void a(vc1.m2 m2Var) {
        uc1.f1 f1Var = new uc1.f1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f507884a);
            jSONObject.put("latitude", m2Var.f516545a);
            jSONObject.put("longitude", m2Var.f516546b);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, m2Var.f516547c);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m2Var.f516548d)) {
                jSONObject.put("buildingId", m2Var.f516548d);
                jSONObject.put("floorName", m2Var.f516549e);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        f1Var.f163907f = jSONObject.toString();
        this.f507885b.i(f1Var, null);
        jSONObject.toString();
    }
}

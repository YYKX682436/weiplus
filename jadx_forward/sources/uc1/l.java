package uc1;

/* loaded from: classes13.dex */
public class l implements vc1.i2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f507861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f507862b;

    public l(uc1.m mVar, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f507861a = jSONObject;
        this.f507862b = lVar;
    }

    @Override // vc1.i2
    public void a(org.json.JSONArray jSONArray) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 f0Var = new uc1.f0();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("clusters", jSONArray);
        org.json.JSONObject jSONObject = this.f507861a;
        hashMap.put("mapId", java.lang.Integer.valueOf(vc1.e3.c(jSONObject)));
        f0Var.t(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.JsApiAddMapMarkers", "create clusterInfo:%s", jSONArray);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f507862b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t Q = ((gb1.k) lVar.q(gb1.k.class)).Q(lVar, jSONObject);
        if (Q != null) {
            Q.i(f0Var, null);
        } else {
            lVar.p(f0Var);
        }
    }

    @Override // vc1.i2
    public void b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 e0Var = new uc1.e0();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cluster", jSONObject);
        org.json.JSONObject jSONObject2 = this.f507861a;
        hashMap.put("mapId", java.lang.Integer.valueOf(vc1.e3.c(jSONObject2)));
        e0Var.t(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.JsApiAddMapMarkers", "click clusterInfo:%s", jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f507862b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t Q = ((gb1.k) lVar.q(gb1.k.class)).Q(lVar, jSONObject2);
        if (Q != null) {
            Q.i(e0Var, null);
        } else {
            lVar.p(e0Var);
        }
    }
}

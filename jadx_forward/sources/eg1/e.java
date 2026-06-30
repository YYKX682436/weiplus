package eg1;

/* loaded from: classes13.dex */
public class e implements vc1.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f334042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f334043b;

    public e(eg1.m mVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f334042a = i17;
        this.f334043b = lVar;
    }

    @Override // vc1.h2
    public boolean a(vc1.n2 n2Var) {
        uc1.d1 d1Var = new uc1.d1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f334042a);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, n2Var.f516557a);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        d1Var.f163907f = jSONObject.toString();
        this.f334043b.i(d1Var, null);
        return true;
    }
}

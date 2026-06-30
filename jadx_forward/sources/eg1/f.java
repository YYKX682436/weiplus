package eg1;

/* loaded from: classes13.dex */
public class f implements vc1.e2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f334044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f334045b;

    public f(eg1.m mVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f334044a = i17;
        this.f334045b = lVar;
    }

    @Override // vc1.e2
    public void a(double d17, double d18) {
        uc1.z0 z0Var = new uc1.z0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f334044a);
            jSONObject.put("longitude", d17);
            jSONObject.put("latitude", d18);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        z0Var.f163907f = jSONObject.toString();
        this.f334045b.i(z0Var, null);
    }
}

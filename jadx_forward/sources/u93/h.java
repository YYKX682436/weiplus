package u93;

/* loaded from: classes.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("param is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String optString2 = jSONObject.optString("promotionId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGameDetail", "JsApiOpenGameDetail appId:%s, promotionId:%s", optString, optString2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).fj(c(), str, "", "liteapp", optString, optString2, new u93.g(this));
    }
}

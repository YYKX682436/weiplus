package t93;

/* loaded from: classes.dex */
public class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("extInfo", new org.json.JSONObject(jSONObject.optString("extInfo")));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.E(c(), jSONObject2.toString(), null);
            this.f224976f.d(false);
        } catch (org.json.JSONException unused) {
            this.f224976f.a("fail");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}

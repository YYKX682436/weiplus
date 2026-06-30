package t93;

/* loaded from: classes.dex */
public class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("action", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.h0.f34297x24728b);
            jSONObject3.put("feedID", jSONObject.optString("feedID"));
            jSONObject3.put("finderUserName", jSONObject.optString(dm.i4.f66875xa013b0d5));
            jSONObject3.put("commentScene", jSONObject.optInt("commentScene"));
            jSONObject3.put("reportExtraInfo", jSONObject.optString("reportExtraInfo"));
            jSONObject2.put("extInfo", jSONObject3);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.F(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, jSONObject2.toString(), null, null);
            this.f224976f.d(false);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiOpenFinderProfile", e17, "", new java.lang.Object[0]);
            this.f224976f.a("fail");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}

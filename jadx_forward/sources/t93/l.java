package t93;

/* loaded from: classes.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811));
            jSONObject2.put("tipsWording", jSONObject.optJSONObject("tipsWording"));
            try {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).qj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, null, jSONObject2.toString(), false, new t93.k(this));
            } catch (java.lang.Exception e17) {
                this.f224976f.a("fail");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiOpenFinderCreateAcctView", e17, "", new java.lang.Object[0]);
            }
        } catch (org.json.JSONException e18) {
            this.f224976f.a("fail");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiOpenFinderCreateAcctView", e18, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}

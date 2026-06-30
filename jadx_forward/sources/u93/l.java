package u93;

/* loaded from: classes.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiStartGameLifeConversation", "Invoke startGameLifeConversation");
        if (jSONObject == null) {
            this.f224976f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("fromUserName");
        java.lang.String optString2 = jSONObject.optString("toUserName");
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        java.lang.String optString3 = jSONObject.optString("ext_info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiStartGameLifeConversation", "fromUserName:[%s] toUserName:[%s], scene:[%d], extInfo:[%s]", optString, optString2, java.lang.Integer.valueOf(optInt), optString3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            this.f224976f.a("invalid_params");
            return;
        }
        ((t53.m0) ((t53.k) i95.n0.c(t53.k.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optString, optString2, optInt, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3) ? null : new com.p314xaae8f345.mm.p2495xc50a8b8b.g(optString3.getBytes()), null);
        this.f224976f.d(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}

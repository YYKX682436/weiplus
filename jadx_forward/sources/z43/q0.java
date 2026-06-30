package z43;

/* loaded from: classes8.dex */
public class q0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (!jSONObject.has("url")) {
            this.f224976f.a("url is null");
            return;
        }
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991 c5756xf590b991 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991();
            am.nl nlVar = c5756xf590b991.f136075g;
            nlVar.f88966a = 2;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", jSONObject.getString("url"));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            intent.putExtra("nextAnimIn", ra3.h0.a(jSONObject));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            intent.putExtra("currentAnimOut", ra3.h0.b(jSONObject));
            nlVar.f88967b = c();
            if (jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96)) {
                intent.putExtra("game_liteapp_pass_data", jSONObject.getJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96).toString());
            }
            intent.putExtra("shouldCheckLimitedMode", java.lang.Boolean.valueOf(jSONObject.optBoolean("shouldCheckLimitedMode", true)));
            nlVar.f88968c = intent;
            c5756xf590b991.e();
            this.f224976f.d(false);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiStartGameWebview", e17, "get url", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}

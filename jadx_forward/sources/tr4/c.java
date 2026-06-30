package tr4;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f502968d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f502969e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f502970f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f502971g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f502972h;

    public c(java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        m83030x824a7eb4(c19760x34448d56, hashMap, hashMap2);
        gm0.j1.i();
        kk.v vVar = new kk.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(9, null), 0));
        this.f502972h = str;
        hashMap.put("import_code", str);
        hashMap.put("qqid", "" + vVar.m143587x9616526c());
        m83032xb4c13117(hashMap);
        m83033x7c1e2016(hashMap2);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 37;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        this.f502968d = new java.util.ArrayList();
        try {
            "1".equals(jSONObject.optString("is_reg", "0"));
            this.f502969e = jSONObject.optString("token", "");
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("Array");
            int length = jSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c17 = at4.i.a().c(jSONObject2);
                if (c17 != null) {
                    if (2 == jSONObject2.optInt("bank_acc_type", 2)) {
                        int i19 = c17.f69227x1d45800f;
                        l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c.A3;
                        c17.f69227x1d45800f = i19 | 2;
                    }
                    c17.f69222x587fd4e1 = jSONObject2.optString("bank_tail");
                    c17.J2 = "************" + c17.f69222x587fd4e1;
                    c17.f69262x8bacf6de = jSONObject2.optString("true_name");
                    c17.I2 = jSONObject2.optString("cre_id");
                    c17.X2 = jSONObject2.optInt("cre_type", -1);
                    c17.Y2 = this.f502972h;
                    c17.Z2 = 1 == jSONObject2.optInt("samecardexist", 0);
                    if (c17.v0()) {
                        c17.f69233x225aa2b6 = c17.f69217xaef0808c;
                    } else if (c17.w0()) {
                        c17.f69233x225aa2b6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkj, c17.f69217xaef0808c, c17.f69222x587fd4e1);
                    } else if (c17.F0()) {
                        c17.f69233x225aa2b6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l28, c17.f69217xaef0808c, c17.f69222x587fd4e1);
                    } else {
                        c17.f69233x225aa2b6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kl9, c17.f69217xaef0808c, c17.f69222x587fd4e1);
                    }
                    org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("bankappservice");
                    if (optJSONObject != null) {
                        this.f502970f = optJSONObject.optString(dm.i4.f66875xa013b0d5);
                        this.f502971g = optJSONObject.optString("app_recommend_desc");
                    }
                    this.f502968d.add(c17);
                }
            }
            this.f502968d.size();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneTenpayQueryBindBankcard", e17, "", new java.lang.Object[0]);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class j1 extends lp5.a {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f238399f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f238400g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f238401h;

    /* renamed from: i, reason: collision with root package name */
    public int f238402i;

    public j1(double d17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayh5Pay", "NetSceneTenpayh5Pay create");
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("transfer_amount", java.lang.Math.round(d17 * 100.0d) + "");
            hashMap.put("pay_nickname", java.net.URLEncoder.encode(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + "");
            hashMap.put("rcvd_username", str2 + "");
            hashMap.put("rcvd_nickname", java.net.URLEncoder.encode(str3, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + "");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(java.net.URLEncoder.encode(str4 == null ? "" : str4, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            sb6.append("");
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, sb6.toString());
            hashMap.put(ya.b.f77474x50f1e011, i17 + "");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayh5Pay", "error " + e17.getMessage());
        }
        m146205xb4c13117(hashMap);
    }

    @Override // lp5.a
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5requesttransfer";
    }

    @Override // lp5.a
    public int I() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1622;
    }

    @Override // lp5.a
    /* renamed from: onGYNetEnd */
    public void mo68407x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayh5Pay", "errCode " + i17 + " errMsg: " + str);
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayh5Pay", "NetSceneTenpayh5Pay request error");
            return;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        this.f238399f = jSONObject.optString("payurl");
        this.f238400g = jSONObject.optString("tradeurl");
        this.f238401h = jSONObject.optInt("transfering_num");
        this.f238402i = jSONObject.optInt("transfering_type");
        stringBuffer.append("payurl:" + this.f238399f);
        stringBuffer.append(" tradeurl:" + this.f238400g);
        stringBuffer.append(" transfering_num:" + this.f238401h);
        stringBuffer.append(" transfering_type:" + this.f238402i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayh5Pay", "resp " + stringBuffer.toString());
    }
}

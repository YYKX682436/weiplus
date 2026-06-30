package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class i1 extends lp5.a {

    /* renamed from: f, reason: collision with root package name */
    public int f238389f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f238390g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f238391h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f238392i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f238393m;

    public i1(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayh5Index", "NetSceneTenpayh5Index create");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("wallet_type", i17 + "");
        m146205xb4c13117(hashMap);
    }

    @Override // lp5.a
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5transferoperate";
    }

    @Override // lp5.a
    public int I() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1574;
    }

    @Override // lp5.a
    /* renamed from: onGYNetEnd */
    public void mo68407x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayh5Index", "errCode " + i17 + " errMsg: " + str);
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayh5Index", "NetSceneTransferChargeQuery request error");
            return;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        this.f238389f = jSONObject.optInt(ya.b.f77474x50f1e011);
        this.f238390g = jSONObject.optString("currencyUint");
        this.f238391h = jSONObject.optString("currencyWording");
        this.f238392i = jSONObject.optString("notice");
        this.f238393m = jSONObject.optString("notice_url");
        stringBuffer.append("currency:" + this.f238389f);
        stringBuffer.append(" currencyuint:" + this.f238390g);
        stringBuffer.append(" currencywording:" + this.f238391h);
        stringBuffer.append(" notice:" + this.f238392i);
        stringBuffer.append(" notice_url:" + this.f238393m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayh5Index", "resp " + stringBuffer.toString());
    }
}

package ss4;

/* loaded from: classes9.dex */
public class y extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f493676d;

    /* renamed from: e, reason: collision with root package name */
    public int f493677e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f493678f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f493679g;

    public y(java.lang.String str, int i17, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("token", str);
        hashMap.put("use_touch", "" + i17);
        m83032xb4c13117(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("soter_req", str2);
        m83033x7c1e2016(hashMap2);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        boolean h17 = ih.a.h("clicfg_user_token_open", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayCheckPwdByToken", "[getFuncId] enableSwitch：%s", java.lang.Boolean.valueOf(h17));
        return h17 ? 1550 : 1515;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 100;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/getusertoken";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayCheckPwdByToken", "[onGYNetEnd] errCode " + i17 + " errMsg: " + str);
        this.f493676d = jSONObject.optString("usertoken");
        this.f493677e = jSONObject.optInt("is_free_sms");
        this.f493678f = jSONObject.optString("mobile_no");
        this.f493679g = jSONObject.optString("relation_key");
    }

    public y(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("token", str2);
        m83032xb4c13117(hashMap);
        m83033x7c1e2016(new java.util.HashMap<>());
    }

    public y(java.lang.String str, java.lang.String str2, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("token", str2);
        hashMap.put("resend", z17 ? "1" : "0");
        m83032xb4c13117(hashMap);
        m83033x7c1e2016(new java.util.HashMap<>());
    }
}

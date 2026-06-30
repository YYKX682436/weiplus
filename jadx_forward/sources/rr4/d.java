package rr4;

/* loaded from: classes9.dex */
public class d extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o implements com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.c, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f480760d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f480761e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f480762f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f480763g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f480764h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f480765i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1 f480766m;

    public d(double d17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("total_fee", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.h0("" + d17, "100", 0, java.math.RoundingMode.HALF_UP).toString());
        hashMap.put("fee_type", str);
        hashMap.put("bind_serial", str2);
        hashMap.put("bank_type", str3);
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1502;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 74;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/genpresave";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        this.f480760d = jSONObject.optString("req_key");
        "1".equals(jSONObject.optString("should_alert"));
        jSONObject.optString("alert_msg");
        if (jSONObject.has("real_name_info")) {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("real_name_info");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayBalanceSave", "get real_name_info %s", optJSONObject.toString());
            this.f480761e = optJSONObject.optString("guide_flag");
            this.f480762f = optJSONObject.optString("guide_wording");
            this.f480763g = optJSONObject.optString("left_button_wording");
            this.f480764h = optJSONObject.optString("right_button_wording");
            this.f480765i = optJSONObject.optString("upload_credit_url");
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1 c22898xca8246e1 = new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1();
        this.f480766m = c22898xca8246e1;
        c22898xca8246e1.a(jSONObject);
    }
}

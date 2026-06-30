package com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29;

/* loaded from: classes9.dex */
public abstract class p extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.r implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f295589n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f295590o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f295591p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f295592q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f295593r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 f295594s;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f295597v;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f295582d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f295583e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f295584f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f295585g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f295586h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f295587i = null;

    /* renamed from: m, reason: collision with root package name */
    public org.json.JSONObject f295588m = null;

    /* renamed from: t, reason: collision with root package name */
    public boolean f295595t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f295596u = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f295598w = -1;

    public abstract boolean H();

    public void I(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4) {
        java.util.HashMap hashMap = (java.util.HashMap) this.f295582d;
        hashMap.put("req_key", str);
        hashMap.put(ya.b.f77506xba41a63c, str2);
        hashMap.put("pay_scene", i17 + "");
        hashMap.put("bank_type", str3);
        hashMap.put("channel", i18 + "");
        hashMap.put("bind_serial", str4);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.r, com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: canRetry */
    public boolean mo83038xf7b914b8() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.r, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19089x1d7f0ae9 c19089x1d7f0ae9;
        if (!this.f295584f) {
            this.f295586h = i17;
            this.f295587i = str;
            this.f295588m = jSONObject;
            this.f295584f = true;
            if (jSONObject != null) {
                this.f295583e = jSONObject.optInt("query_order_flag", 0);
            }
        }
        if (jSONObject == null || !jSONObject.has("real_name_info")) {
            z17 = false;
        } else {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("real_name_info");
            this.f295589n = optJSONObject.optString("guide_flag");
            this.f295590o = optJSONObject.optString("guide_wording");
            this.f295591p = optJSONObject.optString("left_button_wording");
            this.f295592q = optJSONObject.optString("right_button_wording");
            this.f295593r = optJSONObject.optString("upload_credit_url");
            z17 = true;
        }
        if (jSONObject == null || !jSONObject.has("set_pwd_info")) {
            c19089x1d7f0ae9 = null;
        } else {
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("set_pwd_info");
            c19089x1d7f0ae9 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19089x1d7f0ae9();
            c19089x1d7f0ae9.f261046e = optJSONObject2.optString("guide_wording");
            c19089x1d7f0ae9.f261047f = optJSONObject2.optString("left_button_wording");
            c19089x1d7f0ae9.f261048g = optJSONObject2.optString("right_button_wording");
            c19089x1d7f0ae9.f261045d = optJSONObject2.optInt("send_pwd_msg");
            z17 = true;
        }
        if (z17 && ("1".equals(this.f295589n) || "2".equals(this.f295589n) || c19089x1d7f0ae9 != null)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1();
            this.f295594s = c19088xa4b300c1;
            java.lang.String str2 = this.f295589n;
            java.lang.String str3 = this.f295590o;
            java.lang.String str4 = this.f295591p;
            java.lang.String str5 = this.f295592q;
            java.lang.String str6 = this.f295593r;
            c19088xa4b300c1.f261037d = c19089x1d7f0ae9;
            c19088xa4b300c1.f261038e = str2;
            c19088xa4b300c1.f261039f = str3;
            c19088xa4b300c1.f261040g = str4;
            c19088xa4b300c1.f261041h = str5;
            c19088xa4b300c1.f261042i = str6;
            c19088xa4b300c1.f261044n = 0;
        }
        this.f295597v = jSONObject.optString("forget_pwd_url", "");
        this.f295598w = jSONObject.optInt("is_clear_failure", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayDelayQueryBase", "forget_pwd_url %s", this.f295597v);
        this.f295595t = true;
        super.mo1065x5f9cdc6f(i17, str, jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.r, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd2 */
    public void mo8968x93feb1a3(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayDelayQueryBase", "always callback: %s,%s", java.lang.Integer.valueOf(oVar.f295486b), oVar.f295487c);
        super.mo8968x93feb1a3(oVar, jSONObject);
        if (this.f295595t || this.f295584f) {
            return;
        }
        this.f295585g = oVar.f295485a;
        this.f295586h = oVar.f295486b;
        this.f295587i = oVar.f295487c;
        if (jSONObject != null) {
            this.f295583e = jSONObject.optInt("query_order_flag", 0);
            this.f295588m = jSONObject;
        }
        this.f295584f = true;
    }
}

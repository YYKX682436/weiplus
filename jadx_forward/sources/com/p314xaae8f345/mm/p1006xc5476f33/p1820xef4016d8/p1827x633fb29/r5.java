package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class r5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p5 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f227114h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f227115i;

    /* renamed from: m, reason: collision with root package name */
    public int f227116m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f227117n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f227118o;

    /* renamed from: p, reason: collision with root package name */
    public long f227119p;

    /* renamed from: q, reason: collision with root package name */
    public int f227120q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h0 f227121r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f227122s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 f227123t = null;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 f227124u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n f227125v;

    public r5(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4) {
        this.f227114h = str;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sendId", str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        hashMap.put("way", i17 + "");
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e, "2");
        hashMap.put("package", str3);
        hashMap.put("sessionUserName", str4);
        m66103xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public int I() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    /* renamed from: onGYNetEnd */
    public void mo66076x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyBusiOpen", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        this.f227115i = jSONObject.optString("spidName");
        jSONObject.optInt("hbStatus");
        this.f227116m = jSONObject.optInt("receiveStatus");
        this.f227117n = jSONObject.optString("statusMess");
        this.f227118o = jSONObject.optString("hintMess");
        this.f227119p = jSONObject.optLong("amount");
        jSONObject.optInt("recNum");
        this.f227120q = jSONObject.optInt("totalNum");
        this.f227121r = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h0();
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("atomicFunc");
        if (optJSONObject2 != null) {
            this.f227121r.f226837d = optJSONObject2.optInt("enable");
            this.f227121r.f226839f = optJSONObject2.optString("fissionContent");
            this.f227121r.f226838e = optJSONObject2.optString("fissionUrl");
        }
        jSONObject.optInt("focusFlag");
        jSONObject.optString("focusWording");
        jSONObject.optString("focusAppidUserName");
        jSONObject.optInt("isFocus");
        this.f227122s = jSONObject.optString("smallHbButtonMess");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.d(jSONObject);
            this.f227123t = d17;
            d17.f226773m = jSONObject.optString("spidLogo");
            this.f227123t.f226772i = jSONObject.optString("spidName");
            this.f227123t.f226771h = jSONObject.optString("spidWishing");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneLuckyMoneyBusiOpen", "parse luckyMoneyDetail fail: " + e17.getLocalizedMessage());
        }
        if (i17 == 0 && jSONObject.has("real_name_info") && (optJSONObject = jSONObject.optJSONObject("real_name_info")) != null) {
            java.lang.String optString = optJSONObject.optString("guide_flag");
            java.lang.String optString2 = optJSONObject.optString("guide_wording");
            java.lang.String optString3 = optJSONObject.optString("left_button_wording");
            java.lang.String optString4 = optJSONObject.optString("right_button_wording");
            java.lang.String optString5 = optJSONObject.optString("upload_credit_url");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1();
            this.f227124u = c19088xa4b300c1;
            c19088xa4b300c1.d(optString, optString2, optString3, optString4, optString5, 1005);
        }
        if (i17 == 0 && jSONObject.has("intercept_win")) {
            this.f227125v = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n.a(jSONObject.optJSONObject("intercept_win"));
        }
    }
}

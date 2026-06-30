package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class s5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p5 {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h0 B;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f227149h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f227150i;

    /* renamed from: m, reason: collision with root package name */
    public int f227151m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f227152n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f227153o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f227154p;

    /* renamed from: q, reason: collision with root package name */
    public int f227155q;

    /* renamed from: r, reason: collision with root package name */
    public int f227156r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f227157s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f227158t;

    /* renamed from: u, reason: collision with root package name */
    public int f227159u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f227160v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f227161w;

    /* renamed from: x, reason: collision with root package name */
    public int f227162x;

    /* renamed from: y, reason: collision with root package name */
    public int f227163y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f227164z = null;
    public long A = 0;

    public s5() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public int I() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    /* renamed from: onGYNetEnd */
    public void mo66076x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyBusiBase", "errCode：%s errMsg：%s json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        this.f227164z = jSONObject.toString();
        this.f227152n = jSONObject.optString("spidLogo");
        this.f227153o = jSONObject.optString("spidWishing");
        this.f227154p = jSONObject.optString("spidName");
        this.f227152n = jSONObject.optString("spidLogo");
        this.f227155q = jSONObject.optInt("hbStatus");
        this.f227156r = jSONObject.optInt("receiveStatus");
        this.f227157s = jSONObject.optString("statusMess");
        jSONObject.optString("hintMess");
        this.f227158t = jSONObject.optString("watermark");
        this.f227150i = jSONObject.optString("sendId");
        this.f227159u = jSONObject.optInt("focusFlag");
        this.f227160v = jSONObject.optString("focusWording");
        this.f227161w = jSONObject.optString("focusAppidUserName");
        this.f227162x = jSONObject.optInt("isFocus");
        this.f227163y = jSONObject.optInt("hbType");
        this.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h0();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("atomicFunc");
        if (optJSONObject != null) {
            this.B.f226837d = optJSONObject.optInt("enable");
            this.B.f226839f = optJSONObject.optString("fissionContent");
            this.B.f226838e = optJSONObject.optString("fissionUrl");
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("agree_duty");
        if (optJSONObject2 != null) {
            optJSONObject2.optString("agreed_flag", "-1");
            optJSONObject2.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
            optJSONObject2.optString("service_protocol_wording", "");
            optJSONObject2.optString("service_protocol_url", "");
            optJSONObject2.optString("button_wording", "");
            this.A = optJSONObject2.optLong("delay_expired_time", 0L);
        }
        if (this.A > 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + (this.A * 1000)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.h(jSONObject.optJSONObject("operationTail"));
    }

    public s5(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyBusiBase", "sendId:%s nativeUrl:%s way:%s", str, str2, java.lang.Integer.valueOf(i17));
        this.f227149h = str2;
        this.f227150i = str;
        this.f227151m = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sendId", str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        hashMap.put("way", i17 + "");
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e, "2");
        hashMap.put("package", str3);
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, 0L)).longValue();
        if (longValue > 0) {
            if (java.lang.System.currentTimeMillis() < longValue) {
                hashMap.put("agreeDuty", "0");
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                gm0.j1.i();
                sb6.append((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_DISCLAIMER_NEED_AGERR_INT_SYNC, 1));
                sb6.append("");
                hashMap.put("agreeDuty", sb6.toString());
            }
        }
        m66103xb4c13117(hashMap);
    }
}

package yb3;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6 {
    public int A;
    public int B;
    public final java.util.Map C;

    public b(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int i19) {
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.f226814i = str;
        this.f226815m = str2;
        this.f226816n = str5;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.C = hashMap;
        hashMap.put("msgType", i17 + "");
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e, i18 + "");
        hashMap.put("sendId", str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            hashMap.put("headImg", java.net.URLEncoder.encode(str3));
            hashMap.put("nickName", java.net.URLEncoder.encode(str4 == null ? "" : str4));
        }
        hashMap.put("ver", str6);
        hashMap.put("timingIdentifier", str7);
        hashMap.put("left_button_continue", str8);
        hashMap.put("liveid", str9);
        hashMap.put("liveattach", str10);
        if (i19 > 0) {
            hashMap.put("channellive_sender_flag", java.lang.String.valueOf(i19));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLiveOpenLuckyMoney", "NetSceneOpenLuckyMoney request");
        m66103xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/ftfhb/channelliveopenwxhb";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public void J(int i17, org.json.JSONObject jSONObject) {
        int i18;
        if (i17 == 0 || jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLiveOpenLuckyMoney", "needCallbackWhenError error ok or json null");
            this.A = 0;
            this.B = 0;
            return;
        }
        int optInt = jSONObject.optInt("tryafterms");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLiveOpenLuckyMoney", "needCallbackWhenError delayTimeMS: %s, retryTimes: %s, errCode: %s", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(i17));
        if (optInt <= 0 || (i18 = this.A) >= 1) {
            this.A = 0;
            this.B = 0;
        } else {
            this.A = i18 + 1;
            this.B = java.lang.Math.min(optInt, 5000);
        }
    }

    public yb3.b L() {
        java.util.Map map = this.C;
        if (map == null) {
            return null;
        }
        ((java.util.HashMap) map).put("policy_retry", java.lang.String.valueOf(1));
        yb3.b bVar = new yb3.b(map);
        bVar.f226814i = this.f226814i;
        bVar.f226815m = this.f226815m;
        bVar.f226816n = this.f226816n;
        bVar.A = this.A;
        return bVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4595;
    }

    public b(java.util.Map map) {
        this.A = 0;
        this.B = 0;
        this.C = null;
        m66103xb4c13117(map);
    }
}

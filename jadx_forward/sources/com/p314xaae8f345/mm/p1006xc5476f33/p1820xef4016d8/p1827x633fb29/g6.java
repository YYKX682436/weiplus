package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class g6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6 {
    public g6(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.f226814i = str;
        this.f226815m = str2;
        this.f226816n = str5;
        java.util.HashMap hashMap = new java.util.HashMap();
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
        hashMap.put("sessionUserName", str5);
        hashMap.put("ver", str6);
        hashMap.put("timingIdentifier", str7);
        hashMap.put("union_source", "0");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
            hashMap.put("left_button_continue", str8);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "NetSceneOpenLuckyMoneyUnion request，left_button_continue：%s", str8);
        m66103xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/unionhb/openunionhb";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5148;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    /* renamed from: onGYNetEnd */
    public void mo66076x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        try {
            this.f226813h = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.d(jSONObject);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522.a(jSONObject);
            this.f226820r = a17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "luckyMoneyEmojiSwitch:%s", a17.m66071x9616526c());
            this.f226821s = jSONObject.optString("expression_md5");
            int optInt = jSONObject.optInt("expression_type");
            this.f226822t = optInt;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "expressionmd5:%s expressiontype:%s", this.f226821s, java.lang.Integer.valueOf(optInt));
            if (i17 == 0 && jSONObject.has("real_name_info") && (optJSONObject = jSONObject.optJSONObject("real_name_info")) != null) {
                java.lang.String optString = optJSONObject.optString("guide_flag");
                java.lang.String optString2 = optJSONObject.optString("guide_wording");
                java.lang.String optString3 = optJSONObject.optString("left_button_wording");
                java.lang.String optString4 = optJSONObject.optString("right_button_wording");
                java.lang.String optString5 = optJSONObject.optString("upload_credit_url");
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1();
                this.f226818p = c19088xa4b300c1;
                c19088xa4b300c1.d(optString, optString2, optString3, optString4, optString5, 1003);
            }
            if (jSONObject.has("intercept_win")) {
                this.f226823u = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n.a(jSONObject.optJSONObject("intercept_win"));
            }
            if (jSONObject.has("left_button_continue")) {
                this.f226825w = jSONObject.optString("left_button_continue");
            }
            this.f226817o = jSONObject.optString("SystemMsgContext");
            int optInt2 = jSONObject.optInt("showYearExpression");
            this.f226819q = optInt2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "showYearExpression:%s", java.lang.Integer.valueOf(optInt2));
            if (i17 == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226817o) && !c01.e2.L(this.f226816n)) {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.q(this.f226817o, this.f226816n);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneOpenLuckyMoneyUnion", "insertLocalSysMsgIfNeed error: %s", e17.getMessage());
                }
            }
            K();
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneOpenLuckyMoneyUnion", "parse luckyMoneyDetail fail: " + e18.getLocalizedMessage());
        }
    }
}

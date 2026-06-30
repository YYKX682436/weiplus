package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class h6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c6 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f226856h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f226857i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f226858m;

    /* renamed from: n, reason: collision with root package name */
    public int f226859n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f226860o;

    public h6(int i17, long j17, long j18, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i19, java.lang.String str7) {
        this(i17, j17, j18, i18, str, str2, str3, str4, str5, str6, i19, str7, "", 0, 0, "", "", 0, "");
    }

    public static boolean K(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(x51.j1.f(((r45.ex3) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a).f455314d));
            if (jSONObject.has("showmess")) {
                int optInt = jSONObject.optJSONObject("showmess").optInt("return_to_session", 0);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (optInt == 1) {
                    return true;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePrepareLuckyMoney", "ifReturnByReturnToSession() Exception：%s", e17.getMessage());
        }
        return false;
    }

    public static at4.a L(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h6 h6Var, org.json.JSONObject jSONObject) {
        at4.a aVar = new at4.a();
        aVar.f95328a = jSONObject.optString("retmsg");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("showmess");
        aVar.f95329b = optJSONObject.optString("left_button_wording");
        aVar.f95330c = optJSONObject.optString("right_button_wording");
        aVar.f95331d = optJSONObject.optString("right_button_url");
        if (h6Var != null) {
            jSONObject.optInt("return_to_session", 0);
        }
        return aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/requestwxhb";
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1575;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    /* renamed from: onGYNetEnd */
    public void mo66076x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePrepareLuckyMoney", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        this.f226856h = jSONObject.optString("sendId");
        this.f226857i = jSONObject.optString("reqkey");
        this.f226858m = jSONObject.optString("sendMsgXml");
        jSONObject.optString("guide_flag", "0");
        jSONObject.optString("guide_wording");
        jSONObject.optString("left_button_wording", "");
        jSONObject.optString("right_button_wording", "");
        jSONObject.optString("upload_credit_url", "");
        this.f226860o = jSONObject.optString("id_sign", "");
        if (jSONObject.has("showmess")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePrepareLuckyMoney", "has alert item");
            L(this, jSONObject);
        }
    }

    public h6(int i17, long j17, long j18, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i19, java.lang.String str7, java.lang.String str8, int i27, int i28, java.lang.String str9, java.lang.String str10, int i29, java.lang.String str11) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str8;
        objArr[1] = java.lang.Integer.valueOf(i27);
        objArr[2] = java.lang.Integer.valueOf(i28);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[3] = str9 == null ? "" : str9;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePrepareLuckyMoney", "NetScenePrepareLuckyMoney() uniqueId:%s, userConfiremJump:%s, unpayType:%s, cancelSendId:%s", objArr);
        this.f226859n = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (i18 == 3) {
            hashMap.put("totalNum", "1");
        } else {
            hashMap.put("totalNum", i17 + "");
        }
        hashMap.put("totalAmount", j17 + "");
        hashMap.put("perValue", j18 + "");
        hashMap.put("hbType", i18 + "");
        hashMap.put("wishing", java.net.URLEncoder.encode(str == null ? "" : str));
        hashMap.put("sendUserName", str5);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
            hashMap.put("unique_id", str8);
        }
        hashMap.put("user_confirm_jump", java.lang.String.valueOf(i27));
        hashMap.put("unpay_type", java.lang.String.valueOf(i28));
        hashMap.put("cancel_sendid", str9);
        hashMap.put("expression_md5", str10);
        hashMap.put("expression_type", "" + i29);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            hashMap.put(dm.i4.f66875xa013b0d5, str3);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str3)) {
                hashMap.put("chatroomUserCnt", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str3) + "");
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put("headImg", java.net.URLEncoder.encode(str2));
            hashMap.put("nickName", java.net.URLEncoder.encode(str6 == null ? "" : str6));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                hashMap.put("receiveNickName", java.net.URLEncoder.encode(str4));
            }
        }
        hashMap.put("inWay", i19 + "");
        if (i19 == 0 || i19 == 1 || i19 == 7) {
            hashMap.put("needSendToMySelf", "0");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
            hashMap.put("showSourceMac", java.net.URLEncoder.encode(str7));
        }
        hashMap.put("exclusiveRecvUsername", str11);
        m66103xb4c13117(hashMap);
    }
}

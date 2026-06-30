package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class z5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c6 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f227271h;

    public z5(int i17, long j17, long j18, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i19) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("totalNum", i17 + "");
        hashMap.put("totalAmount", j17 + "");
        hashMap.put("perValue", j18 + "");
        hashMap.put("hbType", i18 + "");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        hashMap.put("wishing", java.net.URLEncoder.encode(str == null ? "" : str));
        hashMap.put(ya.b.f77474x50f1e011, i19 + "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            hashMap.put("headImg", java.net.URLEncoder.encode(str3));
        }
        hashMap.put("nickName", java.net.URLEncoder.encode(str4 == null ? "" : str4));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put(dm.i4.f66875xa013b0d5, java.net.URLEncoder.encode(str2));
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2)) {
                hashMap.put("chatroomUserCnt", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str2) + "");
            }
        }
        m66103xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5requestwxhb";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public int I() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1647;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    /* renamed from: onGYNetEnd */
    public void mo66076x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyH5Request", "NetSceneLuckyMoneyH5Request response errCode=" + i17 + " content:" + jSONObject.toString());
        if (i17 == 0) {
            this.f227271h = jSONObject.optString("payUrl");
        }
    }
}

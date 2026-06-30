package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class b6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c6 {
    public b6(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sendId", str + "");
        hashMap.put("offset", i18 + "");
        hashMap.put("type", i17 + "");
        hashMap.put("receiveId", str2);
        hashMap.put("ver", str3);
        m66103xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/deletelistwxhb";
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1612;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    /* renamed from: onGYNetEnd */
    public void mo66076x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneLuckyMoneyMyRecordDelete", "onGYNetEnd");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class a6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c6 {

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n4 f226698h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f226699i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f226700m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f226701n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f226702o = null;

    public a6(int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("limit", i17 + "");
        hashMap.put("offset", i18 + "");
        hashMap.put("type", i19 + "");
        hashMap.put("year", str);
        hashMap.put("ver", str2);
        hashMap.put("processContent", str3);
        m66103xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/qrylistwxhb";
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1514;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    /* renamed from: onGYNetEnd */
    public void mo66076x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String[] split;
        try {
            this.f226698h = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.f(jSONObject);
            this.f226699i = new java.util.ArrayList();
            java.lang.String optString = jSONObject.optString("years");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && (split = optString.split("\\|")) != null) {
                for (java.lang.String str2 : split) {
                    this.f226699i.add(str2);
                }
            }
            this.f226700m = jSONObject.optString("recordYear");
            this.f226702o = jSONObject.optString("clickedUrl");
            this.f226701n = jSONObject.optString("processContent");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneLuckyMoneyNormalBase", e17, "", new java.lang.Object[0]);
        }
    }
}

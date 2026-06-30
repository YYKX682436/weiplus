package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class n6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c6 {
    public n6(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.f66875xa013b0d5, str);
        hashMap.put("sendId", str2);
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e, i17 + "");
        hashMap.put("ver", str3);
        hashMap.put("sendUserName", c01.z1.r());
        m66103xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/sharewxhb";
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1668;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    /* renamed from: onGYNetEnd */
    public void mo66076x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }
}

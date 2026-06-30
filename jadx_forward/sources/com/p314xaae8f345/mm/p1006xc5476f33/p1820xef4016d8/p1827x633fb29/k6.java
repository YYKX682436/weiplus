package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class k6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c6 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f226931h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f226932i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f226933m;

    public k6(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6, int i19, java.lang.String str7, int i27, int i28, java.lang.String str8, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.j6 j6Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("amount", i17 + "");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        hashMap.put("wishing", java.net.URLEncoder.encode(str == null ? "" : str));
        hashMap.put("sendUserName", str4);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            hashMap.put(dm.i4.f66875xa013b0d5, str3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put("headImg", java.net.URLEncoder.encode(str2));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            hashMap.put("nickName", java.net.URLEncoder.encode(str5 == null ? "" : str5));
        }
        hashMap.put("inWay", i18 + "");
        hashMap.put("imageId", "");
        hashMap.put("imageAesKey", "");
        hashMap.put("imageLength", "0");
        hashMap.put("expressionurl", str6);
        hashMap.put("expressiontype", "" + i19);
        if (j6Var != null) {
            hashMap.put("voice_url", j6Var.f226889a);
            hashMap.put("voice_aeskey", j6Var.f226890b);
            hashMap.put("voice_file_length", j6Var.f226891c + "");
            hashMap.put("voice_playtime", j6Var.f226892d + "");
            hashMap.put("voice_format", "4");
            hashMap.put("voice_key_words", j6Var.f226893e);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
            hashMap.put("unique_id", str7);
        }
        hashMap.put("user_confirm_jump", "" + i27);
        hashMap.put("unpay_type", "" + i28);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
            hashMap.put("cancel_sendid", str8);
        }
        m66103xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/yearrequestwxhb";
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1643;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    /* renamed from: onGYNetEnd */
    public void mo66076x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f226931h = jSONObject.optString("sendId");
        this.f226932i = jSONObject.optString("reqkey");
        this.f226933m = jSONObject.optString("sendMsgXml");
    }
}

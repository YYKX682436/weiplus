package ss4;

/* loaded from: classes9.dex */
public class c0 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f493560d;

    public c0(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("check_pwd_scene", i17 + "");
        hashMap.put("package", java.net.URLEncoder.encode(str2));
        hashMap.put("sign", str3);
        hashMap.put("sign_type", str4);
        hashMap.put("busi_id", str5);
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: callbackUIWhenWalletError */
    public boolean mo83004xf23e3b1c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 2704;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 2704;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/getpaypwdtoken";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f493560d = jSONObject.optString("usertoken", "");
    }

    public c0(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6, java.lang.String str7) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("check_pwd_scene", i17 + "");
        hashMap.put("package", java.net.URLEncoder.encode(str2));
        hashMap.put("sign", str3);
        hashMap.put("sign_type", str4);
        hashMap.put("busi_id", str5);
        hashMap.put("use_touch", i18 + "");
        m83032xb4c13117(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("soter_req", str6);
        hashMap2.put("fingerData", str7);
        m83033x7c1e2016(hashMap2);
    }
}

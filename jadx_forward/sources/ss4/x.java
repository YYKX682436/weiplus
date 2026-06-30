package ss4;

/* loaded from: classes9.dex */
public class x extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public int f493673d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f493674e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f493675f;

    public x(java.lang.String str, int i17, java.lang.String str2) {
        H(str, i17, str2, "");
    }

    public final void H(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("req_key", str2);
        if (i17 == 6) {
            hashMap.put("time_stamp", "" + java.lang.System.currentTimeMillis());
        }
        m83032xb4c13117(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("check_pwd_scene", i17 + "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            hashMap2.put("bus_info", str3);
        }
        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295447a) {
            hashMap2.put("uuid_for_bindcard", com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295449c);
            hashMap2.put("bindcard_scene", "" + com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295448b);
        }
        m83033x7c1e2016(hashMap2);
        this.f493673d = i17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.r.f33697x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 18;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/checkpwd";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        int i18 = this.f493673d;
        if (i18 == 6 || i18 == 8 || i18 == 18 || i18 == 1 || i18 == 10) {
            this.f493674e = jSONObject.optString("usertoken");
            this.f493675f = jSONObject.optString("token_type");
        }
    }

    public x(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        H(str, i17, str2, str3);
    }
}

package ss4;

/* loaded from: classes9.dex */
public class w extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641 f493671d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f493672e;

    public w(at4.z0 z0Var) {
        this(z0Var, -1, "");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.u.f34771x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 13;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/bindverify";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641 c19093x748e2641 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641();
        this.f493671d = c19093x748e2641;
        c19093x748e2641.a(jSONObject);
        this.f493672e = jSONObject.optString("action");
    }

    public w(at4.z0 z0Var, int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        m83030x824a7eb4(z0Var.f95568n, hashMap, hashMap2);
        hashMap.put("flag", z0Var.f95555a);
        if ("2".equals(z0Var.f95555a)) {
            hashMap.put("passwd", z0Var.f95556b);
        }
        hashMap.put("verify_code", z0Var.f95557c);
        hashMap.put("token", z0Var.f95558d);
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = z0Var.f95568n;
        if (c19760x34448d56 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19760x34448d56.f273647m)) {
            hashMap.put("req_key", z0Var.f95568n.f273647m);
        }
        if (i17 >= 0) {
            hashMap.put("realname_scene", i17 + "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o.TAG, "realname_scene=%d", java.lang.Integer.valueOf(i17));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f95559e)) {
            hashMap.put("bank_type", z0Var.f95559e + "");
        }
        if (z0Var.f95555a == "2" && z0Var.f95569o == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f95570p)) {
            hashMap.put("verify_user_token", "1");
            hashMap.put("usertoken", z0Var.f95570p);
        }
        hashMap.put("session_id", str);
        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295447a) {
            hashMap2.put("uuid_for_bindcard", com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295449c);
            hashMap2.put("bindcard_scene", "" + com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295448b);
        }
        m83032xb4c13117(hashMap);
        m83033x7c1e2016(hashMap2);
    }
}

package rs4;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641 f480879d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f480880e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f480881f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f480882g;

    /* renamed from: h, reason: collision with root package name */
    public int f480883h;

    public b(at4.z0 z0Var) {
        this(z0Var, -1, "", null);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.x.f33756x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/bindverifyreg";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641 c19093x748e2641 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641();
        this.f480879d = c19093x748e2641;
        c19093x748e2641.a(jSONObject);
        this.f480880e = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        this.f480881f = jSONObject.optString("desc");
        this.f480882g = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
        this.f480883h = jSONObject.optInt("err_jump_page");
    }

    public b(at4.z0 z0Var, int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19087x5acf574b c19087x5acf574b) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap.put("flag", z0Var.f95555a);
        hashMap.put("passwd", z0Var.f95556b);
        hashMap.put("verify_code", z0Var.f95557c);
        hashMap.put("token", z0Var.f95558d);
        hashMap.put("bind_flag", z0Var.f95561g ? "1" : "0");
        if (i17 > 0) {
            hashMap.put("realname_scene", i17 + "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o.TAG, "realname_scene=%d", java.lang.Integer.valueOf(i17));
        }
        if (c19087x5acf574b != null) {
            c19087x5acf574b.a(hashMap);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f95559e)) {
            hashMap.put("bank_type", z0Var.f95559e + "");
        }
        hashMap.put("session_id", str);
        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295447a) {
            hashMap2.put("uuid_for_bindcard", com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295449c);
            hashMap2.put("bindcard_scene", "" + com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295448b);
        }
        m83030x824a7eb4(z0Var.f95568n, hashMap, hashMap2);
        m83032xb4c13117(hashMap);
        m83033x7c1e2016(hashMap2);
    }
}

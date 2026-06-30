package rs4;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f480876d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f480877e = null;

    /* renamed from: f, reason: collision with root package name */
    public at4.y0 f480878f;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f480876d = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        m83030x824a7eb4(c19090x75920c71.f261090v, hashMap, hashMap2);
        hashMap.put("flag", "" + c19090x75920c71.f261075d);
        hashMap.put("bank_type", c19090x75920c71.f261078g);
        hashMap.put("mobile_area", c19090x75920c71.M);
        hashMap.put("session_id", str2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261077f)) {
            hashMap.put("passwd", c19090x75920c71.f261077f);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261087s)) {
            hashMap.put("token", c19090x75920c71.f261087s);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.F)) {
            gm0.j1.i();
            kk.v vVar = new kk.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(9, null), 0));
            hashMap.put("import_code", c19090x75920c71.F);
            hashMap.put("qqid", vVar.m143587x9616526c());
            if (c19090x75920c71.f261082n > 0) {
                hashMap.put("cre_type", c19090x75920c71.f261082n + "");
            }
            hashMap.put("bind_serailno", c19090x75920c71.f261079h);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261091w)) {
            hashMap.put("first_name", c19090x75920c71.f261091w);
            hashMap.put("last_name", c19090x75920c71.f261092x);
            hashMap.put("country", c19090x75920c71.f261093y);
            hashMap.put("area", c19090x75920c71.f261094z);
            hashMap.put("city", c19090x75920c71.A);
            hashMap.put("address", c19090x75920c71.B);
            hashMap.put("phone_number", c19090x75920c71.C);
            hashMap.put("zip_code", c19090x75920c71.D);
            hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c, c19090x75920c71.E);
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261080i)) {
            hashMap.put("true_name", c19090x75920c71.f261080i);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261081m)) {
            hashMap.put("identify_card", c19090x75920c71.f261081m);
        }
        if (c19090x75920c71.f261082n > 0) {
            hashMap.put("cre_type", c19090x75920c71.f261082n + "");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261083o)) {
            hashMap.put("mobile_no", c19090x75920c71.f261083o);
        }
        hashMap.put("bank_card_id", c19090x75920c71.f261084p);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261085q)) {
            hashMap.put("cvv2", c19090x75920c71.f261085q);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261086r)) {
            hashMap.put("valid_thru", c19090x75920c71.f261086r);
        }
        int i17 = c19090x75920c71.f261075d;
        if (i17 == 1 || i17 == 2) {
            hashMap.put("creid_renewal", java.lang.String.valueOf(c19090x75920c71.N));
            hashMap.put("birth_date", c19090x75920c71.P);
            hashMap.put("cre_expire_date", c19090x75920c71.Q);
        }
        int i18 = c19090x75920c71.f261075d;
        if ((i18 == 2 || i18 == 5) && c19090x75920c71.R == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.S)) {
            hashMap.put("verify_user_token", "1");
            hashMap.put("usertoken", c19090x75920c71.S);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.T) && c19090x75920c71.T.isEmpty()) {
            hashMap.put("checkpayjsapi_token", c19090x75920c71.T);
        }
        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295447a) {
            hashMap2.put("uuid_for_bindcard", com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295449c);
            hashMap2.put("bindcard_scene", "" + com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295448b);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            hashMap.put("has_underage_alert", str);
        }
        m83032xb4c13117(hashMap);
        m83033x7c1e2016(hashMap2);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 471;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 12;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: getToken */
    public java.lang.String mo8967x75346043() {
        return this.f480877e;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/bindauthen";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            jSONObject.optString("req_key");
            this.f480877e = jSONObject.optString("token");
            this.f480878f = at4.y0.b(jSONObject);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: resend */
    public boolean mo8969xc84d8c3b() {
        super.mo8969xc84d8c3b();
        java.util.Map<java.lang.String, java.lang.String> map = this.f480876d;
        ((java.util.HashMap) map).put("is_repeat_send", "1");
        m83032xb4c13117(map);
        return true;
    }
}

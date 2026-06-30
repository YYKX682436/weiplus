package gs4;

/* loaded from: classes9.dex */
public class s extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f356668d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f356669e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f356670f;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71, boolean z17, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f356668d = hashMap;
        hashMap.put("flag", "" + c19090x75920c71.f261075d);
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
        }
        hashMap.put("business_source", i17 + "");
        hashMap.put("bank_type", c19090x75920c71.f261078g);
        if (c19090x75920c71.f261082n > 0) {
            hashMap.put("cre_type", c19090x75920c71.f261082n + "");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261080i)) {
            hashMap.put("true_name", c19090x75920c71.f261080i);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261081m)) {
            hashMap.put("identify_card", c19090x75920c71.f261081m);
        }
        hashMap.put("mobile_no", c19090x75920c71.f261083o);
        hashMap.put("bank_card_id", c19090x75920c71.f261084p);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261085q)) {
            hashMap.put("cvv2", c19090x75920c71.f261085q);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261086r)) {
            hashMap.put("valid_thru", c19090x75920c71.f261086r);
        }
        hashMap.put("new_card_reset_pwd", z17 ? "1" : "0");
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return kf1.i.f72437x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: getToken */
    public java.lang.String mo8967x75346043() {
        return this.f356669e;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/resetpwdauthen";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f356669e = jSONObject.optString("token");
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: resend */
    public boolean mo8969xc84d8c3b() {
        super.mo8969xc84d8c3b();
        java.util.Map<java.lang.String, java.lang.String> map = this.f356668d;
        ((java.util.HashMap) map).put("is_repeat_send", "1");
        m83032xb4c13117(map);
        this.f356670f = true;
        return true;
    }
}

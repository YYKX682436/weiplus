package rr4;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f480759d;

    public c(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4) {
        this.f480759d = false;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("flag", "" + i17);
        hashMap.put("passwd", str);
        hashMap.put("req_key", str3);
        hashMap.put("verify_code", str2);
        hashMap.put("pay_scene", "" + i18);
        hashMap.put("ignore_bind", str4);
        if ("0".equals(str4)) {
            this.f480759d = true;
        }
        m83032xb4c13117(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295447a) {
            hashMap2.put("uuid_for_bindcard", com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295449c);
            hashMap2.put("bindcard_scene", "" + com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295448b);
        }
        m83033x7c1e2016(hashMap2);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1506;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 76;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/verifybind";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        jSONObject.optString("req_key");
    }
}

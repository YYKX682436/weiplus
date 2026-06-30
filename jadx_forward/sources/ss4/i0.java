package ss4;

/* loaded from: classes9.dex */
public class i0 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f493600d;

    public i0(at4.z0 z0Var, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("verify_code", z0Var.f95557c);
        hashMap.put("token", z0Var.f95558d);
        hashMap.put("passwd", z0Var.f95556b);
        hashMap.put("relation_key", str);
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1604;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 124;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/webankverifysms";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject == null || i17 != 0) {
            return;
        }
        jSONObject.optString("token_type");
        this.f493600d = jSONObject.optString("usertoken");
    }
}

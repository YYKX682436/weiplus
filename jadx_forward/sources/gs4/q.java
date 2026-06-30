package gs4;

/* loaded from: classes9.dex */
public class q extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public org.json.JSONObject f356667d;

    public q(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("is_root", z17 ? "1" : "0");
        hashMap.put("is_device_open_touch", z18 ? "1" : "0");
        hashMap.put("cpu_id", str);
        hashMap.put("app_uid", str2);
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f39858xf5bc2045 = u0Var;
        return super.mo807x6c193ac1(sVar, u0Var);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1669;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/paysecurity";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        if (i17 != 0 || jSONObject == null) {
            return;
        }
        jSONObject.toString();
        this.f356667d = jSONObject;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().d(this.f356667d);
    }
}

package es4;

/* loaded from: classes9.dex */
public class j extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p {

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f337958x;

    /* renamed from: y, reason: collision with root package name */
    public final int f337959y;

    public j(at4.z0 z0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05) {
        int i17 = -1;
        this.f337959y = -1;
        this.f337958x = c19099x8d444f05;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = z0Var.f95568n;
        if (c19760x34448d56 != null) {
            this.f337959y = c19760x34448d56.f273642e;
            i17 = c19760x34448d56.f273644g;
        }
        int i18 = i17;
        java.util.ArrayList arrayList = (java.util.ArrayList) c19099x8d444f05.M;
        I(c19099x8d444f05.f261208e, arrayList.size() > 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) arrayList.get(0)).f261247r : null, this.f337959y, i18, z0Var.f95559e, z0Var.f95560f);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f95556b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayVertifyReg", "hy: has pwd: %b", java.lang.Boolean.valueOf(z17));
        m83031x824a7eb4(z0Var.f95568n, hashMap, hashMap2, z17);
        hashMap.put("flag", z0Var.f95555a);
        hashMap.put("passwd", z0Var.f95556b);
        hashMap.put("verify_code", z0Var.f95557c);
        hashMap.put("token", z0Var.f95558d);
        hashMap.put("favorcomposedid", z0Var.f95564j);
        hashMap.put("default_favorcomposedid", z0Var.f95563i);
        m83032xb4c13117(hashMap);
        m83033x7c1e2016(hashMap2);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p
    public boolean H() {
        int i17 = this.f337959y;
        return i17 == 11 || i17 == 21;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        int i17 = this.f337959y;
        if (i17 == 11) {
            return 1684;
        }
        if (i17 == 21) {
            return 1608;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q.f33744x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 16;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        int i17 = this.f337959y;
        return i17 == 11 ? "/cgi-bin/mmpay-bin/tenpay/saveverifyreg" : i17 == 21 ? "/cgi-bin/mmpay-bin/tenpay/fetchverifyreg" : "/cgi-bin/mmpay-bin/tenpay/verifyreg";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p, com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.r, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.mo1065x5f9cdc6f(i17, str, jSONObject);
        if (i17 != 0) {
            return;
        }
        jSONObject.optString("bind_serial");
        if ("1".equals(jSONObject.optString("pay_flag"))) {
            m83053x37d0a03d(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f337958x;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.g(jSONObject, c19099x8d444f05);
            this.f337958x = c19099x8d444f05;
        } else {
            m83053x37d0a03d(false);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mPayScene:");
        int i18 = this.f337959y;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayVertifyReg", sb6.toString());
        if (i18 == 39) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayVertifyReg", "it's the sns scene, parse the sns pay data");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.a1.a(jSONObject);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayVertifyReg", "it's not the sns scene");
        }
        java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p2802xd031a825.a.f("PayProcess")).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2802xd031a825.h) it.next()).f295334c.putInt("key_is_clear_failure", this.f295598w);
        }
    }
}

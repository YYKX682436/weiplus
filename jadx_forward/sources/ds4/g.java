package ds4;

/* loaded from: classes9.dex */
public class g extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p {

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f324459x;

    /* renamed from: y, reason: collision with root package name */
    public final at4.z0 f324460y;

    /* renamed from: z, reason: collision with root package name */
    public final int f324461z;

    public g(at4.z0 z0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05) {
        this.f324461z = -1;
        this.f324459x = c19099x8d444f05;
        this.f324460y = z0Var;
        java.util.ArrayList arrayList = (java.util.ArrayList) c19099x8d444f05.M;
        java.lang.String str = arrayList.size() > 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) arrayList.get(0)).f261247r : null;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = z0Var.f95568n;
        if (c19760x34448d56 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayPayVertify", "empty payInfo");
            return;
        }
        int i17 = c19760x34448d56.f273642e;
        this.f324461z = i17;
        I(c19099x8d444f05.f261208e, str, i17, c19760x34448d56.f273644g, z0Var.f95559e, z0Var.f95560f);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap.put("flag", z0Var.f95555a);
        hashMap.put("passwd", z0Var.f95556b);
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f95556b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayPayVertify", "hy: has pwd: %b", java.lang.Boolean.valueOf(z17));
        m83031x824a7eb4(z0Var.f95568n, hashMap, hashMap2, z17);
        hashMap.put("verify_type", "" + z0Var.f95565k);
        if (z0Var.f95565k == 0) {
            hashMap.put("verify_code", z0Var.f95557c);
        } else {
            hashMap.put("cre_tail", z0Var.f95566l);
            hashMap.put("cre_type", z0Var.f95567m);
        }
        hashMap.put("token", z0Var.f95558d);
        hashMap.put("bank_type", z0Var.f95559e);
        hashMap.put("bind_serial", z0Var.f95560f);
        hashMap.put("arrive_type", z0Var.f95562h);
        hashMap.put("default_favorcomposedid", z0Var.f95563i);
        hashMap.put("favorcomposedid", z0Var.f95564j);
        J(hashMap);
        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295447a) {
            hashMap2.put("uuid_for_bindcard", com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295449c);
            hashMap2.put("bindcard_scene", "" + com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295448b);
        }
        m83032xb4c13117(hashMap);
        m83033x7c1e2016(hashMap2);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p
    public boolean H() {
        int i17 = this.f324461z;
        return i17 == 11 || i17 == 21;
    }

    public void J(java.util.Map map) {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        int i17 = this.f324461z;
        if (i17 == 11) {
            return 1607;
        }
        return i17 == 21 ? 1606 : 462;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        int i17 = this.f324461z;
        return i17 == 11 ? "/cgi-bin/mmpay-bin/tenpay/saveverify" : i17 == 21 ? "/cgi-bin/mmpay-bin/tenpay/fetchverify" : "/cgi-bin/mmpay-bin/tenpay/verify";
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
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f324459x;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.g(jSONObject, c19099x8d444f05);
            this.f324459x = c19099x8d444f05;
        } else {
            m83053x37d0a03d(false);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mPayScene:");
        int i18 = this.f324461z;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayPayVertify", sb6.toString());
        if (i18 == 39) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayPayVertify", "it's the sns scene, parse the sns pay data");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.a1.a(jSONObject);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayPayVertify", "it's not the sns scene");
        }
        java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p2802xd031a825.a.f("PayProcess")).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2802xd031a825.h) it.next()).f295334c.putInt("key_is_clear_failure", this.f295598w);
        }
    }
}

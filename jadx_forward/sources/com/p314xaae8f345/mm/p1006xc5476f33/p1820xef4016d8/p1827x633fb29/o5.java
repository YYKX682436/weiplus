package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public abstract class o5 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f227046d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f227047e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 f227048f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n5 f227049g;

    public abstract java.lang.String H();

    public int I() {
        return -1;
    }

    public void J(int i17, org.json.JSONObject jSONObject) {
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f227046d = u0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n5 n5Var = this.f227049g;
        if (n5Var == null || !n5Var.a()) {
            return mo9409x10f9447a(sVar, this.f227047e, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyBase", "do fack response: %s", H());
        return this.f227049g.b(this.f227047e, this);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: getCgicmdForKV */
    public int mo66101xe8b43d29() {
        return I();
    }

    /* renamed from: isJumpRemind */
    public boolean m66102x5c64639d() {
        return this.f227048f != null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        java.lang.String string;
        int i27;
        int i28;
        org.json.JSONObject jSONObject;
        int i29;
        int i37;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + I() + ", errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        r45.ex3 ex3Var = (r45.ex3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0) {
            int i38 = ex3Var.f455315e;
            java.lang.String f17 = x51.j1.f(ex3Var.f455314d);
            int i39 = 1000;
            if (i38 == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
                int i47 = ex3Var.f455318h;
                try {
                    jSONObject = new org.json.JSONObject(f17);
                    if (!jSONObject.has("retcode") || !jSONObject.has("retmsg")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyBase", v0Var.mo13823xb5887636() + " no retcode,retmsg");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1698, 11);
                    }
                    i29 = jSONObject.getInt("retcode");
                    string = ex3Var.f455319i;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                        string = jSONObject.optString("retmsg");
                    }
                    this.f227048f = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0.c(jSONObject);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneLuckyMoneyBase", e17, "", new java.lang.Object[0]);
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
                    i28 = 2;
                }
                if (jSONObject.has("showmess") && i29 != 268502454) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyBase", "has alert item");
                    at4.a L = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h6.L(null, jSONObject);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6020x5b3e94ee c6020x5b3e94ee = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6020x5b3e94ee();
                    c6020x5b3e94ee.f136314g.f89193a = L;
                    c6020x5b3e94ee.e();
                } else if (i29 == 0 && i47 == 0) {
                    mo66076x5f9cdc6f(i29, string, jSONObject);
                } else {
                    J(i29, jSONObject);
                    i37 = i47 == 0 ? -1000 : i47;
                    i28 = i37;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + I() + ", tenpayErrType : " + i47 + ", resp = " + f17);
                }
                i39 = i18;
                i37 = i19;
                string = str;
                i28 = i37;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + I() + ", tenpayErrType : " + i47 + ", resp = " + f17);
            } else {
                string = ex3Var.f455316f;
                i28 = 2;
            }
            i27 = i39;
        } else {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "e", null);
            if (d17 != null) {
                string = (java.lang.String) d17.get(".e.Content");
            } else {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
            }
            i27 = i18;
            i28 = i19;
        }
        if (i27 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + I() + ", errType = " + i27 + ", errCode = " + i28 + ", errMsg = " + string);
        }
        this.f227046d.mo815x76e0bfae(i27, i28, string, this);
    }

    /* renamed from: onGYNetEnd */
    public abstract void mo66076x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject);

    /* renamed from: setRequestData */
    public void m66103xb4c13117(java.util.Map map) {
        if (map == null) {
            map = new java.util.HashMap();
        }
        java.lang.String r17 = c01.z1.r();
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(r17, true);
        if (n17 != null) {
            map.put("province", n17.x3());
            map.put("city", n17.v3());
        }
        if (this.f227047e == null) {
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.dx3();
            lVar.f152198b = new r45.ex3();
            lVar.f152199c = H();
            lVar.f152200d = mo808xfb85f7b0();
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            this.f227047e = a17;
            a17.m47986x306cfea3(true);
        }
        r45.dx3 dx3Var = (r45.dx3) this.f227047e.f152243a.f152217a;
        dx3Var.f454356d = I();
        dx3Var.f454357e = 1;
        java.lang.Object[] array = map.keySet().toArray();
        java.util.Arrays.sort(array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = false;
        for (java.lang.Object obj : array) {
            java.lang.String str = (java.lang.String) map.get(obj);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                if (z17) {
                    sb6.append("&");
                }
                sb6.append(obj);
                sb6.append("=");
                sb6.append(str);
                z17 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + dx3Var.f454356d + ", req = " + sb6.toString());
        byte[] bytes = sb6.toString().getBytes();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bytes);
        dx3Var.f454358f = cu5Var;
    }
}

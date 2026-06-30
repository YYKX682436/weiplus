package as4;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p {
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 A;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 B;
    public java.lang.String G;
    public org.json.JSONArray I;

    /* renamed from: x, reason: collision with root package name */
    public boolean f95081x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Map f95082y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f95083z = false;
    public java.lang.String C = null;
    public java.lang.String D = null;
    public java.lang.String E = null;
    public int F = 0;
    public int H = 0;

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x015e. Please report as an issue. */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05, boolean z17) {
        java.lang.String str;
        as4.b bVar;
        java.lang.Boolean bool;
        this.B = c19090x75920c71;
        this.A = c19099x8d444f05;
        if (c19090x75920c71 == null) {
            throw new java.lang.IllegalArgumentException("authen == null");
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) c19099x8d444f05.M;
        java.lang.String str2 = arrayList.size() > 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) arrayList.get(0)).f261247r : null;
        java.lang.String str3 = c19099x8d444f05.f261208e;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = c19090x75920c71.f261090v;
        I(str3, str2, c19760x34448d56.f273642e, c19760x34448d56.f273644g, c19090x75920c71.f261078g, c19090x75920c71.f261079h);
        if (c19090x75920c71.f261090v == null) {
            throw new java.lang.IllegalArgumentException("authen.payInfo == null");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayAuthen", "pay channel :" + c19090x75920c71.f261090v.f273644g);
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f95082y = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        boolean z18 = (z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261077f)) ? false : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayAuthen", "hy: has pwd: %b", java.lang.Boolean.valueOf(z18));
        m83031x824a7eb4(c19090x75920c71.f261090v, hashMap, hashMap2, z18);
        if (z17) {
            hashMap.put("brief_reg", "1");
        } else {
            hashMap.put("passwd", c19090x75920c71.f261077f);
        }
        this.f295596u = c19099x8d444f05.U;
        hashMap.put("default_favorcomposedid", c19090x75920c71.G);
        hashMap.put("favorcomposedid", c19090x75920c71.H);
        hashMap.put("arrive_type", c19090x75920c71.f261089u);
        hashMap.put("sms_flag", c19090x75920c71.I);
        hashMap.put("ban_sms_bind_serial", c19090x75920c71.f261074J);
        hashMap.put("ban_sms_bank_type", c19090x75920c71.K);
        hashMap.put("busi_sms_flag", c19090x75920c71.L);
        hashMap.put("buttontype", c19090x75920c71.f261090v.K + "");
        hashMap.put("mobile_area", c19090x75920c71.M);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayAuthen", "buttontype %s not_support_retry %s, mobile area: %s", java.lang.Integer.valueOf(c19090x75920c71.f261090v.K), java.lang.Integer.valueOf(this.f295596u), c19090x75920c71.M);
        switch (c19090x75920c71.f261075d) {
            case 1:
                str = "";
                hashMap.put("flag", "1");
                hashMap.put("bank_type", c19090x75920c71.f261078g);
                hashMap.put("true_name", c19090x75920c71.f261080i);
                hashMap.put("identify_card", c19090x75920c71.f261081m);
                if (c19090x75920c71.f261082n > 0) {
                    hashMap.put("cre_type", c19090x75920c71.f261082n + str);
                }
                hashMap.put("mobile_no", c19090x75920c71.f261083o);
                hashMap.put("bank_card_id", c19090x75920c71.f261084p);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261085q)) {
                    hashMap.put("cvv2", c19090x75920c71.f261085q);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261086r)) {
                    hashMap.put("valid_thru", c19090x75920c71.f261086r);
                }
                hashMap.put("creid_renewal", java.lang.String.valueOf(c19090x75920c71.N));
                hashMap.put("birth_date", c19090x75920c71.P);
                hashMap.put("cre_expire_date", c19090x75920c71.Q);
                bVar = this;
                break;
            case 2:
                hashMap.put("flag", "2");
                hashMap.put("bank_type", c19090x75920c71.f261078g);
                hashMap.put("h_bind_serial", c19090x75920c71.f261079h);
                hashMap.put("card_tail", c19090x75920c71.f261088t);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261080i)) {
                    hashMap.put("true_name", c19090x75920c71.f261080i);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261081m)) {
                    hashMap.put("identify_card", c19090x75920c71.f261081m);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(c19090x75920c71.f261082n);
                str = "";
                sb6.append(str);
                hashMap.put("cre_type", sb6.toString());
                hashMap.put("mobile_no", c19090x75920c71.f261083o);
                hashMap.put("bank_card_id", c19090x75920c71.f261084p);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261085q)) {
                    hashMap.put("cvv2", c19090x75920c71.f261085q);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261086r)) {
                    hashMap.put("valid_thru", c19090x75920c71.f261086r);
                }
                hashMap.put("creid_renewal", java.lang.String.valueOf(c19090x75920c71.N));
                hashMap.put("birth_date", c19090x75920c71.P);
                hashMap.put("cre_expire_date", c19090x75920c71.Q);
                bVar = this;
                break;
            case 3:
                if (c19090x75920c71.f261076e == 1) {
                    hashMap.put("reset_flag", "1");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261083o)) {
                        hashMap.put("mobile_no", c19090x75920c71.f261083o);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261085q)) {
                        hashMap.put("cvv2", c19090x75920c71.f261085q);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261086r)) {
                        hashMap.put("valid_thru", c19090x75920c71.f261086r);
                    }
                }
                hashMap.put("flag", "3");
                hashMap.put("bank_type", c19090x75920c71.f261078g);
                hashMap.put("bind_serial", c19090x75920c71.f261079h);
                bVar = this;
                str = "";
                break;
            case 4:
                hashMap.put("flag", "4");
                hashMap.put("bank_type", c19090x75920c71.f261078g);
                hashMap.put("first_name", c19090x75920c71.f261091w);
                hashMap.put("last_name", c19090x75920c71.f261092x);
                hashMap.put("country", c19090x75920c71.f261093y);
                hashMap.put("area", c19090x75920c71.f261094z);
                hashMap.put("city", c19090x75920c71.A);
                hashMap.put("address", c19090x75920c71.B);
                hashMap.put("phone_number", c19090x75920c71.C);
                hashMap.put("zip_code", c19090x75920c71.D);
                hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c, c19090x75920c71.E);
                hashMap.put("bank_card_id", c19090x75920c71.f261084p);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261085q)) {
                    hashMap.put("cvv2", c19090x75920c71.f261085q);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261086r)) {
                    hashMap.put("valid_thru", c19090x75920c71.f261086r);
                }
                bVar = this;
                str = "";
                break;
            case 5:
                hashMap.put("flag", "5");
                hashMap.put("bank_type", c19090x75920c71.f261078g);
                hashMap.put("first_name", c19090x75920c71.f261091w);
                hashMap.put("last_name", c19090x75920c71.f261092x);
                hashMap.put("country", c19090x75920c71.f261093y);
                hashMap.put("area", c19090x75920c71.f261094z);
                hashMap.put("city", c19090x75920c71.A);
                hashMap.put("address", c19090x75920c71.B);
                hashMap.put("phone_number", c19090x75920c71.C);
                hashMap.put("zip_code", c19090x75920c71.D);
                hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c, c19090x75920c71.E);
                hashMap.put("bank_card_id", c19090x75920c71.f261084p);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261085q)) {
                    hashMap.put("cvv2", c19090x75920c71.f261085q);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261086r)) {
                    hashMap.put("valid_thru", c19090x75920c71.f261086r);
                }
                hashMap.put("h_bind_serial", c19090x75920c71.f261079h);
                hashMap.put("card_tail", c19090x75920c71.f261088t);
                bVar = this;
                str = "";
                break;
            case 6:
                if (c19090x75920c71.f261076e == 1) {
                    hashMap.put("reset_flag", "1");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261085q)) {
                        hashMap.put("cvv2", c19090x75920c71.f261085q);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19090x75920c71.f261086r)) {
                        hashMap.put("valid_thru", c19090x75920c71.f261086r);
                    }
                }
                hashMap.put("phone_number", c19090x75920c71.f261083o);
                hashMap.put("flag", "6");
                hashMap.put("bank_type", c19090x75920c71.f261078g);
                hashMap.put("bind_serial", c19090x75920c71.f261079h);
                bVar = this;
                str = "";
                break;
            default:
                str = "";
                bVar = this;
                break;
        }
        bVar.J(hashMap);
        bVar.m83032xb4c13117(hashMap);
        java.util.Map F8 = ((pz2.a) gm0.j1.s(pz2.a.class)).F8();
        if (F8 != null) {
            hashMap2.putAll(F8);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = c19090x75920c71.f261090v;
        java.lang.String str4 = c19760x34448d562.N;
        char c17 = c19760x34448d562.P ? (char) 2 : (char) 1;
        boolean z19 = c19760x34448d562.f273658x == 1;
        java.util.Map map = zr4.b.f556730a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) zr4.b.f556730a;
            if (concurrentHashMap.containsKey(str4) && ((java.util.List) concurrentHashMap.get(str4)).size() > 0) {
                if (c17 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var.C(965L, 10L, 1L);
                    g0Var.C(965L, 30L, 1L);
                    if (zr4.b.a(str4)) {
                        g0Var.C(965L, 25L, 1L);
                    }
                } else if (c17 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var2.C(965L, 11L, 1L);
                    g0Var2.C(965L, 31L, 1L);
                    if (zr4.b.a(str4)) {
                        g0Var2.C(965L, 26L, 1L);
                    }
                }
                if (zr4.b.a(str4)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 24L, 1L);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var3.C(965L, 29L, 1L);
                if (z19) {
                    g0Var3.C(965L, 20L, 1L);
                } else {
                    g0Var3.C(965L, 21L, 1L);
                }
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) zr4.b.f556731b;
            if (concurrentHashMap2.containsKey(str4) && (bool = (java.lang.Boolean) concurrentHashMap2.get(str4)) != null) {
                if (bool.booleanValue()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 18L, 1L);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 19L, 1L);
                }
            }
        }
        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295447a) {
            hashMap2.put("uuid_for_bindcard", com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295449c);
            hashMap2.put("bindcard_scene", str + com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295448b);
        }
        bVar.m83033x7c1e2016(hashMap2);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p
    public boolean H() {
        int i17 = this.B.f261090v.f273642e;
        return i17 == 11 || i17 == 21;
    }

    public void J(java.util.Map map) {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        int i17 = this.B.f261090v.f273642e;
        if (i17 == 11) {
            return 1610;
        }
        return i17 == 21 ? 1605 : 461;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: getToken */
    public java.lang.String mo8967x75346043() {
        return this.C;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        int i17 = this.B.f261090v.f273642e;
        return i17 == 11 ? "/cgi-bin/mmpay-bin/tenpay/saveauthen" : i17 == 21 ? "/cgi-bin/mmpay-bin/tenpay/fetchauthen" : "/cgi-bin/mmpay-bin/tenpay/authen";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p, com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.r, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.mo1065x5f9cdc6f(i17, str, jSONObject);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayAuthen", " errCode: " + i17 + " errMsg :" + str);
        this.f95083z = "1".equals(jSONObject.optString("is_free_sms"));
        this.C = jSONObject.optString("token");
        this.D = jSONObject.optString("balance_mobile");
        this.E = jSONObject.optString("balance_help_url");
        jSONObject.optString("modify_mobile_url");
        java.lang.String optString = jSONObject.optString("bind_serial");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayAuthen", "Pay Success! saving bind_serial:" + optString);
        }
        if ("1".equals(jSONObject.optString("pay_flag"))) {
            m83053x37d0a03d(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.A;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.g(jSONObject, c19099x8d444f05);
            this.A = c19099x8d444f05;
        } else {
            m83053x37d0a03d(false);
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("verify_cre_tail_info");
        if (optJSONObject != null) {
            this.F = optJSONObject.optInt("is_can_verify_tail", 0);
            this.G = optJSONObject.optString("verify_tail_wording");
        }
        this.H = jSONObject.optInt("no_reset_mobile", 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pay_scene:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = this.B;
        sb6.append(c19090x75920c71.f261090v.f273642e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayAuthen", sb6.toString());
        if (c19090x75920c71.f261090v.f273642e == 21) {
            this.I = jSONObject.optJSONArray("fetch_charge_show_info");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_FETCH_CHARGE_RATE_VERSION_STRING_SYNC, jSONObject.optString("charge_rate_version"));
        }
        if (i17 == 0 && c19090x75920c71.f261090v.f273642e == 39) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayAuthen", "it's the sns scene, parse the sns pay data");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.a1.a(jSONObject);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayAuthen", "it's not the sns scene or occurs error,  errCode:" + i17);
        }
        java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p2802xd031a825.a.f("PayProcess")).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2802xd031a825.h) it.next()).f295334c.putInt("key_is_clear_failure", this.f295598w);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p, com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.r, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd2 */
    public void mo8968x93feb1a3(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar, org.json.JSONObject jSONObject) {
        super.mo8968x93feb1a3(oVar, jSONObject);
        int i17 = this.f39856x4b17cde4;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = this.B;
        if (i17 != 0 || this.f39855x4b0fec97 != 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = c19090x75920c71.f261090v;
            zr4.b.b(c19760x34448d56.N, c19760x34448d56.P ? 2 : 1, c19760x34448d56.f273658x == 1);
            java.lang.String str = c19090x75920c71.f261090v.N;
            boolean m83005xab5ceedf = m83005xab5ceedf();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            ((java.util.concurrent.ConcurrentHashMap) zr4.b.f556731b).put(str, java.lang.Boolean.valueOf(m83005xab5ceedf));
            return;
        }
        if (this.f39883x9cd69705) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = c19090x75920c71.f261090v;
            zr4.b.b(c19760x34448d562.N, c19760x34448d562.P ? 2 : 1, c19760x34448d562.f273658x == 1);
            java.lang.String str2 = c19090x75920c71.f261090v.N;
            boolean m83005xab5ceedf2 = m83005xab5ceedf();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            ((java.util.concurrent.ConcurrentHashMap) zr4.b.f556731b).put(str2, java.lang.Boolean.valueOf(m83005xab5ceedf2));
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: resend */
    public boolean mo8969xc84d8c3b() {
        super.mo8969xc84d8c3b();
        java.util.Map<java.lang.String, java.lang.String> map = this.f95082y;
        ((java.util.HashMap) map).put("is_repeat_send", "1");
        m83032xb4c13117(map);
        this.f95081x = true;
        return true;
    }
}

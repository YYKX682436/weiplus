package wo3;

/* loaded from: classes9.dex */
public class l extends wo3.h {

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f529724r;

    /* renamed from: s, reason: collision with root package name */
    public int f529725s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f529726t;

    /* renamed from: w, reason: collision with root package name */
    public final int f529729w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f529730x;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f529715f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f529716g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f529717h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f529718i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f529719m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f529720n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f529721o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f529722p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f529723q = "";

    /* renamed from: u, reason: collision with root package name */
    public int f529727u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f529728v = 0;

    public l(java.lang.String str, int i17, int i18) {
        java.lang.String str2;
        int i19;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String g17 = kk.k.g((java.lang.System.currentTimeMillis() + "").getBytes());
        this.f529730x = g17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        java.lang.String e17 = yo3.m.e();
        java.lang.String Ni = to3.c0.Ai().Ni(196628);
        Ni = android.text.TextUtils.isEmpty(Ni) ? wo.w0.k() : Ni;
        if (android.text.TextUtils.isEmpty(e17)) {
            str2 = Ni + "&" + str + "&" + (((int) (java.lang.Math.random() * 1000000.0d)) + 1000000);
        } else {
            str2 = Ni + "&" + str + "&" + (((int) (java.lang.Math.random() * 1000000.0d)) + 1000000) + "&" + e17;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("token_src", str2);
        java.lang.String Ni2 = to3.c0.Ai().Ni(196617);
        switch (i18) {
            case 1:
                i19 = 13;
                break;
            case 2:
                i19 = 14;
                break;
            case 3:
                i19 = 15;
                break;
            case 4:
                i19 = 16;
                break;
            case 5:
                i19 = 17;
                break;
            case 6:
                i19 = 18;
                break;
            case 7:
                i19 = 19;
                break;
            case 8:
                i19 = 20;
                break;
            case 9:
                i19 = 24;
                break;
            case 10:
                i19 = 72;
                break;
            default:
                i19 = 12;
                break;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(135L, i19, 1L, true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6297x82a764ea c6297x82a764ea = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6297x82a764ea();
        c6297x82a764ea.f136573h = c6297x82a764ea.b("session2", g17, true);
        c6297x82a764ea.f136569d = 1L;
        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().g(Ni2)) {
            c6297x82a764ea.f136570e = 1;
            c6297x82a764ea.f136571f = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().d();
            c6297x82a764ea.k();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6297x82a764ea c6297x82a764ea2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6297x82a764ea();
            c6297x82a764ea2.f136573h = c6297x82a764ea2.b("session2", g17, true);
            c6297x82a764ea2.f136569d = 3L;
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
            str4 = com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121777xc5c0ef96(Ni2, str2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                c6297x82a764ea2.f136570e = 0;
                c6297x82a764ea2.f136571f = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().d();
                c6297x82a764ea2.k();
            } else {
                c6297x82a764ea2.f136570e = 1;
                c6297x82a764ea2.f136571f = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().d();
                c6297x82a764ea2.k();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().isCertExist(cn) true");
            str3 = "MicroMsg.NetSceneTenpayWxOfflineGetToken";
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", "NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().getLastError():" + com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().d());
            c6297x82a764ea.f136570e = 0;
            c6297x82a764ea.f136571f = (long) com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().d();
            c6297x82a764ea.k();
            str3 = "MicroMsg.NetSceneTenpayWxOfflineGetToken";
            g0Var.mo68477x336bdfd8(135L, 6L, 1L, true);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6297x82a764ea c6297x82a764ea3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6297x82a764ea();
            c6297x82a764ea3.f136573h = c6297x82a764ea3.b("session2", g17, true);
            c6297x82a764ea3.f136569d = 2L;
            gm0.j1.i();
            java.lang.String str6 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_IEMI_STRING_SYNC, "");
            if (str6 == null || !str6.equals(wo.w0.g(true))) {
                c6297x82a764ea3.f136570e = 0;
                c6297x82a764ea3.f136571f = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().d();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, " NetSceneTenpayWxOfflineGetToken iemi is diff between create and getToken");
                g0Var.mo68477x336bdfd8(135L, 5L, 1L, true);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, " NetSceneTenpayWxOfflineGetToken iemi is same between create and getToken");
                c6297x82a764ea3.f136570e = 1;
                c6297x82a764ea3.f136571f = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().d();
            }
            c6297x82a764ea3.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, " NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().isCertExist return false! cn: " + Ni2);
            str4 = "";
        }
        if (android.text.TextUtils.isEmpty(str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, " NetSceneTenpayWxOfflineGetToken sign is empty!");
            g0Var.mo68477x336bdfd8(135L, 4L, 1L, true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "sign is valid");
        }
        hashMap.put("sign", str4);
        hashMap.put("cert_no", Ni2);
        int i27 = wo3.k.f529701t;
        hashMap.put("type", "3");
        hashMap.put("version_number", "3");
        java.lang.String Ni3 = to3.c0.Ai().Ni(196644);
        if (((android.text.TextUtils.isEmpty(Ni3) || !yo3.m.j(Ni3)) ? 0 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(Ni3, 0)) == 2) {
            if (android.text.TextUtils.isEmpty(yo3.m.f545688b)) {
                gm0.j1.n().f354821b.g(new c01.ra(new yo3.j(), null));
                if (android.text.TextUtils.isEmpty(yo3.m.f545688b)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOfflineUtil", "offline_token_v2 is null");
                }
                str5 = yo3.m.f545688b;
            } else {
                str5 = yo3.m.f545688b;
            }
            hashMap.put("last_token", str5);
        } else {
            hashMap.put("last_token", yo3.m.e());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "inOfflineUI: %B", java.lang.Boolean.valueOf(to3.c0.f502484i));
        if (i17 == 65281) {
            hashMap.put("fetch_tag", java.lang.String.valueOf(2));
        } else if (to3.c0.f502484i) {
            hashMap.put("fetch_tag", java.lang.String.valueOf(1));
        } else {
            hashMap.put("fetch_tag", java.lang.String.valueOf(0));
        }
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "" + (i17 == 65281 ? 3 : i17));
        yo3.m.l();
        this.f529729w = 1;
        hashMap.put("is_new_authcodes", "1");
        hashMap.put("code_ver", "" + gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, ""));
        m174273xb4c13117(hashMap);
    }

    public static r45.ak0 I(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        r45.ak0 ak0Var = new r45.ak0();
        ak0Var.f451594d = jSONObject.optInt("is_need_show", 0);
        ak0Var.f451596f = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        ak0Var.f451597g = jSONObject.optString("button");
        ak0Var.f451595e = jSONObject.optString("icon");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC, jSONObject.toString());
        return ak0Var;
    }

    @Override // wo3.h
    public void H(int i17, java.lang.String str, java.lang.String str2) {
        try {
            I(new org.json.JSONObject(str2).optJSONObject("enable_code_page"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneTenpayWxOfflineGetToken", e17, "", new java.lang.Object[0]);
        }
    }

    public boolean J() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "do save token");
        to3.c0.Ai().Vi(196626, this.f529716g);
        to3.c0.Ai().Vi(196627, this.f529717h);
        to3.c0.Ai().Vi(196628, this.f529718i);
        to3.c0.Ai().Vi(196632, "" + (java.lang.System.currentTimeMillis() / 1000));
        yo3.m.t(this.f529715f, this.f529719m, this.f529721o, this.f529722p, this.f529729w == 1 ? 2 : 1);
        int i17 = this.f529720n;
        to3.c0.Ai().Vi(196644, "" + i17);
        to3.c0.Ai().Vi(196647, this.f529723q);
        java.lang.String Ni = to3.c0.Ai().Ni(196617);
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().a(Ni);
        boolean h17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().h(Ni, this.f529724r, this.f529728v == 1);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6297x82a764ea c6297x82a764ea = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6297x82a764ea();
        c6297x82a764ea.f136573h = c6297x82a764ea.b("session2", this.f529730x, true);
        c6297x82a764ea.f136569d = 3L;
        if (h17) {
            c6297x82a764ea.f136570e = 1;
            c6297x82a764ea.f136571f = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens success!");
        } else {
            c6297x82a764ea.f136570e = 0;
            c6297x82a764ea.f136571f = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens failed!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", "WalletOfflineEntranceUI CertUtil.getInstance().getLastError():" + com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().d());
        }
        c6297x82a764ea.k();
        to3.c0.Ai().Vi(196649, "" + this.f529725s);
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, this.f529726t);
        return h17;
    }

    @Override // wo3.h
    /* renamed from: getFuncId */
    public int mo174269x19c9adf5() {
        return to3.c0.f502484i ? 571 : 1725;
    }

    @Override // wo3.h
    /* renamed from: getTenpayCgicmd */
    public int mo174270x46809856() {
        return to3.c0.f502484i ? 52 : 1725;
    }

    @Override // wo3.h
    /* renamed from: getUri */
    public java.lang.String mo174271xb5887636() {
        return to3.c0.f502484i ? "/cgi-bin/mmpay-bin/tenpay/offlinegettoken" : "/cgi-bin/mmpay-bin/tenpay/offlinegettokenbackground";
    }

    @Override // wo3.h
    /* renamed from: onGYNetEnd */
    public void mo174272x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0 || jSONObject == null) {
            return;
        }
        this.f529715f = jSONObject.optString("token");
        this.f529716g = jSONObject.optString("valid_end");
        this.f529717h = jSONObject.optString("encrypt_str");
        this.f529718i = jSONObject.optString("deviceid");
        this.f529719m = jSONObject.optString("token_v2");
        this.f529720n = jSONObject.optInt("algorithm_type");
        this.f529721o = jSONObject.optString("card_list");
        this.f529722p = jSONObject.optString("key_list");
        this.f529723q = jSONObject.optString("token_pin");
        this.f529724r = jSONObject.optString("auth_codes");
        this.f529725s = jSONObject.optInt("update_interval");
        this.f529726t = jSONObject.optString("code_ver");
        this.f529727u = jSONObject.optInt("reget_token_num", 0);
        this.f529728v = jSONObject.optInt("cipher_type", 0);
        yo3.m.r(this.f529727u);
        jSONObject.toString();
    }
}

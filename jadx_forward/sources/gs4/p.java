package gs4;

/* loaded from: classes9.dex */
public class p extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f356660m = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f356661d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f356662e;

    /* renamed from: f, reason: collision with root package name */
    public int f356663f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f356664g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f356665h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f356666i;

    public p() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("deviceid", wo.w0.g(false));
        m83032xb4c13117(hashMap);
    }

    public boolean H(java.lang.String str) {
        char charAt;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        int length = str.length();
        do {
            length--;
            if (length >= 0) {
                charAt = str.charAt(length);
                if (charAt < '0') {
                    break;
                }
            } else {
                return true;
            }
        } while (charAt <= '9');
        return false;
    }

    public final at4.m1 I(org.json.JSONObject jSONObject, java.lang.String str) {
        at4.m1 m1Var = new at4.m1();
        m1Var.f66695xf0aedead = jSONObject.optInt("show_label", 0);
        m1Var.f66699xd0f0afe8 = str;
        m1Var.f66700x5804f5a1 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        m1Var.f66698x4d221e28 = jSONObject.optString("desc");
        m1Var.f66697x96a1f680 = jSONObject.optString("logo_url");
        m1Var.f66696xc374eba6 = jSONObject.optInt("jump_type");
        m1Var.f66701xd0f0d6f8 = jSONObject.optString("jump_h5_url");
        m1Var.f66703x61257cd9 = jSONObject.optString("tinyapp_username");
        m1Var.f66702xebf8d1a8 = jSONObject.optString("tinyapp_path");
        return m1Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1654;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: getPayCgicmd */
    public int mo83013xb2b366a7() {
        return 100000;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/paymanage";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayPayManager", "errCode:" + i17 + ";errMsg:" + str);
        jSONObject.toString();
        if (i17 == 0) {
            java.lang.String optString = jSONObject.optString("is_show_deduct", "0");
            this.f356661d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(H(optString) ? optString : "0", 0);
            this.f356662e = jSONObject.optString("deduct_show_url", "");
            java.lang.String optString2 = jSONObject.optString("deduct_cache_time", "");
            if (!H(optString2)) {
                optString2 = "84600";
            }
            this.f356663f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(optString2, 0);
            this.f356664g = jSONObject.optString("deduct_title", "");
            this.f356665h = jSONObject.optString("realname_url", "");
            this.f356666i = jSONObject.optString("forget_pwd_url", "");
            java.lang.String optString3 = jSONObject.optString("payway_select_wording", "");
            java.lang.String optString4 = jSONObject.optString("payway_change_wording", "");
            at4.m1 m1Var = new at4.m1();
            m1Var.f66695xf0aedead = this.f356661d;
            m1Var.f66699xd0f0afe8 = "wallet_open_auto_pay";
            m1Var.f66700x5804f5a1 = this.f356664g;
            m1Var.f66701xd0f0d6f8 = this.f356662e;
            m1Var.f66696xc374eba6 = 1;
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().y0("wallet_open_auto_pay");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayPayManager", "deductCacheTime %s forget_pwd_url %s", java.lang.Integer.valueOf(this.f356663f), this.f356666i);
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().mo880xb970c2b9(m1Var);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("switch_wallet");
            if (optJSONObject != null) {
                at4.m1 I = I(optJSONObject, "wallet_switch_currency");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().y0("wallet_switch_currency");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().mo880xb970c2b9(I);
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("im_mch");
            if (optJSONObject2 != null) {
                at4.m1 I2 = I(optJSONObject2, "wallet_im_mch");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().y0("wallet_im_mch");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().mo880xb970c2b9(I2);
            }
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("deduct_manage");
            if (optJSONObject3 != null) {
                at4.m1 I3 = I(optJSONObject3, "wallet_open_auto_pay");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().y0("wallet_open_auto_pay");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().mo880xb970c2b9(I3);
            }
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("extra_sections");
            if (optJSONArray != null) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAY_MANAGE_EXTRA_SECTION_DATA_STRING_SYNC, optJSONArray.toString());
            } else {
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAY_MANAGE_EXTRA_SECTION_DATA_STRING_SYNC, " ");
            }
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("unreg_info");
            if (optJSONObject4 != null) {
                java.lang.String optString5 = optJSONObject4.optString("unreg_title", "");
                java.lang.String optString6 = optJSONObject4.optString("unreg_url", "");
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_USERINFO_UNREGTITLE_TYPE_STRING_SYNC, optString5);
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_USERINFO_UNREGURL_TYPE_STRING_SYNC, optString6);
            } else {
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_USERINFO_UNREGTITLE_TYPE_STRING_SYNC, "");
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_USERINFO_UNREGURL_TYPE_STRING_SYNC, "");
            }
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_PREF_INFO_CACHE_TIME_LONG_SYNC, java.lang.Long.valueOf(new java.util.Date().getTime() / 1000));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_PREF_INFO_EXPIRES_INT_SYNC, java.lang.Integer.valueOf(this.f356663f));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REALNAME_URL_STRING_SYNC, this.f356665h);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_DEDUCT_FORGET_URL_STRING, this.f356666i);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_DEDUCT_SELECT_WORDING_STRING, optString3);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_DEDUCT_CHANGE_WORDING_STRING, optString4);
            }
            gm0.j1.i();
            gm0.j1.u().c().i(true);
        }
    }
}

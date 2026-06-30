package as4;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.wallet_core.tenpay.model.p {
    public com.tencent.mm.plugin.wallet_core.model.Orders A;
    public final com.tencent.mm.plugin.wallet_core.model.Authen B;
    public java.lang.String G;
    public org.json.JSONArray I;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13548x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Map f13549y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13550z = false;
    public java.lang.String C = null;
    public java.lang.String D = null;
    public java.lang.String E = null;
    public int F = 0;
    public int H = 0;

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x015e. Please report as an issue. */
    public b(com.tencent.mm.plugin.wallet_core.model.Authen authen, com.tencent.mm.plugin.wallet_core.model.Orders orders, boolean z17) {
        java.lang.String str;
        as4.b bVar;
        java.lang.Boolean bool;
        this.B = authen;
        this.A = orders;
        if (authen == null) {
            throw new java.lang.IllegalArgumentException("authen == null");
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) orders.M;
        java.lang.String str2 = arrayList.size() > 0 ? ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) arrayList.get(0)).f179714r : null;
        java.lang.String str3 = orders.f179675e;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = authen.f179557v;
        I(str3, str2, payInfo.f192109e, payInfo.f192111g, authen.f179545g, authen.f179546h);
        if (authen.f179557v == null) {
            throw new java.lang.IllegalArgumentException("authen.payInfo == null");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayAuthen", "pay channel :" + authen.f179557v.f192111g);
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f13549y = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        boolean z18 = (z17 || com.tencent.mm.sdk.platformtools.t8.K0(authen.f179544f)) ? false : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayAuthen", "hy: has pwd: %b", java.lang.Boolean.valueOf(z18));
        setPayInfo(authen.f179557v, hashMap, hashMap2, z18);
        if (z17) {
            hashMap.put("brief_reg", "1");
        } else {
            hashMap.put("passwd", authen.f179544f);
        }
        this.f214063u = orders.U;
        hashMap.put("default_favorcomposedid", authen.G);
        hashMap.put("favorcomposedid", authen.H);
        hashMap.put("arrive_type", authen.f179556u);
        hashMap.put("sms_flag", authen.I);
        hashMap.put("ban_sms_bind_serial", authen.f179541J);
        hashMap.put("ban_sms_bank_type", authen.K);
        hashMap.put("busi_sms_flag", authen.L);
        hashMap.put("buttontype", authen.f179557v.K + "");
        hashMap.put("mobile_area", authen.M);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayAuthen", "buttontype %s not_support_retry %s, mobile area: %s", java.lang.Integer.valueOf(authen.f179557v.K), java.lang.Integer.valueOf(this.f214063u), authen.M);
        switch (authen.f179542d) {
            case 1:
                str = "";
                hashMap.put("flag", "1");
                hashMap.put("bank_type", authen.f179545g);
                hashMap.put("true_name", authen.f179547i);
                hashMap.put("identify_card", authen.f179548m);
                if (authen.f179549n > 0) {
                    hashMap.put("cre_type", authen.f179549n + str);
                }
                hashMap.put("mobile_no", authen.f179550o);
                hashMap.put("bank_card_id", authen.f179551p);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179552q)) {
                    hashMap.put("cvv2", authen.f179552q);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179553r)) {
                    hashMap.put("valid_thru", authen.f179553r);
                }
                hashMap.put("creid_renewal", java.lang.String.valueOf(authen.N));
                hashMap.put("birth_date", authen.P);
                hashMap.put("cre_expire_date", authen.Q);
                bVar = this;
                break;
            case 2:
                hashMap.put("flag", "2");
                hashMap.put("bank_type", authen.f179545g);
                hashMap.put("h_bind_serial", authen.f179546h);
                hashMap.put("card_tail", authen.f179555t);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179547i)) {
                    hashMap.put("true_name", authen.f179547i);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179548m)) {
                    hashMap.put("identify_card", authen.f179548m);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(authen.f179549n);
                str = "";
                sb6.append(str);
                hashMap.put("cre_type", sb6.toString());
                hashMap.put("mobile_no", authen.f179550o);
                hashMap.put("bank_card_id", authen.f179551p);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179552q)) {
                    hashMap.put("cvv2", authen.f179552q);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179553r)) {
                    hashMap.put("valid_thru", authen.f179553r);
                }
                hashMap.put("creid_renewal", java.lang.String.valueOf(authen.N));
                hashMap.put("birth_date", authen.P);
                hashMap.put("cre_expire_date", authen.Q);
                bVar = this;
                break;
            case 3:
                if (authen.f179543e == 1) {
                    hashMap.put("reset_flag", "1");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179550o)) {
                        hashMap.put("mobile_no", authen.f179550o);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179552q)) {
                        hashMap.put("cvv2", authen.f179552q);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179553r)) {
                        hashMap.put("valid_thru", authen.f179553r);
                    }
                }
                hashMap.put("flag", "3");
                hashMap.put("bank_type", authen.f179545g);
                hashMap.put("bind_serial", authen.f179546h);
                bVar = this;
                str = "";
                break;
            case 4:
                hashMap.put("flag", "4");
                hashMap.put("bank_type", authen.f179545g);
                hashMap.put("first_name", authen.f179558w);
                hashMap.put("last_name", authen.f179559x);
                hashMap.put("country", authen.f179560y);
                hashMap.put("area", authen.f179561z);
                hashMap.put("city", authen.A);
                hashMap.put("address", authen.B);
                hashMap.put("phone_number", authen.C);
                hashMap.put("zip_code", authen.D);
                hashMap.put(com.google.android.gms.common.Scopes.EMAIL, authen.E);
                hashMap.put("bank_card_id", authen.f179551p);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179552q)) {
                    hashMap.put("cvv2", authen.f179552q);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179553r)) {
                    hashMap.put("valid_thru", authen.f179553r);
                }
                bVar = this;
                str = "";
                break;
            case 5:
                hashMap.put("flag", "5");
                hashMap.put("bank_type", authen.f179545g);
                hashMap.put("first_name", authen.f179558w);
                hashMap.put("last_name", authen.f179559x);
                hashMap.put("country", authen.f179560y);
                hashMap.put("area", authen.f179561z);
                hashMap.put("city", authen.A);
                hashMap.put("address", authen.B);
                hashMap.put("phone_number", authen.C);
                hashMap.put("zip_code", authen.D);
                hashMap.put(com.google.android.gms.common.Scopes.EMAIL, authen.E);
                hashMap.put("bank_card_id", authen.f179551p);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179552q)) {
                    hashMap.put("cvv2", authen.f179552q);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179553r)) {
                    hashMap.put("valid_thru", authen.f179553r);
                }
                hashMap.put("h_bind_serial", authen.f179546h);
                hashMap.put("card_tail", authen.f179555t);
                bVar = this;
                str = "";
                break;
            case 6:
                if (authen.f179543e == 1) {
                    hashMap.put("reset_flag", "1");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179552q)) {
                        hashMap.put("cvv2", authen.f179552q);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179553r)) {
                        hashMap.put("valid_thru", authen.f179553r);
                    }
                }
                hashMap.put("phone_number", authen.f179550o);
                hashMap.put("flag", "6");
                hashMap.put("bank_type", authen.f179545g);
                hashMap.put("bind_serial", authen.f179546h);
                bVar = this;
                str = "";
                break;
            default:
                str = "";
                bVar = this;
                break;
        }
        bVar.J(hashMap);
        bVar.setRequestData(hashMap);
        java.util.Map F8 = ((pz2.a) gm0.j1.s(pz2.a.class)).F8();
        if (F8 != null) {
            hashMap2.putAll(F8);
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = authen.f179557v;
        java.lang.String str4 = payInfo2.N;
        char c17 = payInfo2.P ? (char) 2 : (char) 1;
        boolean z19 = payInfo2.f192125x == 1;
        java.util.Map map = zr4.b.f475197a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) zr4.b.f475197a;
            if (concurrentHashMap.containsKey(str4) && ((java.util.List) concurrentHashMap.get(str4)).size() > 0) {
                if (c17 == 1) {
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.C(965L, 10L, 1L);
                    g0Var.C(965L, 30L, 1L);
                    if (zr4.b.a(str4)) {
                        g0Var.C(965L, 25L, 1L);
                    }
                } else if (c17 == 2) {
                    com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var2.C(965L, 11L, 1L);
                    g0Var2.C(965L, 31L, 1L);
                    if (zr4.b.a(str4)) {
                        g0Var2.C(965L, 26L, 1L);
                    }
                }
                if (zr4.b.a(str4)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 24L, 1L);
                }
                com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var3.C(965L, 29L, 1L);
                if (z19) {
                    g0Var3.C(965L, 20L, 1L);
                } else {
                    g0Var3.C(965L, 21L, 1L);
                }
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) zr4.b.f475198b;
            if (concurrentHashMap2.containsKey(str4) && (bool = (java.lang.Boolean) concurrentHashMap2.get(str4)) != null) {
                if (bool.booleanValue()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 18L, 1L);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 19L, 1L);
                }
            }
        }
        if (com.tencent.mm.wallet_core.model.i1.f213914a) {
            hashMap2.put("uuid_for_bindcard", com.tencent.mm.wallet_core.model.i1.f213916c);
            hashMap2.put("bindcard_scene", str + com.tencent.mm.wallet_core.model.i1.f213915b);
        }
        bVar.setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.p
    public boolean H() {
        int i17 = this.B.f179557v.f192109e;
        return i17 == 11 || i17 == 21;
    }

    public void J(java.util.Map map) {
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        int i17 = this.B.f179557v.f192109e;
        if (i17 == 11) {
            return 1610;
        }
        return i17 == 21 ? 1605 : 461;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public java.lang.String getToken() {
        return this.C;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        int i17 = this.B.f179557v.f192109e;
        return i17 == 11 ? "/cgi-bin/mmpay-bin/tenpay/saveauthen" : i17 == 21 ? "/cgi-bin/mmpay-bin/tenpay/fetchauthen" : "/cgi-bin/mmpay-bin/tenpay/authen";
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.p, com.tencent.mm.wallet_core.tenpay.model.r, com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.onGYNetEnd(i17, str, jSONObject);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayAuthen", " errCode: " + i17 + " errMsg :" + str);
        this.f13550z = "1".equals(jSONObject.optString("is_free_sms"));
        this.C = jSONObject.optString("token");
        this.D = jSONObject.optString("balance_mobile");
        this.E = jSONObject.optString("balance_help_url");
        jSONObject.optString("modify_mobile_url");
        java.lang.String optString = jSONObject.optString("bind_serial");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayAuthen", "Pay Success! saving bind_serial:" + optString);
        }
        if ("1".equals(jSONObject.optString("pay_flag"))) {
            setPaySuccess(true);
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.A;
            com.tencent.mm.plugin.wallet_core.model.Orders.g(jSONObject, orders);
            this.A = orders;
        } else {
            setPaySuccess(false);
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("verify_cre_tail_info");
        if (optJSONObject != null) {
            this.F = optJSONObject.optInt("is_can_verify_tail", 0);
            this.G = optJSONObject.optString("verify_tail_wording");
        }
        this.H = jSONObject.optInt("no_reset_mobile", 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pay_scene:");
        com.tencent.mm.plugin.wallet_core.model.Authen authen = this.B;
        sb6.append(authen.f179557v.f192109e);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayAuthen", sb6.toString());
        if (authen.f179557v.f192109e == 21) {
            this.I = jSONObject.optJSONArray("fetch_charge_show_info");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_FETCH_CHARGE_RATE_VERSION_STRING_SYNC, jSONObject.optString("charge_rate_version"));
        }
        if (i17 == 0 && authen.f179557v.f192109e == 39) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayAuthen", "it's the sns scene, parse the sns pay data");
            com.tencent.mm.plugin.wallet_core.utils.a1.a(jSONObject);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayAuthen", "it's not the sns scene or occurs error,  errCode:" + i17);
        }
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.wallet_core.a.f("PayProcess")).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.wallet_core.h) it.next()).f213801c.putInt("key_is_clear_failure", this.f214065w);
        }
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.p, com.tencent.mm.wallet_core.tenpay.model.r, com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd2(com.tencent.mm.wallet_core.model.o oVar, org.json.JSONObject jSONObject) {
        super.onGYNetEnd2(oVar, jSONObject);
        int i17 = this.SVR_ERR_TYPE;
        com.tencent.mm.plugin.wallet_core.model.Authen authen = this.B;
        if (i17 != 0 || this.SVR_ERR_CODE != 0) {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = authen.f179557v;
            zr4.b.b(payInfo.N, payInfo.P ? 2 : 1, payInfo.f192125x == 1);
            java.lang.String str = authen.f179557v.N;
            boolean checkRecSrvResp = checkRecSrvResp();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            ((java.util.concurrent.ConcurrentHashMap) zr4.b.f475198b).put(str, java.lang.Boolean.valueOf(checkRecSrvResp));
            return;
        }
        if (this.isPaySuccess) {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = authen.f179557v;
            zr4.b.b(payInfo2.N, payInfo2.P ? 2 : 1, payInfo2.f192125x == 1);
            java.lang.String str2 = authen.f179557v.N;
            boolean checkRecSrvResp2 = checkRecSrvResp();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            ((java.util.concurrent.ConcurrentHashMap) zr4.b.f475198b).put(str2, java.lang.Boolean.valueOf(checkRecSrvResp2));
        }
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public boolean resend() {
        super.resend();
        java.util.Map<java.lang.String, java.lang.String> map = this.f13549y;
        ((java.util.HashMap) map).put("is_repeat_send", "1");
        setRequestData(map);
        this.f13548x = true;
        return true;
    }
}

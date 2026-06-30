package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class q0 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t {
    public final int A;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public int G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f238496J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5409x1e816faf P;
    public r45.o10 R;
    public final java.lang.String S;
    public int T;
    public java.lang.String U;
    public long V;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.p0 f238499f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.o0 f238500g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f238502i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f238503m;

    /* renamed from: n, reason: collision with root package name */
    public double f238504n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f238505o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238506p;

    /* renamed from: q, reason: collision with root package name */
    public double f238507q;

    /* renamed from: r, reason: collision with root package name */
    public double f238508r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f238509s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f238510t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f238511u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f238512v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f238513w;

    /* renamed from: x, reason: collision with root package name */
    public int f238514x;

    /* renamed from: y, reason: collision with root package name */
    public final double f238515y;

    /* renamed from: z, reason: collision with root package name */
    public at4.a f238516z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f238497d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f238498e = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f238501h = "";
    public java.lang.String B = "";
    public java.lang.String C = "";
    public int Q = 0;
    public int W = 0;

    public q0(double d17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4, int i19, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i27, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5409x1e816faf c5409x1e816faf, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, int i28, java.lang.String str19, int i29, java.lang.String str20, java.lang.String str21, boolean z17) {
        int i37;
        int i38 = 0;
        this.f238515y = 0.0d;
        this.P = null;
        this.S = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceGen", "payScene: %s, channel: %s dynamicCodeUrl: %s mch_name: %s nickname: %s receiver_true_name %s placeorder_reserves: %s unpayType: %s cancel_outtradeno:%s cancel_reason:%s placeorderAttach:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27), str11, str12, str13, str14, str18, i28 + "", str19, java.lang.Integer.valueOf(i29), str21);
        this.f238515y = d17;
        this.A = i17;
        this.S = str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17 + "");
        hashMap.put("transfer_scene", i18 + "");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(java.lang.Math.round(d17 * 100.0d));
        hashMap.put("fee", sb6.toString());
        hashMap.put("fee_type", str);
        hashMap.put("receiver_name", str2);
        hashMap.put("receiver_openid", str10);
        hashMap.put("mask_truename", str3);
        hashMap.put("mch_name", str12);
        hashMap.put("nickname", str13);
        hashMap.put("receiver_true_name", str14);
        hashMap.put("dynamic_code_source", (c5409x1e816faf == null || c5409x1e816faf.f135755g.f88077c != 1) ? "0" : "1");
        hashMap.put("input_name", str15);
        hashMap.put("checkname_sign", str16);
        hashMap.put("truename_extend", str17);
        hashMap.put("placeorder_reserves", str18);
        hashMap.put("cancel_outtradeno", str19);
        hashMap.put("unpay_type", i28 + "");
        hashMap.put("cancel_reason", i29 + "");
        hashMap.put("group_username", str20);
        hashMap.put("placeorder_attach", str21);
        if (z17) {
            hashMap.put("has_try_hkpay", "1");
        } else {
            hashMap.put("has_try_hkpay", "0");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str20)) {
            if (c01.e2.E(str20)) {
                hashMap.put("group_type", "2");
            } else {
                hashMap.put("group_type", "1");
            }
        }
        this.P = c5409x1e816faf;
        try {
            if (i17 == 33 || i17 == 32) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    hashMap.put("f2f_payer_desc", fp.s0.b(str4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
                    hashMap.put("desc", fp.s0.b(str8, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str11)) {
                    hashMap.put("dynamic_code_url", fp.s0.b(str11, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                }
            } else {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    hashMap.put("desc", fp.s0.b(str4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                    loop0: for (int i39 = 0; i39 < str4.length(); i39++) {
                        for (int i47 = 0; i47 < str7.length(); i47++) {
                            if (str4.charAt(i39) == str7.charAt(i47)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceGen", "find equal char: %s, %s, %s", java.lang.Character.valueOf(str4.charAt(i39)), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i47));
                                i37 = 1;
                                break loop0;
                            }
                        }
                    }
                }
                i37 = 0;
                hashMap.put("desc_has_address", java.lang.String.valueOf(i37));
            }
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.NetSceneTenpayRemittanceGen", e17.getMessage(), e17);
        }
        hashMap.put("transfer_qrcode_id", str9);
        if (i18 == 0 || i18 == 2) {
            gm0.j1.i();
            long longValue = ((java.lang.Long) gm0.j1.u().c().l(147457, 0L)).longValue();
            if ((16 & longValue) != 0) {
                i38 = 2;
            } else if ((longValue & 32) != 0) {
                i38 = 1;
            }
            hashMap.put("delay_confirm_flag", "" + i38);
        }
        m83032xb4c13117(hashMap);
        int i48 = this.A;
        if (i48 == 32 || i48 == 33) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("channel", i27 + "");
            m83033x7c1e2016(hashMap2);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        int i17 = this.A;
        if (i17 == 32 || i17 == 33) {
            return fe1.f.f69738x366c91de;
        }
        return 1544;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        int i17 = this.A;
        return (i17 == 32 || i17 == 33) ? "/cgi-bin/mmpay-bin/f2fplaceorder" : "/cgi-bin/mmpay-bin/transferplaceorder";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 == 0 || i17 == 2) {
            if (jSONObject.has("used_fee")) {
                this.f238508r = jSONObject.optDouble("used_fee");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.NetSceneTenpayRemittanceGen", "remain_fee is null");
            }
            if (jSONObject.has("retcode")) {
                this.W = jSONObject.optInt("retcode", 0);
            }
            this.f238497d = jSONObject.optString("req_key");
            this.f238498e = jSONObject.optInt("tansfering_num", 0);
            this.f238502i = jSONObject.optString("transfer_interrupt_desc");
            this.f238503m = jSONObject.optString("appmsgcontent");
            this.f238505o = jSONObject.optString("transfer_interrupt_charge_desc");
            this.f238506p = jSONObject.optInt("is_show_charge") == 1;
            this.f238509s = jSONObject.optString("receiver_true_name");
            this.f238510t = jSONObject.optString("f2f_id", "");
            this.f238511u = jSONObject.optString("trans_id", "");
            this.f238512v = jSONObject.optString("extend_str", "");
            this.f238513w = jSONObject.optString("receiver_open_id", "");
            this.f238514x = jSONObject.optInt("amount", 0);
            this.D = jSONObject.optString("transfer_id", "");
            this.E = jSONObject.optString(ya.b.f77506xba41a63c, "");
            this.F = jSONObject.optString("receiver_openid", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f238509s)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.NetSceneTenpayRemittanceGen", "receiver_true_name is null");
            }
            if (jSONObject.has("remain_fee")) {
                jSONObject.optDouble("remain_fee");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.NetSceneTenpayRemittanceGen", "remain_fee is null");
            }
            if (jSONObject.has("exceed_fee")) {
                this.f238507q = jSONObject.optDouble("exceed_fee");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.NetSceneTenpayRemittanceGen", "exceed_fee is null");
            }
            if (jSONObject.has("charge_fee")) {
                this.f238504n = jSONObject.optDouble("charge_fee");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.NetSceneTenpayRemittanceGen", "charge_fee is null");
            }
            if (jSONObject.has("free_limit")) {
                jSONObject.optDouble("free_limit");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.NetSceneTenpayRemittanceGen", "free_limit is null");
            }
            if (jSONObject.has("showmessage")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceGen", "has alert item");
                at4.a aVar = new at4.a();
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("showmessage");
                aVar.f95329b = optJSONObject.optString("left_button_wording");
                aVar.f95330c = optJSONObject.optString("right_button_wording");
                aVar.f95331d = optJSONObject.optString("right_button_url");
                this.f238516z = aVar;
                aVar.f95328a = str;
            }
            if (jSONObject.has("fee")) {
                this.B = jSONObject.optString("fee");
            }
            if (jSONObject.has("double_check_wording")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceGen", "has fee, show alert");
                this.C = jSONObject.optString("double_check_wording");
            }
            if (jSONObject.has("zaitu_message")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceGen", "has zaitu_message");
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.p0();
                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("zaitu_message");
                p0Var.f238485a = optJSONObject2.optString("wording");
                p0Var.f238486b = optJSONObject2.optString("open_button");
                p0Var.f238487c = optJSONObject2.optString("bill_url");
                this.f238499f = p0Var;
            }
            if (jSONObject.has("amount_reinput_page")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceGen", "has amount_reinput_page");
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.o0();
                org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("amount_reinput_page");
                o0Var.f238455a = optJSONObject3.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                o0Var.f238456b = optJSONObject3.optString("wording");
                this.f238500g = o0Var;
            }
            this.f238501h = jSONObject.optString("placeorder_attach");
            this.G = jSONObject.optInt("scan_scene", 0);
            this.H = jSONObject.optString("placeorder_suc_sign");
            this.I = jSONObject.optString("pay_suc_extend");
            if (android.text.TextUtils.isEmpty(this.f238503m)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.NetSceneTenpayRemittanceGen", "appmsgcontent is null");
            }
            this.f238496J = jSONObject.optInt("get_dynamic_code_flag", 0);
            this.K = jSONObject.optString("get_dynamic_code_sign", "");
            this.L = jSONObject.optString("get_dynamic_code_extend", "");
            this.M = jSONObject.optString("show_paying_wording", "");
            this.N = jSONObject.optString("dynamic_code_spam_wording", "");
            this.Q = jSONObject.optInt("need_checkname", 0);
            int optInt = jSONObject.optInt("return_to_session", 0);
            this.T = optInt;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceGen", "return_to_session:%s", java.lang.Integer.valueOf(optInt));
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("namemessage");
            if (optJSONObject4 != null) {
                r45.o10 o10Var = new r45.o10();
                this.R = o10Var;
                o10Var.f463343d = optJSONObject4.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                this.R.f463346g = optJSONObject4.optString("checkname_sign");
                this.R.f463345f = optJSONObject4.optString("display_name");
                this.R.f463344e = optJSONObject4.optString("wording");
                this.R.f463347h = optJSONObject4.optInt("message_type", 0);
            }
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("msg_check_info");
            if (optJSONObject5 != null) {
                this.V = optJSONObject5.optLong("msg_check_sec", 0L);
                this.U = optJSONObject5.optString("msg_check_str", "");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: shouldResolveJsonWhenError */
    public boolean mo68416xd2dc02ad() {
        return true;
    }
}

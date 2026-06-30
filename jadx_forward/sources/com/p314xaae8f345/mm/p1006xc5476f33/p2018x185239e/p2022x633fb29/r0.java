package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class r0 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {
    public int A;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n E;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.C17122x2c1fc2f7 F;
    public java.lang.String H;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f238521d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f238522e;

    /* renamed from: f, reason: collision with root package name */
    public double f238523f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f238524g;

    /* renamed from: h, reason: collision with root package name */
    public int f238525h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f238526i;

    /* renamed from: q, reason: collision with root package name */
    public int f238531q;

    /* renamed from: t, reason: collision with root package name */
    public int f238534t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f238535u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f238536v;

    /* renamed from: w, reason: collision with root package name */
    public int f238537w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f238538x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f238539y;

    /* renamed from: z, reason: collision with root package name */
    public int f238540z;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f238527m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f238528n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f238529o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f238530p = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f238532r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f238533s = "";
    public boolean G = false;

    public r0(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, int i18, java.lang.String str5) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("transfer_url", java.net.URLEncoder.encode(str));
        if (str2 != null && str2.length() > 0) {
            hashMap.put("qq_extend_info", java.net.URLEncoder.encode(str2));
        }
        m83032xb4c13117(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("channel", i17 + "");
        hashMap2.put("qrcode_sender_username", str3);
        hashMap2.put("user_wallet_region", ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue() + "");
        hashMap2.put("chat_msg_svr_id", j17 + "");
        hashMap2.put("chat_msg_type", i18 + "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            hashMap2.put("chat_user_name", str4);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            hashMap2.put("msg_sender_name", str5);
        }
        m83033x7c1e2016(hashMap2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceGetUsername", "[NetSceneTenpayRemittanceGetUsername] transferUrl: %s, msgSvrId: %s. username:%s ,chatType:%s, msg_sender_name:%s", str, java.lang.Long.valueOf(j17), str4, java.lang.Integer.valueOf(i18), str5);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1515;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/transferscanqrcode";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        try {
            jSONObject.toString();
            this.f238521d = jSONObject.optString("user_name", "");
            this.f238522e = jSONObject.optString("true_name");
            this.f238523f = jSONObject.optDouble("fee") / 100.0d;
            this.f238524g = jSONObject.optString("desc");
            this.f238525h = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
            this.f238526i = java.net.URLEncoder.encode(jSONObject.optString("transfer_qrcode_id"));
            this.f238527m = jSONObject.optString("f2f_pay_desc");
            this.f238528n = jSONObject.optString("rcvr_desc");
            this.f238529o = jSONObject.optString("payer_desc");
            this.f238530p = jSONObject.optString("rcvr_ticket");
            this.f238531q = jSONObject.optInt("busi_type", 0);
            this.f238532r = jSONObject.optString("mch_name");
            this.f238533s = jSONObject.optString("mch_photo");
            this.f238536v = jSONObject.optString("mch_type", "");
            this.f238534t = jSONObject.optInt("mch_time", 0);
            this.f238535u = jSONObject.optString("receiver_openid");
            this.f238537w = jSONObject.optInt("get_pay_wifi");
            this.f238539y = jSONObject.optString("receiver_true_name");
            this.f238538x = jSONObject.optString("mch_info_string");
            this.f238540z = jSONObject.optInt("amount_remind_bit");
            this.A = jSONObject.optInt("action_type");
            this.B = jSONObject.optInt("retcode");
            this.C = jSONObject.optString("jump_url");
            this.D = jSONObject.optString("jump_route_info");
            if (jSONObject.has("intercept_win")) {
                this.E = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n.a(jSONObject.optJSONObject("intercept_win"));
            }
            this.G = jSONObject.optBoolean("payer_desc_required", false);
            this.H = jSONObject.optString("payer_desc_placeholder");
            this.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.C17122x2c1fc2f7(jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Micromsg.NetSceneTenpayRemittanceGetUsername", e17, "", new java.lang.Object[0]);
        }
    }
}

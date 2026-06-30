package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class g1 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {
    public int A;
    public java.util.ArrayList B;
    public r45.tw4 C;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.w0 D;
    public java.util.ArrayList E;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.b1 F;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v1 H;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f238360d;

    /* renamed from: e, reason: collision with root package name */
    public int f238361e;

    /* renamed from: f, reason: collision with root package name */
    public double f238362f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f238363g;

    /* renamed from: h, reason: collision with root package name */
    public int f238364h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f238365i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f238366m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238367n;

    /* renamed from: o, reason: collision with root package name */
    public int f238368o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f238369p;

    /* renamed from: q, reason: collision with root package name */
    public final int f238370q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f238371r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f238372s;

    /* renamed from: t, reason: collision with root package name */
    public int f238373t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f238374u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.s0 f238375v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.u0 f238376w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.e1 f238377x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2466xda460cb3.api.C19564xaf6ceaf4 f238378y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.ArrayList f238379z;
    public java.lang.String G = "";
    public boolean I = false;

    public g1(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        this.f238360d = null;
        this.f238360d = str2;
        this.f238370q = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("transfer_id", str2);
        hashMap.put("trans_id", str);
        hashMap.put("invalid_time", i18 + "");
        hashMap.put("group_username", str3);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            hashMap.put("transfer_attach", java.net.URLEncoder.encode(str4));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "trans_id：%s, transaction_id：%s，transfer_attach：%s", str2, str, str4);
        m83032xb4c13117(hashMap);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v0 H(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v0 v0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v0();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        v0Var.f238569a = jSONObject.optInt("type");
        v0Var.f238570b = jSONObject.optString("url");
        v0Var.f238571c = jSONObject.optString(dm.i4.f66875xa013b0d5);
        v0Var.f238572d = jSONObject.optString("pagepath");
        v0Var.f238573e = jSONObject.optString("liteapp_id");
        v0Var.f238574f = jSONObject.optString("liteapp_path");
        return v0Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 I(org.json.JSONObject jSONObject) {
        r45.cg0 cg0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.x0 x0Var;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        z0Var.f238602a = jSONObject.optInt("recv_channel_type");
        z0Var.f238603b = jSONObject.optString("recv_channel_name");
        java.lang.String optString = jSONObject.optString("recv_channel_name_icon", "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            try {
                byte[] decode = android.util.Base64.decode(optString, 0);
                if (decode.length > 0) {
                    r45.bz3 bz3Var = new r45.bz3();
                    z0Var.f238604c = bz3Var;
                    bz3Var.mo11468x92b714fd(decode);
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parse recv_channel_name_icon error：%s", e17.getMessage());
            }
        }
        z0Var.f238605d = jSONObject.optString("recv_channel_logo");
        z0Var.f238606e = jSONObject.optString("recv_channel_logo_darkmode");
        z0Var.f238607f = jSONObject.optInt("recv_channel_avail_state");
        z0Var.f238608g = jSONObject.optInt("recv_channel_unavail_reason");
        z0Var.f238609h = jSONObject.optString("first_choose_wording");
        z0Var.f238610i = K(jSONObject.optJSONObject("jump_remind_info"));
        z0Var.f238617p = jSONObject.optInt("choose_guide_display_times", 3);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("dynamic_bg_color");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d1 d1Var = null;
        if (optJSONObject == null) {
            cg0Var = null;
        } else {
            cg0Var = new r45.cg0();
            cg0Var.f453071d = optJSONObject.optLong("normal_color");
            cg0Var.f453072e = optJSONObject.optLong("dark_mode_color");
        }
        z0Var.f238618q = cg0Var;
        try {
            byte[] decode2 = android.util.Base64.decode(jSONObject.optString("float_button", ""), 0);
            if (decode2.length != 0) {
                r45.gq gqVar = new r45.gq();
                z0Var.f238619r = gqVar;
                gqVar.mo11468x92b714fd(decode2);
            }
        } catch (java.io.IOException unused) {
        }
        z0Var.f238611j = M(jSONObject.optJSONObject("unavail_tips"));
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("recv_channel_sub_title");
        if (optJSONObject2 == null) {
            x0Var = null;
        } else {
            x0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.x0();
            try {
                byte[] decode3 = android.util.Base64.decode(optJSONObject2.optString("wording", ""), 0);
                if (decode3.length != 0) {
                    r45.rl6 rl6Var = new r45.rl6();
                    x0Var.f238593a = rl6Var;
                    rl6Var.mo11468x92b714fd(decode3);
                }
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Micromsg.NetSceneTenpayRemittanceQuery", e18, "", new java.lang.Object[0]);
            }
            try {
                byte[] decode4 = android.util.Base64.decode(optJSONObject2.optString("info_icon", ""), 0);
                if (decode4.length != 0) {
                    r45.gq gqVar2 = new r45.gq();
                    x0Var.f238594b = gqVar2;
                    gqVar2.mo11468x92b714fd(decode4);
                }
            } catch (java.io.IOException unused2) {
            }
            try {
                byte[] decode5 = android.util.Base64.decode(optJSONObject2.optString("used_wording", ""), 0);
                if (decode5.length != 0) {
                    r45.rl6 rl6Var2 = new r45.rl6();
                    x0Var.f238595c = rl6Var2;
                    rl6Var2.mo11468x92b714fd(decode5);
                }
            } catch (java.io.IOException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Micromsg.NetSceneTenpayRemittanceQuery", e19, "", new java.lang.Object[0]);
            }
            try {
                byte[] decode6 = android.util.Base64.decode(optJSONObject2.optString("used_info_icon", ""), 0);
                if (decode6.length != 0) {
                    r45.gq gqVar3 = new r45.gq();
                    x0Var.f238596d = gqVar3;
                    gqVar3.mo11468x92b714fd(decode6);
                }
            } catch (java.io.IOException unused3) {
            }
            x0Var.f238597e = optJSONObject2.optString("click_id");
        }
        z0Var.f238612k = x0Var;
        try {
            byte[] decode7 = android.util.Base64.decode(jSONObject.optString("recv_channel_name_note", ""), 0);
            if (decode7.length != 0) {
                r45.rl6 rl6Var3 = new r45.rl6();
                z0Var.f238613l = rl6Var3;
                rl6Var3.mo11468x92b714fd(decode7);
            }
        } catch (java.io.IOException unused4) {
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("switch_availchannel_tips");
        if (optJSONArray == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                try {
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                    if (jSONObject2 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.y0();
                        y0Var.f238598a = jSONObject2.optInt("recv_channel_type", 0);
                        y0Var.f238600c = jSONObject2.optString("bind_serial");
                        y0Var.f238599b = M(jSONObject2.optJSONObject("switch_tips"));
                        arrayList.add(y0Var);
                    }
                } catch (org.json.JSONException e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseOptionItemList error：%s", e27.getMessage());
                }
            }
        }
        z0Var.f238614m = arrayList;
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("once_usage_tips");
        if (optJSONObject3 != null) {
            z0Var.f238615n = M(optJSONObject3);
        }
        java.lang.String optString2 = jSONObject.optString("first_choose_guide", "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            try {
                byte[] decode8 = android.util.Base64.decode(optString2, 0);
                if (decode8.length != 0) {
                    r45.yt5 yt5Var = new r45.yt5();
                    z0Var.f238616o = yt5Var;
                    yt5Var.mo11468x92b714fd(decode8);
                }
            } catch (java.io.IOException e28) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parse first_choose_guide error：%s", e28.getMessage());
            }
        }
        org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("sub_recv_channel_info");
        if (optJSONObject4 != null) {
            d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d1();
            d1Var.f238338a = optJSONObject4.optString("sub_recv_channel_title", "");
            d1Var.f238339b = optJSONObject4.optInt("default_sub_recv_channel_id", 0);
            d1Var.f238340c = optJSONObject4.optString("sub_recv_channel_list_title", "");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            org.json.JSONArray optJSONArray2 = optJSONObject4.optJSONArray("sub_recv_channel_list");
            if (optJSONArray2 != null) {
                for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                    org.json.JSONObject optJSONObject5 = optJSONArray2.optJSONObject(i18);
                    if (optJSONObject5 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1();
                        c1Var.f238333a = optJSONObject5.optInt(dm.i4.f66865x76d1ec5a, 0);
                        c1Var.f238334b = optJSONObject5.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "");
                        arrayList2.add(c1Var);
                    }
                }
            }
            d1Var.f238341d = arrayList2;
        }
        z0Var.f238620s = d1Var;
        z0Var.f238621t = jSONObject.optString("bind_serial");
        return z0Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a1 J(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = null;
        if (jSONObject == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a1();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("recv_channel_type_list");
        if (optJSONArray == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                try {
                    arrayList.add(java.lang.Integer.valueOf(optJSONArray.getInt(i17)));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseOptionItemList error：%s", e17.getMessage());
                }
            }
        }
        a1Var.f238319a = arrayList;
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("recv_channel_account_list");
        if (optJSONArray2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            try {
                int length = optJSONArray2.length();
                for (int i18 = 0; i18 < length; i18++) {
                    org.json.JSONObject optJSONObject = optJSONArray2.optJSONObject(i18);
                    if (optJSONObject != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.w1 w1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.w1(0, null, 3, null);
                        w1Var.f238588a = optJSONObject.optInt("recv_channel_type");
                        java.lang.String optString = optJSONObject.optString("bind_serial");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                        w1Var.f238589b = optString;
                        arrayList3.add(w1Var);
                    }
                }
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceUtil", "parseRecvChannelAccountList error: %s", e18.getMessage());
            }
            arrayList2 = arrayList3;
        }
        a1Var.f238320b = arrayList2;
        return a1Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.e1 K(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.e1();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        e1Var.f238344a = jSONObject.optString("wording");
        e1Var.f238345b = H(jSONObject.optJSONObject("jump_info"));
        return e1Var;
    }

    public static java.util.ArrayList L(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new org.json.JSONArray();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseTextInfoList res：%s", jSONArray.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            try {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                if (jSONObject != null) {
                    arrayList.add(K(jSONObject));
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseTextInfoList error：%s", e17.getMessage());
            }
        }
        return arrayList;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.f1 M(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.f1 f1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.f1();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        f1Var.f238348a = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        f1Var.f238349b = jSONObject.optString("wording");
        f1Var.f238350c = jSONObject.optString("btn_text");
        return f1Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1628;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/transferquery";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.w0 w0Var;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v1 v1Var;
        if (i17 != 0) {
            return;
        }
        this.f238361e = jSONObject.optInt("pay_time");
        this.f238362f = jSONObject.optDouble("fee") / 100.0d;
        this.f238363g = jSONObject.optString("fee_type");
        this.f238364h = jSONObject.optInt("trans_status");
        jSONObject.optString("trans_status_name");
        this.f238368o = jSONObject.optInt("modify_time");
        this.f238366m = jSONObject.optString("payer_name");
        this.f238365i = jSONObject.optString("receiver_name");
        this.f238367n = jSONObject.optBoolean("is_payer");
        this.f238369p = jSONObject.optString("refund_bank_type");
        this.f238371r = jSONObject.optString("status_desc");
        this.f238372s = jSONObject.optString("status_supplementary");
        this.f238373t = jSONObject.optInt("delay_confirm_flag");
        jSONObject.optString("banner_content");
        jSONObject.optString("banner_url");
        this.f238374u = jSONObject.optString("desc");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("addr_info");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.s0();
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        s0Var.f238544a = optJSONObject.optString("address_name");
        s0Var.f238545b = optJSONObject.optString("phone_num");
        s0Var.f238546c = optJSONObject.optString("address");
        this.f238375v = s0Var;
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("exposure_info");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.u0();
        if (optJSONObject2 == null) {
            optJSONObject2 = new org.json.JSONObject();
        }
        u0Var.f238562a = optJSONObject2.optString("icon");
        u0Var.f238563b = optJSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        u0Var.f238564c = optJSONObject2.optString("wording");
        u0Var.f238565d = optJSONObject2.optInt("is_show_btn");
        u0Var.f238566e = optJSONObject2.optString("btn_wording");
        u0Var.f238567f = H(optJSONObject2.optJSONObject("jump_info"));
        this.f238376w = u0Var;
        this.f238377x = K(jSONObject.optJSONObject("text_info"));
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("resend_info");
        com.p314xaae8f345.mm.p1006xc5476f33.p2466xda460cb3.api.C19564xaf6ceaf4 c19564xaf6ceaf4 = new com.p314xaae8f345.mm.p1006xc5476f33.p2466xda460cb3.api.C19564xaf6ceaf4();
        if (optJSONObject3 == null) {
            optJSONObject3 = new org.json.JSONObject();
        }
        c19564xaf6ceaf4.f270123d = optJSONObject3.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        c19564xaf6ceaf4.f270124e = optJSONObject3.optString("pic");
        c19564xaf6ceaf4.f270125f = optJSONObject3.optString("description");
        c19564xaf6ceaf4.f270126g = optJSONObject3.optString("left_button_wording");
        c19564xaf6ceaf4.f270127h = optJSONObject3.optString("right_button_wording");
        this.f238378y = c19564xaf6ceaf4;
        K(jSONObject.optJSONObject("middle_info"));
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("desc_item_list");
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        org.json.JSONArray jSONArray = optJSONArray;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseDescItemList res：%s", jSONArray.toString());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i18 = 0; i18 < jSONArray.length(); i18++) {
            try {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                if (jSONObject2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.t0();
                    t0Var.f238553a = jSONObject2.optString("key");
                    t0Var.f238554b = jSONObject2.optString("value");
                    t0Var.f238555c = jSONObject2.optBoolean("is_separate_line");
                    try {
                        byte[] decode = android.util.Base64.decode(jSONObject2.optString("value_text", ""), 0);
                        if (decode.length != 0) {
                            r45.rl6 rl6Var = new r45.rl6();
                            t0Var.f238556d = rl6Var;
                            rl6Var.mo11468x92b714fd(decode);
                        }
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Micromsg.NetSceneTenpayRemittanceQuery", e17, "", new java.lang.Object[0]);
                    }
                    arrayList2.add(t0Var);
                }
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseDescItemList error：%s", e18.getMessage());
            }
        }
        this.f238379z = arrayList2;
        this.A = jSONObject.optInt("trade_mem_type", 0);
        this.E = L(jSONObject.optJSONArray("upright_corner_list"));
        this.C = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m0(jSONObject.optJSONObject("notice_item"));
        org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("recv_account_info");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.b1 b1Var = null;
        if (optJSONObject4 == null) {
            w0Var = null;
        } else {
            w0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.w0();
            w0Var.f238580a = M(optJSONObject4.optJSONObject("acct_usage_tips"));
            w0Var.f238581b = optJSONObject4.optString("no_availabel_account_wording");
            w0Var.f238582c = optJSONObject4.optString("list_title");
            org.json.JSONArray optJSONArray2 = optJSONObject4.optJSONArray("recv_channel");
            if (optJSONArray2 == null) {
                optJSONArray2 = new org.json.JSONArray();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                try {
                    org.json.JSONObject jSONObject3 = optJSONArray2.getJSONObject(i19);
                    if (jSONObject3 != null) {
                        arrayList3.add(I(jSONObject3));
                    }
                } catch (org.json.JSONException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseOptionItemList error：%s", e19.getMessage());
                }
            }
            w0Var.f238583d = arrayList3;
            org.json.JSONArray optJSONArray3 = optJSONObject4.optJSONArray("recv_channel_group_list");
            if (optJSONArray3 == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList();
                for (int i27 = 0; i27 < optJSONArray3.length(); i27++) {
                    try {
                        org.json.JSONObject jSONObject4 = optJSONArray3.getJSONObject(i27);
                        if (jSONObject4 != null) {
                            arrayList.add(J(jSONObject4));
                        }
                    } catch (org.json.JSONException e27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "parseOptionItemList error：%s", e27.getMessage());
                    }
                }
            }
            w0Var.f238584e = arrayList;
            w0Var.f238585f = optJSONObject4.optInt("default_recv_channel_type");
            w0Var.f238586g = optJSONObject4.optString("default_bind_serial");
            w0Var.f238587h = optJSONObject4.optString("default_recv_channel_event_id");
        }
        this.D = w0Var;
        this.B = L(jSONObject.optJSONArray("customer_info_list"));
        org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("operation_info");
        if (optJSONObject5 != null) {
            b1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.b1();
            b1Var.f238324a = optJSONObject5.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            b1Var.f238325b = optJSONObject5.optString("left_subtitle");
            b1Var.f238326c = optJSONObject5.optString("left_wording");
            b1Var.f238327d = optJSONObject5.optString("right_subtitle");
            b1Var.f238328e = optJSONObject5.optString("right_wording");
            b1Var.f238329f = H(optJSONObject5.optJSONObject("jump_info"));
        }
        this.F = b1Var;
        this.G = jSONObject.optString("tail_info");
        this.I = jSONObject.optBoolean("is_quota_exceeded");
        org.json.JSONObject optJSONObject6 = jSONObject.optJSONObject("limit_info");
        if (optJSONObject6 == null) {
            v1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v1(null, null, null, 7, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v1 v1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v1(null, null, null, 7, null);
            v1Var2.f238575a = optJSONObject6.optString("icon_url");
            v1Var2.f238576b = optJSONObject6.optString("dark_icon_url");
            v1Var2.f238577c = optJSONObject6.optString("jump_info");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceUtil", "[parseLimitInfo] content: " + v1Var2);
            v1Var = v1Var2;
        }
        this.H = v1Var;
    }
}

package ys4;

/* loaded from: classes9.dex */
public class g extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f546765d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f546766e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f546767f;

    /* renamed from: g, reason: collision with root package name */
    public long f546768g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f546769h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f546770i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f546771m;

    /* renamed from: n, reason: collision with root package name */
    public at4.y0 f546772n;

    /* renamed from: o, reason: collision with root package name */
    public at4.h0 f546773o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f546774p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f546775q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f546776r;

    public g(java.lang.String str, java.lang.String str2, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("flag", "1");
        hashMap.put("true_name", str);
        hashMap.put("identify_card", str2);
        hashMap.put("cre_type", "1");
        hashMap.put("realname_scene", i17 + "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRealNameVerify", "realname_scene=%d", java.lang.Integer.valueOf(i17));
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: configRequest */
    public void mo83006x226c38ed(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p944x882e457a.o m83007x5a9a73ac = m83007x5a9a73ac();
        if (m83007x5a9a73ac == null) {
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.fl6();
            lVar.f152198b = new r45.gl6();
            lVar.f152199c = "/cgi-bin/mmpay-bin/tenpay/realnameauthen";
            lVar.f152200d = 1616;
            lVar.f152201e = 185;
            lVar.f152202f = 1000000185;
            m83007x5a9a73ac = lVar.a();
            m83007x5a9a73ac.m47986x306cfea3(true);
        }
        r45.fl6 fl6Var = (r45.fl6) m83007x5a9a73ac.f152243a.f152217a;
        if (z18) {
            fl6Var.f455961e = 1;
        }
        m83028xf0ffe720(m83007x5a9a73ac);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f39858xf5bc2045 = u0Var;
        return mo9409x10f9447a(sVar, this.f295573rr, this);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: getEncryptUrl */
    public java.lang.String mo83008x94177cc0(java.lang.String str) {
        return com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121664x51474d82(str);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: getPayCgicmd */
    public int mo83013xb2b366a7() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: getRetModel */
    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e1 mo83014x6758cc7e(com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        r45.gl6 gl6Var = (r45.gl6) oVar.f152244b.f152233a;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e1 e1Var = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e1();
        int i17 = gl6Var.f456878g;
        e1Var.f295423c = gl6Var.f456877f;
        e1Var.f295422b = gl6Var.f456876e;
        e1Var.f295421a = gl6Var.f456875d;
        e1Var.f295425e = gl6Var.f456880i;
        e1Var.f295424d = gl6Var.f456879h;
        return e1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1616;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        at4.h0 h0Var;
        if (i17 == 0) {
            this.f546765d = jSONObject.optString("token");
            this.f546766e = jSONObject.optBoolean("is_need_bind");
            this.f546767f = jSONObject.optBoolean("is_need_face");
            jSONObject.optBoolean("is_need_Laund");
            jSONObject.optString("laundh5");
            this.f546768g = jSONObject.optLong(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
            this.f546769h = jSONObject.optString("package", "");
            this.f546770i = jSONObject.optString("packagesign", "");
            this.f546771m = jSONObject.optString("addbankword");
            this.f546776r = this.f546765d;
            this.f546772n = at4.y0.b(jSONObject);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("under_age_mid_dialog");
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                java.lang.String optString2 = optJSONObject.optString("wording");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                java.lang.String optString3 = optJSONObject.optString("btn_cancel");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
                java.lang.String optString4 = optJSONObject.optString("btn_confirm");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
                h0Var = new at4.h0(optString, optString2, optString3, optString4);
            } else {
                h0Var = null;
            }
            this.f546773o = h0Var;
            this.f546774p = jSONObject.optString("under_age_session_id");
            this.f546775q = jSONObject.optString("underage_msg_preview");
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: parseErrDialogCancelBtnText */
    public java.lang.String mo83022x7ef65e55(org.json.JSONObject jSONObject) {
        return jSONObject.optString("error_btn_cancel");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: parseErrDialogOkBtnText */
    public java.lang.String mo83023x2b9fffb3(org.json.JSONObject jSONObject) {
        return jSONObject.optString("error_btn_confirm");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: putToReqText */
    public void mo83024x7114b9a1(com.p314xaae8f345.mm.p944x882e457a.o oVar, r45.cu5 cu5Var) {
        ((r45.fl6) oVar.f152243a.f152217a).f455962f = cu5Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: putToWXReqText */
    public void mo83026xd36d8220(com.p314xaae8f345.mm.p944x882e457a.o oVar, r45.cu5 cu5Var) {
        ((r45.fl6) oVar.f152243a.f152217a).f455963g = cu5Var;
    }

    public g(java.lang.String str, java.lang.String str2, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c c19086x2eaebd1c, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j17, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, boolean z17, java.lang.String str13, int i19, java.lang.String str14) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("flag", "1");
        hashMap.put("true_name", str);
        hashMap.put("identify_card", str2);
        hashMap.put("realname_scene", i17 + "");
        hashMap.put("cre_type", java.lang.String.valueOf(i18));
        if (c19086x2eaebd1c != null) {
            hashMap.put("profession_name", c19086x2eaebd1c.f260954d);
            hashMap.put("profession_type", java.lang.String.valueOf(c19086x2eaebd1c.f260955e));
        }
        hashMap.put("user_country", str3);
        hashMap.put("user_province", str4);
        hashMap.put("user_city", str5);
        hashMap.put("cre_expire_date", str6);
        hashMap.put("creid_renewal", java.lang.String.valueOf(j17));
        hashMap.put("birth_date", str7);
        hashMap.put("nationality", str8);
        hashMap.put("session_id", str9);
        hashMap.put("cre_effect_date", str10);
        hashMap.put("cre_effective_date", str10);
        hashMap.put("entry_scene", java.lang.String.valueOf(i19));
        hashMap.put("detail_address", str11);
        hashMap.put("sex", str12);
        if (z17) {
            hashMap.put("is_close_marketing", "true");
        }
        hashMap.put("cre_expire_date_plain", str13);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str14)) {
            hashMap.put("cre_begin_date", str14);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRealNameVerify", "realname_scene=%d", java.lang.Integer.valueOf(i19));
        m83032xb4c13117(hashMap);
    }
}

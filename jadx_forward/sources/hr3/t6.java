package hr3;

/* loaded from: classes9.dex */
public class t6 implements t25.a, com.p314xaae8f345.mm.p944x882e457a.u0, r01.d0, r01.w2 {

    /* renamed from: J, reason: collision with root package name */
    public static final java.lang.String f365534J = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/mp/infringement?username=%s&from=1#wechat_redirect";
    public java.lang.String A;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe C;
    public android.os.Bundle E;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f365535d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f365536e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365537f;

    /* renamed from: g, reason: collision with root package name */
    public qk.o f365538g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f365539h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f365540i;

    /* renamed from: m, reason: collision with root package name */
    public qk.n f365541m;

    /* renamed from: n, reason: collision with root package name */
    public int f365542n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f365543o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f365544p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.va0 f365545q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f365546r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f365547s;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f365553y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f365554z;

    /* renamed from: t, reason: collision with root package name */
    public boolean f365548t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f365549u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f365550v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f365551w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f365552x = 0;
    public android.content.SharedPreferences B = null;
    public boolean D = true;
    public com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad F = null;
    public java.lang.String G = null;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 H = null;
    public boolean I = false;

    public t6(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str, r45.va0 va0Var) {
        this.f365545q = null;
        this.f365535d = abstractActivityC21394xb3d2c0cf;
        this.f365544p = str;
        this.f365545q = va0Var;
    }

    public static void c(hr3.t6 t6Var) {
        t6Var.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) t6Var.f365535d, 1, false);
        k0Var.f293405n = new hr3.y5(t6Var);
        k0Var.f293414s = new hr3.a6(t6Var);
        k0Var.v();
    }

    @Override // r01.w2
    public void K1(int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        qk.o oVar = this.f365538g;
        if (oVar != null && oVar.F0() && m1Var.mo808xfb85f7b0() == 1354) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).h("contact_info_subscribe_bizinfo");
            if (r01.q3.Vi().y0(r01.q3.Vi().z0(this.f365538g.f66748xdec927b)) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetBizInfo", "bizChatMyuser bizChatUserInfo is null after GetBizChatMyUserInfo");
            } else {
                c21541x1c1b08fe.O(!r3.t0(4));
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).notifyDataSetChanged();
            }
        }
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, z3Var != null);
        java.lang.String d17 = z3Var.d1();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (d17 == null) {
            d17 = "";
        }
        iz5.a.g(null, d17.length() > 0);
        iz5.a.g(null, rVar != null);
        this.f365536e = rVar;
        this.f365537f = z3Var;
        this.f365543o = z17;
        this.f365542n = i17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f365535d;
        this.f365552x = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("add_more_friend_search_scene", 0);
        this.F = (com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) abstractActivityC21394xb3d2c0cf.getIntent().getParcelableExtra("KSnsAdTag");
        this.E = abstractActivityC21394xb3d2c0cf.getIntent().getBundleExtra("Contact_Ext_Args");
        this.G = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("key_add_contact_report_info");
        n();
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Contact_BIZ_PopupInfoMsg");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            abstractActivityC21394xb3d2c0cf.getIntent().putExtra("Contact_BIZ_PopupInfoMsg", "");
            db5.e1.y(abstractActivityC21394xb3d2c0cf, stringExtra, "", abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), null);
        }
        if (this.D) {
            this.D = false;
            r01.q3.Ai().c(z3Var.d1(), null);
            if (r01.z.k(z3Var.d1())) {
                java.lang.String d18 = z3Var.d1();
                ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                if (r01.z.g(d18)) {
                    r01.q3.Ni().h(d18, this);
                    java.lang.String y07 = r01.z.b(d18).y0();
                    if (y07 != null) {
                        r01.q3.Ai().c(y07, null);
                    }
                } else {
                    ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                    if (r01.z.j(d18)) {
                        r01.q3.bj().b1(d18, this);
                        java.lang.String d19 = r01.q3.cj().d1(d18);
                        if (d19 != null) {
                            r01.q3.Ai().c(d19, null);
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        int i17;
        boolean z17;
        java.lang.String str2;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17;
        qk.n D0;
        int P;
        int i18;
        int i19;
        if (str == null) {
            return false;
        }
        boolean equals = str.equals("contact_info_verifyuser_weibo");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f365535d;
        if (equals) {
            jr3.c cVar = new jr3.c(abstractActivityC21394xb3d2c0cf);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f365537f;
            java.lang.String str3 = z3Var.f318118x0;
            java.lang.String d17 = z3Var.d1();
            if (str3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ViewTWeibo", "null weibo id");
            } else {
                c01.d9.e().a(205, cVar);
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                cVar.f382929d = new er3.d(str3.replace("http://t.qq.com/", "").trim(), d17);
                c01.d9.e().g(cVar.f382929d);
                cVar.f382931f.c(3000L, 3000L);
            }
            return true;
        }
        if ("contact_info_biz_go_chatting".endsWith(str)) {
            if (this.F != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5909x7c5c81e9 c5909x7c5c81e9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5909x7c5c81e9();
                com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = this.F;
                c11137xb05b06ad.f153002g = 5;
                c5909x7c5c81e9.f136213g.f89743a = c11137xb05b06ad;
                c5909x7c5c81e9.e();
            }
            qk.o oVar = this.f365538g;
            if (oVar == null || !(oVar.I0() || this.f365538g.F0())) {
                android.content.Intent intent = new android.content.Intent();
                if (abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false)) {
                    intent.setFlags(268435456);
                }
                if (this.f365543o) {
                    intent.putExtra("Chat_User", this.f365537f.d1());
                    intent.putExtra("Chat_Mode", 1);
                    abstractActivityC21394xb3d2c0cf.setResult(-1, intent);
                } else {
                    intent.putExtra("Chat_User", this.f365537f.d1());
                    intent.putExtra("Chat_Mode", 1);
                    intent.putExtra("finish_direct", true);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, abstractActivityC21394xb3d2c0cf);
                }
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                if (this.f365538g.F0()) {
                    java.lang.String y07 = this.f365538g.y0();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetBizInfo", "contact_info_biz_go_chatting fatherUserName is empty");
                        return false;
                    }
                    intent2.putExtra("enterprise_biz_name", y07);
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    intent2.putExtra("enterprise_biz_display_name", c01.a2.e(y07));
                } else {
                    intent2.putExtra("enterprise_biz_name", this.f365537f.d1());
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String d18 = this.f365537f.d1();
                    ((sg3.a) v0Var).getClass();
                    intent2.putExtra("enterprise_biz_display_name", c01.a2.e(d18));
                }
                intent2.addFlags(67108864);
                j45.l.u(abstractActivityC21394xb3d2c0cf, ".ui.conversation.EnterpriseConversationUI", intent2, null);
                abstractActivityC21394xb3d2c0cf.finish();
            }
            p(5, null);
            return true;
        }
        if ("contact_info_biz_add".endsWith(str)) {
            if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).q()) {
                f();
            } else {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).B(abstractActivityC21394xb3d2c0cf, new hr3.c6(this));
            }
            int i27 = this.f365552x;
            if (i27 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11263, java.lang.Integer.valueOf(i27), this.f365537f.d1());
            }
            return true;
        }
        if ("contact_info_biz_read_msg_online".endsWith(str)) {
            return true;
        }
        if ("contact_info_stick_biz".equals(str)) {
            if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).h("contact_info_stick_biz")).N()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13307, this.f365537f.d1(), 1, 1, 0, "", java.lang.Integer.valueOf(this.f365542n));
                c01.i0.a(this.f365537f.d1(), true);
            } else {
                c01.e2.B0(this.f365537f.d1(), true, true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13307, this.f365537f.d1(), 1, 2, 0, "", java.lang.Integer.valueOf(this.f365542n));
            }
            return true;
        }
        if ("contact_info_guarantee_info".equals(str) && this.f365541m.f() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f365541m.f().f445730d)) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("rawUrl", this.f365541m.f().f445730d);
            intent3.putExtra("useJs", true);
            intent3.putExtra("vertical_scroll", true);
            intent3.putExtra("geta8key_scene", 3);
            j45.l.j(abstractActivityC21394xb3d2c0cf, "webview", ".ui.tools.WebViewUI", intent3, null);
        }
        if (str.startsWith("contact_info_bizinfo_external#") && (P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str.replace("contact_info_bizinfo_external#", ""), -1)) >= 0 && P < this.f365539h.size()) {
            qk.d dVar = (qk.d) this.f365539h.get(P);
            java.lang.String str4 = dVar.f445596c;
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("rawUrl", str4);
            intent4.putExtra("useJs", true);
            intent4.putExtra("vertical_scroll", true);
            intent4.putExtra("geta8key_scene", 3);
            intent4.putExtra("KPublisherId", "brand_profile");
            intent4.putExtra("prePublishId", "brand_profile");
            if ((this.E != null && ((i19 = this.f365542n) == 39 || i19 == 56 || i19 == 35)) || (i18 = this.f365542n) == 87 || i18 == 89 || i18 == 85 || i18 == 88) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("KFromBizSearch", true);
                bundle.putBundle("KBizSearchExtArgs", this.E);
                intent4.putExtra("jsapiargs", bundle);
                int i28 = this.f365537f.r2() ? 7 : 6;
                int identifier = abstractActivityC21394xb3d2c0cf.getResources().getIdentifier(dVar.f445595b, "string", abstractActivityC21394xb3d2c0cf.getPackageName());
                java.lang.String str5 = dVar.f445594a;
                if (identifier > 0) {
                    str5 = abstractActivityC21394xb3d2c0cf.getString(identifier);
                }
                p(i28, str5);
            }
            j45.l.j(abstractActivityC21394xb3d2c0cf, "webview", ".ui.tools.WebViewUI", intent4, null);
            return true;
        }
        if ("contact_info_subscribe_bizinfo".endsWith(str) || "contact_info_show_brand".endsWith(str) || "contact_info_locate".endsWith(str)) {
            qk.o oVar2 = this.f365538g;
            if (oVar2 == null) {
                return true;
            }
            if ("contact_info_subscribe_bizinfo".endsWith(str)) {
                if (!oVar2.J0()) {
                    if (oVar2.W0()) {
                        oVar2.f66733x6baace8e |= 1;
                        if (this.f365541m == null) {
                            z17 = false;
                            this.f365541m = oVar2.D0(false);
                        } else {
                            z17 = false;
                        }
                        qk.n nVar = this.f365541m;
                        if (nVar == null || !nVar.q()) {
                            i17 = 1;
                            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_template_recv", true);
                        } else {
                            j45.l.g("brandservice");
                            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_template_recv", z17);
                            i17 = 1;
                        }
                    } else {
                        i17 = 1;
                        oVar2.f66733x6baace8e &= -2;
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_template_recv", true);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[6];
                    objArr[0] = oVar2.f66748xdec927b;
                    objArr[i17] = java.lang.Integer.valueOf(i17);
                    objArr[2] = java.lang.Integer.valueOf(oVar2.W0() ? 3 : 4);
                    objArr[3] = 0;
                    objArr[4] = "";
                    objArr[5] = java.lang.Integer.valueOf(this.f365542n);
                    g0Var.d(13307, objArr);
                } else if (oVar2.F0()) {
                    c01.d9.e().a(td1.t.f76810x366c91de, this);
                    er3.e eVar = new er3.e(oVar2.f66748xdec927b, ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).h("contact_info_subscribe_bizinfo")).N() ? 0 : 4, 4);
                    c01.d9.e().g(eVar);
                    this.H = db5.e1.Q(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new hr3.o6(this, eVar));
                } else if (oVar2.I0()) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).h("contact_info_subscribe_bizinfo");
                    r01.q bj6 = r01.q3.bj();
                    java.lang.String str6 = oVar2.f66748xdec927b;
                    boolean z19 = !c21541x1c1b08fe.N();
                    bj6.getClass();
                    r45.hk hkVar = new r45.hk();
                    hkVar.f457754d = str6;
                    hkVar.f457757g = z19 ? 17 : 0;
                    hkVar.f457755e = 0;
                    r01.o3 o3Var = new r01.o3(hkVar, 17, 1, this);
                    this.H = db5.e1.Q(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new hr3.p6(this, gm0.j1.n().f354821b.h(o3Var, 0) ? o3Var : null));
                }
            } else if ("contact_info_show_brand".endsWith(str)) {
                int i29 = oVar2.f66733x6baace8e;
                if ((i29 & 2) == 0) {
                    oVar2.f66733x6baace8e = i29 | 2;
                } else {
                    oVar2.f66733x6baace8e = i29 & (-3);
                }
            } else if ("contact_info_locate".endsWith(str)) {
                if (oVar2.u0()) {
                    oVar2.f66733x6baace8e &= -5;
                } else {
                    db5.e1.u(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b18, this.f365537f.g2()), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new hr3.j6(this, oVar2), new hr3.l6(this, oVar2));
                }
            }
            if (oVar2.F0() || oVar2.I0()) {
                return true;
            }
            d(oVar2, false);
            return true;
        }
        if ("contact_info_verifyuser".endsWith(str)) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.M4(this.f365537f.d1())) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.a();
            }
            if (c01.e2.a0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetBizInfo", "contact_info_verifyuser no click isWeChatUser.");
                return true;
            }
            qk.o oVar3 = this.f365538g;
            if (oVar3 == null || (D0 = oVar3.D0(false)) == null) {
                return true;
            }
            java.lang.String str7 = (D0.k() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D0.k().f445712d)) ? (D0.i() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D0.i().f445779b)) ? null : D0.i().f445779b : D0.k().f445712d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                return true;
            }
            android.content.Intent intent5 = new android.content.Intent();
            intent5.putExtra("rawUrl", str7);
            intent5.putExtra("useJs", true);
            intent5.putExtra("vertical_scroll", true);
            intent5.putExtra("geta8key_scene", 3);
            j45.l.j(abstractActivityC21394xb3d2c0cf, "webview", ".ui.tools.WebViewUI", intent5, null);
            return true;
        }
        if ("contact_info_trademark".endsWith(str)) {
            qk.o oVar4 = this.f365538g;
            if (oVar4 != null && oVar4.D0(false) != null) {
                qk.n D02 = oVar4.D0(false);
                org.json.JSONObject jSONObject = D02.f445789a;
                if (jSONObject != null) {
                    D02.f445814z = jSONObject.optString("TrademarkUrl");
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D02.f445814z)) {
                    android.content.Intent intent6 = new android.content.Intent();
                    qk.n D03 = oVar4.D0(false);
                    org.json.JSONObject jSONObject2 = D03.f445789a;
                    if (jSONObject2 != null) {
                        D03.f445814z = jSONObject2.optString("TrademarkUrl");
                    }
                    intent6.putExtra("rawUrl", D03.f445814z);
                    intent6.putExtra("useJs", true);
                    intent6.putExtra("vertical_scroll", true);
                    intent6.putExtra("geta8key_scene", 3);
                    j45.l.j(abstractActivityC21394xb3d2c0cf, "webview", ".ui.tools.WebViewUI", intent6, null);
                    return true;
                }
            }
            return true;
        }
        if ("contact_is_mute".endsWith(str)) {
            boolean z27 = !this.f365546r;
            this.f365546r = z27;
            if (z27) {
                c01.e2.p0(this.f365537f, true);
            } else {
                c01.e2.z0(this.f365537f, true);
            }
            r(this.f365546r);
        }
        if ("enterprise_contact_info_enter".equals(str)) {
            if (abstractActivityC21394xb3d2c0cf == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetBizInfo", "EnterEnterprise context is null");
            } else if (this.f365538g == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetBizInfo", "EnterEnterprise bizInfo is null");
            } else {
                android.content.Intent intent7 = new android.content.Intent();
                intent7.putExtra("enterprise_biz_name", this.f365538g.f66748xdec927b);
                intent7.addFlags(67108864);
                j45.l.j(abstractActivityC21394xb3d2c0cf, "brandservice", ".ui.EnterpriseBizContactListUI", intent7, null);
            }
        }
        if ("contact_info_biz_disable".equals(str)) {
            str2 = "enterprise_biz_name";
            db5.e1.A(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c17), "", abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572660c16), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.m6(this), null);
        } else {
            str2 = "enterprise_biz_name";
        }
        if ("contact_info_biz_enable".equals(str)) {
            h(true);
        }
        if ("contact_info_template_recv".equals(str)) {
            android.content.Intent intent8 = new android.content.Intent();
            intent8.putExtra(str2, this.f365538g.f66748xdec927b);
            j45.l.j(abstractActivityC21394xb3d2c0cf, "brandservice", ".ui.ReceiveTemplateMsgMgrUI", intent8, null);
        }
        if ("contact_info_service_phone".equals(str) && (h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).h("contact_info_service_phone")) != null && h17.n() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.n().toString())) {
            java.lang.String charSequence = h17.n().toString();
            db5.e1.K(abstractActivityC21394xb3d2c0cf, true, charSequence, "", abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bd7), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.f6(this, charSequence), null);
        }
        if ("contact_info_expose_btn".equals(str)) {
            g();
        }
        if (str.equals("biz_placed_to_the_top")) {
            if (this.B == null) {
                this.B = abstractActivityC21394xb3d2c0cf.getSharedPreferences(abstractActivityC21394xb3d2c0cf.getPackageName() + "_preferences", 0);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f365537f;
            if (z3Var2 != null) {
                if (z3Var2.w2()) {
                    this.f365537f.getClass();
                    c01.e2.B0(this.f365537f.d1(), true, true);
                    this.B.edit().putBoolean("biz_placed_to_the_top", false).commit();
                    return true;
                }
                c01.i0.a(this.f365537f.d1(), true);
                this.f365537f.getClass();
                this.B.edit().putBoolean("biz_placed_to_the_top", true).commit();
                return true;
            }
        }
        return true;
    }

    @Override // r01.d0
    public void a(java.util.LinkedList linkedList) {
        r01.e0 fj6 = r01.q3.fj();
        synchronized (fj6.f449583d) {
            if (fj6.f449587h.contains(this)) {
                fj6.f449587h.remove(this);
            }
        }
        if (this.f365536e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, screen is null");
            return;
        }
        if (this.f365537f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, contact is null");
            return;
        }
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, worker is null");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f365553y)) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.ob7 ob7Var = (r45.ob7) it.next();
                java.lang.String str = ob7Var.f463670d;
                if (str != null && str.equals(this.f365553y)) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_kf_worker", false);
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).h("contact_info_kf_worker").H(ob7Var.f463672f);
                    return;
                }
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_kf_worker", false);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).h("contact_info_kf_worker");
        if (h17 == null || linkedList.get(0) == null) {
            return;
        }
        h17.H(((r45.ob7) linkedList.get(0)).f463672f);
    }

    @Override // r01.d0
    public java.lang.String b() {
        return "MicroMsg.ContactWidgetBizInfo";
    }

    public final void d(qk.o oVar, boolean z17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).h("contact_info_subscribe_bizinfo");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).h("contact_info_locate");
        r45.ln4 ln4Var = new r45.ln4();
        ln4Var.f461192d = oVar.f66733x6baace8e;
        ln4Var.f461193e = this.f365537f.d1();
        if (l(this.f365542n)) {
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(58, ln4Var));
        } else {
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(47, ln4Var));
        }
        r01.q3.cj().mo9952xce0038c9(oVar, new java.lang.String[0]);
        c21541x1c1b08fe.O(oVar.W0());
        if (c21541x1c1b08fe2 != null) {
            c21541x1c1b08fe2.O(oVar.u0());
        }
        if (z17) {
            n();
        }
    }

    public boolean e() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f365535d;
        if (abstractActivityC21394xb3d2c0cf.getIntent() == null) {
            return false;
        }
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030);
        java.lang.String stringExtra2 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("device_type");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5336xc89469db c5336xc89469db = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5336xc89469db();
        am.f5 f5Var = c5336xc89469db.f135652g;
        f5Var.f88171b = stringExtra;
        f5Var.f88170a = stringExtra2;
        c5336xc89469db.e();
        return c5336xc89469db.f135653h.f88272a;
    }

    public final void f() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f365535d;
        if (abstractActivityC21394xb3d2c0cf.getIntent() != null && abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("KIsHardDevice", false)) {
            java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("KHardDeviceBindTicket");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetBizInfo", "bindTicket is null, means it is not switch from QRcode scan, just add contact");
            } else if (!e()) {
                c01.d9.e().a(536, this);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5332x1e5a33 c5332x1e5a33 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5332x1e5a33();
                am.y4 y4Var = c5332x1e5a33.f135645g;
                y4Var.f89963a = stringExtra;
                y4Var.f89965c = 1;
                c5332x1e5a33.e();
                com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = c5332x1e5a33.f135646h.f90047a;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f365535d;
                this.H = db5.e1.Q(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new hr3.d6(this, m1Var));
                return;
            }
        }
        r35.a aVar = new r35.a(abstractActivityC21394xb3d2c0cf, new hr3.e6(this));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(java.lang.Integer.valueOf(this.f365542n));
        java.lang.String str = this.f365547s;
        if (str != null) {
            aVar.f450548p = str;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A)) {
            aVar.f450549q = this.A;
        }
        aVar.f450558z = true;
        aVar.b(this.f365537f.d1(), linkedList, false, this.G);
    }

    public final void g() {
        java.lang.String str;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f365537f;
        if (z3Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.d1())) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        qk.o oVar = this.f365538g;
        intent.putExtra("rawUrl", (oVar == null || !oVar.I0() || (str = this.f365538g.f66730x28d45f97) == null) ? java.lang.String.format(f365534J, this.f365537f.d1()) : java.lang.String.format("https://work.weixin.qq.com/wework_admin/wxPlugins/wwappComplaint?scene=2&ref=wxPluginsWwCorp&complaintsCorpid=%s", str));
        intent.putExtra("showShare", false);
        j45.l.j(this.f365535d, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void h(boolean z17) {
        er3.f fVar = new er3.f(this.f365538g.f66748xdec927b, !z17);
        c01.d9.e().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.q0.f34310x366c91de, this);
        c01.d9.e().g(fVar);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f365535d;
        this.H = db5.e1.Q(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f365535d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new hr3.n6(this, fVar));
    }

    public final void i(r01.a0 a0Var) {
        java.lang.System.currentTimeMillis();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.s0 Ni = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni();
        if (Ni.n0(a0Var.f66824x996f3ea) == null) {
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            r0Var.f152062a = a0Var.f66824x996f3ea;
            r0Var.f152065d = a0Var.f66821xff000111;
            r0Var.f152067f = 0;
            r0Var.f152063b = 3;
            Ni.y0(r0Var);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.wi().b(a0Var.f66824x996f3ea);
        java.lang.System.currentTimeMillis();
    }

    public final java.lang.String j(int i17) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f365535d;
        if (i17 == 0) {
            return abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bjb);
        }
        if (i17 == 1) {
            return abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.apa);
        }
        if (i17 == 2) {
            return abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.apb);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetBizInfo", "getVerifyStr, error type %d", java.lang.Integer.valueOf(i17));
        return abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.be6);
    }

    public final void k(boolean z17) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f365535d;
        if (this.f365537f.k2()) {
            try {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.l2v);
                if (frameLayout != null) {
                    if (!z17) {
                        if (frameLayout.findViewById(com.p314xaae8f345.mm.R.id.cax) == null) {
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0f, (android.view.ViewGroup) null);
                            android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ccx);
                            textView.setText(abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bdb));
                            textView.setTextColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp));
                            textView.setOnClickListener(new hr3.s6(this));
                            frameLayout.addView(linearLayout);
                        }
                        frameLayout.setVisibility(0);
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_expose_btn", true);
                        return;
                    }
                    android.view.View findViewById = frameLayout.findViewById(com.p314xaae8f345.mm.R.id.cax);
                    if (findViewById != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo", "hideExposeBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo", "hideExposeBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetBizInfo", "isShowExposeBtn Exception: " + e17.getMessage());
            }
        }
    }

    public final boolean l(int i17) {
        return i17 == 81 || i17 == 92 || i17 == 93 || i17 == 94;
    }

    public final boolean m(java.lang.String str) {
        try {
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str, 0L);
            if (V > 0) {
                return V - (java.lang.System.currentTimeMillis() / 1000) < 0;
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0d97  */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0d34  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 3503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr3.t6.n():void");
    }

    public final void o() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f365537f;
        if (z3Var == null || !z3Var.r2() || com.p314xaae8f345.mm.p2621x8fb0427b.z3.z4(this.f365537f.d1()) || c01.e2.c0(this.f365537f.d1())) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_is_mute", true);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f365537f;
            if (z3Var2 == null || z3Var2.r2() || !l(this.f365542n)) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_expose_btn", true);
                k(true);
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_expose_btn", false);
                k(false);
            }
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_is_mute", false);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_verifyuser_weibo", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_subscribe_bizinfo", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_template_recv", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_locate", true);
        if (this.f365548t) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_biz_add", true);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_time_expired", true);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = this.f365537f;
        if (z3Var3 == null || !((com.p314xaae8f345.mm.p2621x8fb0427b.z3.l4(z3Var3.d1()) || c01.e2.c0(this.f365537f.d1())) && this.f365537f.r2())) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_biz_go_chatting", true);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_biz_go_chatting", false);
        }
        if (c01.e2.c0(this.f365537f.d1())) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).m("contact_info_user_desc", true);
        }
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f365535d;
        if (abstractActivityC21394xb3d2c0cf == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetBizInfo", "null == context");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetBizInfo", "onActivityResult, requestCode = %d, resultCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 1 && i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("be_send_card_name");
            java.lang.String stringExtra2 = intent.getStringExtra("received_card_name");
            boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
            java.lang.String stringExtra3 = intent.getStringExtra("custom_send_text");
            ((dk5.s5) tg3.t1.a()).Di(stringExtra, stringExtra2, booleanExtra, null);
            ((dk5.s5) tg3.t1.a()).Ui(stringExtra3, stringExtra2);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_p), null, abstractActivityC21394xb3d2c0cf, null, null);
        }
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16837x22373da9 c16837x22373da9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16837x22373da9) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).h("contact_info_header_bizinfo");
        if (c16837x22373da9 == null) {
            return true;
        }
        c16837x22373da9.O();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.gi5 gi5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2;
        r45.gi5 gi5Var2;
        r45.gi5 gi5Var3;
        r45.xj xjVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4;
        this.f365554z = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.H;
        if (u3Var != null && u3Var.isShowing()) {
            this.H.dismiss();
        }
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetBizInfo", "scene == null");
            return;
        }
        c01.d9.e().q(m1Var.mo808xfb85f7b0(), this);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetBizInfo", "scene.getType() = %s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
            return;
        }
        m1Var.mo808xfb85f7b0();
        if (m1Var.mo808xfb85f7b0() == 536) {
            c01.d9.e().q(536, this);
            n();
            return;
        }
        r45.mi6 mi6Var = null;
        r1 = null;
        r45.t16 t16Var = null;
        mi6Var = null;
        if (m1Var.mo808xfb85f7b0() == 1363) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((er3.e) m1Var).f337562e;
            r45.u16 u16Var = (oVar == null || (fVar4 = oVar.f152244b.f152233a) == null) ? null : (r45.u16) fVar4;
            if (oVar != null && (fVar3 = oVar.f152243a.f152217a) != null) {
                t16Var = (r45.t16) fVar3;
            }
            if (u16Var == null || (gi5Var3 = u16Var.f468482d) == null || gi5Var3.f456821d != 0 || (xjVar = u16Var.f468483e) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xjVar.f471686d)) {
                if (u16Var == null || (gi5Var2 = u16Var.f468482d) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd err:resp == null");
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd err:code:%s", java.lang.Integer.valueOf(gi5Var2.f456821d));
                    return;
                }
            }
            if (u16Var.f468483e == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd resp.user == null");
                return;
            }
            s01.a0 y07 = r01.q3.Vi().y0(u16Var.f468483e.f471686d);
            if (y07 == null) {
                y07 = new s01.a0();
                y07.f65840x13fe5d2b = u16Var.f468483e.f471686d;
            }
            r45.xj xjVar2 = u16Var.f468483e;
            y07.f65841xdde069b = xjVar2.f471687e;
            y07.f65836x75756b18 = t16Var.f467600d;
            y07.f65833xd21ffea8 = xjVar2.f471688f;
            y07.f65837x35be6339 = xjVar2.f471689g;
            y07.f65839x776e2b6b = xjVar2.f471690h;
            y07.f65835x6e664fd4 = xjVar2.f471691i;
            y07.f65834x53f3fff9 = xjVar2.f471692m;
            y07.f65838x18bd0ff = false;
            if (r01.q3.Vi().J0(y07)) {
                return;
            }
            r01.q3.Vi().mo880xb970c2b9(y07);
            return;
        }
        if (m1Var.mo808xfb85f7b0() != 1394) {
            if (m1Var.mo808xfb85f7b0() == 1343) {
                n();
                return;
            } else {
                if (m1Var.mo808xfb85f7b0() == 1228) {
                    n();
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar2 = ((er3.f) m1Var).f337564e;
        r45.li6 li6Var = (oVar2 == null || (fVar2 = oVar2.f152243a.f152217a) == null) ? null : (r45.li6) fVar2;
        if (oVar2 != null && (fVar = oVar2.f152244b.f152233a) != null) {
            mi6Var = (r45.mi6) fVar;
        }
        if (mi6Var == null || (gi5Var = mi6Var.f462084d) == null || gi5Var.f456821d != 0) {
            if (mi6Var == null || mi6Var.f462084d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetBizInfo", "chuangchen onSceneEnd type:%s, err:resp == null", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetBizInfo", "chuangchen onSceneEnd type:%s, err:code:%s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), java.lang.Integer.valueOf(mi6Var.f462084d.f456821d));
                return;
            }
        }
        if (!(!li6Var.f461039e)) {
            qk.o oVar3 = this.f365538g;
            oVar3.f66733x6baace8e |= 1;
            d(oVar3, true);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k(oVar3.f66748xdec927b);
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).u(oVar3.f66739xdfb76cc2) <= 0) {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k(oVar3.f66739xdfb76cc2);
                return;
            } else {
                c01.d9.b().k().b(oVar3.f66739xdfb76cc2);
                return;
            }
        }
        qk.o oVar4 = this.f365538g;
        oVar4.f66733x6baace8e &= -2;
        d(oVar4, true);
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(oVar4.f66748xdec927b) == null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(oVar4.f66748xdec927b);
            java.lang.String y08 = this.f365538g.y0();
            if (y08 == null) {
                y08 = "";
            }
            l4Var.T1(y08);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).q5(oVar4.f66748xdec927b);
            if (q57 != null) {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).G(l4Var);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).a0(q57);
            } else {
                l4Var.f2();
                ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).G(l4Var);
            }
        }
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(oVar4.f66739xdfb76cc2) != null) {
            c01.d9.b().k().b(oVar4.f66739xdfb76cc2);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(oVar4.f66739xdfb76cc2);
        l4Var2.f2();
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).G(l4Var2);
    }

    public final void p(int i17, java.lang.String str) {
        int i18;
        java.lang.String str2;
        android.os.Bundle bundle = this.E;
        if (bundle != null) {
            int i19 = this.f365542n;
            if (i19 == 39 || i19 == 56 || i19 == 35 || i19 == 87 || i19 == 88 || i19 == 89 || i19 == 85) {
                if (this.f365537f == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetBizInfo", "contact is null.");
                    return;
                }
                java.lang.String string = bundle.getString("Contact_Ext_Args_Search_Id");
                java.lang.String string2 = this.E.getString("Contact_Ext_Args_Query_String");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (string2 == null) {
                    string2 = "";
                }
                int i27 = this.E.getInt("Contact_Ext_Args_Index");
                int i28 = this.f365542n;
                if (i28 == 35) {
                    i18 = 1;
                } else if (i28 != 85) {
                    switch (i28) {
                        case 87:
                            i18 = 2;
                            break;
                        case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51695x8a2568b7 /* 88 */:
                            i18 = 3;
                            break;
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45659xd352f050 /* 89 */:
                            i18 = 4;
                            break;
                        default:
                            i18 = 0;
                            break;
                    }
                } else {
                    i18 = 5;
                }
                java.lang.String string3 = this.E.getString("Contact_Ext_Extra_Params");
                if (string3 == null) {
                    string3 = "";
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(string2);
                sb6.append(",");
                sb6.append(i17);
                sb6.append(",");
                java.lang.String d17 = this.f365537f.d1();
                sb6.append(d17 != null ? d17 : "");
                sb6.append(",");
                sb6.append(i27);
                sb6.append(",");
                sb6.append(java.lang.System.currentTimeMillis() / 1000);
                sb6.append(",");
                sb6.append(string);
                sb6.append(",");
                sb6.append(i18);
                java.lang.String sb7 = sb6.toString();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str2 = sb7 + ",," + string3;
                } else {
                    str2 = sb7 + "," + str + "," + string3;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10866, str2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r7.f66825xa783a79b >= 86400000) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr3.t6.q(java.lang.String):void");
    }

    public final void r(boolean z17) {
        if (this.f365537f != null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f365535d;
            if (abstractActivityC21394xb3d2c0cf != null) {
                if (z17) {
                    rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                    java.lang.String d17 = this.f365537f.d1();
                    ((qv.o) u2Var).getClass();
                    if (!r01.z.g(d17)) {
                        abstractActivityC21394xb3d2c0cf.m78594xca3c3c9a(0);
                    }
                }
                abstractActivityC21394xb3d2c0cf.m78594xca3c3c9a(8);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).h("contact_is_mute");
            if (c21541x1c1b08fe != null) {
                c21541x1c1b08fe.O(z17);
            }
        }
    }

    public final void s() {
        if (this.B == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f365535d;
            sb6.append(abstractActivityC21394xb3d2c0cf.getPackageName());
            sb6.append("_preferences");
            this.B = abstractActivityC21394xb3d2c0cf.getSharedPreferences(sb6.toString(), 0);
        }
        if (this.C != null) {
            if (this.f365537f != null) {
                this.B.edit().putBoolean("biz_placed_to_the_top", this.f365537f.w2()).commit();
            } else {
                this.B.edit().putBoolean("biz_placed_to_the_top", false).commit();
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365536e).notifyDataSetChanged();
    }
}

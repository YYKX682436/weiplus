package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public class e0 implements t25.b, p94.m0 {
    public static boolean D;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f234953d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f234954e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f234955f;

    /* renamed from: g, reason: collision with root package name */
    public int f234956g;

    /* renamed from: h, reason: collision with root package name */
    public int f234957h;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f234964r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f234965s;

    /* renamed from: t, reason: collision with root package name */
    public cr3.d0 f234966t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f234967u;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16858xa77bc0e6 f234970x;

    /* renamed from: i, reason: collision with root package name */
    public boolean f234958i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f234959m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f234960n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f234961o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f234962p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f234963q = false;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f234968v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f234969w = false;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Map f234971y = new java.util.HashMap();

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f234972z = null;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d A = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.C16820xddc1f29c(this, com.p314xaae8f345.mm.app.a0.f134821d);
    public boolean B = false;
    public long C = 0;

    public e0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f234953d = abstractActivityC21394xb3d2c0cf;
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, int i17, java.lang.String str) {
        r61.a h17;
        int i18;
        e0Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NewContactWidgetNormal", "addContact respUsername is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(931, 21);
        }
        if (((int) z3Var.E2) == 0) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                z3Var.X1(str);
            }
            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).i0(z3Var);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).m(z3Var.d1());
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(z3Var.d1(), z3Var.J0()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str;
            java.lang.String d17 = z3Var.d1();
            if (d17 == null) {
                d17 = "";
            }
            objArr[1] = d17;
            java.lang.String J0 = z3Var.J0();
            objArr[2] = J0 != null ? J0 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "addContact respUsername:%s, username:%s, encryptUsername:%s", objArr);
            z3Var.X1(str);
        }
        if (((int) z3Var.E2) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewContactWidgetNormal", "addContact : insert contact failed");
            return;
        }
        if (!z3Var.r2() && i17 == 15 && (h17 = m61.k.wi().h(z3Var.d1())) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.E1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.String d18 = z3Var.d1();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.e()) ? 1 : 0);
            java.lang.String[] b17 = com.p314xaae8f345.mm.p670x38b72420.a.b(z3Var);
            if (b17 == null) {
                i18 = 0;
            } else {
                i18 = 5;
                if (b17.length < 5) {
                    i18 = b17.length;
                }
            }
            g0Var.d(12040, d18, 3, valueOf, java.lang.Integer.valueOf(i18));
        }
        c01.e2.m0(z3Var);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) e0Var.f234955f).notifyDataSetChanged();
        r61.z1.c(z3Var.J0(), 0);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5891xc4a59293 c5891xc4a59293 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5891xc4a59293();
        java.lang.String J02 = z3Var.J0();
        am.hq hqVar = c5891xc4a59293.f136199g;
        hqVar.f88395a = J02;
        hqVar.f88396b = 1;
        c5891xc4a59293.e();
    }

    public final void A(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p2621x8fb0427b.e9 e9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "verifyUser user:%s", z3Var.d1());
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(z3Var.d1());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("Contact_Nick", z3Var.P0());
        if (z07 != null) {
            intent.putExtra("Contact_RemarkName", z07.f66692x4854b29d);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e9Var.f275417z)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z08 = ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(e9Var.f275417z);
            if (z08 != null) {
                intent.putExtra("Contact_RoomNickname", z08.z0(e9Var.f275392a));
                intent.putExtra("room_name", e9Var.f275417z);
            }
        }
        intent.putExtra("Contact_Scene", e9Var.f275399h);
        intent.putExtra("Verify_ticket", e9Var.f275411t);
        intent.putExtra("sayhi_with_sns_perm_send_verify", false);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", true);
        intent.putExtra("sayhi_with_jump_to_profile", true);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 7);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 2);
        java.lang.String str = (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()) || Ni != 1) ? (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()) || Ni != 2 || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2";
        boolean m47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1());
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f234953d;
        if ((m47 || com.p314xaae8f345.mm.p2621x8fb0427b.z3.n4(z3Var.d1())) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContactNewFriendWeWeCom.k(abstractActivityC21394xb3d2c0cf, null)) {
            return;
        }
        j45.l.j(abstractActivityC21394xb3d2c0cf, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, str, intent, null);
    }

    public final void B(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NewContactWidgetNormal", "view stranger remark, username is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_Scene", this.f234956g);
        intent.putExtra("Contact_mode_name_type", 0);
        intent.putExtra("Contact_ModStrangerRemark", true);
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("Contact_Nick", z3Var.P0());
        intent.putExtra("Contact_RemarkName", z3Var.w0());
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f234953d;
        intent.putExtra("Contact_RoomNickname", abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Contact_RoomNickname"));
        int intExtra = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("key_label_click_source", 0);
        if (intExtra != 0) {
            intent.putExtra("CONTACT_INFO_UI_SOURCE", intExtra);
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.y(intent, abstractActivityC21394xb3d2c0cf);
    }

    @Override // p94.m0
    public void B4(java.lang.String str, java.lang.String str2, boolean z17, int i17, p94.d0 d0Var, boolean z18) {
    }

    @Override // p94.m0
    public void O0(java.lang.String str, boolean z17, int i17, p94.d0 d0Var) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.s sVar = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.s) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f234955f).h("contact_profile_sns");
        if (sVar == null || p94.w0.c() == null) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19713xa55b1053 c19713xa55b1053 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19713xa55b1053) sVar;
        c19713xa55b1053.M(this.f234954e.d1());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.y().f142307g = c19713xa55b1053.Z != null ? ((java.util.LinkedList) r5).size() : 0;
        if (p94.w0.b() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6) p94.w0.b()).c(this, 3);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f234955f).notifyDataSetChanged();
        if (!d0Var.o() || p94.w0.b() == null) {
            return;
        }
        p94.n0 b17 = p94.w0.b();
        java.lang.String d17 = this.f234954e.d1();
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6) b17).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteBg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        java.lang.String Di = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di();
        java.lang.String str2 = d17 + "bg_";
        java.lang.String str3 = d17 + "tbg_";
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.mm.vfs.w6.h(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(Di, d17) + str3);
            com.p314xaae8f345.mm.vfs.w6.P(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(Di, d17), str2, str3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteBg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0797, code lost:
    
        if ((((i41.l) i95.n0.c(i41.l.class)).Ri().z0(r2.d1()) & 1) > 0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x07ac, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0a7a, code lost:
    
        if ((r4.getIntent().getIntExtra("Contact_Scene", -1) == 14) != false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x07aa, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x07a8, code lost:
    
        if ((r11.f452961d & 1) > 0) goto L273;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0b9d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0c71  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0cb1  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0ca3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0c6c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0a4e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0608  */
    @Override // t25.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r r37, com.p314xaae8f345.mm.p2621x8fb0427b.z3 r38, boolean r39, int r40) {
        /*
            Method dump skipped, instructions count: 3302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0.Q(com.tencent.mm.ui.base.preference.r, com.tencent.mm.storage.z3, boolean, int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0717  */
    @Override // t25.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean R(java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 3343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0.R(java.lang.String):boolean");
    }

    @Override // p94.m0
    public void S0(java.lang.String str, boolean z17, int i17, p94.d0 d0Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.Class cls;
        int i17;
        if (c01.e2.a0() && ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && (i17 = this.f234956g) != 14 && i17 != 30) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).na(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jtx));
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        abstractActivityC21394xb3d2c0cf.getIntent().removeExtra("Accept_NewFriend_FromOutside");
        cls = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.class;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2533xb4860a9e.C20216x43d2e383()) == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.class : (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()) || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.class : cls));
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("room_name", this.f234965s);
        intent.putExtra("Contact_Nick", z3Var.P0());
        intent.putExtra("Contact_RemarkName", z3Var.w0());
        int i18 = this.f234956g;
        if (i18 == 14 || i18 == 8) {
            intent.putExtra("Contact_RoomNickname", abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Contact_RoomNickname"));
        }
        intent.putExtra("Contact_Scene", this.f234956g);
        java.lang.String stringExtra = ((android.app.Activity) context).getIntent().getStringExtra("Verify_ticket");
        if (stringExtra == null) {
            stringExtra = "";
        }
        intent.putExtra("Verify_ticket", stringExtra);
        intent.putExtra("sayhi_with_sns_perm_send_verify", false);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", true);
        intent.putExtra("sayhi_with_sns_permission", z3Var.x2());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "acceptContact", "(Landroid/content/Context;Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "acceptContact", "(Landroid/content/Context;Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r22, com.p314xaae8f345.mm.p2621x8fb0427b.z3 r23, int r24, boolean r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0.c(com.tencent.mm.ui.MMActivity, com.tencent.mm.storage.z3, int, boolean, java.lang.String):void");
    }

    public void d(final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, final com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, final int i17, final boolean z17, final java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "dealAddContactPreCheck() called with: context = [" + abstractActivityC21394xb3d2c0cf + "], user = [" + z3Var + "], addContactScene = [" + i17 + "], hasCheckNeedConfirm = [" + z17 + "]");
        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Ai(abstractActivityC21394xb3d2c0cf, new ns.j() { // from class: com.tencent.mm.plugin.profile.e0$$d
            @Override // ns.j
            public final void a(boolean z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0.this;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = abstractActivityC21394xb3d2c0cf;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = z3Var;
                int i18 = i17;
                boolean z19 = z17;
                java.lang.String str2 = str;
                if (!z18) {
                    e0Var.c(abstractActivityC21394xb3d2c0cf2, z3Var2, i18, z19, str2);
                    return;
                }
                e0Var.getClass();
                ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Bi(abstractActivityC21394xb3d2c0cf2, 3, z3Var2.d1(), new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.o0(e0Var, abstractActivityC21394xb3d2c0cf2, z3Var2, i18, z19, str2));
            }
        });
        if (k()) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f234953d;
            int intExtra = abstractActivityC21394xb3d2c0cf2.getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 0) == 2 ? abstractActivityC21394xb3d2c0cf2.getIntent().getIntExtra("chat_from_scene", 0) : 0;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", this.f234954e.d1());
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(intExtra)));
            hashMap.put("view_id", "yuanbao_addrbook_add");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        }
    }

    public void e(long j17, android.content.Context context) {
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.d1(this, context, j17));
    }

    @Override // p94.m0
    public void e6(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }

    public final void f(final com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, final java.lang.String str, final r35.a aVar, final java.util.LinkedList linkedList) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(z3Var.d1(), true);
        java.lang.String str3 = "";
        if (n17 != null && (str2 = n17.F1) != null) {
            str3 = str2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "handleContactWithTicket dkverify footer add:%s chat:%s ticket:%s", z3Var.d1(), str, str3);
        if (!android.text.TextUtils.isEmpty(str3)) {
            aVar.m(str3);
            aVar.a(z3Var.d1(), str, linkedList);
        } else {
            ((c01.k7) c01.n8.a()).e(z3Var.d1());
            ((java.util.LinkedList) this.f234968v).add(z3Var.d1());
            ((c01.k7) c01.n8.a()).g(z3Var.d1(), str, r35.s.a(java.lang.Integer.valueOf(this.f234956g)), new c01.o8() { // from class: com.tencent.mm.plugin.profile.e0$$g
                @Override // c01.o8
                public final void a(java.lang.String str4, boolean z17) {
                    java.lang.String str5;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "handleContactWithTicket getContactCallBack() called with: username =%s, succ =%s", str4, java.lang.Boolean.valueOf(z17));
                    com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.this;
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).n(z3Var2.d1(), true);
                    if (n18 == null || (str5 = n18.F1) == null) {
                        str5 = "";
                    }
                    java.lang.String str6 = str;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "handleContactWithTicket userName:%s roomId:%s ticket:%s", str4, str6, str5);
                    r35.a aVar2 = aVar;
                    aVar2.m(str5);
                    aVar2.a(z3Var2.d1(), str6, linkedList);
                }
            });
        }
    }

    public final void g() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f234953d;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.l2v);
        if (frameLayout == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewContactWidgetNormal", "[-] bottomContainer was not found, there must be some issues.");
            return;
        }
        vh0.f2 f2Var = (vh0.f2) ((vh0.d1) i95.n0.c(vh0.d1.class));
        java.util.List Ai = f2Var.Ai(this.f234954e.d1());
        if (Ai.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewContactWidgetNormal", "[-] no service agreements found, hide bottom container.");
            frameLayout.removeAllViews();
            frameLayout.setVisibility(8);
        } else {
            frameLayout.removeAllViews();
            if (f2Var.wi(abstractActivityC21394xb3d2c0cf, frameLayout, this.f234954e.d1(), Ai)) {
                frameLayout.setVisibility(0);
            } else {
                frameLayout.setVisibility(8);
            }
        }
    }

    public final void h(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd c21540x14db2dcd, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd c21540x14db2dcd2) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.t();
        h0Var.d(viewOnClickListenerC16860xc669c20a, -1);
        vh0.i2 i2Var = (vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class));
        org.json.JSONArray bj6 = i2Var.bj(this.f234954e.d1());
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f234953d;
        if (bj6 != null) {
            for (int i17 = 0; i17 < bj6.length(); i17++) {
                try {
                    org.json.JSONObject jSONObject = bj6.getJSONObject(i17);
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced c21554xcdf33ced = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced(abstractActivityC21394xb3d2c0cf);
                    c21554xcdf33ced.Q = true;
                    c21554xcdf33ced.L(jSONObject.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
                    c21554xcdf33ced.H(jSONObject.getString("content"));
                    c21554xcdf33ced.S(Integer.MAX_VALUE);
                    c21554xcdf33ced.P = false;
                    c21554xcdf33ced.E(8);
                    java.lang.String str = "";
                    try {
                        str = jSONObject.getString("url");
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NewContactWidgetNormal", e17, "cannot get url", new java.lang.Object[0]);
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        c21554xcdf33ced.E(8);
                    } else {
                        c21554xcdf33ced.f279305f = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.i1(this, this.f234954e.d1(), str);
                        c21554xcdf33ced.E(0);
                    }
                    h0Var.d(c21554xcdf33ced, -1);
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NewContactWidgetNormal", e18, "[-] fail to get profile config detail.", new java.lang.Object[0]);
                }
            }
            if (this.f234954e.r2()) {
                i();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewContactWidgetNormal", "[-] fail to get profile config detail.");
        }
        if (i2Var.Di(this.f234954e.d1())) {
            vh0.g1 g1Var = (vh0.g1) i95.n0.c(vh0.g1.class);
            java.lang.String d17 = this.f234954e.d1();
            vh0.i2 i2Var2 = (vh0.i2) g1Var;
            if (i2Var2.Di(d17)) {
                java.lang.String Vi = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Vi(i2Var2.Vi(d17), "openim_custom_info_header", j41.a0.TYPE_WORDING, 0);
                if (!android.text.TextUtils.isEmpty(Vi)) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b(abstractActivityC21394xb3d2c0cf, null);
                    c21568x1a71b23b.C("openim_company_info_title");
                    c21568x1a71b23b.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0l;
                    c21568x1a71b23b.L(Vi);
                    h0Var.d(c21568x1a71b23b, -1);
                }
            }
            java.util.LinkedList<j41.d0> linkedList = new java.util.LinkedList();
            java.lang.String Zi = i2Var2.Zi(d17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "get customDetailJson:%s, username:%s", Zi, d17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
                try {
                    org.json.JSONArray optJSONArray = new org.json.JSONObject(Zi).optJSONArray("custom_info");
                    if (optJSONArray != null) {
                        for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                            org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i18);
                            j41.d0 d0Var = new j41.d0();
                            d0Var.a(jSONObject2);
                            linkedList.add(d0Var);
                        }
                    }
                } catch (org.json.JSONException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenIMCustomDetail", e19, "parse", new java.lang.Object[0]);
                }
            }
            java.lang.String Vi2 = i2Var2.Vi(d17);
            for (j41.d0 d0Var2 : linkedList) {
                for (j41.e0 e0Var : d0Var2.f379151b) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p1955x625ef5e.C16830x9f0fd089 c16830x9f0fd089 = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p1955x625ef5e.C16830x9f0fd089(abstractActivityC21394xb3d2c0cf);
                    c16830x9f0fd089.f235057x1 = e0Var;
                    c16830x9f0fd089.S = d0Var2.f379150a;
                    c16830x9f0fd089.S(2);
                    c16830x9f0fd089.P = false;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String a17 = e0Var.a(Vi2);
                    ((ke0.e) xVar).getClass();
                    c16830x9f0fd089.H(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(abstractActivityC21394xb3d2c0cf, a17));
                    h0Var.d(c16830x9f0fd089, -1);
                    if (e0Var.f379155d == 4) {
                        c16830x9f0fd089.f279305f = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.j1(this, e0Var, d17);
                    }
                }
            }
        }
        h0Var.d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(abstractActivityC21394xb3d2c0cf, null), -1);
        if (this.f234954e.r2()) {
            h0Var.d(c21540x14db2dcd, -1);
        } else {
            h0Var.d(c21540x14db2dcd2, -1);
        }
    }

    public final void i() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f234953d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced c21554xcdf33ced = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced(abstractActivityC21394xb3d2c0cf);
        if (!abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("YuanBaoRecommendExposed", false)) {
            abstractActivityC21394xb3d2c0cf.getIntent().putExtra("YuanBaoRecommendExposed", true);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("chat_session");
            hashMap.put("view_id", "yuanbao_profile_recommend_btn");
            hashMap.put("enter_type", java.lang.Integer.valueOf(this.f234957h));
            hashMap.put("enter_sessionid", stringExtra);
            hashMap.put("chat_name", this.f234954e.d1());
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 34004);
        }
        c21554xcdf33ced.Q = true;
        c21554xcdf33ced.J(com.p314xaae8f345.mm.R.C30867xcad56011.pdq);
        c21554xcdf33ced.G(com.p314xaae8f345.mm.R.C30867xcad56011.pdp);
        c21554xcdf33ced.S(Integer.MAX_VALUE);
        c21554xcdf33ced.P = false;
        c21554xcdf33ced.E(0);
        c21554xcdf33ced.f279305f = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0() { // from class: com.tencent.mm.plugin.profile.e0$$e
            @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0
            public final boolean a(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0.this;
                e0Var.getClass();
                ((br3.f) ((fc0.e) i95.n0.c(fc0.e.class))).Bi(e0Var.f234954e, e0Var.f234953d, true);
                return true;
            }
        };
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f234955f;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).d(c21554xcdf33ced, -1);
        }
    }

    public final void j(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.m("contact_info_invite_source", true);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f234964r;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f234953d;
        boolean booleanExtra = a3Var == null ? abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("Is_RoomOwner", false) : a3Var.P0();
        if (this.f234956g != 14 || !booleanExtra || this.f234964r == null || z3Var.d1().equals(this.f234964r.f69107x5be1edb3)) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(this.f234956g);
            objArr[1] = java.lang.Boolean.valueOf(booleanExtra);
            objArr[2] = java.lang.Boolean.valueOf(this.f234964r == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "[initInviteSource] addContactScene:%s isOwner:%s null == member:%s", objArr);
            h0Var.m("contact_info_invite_source", true);
            return;
        }
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("inviteer");
        this.f234972z = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            mo.b v07 = this.f234964r.v0(z3Var.d1());
            if (v07 == null || (str = v07.f411783g) == null) {
                str = "";
            }
            this.f234972z = str;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f234972z)) {
            java.lang.String d17 = z3Var.d1();
            java.lang.String str2 = this.f234965s;
            java.util.Map map = c01.v1.f119052a;
            java.lang.String str3 = str2 + "#" + d17;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) c01.v1.f119054c;
            this.f234972z = r2Var.m(str3) ? (java.lang.String) r2Var.get(str3) : "";
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f234972z);
        java.util.List list = this.f234968v;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NewContactWidgetNormal", "mRoomId:%s member:%s , inviter is null!", this.f234965s, z3Var.d1());
            this.A.mo48813x58998cd();
            ((java.util.LinkedList) list).add(z3Var.d1());
            ((c01.k7) c01.n8.a()).g(z3Var.d1(), this.f234965s, r35.s.a(java.lang.Integer.valueOf(this.f234956g)), new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.w0(this));
            return;
        }
        abstractActivityC21394xb3d2c0cf.getIntent().putExtra("inviteer", this.f234972z);
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f(this.f234964r, this.f234972z);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            r(h0Var, this.f234953d, this.f234972z, f17, z3Var, this.f234964r);
        } else {
            ((java.util.LinkedList) list).add(z3Var.d1());
            ((c01.k7) c01.n8.a()).g(z3Var.d1(), this.f234965s, r35.s.a(java.lang.Integer.valueOf(this.f234956g)), new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.x0(this, h0Var));
        }
    }

    public final boolean k() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f234954e.d1());
    }

    public final boolean l() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4 m4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a;
        java.lang.String d17 = this.f234954e.d1();
        if (d17 != null) {
            return r26.i0.n(d17, "@findermsg", false);
        }
        return false;
    }

    public final boolean m() {
        return this.f234953d.getIntent().getIntExtra("Contact_Scene", 0) == 18;
    }

    public final boolean n() {
        return !this.f234954e.r2() && this.f234953d.getIntent().getBooleanExtra("User_Verify", false);
    }

    public final boolean o() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f234954e;
        return z3Var != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(z3Var.d1());
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
        q(this.f234955f, this.f234954e, true);
    }

    @Override // t25.b
    /* renamed from: onBackPress */
    public boolean mo67617x4ceae47d() {
        return false;
    }

    @Override // t25.b
    /* renamed from: onCreate */
    public boolean mo67618x3e5a77bb() {
        float f17;
        if (k()) {
            java.lang.String d17 = this.f234954e.d1();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e());
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = M.getLong("SP_CHAT_BOT_GET_CONTACT", 0L);
            ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).getClass();
            java.lang.String j18 = j62.e.g().j("clicfg_chatbot_profile_getcontact_interval_hour", "1.0", false, true);
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j18);
                f17 = java.lang.Float.parseFloat(j18);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatBotConfigService", e17, "", new java.lang.Object[0]);
                f17 = 1.0f;
            }
            if (((float) (currentTimeMillis - j17)) < f17 * 3600000.0f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "getChatBotContact not within the time range");
            } else {
                ((c01.k7) ((j11.q) ((ct.z2) i95.n0.c(ct.z2.class))).wi()).b(d17, 12, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.c1(this));
                M.putLong("SP_CHAT_BOT_GET_CONTACT", currentTimeMillis);
            }
        }
        return false;
    }

    @Override // t25.b
    /* renamed from: onDestroy */
    public boolean mo67619xac79a11b() {
        return false;
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        if (p94.w0.b() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6) p94.w0.b()).c(this, 3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f234955f).h("contact_profile_header_normal");
        if (viewOnClickListenerC16860xc669c20a != null) {
            viewOnClickListenerC16860xc669c20a.T();
        }
        this.A.mo48814x2efc64();
        cr3.d0 d0Var = this.f234966t;
        if (d0Var != null) {
            ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(d0Var);
        }
        java.util.Iterator it = this.f234968v.iterator();
        while (it.hasNext()) {
            ((c01.k7) c01.n8.a()).f((java.lang.String) it.next());
        }
        return false;
    }

    @Override // t25.b
    /* renamed from: onPause */
    public void mo67620xb01dfb57() {
    }

    @Override // t25.b
    /* renamed from: onResume */
    public void mo67621x57429eec() {
        t();
        if (k()) {
            g();
        }
    }

    public final boolean p() {
        int intExtra = this.f234953d.getIntent().getIntExtra("Contact_Scene", 0);
        return 26 <= intExtra && intExtra <= 29;
    }

    public final void q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17) {
        java.lang.String[] strArr;
        int i17;
        int i18;
        int i19;
        if (!n()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
            h0Var.m("contact_profile_accept_contact", true);
            h0Var.m("contact_profile_accept_contact_by_wework", true);
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var2.m("contact_profile_setting_permission", true);
        h0Var2.m("contact_profile_phone", true);
        h0Var2.m("contact_profile_sns", com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()));
        boolean z18 = false;
        boolean z19 = (c01.z1.j() & 268435456) != 0;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f234953d;
        boolean f17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(abstractActivityC21394xb3d2c0cf, "com.tencent.wework");
        java.lang.Integer num = (java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ADD_CONTACT_BY_WEWORK_SWITCH_INT, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "onAttachVerify addByWeworkLocalSwitch:%s ExtStatus:%s openAddByWework:%s isInstallWework:%s", num, java.lang.Long.valueOf(c01.z1.j()), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(f17));
        int intValue = num.intValue();
        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (!(intValue == 1) && (!z19 || !f17)) {
            if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2533xb4860a9e.C20210x1a813b4d()) == 1) && abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("isVerifyExpired", false)) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd c21540x14db2dcd = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd) h0Var2.h("contact_profile_accept_contact");
                c21540x14db2dcd.O(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571437f0), abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560428k4));
                c21540x14db2dcd.w(false);
            }
            h0Var2.m("contact_profile_accept_contact_by_wework", true);
            return;
        }
        h0Var2.m("contact_profile_accept_contact_by_wework", false);
        y35.r[] a17 = hr3.c9.a(abstractActivityC21394xb3d2c0cf, z3Var, this.f234956g);
        java.lang.String b17 = (a17 == null || a17.length < 1) ? "" : hr3.c9.b(abstractActivityC21394xb3d2c0cf, z3Var, this.f234956g);
        java.lang.String d17 = this.f234954e.d1();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ADD_CONTACT_BY_WEWORK_USERNAME_STRING_SYNC, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactUsernameByWework() username:%s", d17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                cl0.g gVar = new cl0.g(str);
                java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("usernames");
                java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4("states");
                java.lang.String[] split = mo15082x48bce8a4.split(",");
                java.lang.String[] split2 = mo15082x48bce8a42.split(",");
                if (split != null && split2 != null) {
                    int i27 = 0;
                    while (i27 < split.length) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(d17, split[i27])) {
                            try {
                                i17 = java.lang.Integer.valueOf(split2[i27]).intValue();
                                strArr = split;
                            } catch (java.lang.NumberFormatException e17) {
                                strArr = split;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactUsernameByWework() Exception:%s", e17.getMessage());
                                i17 = 0;
                            }
                            if (!(i17 == 2)) {
                                if (!(i17 == 3)) {
                                    if (i17 == 1) {
                                        break;
                                    }
                                }
                            }
                            z18 = true;
                            break;
                        }
                        strArr = split;
                        i27++;
                        split = strArr;
                    }
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactUsernameByWework() Exception:%s", e18.getMessage());
            }
            z18 = false;
        }
        if (z18) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd) h0Var2.h("contact_profile_accept_contact_by_wework")).O(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572498be1), abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            return;
        }
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ADD_CONTACT_BY_WEWORK_STRING_SYNC, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactByWework() climsgid:%s", b17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            try {
                cl0.g gVar2 = new cl0.g(str2);
                java.lang.String mo15082x48bce8a43 = gVar2.mo15082x48bce8a4("svrids");
                java.lang.String mo15082x48bce8a44 = gVar2.mo15082x48bce8a4("states");
                java.lang.String[] split3 = mo15082x48bce8a43.split(",");
                java.lang.String[] split4 = mo15082x48bce8a44.split(",");
                if (split3 != null && split4 != null) {
                    for (int i28 = 0; i28 < split3.length; i28++) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(b17, split3[i28])) {
                            try {
                                i18 = java.lang.Integer.valueOf(split4[i28]).intValue();
                            } catch (java.lang.NumberFormatException e19) {
                                i18 = 0;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactByWework() Exception:%s", e19.getMessage());
                            }
                            i19 = i18;
                            break;
                        }
                    }
                }
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactByWework() Exception:%s", e27.getMessage());
            }
        }
        i19 = 1;
        if (i19 == 2 || i19 == 3) {
            h0Var2.m("contact_profile_accept_contact", true);
        }
    }

    public final void r(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, android.app.Activity activity, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, final com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        java.lang.CharSequence charSequence;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "[showInviterView] inviter:%s inviterDisplayName:%s", str, str2);
        activity.getIntent().putExtra("inviteer", str);
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.profile.e0$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0.this;
                e0Var.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var2 = a3Var;
                arrayList.add(a3Var2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/profile/NewContactWidgetNormal", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", e0Var, array);
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.n(e0Var.f234953d, a3Var2, e0Var.f234965s);
                yj0.a.h(e0Var, "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        if (str2 == null) {
            charSequence = "";
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572502be4, str2);
            ((ke0.e) xVar).getClass();
            android.text.SpannableString spannableString = new android.text.SpannableString(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(activity, string));
            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.x1(onClickListener), 0, str2.length(), 33);
            charSequence = spannableString;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16855x7429c046) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_profile_info_profile")).M(com.p314xaae8f345.mm.R.C30867xcad56011.f572503be5, charSequence, 2, null, false);
    }

    public final void s(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, android.content.Context context) {
        java.lang.String d17 = z3Var.d1();
        if (!android.text.TextUtils.isEmpty(d17)) {
            ((co5.p) ((jp5.n) i95.n0.c(jp5.n.class))).Ni(d17);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f234953d, 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.j0(this);
        k0Var.f293388d2 = true;
        k0Var.Y1 = true;
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.k0(this, context, z3Var);
        k0Var.v();
    }

    public final void t() {
        if (!((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f234955f).q("contact_profile_add_contact")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "updateAddContactPrefenceState, prefence no show. ");
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd c21540x14db2dcd = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f234955f).h("contact_profile_add_contact");
        com.p314xaae8f345.mm.p2621x8fb0427b.m7 P0 = r21.w.wi().P0(this.f234954e.d1());
        int i17 = eg4.t1.f334343t;
        this.f234962p = P0 != null && P0.f66375x29d3a50c == 2 && c01.id.c() - P0.f66373x46f58791 < com.p314xaae8f345.mm.p2621x8fb0427b.o7.J0();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f234953d;
        boolean z17 = this.f234962p && abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("Contact_ToProfilePageFromSource", false);
        this.f234962p = z17;
        if (c21540x14db2dcd != null) {
            if (z17) {
                c21540x14db2dcd.L(abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571440f3));
                c21540x14db2dcd.O(abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571440f3), abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                c21540x14db2dcd.N(com.p314xaae8f345.mm.R.C30861xcebc809e.bbw);
                return;
            }
            int color = abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp);
            if (this.f234956g == 17) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("key_msg_talker"), abstractActivityC21394xb3d2c0cf.getIntent().getLongExtra("key_msg_id", -1L));
                if (f27 != null && com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.p(f27)) {
                    this.f234967u = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "SendCardFromCard: updateAddContactPrefenceState, msg is forbid forward");
                }
                if (this.f234967u) {
                    color = abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77832x4b0c7525);
                    c21540x14db2dcd.w(false);
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f234955f).m("contact_profile_has_forward_hint", false);
                } else {
                    c21540x14db2dcd.w(true);
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f234955f).m("contact_profile_has_forward_hint", true);
                }
            }
            c21540x14db2dcd.O(abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hnr), color);
            c21540x14db2dcd.L(abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hnr));
            c21540x14db2dcd.N(com.p314xaae8f345.mm.R.C30861xcebc809e.azm);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0139, code lost:
    
        if (r1 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c3, code lost:
    
        if (r5 == null) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(android.content.Context r29, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r r30, com.p314xaae8f345.mm.p2621x8fb0427b.z3 r31) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0.u(android.content.Context, com.tencent.mm.ui.base.preference.r, com.tencent.mm.storage.z3):void");
    }

    public final void v(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, java.lang.Object obj) {
        boolean z17 = obj instanceof r45.nw6;
        if (z17) {
            r45.nw6 nw6Var = (r45.nw6) obj;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19705x3818ddc1 c19705x3818ddc1 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19705x3818ddc1) h0Var.h("contact_profile_finder");
            if (c19705x3818ddc1 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewContactWidgetNormal", "preference is null!");
                return;
            }
            if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var.m75936x14adae67(0)) == null) {
                h0Var.m("contact_profile_finder", true);
            } else {
                if (!this.B) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21908, 2, 2, 1);
                }
                h0Var.m("contact_profile_finder", false);
                c19705x3818ddc1.R = nw6Var;
                c19705x3818ddc1.M();
                this.B = true;
                if (this.f234959m) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = h0Var.h("openim_pref_key_info");
                    if (h17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p1955x625ef5e.C16830x9f0fd089) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p1955x625ef5e.C16830x9f0fd089) h17).f235058y1 = true;
                        h0Var.notifyDataSetChanged();
                    }
                }
            }
            java.lang.String d17 = this.f234954e.d1();
            boolean z18 = this.B;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.f235111e;
            if (z3Var != null && z3Var.d1().equals(d17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.f235113g = java.lang.Boolean.valueOf(z18);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(this.f234953d.getIntent(), 33, 1, this.f234954e.d1());
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).m("contact_profile_finder", true);
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_profile_header_normal");
            if (viewOnClickListenerC16860xc669c20a != null) {
                viewOnClickListenerC16860xc669c20a.Z = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.nw6) obj).m75936x14adae67(0);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f234955f).notifyDataSetChanged();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_profile_header_normal");
        if (viewOnClickListenerC16860xc669c20a2 != null) {
            viewOnClickListenerC16860xc669c20a2.Z = null;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f234955f).notifyDataSetChanged();
        }
    }

    public final void w(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, java.lang.Object obj) {
        if ((obj instanceof r45.nw6) && !this.f234959m && !this.f234960n) {
            r45.nw6 nw6Var = (r45.nw6) obj;
            if (nw6Var.m75939xb282bd08(3) == 1) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
                h0Var.m("contact_profile_finder_recent_like", false);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19706x749e0873 c19706x749e0873 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19706x749e0873) h0Var.h("contact_profile_finder_recent_like");
                r45.qw6 qw6Var = null;
                if (h0Var.q("contact_profile_finder")) {
                    c19706x749e0873.N = null;
                    c19706x749e0873.M();
                    return;
                }
                if (((r45.d71) nw6Var.m75936x14adae67(4)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(((r45.d71) nw6Var.m75936x14adae67(4)).m75941xfb821914(1))) {
                    qw6Var = new r45.qw6();
                    qw6Var.m75941xfb821914(1).addAll(((r45.d71) nw6Var.m75936x14adae67(4)).m75941xfb821914(1));
                }
                c19706x749e0873.N = qw6Var;
                c19706x749e0873.M();
                return;
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).m("contact_profile_finder_recent_like", true);
    }

    public final void x(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar) {
        if (this.f234970x == null || rVar == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        if (h0Var.q("contact_profile_multi_button")) {
            return;
        }
        h0Var.m("line3", true);
    }

    public final void y(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        if (this.f234969w) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21578x692cd608 c21578x692cd608 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21578x692cd608) h0Var.h("contact_profile_wechat_info");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f234953d;
            java.lang.String string = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8p);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            android.content.res.Resources resources = abstractActivityC21394xb3d2c0cf.getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = abstractActivityC21394xb3d2c0cf.getString(!((z3Var.G1 & 2) > 0) ? com.p314xaae8f345.mm.R.C30867xcad56011.f572460ba3 : com.p314xaae8f345.mm.R.C30867xcad56011.f572461ba4);
            sb6.append(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bj6, objArr));
            sb6.append("  ");
            sb6.append(string);
            java.lang.String sb7 = sb6.toString();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(string);
            c21578x692cd608.P = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.l1(this, c21578x692cd608, sb7, arrayList);
            if (!h0Var.q("contact_profile_hint")) {
                h0Var.m("line2", true);
                h0Var.m("line4", true);
            }
            x(h0Var);
        }
    }

    public final void z(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        boolean z17 = h0Var.q("contact_profile_add_contact") || h0Var.q("contact_profile_accept_contact");
        boolean a07 = c01.e2.a0();
        int i17 = z3Var.G1;
        if ((i17 & 4) > 0) {
            if (!a07) {
                if ((i17 & 2) > 0) {
                    this.f234969w = true;
                }
            }
            if (a07) {
                if (!((i17 & 2) > 0)) {
                    this.f234969w = true;
                }
            }
        }
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_profile_contact_add_wechat_tip, 0) == 1;
        boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_profile_contact_wechat_tip, 0) == 1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needShowWechatTip = ");
        sb6.append(this.f234969w);
        sb6.append(", addWechatUser = ");
        sb6.append(z18);
        sb6.append(", profileWechat = ");
        sb6.append(z19);
        sb6.append(", contact.getExtFlag = ");
        sb6.append(z3Var.G1);
        sb6.append(", isSelfWechatUser = ");
        sb6.append(a07);
        sb6.append(", contact.isWeChatContact() = ");
        sb6.append((z3Var.G1 & 2) > 0);
        sb6.append(", contact.isContactExtflagHasOverseaInfo() = ");
        sb6.append((z3Var.G1 & 4) > 0);
        sb6.append("， isaddContact = ");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", sb6.toString());
        if (this.f234969w) {
            if (z17) {
                if (z18) {
                    this.f234969w = true;
                } else {
                    this.f234969w = false;
                }
            } else if (z19) {
                this.f234969w = true;
            } else {
                this.f234969w = false;
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f234953d;
            if (abstractActivityC21394xb3d2c0cf == null || !abstractActivityC21394xb3d2c0cf.getIntent().hasExtra("Contact_Ext_Flag") || z3Var.r2()) {
                return;
            }
            h0Var.m("line5", true);
        }
    }
}

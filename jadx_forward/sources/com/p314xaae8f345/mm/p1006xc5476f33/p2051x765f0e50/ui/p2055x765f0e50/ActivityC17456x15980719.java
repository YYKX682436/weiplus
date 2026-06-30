package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI */
/* loaded from: classes4.dex */
public class ActivityC17456x15980719 extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f242143y = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f242144g;

    /* renamed from: h, reason: collision with root package name */
    public int f242145h;

    /* renamed from: i, reason: collision with root package name */
    public long f242146i;

    /* renamed from: m, reason: collision with root package name */
    public long f242147m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f242148n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f242149o = "";

    /* renamed from: p, reason: collision with root package name */
    public boolean f242150p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f242151q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f242152r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f242153s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f242154t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f242155u = true;

    /* renamed from: v, reason: collision with root package name */
    public r45.mf6 f242156v = null;

    /* renamed from: w, reason: collision with root package name */
    public boolean f242157w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f242158x = 0;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef
    public int V6() {
        return 2;
    }

    public final void X6(android.widget.LinearLayout linearLayout, int i17, int i18, boolean z17, android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = (android.widget.TextView) android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cbx, null);
        textView.setText(i17);
        textView.setTag(java.lang.Integer.valueOf(i18));
        linearLayout.addView(textView);
        textView.setOnClickListener(onClickListener);
        if (z17) {
            textView.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3, 0, 0, 0);
        }
    }

    public final boolean Y6(boolean z17, int i17, int i18) {
        if (z17) {
            this.f242145h = i17 | this.f242145h;
        } else {
            this.f242145h = (~i17) & this.f242145h;
        }
        this.f242148n.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(z17 ? 1 : 2));
        return true;
    }

    public final void Z6() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe;
        r45.cb6 cb6Var = new r45.cb6();
        r45.mf6 Ai = ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).Ai();
        if (p94.w0.c() != null) {
            cb6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).b1(this.f242149o);
        }
        if (cb6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingPrivacy", "userinfo is null");
            return;
        }
        this.f242150p = (c01.z1.n() & 32768) == 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSnsOpenEntrance ");
        sb6.append(this.f242150p);
        sb6.append(", install true, flag ");
        sb6.append((32768 & c01.z1.n()) == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingPrivacy", sb6.toString());
        if (this.f242150p) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242144g).m("settings_story_notify", false);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242144g).m("settings_story_notify", true);
        }
        if (this.f242150p && (c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242144g).h("settings_story_notify")) != null) {
            c21541x1c1b08fe.f279318v = false;
            boolean z17 = Ai.f461993d == 0;
            this.f242155u = z17;
            if (z17) {
                c21541x1c1b08fe.O(true);
            } else {
                c21541x1c1b08fe.O(false);
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242144g).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: createAdapter */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 mo43515x4153c6b3(android.content.SharedPreferences sharedPreferences) {
        return new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.b(this, m79335xcc101dd9(), sharedPreferences);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576459bs;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ioy);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fl(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingPrivacy", "init function status: " + java.lang.Integer.toBinaryString(this.f242145h) + "extStatus: " + java.lang.Long.toBinaryString(this.f242146i) + " FinderSetting: " + java.lang.Long.toBinaryString(this.f242147m));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242144g).h("settings_need_verify");
        c21541x1c1b08fe.f279318v = false;
        c21541x1c1b08fe.O((this.f242145h & 32) != 0);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242144g).h("settings_recommend_mobilefriends_to_me");
        c21541x1c1b08fe2.f279318v = false;
        if (str == null || str.length() <= 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242144g).v(c21541x1c1b08fe2);
        } else {
            c21541x1c1b08fe2.O(!((this.f242145h & 256) != 0));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242144g).h("settings_find_google_contact");
        c21541x1c1b08fe3.f279318v = false;
        c21541x1c1b08fe3.O(!((this.f242145h & 1048576) != 0));
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(208903, null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(this) || android.text.TextUtils.isEmpty(str2)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242144g).v(c21541x1c1b08fe3);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242144g).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f242144g = m79336x8b97809d();
        this.f242145h = c01.z1.p();
        this.f242146i = c01.z1.j();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        this.f242147m = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, 0L);
        this.f242149o = c01.z1.r();
        r45.mf6 Ai = ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).Ai();
        this.f242156v = Ai;
        this.f242155u = Ai.f461993d == 0;
        this.f242158x = getIntent().getIntExtra("enter_scene", 0);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14098, 9);
        int i17 = this.f242158x;
        if (i17 == 1 || i17 == 2) {
            r45.cb6 cb6Var = new r45.cb6();
            if (p94.w0.c() != null) {
                cb6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).b1(this.f242149o);
            }
            if (cb6Var != null) {
                int i18 = cb6Var.f452964g;
                int i19 = cb6Var.f452965h;
                this.f242151q = i19 == 4320 && (i18 & 4096) > 0;
                this.f242152r = i19 == 72 && (i18 & 4096) > 0;
                this.f242154t = i19 == 720 && (i18 & 4096) > 0;
                this.f242153s = (i18 & 2048) > 0;
            }
            r45.cb6 cb6Var2 = new r45.cb6();
            if (p94.w0.c() != null) {
                cb6Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).b1(this.f242149o);
            }
            if (cb6Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingPrivacy", "userinfo is null");
            } else {
                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_RECENT_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue();
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_RECENT_RED_DOT_DID_SHOW_ID_INT;
                if (intValue > ((java.lang.Integer) c17.m(u3Var, 0)).intValue()) {
                    gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(intValue));
                    Z6();
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                aVar.f293266w = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
                aVar.f293242a = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.bdn);
                android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bxx, null);
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.nua);
                android.view.View.OnClickListener elVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.el(this, linearLayout);
                X6(linearLayout, com.p314xaae8f345.mm.R.C30867xcad56011.bdp, 1, this.f242151q, elVar);
                X6(linearLayout, com.p314xaae8f345.mm.R.C30867xcad56011.bdq, 3, this.f242154t, elVar);
                X6(linearLayout, com.p314xaae8f345.mm.R.C30867xcad56011.bdr, 0, this.f242152r, elVar);
                X6(linearLayout, com.p314xaae8f345.mm.R.C30867xcad56011.bdo, 2, (this.f242151q || this.f242152r || this.f242154t) ? false : true, elVar);
                aVar.L = inflate;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                j0Var.e(aVar);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f293370r);
                }
                linearLayout.setTag(j0Var);
                j0Var.show();
                mo53058xe5d1a549(j0Var);
            }
        }
        boolean el6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        boolean z17 = !((c01.z1.j() & 34359738368L) != 0);
        boolean z18 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingPrivacy", "[isShowFinderEntrance] show:%s open:%s, isTeenModeAndNothing:%s", java.lang.Boolean.valueOf(el6), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (el6 && z17 && !z18) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242144g).m("setting_privacy_video_item", false);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242144g).m("setting_privacy_video_item", true);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967 c6991x7b759967 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967();
        c6991x7b759967.f143055d = 1L;
        c6991x7b759967.k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(this.f242145h));
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(this.f242146i));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, java.lang.Long.valueOf(this.f242147m));
        java.util.HashMap hashMap = this.f242148n;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = intValue;
            p53Var.f464295e = intValue2;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingPrivacy", str + " item has been clicked!");
        m79333x58c0be88();
        boolean z17 = true;
        if (str.equals("settings_need_verify")) {
            Y6(((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_need_verify")).N(), 32, 4);
        } else if (str.equals("settings_recommend_mobilefriends_to_me")) {
            Y6(!((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_recommend_mobilefriends_to_me")).N(), 256, 7);
        } else if (str.equals("settings_about_blacklist")) {
            c01.s7 a17 = c01.t7.a(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsb));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("filter_type", a17.a());
            intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.ix6));
            intent.putExtra("list_attr", 32768);
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).A(this, intent);
        } else if (str.equals("setting_privacy_chatting_item")) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(268435456);
            intent2.putExtra("intent_status_show_bottom_tips", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572546bk5));
            intent2.setClassName(this, "com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("setting_privacy_sns_item")) {
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17461x51cb9d67.class);
            intent3.putExtra("need_matte_high_light_item", getIntent().getStringExtra("need_matte_high_light_item"));
            intent3.putExtra("enter_scene", getIntent().getIntExtra("enter_scene", 0));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent3);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("setting_privacy_video_item")) {
            android.content.Intent intent4 = new android.content.Intent();
            intent4.addFlags(268435456);
            intent4.putExtra("intent_status_from_privacy_to_video_setting", true);
            j45.l.j(this, "finder", ".ui.FinderManagementUI", intent4, null);
        } else if (str.equals("setting_privacy_watch_item")) {
            android.content.Intent intent5 = new android.content.Intent();
            intent5.putExtra("intent_status_from_privacy_to_tophistory_setting", true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.i(this, ".ui.home.TopStorySettingUI", intent5);
        } else if (str.equals("setting_privacy_wx_sport_item")) {
            android.content.Intent intent6 = new android.content.Intent();
            intent6.setClassName(this, "com.tencent.mm.ui.contact.privacy.SportBlackListUI");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent6);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_find_google_contact")) {
            Y6(!((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_find_google_contact")).N(), 1048576, 29);
        } else if (str.equals("settings_add_me_way")) {
            android.content.Intent intent7 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17411x484cfcaa.class);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent7);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            if (str.equals("settings_auth_manage")) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetPrivacyPermissions.k(this, null)) {
                    android.content.Intent intent8 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17432x38b6fe4.class);
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(intent8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList5.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else if (str.equals("settings_story_notify")) {
                boolean z18 = !this.f242155u;
                this.f242155u = z18;
                if (z18) {
                    this.f242156v.f461993d = 0;
                } else {
                    this.f242156v.f461993d = 1;
                }
                ze4.f fVar = (ze4.f) i95.n0.c(ze4.f.class);
                java.lang.String str2 = this.f242149o;
                r45.mf6 mf6Var = this.f242156v;
                ((ye4.e) fVar).getClass();
                nf4.g g17 = ef4.w.f334001t.g();
                if (str2 != null && mf6Var != null) {
                    nf4.f y07 = g17.y0(str2);
                    y07.f66296xddbf0be = mf6Var.mo14344x5f01b1f6();
                    g17.b1(y07);
                }
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(71, this.f242156v));
                Z6();
            } else if (str.equals("settings_ad_manage")) {
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_oversea_admanage_url_android, "", true);
                android.content.Intent intent9 = new android.content.Intent();
                intent9.putExtra("rawUrl", java.lang.String.format(Zi, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(this), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.e()));
                intent9.putExtra("showShare", false);
                intent9.putExtra("show_bottom", false);
                j45.l.j(mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent9, null);
            }
            z17 = false;
        }
        W6(rVar, c21560x1fce98fb.f279313q);
        return z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f242145h = c01.z1.p();
        this.f242146i = c01.z1.j();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        this.f242147m = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, 0L);
        Z6();
        if (!this.f242157w) {
            java.lang.String stringExtra = getIntent().getStringExtra("need_matte_high_light_item");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                int o17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242144g).o(stringExtra);
                m79341xf579a34a(o17 - 3);
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.cl(this, o17), 10L);
            }
            this.f242157w = true;
        }
        W6(this.f242144g, "settings_need_verify");
        W6(this.f242144g, "settings_recommend_mobilefriends_to_me");
        W6(this.f242144g, "settings_about_blacklist");
        W6(this.f242144g, "setting_privacy_chatting_item");
        W6(this.f242144g, "setting_privacy_sns_item");
        W6(this.f242144g, "setting_privacy_video_item");
        W6(this.f242144g, "setting_privacy_watch_item");
        W6(this.f242144g, "setting_privacy_wx_sport_item");
        W6(this.f242144g, "settings_find_google_contact");
        W6(this.f242144g, "settings_add_me_way");
        W6(this.f242144g, "settings_auth_manage");
        W6(this.f242144g, "settings_story_notify");
        W6(this.f242144g, "settings_ad_manage");
    }
}

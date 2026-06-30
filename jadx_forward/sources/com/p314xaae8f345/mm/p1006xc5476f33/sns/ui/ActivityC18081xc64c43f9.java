package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsNotInterestUI */
/* loaded from: classes4.dex */
public class ActivityC18081xc64c43f9 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f248822v = {"sns_expose_reason_not_fav", "sns_expose_reason_too_freq", "sns_expose_reason_too_many_same_content", "sns_expose_reason_marketing", "sns_expose_reason_content_sexy", "sns_expose_reason_rumour", "sns_expose_reason_other"};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f248823w = {1, 2, 4, 8, 16, 32, 64};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f248824x = {com.p314xaae8f345.mm.R.C30867xcad56011.j_p, com.p314xaae8f345.mm.R.C30867xcad56011.j_u, com.p314xaae8f345.mm.R.C30867xcad56011.j_v, com.p314xaae8f345.mm.R.C30867xcad56011.j_o, com.p314xaae8f345.mm.R.C30867xcad56011.j_n, com.p314xaae8f345.mm.R.C30867xcad56011.j_s, com.p314xaae8f345.mm.R.C30867xcad56011.j_q};

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f248828g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.EditText f248829h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ListView f248830i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f248831m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f248832n;

    /* renamed from: o, reason: collision with root package name */
    public int f248833o;

    /* renamed from: p, reason: collision with root package name */
    public int f248834p;

    /* renamed from: q, reason: collision with root package name */
    public long f248835q;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f248825d = new java.util.HashMap(7);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f248826e = new java.util.HashMap(7);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f248827f = new java.util.HashMap(7);

    /* renamed from: r, reason: collision with root package name */
    public boolean f248836r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f248837s = false;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f248838t = null;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 f248839u = null;

    public final void V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetOptionMaps", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        java.lang.String[] strArr = f248822v;
        for (int i17 = 0; i17 < 7; i17++) {
            this.f248825d.put(strArr[i17], java.lang.Boolean.FALSE);
        }
        int[] iArr = f248823w;
        for (int i18 = 0; i18 < 7; i18++) {
            this.f248826e.put(java.lang.Integer.valueOf(iArr[i18]), java.lang.Boolean.FALSE);
        }
        for (int i19 = 0; i19 < 7; i19++) {
            this.f248827f.put(strArr[i19], java.lang.Integer.valueOf(iArr[i19]));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetOptionMaps", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.crh;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        super.mo43517x10010bd5();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.j_y);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.an(this));
        this.f248828g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.n89);
        this.f248829h = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.n8_);
        this.f248830i = (android.widget.ListView) findViewById(android.R.id.list);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.dkm);
        this.f248831m = linearLayout;
        linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bn(this));
        this.f248829h.setVisibility(8);
        this.f248828g.setVisibility(8);
        this.f248832n = m79336x8b97809d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initPref", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f248832n;
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsNotInterestUI", "initPref error, PreferenceScreen is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPref", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        } else {
            if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("sns_expose_desc") == null) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b(this, null);
                c21568x1a71b23b.J(com.p314xaae8f345.mm.R.C30867xcad56011.j_l);
                c21568x1a71b23b.C("sns_expose_desc");
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248832n).d(c21568x1a71b23b, -1);
            }
            for (int i17 = 0; i17 < 7; i17++) {
                java.lang.String str = f248822v[i17];
                int i18 = f248824x[i17];
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248832n).h(str) == null) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(this);
                    c21560x1fce98fb.J(i18);
                    c21560x1fce98fb.C(str);
                    c21560x1fce98fb.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
                    c21560x1fce98fb.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570817bz4;
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248832n).d(c21560x1fce98fb, -1);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPref", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        }
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572276ak5), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.cn(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        m78500x43e00957(0, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String m70374x6bf53a6c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        super.onCreate(bundle);
        this.f248833o = getIntent().getIntExtra("sns_info_not_interest_scene", 0);
        long longExtra = getIntent().getLongExtra("sns_info_svr_id", 0L);
        this.f248835q = longExtra;
        if (longExtra != 0 && (m70374x6bf53a6c = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(this.f248835q).m70374x6bf53a6c()) != null) {
            gm0.j1.i();
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(m70374x6bf53a6c).I;
            int[] iArr = f248824x;
            if (i17 == 2) {
                iArr[1] = com.p314xaae8f345.mm.R.C30867xcad56011.j_t;
            } else if (i17 == 1) {
                iArr[1] = com.p314xaae8f345.mm.R.C30867xcad56011.j_u;
            }
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.a(218, this);
        V6();
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        super.onDestroy();
        V6();
        gm0.j1.i();
        gm0.j1.n().f354821b.q(218, this);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5554x58645b64 c5554x58645b64 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5554x58645b64();
        boolean z17 = this.f248836r;
        am.ud udVar = c5554x58645b64.f135874g;
        udVar.f89609a = z17;
        udVar.f89610b = this.f248835q;
        c5554x58645b64.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        if (c21560x1fce98fb == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
            return false;
        }
        java.lang.String str = c21560x1fce98fb.f279313q;
        java.util.HashMap hashMap = this.f248825d;
        if (!hashMap.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
            return false;
        }
        boolean booleanValue = ((java.lang.Boolean) hashMap.get(str)).booleanValue();
        if (booleanValue) {
            c21560x1fce98fb.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570817bz4;
        } else {
            c21560x1fce98fb.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570816bz3;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        boolean z18 = !booleanValue;
        hashMap.put(str, java.lang.Boolean.valueOf(z18));
        this.f248826e.put(java.lang.Integer.valueOf(((java.lang.Integer) this.f248827f.get(str)).intValue()), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSomethingCheck", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        java.util.Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSomethingCheck", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
                z17 = false;
                break;
            }
            if (((java.lang.Boolean) it.next()).booleanValue()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSomethingCheck", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
                z17 = true;
                break;
            }
        }
        if (z17) {
            m78500x43e00957(0, true);
        } else {
            m78500x43e00957(0, false);
        }
        if (z18 && str.equals("sns_expose_reason_other")) {
            this.f248829h.setVisibility(0);
            this.f248828g.setVisibility(0);
            this.f248829h.requestFocus();
            this.f248837s = true;
            mo26063x7b383410();
        } else if (((java.lang.Boolean) hashMap.get("sns_expose_reason_other")).booleanValue()) {
            this.f248830i.requestFocus();
            mo48674x36654fab();
        } else {
            this.f248829h.setVisibility(8);
            this.f248828g.setVisibility(8);
            this.f248830i.requestFocus();
            this.f248837s = false;
            mo48674x36654fab();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        if (m1Var.mo808xfb85f7b0() == 218) {
            this.f248838t.dismiss();
            this.f248838t = null;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2) m1Var).L() == 9) {
                if (i17 == 0 && i18 == 0) {
                    this.f248836r = true;
                    android.widget.Toast.makeText(this, com.p314xaae8f345.mm.R.C30867xcad56011.j_x, 1).show();
                    finish();
                } else {
                    this.f248836r = false;
                    android.widget.Toast.makeText(this, com.p314xaae8f345.mm.R.C30867xcad56011.j_m, 1).show();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }
}

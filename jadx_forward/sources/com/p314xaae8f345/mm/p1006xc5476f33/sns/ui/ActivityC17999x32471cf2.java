package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SightUploadUI */
/* loaded from: classes4.dex */
public class ActivityC17999x32471cf2 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f248166v = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf f248167d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f248169f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18110x6b07f280 f248171h;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f248176p;

    /* renamed from: u, reason: collision with root package name */
    public android.util.DisplayMetrics f248181u;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 f248168e = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f248170g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f248172i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f248173m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f248174n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f248175o = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f248177q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f248178r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f248179s = false;

    /* renamed from: t, reason: collision with root package name */
    public long f248180t = 0;

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf T6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17999x32471cf2 activityC17999x32471cf2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf c18056x3bc9e3cf = activityC17999x32471cf2.f248167d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        return c18056x3bc9e3cf;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ctl;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf c18056x3bc9e3cf = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf) findViewById(com.p314xaae8f345.mm.R.id.n7y);
        this.f248167d = c18056x3bc9e3cf;
        c18056x3bc9e3cf.getInputExtras(true).putInt("wechat_scene", 3);
        this.f248167d.getInputExtras(true).putBoolean("if_support_wx_emoji", true);
        this.f248167d.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o8(this, this.f248181u.widthPixels - (this.f248167d.getPaddingLeft() + this.f248169f.getPaddingRight())), 100L);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(getIntent().getStringExtra("Kdescription"))) {
            this.f248167d.setText(getIntent().getStringExtra("Kdescription"));
        }
        this.f248167d.mo81357xb8fce43d(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p8(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18110x6b07f280 c18110x6b07f280 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18110x6b07f280) findViewById(com.p314xaae8f345.mm.R.id.m9x);
        this.f248171h = c18110x6b07f280;
        c18110x6b07f280.m70800x1b9709f9(this.f248167d);
        this.f248171h.setVisibility(0);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q8(this));
        if (getIntent().getBooleanExtra("KSightDraftEntrance", true)) {
            mo74404x84f07bce(1, com.p314xaae8f345.mm.R.raw.f81049x60f0791f, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.s8(this));
        }
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u8(this), null, com.p314xaae8f345.mm.ui.fb.BLACK);
        m78501x43e00957(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
            return;
        }
        if (i17 == 6 || i17 == 5 || i17 == 10) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18110x6b07f280 c18110x6b07f280 = this.f248171h;
            c18110x6b07f280.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            if (intent == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            } else {
                if (i17 == 10) {
                    c18110x6b07f280.f248927s.d(i17, i18, intent);
                } else if (i17 == 5) {
                    c18110x6b07f280.f248926r.b(i17, i18, intent, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            }
        }
        if (i17 == 5) {
            if (intent == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                return;
            }
            int intExtra = intent.getIntExtra("Ktag_range_index", 0);
            if (intExtra >= 2) {
                this.f248172i = intent.getStringExtra("Klabel_name_list");
                this.f248173m = intent.getStringExtra("Kother_user_name_list");
                java.util.List asList = java.util.Arrays.asList(this.f248172i.split(","));
                java.util.List<java.lang.String> asList2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f248173m) ? null : java.util.Arrays.asList(this.f248173m.split(","));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContactNamesFromLabelsAndOtherUserName", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                this.f248176p = new java.util.ArrayList();
                if (asList != null && asList.size() > 0) {
                    java.util.Iterator it = asList.iterator();
                    while (it.hasNext()) {
                        java.util.List<java.lang.String> j17 = ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e((java.lang.String) it.next()));
                        if (j17 == null || j17.size() == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightUploadUI", "dz: getContactNamesFromLabels,namelist get bu label is null");
                            break;
                        }
                        for (java.lang.String str : j17) {
                            if (!this.f248176p.contains(str)) {
                                this.f248176p.add(str);
                            }
                        }
                    }
                }
                if (asList != null) {
                    java.util.Iterator it6 = asList.iterator();
                    int i19 = 0;
                    while (it6.hasNext()) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) it6.next())) {
                            i19++;
                        }
                    }
                    this.f248174n = i19;
                }
                this.f248175o = 0;
                if (asList2 != null && asList2.size() > 0) {
                    for (java.lang.String str2 : asList2) {
                        if (!this.f248176p.contains(str2)) {
                            this.f248176p.add(str2);
                            this.f248175o++;
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContactNamesFromLabelsAndOtherUserName", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                if (intExtra == 2) {
                    this.f248177q = false;
                } else {
                    this.f248177q = true;
                }
            }
            if (1 == intExtra) {
                this.f248178r = 1;
            } else {
                this.f248178r = 0;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        o25.n1.f(this);
        super.onCreate(bundle);
        this.f248181u = getResources().getDisplayMetrics();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9 j9Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9(this);
        this.f248168e = j9Var;
        j9Var.i(bundle);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.pm_);
        this.f248169f = linearLayout;
        linearLayout.addView(this.f248168e.b());
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.jg9);
        mo2533x106ab264().w(getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        this.f248179s = getIntent().getBooleanExtra("KSnsPostManu", false);
        this.f248180t = getIntent().getLongExtra("KTouchCameraTime", 0L);
        mo43517x10010bd5();
        o25.n1.c(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        super.onDestroy();
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9) this.f248168e).e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18110x6b07f280 c18110x6b07f280 = this.f248171h;
        c18110x6b07f280.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17997xdb716136 c17997xdb716136 = c18110x6b07f280.f248927s;
        c17997xdb716136.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        i11.e eVar = c17997xdb716136.E;
        if (eVar != null) {
            ((i11.h) eVar).m(c17997xdb716136.H);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18110x6b07f280 c18110x6b07f2802 = this.f248171h;
        c18110x6b07f2802.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = c18110x6b07f2802.f248923o;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.l();
            c18110x6b07f2802.f248923o.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        super.onPause();
        mo48674x36654fab();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18110x6b07f280 c18110x6b07f280 = this.f248171h;
        c18110x6b07f280.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        if (c18110x6b07f280.f248923o.getVisibility() == 8) {
            c18110x6b07f280.f248922n.mo26063x7b383410();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }
}

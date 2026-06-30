package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI */
/* loaded from: classes9.dex */
public class ActivityC19078xd7766fa3 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f260778t = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260779d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260780e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f260781f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 f260782g;

    /* renamed from: h, reason: collision with root package name */
    public final int f260783h = 1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f260784i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f260785m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f260786n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f260787o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f260788p;

    /* renamed from: q, reason: collision with root package name */
    public int f260789q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f260790r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f260791s;

    public ActivityC19078xd7766fa3() {
        new android.os.Bundle();
        this.f260791s = new java.util.ArrayList();
    }

    public final void U6() {
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260779d.m83183xfb85ada3());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260780e.m83183xfb85ada3())) {
            z17 = false;
        }
        this.f260781f.setEnabled(z17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d9_;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f260779d = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.ppr);
        this.f260780e = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.ppn);
        this.f260781f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ppo);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) findViewById(com.p314xaae8f345.mm.R.id.ppp);
        this.f260782g = c22607x763d2049;
        c22607x763d2049.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.i1(this));
        this.f260780e.m83169xe7297452().setInputType(131073);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = dimensionPixelSize2;
        this.f260780e.m83173x1e821d71().setLayoutParams(layoutParams);
        this.f260780e.m83173x1e821d71().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e m83173x1e821d71 = this.f260780e.m83173x1e821d71();
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
        m83173x1e821d71.f273574u = com.p314xaae8f345.mm.R.raw.f79679xe7836e52;
        m83173x1e821d71.f273575v = color;
        this.f260780e.m83213x765074af(this.f260788p);
        this.f260780e.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.j1(this));
        this.f260779d.m83213x765074af(this.f260787o);
        this.f260779d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.k1(this));
        this.f260781f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.l1(this));
        U6();
        this.f260782g.e(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.m1(this));
        int max = (int) (java.lang.Math.max(this.f260780e.m83185xf873811e(), this.f260779d.m83185xf873811e()) + 10.0f);
        this.f260780e.m83215xb23bd850(max);
        this.f260779d.m83215xb23bd850(max);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b(new com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2[]{this.f260780e, this.f260779d}, 10);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "[onActivityResult] requestCode：%s, resultCode：%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == this.f260783h && i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("CountryName");
            java.lang.String stringExtra2 = intent.getStringExtra("ProviceName");
            java.lang.String stringExtra3 = intent.getStringExtra("CityName");
            this.f260784i = intent.getStringExtra("Country");
            this.f260785m = intent.getStringExtra("Contact_Province");
            this.f260786n = intent.getStringExtra("Contact_City");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                sb6.append(stringExtra);
                sb6.append(" ");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                sb6.append(stringExtra2);
                sb6.append(" ");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                sb6.append(stringExtra3);
            }
            this.f260787o = sb6.toString();
            this.f260779d.m83213x765074af(sb6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "[onActivityResult] country：%s, province: %s ，city：%s ", stringExtra, stringExtra2, stringExtra3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "[onActivityResult] countryCode：%s, provinceCode: %s， cityCode：%s , zone: %s , mZoneEt：%s", this.f260784i, this.f260785m, this.f260786n, this.f260787o, this.f260779d.m83183xfb85ada3());
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        this.f260784i = getIntent().getStringExtra("key_countrycode");
        this.f260785m = getIntent().getStringExtra("key_provincecode");
        this.f260786n = getIntent().getStringExtra("key_citycode");
        this.f260787o = getIntent().getStringExtra("key_zone");
        java.lang.String stringExtra = getIntent().getStringExtra("key_address");
        this.f260788p = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "[onCreate] countryCode：%s, provinceCode: %s ，cityCode：%s , zone: %s , address：%s", this.f260784i, this.f260785m, this.f260786n, this.f260787o, stringExtra);
        java.lang.String[] stringArrayExtra = getIntent().getStringArrayExtra("key_exclude_country");
        if (stringArrayExtra != null && stringArrayExtra.length > 0) {
            java.util.ArrayList arrayList = this.f260791s;
            arrayList.addAll(java.util.Arrays.asList(stringArrayExtra));
            arrayList.remove("CN");
            arrayList.remove("TW");
            arrayList.remove("HK");
            arrayList.remove("MO");
        }
        mo43517x10010bd5();
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.h1(this), com.p314xaae8f345.mm.R.raw.f78354xfa054953);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f260790r) {
            mo48674x36654fab();
            this.f260782g.m81273xb2a7481e().f87429p = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.u.class);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI */
/* loaded from: classes9.dex */
public class ActivityC19081x5e445f1f extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260800d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260801e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f260802f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f260803g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f260804h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f260805i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f260806m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a2 f260807n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f260808o = "+86";

    /* renamed from: p, reason: collision with root package name */
    public boolean f260809p = false;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260810q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI.1
        {
            this.f39173x3fe91575 = 323604482;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f activityC19081x5e445f1f = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f.this;
            activityC19081x5e445f1f.f260810q.mo48814x2efc64();
            int i17 = c6256xb3fb7c12.f136506g.f87653a;
            if (i17 != -1 && i17 != 0) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealNameVerifyCodeUI", "WcPayRealnameVerifyCodeUI finish");
            activityC19081x5e445f1f.finish();
            return false;
        }
    };

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f activityC19081x5e445f1f) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19081x5e445f1f.f260801e.m83183xfb85ada3()) || !activityC19081x5e445f1f.f260800d.n()) {
            activityC19081x5e445f1f.f260803g.setEnabled(false);
        } else {
            activityC19081x5e445f1f.f260803g.setEnabled(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d9c;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f260800d = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.ppy);
        this.f260801e = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f569288pq0);
        this.f260802f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ppz);
        this.f260803g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ppv);
        this.f260804h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ppu);
        this.f260805i = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.ppw);
        this.f260806m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ppx);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = dimensionPixelSize2;
        this.f260800d.m83173x1e821d71().setLayoutParams(layoutParams);
        this.f260800d.m83173x1e821d71().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e m83173x1e821d71 = this.f260800d.m83173x1e821d71();
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
        m83173x1e821d71.f273574u = com.p314xaae8f345.mm.R.raw.f79679xe7836e52;
        m83173x1e821d71.f273575v = color;
        this.f260801e.m83169xe7297452().setPadding(this.f260801e.m83169xe7297452().getPaddingLeft(), this.f260801e.m83169xe7297452().getPaddingTop(), 0, this.f260801e.m83169xe7297452().getPaddingBottom());
        this.f260802f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.r1(this));
        this.f260803g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.s1(this));
        this.f260800d.m83206xeace15c1(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.t1(this));
        this.f260800d.m83211x749e7e77(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u1(this));
        this.f260801e.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.v1(this));
        this.f260805i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.w1(this));
        this.f260806m.setText(this.f260808o);
        this.f260804h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.z1(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == 100) {
            java.lang.String stringExtra = intent.getStringExtra("country_name");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealNameVerifyCodeUI", "user canceled this select");
                return;
            }
            java.lang.String str = "+" + intent.getStringExtra("couttry_code");
            this.f260808o = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealNameVerifyCodeUI", "countryName: %s, countryCode: %s", stringExtra, str);
            this.f260806m.setText(this.f260808o);
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        mo78530x8b45058f();
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.q1(this), com.p314xaae8f345.mm.R.raw.f78354xfa054953);
        mo43517x10010bd5();
        this.f260810q.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a2 a2Var = this.f260807n;
        if (a2Var != null) {
            a2Var.cancel();
        }
        this.f260810q.mo48814x2efc64();
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

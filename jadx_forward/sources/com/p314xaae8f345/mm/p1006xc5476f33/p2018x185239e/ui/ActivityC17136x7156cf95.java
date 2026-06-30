package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceHKUI */
/* loaded from: classes9.dex */
public class ActivityC17136x7156cf95 extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 {
    public static final /* synthetic */ int N1 = 0;
    public int J1;
    public java.lang.String K1;
    public java.lang.String L1;
    public java.lang.String M1;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683
    public void X6() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683
    public void Y6() {
        m83099x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.y(this.f238668f, this.f238676p, this.J1, ((long) this.f238667e) * 100, this.f238674n == 33 ? 1 : 0), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683
    public void Z6(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5409x1e816faf c5409x1e816faf) {
        m83099x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z(java.lang.Math.round(this.f238667e * 100.0d), this.f238668f, this.f238670h, this.M, this.H, this.f238676p, this.J1, this.f238674n == 33 ? 1 : 0), true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683
    public void d7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683
    public void f7() {
        db5.t7.m123883x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.i0p, this.K1), 0).show();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683
    public void k7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.L1)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.af7);
        textView.setText(this.L1);
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.x6(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 4 && i18 == -1) {
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(1529);
        m83090x14f40144(1257);
        this.J1 = getIntent().getIntExtra("hk_currency", 0);
        this.K1 = getIntent().getStringExtra("hk_currencyuint");
        this.L1 = getIntent().getStringExtra("hk_notice");
        this.M1 = getIntent().getStringExtra("hk_notice_url");
        this.f238680r.m83214xdc742163(this.K1);
        this.A.setText(this.K1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(1529);
        m83121xf6ff5b27(1257);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, np5.f
    /* renamed from: onSceneEnd */
    public void mo66167x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z)) {
            super.mo66167x76e0bfae(i17, i18, str, m1Var, z17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z) m1Var;
        if (i17 != 0 || i18 != 0) {
            db5.e1.F(mo55332x76847179(), str, "", false);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f238601f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceHKUI", "empty payurl");
            return;
        }
        r45.x57 Di = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Di(zVar.f238601f);
        if (Di == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Di.f471336d)) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.W(mo55332x76847179(), zVar.f238601f, false, 4);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceHKUI", "start hk native cashier");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("attach", Di.f471336d);
        bundle.putInt("cashierType", Di.f471339g);
        ((h45.q) i95.n0.c(h45.q.class)).mo24769x9a395b41(mo55332x76847179(), bundle, new h45.k() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceHKUI$$a
            @Override // h45.k
            public final void a(int i19) {
                final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17136x7156cf95 activityC17136x7156cf95 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17136x7156cf95.this;
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17136x7156cf95.N1;
                activityC17136x7156cf95.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceHKUI", "hkcashier callback, retcode is %s", java.lang.Integer.valueOf(i19));
                if (i19 == 1) {
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceHKUI$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17136x7156cf95.N1;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17136x7156cf95.this.finish();
                        }
                    };
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(runnable, 200L, false);
                }
            }
        });
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceOSUI */
/* loaded from: classes9.dex */
public class ActivityC17144x715a1c36 extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 {
    public static final /* synthetic */ int P1 = 0;
    public int J1;
    public java.lang.String K1;
    public java.lang.String L1;
    public java.lang.String M1;
    public boolean N1 = false;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d O1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6267x36e7f58b>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceOSUI.1
        {
            this.f39173x3fe91575 = -704562821;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6267x36e7f58b c6267x36e7f58b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17144x715a1c36 activityC17144x715a1c36 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17144x715a1c36.this;
            if (!activityC17144x715a1c36.N1) {
                return false;
            }
            activityC17144x715a1c36.finish();
            return false;
        }
    };

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683, kv.e0
    public void U(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683
    public void W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13337, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683
    public void X6() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683
    public void Z6(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5409x1e816faf c5409x1e816faf) {
        java.lang.String l17 = c01.z1.l();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
            l17 = c01.z1.r();
        }
        java.lang.String str7 = l17;
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f238668f, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j1 j1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j1(this.f238667e, str7, this.f238668f, ((int) n17.E2) != 0 ? n17.g2() : this.f238668f, str, this.J1);
        j1Var.m82989x7c4af7d8("RemittanceProcess");
        m83098x5406100e(j1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13337, 1, java.lang.Double.valueOf(this.f238667e));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683
    public void f7() {
        db5.t7.m123883x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.i0p, this.K1), 0).show();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ce_;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683
    public void k7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.L1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceOSUI", "no bulletin data");
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.s0(null, (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.af7), "", this.L1, this.M1);
        }
    }

    public boolean n7(java.lang.String str) {
        r45.x57 Di;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (Di = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Di(str)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Di.f471336d)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceOSUI", "start hk native cashier");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("attach", Di.f471336d);
        bundle.putInt("cashierType", Di.f471339g);
        ((h45.q) i95.n0.c(h45.q.class)).mo24769x9a395b41(mo55332x76847179(), bundle, new h45.k() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceOSUI$$a
            @Override // h45.k
            public final void a(int i17) {
                final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17144x715a1c36 activityC17144x715a1c36 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17144x715a1c36.this;
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17144x715a1c36.P1;
                activityC17144x715a1c36.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceOSUI", "hkcashier callback, retcode is %s", java.lang.Integer.valueOf(i17));
                if (i17 == 1) {
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceOSUI$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17144x715a1c36.P1;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17144x715a1c36.this.finish();
                        }
                    };
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(runnable, 200L, false);
                }
            }
        });
        return true;
    }

    public void o7(java.lang.String str) {
        if (n7(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.U(mo55332x76847179(), intent, 3);
        this.N1 = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        this.N1 = false;
        if (i17 == 3 && i18 == -1) {
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.O1.mo48813x58998cd();
        this.f39904x9eeebfc.c(1622);
        this.f39904x9eeebfc.c(1574);
        mo43517x10010bd5();
        this.f238680r.m83214xdc742163("");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().d(this);
        this.J1 = getIntent().getIntExtra("os_currency", 0);
        this.K1 = getIntent().getStringExtra("os_currencyuint");
        getIntent().getStringExtra("os_currencywording");
        this.L1 = getIntent().getStringExtra("os_notice");
        this.M1 = getIntent().getStringExtra("os_notice_url");
        this.f238680r.m83214xdc742163(this.K1);
        k7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.O1.mo48814x2efc64();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().q(this);
        this.f39904x9eeebfc.i(1622);
        this.f39904x9eeebfc.i(1574);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, np5.f
    /* renamed from: onSceneEnd */
    public void mo66167x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        boolean z18;
        super.mo66167x76e0bfae(i17, i18, str, m1Var, z17);
        if (i17 == 0 && i18 == 0 && (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j1) m1Var;
            int i19 = j1Var.f238401h;
            if (i19 > 0) {
                int i27 = j1Var.f238402i;
                z18 = true;
                if (i27 == 0) {
                    db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574359i10, java.lang.Integer.valueOf(i19)), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572072xy), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574351hz5), getString(com.p314xaae8f345.mm.R.C30867xcad56011.i0o), new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.g7(this, j1Var), new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h7(this, j1Var));
                } else if (i27 == 1) {
                    db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574359i10, java.lang.Integer.valueOf(i19)), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572072xy), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574351hz5), getString(com.p314xaae8f345.mm.R.C30867xcad56011.i0o), new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.i7(this, j1Var), new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.j7(this, j1Var));
                }
                if (!z18 || n7(j1Var.f238399f)) {
                }
                java.lang.String str2 = j1Var.f238399f;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str2);
                intent.putExtra("showShare", false);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.U(mo55332x76847179(), intent, 3);
                return;
            }
            z18 = false;
            if (z18) {
            }
        }
    }

    public void p7(java.lang.String str) {
        if (n7(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.U(mo55332x76847179(), intent, 3);
        this.N1 = true;
    }
}

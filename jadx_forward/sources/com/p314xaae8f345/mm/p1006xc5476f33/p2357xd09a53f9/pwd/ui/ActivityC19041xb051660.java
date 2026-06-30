package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

@db5.a(m123858x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI */
/* loaded from: classes9.dex */
public class ActivityC19041xb051660 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368 {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f260360g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f260361h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f260362i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f260363m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.ResultReceiver f260364n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f260365o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f260366p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f260367q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f260368r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f260369s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f260370t;

    /* renamed from: u, reason: collision with root package name */
    public pz2.a f260371u;

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368
    public boolean W6(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }

    public final void X6() {
        if (this.f260366p == 1) {
            Z6(this.f260362i, false);
            Z6(this.f260363m, false);
        } else {
            Z6(this.f260361h, false);
        }
        Z6(this.f260360g, true);
    }

    public final boolean Y6(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        return c21560x1fce98fb.H == com.p314xaae8f345.mm.R.C30864xbddafb2a.c0s;
    }

    public final void Z6(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, boolean z17) {
        c21560x1fce98fb.H = z17 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.c0s : com.p314xaae8f345.mm.R.C30864xbddafb2a.c0t;
    }

    public final void a7(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "show enroll biometric guide: %s", java.lang.Integer.valueOf(i17));
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kur);
        if (i17 == 1) {
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kut);
        }
        db5.e1.y(this, string, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.kuq), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.k(this));
    }

    public final void b7(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "start open process: %s", java.lang.Integer.valueOf(i17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("open_scene", 1);
        bundle.putInt("key_open_biometric_type", i17);
        com.p314xaae8f345.mm.p2802xd031a825.a.k(this, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.f47003xb618721a, "FingerprintAuth", bundle, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576503cz;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = h0Var.h("biometric_pay_close");
        this.f260360g = h17;
        h17.E(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "fingerprint: %s, faceid: %s", java.lang.Boolean.valueOf(((mz2.a) this.f260371u).a()), java.lang.Boolean.valueOf(((mz2.a) this.f260371u).b()));
        int i17 = this.f260366p;
        if (i17 == 2 || i17 == 3) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(this);
            this.f260361h = c21560x1fce98fb;
            c21560x1fce98fb.C("key_single_open");
            this.f260361h.J(com.p314xaae8f345.mm.R.C30867xcad56011.kgs);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb2 = this.f260361h;
            c21560x1fce98fb2.f279318v = false;
            h0Var.d(c21560x1fce98fb2, 0);
            this.f260361h.E(8);
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb3 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(this);
            this.f260363m = c21560x1fce98fb3;
            c21560x1fce98fb3.C("key_faceid_open");
            this.f260363m.J(com.p314xaae8f345.mm.R.C30867xcad56011.kgt);
            h0Var.d(this.f260363m, 0);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb4 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(this);
            this.f260362i = c21560x1fce98fb4;
            c21560x1fce98fb4.C("key_fingerprint_open");
            this.f260362i.J(com.p314xaae8f345.mm.R.C30867xcad56011.kgu);
            h0Var.d(this.f260362i, 1);
            this.f260363m.E(8);
            this.f260362i.E(8);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (is4.a.b() && is4.a.c()) {
            this.f260366p = 1;
        } else if (is4.a.c()) {
            this.f260366p = 2;
        } else if (is4.a.b()) {
            this.f260366p = 3;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBiometricPaySettingsUI", "device not support biometric pay!");
            finish();
        }
        int i17 = this.f260366p;
        if (i17 == 1) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kgr);
        } else if (i17 == 2) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kuf);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kue);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.g(this));
        this.f260364n = (android.os.ResultReceiver) getIntent().getParcelableExtra("key_should_update_result_receiver");
        this.f260371u = (pz2.a) gm0.j1.s(pz2.a.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "biometric mode: %s", java.lang.Integer.valueOf(this.f260366p));
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        android.os.ResultReceiver resultReceiver;
        super.onPause();
        if (!this.f260365o || (resultReceiver = this.f260364n) == null) {
            return;
        }
        resultReceiver.send(0, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "click key: %s", c21560x1fce98fb.f279313q);
        this.f260370t = Y6(this.f260360g);
        if (this.f260366p == 1) {
            this.f260368r = Y6(this.f260363m);
            this.f260369s = Y6(this.f260362i);
        } else {
            this.f260367q = Y6(this.f260361h);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "is checked: %s", java.lang.Boolean.valueOf(Y6(c21560x1fce98fb)));
        if (Y6(c21560x1fce98fb)) {
            return false;
        }
        this.f260365o = true;
        if ("biometric_pay_close".equals(c21560x1fce98fb.f279313q)) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_g);
            if (((mz2.a) this.f260371u).b()) {
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8s);
            }
            db5.e1.K(this, false, string, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.i(this, rVar), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.j(this));
        } else if ("key_single_open".equals(c21560x1fce98fb.f279313q)) {
            int i17 = this.f260366p;
            if (i17 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "on click open fingerprint");
                if (this.f260371u.yh()) {
                    b7(1);
                } else {
                    a7(1);
                }
            } else if (i17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "on click open faceid");
                if (this.f260371u.a1()) {
                    b7(2);
                } else {
                    a7(2);
                }
            }
        } else if ("key_fingerprint_open".equals(c21560x1fce98fb.f279313q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "on click open fingerprint");
            if (this.f260371u.yh()) {
                b7(1);
            } else {
                a7(1);
            }
        } else if ("key_faceid_open".equals(c21560x1fce98fb.f279313q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "on click open faceid");
            if (this.f260371u.a1()) {
                b7(2);
            } else {
                a7(2);
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "update pref check state: %s, %s", java.lang.Boolean.valueOf(((mz2.a) this.f260371u).a()), java.lang.Boolean.valueOf(((mz2.a) this.f260371u).b()));
        if (this.f260366p == 1) {
            if (((mz2.a) this.f260371u).a()) {
                if (this.f260366p == 1) {
                    Z6(this.f260362i, true);
                    Z6(this.f260363m, false);
                    Z6(this.f260360g, false);
                }
            } else if (!((mz2.a) this.f260371u).b()) {
                X6();
            } else if (this.f260366p == 1) {
                Z6(this.f260362i, false);
                Z6(this.f260363m, true);
                Z6(this.f260360g, false);
            }
        } else if (((mz2.a) this.f260371u).a() || ((mz2.a) this.f260371u).b()) {
            int i17 = this.f260366p;
            if (i17 == 2 || i17 == 3) {
                Z6(this.f260361h, true);
                Z6(this.f260360g, false);
            }
        } else {
            X6();
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
    }
}

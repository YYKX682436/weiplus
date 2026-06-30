package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui;

/* renamed from: com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI */
/* loaded from: classes9.dex */
public class ActivityC19200x9865b13c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.a {
    public static final /* synthetic */ int C = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f262821d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f262822e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f262823f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f262824g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.animation.Animation f262825h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f262826i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f262827m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f262828n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f262829o;

    /* renamed from: p, reason: collision with root package name */
    public fu4.h f262830p;

    /* renamed from: q, reason: collision with root package name */
    public fu4.n f262831q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.f f262832r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f262833s = "-1";

    /* renamed from: t, reason: collision with root package name */
    public int f262834t = 0;

    /* renamed from: u, reason: collision with root package name */
    public android.app.ProgressDialog f262835u = null;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f262836v = null;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f262837w = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f262838x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f262839y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f262840z = true;
    public int A = -1;
    public int B = -1;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c activityC19200x9865b13c, int i17, java.lang.String str) {
        activityC19200x9865b13c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "onAuthenFailed errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.m.c(activityC19200x9865b13c.B, 2, 1);
        activityC19200x9865b13c.c7(str);
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c activityC19200x9865b13c, int i17, java.lang.String str) {
        activityC19200x9865b13c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerprintWalletLockUI", "onAuthenError errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        fu4.a.f348417a = -1L;
        activityC19200x9865b13c.V6();
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.m.c(activityC19200x9865b13c.B, 2, 2);
            fu4.a.f(java.lang.System.currentTimeMillis(), 0L);
            activityC19200x9865b13c.f262821d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.knw);
            activityC19200x9865b13c.f262821d.setTextColor(activityC19200x9865b13c.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
            return;
        }
        if (i17 == 8) {
            activityC19200x9865b13c.e7();
        } else {
            activityC19200x9865b13c.c7(str);
        }
    }

    public final void V6() {
        W6();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f262836v;
        if (j0Var == null || !j0Var.isShowing()) {
            return;
        }
        this.f262836v.dismiss();
    }

    public final void W6() {
        android.app.ProgressDialog progressDialog = this.f262835u;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f262835u.dismiss();
    }

    public final void X6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n.INSTANCE.h();
    }

    public final void Y6(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "finish with result, resultCode: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        m73997x41012807();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", i18);
        intent.putExtra("key_err_msg", str);
        setResult(i17, intent);
        finish();
        if (i18 == 4 || i18 == 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f c6244x161a780f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f();
            int i19 = i18 == 4 ? 5 : 6;
            am.n10 n10Var = c6244x161a780f.f136493g;
            n10Var.f88925a = i19;
            n10Var.f88926b = this;
            c6244x161a780f.e();
        }
    }

    public final void Z6() {
        this.f262840z = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new gu4.b(this), 200L);
        android.content.Intent intent = (android.content.Intent) getIntent().getParcelableExtra("page_intent");
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "Protected page's intent not found, finish myself only.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "go to protected page");
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n.INSTANCE;
        nVar.j(true);
        nVar.k(true);
        intent.addFlags(131072);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI", "goToProtectedPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI", "goToProtectedPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
    }

    public final void a7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "currentAction: %s", this.f262828n);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262828n)) {
            finish();
            return;
        }
        java.lang.String str = this.f262828n;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1423990800:
                if (str.equals("next_action.goto_protected_page")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1305462654:
                if (str.equals("action.verify_pattern")) {
                    c17 = 1;
                    break;
                }
                break;
            case -639789777:
                if (str.equals("next_action.switch_on_pattern")) {
                    c17 = 2;
                    break;
                }
                break;
            case 1420518755:
                if (str.equals("action.switch_on_pattern")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                fu4.a.f348417a = android.os.SystemClock.elapsedRealtime();
                Z6();
                return;
            case 1:
            case 3:
                this.f262832r = new gu4.p(this, this);
                this.f262833s = "-1";
                if (this.f262831q == null) {
                    this.f262831q = new fu4.n();
                }
                boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_soter_adopt_to_android12_by_device, 0) == 1 || bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Pay_UseBiometricPrompt_Int, 0) == 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "use biometric prompt: %s", java.lang.Boolean.valueOf(z17));
                if (!z17) {
                    this.f262831q.a(this.f262832r);
                    return;
                }
                d50.n nVar = new d50.n();
                if (this.A == 1) {
                    nVar.f308050a = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ko8);
                    nVar.f308051b = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ko7);
                    nVar.f308052c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
                } else {
                    nVar.f308050a = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ko8);
                    nVar.f308052c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
                }
                this.f262831q.b(this.f262832r, nVar);
                return;
            case 2:
                zt5.s sVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance.f262904e;
                if (sVar == null) {
                    c7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.knu));
                    return;
                }
                java.lang.String str2 = sVar.f557162j;
                java.lang.String str3 = sVar.f557163k;
                if (this.f262830p != null) {
                    this.f262835u = db5.e1.Q(this, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575079ko0), false, false, null);
                    fu4.h hVar = this.f262830p;
                    gu4.e eVar = new gu4.e(this);
                    java.lang.String str4 = this.f262829o;
                    fu4.f fVar = (fu4.f) hVar;
                    fVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintLockOpenDelegate", "do open fingerprint lock");
                    fVar.f348423e = eVar;
                    gm0.j1.d().g(new fu4.j(str2, str3, str4));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void b7(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kny);
        }
        V6();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 G = db5.e1.G(this, str, "", true, new gu4.c(this));
        this.f262836v = G;
        G.setCanceledOnTouchOutside(false);
    }

    public final void c7(java.lang.String str) {
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        if (currentTimeMillis - this.f262834t > 1) {
            this.f262834t = currentTimeMillis;
            V6();
            android.widget.TextView textView = this.f262821d;
            if (textView != null) {
                textView.setText(str);
                this.f262821d.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
                this.f262821d.setVisibility(4);
                if (this.f262825h == null) {
                    this.f262825h = android.view.animation.AnimationUtils.loadAnimation(mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559325bl);
                }
                this.f262821d.startAnimation(this.f262825h);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new gu4.d(this), this.f262825h.getDuration());
            }
        }
    }

    public final void d7() {
        if (this.f262826i.equals("action.verify_pattern")) {
            this.f262821d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.knz);
            this.f262821d.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            this.f262824g.setVisibility(0);
        } else {
            this.f262821d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.knt);
            this.f262821d.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            this.f262824g.setVisibility(8);
        }
    }

    public final void e7() {
        W6();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "mAuthType: %d", java.lang.Integer.valueOf(this.A));
        if (this.A == 2) {
            i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f575084ko5);
            i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.koc);
            i0Var.f293354b.E = new gu4.l(this);
            i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
            i0Var.f293354b.F = new gu4.k(this);
        } else {
            i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f575083ko4);
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
            aVar.f293265v = string;
            aVar.E = new gu4.m(this);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
        this.f262836v = a17;
        a17.setCanceledOnTouchOutside(false);
        this.f262836v.show();
    }

    public final void f7(int i17) {
        android.content.Intent intent = new android.content.Intent();
        if (i17 == 1) {
            intent.putExtra("action", "action.touchlock_verify_by_paypwd");
        } else if (i17 == 2) {
            intent.putExtra("action", "action.touchlock_need_verify_paypwd");
            intent.putExtra("key_wallet_lock_input_new_fp_tips", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575082ko3));
        }
        intent.putExtra("key_wallet_lock_type", 2);
        j45.l.n(this, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, i17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        m73997x41012807();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.baj;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        this.f262821d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566530g65);
        this.f262822e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kr7);
        this.f262823f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566525g60);
        this.f262824g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566527g62);
        this.f262822e.setOnClickListener(new gu4.g(this));
        this.f262823f.setOnClickListener(new gu4.h(this));
        this.f262824g.setOnClickListener(new gu4.i(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerprintWalletLockUI", "data is null");
            return;
        }
        int intExtra = intent.getIntExtra("key_err_code", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "onActivityResult errCode: %d", java.lang.Integer.valueOf(intExtra));
        if (i17 == 1) {
            if (intExtra == 0) {
                Z6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockReportManager", "idkey report fingerprintlock verify by passwd success");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(713L, 2L, 1L, false);
                return;
            } else {
                if (intExtra == -1) {
                    this.f262840z = false;
                    b7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.koi));
                    return;
                }
                return;
            }
        }
        if (i17 == 2) {
            if (intExtra == 0) {
                fu4.a.a(this.f262833s);
                fu4.a.f348417a = android.os.SystemClock.elapsedRealtime();
                Z6();
                return;
            } else {
                if (intExtra == -1) {
                    this.f262840z = false;
                    b7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.koi));
                    return;
                }
                return;
            }
        }
        if (i17 == 3) {
            if (intExtra == 0) {
                Z6();
                return;
            } else {
                X6();
                Y6(-1, intExtra, "user cancel when set wallet lock");
                return;
            }
        }
        if (i17 == 4) {
            if (intExtra == 0) {
                Z6();
                return;
            } else if (intExtra == -1) {
                this.f262840z = false;
                b7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575080ko1));
                return;
            } else {
                X6();
                Y6(-1, intExtra, "user cancel when open gesture");
                return;
            }
        }
        if (i17 == 5) {
            if (intExtra == 0) {
                ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().j(0);
                hu4.i.f366763a = -1L;
                fu4.a.f348417a = -1L;
                dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.knl), 0).show();
                Z6();
                return;
            }
            if (intExtra == -1) {
                this.f262840z = false;
                b7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.knm));
            } else if (intExtra == 4) {
                X6();
                Y6(-1, intExtra, "user cancel when close wallet lock");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "onBackPressed");
        X6();
        Y6(0, 4, "user click back button");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "onCreate %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().o();
        }
        mo43517x10010bd5();
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent.getStringExtra("action");
        this.f262826i = stringExtra;
        this.f262828n = stringExtra;
        this.f262827m = intent.getStringExtra("next_action");
        this.f262829o = intent.getStringExtra("token");
        this.f262837w = intent.getStringExtra("key_pay_passwd");
        this.B = intent.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "mAction: %s, mNextAction: %s", this.f262826i, this.f262827m);
        if (!this.f262826i.equals("action.verify_pattern")) {
            if (this.f262826i.equals("action.switch_on_pattern")) {
                this.A = 1;
            }
        } else {
            this.A = 2;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.m.f262906a = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockReportManager", "wallet lock report create session: %d", java.lang.Long.valueOf(currentTimeMillis));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "FingerprintWalletLockUI onPause");
        V6();
        m73997x41012807();
        this.f262840z = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "needResume: %b", java.lang.Boolean.valueOf(this.f262840z));
        if (this.f262840z) {
            this.f262830p = new fu4.f();
            this.f262831q = new fu4.n();
            this.f262839y = false;
            ju5.n.c().b();
            this.f262835u = db5.e1.Q(this, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, false, null);
            d7();
            if (this.f262826i.equals("action.switch_on_pattern")) {
                this.f262838x = false;
            } else {
                this.f262838x = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "start prepare, time: %d, isOffline: %b", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Boolean.valueOf(this.f262838x));
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance;
            boolean z17 = re4.g0.c() && wt5.a.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (lVar.i() && !z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "user opend fingerprint lock but device not support soter, isSupportFingerprintLock: %b", java.lang.Boolean.valueOf(z17));
                if (hu4.j.g()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "user opened gesture, then switch to gesture");
                    ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().j(1);
                    lVar.l(true);
                    finish();
                    android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6.class);
                    intent.addFlags(131072);
                    intent.putExtra("action", "action.verify_pattern");
                    intent.putExtra("next_action", "next_action.goto_protected_page");
                    intent.putExtra("page_intent", (android.content.Intent) getIntent().getParcelableExtra("page_intent"));
                    intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETLOCK_IS_AUTO_JUMP_TO_GESTURE_WHEN_NOT_SUPPORT_FINGERPRINT_BOOLEAN_SYNC;
                    boolean o17 = c17.o(u3Var, false);
                    if (!o17) {
                        intent.putExtra("verify_title", getString(com.p314xaae8f345.mm.R.C30867xcad56011.kog));
                        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                        gm0.j1.u().c().i(true);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "start gesture protect ui, isShowed: %b", java.lang.Boolean.valueOf(o17));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI", "startGestureProtect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI", "startGestureProtect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12097, 8, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "show not support fingerprint dialog");
                    W6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                    aVar.f293262s = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.ko6);
                    aVar.f293265v = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.kod);
                    aVar.E = new gu4.o(this);
                    aVar.G = new gu4.n(this);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                    j0Var.e(aVar);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
                    if (d0Var != null) {
                        d0Var.a(j0Var.f293370r);
                    }
                    this.f262836v = j0Var;
                    j0Var.setCanceledOnTouchOutside(false);
                    this.f262836v.w(getString(com.p314xaae8f345.mm.R.C30867xcad56011.knj), false, new gu4.a(this));
                    this.f262836v.show();
                }
            } else if (wt5.a.p(this)) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("key_pay_passwd", this.f262837w);
                bundle.putBoolean("key_fp_lock_offline_mode", this.f262838x);
                ((fu4.f) this.f262830p).a(this, new gu4.j(this), bundle);
            } else {
                e7();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "onResume end: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }

    /* renamed from: release */
    public final void m73997x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "fingerprint lock ui release isCancelled: %b", java.lang.Boolean.valueOf(this.f262839y));
        if (this.f262839y) {
            return;
        }
        this.f262839y = true;
        fu4.n nVar = this.f262831q;
        if (nVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintAuthManager", "release fingerprint auth");
            d50.q qVar = nVar.f348439a;
            if (qVar != null) {
                ((ne4.n) qVar).a(true);
            }
        }
        fu4.h hVar = this.f262830p;
        if (hVar != null) {
            fu4.f fVar = (fu4.f) hVar;
            fVar.f348422d = null;
            fVar.f348423e = null;
            fVar.f348426h = true;
            gm0.j1.d().q(1967, fVar);
            gm0.j1.d().q(1548, fVar);
        }
        ju5.n.c().b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(hu4.b.class);
    }
}

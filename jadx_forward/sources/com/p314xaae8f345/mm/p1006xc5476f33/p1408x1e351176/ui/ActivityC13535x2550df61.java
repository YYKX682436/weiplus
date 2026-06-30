package com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI */
/* loaded from: classes11.dex */
public class ActivityC13535x2550df61 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f181727v = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f181729e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f181730f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f181731g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f181732h;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f181737p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f181738q;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f181728d = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f181733i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f181734m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f181735n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f181736o = "";

    /* renamed from: r, reason: collision with root package name */
    public boolean f181739r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f181740s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f181741t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f181742u = false;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 activityC13535x2550df61) {
        android.app.Dialog dialog;
        if (activityC13535x2550df61.isDestroyed() || activityC13535x2550df61.isFinishing() || (dialog = activityC13535x2550df61.f181728d) == null || !dialog.isShowing()) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new l72.w(activityC13535x2550df61));
    }

    public final void U6() {
        vz2.c.h(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.k0.a(90024));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("err_msg", "cancel");
        intent.putExtra("err_code", com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.k0.a(90024));
        setResult(0, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        if (wz2.a.f()) {
            return -1;
        }
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a_z;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "[onActivityResult] %s, isRestoreCreate :%s", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f181741t));
        if (intent != null && intent.getExtras() != null) {
            int i19 = intent.getExtras().getInt("err_code");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "[onActivityResult] errCode :%s , errMsg: %s", java.lang.Integer.valueOf(i19), intent.getExtras().getString("err_msg"));
        }
        setResult(i18, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "onBackPressed()");
        android.content.Intent intent = new android.content.Intent();
        vz2.c.h(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.k0.a(90024));
        intent.putExtra("err_code", com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.k0.a(90024));
        intent.putExtra("err_msg", "cancel");
        setResult(0, intent);
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (wz2.a.f()) {
            setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575933m2);
        }
        super.onCreate(bundle);
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ri(this, 11, 6);
        if (bundle != null) {
            boolean z17 = bundle.getBoolean("hasRestoredState", false);
            this.f181741t = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "[onCreate] get restore key: %s", java.lang.Boolean.valueOf(z17));
        }
        this.f181742u = wz2.a.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "[onCreate] %s , isRestoreCreate: %s, isOpenFaceRestoreSwitch: %s", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f181741t), java.lang.Boolean.valueOf(this.f181742u));
        if (this.f181741t && this.f181742u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceAgreementUI", "[onCreate] isRestoreCreate, return");
            return;
        }
        if (wz2.a.f()) {
            overridePendingTransition(0, 0);
            int intExtra = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            java.lang.String stringExtra = getIntent().getStringExtra("package");
            java.lang.String stringExtra2 = getIntent().getStringExtra("packageSign");
            java.lang.String stringExtra3 = getIntent().getStringExtra("otherVerifyTitleFront");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, intExtra);
            intent.putExtra("package", stringExtra);
            intent.putExtra("package_sign", stringExtra2);
            intent.putExtra("other_verify_title_front", stringExtra3);
            ((h45.q) i95.n0.c(h45.q.class)).mo24801xcb599eae("faceCheckFrontUseCase", intent, new h45.i() { // from class: l72.r$$a
                @Override // h45.i
                /* renamed from: onKindaBusinessCallback */
                public final void mo24858x44dbb8f3(android.content.Intent intent2) {
                    char c17;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 activityC13535x2550df61 = com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61.this;
                    activityC13535x2550df61.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "onKindaBackResult");
                    if (intent2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "resultData == null");
                        activityC13535x2550df61.U6();
                        return;
                    }
                    int intExtra2 = intent2.getIntExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.k0.a(90024));
                    java.lang.String stringExtra4 = intent2.getStringExtra("error_msg");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "errorMsg：%s errorCode：%s", stringExtra4, java.lang.Integer.valueOf(intExtra2));
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra4)) {
                        activityC13535x2550df61.U6();
                        return;
                    }
                    int hashCode = stringExtra4.hashCode();
                    if (hashCode == -1367724422) {
                        if (stringExtra4.equals("cancel")) {
                            c17 = 2;
                        }
                        c17 = 65535;
                    } else if (hashCode != 3548) {
                        if (hashCode == 3135262 && stringExtra4.equals("fail")) {
                            c17 = 1;
                        }
                        c17 = 65535;
                    } else {
                        if (stringExtra4.equals("ok")) {
                            c17 = 0;
                        }
                        c17 = 65535;
                    }
                    if (c17 == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "go to face recognize");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 65L, 1L, false);
                        android.content.Intent intent3 = new android.content.Intent(activityC13535x2550df61, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1699xe125c5cf.ActivityC15538x252a13b6.class);
                        android.os.Bundle extras = activityC13535x2550df61.getIntent().getExtras();
                        if (extras != null) {
                            intent3.putExtras(extras);
                        }
                        intent3.putExtra("needContract", intent2.getIntExtra("need_show_protocal", 0) != 1);
                        activityC13535x2550df61.startActivityForResult(intent3, 1);
                        return;
                    }
                    if (c17 != 1) {
                        activityC13535x2550df61.U6();
                        return;
                    }
                    android.content.Intent intent4 = new android.content.Intent();
                    intent4.putExtra("err_msg", "fail");
                    if (intExtra2 == 90114) {
                        intent4.putExtra("err_code", 90114);
                        intent4.putExtra("click_other_verify_btn_front", "yes");
                        vz2.c.h(90114);
                    } else {
                        intent4.putExtra("err_code", 90110);
                        vz2.c.h(90110);
                    }
                    activityC13535x2550df61.setResult(1, intent4);
                    activityC13535x2550df61.finish();
                }
            });
            return;
        }
        this.f181729e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.dmo);
        this.f181730f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.dml);
        this.f181731g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dmm);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dmn)).getPaint(), 0.8f);
        this.f181729e.setEnabled(true);
        this.f181729e.setOnClickListener(new l72.s(this));
        this.f181737p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dmk);
        java.lang.String stringExtra4 = getIntent().getStringExtra("otherVerifyTitleFront");
        this.f181736o = stringExtra4;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra4)) {
            this.f181737p.setVisibility(8);
        } else {
            this.f181737p.setVisibility(0);
            this.f181737p.setClickable(true);
            android.widget.TextView textView = this.f181737p;
            le0.u uVar = (le0.u) i95.n0.c(le0.u.class);
            mo55332x76847179();
            ((ke0.e) uVar).getClass();
            textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0());
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.f181736o);
            spannableStringBuilder.setSpan(new l72.c0(this.f181736o, mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29), true, new l72.t(this)), 0, spannableStringBuilder.length(), 17);
            this.f181737p.setText(spannableStringBuilder);
            android.widget.TextView textView2 = this.f181737p;
            textView2.setOnTouchListener(new l72.y(this, spannableStringBuilder, textView2));
        }
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo2533x106ab264().o();
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dmf)).setOnClickListener(new l72.u(this));
        this.f181728d = db5.e1.Q(mo55332x76847179(), "", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), false, false, null);
        gm0.j1.d().a(1108, this);
        gm0.j1.d().g(new j72.d(getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0), getIntent().getStringExtra("package"), getIntent().getStringExtra("packageSign")));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "[onDestroy] %s", java.lang.Integer.valueOf(hashCode()));
        super.onDestroy();
        if (this.f181740s) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 63L, 1L, false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "[onRestoreInstanceState] %s", java.lang.Integer.valueOf(hashCode()));
        this.f181741t = true;
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "onResume()");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "[onSaveInstanceState] %s", java.lang.Integer.valueOf(hashCode()));
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "[onSaveInstanceState] set restore key");
            bundle.putBoolean("hasRestoredState", true);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "onSceneEnd()");
        gm0.j1.d().q(1108, this);
        vz2.c.c().f137738g = i18;
        ((ku5.t0) ku5.t0.f394148d).B(new l72.v(this, i17, i18, m1Var, str));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(rz2.a.class);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI */
/* loaded from: classes5.dex */
public class ActivityC11459xde004648 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public boolean f155081d = true;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 f155082e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 f155083f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 f155084g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f155085h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.CheckBox f155086i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f155087m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f155088n;

    /* renamed from: o, reason: collision with root package name */
    public int f155089o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f155090p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f155091q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f155092r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f155093s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f155094t;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648 activityC11459xde004648) {
        java.lang.String str = activityC11459xde004648.f155092r;
        int length = str != null ? str.length() : 0;
        if (length < 1 || length > 32 || !activityC11459xde004648.f155086i.isChecked()) {
            activityC11459xde004648.f155085h.setEnabled(false);
        } else {
            activityC11459xde004648.f155085h.setEnabled(true);
        }
    }

    public void U6(c71.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.hwv, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
            return;
        }
        if (ordinal == 1) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.hww, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
        } else if (ordinal == 2) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.k69, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
        } else {
            if (ordinal != 3) {
                return;
            }
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.k66, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cdn;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        if (this.f155081d) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kos);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepOneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepOneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f155085h = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a04 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04) findViewById(com.p314xaae8f345.mm.R.id.kbl);
            this.f155082e = c22618x59d05a04;
            ck5.f b17 = ck5.f.b(c22618x59d05a04);
            b17.f124094f = 1;
            b17.f124093e = 32;
            b17.f124089a = false;
            b17.d(null);
            this.f155085h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.je(this));
            this.f155082e.requestFocus();
            this.f155082e.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ke(this));
            findViewById(com.p314xaae8f345.mm.R.id.mnq).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.le(this));
            findViewById(com.p314xaae8f345.mm.R.id.lrs).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.me(this));
            android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.lrt);
            this.f155086i = checkBox;
            checkBox.setOnCheckedChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ne(this));
            if (this.f155089o == 0) {
                android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.o2m);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepOneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepOneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                this.f155086i.setChecked(true);
                this.f155085h.setEnabled(true);
            }
        } else {
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.kot);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepTwoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepTwoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f155083f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04) findViewById(com.p314xaae8f345.mm.R.id.kpr);
            this.f155084g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04) findViewById(com.p314xaae8f345.mm.R.id.c_s);
            android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.c8v);
            this.f155087m = button;
            button.setEnabled(true);
            this.f155087m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.oe(this));
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ie(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = this.f155091q;
        objArr[1] = wo.w0.k();
        objArr[2] = 0;
        objArr[3] = 1;
        objArr[4] = java.lang.Integer.valueOf(this.f155081d ? 1005 : 1006);
        objArr[5] = 0;
        objArr[6] = null;
        objArr[7] = java.lang.Integer.valueOf(this.f155089o);
        g0Var.d(23530, objArr);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 702 && i18 == -1) {
            setResult(-1, intent);
            finish();
            return;
        }
        if (((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Vi(this, i17, i18, intent) != null) {
            java.lang.String str = lp0.b.j() + "temp.avatar";
            kv.l0 l0Var = (kv.l0) i95.n0.c(kv.l0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qe qeVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qe(this, str);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.k0) l0Var).getClass();
            new com.p314xaae8f345.mm.p943x351df9c2.q0(str, qeVar).a();
            this.f155088n = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f155089o = getIntent().getIntExtra("RegScene", 0);
        this.f155090p = getIntent().getStringExtra("RegTicket");
        this.f155091q = getIntent().getStringExtra("sessionID");
        this.f155092r = getIntent().getStringExtra("NickName");
        this.f155093s = getIntent().getStringExtra("AvatarFileID");
        this.f155094t = getIntent().getStringExtra("AvatarAESKey");
        this.f155081d = getIntent().getBooleanExtra("STEP_ONE", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegAffiliateAccountUI", "regScene:%d", java.lang.Integer.valueOf(this.f155089o));
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        finish();
        return false;
    }
}

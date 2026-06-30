package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI */
/* loaded from: classes14.dex */
public class ActivityC11457x794a57af extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int B = 0;
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 f155057d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f155058e;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f155060g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f155061h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f155062i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Boolean f155063m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f155064n;

    /* renamed from: o, reason: collision with root package name */
    public int f155065o;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f155069s;

    /* renamed from: t, reason: collision with root package name */
    public int f155070t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ge f155071u;

    /* renamed from: v, reason: collision with root package name */
    public x51.f f155072v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f155073w;

    /* renamed from: x, reason: collision with root package name */
    public int f155074x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f155075y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f155076z;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f155059f = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f155066p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f155067q = "zh-TW";

    /* renamed from: r, reason: collision with root package name */
    public final int f155068r = -1;

    public final void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileVerifyUI", "chooseVoicePhoneLanguage() called");
        android.content.Intent intent = new android.content.Intent();
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = mo55332x76847179();
        cVar.d(intent);
        cVar.e(true);
        cVar.a("com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI");
        cVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11473x550c6956.class);
        cVar.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.xd(this));
    }

    public final void U6() {
        mo48674x36654fab();
        if (this.f155058e.getText().toString().trim().equals("")) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.ahp, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
        } else {
            this.f155071u.a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fe.GoNext);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean V6(int r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            tm.a r0 = tm.a.b(r10)
            r1 = 1
            if (r0 == 0) goto Lc
            r8 = 0
            r0.c(r7, r8, r8)
            return r1
        Lc:
            r0 = 4
            if (r8 != r0) goto L30
            r0 = -75
            if (r9 == r0) goto L2c
            r0 = -1
            if (r9 == r0) goto L17
            goto L30
        L17:
            com.tencent.mm.modelbase.r1 r8 = gm0.j1.d()
            int r8 = r8.n()
            r9 = 5
            if (r8 != r9) goto L2c
            r8 = 2131772347(0x7f1043bb, float:1.917605E38)
            r9 = 2131772346(0x7f1043ba, float:1.9176049E38)
            db5.e1.i(r7, r8, r9)
            return r1
        L2c:
            x51.i1.d(r7)
            return r1
        L30:
            r0 = -2023(0xfffffffffffff819, float:NaN)
            r2 = 0
            if (r9 == r0) goto L99
            r0 = -100
            if (r9 == r0) goto L99
            r0 = -43
            if (r9 == r0) goto L8d
            r0 = -41
            if (r9 == r0) goto L82
            r0 = -36
            if (r9 == r0) goto L77
            switch(r9) {
                case -34: goto L6c;
                case -33: goto L5d;
                case -32: goto L4b;
                default: goto L48;
            }
        L48:
            r0 = r2
            goto Ld5
        L4b:
            r0 = 2131757251(0x7f1008c3, float:1.9145432E38)
            java.lang.String r0 = r7.getString(r0)
            com.tencent.mm.plugin.account.ui.sd r3 = new com.tencent.mm.plugin.account.ui.sd
            r3.<init>(r7)
            java.lang.String r4 = ""
            db5.e1.t(r7, r0, r4, r3)
            goto L97
        L5d:
            com.tencent.mm.plugin.account.ui.td r0 = new com.tencent.mm.plugin.account.ui.td
            r0.<init>(r7)
            r3 = 2131757249(0x7f1008c1, float:1.9145428E38)
            r4 = 2131757256(0x7f1008c8, float:1.9145443E38)
            db5.e1.m(r7, r3, r4, r0)
            goto L97
        L6c:
            r0 = 2131757197(0x7f10088d, float:1.9145323E38)
            android.widget.Toast r0 = dp.a.m125853x26a183b(r7, r0, r2)
            r0.show()
            goto L97
        L77:
            r0 = 2131757199(0x7f10088f, float:1.9145327E38)
            android.widget.Toast r0 = dp.a.m125853x26a183b(r7, r0, r2)
            r0.show()
            goto L97
        L82:
            r0 = 2131757196(0x7f10088c, float:1.914532E38)
            android.widget.Toast r0 = dp.a.m125853x26a183b(r7, r0, r2)
            r0.show()
            goto L97
        L8d:
            r0 = 2131757194(0x7f10088a, float:1.9145317E38)
            android.widget.Toast r0 = dp.a.m125853x26a183b(r7, r0, r2)
            r0.show()
        L97:
            r0 = r1
            goto Ld5
        L99:
            gm0.m.o()
            androidx.appcompat.app.AppCompatActivity r0 = r7.mo55332x76847179()
            gm0.j1.b()
            java.lang.String r3 = gm0.m.f354768x
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto Lb7
            androidx.appcompat.app.AppCompatActivity r3 = r7.mo55332x76847179()
            r4 = 2131771106(0x7f103ee2, float:1.9173534E38)
            java.lang.String r3 = i65.a.r(r3, r4)
            goto Lbc
        Lb7:
            gm0.j1.b()
            java.lang.String r3 = gm0.m.f354768x
        Lbc:
            androidx.appcompat.app.AppCompatActivity r4 = r7.mo55332x76847179()
            r5 = 2131756315(0x7f10051b, float:1.9143534E38)
            java.lang.String r4 = r4.getString(r5)
            com.tencent.mm.plugin.account.ui.ud r5 = new com.tencent.mm.plugin.account.ui.ud
            r5.<init>(r7)
            com.tencent.mm.plugin.account.ui.vd r6 = new com.tencent.mm.plugin.account.ui.vd
            r6.<init>(r7)
            db5.e1.M(r0, r3, r4, r5, r6)
            goto L97
        Ld5:
            if (r0 == 0) goto Ld8
            return r1
        Ld8:
            x51.r1 r0 = new x51.r1
            r0.<init>(r8, r9, r10)
            x51.f r8 = r7.f155072v
            boolean r8 = r8.c(r7, r0)
            if (r8 == 0) goto Le6
            return r1
        Le6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af.V6(int, int, java.lang.String):boolean");
    }

    public void W6(boolean z17) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc.class);
        intent.putExtra("kintent_hint", getString(com.p314xaae8f345.mm.R.C30867xcad56011.itc));
        intent.putExtra("kintent_cancelable", z17);
        startActivityForResult(intent, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c2c;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 c21493x36e72905 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905) findViewById(com.p314xaae8f345.mm.R.id.f568500n16);
        this.f155057d = c21493x36e72905;
        c21493x36e72905.m78962xc17f97e2(3);
        this.f155057d.m78963x3d4bc56f(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.yd(this));
        this.f155058e = this.f155057d.m78955xd454f3ba();
        this.f155061h = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(this.f155061h);
        this.f155060g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.sx9);
        getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559561ad);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b c21490xb2dd0b6b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b) findViewById(com.p314xaae8f345.mm.R.id.jn9);
        android.widget.EditText m78930xd454f3ba = c21490xb2dd0b6b.m78930xd454f3ba();
        m78930xd454f3ba.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        m78930xd454f3ba.setEnabled(false);
        m78930xd454f3ba.setFocusable(false);
        c21490xb2dd0b6b.setFocusable(false);
        c21490xb2dd0b6b.m78938x765074af(this.f155061h);
        android.text.InputFilter[] inputFilterArr = {new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.zd(this)};
        if (!this.f155066p) {
            this.f155057d.a();
        }
        this.f155060g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ae(this));
        this.f155060g.setEnabled(false);
        this.f155058e.setFilters(inputFilterArr);
        android.widget.EditText editText = this.f155058e;
        editText.addTextChangedListener(new al5.p1(editText, null, 12));
        this.f155058e.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.be(this));
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f565902ta4);
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ce(this));
        button.setVisibility(u11.c.b(this.f155061h) && !this.f155066p ? 0 : 8);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.de(this));
        this.f155058e.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ee(this));
        this.f155058e.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.rd(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 30844) {
            this.f155071u.a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fe.GoPostCheck);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f155065o = getIntent().getIntExtra("key_reg_style", 1);
        this.f155070t = getIntent().getIntExtra("mobile_verify_purpose", 0);
        this.f155073w = getIntent().getStringExtra("MicroMsg.MobileVerifyUIIntent_sms_code");
        this.f155062i = getIntent().getStringExtra("kintent_password");
        this.f155064n = getIntent().getStringExtra("kintent_nickname");
        this.f155063m = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("kintent_hasavatar", false));
        getIntent().getBooleanExtra("from_deep_link", false);
        this.f155075y = getIntent().getStringExtra("regsession_id");
        this.f155076z = getIntent().getStringExtra("reg_3d_app_ticket");
        this.A = getIntent().getIntExtra("reg_3d_app_type", 0);
        int i17 = this.f155070t;
        if (i17 == 2) {
            this.f155071u = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qd();
            java.lang.String str = this.f155062i;
            if (str == null || str.length() < 8) {
                this.f155074x = 4;
            } else {
                this.f155074x = 1;
            }
        } else {
            if (i17 != 3 && i17 != 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MobileVerifyUI", "wrong purpose %s", java.lang.Integer.valueOf(i17));
                finish();
                return;
            }
            this.f155071u = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ad(i17);
        }
        getIntent().getIntExtra("mobileverify_countdownsec", 60);
        this.f155066p = getIntent().getBooleanExtra("mobileverify_useDialCode", false);
        this.f155061h = getIntent().getExtras().getString("bindmcontact_mobile");
        this.f155069s = n71.a.a();
        mo43517x10010bd5();
        this.f155071u.b(this);
        if (this.f155066p) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.wd wdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.wd(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(wdVar, 500L, false);
        } else {
            java.lang.String str2 = this.f155073w;
            if (str2 != null) {
                this.f155058e.setText(str2);
                U6();
            } else if (this.f155070t == 5) {
                this.f155071u.a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fe.DoSend);
            }
        }
        this.f155072v = new x51.f();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        x51.f fVar = this.f155072v;
        if (fVar != null) {
            fVar.a();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        n71.a.e(this.f155069s);
        if (this.f155071u.a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fe.GoBack)) {
            return true;
        }
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        java.lang.String stringExtra;
        super.onNewIntent(intent);
        if (intent == null || (stringExtra = intent.getStringExtra("nofification_type")) == null || !stringExtra.equals("no_reg_notification")) {
            return;
        }
        this.f155057d.a();
        this.f155071u.a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fe.DoSend);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f155071u.mo48686x360802();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f155071u.mo48685x68ac462();
    }
}

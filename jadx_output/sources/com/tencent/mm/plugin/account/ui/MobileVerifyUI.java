package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class MobileVerifyUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int B = 0;
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFormVerifyCodeInputView f73524d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f73525e;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f73527g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f73528h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f73529i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Boolean f73530m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f73531n;

    /* renamed from: o, reason: collision with root package name */
    public int f73532o;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f73536s;

    /* renamed from: t, reason: collision with root package name */
    public int f73537t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.ge f73538u;

    /* renamed from: v, reason: collision with root package name */
    public x51.f f73539v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f73540w;

    /* renamed from: x, reason: collision with root package name */
    public int f73541x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f73542y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f73543z;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f73526f = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f73533p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f73534q = "zh-TW";

    /* renamed from: r, reason: collision with root package name */
    public final int f73535r = -1;

    public final void T6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileVerifyUI", "chooseVoicePhoneLanguage() called");
        android.content.Intent intent = new android.content.Intent();
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = getContext();
        cVar.d(intent);
        cVar.e(true);
        cVar.a("com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI");
        cVar.b(com.tencent.mm.plugin.account.ui.VoiceCodeHalfScreenDialogFragment.class);
        cVar.i(new com.tencent.mm.plugin.account.ui.xd(this));
    }

    public final void U6() {
        hideVKB();
        if (this.f73525e.getText().toString().trim().equals("")) {
            db5.e1.i(this, com.tencent.mm.R.string.ahp, com.tencent.mm.R.string.f490573yv);
        } else {
            this.f73538u.a(com.tencent.mm.plugin.account.ui.fe.GoNext);
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
            android.widget.Toast r0 = dp.a.makeText(r7, r0, r2)
            r0.show()
            goto L97
        L77:
            r0 = 2131757199(0x7f10088f, float:1.9145327E38)
            android.widget.Toast r0 = dp.a.makeText(r7, r0, r2)
            r0.show()
            goto L97
        L82:
            r0 = 2131757196(0x7f10088c, float:1.914532E38)
            android.widget.Toast r0 = dp.a.makeText(r7, r0, r2)
            r0.show()
            goto L97
        L8d:
            r0 = 2131757194(0x7f10088a, float:1.9145317E38)
            android.widget.Toast r0 = dp.a.makeText(r7, r0, r2)
            r0.show()
        L97:
            r0 = r1
            goto Ld5
        L99:
            gm0.m.o()
            androidx.appcompat.app.AppCompatActivity r0 = r7.getContext()
            gm0.j1.b()
            java.lang.String r3 = gm0.m.f273235x
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto Lb7
            androidx.appcompat.app.AppCompatActivity r3 = r7.getContext()
            r4 = 2131771106(0x7f103ee2, float:1.9173534E38)
            java.lang.String r3 = i65.a.r(r3, r4)
            goto Lbc
        Lb7:
            gm0.j1.b()
            java.lang.String r3 = gm0.m.f273235x
        Lbc:
            androidx.appcompat.app.AppCompatActivity r4 = r7.getContext()
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
            x51.f r8 = r7.f73539v
            boolean r8 = r8.c(r7, r0)
            if (r8 == 0) goto Le6
            return r1
        Le6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.account.ui.MobileVerifyUI.V6(int, int, java.lang.String):boolean");
    }

    public void W6(boolean z17) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
        intent.putExtra("kintent_hint", getString(com.tencent.mm.R.string.itc));
        intent.putExtra("kintent_cancelable", z17);
        startActivityForResult(intent, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c2c;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        com.tencent.mm.ui.base.MMFormVerifyCodeInputView mMFormVerifyCodeInputView = (com.tencent.mm.ui.base.MMFormVerifyCodeInputView) findViewById(com.tencent.mm.R.id.f486967n16);
        this.f73524d = mMFormVerifyCodeInputView;
        mMFormVerifyCodeInputView.setInputType(3);
        this.f73524d.setSendSmsBtnClickListener(new com.tencent.mm.plugin.account.ui.yd(this));
        this.f73525e = this.f73524d.getContentEditText();
        this.f73528h = com.tencent.mm.sdk.platformtools.c5.h(this.f73528h);
        this.f73527g = (android.widget.Button) findViewById(com.tencent.mm.R.id.sx9);
        getResources().getStringArray(com.tencent.mm.R.array.f478028ad);
        com.tencent.mm.ui.base.MMFormInputView mMFormInputView = (com.tencent.mm.ui.base.MMFormInputView) findViewById(com.tencent.mm.R.id.jn9);
        android.widget.EditText contentEditText = mMFormInputView.getContentEditText();
        contentEditText.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479232tk));
        contentEditText.setEnabled(false);
        contentEditText.setFocusable(false);
        mMFormInputView.setFocusable(false);
        mMFormInputView.setText(this.f73528h);
        android.text.InputFilter[] inputFilterArr = {new com.tencent.mm.plugin.account.ui.zd(this)};
        if (!this.f73533p) {
            this.f73524d.a();
        }
        this.f73527g.setOnClickListener(new com.tencent.mm.plugin.account.ui.ae(this));
        this.f73527g.setEnabled(false);
        this.f73525e.setFilters(inputFilterArr);
        android.widget.EditText editText = this.f73525e;
        editText.addTextChangedListener(new al5.p1(editText, null, 12));
        this.f73525e.addTextChangedListener(new com.tencent.mm.plugin.account.ui.be(this));
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.f484369ta4);
        button.setOnClickListener(new com.tencent.mm.plugin.account.ui.ce(this));
        button.setVisibility(u11.c.b(this.f73528h) && !this.f73533p ? 0 : 8);
        setBackBtn(new com.tencent.mm.plugin.account.ui.de(this));
        this.f73525e.setOnEditorActionListener(new com.tencent.mm.plugin.account.ui.ee(this));
        this.f73525e.setOnKeyListener(new com.tencent.mm.plugin.account.ui.rd(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 30844) {
            this.f73538u.a(com.tencent.mm.plugin.account.ui.fe.GoPostCheck);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f73532o = getIntent().getIntExtra("key_reg_style", 1);
        this.f73537t = getIntent().getIntExtra("mobile_verify_purpose", 0);
        this.f73540w = getIntent().getStringExtra("MicroMsg.MobileVerifyUIIntent_sms_code");
        this.f73529i = getIntent().getStringExtra("kintent_password");
        this.f73531n = getIntent().getStringExtra("kintent_nickname");
        this.f73530m = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("kintent_hasavatar", false));
        getIntent().getBooleanExtra("from_deep_link", false);
        this.f73542y = getIntent().getStringExtra("regsession_id");
        this.f73543z = getIntent().getStringExtra("reg_3d_app_ticket");
        this.A = getIntent().getIntExtra("reg_3d_app_type", 0);
        int i17 = this.f73537t;
        if (i17 == 2) {
            this.f73538u = new com.tencent.mm.plugin.account.ui.qd();
            java.lang.String str = this.f73529i;
            if (str == null || str.length() < 8) {
                this.f73541x = 4;
            } else {
                this.f73541x = 1;
            }
        } else {
            if (i17 != 3 && i17 != 5) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MobileVerifyUI", "wrong purpose %s", java.lang.Integer.valueOf(i17));
                finish();
                return;
            }
            this.f73538u = new com.tencent.mm.plugin.account.ui.ad(i17);
        }
        getIntent().getIntExtra("mobileverify_countdownsec", 60);
        this.f73533p = getIntent().getBooleanExtra("mobileverify_useDialCode", false);
        this.f73528h = getIntent().getExtras().getString("bindmcontact_mobile");
        this.f73536s = n71.a.a();
        initView();
        this.f73538u.b(this);
        if (this.f73533p) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.account.ui.wd wdVar = new com.tencent.mm.plugin.account.ui.wd(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(wdVar, 500L, false);
        } else {
            java.lang.String str2 = this.f73540w;
            if (str2 != null) {
                this.f73525e.setText(str2);
                U6();
            } else if (this.f73537t == 5) {
                this.f73538u.a(com.tencent.mm.plugin.account.ui.fe.DoSend);
            }
        }
        this.f73539v = new x51.f();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        x51.f fVar = this.f73539v;
        if (fVar != null) {
            fVar.a();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        n71.a.e(this.f73536s);
        if (this.f73538u.a(com.tencent.mm.plugin.account.ui.fe.GoBack)) {
            return true;
        }
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        java.lang.String stringExtra;
        super.onNewIntent(intent);
        if (intent == null || (stringExtra = intent.getStringExtra("nofification_type")) == null || !stringExtra.equals("no_reg_notification")) {
            return;
        }
        this.f73524d.a();
        this.f73538u.a(com.tencent.mm.plugin.account.ui.fe.DoSend);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f73538u.stop();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f73538u.start();
    }
}

package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class SimpleLoginUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmWizardActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f73660v = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFormInputView f73661e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFormInputView f73662f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMClearEditText f73663g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMClearEditText f73664h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.MMBottomButtonList f73665i;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f73669p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f73670q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.account.sdk.view.ProgressButton f73671r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f73672s;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.applet.SecurityImage f73666m = null;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.ui.w6 f73667n = new com.tencent.mm.plugin.account.ui.w6();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f73668o = "";

    /* renamed from: t, reason: collision with root package name */
    public final android.text.TextWatcher f73673t = new com.tencent.mm.plugin.account.ui.ni(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f73674u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LoginDisasterEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.account.ui.SimpleLoginUI.2
        {
            this.__eventId = -1399051904;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.LoginDisasterEvent loginDisasterEvent) {
            am.gj gjVar;
            com.tencent.mm.autogen.events.LoginDisasterEvent loginDisasterEvent2 = loginDisasterEvent;
            if (loginDisasterEvent2 == null || (gjVar = loginDisasterEvent2.f54483g) == null) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SimpleLoginUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f6768a, gjVar.f6769b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f6768a);
            intent.putExtra("key_disaster_url", gjVar.f6769b);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.account.ui.DisasterUI.class).addFlags(268435456);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/SimpleLoginUI$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    public final void Z6() {
        java.lang.String trim = this.f73663g.getText().toString().trim();
        com.tencent.mm.plugin.account.ui.w6 w6Var = this.f73667n;
        w6Var.f74286b = trim;
        w6Var.f74287c = this.f73664h.getText().toString();
        if (w6Var.f74286b.equals("")) {
            db5.e1.i(this, com.tencent.mm.R.string.k6d, com.tencent.mm.R.string.f492404gi1);
            return;
        }
        if (w6Var.f74287c.equals("")) {
            db5.e1.i(this, com.tencent.mm.R.string.k67, com.tencent.mm.R.string.f492404gi1);
            return;
        }
        hideVKB();
        ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.account.ui.k3.class)).U6();
        gm0.j1.d().g(new com.tencent.mm.modelsimple.v0(w6Var.f74286b, w6Var.f74287c, this.f73669p, 0));
        a7(true);
    }

    public final void a7(boolean z17) {
        com.tencent.mm.plugin.account.sdk.view.ProgressButton progressButton = this.f73671r;
        if (progressButton == null || progressButton.f73194x == z17) {
            return;
        }
        progressButton.A(z17);
        com.tencent.mm.ui.MMBottomButtonList mMBottomButtonList = this.f73665i;
        if (mMBottomButtonList != null) {
            mMBottomButtonList.setEnableClick(!z17);
        }
        if (!z17) {
            this.f73671r.B(com.tencent.mm.R.string.gi7);
            com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f73664h;
            if (mMClearEditText != null) {
                mMClearEditText.setEnabled(true);
            }
            com.tencent.mm.ui.base.MMClearEditText mMClearEditText2 = this.f73663g;
            if (mMClearEditText2 != null) {
                mMClearEditText2.setEnabled(true);
                return;
            }
            return;
        }
        this.f73671r.C(com.tencent.mm.R.string.p2r, false);
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText3 = this.f73664h;
        if (mMClearEditText3 != null) {
            mMClearEditText3.clearFocus();
            this.f73664h.setEnabled(false);
        }
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText4 = this.f73663g;
        if (mMClearEditText4 != null) {
            mMClearEditText4.clearFocus();
            this.f73663g.setEnabled(false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bst;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73661e = (com.tencent.mm.ui.base.MMFormInputView) findViewById(com.tencent.mm.R.id.iod);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ipf);
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        if (yp5.a.f464409a.a()) {
            this.f73661e.setHint(com.tencent.mm.R.string.f492402gh5);
            textView.setText(com.tencent.mm.R.string.gho);
        } else {
            this.f73661e.setHint(com.tencent.mm.R.string.gh6);
            textView.setText(com.tencent.mm.R.string.ghp);
        }
        this.f73662f = (com.tencent.mm.ui.base.MMFormInputView) findViewById(com.tencent.mm.R.id.ip_);
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = (com.tencent.mm.ui.base.MMClearEditText) this.f73661e.getContentEditText();
        this.f73663g = mMClearEditText;
        mMClearEditText.setFocusableInTouchMode(false);
        this.f73663g.setOnTouchListener(new com.tencent.mm.plugin.account.ui.pi(this));
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText2 = (com.tencent.mm.ui.base.MMClearEditText) this.f73662f.getContentEditText();
        this.f73664h = mMClearEditText2;
        mMClearEditText2.setFocusableInTouchMode(false);
        this.f73664h.setOnTouchListener(new com.tencent.mm.plugin.account.ui.qi(this));
        ck5.f b17 = ck5.f.b(this.f73664h);
        b17.f42561f = 0;
        b17.f42560e = 16;
        b17.d(null);
        com.tencent.mm.plugin.account.sdk.view.ProgressButton progressButton = (com.tencent.mm.plugin.account.sdk.view.ProgressButton) findViewById(com.tencent.mm.R.id.iol);
        this.f73671r = progressButton;
        progressButton.C(com.tencent.mm.R.string.gh7, true);
        this.f73671r.setEnabled(false);
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText3 = this.f73663g;
        android.text.TextWatcher textWatcher = this.f73673t;
        mMClearEditText3.addTextChangedListener(textWatcher);
        this.f73664h.addTextChangedListener(textWatcher);
        this.f73664h.setOnEditorActionListener(new com.tencent.mm.plugin.account.ui.ri(this));
        this.f73664h.setOnKeyListener(new com.tencent.mm.plugin.account.ui.si(this));
        this.f73663g.setOnFocusChangeListener(new com.tencent.mm.plugin.account.ui.ti(this));
        this.f73664h.setOnFocusChangeListener(new com.tencent.mm.plugin.account.ui.ui(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.iov);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/SimpleLoginUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/account/ui/SimpleLoginUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setMMTitle(com.tencent.mm.R.string.gik);
        setBackBtn(new com.tencent.mm.plugin.account.ui.ci(this));
        java.lang.String stringExtra = getIntent().getStringExtra("auth_ticket");
        this.f73669p = stringExtra;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mm.ui.base.MMClearEditText mMClearEditText4 = this.f73663g;
            java.lang.String c17 = com.tencent.mm.plugin.account.ui.w6.c();
            if (c17 == null) {
                c17 = "";
            }
            mMClearEditText4.setText(c17);
            com.tencent.mm.ui.base.MMClearEditText mMClearEditText5 = this.f73664h;
            java.lang.String d17 = com.tencent.mm.plugin.account.ui.w6.d();
            mMClearEditText5.setText(d17 != null ? d17 : "");
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.account.ui.di(this), 500L);
        }
        if (com.tencent.mm.sdk.platformtools.a0.f192447j) {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.tencent.mm.ui.vb.j(this, null);
        }
        this.f73671r.setOnClickListener(new com.tencent.mm.plugin.account.ui.ei(this));
        this.f73665i = k71.l.b(this, new com.tencent.mm.plugin.account.ui.fi(this), -1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i65.a.f(this, com.tencent.mm.R.dimen.f479727dj), 0, 0);
        layoutParams.gravity = 1;
        this.f73665i.setLayoutParams(layoutParams);
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.keyboard_change_input_panel)).addView(this.f73665i);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 1024 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            com.tencent.mm.sdk.platformtools.t8.K0(stringExtra);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                stringExtra.length();
            }
            if (intExtra == -217) {
                Z6();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (com.tencent.mm.sdk.platformtools.x2.l()) {
            com.tencent.mm.sdk.platformtools.x2.t();
            com.tencent.mm.xlog.app.XLogSetup.realSetupXlog();
        }
        setMMTitle(com.tencent.mm.R.string.f490495wp);
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.tencent.mm.ui.vb.e();
        initView();
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        hideVKB();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("key_auto_login_wizard_exit", false);
        if (!booleanExtra) {
            T6();
        }
        W6(1);
        if (booleanExtra) {
            U6(1);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f73669p = intent.getStringExtra("auth_ticket");
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f73669p = extras.getString("auth_ticket");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73669p)) {
            return;
        }
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f73663g;
        java.lang.String c17 = com.tencent.mm.plugin.account.ui.w6.c();
        if (c17 == null) {
            c17 = "";
        }
        mMClearEditText.setText(c17);
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText2 = this.f73664h;
        java.lang.String d17 = com.tencent.mm.plugin.account.ui.w6.d();
        mMClearEditText2.setText(d17 != null ? d17 : "");
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.account.ui.oi(this), 500L);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        a7(false);
        super.onPause();
        this.f73674u.dead();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f73674u.alive();
        super.onResume();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0232  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r23, int r24, java.lang.String r25, com.tencent.mm.modelbase.m1 r26) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.account.ui.SimpleLoginUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(vm3.d.class);
        hashSet.add(com.tencent.mm.plugin.account.ui.k3.class);
    }
}

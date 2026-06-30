package com.tencent.mm.plugin.account.ui;

@db5.a(129)
/* loaded from: classes14.dex */
public class LoginUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int K = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMClearEditText f73403d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMClearEditText f73404e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFormInputView f73405f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFormInputView f73406g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f73407h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f73408i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f73409m;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f73414r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.account.sdk.view.ProgressButton f73415s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f73416t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f73417u;

    /* renamed from: v, reason: collision with root package name */
    public x51.f f73418v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f73419w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f73420x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.MMBottomButtonList f73421y;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.applet.SecurityImage f73410n = null;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.ui.w6 f73411o = new com.tencent.mm.plugin.account.ui.w6();

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f73412p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f73413q = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Boolean f73422z = java.lang.Boolean.FALSE;
    public final java.util.Map A = new java.util.HashMap();
    public java.lang.String B = "";
    public java.lang.String C = "";
    public final android.text.TextWatcher D = new com.tencent.mm.plugin.account.ui.n7(this);
    public boolean E = false;
    public final com.tencent.mm.sdk.event.IListener F = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LoginDisasterEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.account.ui.LoginUI.2
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
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f6768a, gjVar.f6769b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f6768a);
            intent.putExtra("key_disaster_url", gjVar.f6769b);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.account.ui.DisasterUI.class).addFlags(268435456);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginUI$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/LoginUI$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };
    public final boolean[] G = {true};
    public java.lang.String H = "";
    public final x51.c1 I = new x51.c1();

    /* renamed from: J, reason: collision with root package name */
    public int f73402J = 0;

    public static void U6(com.tencent.mm.plugin.account.ui.LoginUI loginUI) {
        loginUI.getClass();
        gm0.j1.i().l("");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Intro_Switch", true).addFlags(67108864);
        loginUI.finish();
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.u(intent, loginUI);
    }

    public final void V6() {
        java.lang.String trim = this.f73403d.getText().toString().trim();
        com.tencent.mm.plugin.account.ui.w6 w6Var = this.f73411o;
        w6Var.f74286b = trim;
        w6Var.f74287c = this.f73404e.getText().toString();
        if (w6Var.f74286b.equals("")) {
            db5.e1.i(this, com.tencent.mm.R.string.k6d, com.tencent.mm.R.string.f492404gi1);
            return;
        }
        if (w6Var.f74287c.equals("")) {
            db5.e1.i(this, com.tencent.mm.R.string.k67, com.tencent.mm.R.string.f492404gi1);
            return;
        }
        hideVKB();
        java.lang.String str = w6Var.f74286b;
        if (str == null) {
            this.f73402J = 0;
        } else if (str.contains("@")) {
            this.f73402J = 4;
        } else if (w6Var.f74286b.trim().matches("^[1-9]\\d{4,}$")) {
            this.f73402J = 3;
        } else {
            this.f73402J = 2;
        }
        this.I.a(this, new com.tencent.mm.plugin.account.ui.p7(this));
    }

    public final void W6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
        int[] iArr = new int[5];
        iArr[0] = 2;
        intent.putExtra("mobile_input_purpose", 1);
        intent.putExtra("kv_report_login_method_data", iArr);
        intent.putExtra("from_switch_account", this.f73420x);
        intent.putExtra("login_sessionid", this.B);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginUI", "jumpToMobileInputUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginUI", "jumpToMobileInputUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public final void X6(boolean z17) {
        com.tencent.mm.plugin.account.sdk.view.ProgressButton progressButton = this.f73415s;
        if (progressButton == null || progressButton.f73194x == z17) {
            return;
        }
        progressButton.A(z17);
        com.tencent.mm.ui.MMBottomButtonList mMBottomButtonList = this.f73421y;
        if (mMBottomButtonList != null) {
            mMBottomButtonList.setEnableClick(!z17);
        }
        if (!z17) {
            this.f73415s.B(com.tencent.mm.R.string.gi7);
            ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.account.ui.k3.class)).P6();
            com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f73404e;
            if (mMClearEditText != null) {
                mMClearEditText.setEnabled(true);
            }
            com.tencent.mm.ui.base.MMClearEditText mMClearEditText2 = this.f73403d;
            if (mMClearEditText2 != null) {
                mMClearEditText2.setEnabled(true);
                return;
            }
            return;
        }
        this.f73415s.C(com.tencent.mm.R.string.p2r, false);
        ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.account.ui.k3.class)).O6();
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText3 = this.f73404e;
        if (mMClearEditText3 != null) {
            mMClearEditText3.clearFocus();
            this.f73404e.setEnabled(false);
        }
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText4 = this.f73403d;
        if (mMClearEditText4 != null) {
            mMClearEditText4.clearFocus();
            this.f73403d.setEnabled(false);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bst;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73405f = (com.tencent.mm.ui.base.MMFormInputView) findViewById(com.tencent.mm.R.id.iod);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ipf);
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        if (yp5.a.f464409a.a()) {
            this.f73405f.setHint(com.tencent.mm.R.string.f492402gh5);
            textView.setText(com.tencent.mm.R.string.gho);
        } else {
            this.f73405f.setHint(com.tencent.mm.R.string.gh6);
            textView.setText(com.tencent.mm.R.string.ghp);
        }
        this.f73406g = (com.tencent.mm.ui.base.MMFormInputView) findViewById(com.tencent.mm.R.id.ip_);
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) findViewById(com.tencent.mm.R.id.keyboard_change_input_panel);
        if (inputPanelLinearLayout != null) {
            inputPanelLinearLayout.e(new al5.e0() { // from class: com.tencent.mm.plugin.account.ui.LoginUI$$a
                @Override // al5.e0
                public final void J2(boolean z17, int i17) {
                    com.tencent.mm.plugin.account.ui.LoginUI loginUI = com.tencent.mm.plugin.account.ui.LoginUI.this;
                    if (z17) {
                        int i18 = com.tencent.mm.plugin.account.ui.LoginUI.K;
                        loginUI.getClass();
                    } else if (loginUI.f73422z.booleanValue()) {
                        loginUI.f73422z = java.lang.Boolean.FALSE;
                        loginUI.W6();
                    }
                }
            });
        }
        this.f73403d = (com.tencent.mm.ui.base.MMClearEditText) this.f73405f.getContentEditText();
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = (com.tencent.mm.ui.base.MMClearEditText) this.f73406g.getContentEditText();
        this.f73404e = mMClearEditText;
        ck5.f b17 = ck5.f.b(mMClearEditText);
        b17.f42561f = 0;
        b17.f42560e = 16;
        b17.d(null);
        this.f73403d.addTextChangedListener(new com.tencent.mm.plugin.account.ui.q7(this));
        this.f73403d.setOnFocusChangeListener(new com.tencent.mm.plugin.account.ui.r7(this));
        this.f73404e.setOnFocusChangeListener(new com.tencent.mm.plugin.account.ui.s7(this));
        com.tencent.mm.plugin.account.sdk.view.ProgressButton progressButton = (com.tencent.mm.plugin.account.sdk.view.ProgressButton) findViewById(com.tencent.mm.R.id.iol);
        this.f73415s = progressButton;
        progressButton.C(com.tencent.mm.R.string.gh7, true);
        this.f73415s.setEnabled(false);
        this.f73416t = (android.widget.Button) findViewById(com.tencent.mm.R.id.iov);
        this.f73417u = (android.widget.Button) findViewById(com.tencent.mm.R.id.iog);
        setMMTitle("");
        setBackBtn(new com.tencent.mm.plugin.account.ui.t7(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
        boolean[] zArr = {false};
        this.f73415s.setOnClickListener(new com.tencent.mm.plugin.account.ui.u7(this, zArr));
        this.f73415s.setOnTouchListener(new com.tencent.mm.plugin.account.ui.v7(this, zArr));
        com.tencent.mm.ui.dl.i(this.f73416t.getPaint());
        this.f73416t.setOnClickListener(new com.tencent.mm.plugin.account.ui.w7(this));
        java.lang.String stringExtra = getIntent().getStringExtra("auth_ticket");
        this.f73407h = stringExtra;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mm.ui.base.MMClearEditText mMClearEditText2 = this.f73403d;
            java.lang.String c17 = com.tencent.mm.plugin.account.ui.w6.c();
            if (c17 == null) {
                c17 = "";
            }
            mMClearEditText2.setText(c17);
            com.tencent.mm.ui.base.MMClearEditText mMClearEditText3 = this.f73404e;
            java.lang.String d17 = com.tencent.mm.plugin.account.ui.w6.d();
            mMClearEditText3.setText(d17 != null ? d17 : "");
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.account.ui.d7(this), 500L);
        }
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText4 = this.f73403d;
        android.text.TextWatcher textWatcher = this.D;
        mMClearEditText4.addTextChangedListener(textWatcher);
        this.f73404e.addTextChangedListener(textWatcher);
        this.f73404e.setOnEditorActionListener(new com.tencent.mm.plugin.account.ui.e7(this));
        this.f73404e.setOnKeyListener(new com.tencent.mm.plugin.account.ui.f7(this));
        if (com.tencent.mm.sdk.platformtools.a0.f192447j) {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.tencent.mm.ui.vb.j(this, null);
        }
        boolean c18 = com.tencent.mm.ui.b4.c(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginUI", "setupImeInsetsForEdgeToEdge isTargetSDKVersionOver35=%b", java.lang.Boolean.valueOf(c18));
        if (c18) {
            android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.keyboard_change_scroll_view);
            if (scrollView == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LoginUI", "setupImeInsetsForEdgeToEdge scrollView not found");
            } else {
                final int paddingBottom = scrollView.getPaddingBottom();
                com.tencent.mars.xlog.Log.i("MicroMsg.LoginUI", "setupImeInsetsForEdgeToEdge originalPaddingBottom=%d", java.lang.Integer.valueOf(paddingBottom));
                n3.k0 k0Var = new n3.k0() { // from class: com.tencent.mm.plugin.account.ui.LoginUI$$e
                    @Override // n3.k0
                    public final n3.g3 a(android.view.View view, n3.g3 g3Var) {
                        int i17 = com.tencent.mm.plugin.account.ui.LoginUI.K;
                        com.tencent.mm.plugin.account.ui.LoginUI loginUI = com.tencent.mm.plugin.account.ui.LoginUI.this;
                        loginUI.getClass();
                        int i18 = g3Var.a(8).f247047d;
                        int i19 = g3Var.a(2).f247047d;
                        int max = java.lang.Math.max(i18, i19);
                        boolean z17 = max > 300 && gh5.d.b(loginUI);
                        int max2 = java.lang.Math.max(max, 0);
                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
                        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
                        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(max2);
                        int i27 = paddingBottom;
                        com.tencent.mars.xlog.Log.i("MicroMsg.LoginUI", "setupImeInsetsForEdgeToEdge onApplyWindowInsets imeVisible=%b, imeHeight=%d, navBarHeight=%d, imeOffset=%d originalPaddingBottom=%d", valueOf, valueOf2, valueOf3, valueOf4, java.lang.Integer.valueOf(i27));
                        if (z17) {
                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i27 + max2);
                        } else {
                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i27);
                        }
                        return g3Var;
                    }
                };
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.a1.u(scrollView, k0Var);
            }
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("login_username");
        this.E = getIntent().getBooleanExtra("from_deep_link", false);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            this.f73403d.setText(stringExtra2);
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mm.ui.bk.A() || com.tencent.mm.ui.bk.Q()) {
            v61.g0 g0Var = v61.h0.f433441a;
            v61.h0.a(this.f73417u, this);
            if (com.tencent.mm.ui.bk.A() && !com.tencent.mm.ui.bk.Q()) {
                this.f73417u.setText(getResources().getString(com.tencent.mm.R.string.f492407gi4));
            } else if (com.tencent.mm.ui.bk.Q()) {
                this.f73417u.setText(getResources().getString(com.tencent.mm.R.string.fe_));
            } else {
                this.f73417u.setText(getResources().getString(com.tencent.mm.R.string.gh_));
            }
            this.f73417u.setOnClickListener(new com.tencent.mm.plugin.account.ui.g7(this));
        }
        this.f73421y = k71.l.b(this, new com.tencent.mm.plugin.account.ui.h7(this), 3);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i65.a.f(this, com.tencent.mm.R.dimen.f479727dj), 0, 0);
        layoutParams.gravity = 1;
        this.f73421y.setLayoutParams(layoutParams);
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.keyboard_change_input_panel)).addView(this.f73421y);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1) {
            if (i17 != 1024 || intent == null) {
                if (i17 != 32644 || intent == null || (bundleExtra = intent.getBundleExtra("result_data")) == null || !bundleExtra.getString("go_next", "").equals("auth_again")) {
                    return;
                }
                V6();
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            com.tencent.mm.sdk.platformtools.t8.K0(stringExtra);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                stringExtra.length();
            }
            if (intExtra == -217) {
                this.f73411o.f74287c = stringExtra;
                V6();
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        getWindow().getDecorView().setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.a08));
        if (o45.wf.f343033k) {
            str = getString(com.tencent.mm.R.string.f490495wp) + j65.v.b(this);
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            str = "";
        }
        this.f73413q = getIntent().getIntExtra("login_type", 0);
        setMMTitle(str);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a07));
        hideActionbarLine();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.jlt);
        if (findViewById != null) {
            com.tencent.mm.ui.a4.f(findViewById);
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.tencent.mm.ui.vb.e();
        this.f73414r = n71.a.a();
        initView();
        this.f73418v = new x51.f();
        this.f73420x = getIntent().getBooleanExtra("from_switch_account", false);
        this.f73419w = c01.b9.f37069c.a("login_weixin_username", "");
        int[] intArrayExtra = getIntent().getIntArrayExtra("kv_report_login_method_data");
        if (intArrayExtra != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14262, java.lang.Integer.valueOf(intArrayExtra[0]), java.lang.Integer.valueOf(intArrayExtra[1]), java.lang.Integer.valueOf(intArrayExtra[2]), java.lang.Integer.valueOf(intArrayExtra[3]), java.lang.Integer.valueOf(intArrayExtra[4]));
        }
        java.lang.String k17 = wo.w0.k();
        this.C = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        java.lang.String stringExtra = getIntent().getStringExtra("login_sessionid");
        this.B = stringExtra;
        if (stringExtra == null) {
            this.B = k17 + "_" + this.C;
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.A;
        hashMap.put("login_sessionid", this.B);
        hashMap.put("page_sessionid", this.C);
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, k17);
        hashMap.put("login_page_oa_type", 3);
        hashMap.put("login_page_sessionid", this.B);
        if (this.f73420x) {
            hashMap.put("login_page_type", 1);
        } else {
            hashMap.put("login_page_type", 3);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f73415s, "login_account");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.f73415s, new ly1.a() { // from class: com.tencent.mm.plugin.account.ui.LoginUI$$d
            @Override // ly1.a
            public final java.util.Map b(java.lang.String str3) {
                int i17 = com.tencent.mm.plugin.account.ui.LoginUI.K;
                com.tencent.mm.plugin.account.ui.LoginUI loginUI = com.tencent.mm.plugin.account.ui.LoginUI.this;
                loginUI.getClass();
                java.util.HashMap hashMap2 = new java.util.HashMap(loginUI.A);
                hashMap2.put("login_method", java.lang.Integer.valueOf(loginUI.f73402J));
                return hashMap2;
            }
        });
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f73415s, 8, 34575);
        v61.d.e(3);
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        ((th0.a0) ((sh0.e) i95.n0.c(sh0.e.class))).getClass();
        com.tencent.mm.xwebutil.u0.a(this, 6);
        ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.account.ui.k3.class)).V6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        x51.f fVar = this.f73418v;
        if (fVar != null) {
            fVar.a();
        }
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        fo3.s.INSTANCE.E7("ie_login_id");
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        hideVKB();
        n71.a.e(this.f73414r);
        com.tencent.mm.pluginsdk.model.app.y5.f189160h = null;
        com.tencent.mm.pluginsdk.model.app.y5.f189161i = -1L;
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        hideVKB();
        this.F.dead();
        int i17 = this.f73413q;
        if (i17 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",L100_100_logout,");
            gm0.j1.b();
            sb6.append(gm0.m.f("L100_100_logout"));
            sb6.append(",2");
            n71.a.c(10645, false, sb6.toString());
        } else if (i17 == 1) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb7.append(gm0.m.e());
            sb7.append(",");
            sb7.append(getClass().getName());
            sb7.append(",L400_100_login,");
            gm0.j1.b();
            sb7.append(gm0.m.f("L400_100_login"));
            sb7.append(",2");
            n71.a.c(10645, false, sb7.toString());
        }
        v61.d.f(3);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.I.c(this, i17, strArr, iArr);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.F.alive();
        super.onResume();
        int i17 = this.f73413q;
        if (i17 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",L100_100_logout,");
            gm0.j1.b();
            sb6.append(gm0.m.f("L100_100_logout"));
            sb6.append(",1");
            n71.a.c(10645, true, sb6.toString());
            n71.a.d("L100_100_logout");
        } else if (i17 == 1) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb7.append(gm0.m.e());
            sb7.append(",");
            sb7.append(getClass().getName());
            sb7.append(",L400_100_login,");
            gm0.j1.b();
            sb7.append(gm0.m.f("L400_100_login"));
            sb7.append(",1");
            n71.a.c(10645, true, sb7.toString());
            n71.a.d("L400_100_login");
        }
        v61.d.e(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        if (r19 != (-310)) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d2  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r18, int r19, java.lang.String r20, com.tencent.mm.modelbase.m1 r21) {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.account.ui.LoginUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(vm3.d.class);
        hashSet.add(com.tencent.mm.plugin.account.ui.k3.class);
    }
}

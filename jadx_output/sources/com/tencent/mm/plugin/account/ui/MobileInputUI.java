package com.tencent.mm.plugin.account.ui;

@db5.a(129)
/* loaded from: classes14.dex */
public class MobileInputUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {
    public static final /* synthetic */ int W = 0;
    public java.lang.String F;
    public int H;
    public com.tencent.mm.plugin.account.ui.ec I;

    /* renamed from: J, reason: collision with root package name */
    public d71.d f73478J;
    public d71.e K;
    public boolean M;
    public boolean N;
    public java.lang.String P;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f73479d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFormInputView f73480e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.EditText f73481f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFormInputView f73482g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFormVerifyCodeInputView f73483h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f73484i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f73485m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73486n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f73487o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.CheckBox f73488p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f73489q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f73490r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f73491s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f73492t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f73493u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.Button f73494v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.Button f73495w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.MMBottomButtonList f73496x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f73497y = true;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f73498z = null;
    public java.lang.String A = null;
    public java.lang.String B = null;
    public java.lang.String C = null;
    public java.lang.String D = null;
    public java.lang.String E = null;
    public int G = 0;
    public int[] L = new int[5];
    public java.lang.String Q = "";
    public java.lang.String R = "";
    public final java.util.Map S = new java.util.HashMap();
    public final java.lang.String T = "";
    public final com.tencent.mm.sdk.event.IListener U = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LoginDisasterEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.account.ui.MobileInputUI.1
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
            com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f6768a, gjVar.f6769b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f6768a);
            intent.putExtra("key_disaster_url", gjVar.f6769b);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.account.ui.DisasterUI.class).addFlags(268435456);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/MobileInputUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };
    public final x51.c1 V = new x51.c1();

    public boolean U6() {
        if (this.f73481f.getText() == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f73481f.getText().toString()) || !this.f73497y) {
            return false;
        }
        return (this.G == 2 && (this.f73479d.getText() == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f73479d.getText().toString()))) ? false : true;
    }

    public final void V6() {
        if (!this.M) {
            this.I.b(com.tencent.mm.plugin.account.ui.dc.GoBack);
            n71.a.e(this.F);
            hideVKB();
            finish();
            return;
        }
        hideVKB();
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(this);
        b17.addFlags(67108864);
        b17.putExtra("can_finish", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/MobileInputUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        db5.f.k(this);
    }

    public final boolean W6() {
        int i17 = this.H;
        return i17 == 7 || i17 == 6;
    }

    public final boolean X6() {
        return this.G == 2;
    }

    public final void Y6(java.lang.String countryISOCode) {
        this.D = countryISOCode;
        d71.e eVar = this.K;
        if (eVar != null) {
            kotlin.jvm.internal.o.g(countryISOCode, "countryISOCode");
            eVar.f226880f = countryISOCode;
            eVar.f226882h = "";
            eVar.f226881g = false;
            android.widget.EditText editText = this.f73481f;
            if (editText != null) {
                this.K.a(editText.getText());
            }
        }
    }

    public final void Z6() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.C) || com.tencent.mm.sdk.platformtools.t8.K0(this.D)) {
            this.f73485m.setText(getString(com.tencent.mm.R.string.gwa));
        } else {
            this.f73485m.setText(com.tencent.mm.sdk.platformtools.c5.b(this.C, this.D));
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14262, java.lang.Integer.valueOf(this.L[0]), java.lang.Integer.valueOf(this.L[1]), java.lang.Integer.valueOf(this.L[2]), java.lang.Integer.valueOf(this.L[3]), java.lang.Integer.valueOf(this.L[4]));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c1z;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str;
        com.tencent.mm.ui.base.MMFormInputView mMFormInputView = (com.tencent.mm.ui.base.MMFormInputView) findViewById(com.tencent.mm.R.id.mnt);
        this.f73482g = mMFormInputView;
        android.widget.EditText contentEditText = mMFormInputView.getContentEditText();
        this.f73479d = contentEditText;
        ck5.f b17 = ck5.f.b(contentEditText);
        b17.f42561f = 0;
        b17.f42560e = 16;
        b17.d(null);
        com.tencent.mm.ui.base.MMFormInputView mMFormInputView2 = (com.tencent.mm.ui.base.MMFormInputView) findViewById(com.tencent.mm.R.id.jn9);
        this.f73480e = mMFormInputView2;
        mMFormInputView2.setInputType(3);
        android.widget.EditText contentEditText2 = this.f73480e.getContentEditText();
        this.f73481f = contentEditText2;
        this.K = new d71.e(contentEditText2, this.f73478J, this.D);
        com.tencent.mm.ui.base.MMFormVerifyCodeInputView mMFormVerifyCodeInputView = (com.tencent.mm.ui.base.MMFormVerifyCodeInputView) findViewById(com.tencent.mm.R.id.f486967n16);
        this.f73483h = mMFormVerifyCodeInputView;
        mMFormVerifyCodeInputView.setInputType(3);
        this.f73484i = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cjz);
        this.f73485m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483955ck1);
        this.f73487o = findViewById(com.tencent.mm.R.id.lrm);
        this.f73488p = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.lrt);
        this.f73489q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lrs);
        this.f73490r = (android.widget.Button) findViewById(com.tencent.mm.R.id.iol);
        this.f73491s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482780ns);
        this.f73492t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ls_);
        this.f73493u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ipf);
        ((com.tencent.mm.ui.widget.InputPanelLinearLayout) findViewById(com.tencent.mm.R.id.keyboard_change_input_panel)).e(new al5.e0() { // from class: com.tencent.mm.plugin.account.ui.MobileInputUI$$a
            @Override // al5.e0
            public final void J2(boolean z17, int i17) {
                com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = com.tencent.mm.plugin.account.ui.MobileInputUI.this;
                if (!z17) {
                    mobileInputUI.I.b(com.tencent.mm.plugin.account.ui.dc.HideVkb);
                } else {
                    int i18 = com.tencent.mm.plugin.account.ui.MobileInputUI.W;
                    mobileInputUI.getClass();
                }
            }
        });
        this.f73494v = (android.widget.Button) findViewById(com.tencent.mm.R.id.iov);
        this.f73495w = (android.widget.Button) findViewById(com.tencent.mm.R.id.iog);
        this.f73484i.setVisibility(8);
        this.f73482g.setVisibility(8);
        this.f73483h.setVisibility(8);
        this.f73480e.setVisibility(8);
        this.f73492t.setVisibility(8);
        this.f73493u.setVisibility(8);
        this.f73490r.setVisibility(8);
        android.view.View view = this.f73487o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/MobileInputUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f73494v.setVisibility(8);
        com.tencent.mm.ui.dl.i(this.f73494v.getPaint());
        boolean[] zArr = {true};
        this.f73481f.setOnFocusChangeListener(new com.tencent.mm.plugin.account.ui.xb(this, zArr));
        this.f73481f.addTextChangedListener(new com.tencent.mm.plugin.account.ui.yb(this, zArr));
        this.f73479d.addTextChangedListener(new com.tencent.mm.plugin.account.ui.zb(this));
        this.f73481f.setOnEditorActionListener(new com.tencent.mm.plugin.account.ui.ac(this));
        this.f73481f.setOnKeyListener(new com.tencent.mm.plugin.account.ui.bc(this));
        boolean[] zArr2 = {false};
        this.f73490r.setEnabled(false);
        this.f73490r.setOnTouchListener(new com.tencent.mm.plugin.account.ui.cc(this, zArr2));
        this.f73490r.setOnClickListener(new com.tencent.mm.plugin.account.ui.qb(this, zArr2));
        com.tencent.mm.sdk.platformtools.x9.b();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.D)) {
            this.C = getString(com.tencent.mm.R.string.blk);
            Y6(com.tencent.mm.sdk.platformtools.c5.g(getString(com.tencent.mm.R.string.blj)));
        } else {
            this.C = u11.b.c(this.D);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.C) || com.tencent.mm.sdk.platformtools.t8.K0(this.D)) {
            java.lang.String simCountryIso = ((android.telephony.TelephonyManager) getSystemService("phone")).getSimCountryIso();
            this.E = simCountryIso;
            if (com.tencent.mm.sdk.platformtools.t8.K0(simCountryIso)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MobileInputUI", "getDefaultCountryInfo error");
            } else {
                u11.a a17 = u11.b.a(this.E);
                if (a17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MobileInputUI", "getDefaultCountryInfo error");
                } else {
                    Y6(com.tencent.mm.sdk.platformtools.c5.g(a17.f423728b));
                    this.C = a17.f423729c;
                }
            }
        }
        Z6();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.B)) {
            this.f73481f.setText(this.B);
        }
        this.f73484i.setOnClickListener(new com.tencent.mm.plugin.account.ui.rb(this));
        boolean c17 = com.tencent.mm.ui.b4.c(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputUI", "setupImeInsetsForEdgeToEdge isTargetSDKVersionOver35=%b", java.lang.Boolean.valueOf(c17));
        if (c17) {
            android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.keyboard_change_scroll_view);
            final android.view.View findViewById = findViewById(com.tencent.mm.R.id.t8r);
            if (scrollView == null || findViewById == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MobileInputUI", "setupImeInsetsForEdgeToEdge scrollView not found");
            } else {
                final int paddingBottom = scrollView.getPaddingBottom();
                com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputUI", "setupImeInsetsForEdgeToEdge originalPaddingBottom=%d", java.lang.Integer.valueOf(paddingBottom));
                n3.k0 k0Var = new n3.k0() { // from class: com.tencent.mm.plugin.account.ui.MobileInputUI$$b
                    @Override // n3.k0
                    public final n3.g3 a(android.view.View view2, n3.g3 g3Var) {
                        android.view.View view3 = findViewById;
                        int i17 = com.tencent.mm.plugin.account.ui.MobileInputUI.W;
                        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = com.tencent.mm.plugin.account.ui.MobileInputUI.this;
                        mobileInputUI.getClass();
                        int i18 = g3Var.a(8).f247047d;
                        int i19 = g3Var.a(2).f247047d;
                        int max = java.lang.Math.max(i18, i19);
                        boolean z17 = max > 300 && gh5.d.b(mobileInputUI);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputUI", "setupImeInsetsForEdgeToEdge onApplyWindowInsets imeVisible=%b, imeHeight=%d, navBarHeight=%d, imeOffset=%d originalPaddingBottom=%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(java.lang.Math.max(max, 0)), java.lang.Integer.valueOf(paddingBottom));
                        if (z17) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "lambda$setupImeInsetsForEdgeToEdge$1", "(ILandroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(view3, "com/tencent/mm/plugin/account/ui/MobileInputUI", "lambda$setupImeInsetsForEdgeToEdge$1", "(ILandroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                            arrayList3.add(0);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "lambda$setupImeInsetsForEdgeToEdge$1", "(ILandroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(view3, "com/tencent/mm/plugin/account/ui/MobileInputUI", "lambda$setupImeInsetsForEdgeToEdge$1", "(ILandroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        return g3Var;
                    }
                };
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.a1.u(scrollView, k0Var);
            }
        }
        if (o45.wf.f343033k) {
            str = getString(com.tencent.mm.R.string.f490495wp) + j65.v.b(this);
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            str = "";
        }
        setMMTitle(str);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a07));
        hideActionbarLine();
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            addIconOptionMenu(0, getString(com.tencent.mm.R.string.f490540xz), com.tencent.mm.R.raw.icons_outlined_setting, new com.tencent.mm.plugin.account.ui.sb(this));
        }
        this.f73496x = k71.l.b(this, new com.tencent.mm.plugin.account.ui.tb(this), 2);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i65.a.f(this, com.tencent.mm.R.dimen.f479727dj), 0, 0);
        layoutParams.gravity = 1;
        this.f73496x.setLayoutParams(layoutParams);
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.keyboard_change_input_panel)).addView(this.f73496x);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        super.onActivityResult(i17, i18, intent);
        java.util.Objects.toString(intent);
        com.tencent.mm.plugin.account.ui.dc dcVar = com.tencent.mm.plugin.account.ui.dc.GoNext;
        if (i17 == 32047) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("agree_privacy")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(712L, 1L, 1L, false);
                com.tencent.mm.plugin.account.ui.ec ecVar = this.I;
                if (ecVar instanceof com.tencent.mm.plugin.account.ui.ra) {
                    ((com.tencent.mm.plugin.account.ui.ra) ecVar).f74165i = 1;
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(712L, 2L, 1L, false);
            com.tencent.mm.plugin.account.ui.ec ecVar2 = this.I;
            if (ecVar2 instanceof com.tencent.mm.plugin.account.ui.ra) {
                ((com.tencent.mm.plugin.account.ui.ra) ecVar2).f74165i = 0;
            }
            ecVar2.b(dcVar);
            return;
        }
        if (i17 == 32046) {
            android.os.Bundle bundleExtra2 = intent != null ? intent.getBundleExtra("result_data") : null;
            if (i18 == -1 && bundleExtra2 != null && bundleExtra2.getString("go_next", "").equals("get_reg_verify_code")) {
                com.tencent.mm.plugin.account.ui.ec ecVar3 = this.I;
                if (ecVar3 instanceof com.tencent.mm.plugin.account.ui.ra) {
                    ((com.tencent.mm.plugin.account.ui.ra) ecVar3).f74165i = 2;
                }
                ecVar3.b(dcVar);
                return;
            }
            return;
        }
        if (i17 == 32045) {
            android.os.Bundle bundleExtra3 = intent != null ? intent.getBundleExtra("result_data") : null;
            java.util.Map map = bundleExtra3 != null ? (java.util.Map) bundleExtra3.getSerializable("next_params") : null;
            if (map != null && (str = (java.lang.String) map.get("next_step")) != null && str.equals("continue_with_password")) {
                this.P = (java.lang.String) map.get("spam_ctx");
                this.I.b(com.tencent.mm.plugin.account.ui.dc.GoToVerifyPwd);
                return;
            } else {
                if (i18 == -1 && bundleExtra3 != null && bundleExtra3.getString("go_next", "").equals("auth_again")) {
                    com.tencent.mm.plugin.account.ui.ec ecVar4 = this.I;
                    if (ecVar4 instanceof com.tencent.mm.plugin.account.ui.sa) {
                        ecVar4.b(dcVar);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (i17 == 32044) {
            android.os.Bundle bundleExtra4 = intent != null ? intent.getBundleExtra("result_data") : null;
            if (i18 == -1 && bundleExtra4 != null && bundleExtra4.getString("go_next", "").equals("auth_again")) {
                com.tencent.mm.plugin.account.ui.ec ecVar5 = this.I;
                if (ecVar5 instanceof com.tencent.mm.plugin.account.ui.sa) {
                    ((com.tencent.mm.plugin.account.ui.sa) ecVar5).c(com.tencent.mm.sdk.platformtools.c5.h(this.f73498z + this.A));
                    return;
                }
                return;
            }
            return;
        }
        if (i18 == -1) {
            if (i17 != 1024 || intent == null) {
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                stringExtra.getClass();
            }
            if (intExtra == -217) {
                hideVKB();
                this.V.a(this, new com.tencent.mm.plugin.account.ui.ub(this));
                return;
            }
            return;
        }
        if (i18 != 100) {
            return;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("country_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.C = stringExtra2;
        java.lang.String stringExtra3 = intent.getStringExtra("couttry_code");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        Y6(stringExtra3);
        java.lang.String stringExtra4 = intent.getStringExtra("iso_code");
        this.E = stringExtra4 != null ? stringExtra4 : "";
        if (this.G != 2 || u11.c.e(this.D)) {
            Z6();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.class);
        intent2.putExtra("couttry_code", this.D);
        intent2.putExtra("country_name", this.C);
        intent2.putExtra("iso_code", this.E);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/MobileInputUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.I.b(com.tencent.mm.plugin.account.ui.dc.GoBack);
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        super.setRequestedOrientation(1);
        getWindow().getDecorView().setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.a08));
        this.G = getIntent().getIntExtra("mobile_input_purpose", 0);
        this.H = getIntent().getIntExtra("mobile_auth_type", 0);
        this.M = getIntent().getBooleanExtra("can_finish", false);
        setBackBtn(new com.tencent.mm.plugin.account.ui.vb(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a07));
        hideActionbarLine();
        d71.d dVar = new d71.d();
        this.f73478J = dVar;
        dVar.c(getContext());
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.jlt);
        if (findViewById != null) {
            com.tencent.mm.ui.a4.f(findViewById);
        }
        int i17 = this.G;
        if (i17 == -1) {
            ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.account.ui.k3.class)).V6();
            this.I = new com.tencent.mm.plugin.account.ui.sa(this.f73478J);
        } else if (i17 == 1) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(getIntent().getStringExtra("auth_ticket"))) {
                int[] intArrayExtra = getIntent().getIntArrayExtra("kv_report_login_method_data");
                if (intArrayExtra != null) {
                    this.L = intArrayExtra;
                }
                this.I = new com.tencent.mm.plugin.account.ui.la();
            } else {
                this.I = new com.tencent.mm.plugin.account.ui.sa(this.f73478J);
            }
            ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.account.ui.k3.class)).V6();
        } else {
            if (i17 != 2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MobileInputUI", "wrong purpose %s", java.lang.Integer.valueOf(i17));
                finish();
                return;
            }
            this.I = new com.tencent.mm.plugin.account.ui.ra();
        }
        java.lang.String stringExtra = getIntent().getStringExtra("couttry_code");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        Y6(com.tencent.mm.sdk.platformtools.c5.g(stringExtra));
        java.lang.String stringExtra2 = getIntent().getStringExtra("country_name");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.C = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("iso_code");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.E = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("bindmcontact_shortmobile");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.B = stringExtra4;
        this.f73498z = com.tencent.mm.sdk.platformtools.c5.a(this.D);
        java.lang.String stringExtra5 = getIntent().getStringExtra("input_mobile_number");
        this.A = stringExtra5 != null ? stringExtra5 : "";
        this.F = n71.a.a();
        initView();
        if (getIntent().getBooleanExtra("from_deep_link", false) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f73498z) && !com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
            this.f73480e.setText(this.A);
        }
        this.I.a(this);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mm.ui.bk.A() || com.tencent.mm.ui.bk.Q()) {
            v61.g0 g0Var = v61.h0.f433441a;
            v61.h0.a(this.f73495w, this);
            if (com.tencent.mm.ui.bk.A() && !com.tencent.mm.ui.bk.Q()) {
                this.f73495w.setText(getResources().getString(com.tencent.mm.R.string.f492407gi4));
            } else if (com.tencent.mm.ui.bk.Q()) {
                this.f73495w.setText(getResources().getString(com.tencent.mm.R.string.fe_));
            } else {
                this.f73495w.setText(getResources().getString(com.tencent.mm.R.string.gh_));
            }
            this.f73495w.setOnClickListener(new com.tencent.mm.plugin.account.ui.wb(this));
        }
        this.N = getIntent().getBooleanExtra("from_switch_account", false);
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        ((th0.a0) ((sh0.e) i95.n0.c(sh0.e.class))).getClass();
        com.tencent.mm.xwebutil.u0.a(this, 6);
        v61.d.e(2);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        boolean X6 = X6();
        fo3.s sVar = fo3.s.INSTANCE;
        if (X6) {
            sVar.E7("ie_reg_eu");
        }
        if (W6()) {
            sVar.E7("ie_login");
        }
        com.tencent.mm.ui.base.MMFormVerifyCodeInputView mMFormVerifyCodeInputView = this.f73483h;
        if (mMFormVerifyCodeInputView != null) {
            mMFormVerifyCodeInputView.b();
        }
        ((java.util.LinkedHashMap) this.f73478J.f226877a).clear();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        V6();
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.U.dead();
        this.I.stop();
        hideVKB();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.V.c(this, i17, strArr, iArr);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.U.alive();
        super.onResume();
        this.I.start();
        v61.d.e(2);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity
    public void setRequestedOrientation(int i17) {
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(vm3.d.class);
        hashSet.add(com.tencent.mm.plugin.account.ui.k3.class);
    }
}

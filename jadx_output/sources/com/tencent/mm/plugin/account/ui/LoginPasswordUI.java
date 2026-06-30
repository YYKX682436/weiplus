package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class LoginPasswordUI extends com.tencent.mm.plugin.account.ui.LoginHistoryUI {
    public static final /* synthetic */ int G1 = 0;
    public androidx.activity.result.c D1;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f73365l1 = "";

    /* renamed from: p1, reason: collision with root package name */
    public boolean f73366p1 = false;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f73367x1 = false;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f73368y1 = false;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f73369z1 = false;
    public boolean A1 = false;
    public int B1 = -1;
    public final x51.c1 C1 = new x51.c1();
    public boolean E1 = true;
    public java.lang.String F1 = "";

    @Override // com.tencent.mm.plugin.account.ui.LoginHistoryUI
    public void X6() {
        super.X6();
        int i17 = this.T;
        if (i17 == 1) {
            this.f73329h.setVisibility(8);
            this.f73328g.setVisibility(8);
            return;
        }
        if (i17 == 2 || i17 == 3 || i17 == 6) {
            this.f73328g.setVisibility(8);
            W6(this.f73329h);
        } else if (i17 == 7) {
            this.f73329h.setVisibility(8);
            W6(this.f73328g);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "unknown login type: " + this.T);
        }
    }

    @Override // com.tencent.mm.plugin.account.ui.LoginHistoryUI
    public void Z6() {
        super.Z6();
        if (isFinishing() || getWindow() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LoginPasswordUI", "LoginHistoryUI is finishing");
            return;
        }
        java.lang.String obj = this.f73326e.getText().toString();
        com.tencent.mm.plugin.account.ui.w6 w6Var = this.f73340u;
        w6Var.f74287c = obj;
        if (w6Var.f74286b.equals("")) {
            db5.e1.m(this, com.tencent.mm.R.string.ghz, com.tencent.mm.R.string.f492404gi1, new com.tencent.mm.plugin.account.ui.r6(this));
            return;
        }
        int i17 = this.T;
        if (i17 == 2) {
            g7(true);
            wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
            kotlinx.coroutines.y0 lifecycleScope = getLifecycleAsyncScope();
            androidx.appcompat.app.AppCompatActivity context = getContext();
            com.tencent.mm.plugin.account.ui.t6 t6Var = new com.tencent.mm.plugin.account.ui.t6(this);
            vd0.v1 v1Var = (vd0.v1) j1Var;
            v1Var.getClass();
            kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
            kotlin.jvm.internal.o.g(context, "context");
            je0.i iVar = (je0.i) i95.n0.c(je0.i.class);
            vd0.s1 s1Var = new vd0.s1(t6Var, v1Var, context, lifecycleScope);
            ((ie0.m) iVar).getClass();
            se4.h.a(true, true, s1Var);
            return;
        }
        if (i17 == 6) {
            V6();
            g7(true);
            js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
            com.tencent.mm.plugin.account.ui.LoginPasswordUI$$d loginPasswordUI$$d = new com.tencent.mm.plugin.account.ui.LoginPasswordUI$$d(this);
            ((is.f) r0Var).getClass();
            u61.o.c(this, r45.gn4.kMobileType_Mask, "BeforeLogin", new is.b(loginPasswordUI$$d));
            return;
        }
        if (!(i17 == 3)) {
            if (!(i17 == 1) && w6Var.f74287c.equals("")) {
                db5.e1.i(this, com.tencent.mm.R.string.k67, com.tencent.mm.R.string.f492404gi1);
                return;
            }
            hideVKB();
            ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.account.ui.k3.class)).U6();
            this.C1.a(this, new com.tencent.mm.plugin.account.ui.s6(this));
            return;
        }
        g7(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "handleFastSwitchLogin begin ");
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4);
        if (sharedPreferences == null) {
            g7(false);
            java.lang.String string = getString(com.tencent.mm.R.string.g0z);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            o7(string, bool, bool);
            return;
        }
        java.lang.String string2 = sharedPreferences.getString("_auth_key", "");
        java.lang.String username = this.E;
        byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h(string2);
        sharedPreferences.getString("server_id", "");
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        q61.k kVar = new q61.k() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$a
            @Override // q61.k
            public final void a(final boolean z17, final r45.nf5 nf5Var) {
                int i18 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
                final com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = com.tencent.mm.plugin.account.ui.LoginPasswordUI.this;
                loginPasswordUI.getClass();
                final java.lang.ref.WeakReference weakReference2 = weakReference;
                loginPasswordUI.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$k
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i19 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
                        com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI2 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.this;
                        loginPasswordUI2.getClass();
                        com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI3 = (com.tencent.mm.plugin.account.ui.LoginPasswordUI) weakReference2.get();
                        if (loginPasswordUI3 == null || loginPasswordUI3.isFinishing()) {
                            return;
                        }
                        loginPasswordUI3.g7(false);
                        android.app.ProgressDialog progressDialog = loginPasswordUI2.f73338s;
                        if (progressDialog != null && progressDialog.isShowing()) {
                            loginPasswordUI2.f73338s.dismiss();
                            loginPasswordUI2.f73338s = null;
                        }
                        boolean z18 = z17;
                        r45.nf5 nf5Var2 = nf5Var;
                        if (z18 && nf5Var2 != null) {
                            java.lang.String str = nf5Var2.f381352d;
                            r45.cu5 cu5Var = nf5Var2.f381353e;
                            if (str != null && !str.isEmpty() && cu5Var != null && cu5Var.f371841f != null && cu5Var.f371839d > 0) {
                                q61.j.i(str);
                                com.tencent.mars.xlog.Log.i("ReportPushLoginURLMainDevice", "reportLoginAssistTipsAgreePageIn");
                                java.util.HashMap d17 = q61.j.d();
                                d17.put("page_id", "50367");
                                d17.put("page_name", "LoginAssistTipsAgree");
                                d17.put("login_ticket_id", q61.j.f360268h);
                                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("page_in", d17, 34575);
                                q61.j.f(q61.j.f360268h, 2);
                                com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "handleFastSwitchLogin scuccess ");
                                android.content.Intent intent = new android.content.Intent(loginPasswordUI2, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginFastSwitchUI.class);
                                intent.putExtra("UUID", str);
                                intent.putExtra("NotifyKey", x51.j1.d(cu5Var));
                                loginPasswordUI2.F1 = str;
                                loginPasswordUI3.E1 = false;
                                loginPasswordUI3.D1.a(intent, null);
                                return;
                            }
                        }
                        q61.j.e("", 2, 3, 0, 4);
                        java.lang.String str2 = nf5Var2 != null ? nf5Var2.f381362q : "";
                        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                        loginPasswordUI3.o7(str2, bool2, bool2);
                    }
                });
            }
        };
        kotlin.jvm.internal.o.g(username, "username");
        kotlinx.coroutines.l.d(v65.m.f433580a, kotlinx.coroutines.q1.f310568a, null, new q61.i(username, h17, kVar, null), 2, null);
    }

    @Override // com.tencent.mm.plugin.account.ui.LoginHistoryUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        tm.a b17;
        super.initView();
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("key_errType", 0);
            int intExtra2 = getIntent().getIntExtra("key_errCode", 0);
            java.lang.String stringExtra = getIntent().getStringExtra("key_errMsg");
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "initView,errType %d,errCode %d", java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intExtra2));
            if (!com.tencent.mm.plugin.account.ui.d.b(intExtra, intExtra2) || (b17 = tm.a.b(stringExtra)) == null) {
                return;
            }
            b17.d(this, new com.tencent.mm.plugin.account.ui.q6(this));
        }
    }

    public final void m7(final int i17) {
        wd0.d1[] d1VarArr = wd0.d1.f444702d;
        if (i17 == 9) {
            return;
        }
        new android.os.Handler(getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$f
            @Override // java.lang.Runnable
            public final void run() {
                int i18;
                int i19 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
                com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = com.tencent.mm.plugin.account.ui.LoginPasswordUI.this;
                android.app.ProgressDialog progressDialog = loginPasswordUI.f73338s;
                if (progressDialog != null && progressDialog.isShowing()) {
                    loginPasswordUI.f73338s.dismiss();
                    loginPasswordUI.f73338s = null;
                }
                loginPasswordUI.g7(false);
                wd0.d1[] d1VarArr2 = wd0.d1.f444702d;
                int i27 = i17;
                if (i27 == 7) {
                    wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
                    java.lang.String username = loginPasswordUI.E;
                    vd0.v1 v1Var = (vd0.v1) j1Var;
                    v1Var.getClass();
                    kotlin.jvm.internal.o.g(username, "username");
                    com.tencent.mm.sdk.platformtools.o4.M("Fingerprint_" + username + "_Retry_Count").A("login_fingerprint_retry_count", (10 - v1Var.Di(username)) + 1);
                    androidx.appcompat.app.AppCompatActivity context = loginPasswordUI.getContext();
                    int i28 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                    i18 = com.tencent.mm.R.string.p2m;
                    e4Var.d(com.tencent.mm.R.string.p2m);
                    e4Var.c();
                    if (((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Di(loginPasswordUI.E) != 0) {
                        return;
                    }
                } else if (i27 == 5) {
                    i18 = com.tencent.mm.R.string.p2j;
                } else {
                    if (i27 == 6) {
                        androidx.appcompat.app.AppCompatActivity context2 = loginPasswordUI.getContext();
                        int i29 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                        e4Var2.d(com.tencent.mm.R.string.p2n);
                        e4Var2.c();
                        return;
                    }
                    i18 = com.tencent.mm.R.string.p2k;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "[fingerprint login] handleFingerprintFail errCode is %d", java.lang.Integer.valueOf(i27));
                androidx.appcompat.app.AppCompatActivity context3 = loginPasswordUI.getContext();
                int i37 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(context3);
                e4Var3.d(i18);
                e4Var3.c();
                ((is.f) ((js.r0) i95.n0.c(js.r0.class))).hj(loginPasswordUI.E, false);
                loginPasswordUI.f73368y1 = true;
                loginPasswordUI.q7();
            }
        });
    }

    public final void n7() {
        new android.os.Handler(getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$h
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
                com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = com.tencent.mm.plugin.account.ui.LoginPasswordUI.this;
                android.app.ProgressDialog progressDialog = loginPasswordUI.f73338s;
                if (progressDialog != null && progressDialog.isShowing()) {
                    loginPasswordUI.f73338s.dismiss();
                    loginPasswordUI.f73338s = null;
                }
                loginPasswordUI.g7(false);
                androidx.appcompat.app.AppCompatActivity context = loginPasswordUI.getContext();
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.d(com.tencent.mm.R.string.p2p);
                e4Var.c();
                ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Ai(loginPasswordUI.E);
                loginPasswordUI.f73367x1 = true;
                loginPasswordUI.q7();
            }
        });
    }

    public void o7(java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        q61.j.f360262b = false;
        q61.j.f360266f = false;
        if (bool2.booleanValue()) {
            if (str == null || str.isEmpty()) {
                androidx.appcompat.app.AppCompatActivity context = getContext();
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = getString(com.tencent.mm.R.string.g0z);
                e4Var.c();
            } else {
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                e4Var2.f211776c = str;
                e4Var2.c();
            }
        }
        if (bool.booleanValue()) {
            this.T = 0;
            q7();
        }
    }

    @Override // com.tencent.mm.plugin.account.ui.LoginHistoryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        q61.j.h();
        int intExtra = getIntent().getIntExtra("login_type", -1);
        if (intExtra == 0) {
            q7();
        } else {
            r7(intExtra);
        }
        js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
        java.lang.String username = this.E;
        is.f fVar = (is.f) r0Var;
        fVar.getClass();
        kotlin.jvm.internal.o.g(username, "username");
        long Di = fVar.Di(username);
        ls.k[] kVarArr = ls.k.f320780d;
        if ((Di & 4) != 0) {
            ((is.f) ((js.r0) i95.n0.c(js.r0.class))).wi(this, this.A, this.E, new com.tencent.mm.plugin.account.ui.m6(this));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "gateway expt disable");
        }
        if (this.T != 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "TAGcheckLoginURLMainDevice begin ");
            final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
            q61.j.f360261a.b(this, new q61.k() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$i
                @Override // q61.k
                public final void a(final boolean z17, r45.nf5 nf5Var) {
                    int i17 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
                    final com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = com.tencent.mm.plugin.account.ui.LoginPasswordUI.this;
                    loginPasswordUI.getClass();
                    final java.lang.ref.WeakReference weakReference2 = weakReference;
                    loginPasswordUI.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI2 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.this;
                            java.lang.ref.WeakReference weakReference3 = weakReference2;
                            boolean z18 = z17;
                            int i18 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
                            loginPasswordUI2.getClass();
                            com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI3 = (com.tencent.mm.plugin.account.ui.LoginPasswordUI) weakReference3.get();
                            if (!z18 || loginPasswordUI3 == null || loginPasswordUI3.isFinishing()) {
                                return;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "isEnableChange：%b isNotTimeOut:%b", java.lang.Boolean.valueOf(loginPasswordUI2.d7()), java.lang.Boolean.valueOf(q61.j.f360266f));
                            if (loginPasswordUI2.d7() && q61.j.f360266f) {
                                if ((loginPasswordUI2.getIntent().getIntExtra("login_type", 0) == 0) && loginPasswordUI2.T > 3) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "setLoginType(ConstantsUI.LoginHistoryUI.LOGIN_BY_FAST_SWITCH)");
                                    loginPasswordUI2.r7(3);
                                    return;
                                }
                            }
                            loginPasswordUI2.X6();
                            com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "PushLoginURLTAG3MainDeviceCGI scuccess but can not change");
                        }
                    });
                }
            });
        }
        this.D1 = registerForActivityResult(new h.f(), new androidx.activity.result.b() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$l
            @Override // androidx.activity.result.b
            public final void a(java.lang.Object obj) {
                java.lang.String str;
                final androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                final com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = com.tencent.mm.plugin.account.ui.LoginPasswordUI.this;
                if (loginPasswordUI.E1 || (str = loginPasswordUI.F1) == null || str.isEmpty()) {
                    return;
                }
                loginPasswordUI.E1 = true;
                loginPasswordUI.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Intent intent;
                        int i17 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
                        com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI2 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.this;
                        loginPasswordUI2.getClass();
                        androidx.activity.result.ActivityResult activityResult2 = activityResult;
                        if (activityResult2.f9042d != -1 || (intent = activityResult2.f9043e) == null) {
                            return;
                        }
                        boolean booleanExtra = intent.getBooleanExtra(ya.b.SUCCESS, false);
                        boolean booleanExtra2 = intent.getBooleanExtra("block", false);
                        boolean booleanExtra3 = intent.getBooleanExtra("show_toast", false);
                        java.lang.String stringExtra = intent.getStringExtra("err_msg");
                        if (java.util.Objects.equals(intent.getStringExtra("UUID"), loginPasswordUI2.F1)) {
                            loginPasswordUI2.F1 = "";
                            if (!booleanExtra) {
                                loginPasswordUI2.o7(stringExtra, java.lang.Boolean.valueOf(booleanExtra2), java.lang.Boolean.valueOf(booleanExtra3));
                                return;
                            }
                            loginPasswordUI2.V6();
                            java.lang.String stringExtra2 = intent.getStringExtra(dm.i4.COL_USERNAME);
                            java.lang.String stringExtra3 = intent.getStringExtra("pwd");
                            loginPasswordUI2.g7(true);
                            gm0.j1.d().g(new com.tencent.mm.modelsimple.v0(stringExtra2, stringExtra3, 0, "", "", "", 0, "", false, true));
                        }
                    }
                });
            }
        });
        this.f73327f.setVisibility(0);
        boolean[] zArr = {false};
        this.f73327f.setOnTouchListener(new com.tencent.mm.plugin.account.ui.n6(this, zArr));
        this.f73327f.setOnClickListener(new com.tencent.mm.plugin.account.ui.o6(this, zArr));
        java.lang.String stringExtra = getIntent().getStringExtra("auth_ticket");
        this.f73342w = stringExtra;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            android.widget.TextView textView = this.f73325d;
            java.lang.String c17 = com.tencent.mm.plugin.account.ui.w6.c();
            if (c17 == null) {
                c17 = "";
            }
            textView.setText(c17);
            android.widget.EditText editText = this.f73326e;
            java.lang.String d17 = com.tencent.mm.plugin.account.ui.w6.d();
            editText.setText(d17 != null ? d17 : "");
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.account.ui.p6(this), 500L);
        } else if (getIntent().getIntExtra("LoginAction", -1) == 3 && this.T == 3 && intExtra != 0) {
            q61.j.g(1, 1);
            this.f73327f.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$g
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.account.ui.LoginPasswordUI.this.Z6();
                }
            });
        }
        this.Y = true;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.C1.c(this, i17, strArr, iArr);
    }

    @Override // com.tencent.mm.plugin.account.ui.LoginHistoryUI, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "onSceneEnd,errType %d,errCode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        int i19 = this.T;
        if ((i19 == 1) && i17 != 0) {
            android.app.ProgressDialog progressDialog = this.f73338s;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f73338s.dismiss();
                this.f73338s = null;
            }
            g7(false);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.p2s);
            e4Var.c();
            ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Ai(this.E);
            this.f73366p1 = true;
            q7();
            return;
        }
        if ((i19 == 6) && i17 != 0) {
            n7();
            return;
        }
        if ((i19 == 2) && i17 != 0) {
            m7(i18);
            return;
        }
        if ((i19 == 7) && (str2 = this.C) != null && (str3 = this.f73343x) != null && str2.equalsIgnoreCase(str3)) {
            if (i17 == 0) {
                jx3.f.INSTANCE.u(2122L, 0L);
            } else {
                jx3.f.INSTANCE.u(2122L, 1L);
            }
        }
        super.onSceneEnd(i17, i18, str, m1Var);
    }

    public final void p7() {
        this.f73327f.C(com.tencent.mm.R.string.gi7, true);
        this.L.setVisibility(0);
        this.f73326e.setTypeface(android.graphics.Typeface.DEFAULT);
        this.f73326e.setTransformationMethod(new android.text.method.PasswordTransformationMethod());
        this.f73326e.setOnEditorActionListener(new com.tencent.mm.plugin.account.ui.j6(this));
        this.f73326e.setOnKeyListener(new com.tencent.mm.plugin.account.ui.k6(this));
        this.f73326e.addTextChangedListener(new com.tencent.mm.plugin.account.ui.l6(this));
        if (this.f73326e.getText().toString().length() > 0) {
            this.f73327f.setEnabled(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q7() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.account.ui.LoginPasswordUI.q7():void");
    }

    public final void r7(int i17) {
        java.lang.String str;
        android.widget.Button button;
        this.B1 = this.T;
        this.T = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "initLoginView : " + this.T);
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "initLoginView lastLoginType: " + this.B1);
        int i18 = this.T;
        if (i18 != 1) {
            if (i18 == 2) {
                this.L.setVisibility(8);
                this.f73327f.C(com.tencent.mm.R.string.p2l, true);
                this.f73328g.setVisibility(8);
                this.f73329h.setVisibility(0);
            } else if (i18 == 3) {
                this.L.setVisibility(8);
                this.f73327f.C(com.tencent.mm.R.string.pah, true);
                this.f73328g.setVisibility(8);
                this.f73329h.setVisibility(0);
                ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.account.ui.k3.class)).T6();
                if (getIntent().getBooleanExtra("K_NO_NOT_REPORT_ONCE", false)) {
                    getIntent().putExtra("K_NO_NOT_REPORT_ONCE", false);
                } else {
                    q61.j.g(0, 0);
                }
            } else if (i18 == 4) {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginVoiceUI.class);
                intent.putExtra("switch_login_wx_id", this.A);
                intent.putExtra("LastLoginType", this.B1);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginPasswordUI", "jumpToVoiceUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginPasswordUI", "jumpToVoiceUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
            } else if (i18 == 6) {
                this.L.setVisibility(8);
                this.f73327f.C(com.tencent.mm.R.string.p2q, true);
                this.f73328g.setVisibility(8);
                this.f73329h.setVisibility(0);
                v61.d.i(this.f73329h, "other_verify_login", 1);
                str = "current_number_login";
            } else if (i18 != 7) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LoginPasswordUI", "unknown login type: " + this.T);
                this.T = 7;
                p7();
            } else {
                p7();
            }
            str = "";
        } else {
            this.L.setVisibility(8);
            this.f73327f.C(com.tencent.mm.R.string.p2t, true);
            this.f73328g.setVisibility(8);
            this.f73340u.f74288d = c01.uc.f37514c.c(this.E, "last_logout_no_pwd_ticket_for_one_click");
            ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.account.ui.k3.class)).T6();
            str = "one_clk_login";
        }
        v61.d.i(this.f73327f, str, 1);
        X6();
        if (this.f73327f == null || (button = this.f73329h) == null || button.getVisibility() != 0) {
            return;
        }
        this.f73327f.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$e
            @Override // java.lang.Runnable
            public final void run() {
                int i19 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
                com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = com.tencent.mm.plugin.account.ui.LoginPasswordUI.this;
                loginPasswordUI.f73329h.setWidth(loginPasswordUI.f73327f.getWidth());
            }
        });
    }
}

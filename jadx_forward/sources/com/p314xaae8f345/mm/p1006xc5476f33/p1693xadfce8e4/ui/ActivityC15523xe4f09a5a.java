package com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI */
/* loaded from: classes9.dex */
public class ActivityC15523xe4f09a5a extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements pz2.b {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f218527s = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Dialog f218530f;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.Animation f218533i;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f218528d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 f218529e = null;

    /* renamed from: g, reason: collision with root package name */
    public pz2.d f218531g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f218532h = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f218534m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f218535n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f218536o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f218537p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f218538q = "verifyFail";

    /* renamed from: r, reason: collision with root package name */
    public final pz2.c f218539r = new qz2.k(this);

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a activityC15523xe4f09a5a) {
        activityC15523xe4f09a5a.getClass();
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        if (currentTimeMillis - activityC15523xe4f09a5a.f218534m > 1) {
            activityC15523xe4f09a5a.f218534m = currentTimeMillis;
            ((android.widget.TextView) activityC15523xe4f09a5a.f218528d.findViewById(com.p314xaae8f345.mm.R.id.o_w)).setVisibility(8);
            android.widget.TextView textView = (android.widget.TextView) activityC15523xe4f09a5a.f218528d.findViewById(com.p314xaae8f345.mm.R.id.dho);
            textView.setVisibility(4);
            if (activityC15523xe4f09a5a.f218533i == null) {
                activityC15523xe4f09a5a.f218533i = android.view.animation.AnimationUtils.loadAnimation(activityC15523xe4f09a5a.mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559324bk);
            }
            textView.startAnimation(activityC15523xe4f09a5a.f218533i);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new qz2.m(activityC15523xe4f09a5a, textView), activityC15523xe4f09a5a.f218533i.getDuration());
        }
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a activityC15523xe4f09a5a, boolean z17) {
        re4.n.i(2, activityC15523xe4f09a5a.f218535n);
        if (z17) {
            re4.n.g(10, -1000223, -1, "user permanent cancelled");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: user cancelled and checked as not show anymore");
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_IN_TRANSPARENT_NEW_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: user cancelled but will show again");
            re4.n.g(1, -1000223, -1, "user cancelled");
        }
        activityC15523xe4f09a5a.finish();
    }

    public static void W6(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a activityC15523xe4f09a5a) {
        activityC15523xe4f09a5a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "showIdentifyUI!");
        android.view.View inflate = android.view.LayoutInflater.from(activityC15523xe4f09a5a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bae, (android.view.ViewGroup) null);
        activityC15523xe4f09a5a.f218528d = inflate;
        android.view.ViewParent parent = inflate.getParent();
        android.view.ViewGroup viewGroup = parent != null ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ((android.widget.ImageView) activityC15523xe4f09a5a.f218528d.findViewById(com.p314xaae8f345.mm.R.id.g5r)).setOnClickListener(new qz2.c(activityC15523xe4f09a5a));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = activityC15523xe4f09a5a.f218529e;
        if (k2Var != null && k2Var.isShowing()) {
            activityC15523xe4f09a5a.f218529e.dismiss();
            activityC15523xe4f09a5a.f218529e = null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(activityC15523xe4f09a5a, com.p314xaae8f345.mm.R.C30868x68b1db1.f576327wg);
        activityC15523xe4f09a5a.f218529e = k2Var2;
        k2Var2.setContentView(activityC15523xe4f09a5a.f218528d);
        activityC15523xe4f09a5a.f218529e.setCanceledOnTouchOutside(false);
        activityC15523xe4f09a5a.f218529e.setCancelable(true);
        activityC15523xe4f09a5a.f218529e.show();
        activityC15523xe4f09a5a.f218529e.setOnCancelListener(new qz2.d(activityC15523xe4f09a5a));
        db5.e1.a(activityC15523xe4f09a5a, activityC15523xe4f09a5a.f218529e);
    }

    public final void X6() {
        re4.n.i(3, this.f218535n);
        android.content.Intent intent = getIntent();
        this.f218531g.a(this, new qz2.s(this), intent != null ? intent.getStringExtra("key_pwd1") : "");
        a7(true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = this.f218529e;
        if (k2Var == null || !k2Var.isShowing()) {
            return;
        }
        this.f218529e.dismiss();
    }

    public final void Y6() {
        this.f218538q = "cgiFail";
        this.f218531g.b(this, "" + this.f218532h, 2);
    }

    public final void Z6() {
        this.f218531g.c(mo55332x76847179(), new qz2.l(this));
    }

    public void a7(boolean z17) {
        if (z17) {
            this.f218530f = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(this, false, null);
            return;
        }
        android.app.Dialog dialog = this.f218530f;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f218530f.dismiss();
        this.f218530f = null;
    }

    public final void b7(int i17, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = getString(i17);
        }
        db5.e1.E(this, str, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmf), false, new qz2.f(this));
    }

    public final void c7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: user cancelled");
        ((pz2.a) gm0.j1.s(pz2.a.class)).mo148659x428ac225();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        pz2.d dVar = this.f218531g;
        if (dVar != null) {
            dVar.mo148634x5a5b64d();
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        a7(false);
        if (i17 != 0) {
            if (i17 != -2) {
                b7(-1, str);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "open fingerprintpay failed");
            if (android.text.TextUtils.isEmpty(str)) {
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_k);
            }
            db5.e1.C(this, str, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_n), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new qz2.i(this), new qz2.j(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "open fingerprintpay success");
        m83099x5406100e(new ss4.e0(null, 19), false);
        if (!this.f218537p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "use old successpage");
            db5.e1.E(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_m), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_j), getString(com.p314xaae8f345.mm.R.C30867xcad56011.kuq), false, new qz2.e(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "useLiteApp successpage");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("event_name", "openFingerprintPaySuccess");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.k(com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3192xff8cc88a.WX_PAY_CASHIER_LITE_APP_ID, "pay.notifyAll", jSONObject);
            this.f218538q = "";
            finish();
        } catch (org.json.JSONException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "launch FingerPrintAuthTransparentUI");
        nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
        this.f218537p = ih.a.h("clicfg_android_pay_liteapp_success_page", false) || ((h45.q) i95.n0.c(h45.q.class)).mo24776x1e9bb12b();
        if (!oVar.Je()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "device is not support FingerPrintAuth or load fingerpringauth so failed, finish UI!");
            finish();
            return;
        }
        if (c01.z1.I()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "now account is isPayUPay, finish UI!");
            finish();
            return;
        }
        if (mz2.m0.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "getIsOpenFPFromLocal is true, finish UI!");
            finish();
            return;
        }
        if (!oVar.ja()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "isWxHasFingerPrint is false, finish UI!");
            finish();
            return;
        }
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        this.f218531g = oVar.r1();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINGER_PRINT_LAST_IS_SEVERE_ERROR_BOOLEAN_SYNC;
        this.f218536o = c17.o(u3Var, false);
        if (!fj6.w() || mz2.m0.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "isReg?:" + fj6.w() + ";isOpenTouch:" + mz2.m0.a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "finish FingerPrintAuthTransparentUI, not show the open guide!");
            finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "show fingerprint auth open guide!");
        ju5.n.c().b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12924, 1);
        re4.n.f476076a = 0;
        if (!getIntent().getBooleanExtra("key_show_guide", true)) {
            if (!getIntent().getBooleanExtra("isFromKinda", false)) {
                X6();
                return;
            }
            re4.n.i(3, this.f218535n);
            java.lang.String stringExtra = getIntent().getStringExtra("kindaPayPwd");
            if (stringExtra != null) {
                this.f218531g.a(this, new qz2.r(this), stringExtra);
                a7(true);
            }
            this.f39322x2305be9.G0(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINGER_PRINT_IS_FIRST_SHOWN_BOOLEAN_SYNC;
        if (c18.o(u3Var2, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: first show. no check box");
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            c19.x(u3Var2, bool);
            gm0.j1.u().c().x(u3Var, bool);
            db5.e1.C(this, getString(this.f218536o ? com.p314xaae8f345.mm.R.C30867xcad56011.ftl : com.p314xaae8f345.mm.R.C30867xcad56011.ftk), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.apd), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new qz2.n(this), new qz2.o(this));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_COUNT_INT_SYNC, 1);
            this.f218535n = 1;
            re4.n.i(1, 1);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: already shown before. show dialog with check box");
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bah, (android.view.ViewGroup) null);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566528g63);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c27 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_COUNT_INT_SYNC;
        this.f218535n = ((java.lang.Integer) c27.m(u3Var3, null)).intValue() + 1;
        gm0.j1.u().c().x(u3Var3, java.lang.Integer.valueOf(this.f218535n));
        re4.n.i(1, this.f218535n);
        db5.e1.I(this, false, null, inflate, getString(com.p314xaae8f345.mm.R.C30867xcad56011.apd), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new qz2.p(this), new qz2.q(this, checkBox));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = this.f218529e;
        if (k2Var != null && k2Var.isShowing()) {
            this.f218529e.dismiss();
            this.f218529e = null;
        }
        android.view.animation.Animation animation = this.f218533i;
        if (animation != null) {
            animation.cancel();
        }
        if (this.f218537p && !this.f218538q.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "useLiteApp successpage");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("event_name", "openFingerprintPayFail");
                jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, this.f218538q);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "JSONException %s", e17.toString());
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.k(com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3192xff8cc88a.WX_PAY_CASHIER_LITE_APP_ID, "pay.notifyAll", jSONObject);
        }
        a7(false);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "onPause");
        try {
            android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) mo55332x76847179().getSystemService("power")).newWakeLock(536870913, "PostLocationService");
            if (newWakeLock != null) {
                yj0.a.c(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthTransparentUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                newWakeLock.acquire();
                yj0.a.f(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthTransparentUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            }
            c7();
            if (newWakeLock != null) {
                yj0.a.c(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthTransparentUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                newWakeLock.release();
                yj0.a.f(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthTransparentUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FingerPrintAuthTransparentUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return this.f218531g.mo148635x76e0bfae(i17, i18, str, m1Var);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        finish();
    }
}

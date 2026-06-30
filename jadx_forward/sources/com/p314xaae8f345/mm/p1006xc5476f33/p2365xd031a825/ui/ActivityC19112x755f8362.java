package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

@db5.a(m123858x6ac9171 = 1)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI */
/* loaded from: classes9.dex */
public class ActivityC19112x755f8362 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {
    public static final /* synthetic */ int B = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 f261512d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f261513e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f261514f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f261515g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f261516h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f261517i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ScrollView f261518m;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f261521p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f261522q;

    /* renamed from: t, reason: collision with root package name */
    public int f261525t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f261526u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f261527v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f261528w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f261529x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.animation.Animation f261530y;

    /* renamed from: z, reason: collision with root package name */
    public int f261531z;

    /* renamed from: n, reason: collision with root package name */
    public boolean f261519n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f261520o = false;

    /* renamed from: r, reason: collision with root package name */
    public int f261523r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f261524s = 0;
    public java.lang.String A = "";

    public final void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "hy: send release FPManager");
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5900xd57eabf5().e();
    }

    public final void V6() {
        this.f261526u = true;
        re4.n.b();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 c5820xc13f26f8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8();
        java.lang.String str = this.f261527v;
        am.on onVar = c5820xc13f26f8.f136128g;
        onVar.f89096a = str;
        onVar.f89097b = 1;
        onVar.f89098c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z3(this, c5820xc13f26f8);
        c5820xc13f26f8.b(android.os.Looper.getMainLooper());
    }

    public final void W6(int i17) {
        if (getIntent().getBooleanExtra("from_kinda", false)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6238xf12e491b c6238xf12e491b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6238xf12e491b();
            c6238xf12e491b.f136486g.f88261a = i17;
            c6238xf12e491b.e();
        }
    }

    public final void X6(r45.r65 r65Var) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(r65Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "[setTitleByScene] has info： %s", objArr);
        com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = m83108x2b5a5a39();
        if (m83108x2b5a5a39 != null) {
            this.f261528w = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575053kk5);
            if (!"UnbindProcess".equals(m83108x2b5a5a39.e())) {
                if (m83108x2b5a5a39 instanceof qs4.j) {
                    this.f261515g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kmo);
                    this.f261516h.setText(this.f261528w);
                    return;
                } else if ("ModifyPwdProcess".equals(m83108x2b5a5a39.e())) {
                    this.f261515g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.krk);
                    this.f261516h.setText(this.f261528w);
                    return;
                } else {
                    if ("OfflineProcess".equals(m83108x2b5a5a39.e())) {
                        this.f261515g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575052kk4);
                        this.f261516h.setText(this.f261528w);
                        return;
                    }
                    return;
                }
            }
            java.lang.String string = m83108x2b5a5a39.f295334c.getString("key_check_pwd_title");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                this.f261515g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575070kn3);
            } else {
                this.f261515g.setText(string);
            }
            this.f261516h.setText(this.f261528w);
            if (r65Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r65Var.f466106d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "[setTitleByScene] title : %s", r65Var.f466106d);
                this.f261515g.setText(r65Var.f466106d);
            }
            if (r65Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r65Var.f466107e)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "[setTitleByScene] paypwd_desc : %s", r65Var.f466107e);
            this.f261516h.setText(r65Var.f466107e);
        }
    }

    public final void Y6(r45.r65 r65Var) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(r65Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "[updateByJsApiPageMsgInfo] has info： %s", objArr);
        if (r65Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r65Var.f466106d)) {
            this.f261515g.setText(r65Var.f466106d);
        }
        if (r65Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r65Var.f466107e)) {
            this.f261516h.setText(r65Var.f466107e);
        }
        X6(r65Var);
    }

    public final void Z6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "change mode: %s", java.lang.Integer.valueOf(this.f261523r));
        if (this.f261523r == 1) {
            this.f261513e.setVisibility(0);
            this.f261512d.setVisibility(8);
            this.f261517i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kjz);
            this.f261513e.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x3(this), 300L);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f261529x)) {
                this.f261516h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575049kk1);
                return;
            } else {
                this.f261516h.setText(this.f261529x);
                return;
            }
        }
        this.f261513e.setVisibility(8);
        this.f261512d.a();
        this.f261512d.setVisibility(0);
        this.f261517i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kjy);
        m83139x8022ec1f();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f261528w)) {
            this.f261516h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575053kk5);
        } else {
            this.f261516h.setText(this.f261528w);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: cleanUiData */
    public void mo65144xd0a01007(int i17) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = this.f261512d;
        if (viewOnFocusChangeListenerC22906x9d30fd14 != null) {
            viewOnFocusChangeListenerC22906x9d30fd14.a();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f261531z == 0) {
            overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: forceCancel */
    public void mo73851xc8398945() {
        m83094xccf10110();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d5z;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) findViewById(com.p314xaae8f345.mm.R.id.hdh);
        this.f261512d = viewOnFocusChangeListenerC22906x9d30fd14;
        qp5.p.b(viewOnFocusChangeListenerC22906x9d30fd14);
        this.f261512d.m83166x1270e8e7(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.t3(this));
        this.f261518m = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.pgr);
        this.f261513e = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.g5t);
        this.f261515g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pes);
        this.f261516h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pen);
        this.f261514f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.g5w);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pgo);
        this.f261517i = textView;
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u3(this));
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(this.f261515g);
        m83129xcfb55a41(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.w3(this));
        m83113x77af3ad7();
        m83125x8f91b80(this.f261512d, 0, false);
        m83139x8022ec1f();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isTransparent */
    public boolean mo63463x4510f9c8() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return m83105x7498fe14().getInt("key_pay_flag", 0) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0115  */
    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f261526u) {
            U6();
        }
        m83121xf6ff5b27(580);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        android.view.View view = this.f39900xbab696ce;
        if (view == null || !view.isShown()) {
            return super.onKeyUp(i17, keyEvent);
        }
        android.view.View view2 = this.f39900xbab696ce;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f261523r = 0;
        Z6();
        U6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = this.f261512d;
        if (viewOnFocusChangeListenerC22906x9d30fd14 != null) {
            viewOnFocusChangeListenerC22906x9d30fd14.a();
        }
        super.onResume();
        m83090x14f40144(580);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = this.f261512d;
            if (viewOnFocusChangeListenerC22906x9d30fd14 != null) {
                viewOnFocusChangeListenerC22906x9d30fd14.a();
            }
            if (!(m1Var instanceof ss4.d) && !(m1Var instanceof ss4.e)) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "check jsapi fail");
            com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
            if (g17 == null || !g17.e().equals("UnbindProcess")) {
                setResult(0);
                W6(0);
                finish();
            } else {
                setResult(1);
                g17.f295334c.putInt("key_process_result_code", 1);
                com.p314xaae8f345.mm.p2802xd031a825.a.d(this, g17.f295334c);
            }
            return true;
        }
        if (m1Var instanceof ss4.x) {
            android.os.Bundle m83105x7498fe14 = m83105x7498fe14();
            m83105x7498fe14.putString("key_pwd1", this.f261512d.m83161xfb85ada3());
            m83105x7498fe14.putString("key_bind_card_user_token", ((ss4.x) m1Var).f493674e);
            com.p314xaae8f345.mm.p2802xd031a825.a.d(this, m83105x7498fe14);
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd142 = this.f261512d;
            if (viewOnFocusChangeListenerC22906x9d30fd142 != null) {
                viewOnFocusChangeListenerC22906x9d30fd142.a();
            }
            finish();
        } else if (m1Var instanceof ss4.e0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A) || !"1".equals(this.A)) {
                db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kk9));
            }
            com.p314xaae8f345.mm.p2802xd031a825.h g18 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
            if (g18 != null) {
                g18.f295334c.putInt("key_process_result_code", -1);
            }
            com.p314xaae8f345.mm.p2802xd031a825.a.d(this, g18.f295334c);
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd143 = this.f261512d;
            if (viewOnFocusChangeListenerC22906x9d30fd143 != null) {
                viewOnFocusChangeListenerC22906x9d30fd143.a();
            }
            finish();
        } else if (m1Var instanceof ss4.d) {
            ss4.d dVar = (ss4.d) m1Var;
            h45.y.f360501a = dVar.H();
            com.p314xaae8f345.mm.p944x882e457a.o oVar = dVar.f493562e;
            this.f261521p = ((r45.y10) oVar.f152244b.f152233a).f472235f;
            setResult(-1);
            Y6(((r45.y10) oVar.f152244b.f152233a).f472236g);
            mo67598xf0aced2e(0);
        } else if (m1Var instanceof ss4.e) {
            ss4.e eVar = (ss4.e) m1Var;
            r45.v20 v20Var = eVar.f493568f;
            this.f261521p = v20Var.f469354f;
            java.lang.String str2 = v20Var.f469356h;
            this.f261527v = str2;
            h45.y.f360501a = str2;
            r45.r65 r65Var = v20Var.f469355g;
            if (r65Var != null) {
                this.f261528w = r65Var.f466107e;
                this.f261529x = r65Var.f466108f;
            }
            setResult(-1);
            Y6(eVar.f493568f.f469355g);
            r45.co6 co6Var = eVar.f493568f.f469357i;
            if (co6Var != null && co6Var.f453268e != null) {
                pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
                if (co6Var.f453267d == 1 && co6Var.f453270g == 1 && aVar.yh() && aVar.Ic() && !aVar.H4()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "can use touch pay");
                    this.f261523r = 1;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = co6Var.f453268e;
                    mz2.d2 d2Var = mz2.d2.IML;
                    if (gVar != null) {
                        d2Var.f414644d = gVar.i();
                    }
                    d2Var.f414646f = co6Var.f453269f == 1;
                    V6();
                    this.f261517i.setVisibility(0);
                }
            }
            Z6();
            mo67598xf0aced2e(0);
            ((android.widget.TextView) ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.w) m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.w.class)).m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.pen)).sendAccessibilityEvent(128);
        } else if (m1Var instanceof ss4.y) {
            ss4.y yVar = (ss4.y) m1Var;
            if (yVar.f493677e == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "need free sms");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("key_pwd1", this.f261522q);
                bundle.putString("key_jsapi_token", this.f261521p);
                bundle.putString("key_relation_key", yVar.f493679g);
                bundle.putString("key_mobile", yVar.f493678f);
                com.p314xaae8f345.mm.p2802xd031a825.a.j(this, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z4.class, bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.y3(this));
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("token", yVar.f493676d);
                setResult(-1, intent);
                W6(-1);
                finish();
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setContentViewVisibility */
    public void mo67598xf0aced2e(int i17) {
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.w.class);
    }
}

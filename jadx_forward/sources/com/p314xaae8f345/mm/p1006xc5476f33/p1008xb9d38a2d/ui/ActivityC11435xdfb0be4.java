package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginSmsUI */
/* loaded from: classes14.dex */
public class ActivityC11435xdfb0be4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f154928p1 = 0;

    /* renamed from: l1, reason: collision with root package name */
    public final x51.c1 f154929l1 = new x51.c1();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf
    public void Z6() {
        super.Z6();
        if (isFinishing() || getWindow() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LoginSmsUI", "LoginHistoryUI is finishing");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154878y)) {
            return;
        }
        this.f154873u.f155819b = this.f154878y;
        mo48674x36654fab();
        this.f154929l1.a(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.c7(this));
    }

    public final void m7(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        h11.e eVar = new h11.e(str, 13, "", 0, "");
        gm0.j1.d().g(eVar);
        this.f154871s = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.b7(this, eVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 32044) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (i18 == -1 && bundleExtra != null && bundleExtra.getString("go_next", "").equals("auth_again")) {
                m7(this.f154878y);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.T = 8;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q0(this.C).booleanValue() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q0(this.f154878y).booleanValue()) {
            this.f154858d.setText(a7(this.f154878y));
        }
        this.M.setVisibility(0);
        this.M.m78962xc17f97e2(3);
        this.M.m78963x3d4bc56f(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.y6(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 c21493x36e72905 = this.M;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.z6 z6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.z6(this);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = c21493x36e72905.f278906e;
        if (c21486x59d05a04 != null) {
            c21486x59d05a04.addTextChangedListener(z6Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMFormVerifyCodeInputView", "watcher : %s, contentET : %s", z6Var, c21486x59d05a04);
        }
        if (this.M.m78956xfb85ada3().toString().length() > 0) {
            this.f154860f.setEnabled(true);
        }
        this.f154860f.setVisibility(0);
        this.f154860f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a7(this));
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        q61.j.f441794a.b(this, new q61.k() { // from class: com.tencent.mm.plugin.account.ui.LoginSmsUI$$a
            @Override // q61.k
            public final void a(final boolean z17, r45.nf5 nf5Var) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4.f154928p1;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4 activityC11435xdfb0be4 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4.this;
                activityC11435xdfb0be4.getClass();
                final java.lang.ref.WeakReference weakReference2 = weakReference;
                activityC11435xdfb0be4.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginSmsUI$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4.f154928p1;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4 activityC11435xdfb0be42 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4.this;
                        activityC11435xdfb0be42.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LoginSmsUI", "TAGcheckLoginURLMainDevice strongLoginSmsUI callback begin ");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4 activityC11435xdfb0be43 = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4) weakReference2.get();
                        if (!z17 || activityC11435xdfb0be43 == null || activityC11435xdfb0be43.isFinishing()) {
                            return;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PushLoginURLTAG3MainDeviceCGI", "checkFastSwitchStatus strongLoginSmsUI");
                        activityC11435xdfb0be42.X6();
                    }
                });
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.M.b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(145, this);
        mo48674x36654fab();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(145, this);
    }
}

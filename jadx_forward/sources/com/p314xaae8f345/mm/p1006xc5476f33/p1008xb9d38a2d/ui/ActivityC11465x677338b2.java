package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI */
/* loaded from: classes11.dex */
public class ActivityC11465x677338b2 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f155153d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f155154e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f155155f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f155156g;

    /* renamed from: h, reason: collision with root package name */
    public h11.e f155157h;

    /* renamed from: i, reason: collision with root package name */
    public r61.e1 f155158i;

    /* renamed from: m, reason: collision with root package name */
    public int f155159m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f155160n;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569739kg;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String str;
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ahy);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ig(this));
        this.f155156g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hsx);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.aig);
        java.lang.String str2 = this.f155153d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3[] V6 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11464xa1b3f44e.V6();
        java.lang.String a17 = u11.c.a(str2);
        int length = V6.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                str = "English";
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3 f3Var = V6[i17];
            if (f3Var.f155373c.equalsIgnoreCase(a17)) {
                str = f3Var.f155371a;
                break;
            }
            i17++;
        }
        this.f155154e = str;
        this.f155156g.setText(str);
        this.f155155f = u11.c.a(this.f155153d);
        findViewById(com.p314xaae8f345.mm.R.id.f567187ii0).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.jg(this));
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.mg(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 != 10000 || intent == null) {
            return;
        }
        this.f155154e = intent.getStringExtra("voice_verify_language");
        this.f155155f = intent.getStringExtra("voice_verify_code");
        this.f155156g.setText(this.f155154e);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f155153d = getIntent().getExtras().getString("bindmcontact_mobile");
        int i17 = getIntent().getExtras().getInt("voice_verify_type");
        this.f155159m = i17;
        if (i17 == 0 || i17 == 2 || i17 == 3) {
            gm0.j1.d().a(145, this);
        } else if (i17 == 4 || i17 == 1) {
            gm0.j1.d().a(132, this);
        }
        this.f155160n = n71.a.a();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(132, this);
        gm0.j1.d().q(145, this);
        int i17 = this.f155159m;
        if (i17 == 0 || i17 == 2 || i17 == 3) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R200_500,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R200_500"));
            sb6.append(",2");
            n71.a.c(10645, false, sb6.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        n71.a.e(this.f155160n);
        mo48674x36654fab();
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        int i17 = this.f155159m;
        if (i17 == 0 || i17 == 2 || i17 == 3) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R200_500,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R200_500"));
            sb6.append(",1");
            n71.a.c(10645, true, sb6.toString());
            n71.a.d("R200_500");
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegByMobileVoiceVerifyUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
        com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 4);
    }
}

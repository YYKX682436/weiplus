package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/account/ui/MMLoginVerifyPwdUI;", "Lcom/tencent/mm/plugin/account/ui/MMBaseAccountActivity;", "<init>", "()V", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI */
/* loaded from: classes5.dex */
public final class ActivityC11452x4130082f extends com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11447xc228938b {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f155003t = 0;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f155004m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 f155005n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f155008q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f155009r;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f155006o = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.y9.f155873d);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f155007p = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w9.f155828d);

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.x9 f155010s = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.x9(this);

    public static final void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11452x4130082f activityC11452x4130082f) {
        if (activityC11452x4130082f.isFinishing() || activityC11452x4130082f.getWindow() == null) {
            return;
        }
        activityC11452x4130082f.b7().f155819b = activityC11452x4130082f.f155008q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 b76 = activityC11452x4130082f.b7();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = activityC11452x4130082f.f155005n;
        if (c21486x59d05a04 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPwdET");
            throw null;
        }
        b76.f155820c = c21486x59d05a04.getText().toString();
        java.lang.String str = activityC11452x4130082f.b7().f155820c;
        if (!(str == null || str.length() == 0)) {
            activityC11452x4130082f.mo48674x36654fab();
            ((x51.c1) ((jz5.n) activityC11452x4130082f.f155006o).mo141623x754a37bb()).a(activityC11452x4130082f, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.r9(activityC11452x4130082f));
        } else {
            java.lang.String str2 = activityC11452x4130082f.b7().f155819b;
            java.lang.String str3 = activityC11452x4130082f.b7().f155820c;
            db5.t7.m123882x26a183b(activityC11452x4130082f, com.p314xaae8f345.mm.R.C30867xcad56011.gif, 0).show();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11447xc228938b
    public android.view.View V6() {
        android.widget.Button button = new android.widget.Button(new android.view.ContextThemeWrapper(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f575885kr), null, 0);
        button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gi7);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, i65.a.f(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr));
        button.setLayoutParams(layoutParams);
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.s9(this));
        this.f155004m = button;
        button.setEnabled(false);
        android.widget.Button button2 = this.f155004m;
        if (button2 != null) {
            return button2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nextBtn");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11447xc228938b
    public int W6() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570810ek2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11447xc228938b
    public void X6() {
        super.X6();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ip_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.EditText m78930xd454f3ba = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b) findViewById).m78930xd454f3ba();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m78930xd454f3ba, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMClearEditText");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) m78930xd454f3ba;
        this.f155005n = c21486x59d05a04;
        ck5.f b17 = ck5.f.b(c21486x59d05a04);
        b17.f124094f = 0;
        b17.f124093e = 16;
        b17.d(null);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a042 = this.f155005n;
        if (c21486x59d05a042 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPwdET");
            throw null;
        }
        c21486x59d05a042.addTextChangedListener(this.f155010s);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a043 = this.f155005n;
        if (c21486x59d05a043 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPwdET");
            throw null;
        }
        c21486x59d05a043.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t9(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a044 = this.f155005n;
        if (c21486x59d05a044 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPwdET");
            throw null;
        }
        c21486x59d05a044.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.u9(this));
        a7();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v9(this));
    }

    public final void a7() {
        android.widget.Button button = this.f155004m;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nextBtn");
            throw null;
        }
        if (this.f155005n != null) {
            button.setEnabled(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2.getText().toString()));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPwdET");
            throw null;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 b7() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6) ((jz5.n) this.f155007p).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11447xc228938b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f155008q = getIntent().getStringExtra("binded_mobile");
        this.f155009r = getIntent().getStringExtra("extspam_ctx_string");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (i17 != 4) {
            return super.onKeyDown(i17, event);
        }
        mo48674x36654fab();
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(m71.g.class);
    }
}

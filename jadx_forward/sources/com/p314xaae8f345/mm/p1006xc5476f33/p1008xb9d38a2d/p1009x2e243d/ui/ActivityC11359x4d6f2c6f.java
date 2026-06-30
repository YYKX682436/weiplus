package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI */
/* loaded from: classes14.dex */
public class ActivityC11359x4d6f2c6f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int E = 0;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public android.app.ProgressDialog D;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f154475e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f154476f;

    /* renamed from: m, reason: collision with root package name */
    public android.os.Bundle f154480m;

    /* renamed from: n, reason: collision with root package name */
    public int f154481n;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f154484q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f154485r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f154486s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f154487t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f154488u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f154489v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f154490w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f154491x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f154492y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f154493z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f154474d = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f154477g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f154478h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f154479i = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f154482o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f154483p = false;

    public final void T6(boolean z17) {
        n61.a aVar;
        if (this.f154480m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BindLinkedInUI", "bindBundle is null !!");
            return;
        }
        n61.a aVar2 = new n61.a(1, this.f154487t.f292896x ? 1 : 2, this.f154491x, this.f154492y, "", this.f154493z, this.A, this.B, this.C);
        if (z17) {
            aVar = aVar2;
        } else {
            aVar = aVar2;
            this.D = db5.e1.Q(this, null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, false, new p61.e0(this, aVar2));
        }
        gm0.j1.d().g(aVar);
    }

    public final void U6() {
        if (!this.f154478h) {
            setResult(-1);
            finish();
            return;
        }
        if (!this.f154483p) {
            setResult(-1);
            finish();
            return;
        }
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(this);
        b17.addFlags(603979776);
        b17.putExtra("preferred_tab", 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void V6() {
        this.f154475e = (java.lang.String) gm0.j1.u().c().l(286721, null);
        this.f154474d = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0);
        this.f154476f = (java.lang.String) gm0.j1.u().c().l(286722, null);
        int p17 = c01.z1.p();
        this.f154481n = p17;
        this.f154477g = (p17 & 4194304) != 0;
    }

    public final void W6(java.lang.String str) {
        int indexOf = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bec).indexOf("%s");
        android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bec, str));
        newSpannable.setSpan(new p61.f0(this), indexOf, str.length() + indexOf, 33);
        this.f154484q.setText(newSpannable);
    }

    public final void X6(boolean z17, boolean z18, java.lang.String str, boolean z19) {
        this.f154490w.setVisibility(8);
        if (!z17) {
            this.f154484q.setVisibility(8);
            this.f154484q.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bed));
            this.f154485r.setVisibility(0);
            android.view.View view = this.f154486s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showNormalBindView", "(ZZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showNormalBindView", "(ZZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f154488u.setVisibility(0);
            this.f154489v.setVisibility(8);
            return;
        }
        this.f154485r.setVisibility(8);
        this.f154484q.setVisibility(0);
        W6(str);
        android.view.View view2 = this.f154486s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showNormalBindView", "(ZZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showNormalBindView", "(ZZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f154488u.setVisibility(8);
        if (z18) {
            this.f154489v.setVisibility(0);
        }
        this.f154487t.m81392x52cfa5c6(z19);
        this.f154487t.m81396xb3e0a10a(new p61.s(this));
    }

    public final void Y6(boolean z17, boolean z18) {
        if (z17) {
            this.f154481n |= 4194304;
        } else {
            this.f154481n &= -4194305;
        }
        int i17 = z17 ? 1 : 2;
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(this.f154481n));
        if (z18) {
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = 33;
            p53Var.f464295e = i17;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        }
    }

    public final void Z6() {
        boolean z17 = this.f154478h;
        if (z17 && this.f154480m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BindLinkedInUI", "bindBundle is null");
            return;
        }
        if (this.f154479i) {
            X6(this.f154474d, false, this.f154476f, this.f154477g);
            return;
        }
        if (!z17) {
            X6(this.f154474d, true, this.f154476f, this.f154477g);
            return;
        }
        boolean z18 = this.f154474d && this.f154475e.equals(this.f154491x);
        java.lang.String str = this.f154492y;
        boolean z19 = this.f154477g;
        this.f154484q.setVisibility(0);
        W6(str);
        android.view.View view = this.f154486s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showQrBindView", "(ZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showQrBindView", "(ZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f154489v.setVisibility(8);
        if (z18) {
            this.f154485r.setVisibility(8);
            this.f154488u.setVisibility(8);
            this.f154490w.setVisibility(8);
            this.f154487t.m81392x52cfa5c6(z19);
            this.f154487t.m81396xb3e0a10a(new p61.g0(this));
            return;
        }
        this.f154485r.setVisibility(0);
        this.f154488u.setVisibility(0);
        this.f154490w.setVisibility(0);
        this.f154487t.m81392x52cfa5c6(z19);
        this.f154487t.m81396xb3e0a10a(new p61.r(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569733ka;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (this.f154478h) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bep);
        } else if (this.f154479i) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bes);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bei);
        }
        this.f154484q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568393mo2);
        this.f154485r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568394mo3);
        this.f154486s = findViewById(com.p314xaae8f345.mm.R.id.mvm);
        this.f154487t = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.mvl);
        this.f154488u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aht);
        this.f154489v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ory);
        this.f154490w = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.b5h);
        this.f154484q.setOnClickListener(new p61.u(this));
        this.f154488u.setOnClickListener(new p61.x(this));
        this.f154489v.setOnClickListener(new p61.b0(this));
        this.f154490w.setOnClickListener(new p61.c0(this));
        mo54448x9c8c0d33(new p61.d0(this));
        Z6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        if (i17 != 100) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BindLinkedInUI", "onActivityResult unknow request");
            return;
        }
        android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
        java.lang.String string = bundleExtra.getString("ret");
        java.lang.String string2 = bundleExtra.getString("limid");
        java.lang.String string3 = bundleExtra.getString("liname");
        java.lang.String string4 = bundleExtra.getString("liurl");
        java.lang.String string5 = bundleExtra.getString("liswitch");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BindLinkedInUI", "linkedin oauth ret is null, maybe canceled");
            return;
        }
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(string, 0);
        if (D1 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BindLinkedInUI", "linkedin oauth bind failed ret %s ", java.lang.Integer.valueOf(D1));
            db5.e1.s(this, getString(D1 == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.ben : com.p314xaae8f345.mm.R.C30867xcad56011.bem), null);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BindLinkedInUI", "linkedin member id is null");
            return;
        }
        gm0.j1.u().c().w(286722, string3);
        gm0.j1.u().c().w(286721, string2);
        gm0.j1.u().c().w(286723, string4);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string5)) {
            Y6(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(string5, 0) == 1, false);
        }
        V6();
        Z6();
        java.lang.String string6 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bej);
        if (isFinishing()) {
            return;
        }
        dp.a.m125854x26a183b(this, string6, 0).show();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q4.f34497x366c91de, this);
        gm0.j1.d().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.n0.f34055x366c91de, this);
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("qrcode_bundle");
        this.f154480m = bundleExtra;
        this.f154478h = bundleExtra != null;
        if (bundleExtra != null) {
            this.f154491x = bundleExtra.getString("i");
            this.f154492y = this.f154480m.getString("n");
            this.f154493z = this.f154480m.getString("t");
            this.A = this.f154480m.getString("o");
            this.B = this.f154480m.getString("s");
            java.lang.String string = this.f154480m.getString("r");
            this.C = string;
            if (this.f154491x == null || this.f154492y == null || this.f154493z == null || this.B == null || string == null) {
                db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bef), null, false, new p61.t(this));
            }
        }
        this.f154479i = getIntent().getBooleanExtra("oversea_entry", false);
        V6();
        if (this.f154478h) {
            this.f154477g = true;
        }
        mo43517x10010bd5();
        if (this.f154480m != null && this.f154474d && this.f154475e.equals(this.f154491x)) {
            this.f154482o = true;
            T6(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.n0.f34055x366c91de, this);
        gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q4.f34497x366c91de, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        U6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        int i27;
        android.app.ProgressDialog progressDialog = this.D;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.D = null;
        }
        if (i17 != 0 || i18 != 0) {
            if (m1Var.mo808xfb85f7b0() == 549) {
                i19 = i18 == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.ben : com.p314xaae8f345.mm.R.C30867xcad56011.bem;
            } else if (m1Var.mo808xfb85f7b0() != 550) {
                return;
            } else {
                i19 = com.p314xaae8f345.mm.R.C30867xcad56011.beo;
            }
            db5.e1.s(this, getString(i19), null);
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 549) {
            this.f154483p = true;
            i27 = !this.f154482o ? com.p314xaae8f345.mm.R.C30867xcad56011.bej : com.p314xaae8f345.mm.R.C30867xcad56011.bek;
        } else if (m1Var.mo808xfb85f7b0() != 550) {
            return;
        } else {
            i27 = com.p314xaae8f345.mm.R.C30867xcad56011.beu;
        }
        java.lang.String string = getString(i27);
        if (!isFinishing()) {
            dp.a.m125854x26a183b(this, string, 0).show();
        }
        V6();
        this.f154477g = this.f154487t.f292896x;
        Z6();
    }
}

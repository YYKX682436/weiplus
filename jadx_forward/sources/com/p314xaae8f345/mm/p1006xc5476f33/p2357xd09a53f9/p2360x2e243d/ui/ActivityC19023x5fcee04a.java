package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI */
/* loaded from: classes9.dex */
public class ActivityC19023x5fcee04a extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f260073n = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f260074d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f260075e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f260076f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f260077g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f260078h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f260079i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f260080m;

    public final void U6(boolean z17) {
        if (c01.z1.I() || z17 || ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().f()) {
            m83105x7498fe14().putBoolean("offline_pay", false);
            com.p314xaae8f345.mm.p2802xd031a825.a.d(this, m83105x7498fe14());
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(0, 1);
            db5.e1.k(this, com.p314xaae8f345.mm.R.C30867xcad56011.kga, -1, com.p314xaae8f345.mm.R.C30867xcad56011.kg_, com.p314xaae8f345.mm.R.C30867xcad56011.kgb, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.k(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.l(this));
        }
    }

    public void V6(boolean z17) {
        if (!z17) {
            this.f260078h.setVisibility(8);
            this.f260079i.setVisibility(8);
            this.f260080m.setVisibility(0);
            return;
        }
        this.f260078h.setVisibility(8);
        this.f260079i.setVisibility(0);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pa6)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.f(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pah);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pai);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.paf);
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pag);
        textView.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(this.f260074d.f69251x46aaea26, null));
        textView2.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(this.f260074d.f69252xf1ac0f39, null));
        textView3.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(this.f260074d.f69230xdbf8d15, null));
        textView4.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(this.f260074d.f69231x2c28d1ea, null));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260074d.f69256x6e045ec0)) {
            return;
        }
        this.f260076f.setVisibility(0);
        android.view.View view = this.f260077g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI", "setDomesticView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI", "setDomesticView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void W6() {
        this.f260078h.setVisibility(0);
        this.f260079i.setVisibility(8);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pa9)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.g(this));
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pal)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.h(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d5h;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) m83105x7498fe14().getParcelable("key_bankcard");
        this.f260074d = c19091x9511676c;
        if (c19091x9511676c == null) {
            return;
        }
        this.f260078h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.pa8);
        this.f260079i = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.pae);
        this.f260080m = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.pac);
        this.f260076f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.paa);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.paj);
        this.f260077g = findViewById;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.e(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = this.f260074d;
        if (1 == c19091x9511676c2.f69220xb7753620) {
            W6();
            return;
        }
        if (c19091x9511676c2.y0()) {
            V6(true);
            this.f260075e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pa7);
            at4.x1 Ai = vr4.f1.wi().Ai();
            java.lang.String str = this.f260074d.f69225xed6d60f6;
            Ai.getClass();
            this.f260075e.setVisibility(8);
        } else {
            V6(false);
            this.f260075e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pab);
            at4.x1 Ai2 = vr4.f1.wi().Ai();
            java.lang.String str2 = this.f260074d.f69225xed6d60f6;
            Ai2.getClass();
            this.f260075e.setVisibility(8);
        }
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.j(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.i.f35311x366c91de);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kg9);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        db5.e1.e(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfw), getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559571am), "", new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.m(this));
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        m83121xf6ff5b27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.i.f35311x366c91de);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof tr4.b) {
                android.widget.TextView textView = this.f260075e;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else if (m1Var instanceof tr4.a) {
                tr4.a aVar = (tr4.a) m1Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBankcardDetailUI", "NetSceneGetUnbindInfo succ and level = " + aVar.f502966d);
                int i19 = aVar.f502966d;
                if (i19 == 2 || i19 == 3) {
                    db5.e1.G(this, aVar.f502967e, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.n(this, i19));
                } else {
                    U6(false);
                }
            }
        } else if (m1Var instanceof tr4.a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBankcardDetailUI", "NetSceneGetUnbindInfo error");
            U6(false);
            return true;
        }
        return false;
    }
}

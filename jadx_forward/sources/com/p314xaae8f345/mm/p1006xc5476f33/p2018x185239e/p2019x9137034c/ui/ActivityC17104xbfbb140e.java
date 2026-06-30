package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI */
/* loaded from: classes9.dex */
public class ActivityC17104xbfbb140e extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f238034e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f238035f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f238036g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f238037h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f238038i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f238039m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f238040n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f238041o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f238042p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f238043q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f238044r;

    /* renamed from: s, reason: collision with root package name */
    public int f238045s;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce
    public void U6() {
        mo2533x106ab264().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw)));
        android.view.View j17 = mo2533x106ab264().j();
        if (j17 != null) {
            android.view.View findViewById = j17.findViewById(com.p314xaae8f345.mm.R.id.d0v);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta));
            }
            android.view.View findViewById2 = j17.findViewById(android.R.id.text1);
            if (findViewById2 != null && (findViewById2 instanceof android.widget.TextView)) {
                ((android.widget.TextView) findViewById2).setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            }
        }
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        getWindow().getDecorView().setSystemUiVisibility(8192);
        m78513xc2a54588().setFitsSystemWindows(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569715js;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f238034e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.axl);
        this.f238035f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.axm);
        this.f238036g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.axw);
        this.f238037h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.axx);
        this.f238038i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.axi);
        this.f238039m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.axj);
        this.f238040n = findViewById(com.p314xaae8f345.mm.R.id.axq);
        this.f238041o = findViewById(com.p314xaae8f345.mm.R.id.axr);
        this.f238042p = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.axb);
        this.f238043q = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.axg);
        if (this.f238045s != 1) {
            ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.axe)).setOnClickListener(new qw3.p0(this));
            return;
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.axf);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(fe1.t.f69748x366c91de);
        this.f238044r = getIntent().getStringExtra("key_transfer_bill_id");
        int intExtra = getIntent().getIntExtra("key_enter_scene", 0);
        this.f238045s = intExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitDetailUI", "billId: %s, enterScene: %s", this.f238044r, java.lang.Integer.valueOf(intExtra));
        mo43517x10010bd5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitDetailUI", "do query detail");
        m83098x5406100e(new ow3.j(this.f238044r));
        if (this.f238045s == 0) {
            m78600x5843c740(false);
            m78499x92e71989(false);
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ae8);
        } else {
            m78600x5843c740(true);
            m78499x92e71989(true);
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ae7);
        }
        mo54448x9c8c0d33(new qw3.o0(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(fe1.t.f69748x366c91de);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ow3.j) {
            ow3.j jVar = (ow3.j) m1Var;
            jVar.O(new qw3.r0(this, jVar));
            jVar.J(new qw3.q0(this, jVar));
            if (jVar.f295564i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitDetailUI", "net error: %s", jVar);
                dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.adu, 1).show();
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(nw3.f.class);
    }
}

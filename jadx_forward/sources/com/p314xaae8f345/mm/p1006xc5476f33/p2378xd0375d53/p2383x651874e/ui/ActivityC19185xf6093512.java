package com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2383x651874e.ui;

/* renamed from: com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderDetailUI */
/* loaded from: classes9.dex */
public class ActivityC19185xf6093512 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f262789d = "";

    /* renamed from: e, reason: collision with root package name */
    public r45.x65 f262790e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f262791f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f262792g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f262793h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f262794i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f262795m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f262796n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f262797o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f262798p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f262799q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f262800r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f262801s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f262802t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f262803u;

    public final void U6() {
        r45.x65 x65Var = this.f262790e;
        if (x65Var == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x65Var.f471350d)) {
            this.f262791f.setVisibility(8);
        } else {
            this.f262791f.setVisibility(0);
            this.f262797o.setText(this.f262790e.f471350d);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262790e.f471361r)) {
            this.f262792g.setVisibility(8);
        } else {
            this.f262792g.setVisibility(0);
            this.f262798p.setText(this.f262790e.f471361r);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262790e.f471352f)) {
            this.f262793h.setVisibility(8);
        } else {
            this.f262793h.setVisibility(0);
            this.f262799q.setText(this.f262790e.f471352f);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262790e.f471356m)) {
            this.f262794i.setVisibility(8);
        } else {
            this.f262794i.setVisibility(0);
            this.f262800r.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(r3.f471351e / 100.0d, this.f262790e.f471356m));
        }
        if (this.f262790e.f471353g >= 0) {
            this.f262795m.setVisibility(0);
            this.f262801s.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p(this.f262790e.f471353g));
        } else {
            this.f262795m.setVisibility(8);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262790e.f471354h)) {
            this.f262796n.setVisibility(8);
        } else {
            this.f262796n.setVisibility(0);
            this.f262802t.setText(this.f262790e.f471354h);
        }
        int i17 = this.f262790e.f471358o;
        if (i17 == 3) {
            this.f262803u.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kf8);
        } else if (i17 != 5) {
            this.f262803u.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575130kw3);
        } else {
            this.f262803u.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575068kn1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570889c93;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f29746x366c91de);
        java.lang.String string = m83105x7498fe14().getString("key_trans_id");
        this.f262789d = string;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PayUMallOrderDetailUI", "hy: trans id is null");
            finish();
        }
        m83098x5406100e(new wt4.c(this.f262789d));
        this.f262791f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cwi);
        this.f262792g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cvu);
        this.f262793h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f565603cw4);
        this.f262794i = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cw9);
        this.f262795m = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cwg);
        this.f262796n = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cwb);
        this.f262797o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cwj);
        this.f262798p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cvw);
        this.f262799q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565604cw5);
        this.f262800r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cw_);
        this.f262801s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cwh);
        this.f262802t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cwc);
        this.f262803u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cwm);
        U6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f29746x366c91de);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        if (!(m1Var instanceof wt4.c)) {
            return true;
        }
        this.f262790e = ((wt4.c) m1Var).f531068f;
        U6();
        return true;
    }
}

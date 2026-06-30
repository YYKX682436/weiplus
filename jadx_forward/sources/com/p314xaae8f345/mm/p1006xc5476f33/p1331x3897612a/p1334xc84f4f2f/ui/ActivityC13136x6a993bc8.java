package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

@db5.a(m123858x6ac9171 = 2)
/* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI */
/* loaded from: classes9.dex */
public class ActivityC13136x6a993bc8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.AbstractActivityC13133x11a8215 {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public r45.tw4 E;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f177781d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f177782e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f177783f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f177784g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f177785h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f177786i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21499x297cf4cb f177787m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f177788n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d f177789o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.k0 f177790p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f177791q;

    /* renamed from: r, reason: collision with root package name */
    public int f177792r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f177793s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f177794t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f177795u;

    /* renamed from: v, reason: collision with root package name */
    public int f177796v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f177797w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f177798x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f177799y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f177800z;

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13136x6a993bc8 activityC13136x6a993bc8, int i17, int i18) {
        activityC13136x6a993bc8.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardSelectMoneyUI", "go to grant ui");
        android.content.Intent intent = new android.content.Intent(activityC13136x6a993bc8.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13134x46be31c0.class);
        intent.putExtra("key_amt_type", i18);
        if (i18 == 1) {
            intent.putExtra("key_money_amt", i17);
        }
        intent.putExtra("key_rcvr_name", activityC13136x6a993bc8.f177794t);
        intent.putExtra("key_rcvr_true_name", activityC13136x6a993bc8.f177795u);
        intent.putExtra("key_rcvr_open_id", activityC13136x6a993bc8.f177797w);
        intent.putExtra("key_qrcode_desc", activityC13136x6a993bc8.f177798x);
        intent.putExtra("key_channel", activityC13136x6a993bc8.f177792r);
        intent.putExtra("key_web_url", activityC13136x6a993bc8.f177793s);
        intent.putExtra("key_scan_id", activityC13136x6a993bc8.A);
        intent.putExtra("key_sxtend_1", activityC13136x6a993bc8.f177799y);
        intent.putExtra("key_sxtend_2", activityC13136x6a993bc8.f177800z);
        intent.putExtra("key_max_amt", activityC13136x6a993bc8.f177796v);
        intent.putExtra("key_receiver_nickname", activityC13136x6a993bc8.C);
        intent.putExtra("key_photo_url", activityC13136x6a993bc8.D);
        intent.putExtra("key_chat_type", activityC13136x6a993bc8.getIntent().getIntExtra("key_chat_type", 0));
        intent.putExtra("key_send_type", activityC13136x6a993bc8.getIntent().getIntExtra("key_send_type", 0));
        r45.tw4 tw4Var = activityC13136x6a993bc8.E;
        if (tw4Var != null) {
            try {
                intent.putExtra("key_notice_item", android.util.Base64.encodeToString(tw4Var.mo14344x5f01b1f6(), 2));
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QrRewardSelectMoneyUI", e17, "", new java.lang.Object[0]);
            }
        }
        activityC13136x6a993bc8.startActivityForResult(intent, 1);
    }

    public final void V6(java.lang.String str) {
        java.lang.String x17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C) ? com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(str) : this.C;
        android.widget.TextView textView = this.f177784g;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, x17));
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: convertActivityFromTranslucent */
    public boolean mo44290xd3d2670d() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cbo;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f177782e = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.lgg);
        this.f177783f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lgl);
        this.f177784g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lgj);
        this.f177785h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lgh);
        this.f177786i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lgm);
        this.f177787m = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21499x297cf4cb) findViewById(com.p314xaae8f345.mm.R.id.lgi);
        this.f177788n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lgk);
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d c22905xef04d72d = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) findViewById(com.p314xaae8f345.mm.R.id.pga);
        this.f177789o = c22905xef04d72d;
        c22905xef04d72d.m83149xa5089f5c(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
        this.f177789o.m83150x1c5c5ff4(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.k0(this, null);
        this.f177790p = k0Var;
        this.f177787m.setAdapter((android.widget.ListAdapter) k0Var);
        this.f177787m.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.e0(this));
        this.f177788n.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.f0(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
        } else if (i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardSelectMoneyUI", "pay succ");
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.AbstractActivityC13133x11a8215, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(1516);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574277hp3);
        this.f177791q = getIntent().getStringExtra("key_qrcode_url");
        this.f177792r = getIntent().getIntExtra("key_channel", 0);
        this.f177793s = getIntent().getStringExtra("key_web_url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardSelectMoneyUI", "do scan code");
        m83098x5406100e(new xw1.h(this.f177791q, this.f177792r, this.f177793s));
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14721, 2, java.lang.Integer.valueOf(getIntent().getIntExtra("key_scene", 0)));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(1516);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof xw1.h) {
            xw1.h hVar = (xw1.h) m1Var;
            hVar.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.i0(this, hVar));
            if (hVar.f539195i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QrRewardSelectMoneyUI", "scan response error");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f539208n.f461437e)) {
                    dp.a.m125854x26a183b(this, hVar.f539208n.f461437e, 1).show();
                }
                finish();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.h0 h0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.h0(this, hVar);
            if (hVar.f539194h) {
                h0Var.a(hVar.f539190d, hVar.f539191e, hVar.f539192f, hVar);
            }
            mo67598xf0aced2e(0);
        }
        return true;
    }
}

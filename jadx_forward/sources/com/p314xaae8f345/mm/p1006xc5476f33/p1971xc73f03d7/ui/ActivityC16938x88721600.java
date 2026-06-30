package com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.qqmail.ui.MailImageDownloadUI */
/* loaded from: classes8.dex */
public class ActivityC16938x88721600 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p944x882e457a.v0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ProgressBar f236427d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f236428e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f236429f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f236430g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f236431h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f236432i;

    /* renamed from: m, reason: collision with root package name */
    public m11.b0 f236433m;

    /* renamed from: n, reason: collision with root package name */
    public k70.b0 f236434n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f236435o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f236436p;

    /* renamed from: q, reason: collision with root package name */
    public int f236437q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f236438r;

    /* renamed from: s, reason: collision with root package name */
    public long f236439s;

    /* renamed from: t, reason: collision with root package name */
    public long f236440t;

    public ActivityC16938x88721600() {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f236439s = 0L;
        this.f236440t = 0L;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.v0
    public void S(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 109) {
            T6(java.lang.Math.max(0, j18 != 0 ? (int) (((j17 * 100) / j18) - 1) : 0));
        }
    }

    public final void T6(int i17) {
        this.f236428e.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcy, java.lang.Integer.valueOf(i17)));
        if (i17 < this.f236427d.getMax()) {
            return;
        }
        finish();
        android.content.Intent intent = getIntent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/MailImageDownloadUI", "updateProgress", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/qqmail/ui/MailImageDownloadUI", "updateProgress", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bvm;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f236428e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h97);
        this.f236429f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h97);
        this.f236430g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h98);
        this.f236431h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566846h95);
        this.f236435o = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j89);
        this.f236428e.setVisibility(0);
        this.f236436p = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.h8p);
        this.f236432i = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.j8_);
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3);
        this.f236429f.setVisibility(8);
        this.f236430g.setVisibility(8);
        this.f236431h.setVisibility(8);
        m78596x71afbec8(8);
        mo54448x9c8c0d33(new os3.w2(this));
        this.f236427d = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.h96);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        super.onCreate(bundle);
        this.f236439s = getIntent().getLongExtra("img_msg_id", 0L);
        this.f236440t = getIntent().getLongExtra("img_server_id", 0L);
        this.f236437q = getIntent().getIntExtra("img_download_compress_type", 0);
        this.f236438r = getIntent().getStringExtra("img_download_username");
        mo43517x10010bd5();
        if (this.f236439s > 0) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            this.f236433m = m11.b1.Di().T1(this.f236438r, this.f236439s);
        }
        m11.b0 b0Var = this.f236433m;
        if ((b0Var == null || b0Var.f404166a <= 0) && this.f236440t > 0) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            this.f236433m = m11.b1.Di().b2(this.f236438r, this.f236440t);
        }
        m11.b0 b0Var2 = this.f236433m;
        if (b0Var2 == null || b0Var2.f404166a <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MailImageDownloadUI", "onCreate : on such imginfo, with msgLocalId = " + this.f236439s + ", or msgSvrId = " + this.f236440t);
            return;
        }
        if (this.f236439s > 0 || this.f236440t <= 0) {
            f9Var = null;
        } else {
            f9Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(this.f236438r, this.f236440t);
            this.f236439s = f9Var.m124847x74d37ac6();
        }
        long j17 = this.f236439s;
        if (j17 > 0 && f9Var == null) {
            f9Var = pt0.f0.f2(this.f236438r, j17);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
        java.lang.String str = this.f236433m.f404170e;
        java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var2, bm5.c0.f104083a.d(this.f236433m.l()), str, null, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(aj6)) {
            long j18 = this.f236433m.f404166a;
            long j19 = this.f236439s;
            java.lang.String str2 = this.f236438r;
            int i17 = this.f236437q;
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            this.f236434n = new m11.t0(j18, j19, str2, i17, this);
            gm0.j1.n().f354821b.g((com.p314xaae8f345.mm.p944x882e457a.m1) this.f236434n);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MailImageDownloadUI", "has big image, bigImgPath = %s, hasHDImg = %b, fullPath = %s", str, java.lang.Boolean.valueOf(this.f236433m.j()), aj6);
        this.f236433m.getClass();
        if (aj6 == null || aj6.equals("") || !com.p314xaae8f345.mm.vfs.w6.j(aj6)) {
            return;
        }
        this.f236436p.setVisibility(8);
        this.f236427d.setVisibility(8);
        this.f236435o.setVisibility(0);
        this.f236435o.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(aj6));
        this.f236432i.invalidate();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.n().f354821b.q(109, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.n().f354821b.a(109, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 109) {
            return;
        }
        if (i17 == 0 && i18 == 0) {
            T6(this.f236427d.getMax());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MailImageDownloadUI", "onSceneEnd : fail, errType = " + i17 + ", errCode = " + i18);
        dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.g09, 1).show();
    }
}

package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.ImageDownloadUI */
/* loaded from: classes8.dex */
public class ActivityC21633xf1b658b7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p944x882e457a.v0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ProgressBar f279818d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f279819e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f279820f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f279821g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f279822h;

    /* renamed from: i, reason: collision with root package name */
    public m11.b0 f279823i;

    /* renamed from: m, reason: collision with root package name */
    public m11.t0 f279824m;

    /* renamed from: n, reason: collision with root package name */
    public int f279825n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f279826o;

    /* renamed from: p, reason: collision with root package name */
    public long f279827p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f279828q = 0;

    @Override // com.p314xaae8f345.mm.p944x882e457a.v0
    public void S(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 109) {
            T6(java.lang.Math.max(0, j18 != 0 ? (int) (((j17 * 100) / j18) - 1) : 0));
        }
    }

    public final void T6(int i17) {
        this.f279818d.setProgress(i17);
        this.f279819e.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcy, java.lang.Integer.valueOf(i17)));
        if (i17 < this.f279818d.getMax()) {
            return;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(this.f279824m.f404314h));
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f279826o, C1.f404180o);
        java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(Li, bm5.c0.f104083a.d(C1.l()), C1.f404170e, null, null);
        if (this.f279825n == 1) {
            ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
            java.lang.String b17 = m11.c0.b(C1);
            aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(Li, bm5.f0.f104095g, b17, null, null);
        }
        if (aj6 == null || aj6.equals("") || !com.p314xaae8f345.mm.vfs.w6.j(aj6)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageDownloadUI", "[ImageGalleryUI] showImg");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.class);
        intent.putExtra("key_message_id", this.f279827p);
        intent.putExtra("key_message_talker", this.f279826o);
        intent.putExtra("key_image_path", aj6);
        intent.putExtra("key_compress_type", this.f279825n);
        intent.putExtra("key_favorite", true);
        intent.putExtra("img_gallery_msg_id", this.f279827p);
        intent.putExtra("img_gallery_talker", this.f279826o);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d3b;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f279819e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h97);
        this.f279820f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oyo);
        this.f279821g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oyp);
        this.f279822h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oym);
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.d2o)).setImageResource(com.p314xaae8f345.mm.R.raw.f78994x211254f4);
        this.f279819e.setVisibility(0);
        this.f279820f.setVisibility(8);
        this.f279821g.setVisibility(8);
        this.f279822h.setVisibility(8);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.hb(this));
        this.f279818d = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.oyn);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f279827p = getIntent().getLongExtra("img_msg_id", 0L);
        this.f279828q = getIntent().getLongExtra("img_server_id", 0L);
        this.f279825n = getIntent().getIntExtra("img_download_compress_type", 0);
        this.f279826o = getIntent().getStringExtra("img_download_username");
        mo43517x10010bd5();
        if (this.f279827p > 0) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            this.f279823i = m11.b1.Di().T1(this.f279826o, this.f279827p);
        }
        m11.b0 b0Var = this.f279823i;
        if ((b0Var == null || b0Var.f404166a <= 0) && this.f279828q > 0) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            this.f279823i = m11.b1.Di().b2(this.f279826o, this.f279828q);
        }
        m11.b0 b0Var2 = this.f279823i;
        if (b0Var2 == null || b0Var2.f404166a <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ImageDownloadUI", "onCreate : on such imginfo, with msgLocalId = " + this.f279827p + ", or msgSvrId = " + this.f279828q);
            return;
        }
        if (this.f279827p <= 0 && this.f279828q > 0) {
            this.f279827p = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).o2(this.f279826o, this.f279828q).m124847x74d37ac6();
        }
        this.f279824m = new m11.t0(this.f279823i.f404166a, this.f279827p, this.f279826o, this.f279825n, this);
        c01.d9.e().g(this.f279824m);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        c01.d9.e().q(109, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(109, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 109) {
            return;
        }
        if (i17 == 0 && i18 == 0) {
            T6(this.f279818d.getMax());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ImageDownloadUI", "onSceneEnd : fail, errType = " + i17 + ", errCode = " + i18);
        dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.g09, 1).show();
    }
}

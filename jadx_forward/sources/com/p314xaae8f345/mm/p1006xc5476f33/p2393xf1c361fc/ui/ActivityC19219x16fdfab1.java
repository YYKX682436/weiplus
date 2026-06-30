package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-websearch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI */
/* loaded from: classes12.dex */
public final class ActivityC19219x16fdfab1 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f263199t = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f263201e;

    /* renamed from: f, reason: collision with root package name */
    public long f263202f;

    /* renamed from: h, reason: collision with root package name */
    public int f263204h;

    /* renamed from: i, reason: collision with root package name */
    public int f263205i;

    /* renamed from: o, reason: collision with root package name */
    public r45.jj4 f263208o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f263210q;

    /* renamed from: s, reason: collision with root package name */
    public long f263212s;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f263200d = "MicroMsg.WebSearch.WebSearchSnsImageLoadingUI";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f263203g = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f263206m = true;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f263207n = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f263209p = "";

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f263211r = jz5.h.b(new vv4.a1(this));

    public final void T6(int i17, java.lang.String str, java.lang.String str2, int i18, long j17) {
        pm0.v.K(null, new vv4.y0(this, i17, str2, str, i18, j17));
    }

    public final void U6(java.lang.String imagePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
        ry3.p pVar = new ry3.p();
        pVar.f483066g = this.f263201e;
        pVar.f483064e = imagePath;
        pVar.f483067h = 4;
        r45.cj cjVar = new r45.cj();
        pVar.f483068i = cjVar;
        cjVar.f453112d = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0);
        pVar.f483072m = this.f263206m;
        r45.e64 i17 = su4.r2.i();
        if (i17 != null) {
            r45.vi viVar = new r45.vi();
            pVar.f483069j = viVar;
            viVar.f469805e = i17.f454579d;
            viVar.f469804d = i17.f454580e;
            viVar.f469806f = i17.f454581f;
            pVar.f483060a = this.f263202f;
        }
        r45.jj4 jj4Var = this.f263208o;
        if (jj4Var != null) {
            try {
                pVar.f483075p.putByteArray("key_sns_media_data", jj4Var.mo14344x5f01b1f6());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f263200d, e17, "startImageSearch mediaObj toByteArray exception", new java.lang.Object[0]);
            }
        }
        T6(2, imagePath, this.f263203g, 0, java.lang.System.currentTimeMillis());
        long Ni = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Ni(pVar, new vv4.d1(this, imagePath));
        this.f263212s = Ni;
        if (Ni != 0) {
            T6(4, imagePath, this.f263203g, 0, java.lang.System.currentTimeMillis());
        }
    }

    public final void a() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) findViewById(com.p314xaae8f345.mm.R.id.im6)).setVisibility(8);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iml)).setVisibility(8);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dhn)).setVisibility(8);
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.dhe)).setVisibility(8);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dkg)).setVisibility(0);
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.dkd)).setVisibility(0);
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.dkd)).setOnClickListener(new vv4.x0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d9m;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        T6(11, "", this.f263203g, 0, java.lang.System.currentTimeMillis());
        this.f263210q = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f263202f = getIntent().getLongExtra("key_session_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_sns_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f263207n = stringExtra;
        getIntent().getStringExtra("key_sns_username");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_sns_image_path");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f263209p = stringExtra2;
        this.f263201e = getIntent().getIntExtra("key_scan_goods_request_type", 0);
        this.f263204h = getIntent().getIntExtra("key_scene", 0);
        java.lang.String c17 = o13.p.c(this.f263202f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getUnsignedLong(...)");
        this.f263203g = c17;
        this.f263205i = getIntent().getIntExtra("key_source", 0);
        this.f263206m = getIntent().getBooleanExtra("key_upload_image_use_cdn_opt", true);
        int i17 = this.f263204h;
        if (i17 == 0) {
            i17 = 83;
        }
        this.f263204h = i17;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_sns_media");
        if (byteArrayExtra != null) {
            r45.jj4 jj4Var = new r45.jj4();
            try {
                jj4Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Exception unused) {
            }
            this.f263208o = jj4Var;
        }
        mo74406x9c8c0d33(new vv4.v0(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        mo54450xbf7c1df6("");
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f263200d, "startImageSearch account not ready");
            a();
            return;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(this.f263209p)) {
            m74089x2b33b77f();
            U6(this.f263209p);
            ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.dhe)).setOnClickListener(new vv4.w0(this));
            return;
        }
        r45.jj4 jj4Var2 = this.f263208o;
        if (jj4Var2 == null) {
            a();
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.C19220x4fa7e56d) ((jz5.n) this.f263211r).mo141623x754a37bb()).mo48813x58998cd();
        m74089x2b33b77f();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6066x1782ba50 c6066x1782ba50 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6066x1782ba50();
        am.yv yvVar = c6066x1782ba50.f136349g;
        yvVar.f90015b = jj4Var2;
        yvVar.f90016c = jj4Var2.f459388d;
        yvVar.f90014a = 4;
        c6066x1782ba50.e();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.C19220x4fa7e56d) ((jz5.n) this.f263211r).mo141623x754a37bb()).mo48814x2efc64();
        if (this.f263212s != 0) {
            ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).wi(this.f263212s);
        }
        super.onDestroy();
    }

    /* renamed from: showLoading */
    public final void m74089x2b33b77f() {
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) findViewById(com.p314xaae8f345.mm.R.id.im6)).setImageResource(com.p314xaae8f345.mm.R.raw.f81382xf36fc2d6);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) findViewById(com.p314xaae8f345.mm.R.id.im6)).setImageResource(com.p314xaae8f345.mm.R.raw.f81395x45b05210);
        }
    }
}

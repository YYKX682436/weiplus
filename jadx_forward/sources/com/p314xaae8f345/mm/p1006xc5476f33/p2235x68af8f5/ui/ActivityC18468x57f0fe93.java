package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/StoryBrowseUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lze4/h;", "<init>", "()V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.StoryBrowseUI */
/* loaded from: classes4.dex */
public final class ActivityC18468x57f0fe93 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements ze4.h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f253395h = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f253396d;

    /* renamed from: e, reason: collision with root package name */
    public int f253397e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f253398f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f253399g;

    @Override // ze4.h
    public void H2() {
    }

    public final void T6(int i17) {
        mf4.d dVar = mf4.d.f407693a;
        mf4.d.f407696d.f142451d = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(mo55332x76847179());
        mf4.d.f407696d.f142458k = java.lang.System.currentTimeMillis();
        dVar.c();
        mf4.c cVar = mf4.c.f407682a;
        if (mf4.c.f407685d > 0) {
            cVar.a();
        }
        setResult(i17);
        finish();
    }

    @Override // ze4.h
    public void Y0() {
        T6(-1);
    }

    @Override // ze4.h
    public void c2() {
        T6(-1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f253398f;
        boolean z17 = false;
        if (c18497x85806502 != null && c18497x85806502.c()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        T6(-1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.widget.RelativeLayout relativeLayout;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryBrowseUI", "StoryBrowseUI create " + this);
        mo2550x7c2abd06(1);
        m78497xc03943d(true);
        super.onCreate(bundle);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        mf4.c.f407685d = java.lang.System.currentTimeMillis();
        mf4.b bVar = mf4.b.f407675a;
        mf4.b.f407678d = java.lang.System.currentTimeMillis();
        m78583x85ccfe01(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
        ai3.d.f86640a = true;
        android.widget.RelativeLayout relativeLayout2 = new android.widget.RelativeLayout(mo55332x76847179());
        relativeLayout2.setBackgroundColor(0);
        android.widget.ImageView imageView = new android.widget.ImageView(mo55332x76847179());
        imageView.setBackgroundColor(-16777216);
        this.f253399g = imageView;
        this.f253397e = getIntent().getIntExtra("h_position", 0);
        this.f253396d = getIntent().getIntExtra("v_position", 0);
        java.lang.String stringExtra = getIntent().getStringExtra(dm.i4.f66875xa013b0d5);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = getIntent().getStringArrayListExtra("user_list");
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("user_date_list");
        boolean booleanExtra = getIntent().getBooleanExtra("delete_when_first_empty", false);
        long longExtra = getIntent().getLongExtra("data_seed_key", 0L);
        mf4.d dVar = mf4.d.f407693a;
        java.lang.String str = mf4.d.f407696d.f142467t;
        getIntent().getBooleanExtra("gallery_story_need_action", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryBrowseUI", "vPosition " + this.f253396d);
        dVar.g();
        mf4.d.f407696d.f142451d = (long) com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(mo55332x76847179());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6936x5d31fefc c6936x5d31fefc = mf4.d.f407696d;
        c6936x5d31fefc.f142459l = 0L;
        c6936x5d31fefc.f142461n = 0L;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (ze4.l.f553334b == null) {
            ze4.l.f553334b = new ze4.l();
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((java.util.HashMap) ze4.l.f553334b.f553335a).remove(java.lang.Long.valueOf(longExtra)));
        h0Var2.f391656d = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(stringExtra, ef4.w.f334001t.e())) {
            relativeLayout = relativeLayout2;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(stringExtra, ef4.w.f334001t.e())) {
                this.f253398f = new com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502(this, ze4.k.SingleGallery, 0, false, null, 28, null);
                h0Var2.f391656d = stringExtra;
            } else if (h0Var.f391656d != null) {
                this.f253398f = new com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502(this, ze4.k.MultiUserGallery, 0, false, null, 28, null);
                h0Var2.f391656d = new java.util.ArrayList((java.util.Collection) h0Var.f391656d);
            }
        } else if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            relativeLayout = relativeLayout2;
            this.f253398f = new com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502(this, ze4.k.SelfGallery, 0, false, null, 28, null);
            h0Var2.f391656d = stringExtra;
        } else {
            relativeLayout = relativeLayout2;
            this.f253398f = new com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502(this, ze4.k.HistoryGallery, 0, false, null, 28, null);
            h0Var2.f391656d = stringArrayListExtra;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f253398f;
        if (c18497x85806502 != null) {
            c18497x85806502.w();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x858065022 = this.f253398f;
        if (c18497x858065022 != null) {
            c18497x858065022.m71525x4888ad64(booleanExtra);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x858065023 = this.f253398f;
        if (c18497x858065023 != null) {
            c18497x858065023.m71529x7ffb700f(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x858065024 = this.f253398f;
        if (c18497x858065024 != null) {
            c18497x858065024.mo71376xe134ebbd(h0Var2.f391656d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x858065025 = this.f253398f;
        if (c18497x858065025 != null) {
            c18497x858065025.mo71377x34531945(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x858065026 = this.f253398f;
        if (c18497x858065026 != null) {
            c18497x858065026.mo71375xee372832(this.f253396d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x858065027 = this.f253398f;
        if (c18497x858065027 != null) {
            c18497x858065027.m71523x57580408(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x858065028 = this.f253398f;
        if (c18497x858065028 != null) {
            c18497x858065028.m71527x9bfee16e(new of4.c(this));
        }
        android.widget.RelativeLayout relativeLayout3 = relativeLayout;
        relativeLayout3.addView(this.f253399g, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x858065029 = this.f253398f;
        if (c18497x858065029 != null) {
            relativeLayout3.addView(c18497x858065029, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
        setContentView(relativeLayout3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x8580650210 = this.f253398f;
        if (c18497x8580650210 != null) {
            c18497x8580650210.post(new of4.d(this, h0Var, stringExtra, h0Var2));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryBrowseUI", "onDestroy " + this);
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f253398f;
        if (c18497x85806502 != null) {
            c18497x85806502.e();
        }
        mf4.c cVar = mf4.c.f407682a;
        if (mf4.c.f407685d <= 0) {
            return;
        }
        cVar.a();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryBrowseUI", "onPause " + this);
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f253398f;
        if (c18497x85806502 != null) {
            c18497x85806502.h();
        }
        qp1.h0.b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryBrowseUI", "onResume " + this);
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f253398f;
        if (c18497x85806502 != null) {
            c18497x85806502.k();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x858065022 = this.f253398f;
        if (c18497x858065022 != null) {
            c18497x858065022.j();
        }
        qp1.h0.a(true, true, true);
    }
}

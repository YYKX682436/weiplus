package com.p314xaae8f345.mm.ui;

@db5.a(m123858x6ac9171 = 8192)
@gm0.a2
/* renamed from: com.tencent.mm.ui.AlbumUI */
/* loaded from: classes11.dex */
public class ActivityC21339x2c5c4123 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f278084h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21354xd0cc2aa9 f278085d = null;

    /* renamed from: mViewPager */
    private com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d f39293x1c18ee31 = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f278086e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f278087f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f278088g = false;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: dealContentView */
    public void mo47898x2105eeb2(android.view.View view) {
        android.content.res.Resources resources;
        int i17;
        super.mo47898x2105eeb2(view);
        this.f278087f = getIntent().getBooleanExtra("story_only", false);
        this.f278088g = getIntent().getBooleanExtra("story_dot", false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_sns_reset_userpage_md5", "1", false, true), 1) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumUI", "AlbumUI resetMd5");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2 Ej = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej();
            Ej.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = Ej.J0(c01.z1.r());
            J0.f67937x79146e34 = "";
            Ej.u1(J0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        }
        com.p314xaae8f345.mm.ui.C21354xd0cc2aa9 c21354xd0cc2aa9 = (com.p314xaae8f345.mm.ui.C21354xd0cc2aa9) findViewById(com.p314xaae8f345.mm.R.id.f564449rp);
        this.f278085d = c21354xd0cc2aa9;
        if (this.f278087f) {
            c21354xd0cc2aa9.setVisibility(8);
        } else {
            c21354xd0cc2aa9.m78374x60ecd038(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571514hd));
            boolean g17 = bi4.v1.g();
            if (g17) {
                resources = getResources();
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f571515he;
            } else {
                resources = getResources();
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f571516hf;
            }
            this.f278085d.m78377x66145130(resources.getString(i17));
            if (g17) {
                com.p314xaae8f345.mm.ui.q qVar = new com.p314xaae8f345.mm.ui.q(this.f278085d, "textstate_history");
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().k(qVar);
            }
            if (g17) {
                mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.ui.m(this));
                mo74408xb0dfae51(false);
            }
            this.f278085d.m78376x97cfa8c8(new com.p314xaae8f345.mm.ui.n(this));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d) findViewById(com.p314xaae8f345.mm.R.id.f564457rz);
        this.f39293x1c18ee31 = c21470xb673f8d;
        c21470xb673f8d.mo79170x2d3430b4(new com.p314xaae8f345.mm.ui.o(this));
        this.f39293x1c18ee31.mo79164x6cab2c8d(new com.p314xaae8f345.mm.ui.p(this, mo7595x9cdc264()));
        if (!this.f278087f && getIntent().getBooleanExtra("status_default", false)) {
            this.f278085d.m78380x684367d(1);
            this.f39293x1c18ee31.m80844x940d026a(1);
        }
        mf4.d dVar = mf4.d.f407693a;
        mf4.d.f407694b.f142449d = 3L;
        dVar.b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bxr;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.ui.bk.u0(this);
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsMMKV").G("SnsMMKVSnsUI", true);
        setRequestedOrientation(1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        cc4.a.f122014a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_group_dynamic_label_enable, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelRangeConfig", "updateNewLabelRangeControl enableNewGroupUI:" + cc4.a.f122014a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SnsUserUI)).Rj(this, iy1.a.Album);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsMMKV").G("SnsMMKVSnsUI", false);
        super.onDestroy();
    }
}

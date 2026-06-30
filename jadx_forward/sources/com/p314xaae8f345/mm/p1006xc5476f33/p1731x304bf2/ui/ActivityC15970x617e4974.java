package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.game.ui.GameGalleryUI */
/* loaded from: classes8.dex */
public class ActivityC15970x617e4974 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f222378d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce f222379e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f222380f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f222381g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f222382h = 0;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570683bg5;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78531x8f8cf1fb();
        this.f222378d = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById(com.p314xaae8f345.mm.R.id.gl_);
        this.f222379e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce) findViewById(com.p314xaae8f345.mm.R.id.gld);
        java.lang.String[] stringArrayExtra = getIntent().getStringArrayExtra("URLS");
        if (stringArrayExtra == null) {
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("CURRENT", 0);
        if (intExtra < 0 || intExtra >= stringArrayExtra.length) {
            intExtra = 0;
        }
        this.f222380f = getIntent().getStringExtra("REPORT_APPID");
        this.f222381g = getIntent().getIntExtra("REPORT_SCENE", -1);
        this.f222382h = getIntent().getIntExtra("SOURCE_SCENE", 0);
        this.f222378d.m8315x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p3(this, stringArrayExtra));
        this.f222378d.m8322x2d3430b4(this);
        this.f222378d.m8317x940d026a(intExtra, false);
        this.f222379e.m78920x1b70d27a(true);
        this.f222379e.m78919xc4325fc8(stringArrayExtra.length);
        this.f222379e.m78922x7d600aec(intExtra);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
        if (intExtra == 0) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(this, this.f222381g, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14505x521c8f47, 1, 12, this.f222380f, this.f222382h, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        this.f222379e.m78922x7d600aec(i17);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(this, this.f222381g, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14505x521c8f47, i17 + 1, 12, this.f222380f, this.f222382h, null);
    }
}

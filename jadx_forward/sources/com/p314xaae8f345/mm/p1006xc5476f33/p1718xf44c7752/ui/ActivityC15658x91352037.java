package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI */
/* loaded from: classes10.dex */
public class ActivityC15658x91352037 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements t23.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f220149d = new java.util.ArrayList(10);

    /* renamed from: e, reason: collision with root package name */
    public e33.k5 f220150e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f220151f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 f220152g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f220153h;

    public static java.lang.String T6(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15658x91352037 activityC15658x91352037) {
        activityC15658x91352037.getClass();
        return t23.p0.k().f496831g == 1 ? activityC15658x91352037.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fi_) : t23.p0.k().f496831g == 3 ? activityC15658x91352037.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fia) : activityC15658x91352037.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fib);
    }

    @Override // t23.k1
    public void F6(java.util.LinkedList linkedList) {
        t23.p0.n().c(new e33.j5(this, linkedList));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cjs;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        t23.p0.k().f496825a.remove(this);
        t23.p0.k().f496825a.add(this);
        t23.p0.k().d();
        this.f220151f = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.f566563ga5);
        this.f220150e = new e33.k5(this, this);
        this.f220151f.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        this.f220151f.mo7960x6cab2c8d(this.f220150e);
        this.f220153h = getIntent().getStringExtra("select_folder_name");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183("", 0);
        this.f220152g = c15630x7d8d0183;
        c15630x7d8d0183.f219953i = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b();
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571943u7);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        mo54450xbf7c1df6(string != null ? string : "");
        mo54448x9c8c0d33(new e33.i5(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        t23.p0.k().f496825a.remove(this);
    }
}

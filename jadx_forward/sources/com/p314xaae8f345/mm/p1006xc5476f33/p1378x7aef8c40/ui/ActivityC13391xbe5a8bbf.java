package com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/StickerPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.StickerPreviewUI */
/* loaded from: classes10.dex */
public final class ActivityC13391xbe5a8bbf extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f180170g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f180171d = "MicroMsg.StickerPreviewUI";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f180172e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 f180173f;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(-1, com.p314xaae8f345.mm.R.C30854x2dc211.f559259n);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cvx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559258m, -1);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(134217728);
        }
        mo64405x4dab7448(0);
        m78609x92231eec(getDrawable(com.p314xaae8f345.mm.R.raw.f78359x490ff0ab));
        vj5.o.e(getWindow());
        mo54448x9c8c0d33(new y22.x(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.jk9);
        this.f180172e = getIntent().getStringExtra("sticker_url");
        di3.w.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e79130 = (com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130) findViewById(com.p314xaae8f345.mm.R.id.nip);
        this.f180173f = c13407x91e79130;
        java.lang.String str = this.f180172e;
        if (str != null && c13407x91e79130 != null) {
            c13407x91e79130.m54967xd52464f4(str);
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.h(this, "android.permission.CAMERA")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e791302 = this.f180173f;
            if (c13407x91e791302 != null) {
                at0.n.i(c13407x91e791302.D, c13407x91e791302.I, null, null, 6, null);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f180171d, "initOnCreateAfterConnected: no permission");
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Zi(1001, new y22.w(this), "android.permission.CAMERA");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e79130 = this.f180173f;
        if (c13407x91e79130 != null) {
            u85.i.f507240a.f(c13407x91e79130.K);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e79130 = this.f180173f;
        if (c13407x91e79130 != null) {
            c13407x91e79130.D.k();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e79130 = this.f180173f;
        if (c13407x91e79130 != null) {
            at0.n.i(c13407x91e79130.D, c13407x91e79130.I, null, null, 6, null);
        }
    }
}

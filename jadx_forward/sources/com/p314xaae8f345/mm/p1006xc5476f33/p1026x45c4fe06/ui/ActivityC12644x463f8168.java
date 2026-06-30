package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lzj1/a;", "<init>", "()V", "com/tencent/mm/plugin/appbrand/ui/c5", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI */
/* loaded from: classes7.dex */
public final class ActivityC12644x463f8168 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements zj1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c5 f170888f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c5(null);

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1203xac1f0fa0.AbstractC12715x4f1a932 f170889d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f170890e;

    @Override // zj1.a
    public void H3(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1203xac1f0fa0.AbstractC12715x4f1a932 abstractC12715x4f1a932 = this.f170889d;
        if (abstractC12715x4f1a932 != null) {
            abstractC12715x4f1a932.H3(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (isFinishing()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1203xac1f0fa0.AbstractC12715x4f1a932 c12724xc3b806da;
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        overridePendingTransition(0, 0);
        if (((db5.f.e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12644x463f8168.class) & 2) == 0) && !com.p314xaae8f345.mm.ui.bk.v0()) {
            overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292611a, com.p314xaae8f345.mm.ui.uc.f292612b);
        }
        this.f170890e = getIntent().getBooleanExtra("extra_is_from_widget", false);
        int intExtra = getIntent().getIntExtra("KEY_MODE", 0);
        if (intExtra == 1) {
            c12724xc3b806da = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12724xc3b806da(this);
        } else {
            if (intExtra != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLauncherFolderUI", "onCreate with invalid mode(" + intExtra + ')');
                finish();
                mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
                m78513xc2a54588().setBackgroundColor(mo78508x85b50c3c());
                mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d5(this));
                m78588xfb5745ae(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e5(this));
                p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = mo273xed6858b4();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1203xac1f0fa0.AbstractC12715x4f1a932 abstractC12715x4f1a932 = this.f170889d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC12715x4f1a932);
                mo273xed6858b4.a(abstractC12715x4f1a932);
            }
            c12724xc3b806da = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12712x29aa1534(this);
        }
        this.f170889d = c12724xc3b806da;
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        m78513xc2a54588().setBackgroundColor(mo78508x85b50c3c());
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d5(this));
        m78588xfb5745ae(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e5(this));
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b42 = mo273xed6858b4();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1203xac1f0fa0.AbstractC12715x4f1a932 abstractC12715x4f1a9322 = this.f170889d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC12715x4f1a9322);
        mo273xed6858b42.a(abstractC12715x4f1a9322);
    }
}

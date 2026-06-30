package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/webview/luggage/ipc/GaussianBlurProxyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "sw4/b", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI */
/* loaded from: classes3.dex */
public final class ActivityC19268x2f81ee00 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f263762d = 0;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.bk.k0(getWindow());
        if (getIntent() == null) {
            finish();
            return;
        }
        if (getIntent().getBooleanExtra("key_gaussian_ui_blurmask", true)) {
            android.os.Bundle extras = getIntent().getExtras();
            android.os.IBinder binder = extras != null ? extras.getBinder("key_gaussian_ui_scrrenshot") : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.p0 p0Var = binder instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.p0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.p0) binder : null;
            android.graphics.Bitmap bitmap = p0Var != null ? p0Var.f266854d : null;
            if (bitmap == null) {
                getWindow().getDecorView().setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77910xe61cad91));
            } else {
                um5.d dVar = new um5.d();
                dVar.f510677e.f510726b.b().d(1.0f);
                dVar.b(bitmap);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                dVar.f510674b = width;
                dVar.f510675c = height;
                dVar.a(new sw4.d(this, bitmap));
            }
        } else {
            getWindow().getDecorView().setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77910xe61cad91));
        }
        getWindow().getDecorView().post(new sw4.c(this));
    }
}

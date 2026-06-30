package com.tencent.mm.plugin.appbrand.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lot0/f3;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class AppBrandVideoPreviewUI extends com.tencent.mm.ui.MMActivity implements ot0.f3 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f89470e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView f89471f;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Bundle f89474i;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar f89482t;

    /* renamed from: u, reason: collision with root package name */
    public int f89483u;

    /* renamed from: v, reason: collision with root package name */
    public int f89484v;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f89469d = "MicroMsg.AppBrandVideoPreviewUI";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f89472g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Integer f89473h = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Integer f89475m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f89476n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f89477o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f89478p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Long f89479q = -1L;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f89480r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f89481s = "";

    @Override // ot0.f3
    public boolean G3() {
        return false;
    }

    @Override // ot0.f3
    public boolean I6() {
        return true;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 e3Var) {
        com.tencent.mars.xlog.Log.i(this.f89469d, "hy: fail do job: %s", e3Var);
    }

    public final void T6(int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(com.tencent.mm.storage.z3.R4(this.f89480r) ? 2 : 1);
        objArr[1] = this.f89478p;
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = 1;
        g0Var.d(17608, objArr);
    }

    @Override // ot0.f3
    public void f2(ot0.e3 e3Var) {
        com.tencent.mars.xlog.Log.i(this.f89469d, "hy: requestExitSelectedMode do job: %s", e3Var);
        if (e3Var == ot0.e3.trans) {
            T6(4);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488115hk;
    }

    @Override // ot0.f3
    public void k6(ot0.e3 e3Var) {
        com.tencent.mars.xlog.Log.i(this.f89469d, "hy: doInBackground do job: %s", e3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0188  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f89471f;
        if (appBrandVideoView != null) {
            appBrandVideoView.o("onUIDestroy", new java.lang.Object[0]);
            appBrandVideoView.f();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f89471f;
        if (appBrandVideoView != null) {
            appBrandVideoView.f83529f.e();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f89471f;
        if (appBrandVideoView != null) {
            appBrandVideoView.r();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean onSwipeBackFinish() {
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    @Override // ot0.f3
    public boolean u1() {
        return false;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
    }
}

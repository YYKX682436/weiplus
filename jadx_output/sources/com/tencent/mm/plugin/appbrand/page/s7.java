package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class s7 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f87082d;

    public s7(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f87082d = n7Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f87082d;
        n7Var.T1 = false;
        android.app.Activity v17 = n7Var.v1();
        if (v17 != null && v17.getWindow() != null) {
            if ((n7Var.W1 & 1024) != 1024) {
                v17.getWindow().clearFlags(1024);
            }
            n7Var.getClass();
            android.view.View decorView = v17.getWindow().getDecorView();
            int i17 = n7Var.V1;
            if (i17 >= 0) {
                decorView.setSystemUiVisibility(i17);
            }
        }
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskView appBrandTaskView = n7Var.S1;
        int i18 = n7Var.U1;
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer appBrandTaskContainer = (com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer) appBrandTaskView;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "close appId:%s, reason:%d", appBrandTaskContainer.f91898u, java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.appbrand.report.v0.e(appBrandTaskContainer.f91898u, appBrandTaskContainer.f91899v, 64, appBrandTaskContainer.f91897t, com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
        com.tencent.mm.plugin.appbrand.widget.recent.e1.a(appBrandTaskContainer.f91898u, appBrandTaskContainer.f91897t, 7, "" + (java.lang.System.currentTimeMillis() - appBrandTaskContainer.f91900w), "" + i18, "");
    }
}

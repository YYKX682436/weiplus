package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes14.dex */
public class ec implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.gc f89691d;

    public ec(com.tencent.mm.plugin.appbrand.ui.gc gcVar) {
        this.f89691d = gcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI = this.f89691d.f89744b;
        boolean z17 = com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI.f89491h;
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showNeedDownloadConfirmDialog, finishing[%b] destroyed[%b]", java.lang.Boolean.valueOf(appBrandXWebDownloadProxyUI.isFinishing()), java.lang.Boolean.valueOf(appBrandXWebDownloadProxyUI.activityHasDestroyed()));
        if (appBrandXWebDownloadProxyUI.isFinishing() || appBrandXWebDownloadProxyUI.activityHasDestroyed()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.ui.cc ccVar = new com.tencent.mm.plugin.appbrand.ui.cc(appBrandXWebDownloadProxyUI);
        if (com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d) {
            ccVar.onClick(null, 0);
            return;
        }
        com.tencent.mm.plugin.appbrand.ui.dc dcVar = new com.tencent.mm.plugin.appbrand.ui.dc(appBrandXWebDownloadProxyUI);
        androidx.appcompat.app.AppCompatActivity context = appBrandXWebDownloadProxyUI.getContext();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211729s = appBrandXWebDownloadProxyUI.getContext().getString(com.tencent.mm.R.string.f490344sd);
        aVar.A = false;
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.f490343sc);
        aVar.E = ccVar;
        aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.f490342sb);
        aVar.F = dcVar;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(366L, 1L, 1L, false);
    }
}

package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes13.dex */
public class cc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI f89637d;

    public cc(com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI) {
        this.f89637d = appBrandXWebDownloadProxyUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(366L, 2L, 1L, false);
        com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI = this.f89637d;
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showNeedDownloadConfirmDialog, onClick, finishing[%b] destroyed[%b]", java.lang.Boolean.valueOf(appBrandXWebDownloadProxyUI.isFinishing()), java.lang.Boolean.valueOf(appBrandXWebDownloadProxyUI.activityHasDestroyed()));
        if (appBrandXWebDownloadProxyUI.isFinishing() || appBrandXWebDownloadProxyUI.activityHasDestroyed()) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(appBrandXWebDownloadProxyUI.getContext(), appBrandXWebDownloadProxyUI.getContext().getString(com.tencent.mm.R.string.f490573yv), appBrandXWebDownloadProxyUI.getContext().getString(com.tencent.mm.R.string.f490345se), true, true, null);
        appBrandXWebDownloadProxyUI.f89493e = Q;
        Q.setOnCancelListener(new com.tencent.mm.plugin.appbrand.ui.bc(this));
        by5.c4.f("XWebUpdater", "tryStartDownload, start check runtime update");
        ((zx5.i0) zx5.n0.f477252a).e(org.xwalk.core.XWalkEnvironment.f347970c, null);
        android.os.Handler handler = new android.os.Handler();
        appBrandXWebDownloadProxyUI.f89494f = handler;
        com.tencent.mm.plugin.appbrand.ui.zb zbVar = new com.tencent.mm.plugin.appbrand.ui.zb(appBrandXWebDownloadProxyUI);
        appBrandXWebDownloadProxyUI.f89495g = zbVar;
        handler.postDelayed(zbVar, 20000L);
    }
}

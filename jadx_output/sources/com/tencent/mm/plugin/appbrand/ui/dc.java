package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public class dc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI f89671d;

    public dc(com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI) {
        this.f89671d = appBrandXWebDownloadProxyUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(366L, 3L, 1L, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showNeedDownloadConfirmDialog, user canceled download");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI = this.f89671d;
        appBrandXWebDownloadProxyUI.setResult(2, intent);
        appBrandXWebDownloadProxyUI.finish();
    }
}

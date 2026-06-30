package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public class ac implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI f89509d;

    public ac(com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI) {
        this.f89509d = appBrandXWebDownloadProxyUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showLoading, user canceled download");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI = this.f89509d;
        appBrandXWebDownloadProxyUI.setResult(2, intent);
        appBrandXWebDownloadProxyUI.finish();
    }
}

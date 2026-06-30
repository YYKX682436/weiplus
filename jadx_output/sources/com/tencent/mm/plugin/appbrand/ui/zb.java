package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes13.dex */
public class zb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI f90372d;

    public zb(com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI) {
        this.f90372d = appBrandXWebDownloadProxyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI.f89491h = true;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI = this.f90372d;
        appBrandXWebDownloadProxyUI.setResult(0, intent);
        appBrandXWebDownloadProxyUI.finish();
    }
}

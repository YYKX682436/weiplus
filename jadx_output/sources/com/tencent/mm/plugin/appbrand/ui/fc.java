package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes13.dex */
public class fc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f89715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.gc f89716e;

    public fc(com.tencent.mm.plugin.appbrand.ui.gc gcVar, int i17) {
        this.f89716e = gcVar;
        this.f89715d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI = this.f89716e.f89744b;
        appBrandXWebDownloadProxyUI.f89493e.setMessage(appBrandXWebDownloadProxyUI.getContext().getString(com.tencent.mm.R.string.f490346sf, java.lang.String.valueOf(this.f89715d)));
    }
}

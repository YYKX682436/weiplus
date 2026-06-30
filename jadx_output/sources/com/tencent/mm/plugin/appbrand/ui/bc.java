package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes13.dex */
public class bc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.cc f89611d;

    public bc(com.tencent.mm.plugin.appbrand.ui.cc ccVar) {
        this.f89611d = ccVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showNeedDownloadConfirmDialog, downloading canceled");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.appbrand.ui.cc ccVar = this.f89611d;
        ccVar.f89637d.setResult(2, intent);
        ccVar.f89637d.finish();
    }
}

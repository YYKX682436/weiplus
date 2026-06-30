package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes13.dex */
public class bc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.cc f171144d;

    public bc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.cc ccVar) {
        this.f171144d = ccVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showNeedDownloadConfirmDialog, downloading canceled");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.cc ccVar = this.f171144d;
        ccVar.f171170d.setResult(2, intent);
        ccVar.f171170d.finish();
    }
}

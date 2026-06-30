package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes5.dex */
public class ac implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 f171042d;

    public ac(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 activityC12695x889c9c98) {
        this.f171042d = activityC12695x889c9c98;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showLoading, user canceled download");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 activityC12695x889c9c98 = this.f171042d;
        activityC12695x889c9c98.setResult(2, intent);
        activityC12695x889c9c98.finish();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes5.dex */
public class dc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 f171204d;

    public dc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 activityC12695x889c9c98) {
        this.f171204d = activityC12695x889c9c98;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(366L, 3L, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showNeedDownloadConfirmDialog, user canceled download");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 activityC12695x889c9c98 = this.f171204d;
        activityC12695x889c9c98.setResult(2, intent);
        activityC12695x889c9c98.finish();
    }
}

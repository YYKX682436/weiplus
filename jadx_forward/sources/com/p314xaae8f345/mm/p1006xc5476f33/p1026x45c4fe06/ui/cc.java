package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes13.dex */
public class cc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 f171170d;

    public cc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 activityC12695x889c9c98) {
        this.f171170d = activityC12695x889c9c98;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(366L, 2L, 1L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 activityC12695x889c9c98 = this.f171170d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showNeedDownloadConfirmDialog, onClick, finishing[%b] destroyed[%b]", java.lang.Boolean.valueOf(activityC12695x889c9c98.isFinishing()), java.lang.Boolean.valueOf(activityC12695x889c9c98.m78477x9d1e994e()));
        if (activityC12695x889c9c98.isFinishing() || activityC12695x889c9c98.m78477x9d1e994e()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC12695x889c9c98.mo55332x76847179(), activityC12695x889c9c98.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC12695x889c9c98.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571878se), true, true, null);
        activityC12695x889c9c98.f171026e = Q;
        Q.setOnCancelListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.bc(this));
        by5.c4.f("XWebUpdater", "tryStartDownload, start check runtime update");
        ((zx5.i0) zx5.n0.f558785a).e(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c, null);
        android.os.Handler handler = new android.os.Handler();
        activityC12695x889c9c98.f171027f = handler;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zb zbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zb(activityC12695x889c9c98);
        activityC12695x889c9c98.f171028g = zbVar;
        handler.postDelayed(zbVar, 20000L);
    }
}

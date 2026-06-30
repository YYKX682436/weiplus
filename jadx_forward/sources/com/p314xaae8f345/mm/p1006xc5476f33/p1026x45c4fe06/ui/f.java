package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g f171226d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g gVar) {
        this.f171226d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g gVar = this.f171226d;
        if (gVar.getParent() instanceof android.view.ViewGroup) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdLoadingSplash", "remove AdLoadingSplash");
            gVar.setVisibility(8);
            ((android.view.ViewGroup) gVar.getParent()).removeView(gVar);
            gVar.f171250d.f156344t = null;
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class jh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh f228594d;

    public jh(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh nhVar) {
        this.f228594d = nhVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh nhVar = this.f228594d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = nhVar.f228775a;
        activityC16384xb66222dd.f227949n2 = 10;
        activityC16384xb66222dd.K.setText(activityC16384xb66222dd.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.goa, java.lang.Integer.valueOf(nhVar.f228775a.f227949n2)));
        nhVar.f228775a.K.setVisibility(0);
        nhVar.f228775a.F2.c(1000L, 1000L);
    }
}

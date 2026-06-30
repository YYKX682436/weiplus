package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class g9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h9 f171269d;

    public g9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h9 h9Var) {
        this.f171269d = h9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide, hide ends && remove splash");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h9 h9Var = this.f171269d;
        h9Var.f171290f.f171342d.setVisibility(8);
        ((android.view.ViewGroup) h9Var.f171289e).removeView(h9Var.f171290f.f171342d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9.K(h9Var.f171290f.f171342d);
    }
}

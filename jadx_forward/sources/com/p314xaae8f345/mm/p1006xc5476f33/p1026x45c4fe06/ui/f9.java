package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class f9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewParent f171242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 f171243e;

    public f9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 c9Var, android.view.ViewParent viewParent) {
        this.f171243e = c9Var;
        this.f171242d = viewParent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide, remove splash");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 c9Var = this.f171243e;
        c9Var.setVisibility(8);
        ((android.view.ViewGroup) this.f171242d).removeView(c9Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9.K(c9Var);
    }
}

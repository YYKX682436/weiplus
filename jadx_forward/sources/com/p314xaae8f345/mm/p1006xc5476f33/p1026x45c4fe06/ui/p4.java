package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.q4 f171450d;

    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.q4 q4Var) {
        this.f171450d = q4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "animateHide, remove splash");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.q4 q4Var = this.f171450d;
        q4Var.f171483e.f171511e.setVisibility(8);
        ((android.view.ViewGroup) q4Var.f171482d).removeView(q4Var.f171483e.f171511e);
        yz5.a aVar = q4Var.f171483e.f171510d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}

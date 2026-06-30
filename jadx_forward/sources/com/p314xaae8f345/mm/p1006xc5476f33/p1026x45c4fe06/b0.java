package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean[] f158283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f158284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View[] f158285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long[] f158286g;

    public b0(java.lang.Boolean[] boolArr, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, android.view.View[] viewArr, java.lang.Long[] lArr) {
        this.f158283d = boolArr;
        this.f158284e = n7Var;
        this.f158285f = viewArr;
        this.f158286g = lArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f158283d[0].booleanValue()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c0 c0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c0.f158557a;
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c0.f158558b.pollFirst();
        if (progressBar == null) {
            progressBar = c0Var.a();
        }
        int b17 = a06.d.b(progressBar.getContext().getResources().getDisplayMetrics().density * 36);
        progressBar.setLayoutParams(new android.view.ViewGroup.LayoutParams(b17, b17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f158284e;
        android.view.View[] viewArr = this.f158285f;
        java.lang.Long[] lArr = this.f158286g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEntryPageFastLoadHelper", "tryFastLoadEntryPage, show promptView, appId[" + n7Var.mo32091x9a3f0ba2().f156336n + "] " + n7Var);
        viewArr[0] = progressBar;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        lArr[0] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        n7Var.P1().e(progressBar, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        n7Var.mo32091x9a3f0ba2().H0();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean[] f173965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long[] f173966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f173967f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View[] f173968g;

    public z(java.lang.Boolean[] boolArr, java.lang.Long[] lArr, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, android.view.View[] viewArr) {
        this.f173965d = boolArr;
        this.f173966e = lArr;
        this.f173967f = n7Var;
        this.f173968g = viewArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f173965d[0] = java.lang.Boolean.TRUE;
        if (this.f173966e[0].longValue() > 0) {
            long longValue = this.f173966e[0].longValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryFastLoadEntryPage, onReady called with promptView shown, appId[");
            sb6.append(this.f173967f.mo32091x9a3f0ba2().f156336n);
            sb6.append("], time diff: ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - longValue);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEntryPageFastLoadHelper", sb6.toString());
        }
        android.view.View view = this.f173968g[0];
        if (view != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.c(view);
            android.widget.ProgressBar progressBar = view instanceof android.widget.ProgressBar ? (android.widget.ProgressBar) view : null;
            if (progressBar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c0.f158558b.add(progressBar);
            }
        }
    }
}

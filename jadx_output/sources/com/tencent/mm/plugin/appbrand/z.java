package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean[] f92432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long[] f92433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f92434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View[] f92435g;

    public z(java.lang.Boolean[] boolArr, java.lang.Long[] lArr, com.tencent.mm.plugin.appbrand.page.n7 n7Var, android.view.View[] viewArr) {
        this.f92432d = boolArr;
        this.f92433e = lArr;
        this.f92434f = n7Var;
        this.f92435g = viewArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f92432d[0] = java.lang.Boolean.TRUE;
        if (this.f92433e[0].longValue() > 0) {
            long longValue = this.f92433e[0].longValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryFastLoadEntryPage, onReady called with promptView shown, appId[");
            sb6.append(this.f92434f.getRuntime().f74803n);
            sb6.append("], time diff: ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - longValue);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEntryPageFastLoadHelper", sb6.toString());
        }
        android.view.View view = this.f92435g[0];
        if (view != null) {
            com.tencent.mm.plugin.appbrand.ui.u5.c(view);
            android.widget.ProgressBar progressBar = view instanceof android.widget.ProgressBar ? (android.widget.ProgressBar) view : null;
            if (progressBar != null) {
                com.tencent.mm.plugin.appbrand.c0.f77025b.add(progressBar);
            }
        }
    }
}

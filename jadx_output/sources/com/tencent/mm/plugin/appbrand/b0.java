package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean[] f76750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f76751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View[] f76752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long[] f76753g;

    public b0(java.lang.Boolean[] boolArr, com.tencent.mm.plugin.appbrand.page.n7 n7Var, android.view.View[] viewArr, java.lang.Long[] lArr) {
        this.f76750d = boolArr;
        this.f76751e = n7Var;
        this.f76752f = viewArr;
        this.f76753g = lArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f76750d[0].booleanValue()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.c0 c0Var = com.tencent.mm.plugin.appbrand.c0.f77024a;
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) com.tencent.mm.plugin.appbrand.c0.f77025b.pollFirst();
        if (progressBar == null) {
            progressBar = c0Var.a();
        }
        int b17 = a06.d.b(progressBar.getContext().getResources().getDisplayMetrics().density * 36);
        progressBar.setLayoutParams(new android.view.ViewGroup.LayoutParams(b17, b17));
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f76751e;
        android.view.View[] viewArr = this.f76752f;
        java.lang.Long[] lArr = this.f76753g;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEntryPageFastLoadHelper", "tryFastLoadEntryPage, show promptView, appId[" + n7Var.getRuntime().f74803n + "] " + n7Var);
        viewArr[0] = progressBar;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        lArr[0] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        n7Var.P1().e(progressBar, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        n7Var.getRuntime().H0();
    }
}

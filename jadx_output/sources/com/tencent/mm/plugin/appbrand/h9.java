package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class h9 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f78269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f78271c;

    public h9(com.tencent.mm.plugin.appbrand.e9 e9Var, long j17, java.lang.String str) {
        this.f78271c = e9Var;
        this.f78269a = j17;
        this.f78270b = str;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f78269a;
        java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis - j17);
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78271c;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandService", "injectConfig end by evaluateJavascript, cost=%dms, hash=%d", valueOf, java.lang.Integer.valueOf(e9Var.getComponentId()));
        com.tencent.mm.plugin.appbrand.k9 k9Var = new com.tencent.mm.plugin.appbrand.k9(null);
        e9Var.f77998J = k9Var;
        k9Var.f84070a = this.f78270b;
        k9Var.f84071b = j17;
        k9Var.f84072c = currentTimeMillis;
        k9Var.f84073d = null;
    }
}

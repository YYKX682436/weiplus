package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class j9 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f78474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f78475b;

    public j9(com.tencent.mm.plugin.appbrand.e9 e9Var, long j17) {
        this.f78475b = e9Var;
        this.f78474a = j17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        boolean parseBoolean = java.lang.Boolean.parseBoolean((java.lang.String) obj);
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78475b;
        if (parseBoolean) {
            com.tencent.mm.plugin.appbrand.k9 k9Var = e9Var.f77998J;
            k9Var.f84071b = this.f78474a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            k9Var.f84072c = java.lang.System.currentTimeMillis();
            e9Var.f77998J.f84073d = null;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(parseBoolean);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(e9Var.getComponentId());
        com.tencent.mm.plugin.appbrand.k9 k9Var2 = e9Var.f77998J;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandService", "notifyWxConfigReadyIfNeed end by evaluateJavascript, applied=%b, hash=%d, reportWxConfigInjectEnd cost=%dms", valueOf, valueOf2, java.lang.Long.valueOf(k9Var2.f84072c - k9Var2.f84071b));
        com.tencent.mm.plugin.appbrand.k9 k9Var3 = e9Var.f77998J;
        e9Var.p1(k9Var3.f84070a, k9Var3.f84071b, k9Var3.f84072c, k9Var3.f84073d);
    }
}

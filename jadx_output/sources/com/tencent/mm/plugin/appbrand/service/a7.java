package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class a7 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f88624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.r f88625b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f88626c;

    public a7(com.tencent.mm.plugin.appbrand.service.c0 c0Var, com.tencent.mm.plugin.appbrand.jsruntime.r rVar, long j17) {
        this.f88624a = c0Var;
        this.f88625b = rVar;
        this.f88626c = j17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        int i17 = kotlin.jvm.internal.o.b("ok", str) ? 4 : 6;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("evaluate wxNative.js end. appId:");
        sb6.append(this.f88624a.getAppId());
        sb6.append(", contextId:");
        sb6.append(this.f88625b.o());
        sb6.append(", result:'");
        sb6.append(str);
        sb6.append("', cost:");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f88626c);
        sb6.append("ms");
        com.tencent.stubs.logger.Log.println(i17, "MicroMsg.AppBrand.WXNativeInjector", sb6.toString());
    }
}

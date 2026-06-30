package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class e implements com.tencent.mm.plugin.appbrand.headless.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f78294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.headless.p f78295c;

    public e(int i17, long j17, com.tencent.mm.plugin.appbrand.headless.p pVar) {
        this.f78293a = i17;
        this.f78294b = j17;
        this.f78295c = pVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.headless.p
    public void a(int i17, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onError, requestId:");
        sb6.append(this.f78293a);
        sb6.append(", errCode:");
        sb6.append(l81.u0.f317078a.a(i17));
        sb6.append(", errMsg:");
        sb6.append(str);
        sb6.append(", cost:");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f78294b);
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandHeadlessStartService", sb6.toString());
        com.tencent.mm.plugin.appbrand.headless.p pVar = this.f78295c;
        if (pVar != null) {
            pVar.a(i17, str);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.headless.p
    public void onSuccess(java.lang.String processName) {
        kotlin.jvm.internal.o.g(processName, "processName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSuccess, requestId:");
        sb6.append(this.f78293a);
        sb6.append(", cost:");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f78294b);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHeadlessStartService", sb6.toString());
        com.tencent.mm.plugin.appbrand.headless.p pVar = this.f78295c;
        if (pVar != null) {
            pVar.onSuccess(processName);
        }
    }
}

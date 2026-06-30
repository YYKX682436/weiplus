package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class b implements java.util.function.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs f84507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f84508b;

    public b(com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs appBrandAppConfigParserHelper$AheadRequestArgs, boolean z17) {
        this.f84507a = appBrandAppConfigParserHelper$AheadRequestArgs;
        this.f84508b = z17;
    }

    @Override // java.util.function.Function
    public java.lang.Object apply(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.appbrand.launching.j jVar = com.tencent.mm.plugin.appbrand.launching.j.f84678a;
        com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs appBrandAppConfigParserHelper$AheadRequestArgs = this.f84507a;
        k91.r a17 = jVar.a(new com.tencent.mm.plugin.appbrand.launching.e(appBrandAppConfigParserHelper$AheadRequestArgs.f84328e, appBrandAppConfigParserHelper$AheadRequestArgs.f84329f, this.f84508b, appBrandAppConfigParserHelper$AheadRequestArgs.f84331h));
        if (a17 == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAppConfigParserHelper.AheadParsedConfigsCache", "computeIfAbsent(" + appBrandAppConfigParserHelper$AheadRequestArgs.f84327d + ") offer config cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        return a17;
    }
}

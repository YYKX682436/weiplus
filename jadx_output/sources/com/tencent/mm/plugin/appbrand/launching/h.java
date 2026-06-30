package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs f84633d;

    public h(com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs appBrandAppConfigParserHelper$AheadRequestArgs) {
        this.f84633d = appBrandAppConfigParserHelper$AheadRequestArgs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nf.y yVar;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.appbrand.launching.c.f84530a;
        com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs args = this.f84633d;
        kotlin.jvm.internal.o.g(args, "args");
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(args.f84328e);
        java.lang.String str = (b17 == null || (u07 = b17.u0()) == null) ? null : u07.f47277w;
        java.lang.String str2 = args.f84327d;
        if (!kotlin.jvm.internal.o.b(str, str2) || b17.m0() == null) {
            com.tencent.mm.plugin.appbrand.launching.c.f84530a.computeIfAbsent(str2, new com.tencent.mm.plugin.appbrand.launching.b(args, (args.f84330g || (yVar = nf.x.f336616b) == null) ? false : yVar.isDarkMode()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAppConfigParserHelper.AheadParsedConfigsCache", "computeIfAbsent(" + str2 + ") appConfig provided, skip");
    }
}

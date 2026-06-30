package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/k;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchApi$GetPrefetchResultReq;", "Lcom/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchedResp;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class k implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$GetPrefetchResultReq appBrandCgiPrefetchApi$GetPrefetchResultReq = (com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$GetPrefetchResultReq) obj;
        if (appBrandCgiPrefetchApi$GetPrefetchResultReq != null) {
            com.tencent.mm.plugin.appbrand.launching.u uVar = com.tencent.mm.plugin.appbrand.launching.u.f85203a;
            boolean z17 = appBrandCgiPrefetchApi$GetPrefetchResultReq.f84334f;
            int i17 = appBrandCgiPrefetchApi$GetPrefetchResultReq.f84333e;
            java.lang.String str = appBrandCgiPrefetchApi$GetPrefetchResultReq.f84332d;
            com.tencent.mm.plugin.appbrand.launching.v a17 = uVar.a(i17, str, z17);
            if (a17 != null) {
                try {
                    long j17 = appBrandCgiPrefetchApi$GetPrefetchResultReq.f84335g;
                    wu5.c cVar = a17.f85242f;
                    return j17 > 0 ? (com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp) cVar.get(j17, java.util.concurrent.TimeUnit.MILLISECONDS) : (com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp) cVar.get();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCgiPrefetchBeforeLaunch", "GetResultTask(instanceId:" + str + ", type:" + i17 + ") await failed " + e17);
                }
            }
        }
        return null;
    }
}

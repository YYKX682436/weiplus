package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/l;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchApi$GetPrefetchResultReq;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class l implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.v a17;
        com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$GetPrefetchResultReq appBrandCgiPrefetchApi$GetPrefetchResultReq = (com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$GetPrefetchResultReq) obj;
        if (appBrandCgiPrefetchApi$GetPrefetchResultReq != null && (a17 = com.tencent.mm.plugin.appbrand.launching.u.f85203a.a(appBrandCgiPrefetchApi$GetPrefetchResultReq.f84333e, appBrandCgiPrefetchApi$GetPrefetchResultReq.f84332d, false)) != null) {
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(a17.f85242f.isDone());
        }
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
    }
}

package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class n {
    public final com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp a(int i17, java.lang.String instanceId, long j17) {
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp appBrandCgiPrefetchedResp = (com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$GetPrefetchResultReq(instanceId, i17, false, j17), com.tencent.mm.plugin.appbrand.launching.k.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("peekPrefetchCgiResult: type=");
        sb6.append(i17);
        sb6.append(" id=");
        sb6.append(instanceId);
        sb6.append(" timeout=");
        sb6.append(j17);
        sb6.append(" resp?=");
        sb6.append(appBrandCgiPrefetchedResp != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCgiPrefetchBeforeLaunch", sb6.toString());
        return appBrandCgiPrefetchedResp;
    }

    public final com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp b(int i17, java.lang.String instanceId) {
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp appBrandCgiPrefetchedResp = (com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$GetPrefetchResultReq(instanceId, i17, true, -1L), com.tencent.mm.plugin.appbrand.launching.k.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pullPrefetchCgiResult: type=");
        sb6.append(i17);
        sb6.append(" id=");
        sb6.append(instanceId);
        sb6.append(" null?=");
        sb6.append(appBrandCgiPrefetchedResp == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCgiPrefetchBeforeLaunch", sb6.toString());
        return appBrandCgiPrefetchedResp;
    }
}

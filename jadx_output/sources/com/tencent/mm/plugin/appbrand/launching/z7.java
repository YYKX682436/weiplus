package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class z7 implements com.tencent.mm.plugin.appbrand.launching.k6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f85472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f85473c;

    public z7(java.lang.String str, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f85471a = str;
        this.f85472b = atomicInteger;
        this.f85473c = atomicReference;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.k6
    public void a(com.tencent.mm.plugin.appbrand.launching.o6 request, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.appbrand.launching.h0 h0Var = com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage.f84357n;
        java.lang.String instanceId = this.f85471a;
        kotlin.jvm.internal.o.f(instanceId, "$instanceId");
        h0Var.a(instanceId, ne1.j.UPDATING, request.f84851d, i17, str);
        this.f85472b.set(i17);
        this.f85473c.set(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.k6
    public void d(com.tencent.mm.plugin.appbrand.launching.o6 request, com.tencent.mm.plugin.appbrand.launching.p6 response) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.appbrand.appcache.IPkgInfo iPkgInfo = response.f84892a;
        kotlin.jvm.internal.o.e(iPkgInfo, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo");
        com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo) iPkgInfo;
        com.tencent.mm.plugin.appbrand.launching.h0 h0Var = com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage.f84357n;
        java.lang.String instanceId = this.f85471a;
        kotlin.jvm.internal.o.f(instanceId, "$instanceId");
        h0Var.a(instanceId, ne1.j.NO_UPDATE, request.f84851d, wxaPluginPkgInfo.version, wxaPluginPkgInfo.stringVersion);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.k6
    public void e(com.tencent.mm.plugin.appbrand.launching.o6 request, com.tencent.mm.plugin.appbrand.launching.p6 response) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.appbrand.appcache.IPkgInfo iPkgInfo = response.f84892a;
        kotlin.jvm.internal.o.e(iPkgInfo, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo");
        com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo) iPkgInfo;
        com.tencent.mm.plugin.appbrand.launching.h0 h0Var = com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage.f84357n;
        java.lang.String instanceId = this.f85471a;
        kotlin.jvm.internal.o.f(instanceId, "$instanceId");
        h0Var.a(instanceId, ne1.j.UPDATE_READY, request.f84851d, wxaPluginPkgInfo.version, wxaPluginPkgInfo.stringVersion);
    }
}

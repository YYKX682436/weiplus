package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class p7 implements com.tencent.mm.plugin.appbrand.launching.w4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f84894a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f84895b;

    public p7(java.lang.String remoteProcessName, java.lang.String appId) {
        kotlin.jvm.internal.o.g(remoteProcessName, "remoteProcessName");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f84894a = remoteProcessName;
        this.f84895b = appId;
    }

    public void b(ne1.j state, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo) {
        kotlin.jvm.internal.o.g(state, "state");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify(appId:");
        sb6.append(this.f84895b);
        sb6.append(", process:");
        java.lang.String str4 = this.f84894a;
        sb6.append(str4);
        sb6.append(", state:");
        sb6.append(state);
        sb6.append(", passThroughInfo:");
        sb6.append(str2);
        sb6.append(", stablePassThroughInfo:");
        sb6.append(str3);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.IPCUpdateStateNotifier", sb6.toString());
        com.tencent.mm.ipcinvoker.f.a(str4, new com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$UpdateStateArgsParcelized(this.f84895b, i17, str, state, str2, str3, wxaPkgWrappingInfo), com.tencent.mm.plugin.appbrand.launching.o7.f84859d, null);
    }
}

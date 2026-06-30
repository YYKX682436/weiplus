package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class da implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.ea f84573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84574e;

    public da(com.tencent.mm.plugin.appbrand.launching.ea eaVar, java.util.List list) {
        this.f84573d = eaVar;
        this.f84574e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f84573d.f84600c;
        if (appBrandRuntime != null) {
            com.tencent.mm.ipcinvoker.extension.l.a(str, new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallArgs(appBrandRuntime, this.f84574e), com.tencent.mm.plugin.appbrand.launching.ba.class, com.tencent.mm.plugin.appbrand.launching.ca.f84551d);
        } else {
            kotlin.jvm.internal.o.o("runtime");
            throw null;
        }
    }
}

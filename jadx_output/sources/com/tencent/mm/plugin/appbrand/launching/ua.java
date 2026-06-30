package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class ua implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.va f85234d;

    public ua(com.tencent.mm.plugin.appbrand.launching.va vaVar) {
        this.f85234d = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.luggage.sdk.launching.h hVar;
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        com.tencent.mm.plugin.appbrand.launching.va vaVar = this.f85234d;
        com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult modularizingPkgRetrieverContract$IPCCallResult = (com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult) com.tencent.mm.ipcinvoker.extension.l.b(str, vaVar.f85280e, com.tencent.mm.plugin.appbrand.launching.sa.class);
        if (modularizingPkgRetrieverContract$IPCCallResult == null || (hVar = vaVar.f85280e.f84466t) == null) {
            return;
        }
        hVar.a(modularizingPkgRetrieverContract$IPCCallResult);
    }
}

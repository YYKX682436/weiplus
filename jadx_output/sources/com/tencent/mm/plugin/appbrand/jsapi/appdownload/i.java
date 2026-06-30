package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
public abstract class i extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    public static final int CTRL_INDEX = 662;
    public static final java.lang.String NAME = "onDownloadAppStateChangeForNative";

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f78958m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Set f78959n = java.util.concurrent.ConcurrentHashMap.newKeySet();

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ipc.l0 f78960i;

    public static void A(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        f78958m.remove(e9Var.getAppId());
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(e9Var.getAppId()), com.tencent.mm.plugin.appbrand.jsapi.appdownload.h.class, null);
    }

    public static void x(com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.plugin.appbrand.jsapi.appdownload.i iVar) {
        f78958m.put(e9Var.getAppId(), iVar);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(e9Var.getAppId()), com.tencent.mm.plugin.appbrand.jsapi.appdownload.g.class, null);
    }

    public static void z(com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState appBrandDownloadState) {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap.KeySetView) f78959n).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.ipc.m0.b((java.lang.String) it.next(), appBrandDownloadState);
        }
    }

    public void y(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f78960i = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.e(this, e9Var);
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(e9Var.getAppId(), this.f78960i);
        e9Var.t3().N.a(new com.tencent.mm.plugin.appbrand.jsapi.appdownload.f(this, e9Var));
    }
}

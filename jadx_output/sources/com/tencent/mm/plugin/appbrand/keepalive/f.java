package com.tencent.mm.plugin.appbrand.keepalive;

/* loaded from: classes7.dex */
public class f implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f84090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.keepalive.j f84091e;

    public f(com.tencent.mm.plugin.appbrand.keepalive.j jVar, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f84091e = jVar;
        this.f84090d = appBrandRuntime;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                com.tencent.mm.plugin.appbrand.keepalive.j jVar = this.f84091e;
                com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f84090d;
                jVar.getClass();
                if (appBrandRuntime.N.d() && com.tencent.mm.plugin.appbrand.x0.d(appBrandRuntime.f74803n) != com.tencent.mm.plugin.appbrand.w0.LAUNCH_MINI_PROGRAM && jVar.f84095d.add(appBrandRuntime)) {
                    java.lang.String a17 = bm5.f1.a();
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeepAliveManager", "keepAlive processName:%s, rt:%s", a17, appBrandRuntime.f74803n);
                    com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(a17), com.tencent.mm.plugin.appbrand.keepalive.h.class, null);
                    return;
                }
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                return;
            }
        }
        com.tencent.mm.plugin.appbrand.keepalive.j jVar2 = this.f84091e;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f84090d;
        if (jVar2.f84095d.remove(appBrandRuntime2)) {
            java.lang.String a18 = bm5.f1.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeepAliveManager", "stopKeepAlive processName:%s, rt:%s", a18, appBrandRuntime2.f74803n);
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(a18), com.tencent.mm.plugin.appbrand.keepalive.i.class, null);
        }
    }
}

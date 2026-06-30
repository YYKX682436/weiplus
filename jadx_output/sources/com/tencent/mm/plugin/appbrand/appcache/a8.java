package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class a8 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                com.tencent.mm.plugin.appbrand.appcache.x7.b(com.tencent.mm.plugin.appbrand.appcache.e8.f75515a);
            } else {
                com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.appcache.c8.class);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxaCommLibRuntimeReader", e17, "load() ipc read lib", new java.lang.Object[0]);
        }
    }
}

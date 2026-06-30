package com.tencent.mm.plugin.appbrand.weishi;

/* loaded from: classes7.dex */
public abstract class c {
    public static boolean a(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime != null) {
            oe1.b2.a(appBrandRuntime.f74803n);
        }
        return false;
    }

    public static void b() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            new com.tencent.mm.plugin.appbrand.weishi.AppBrandWeishiUIReadyEvent().e();
        } else {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString("wxfe02ecfe70800f46"), com.tencent.mm.plugin.appbrand.weishi.b.class, new com.tencent.mm.plugin.appbrand.weishi.a());
        }
    }
}

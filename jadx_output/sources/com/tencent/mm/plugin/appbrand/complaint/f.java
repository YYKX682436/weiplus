package com.tencent.mm.plugin.appbrand.complaint;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public final class f extends i95.w implements com.tencent.mm.plugin.appbrand.complaint.s {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.complaint.f f77185d = new com.tencent.mm.plugin.appbrand.complaint.f();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f77186e = new java.util.LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f77187f;

    static {
        com.tencent.mm.vfs.r6 r6Var;
        try {
            r6Var = com.tencent.mm.vfs.r6.j(com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir());
        } catch (java.lang.Exception unused) {
            r6Var = null;
        }
        if (r6Var == null) {
            r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir());
        }
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        if (!r26.i0.n(o17, "/", false)) {
            o17 = o17.concat("/");
        }
        java.lang.String str = o17 + "wxacomplaint";
        if (com.tencent.mm.vfs.w6.u(str)) {
            f77187f = str;
        }
    }

    public void Ai(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(path), com.tencent.mm.plugin.appbrand.complaint.e.f77184d.getClass(), null);
    }

    public void wi() {
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), com.tencent.mm.plugin.appbrand.complaint.d.f77183d.getClass(), null);
    }
}

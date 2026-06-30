package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes7.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.predownload.d0 f75753a = new com.tencent.mm.plugin.appbrand.appcache.predownload.d0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f75754b = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String str, com.tencent.mm.plugin.appbrand.service.r6 result) {
        kotlin.jvm.internal.o.g(result, "result");
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f75754b;
        com.tencent.mm.plugin.appbrand.appcache.predownload.c0 c0Var = (com.tencent.mm.plugin.appbrand.appcache.predownload.c0) concurrentHashMap.get(str);
        if (c0Var != null) {
            c0Var.f75749b.a(result);
            concurrentHashMap.remove(c0Var.f75748a, c0Var);
        }
    }

    public final void b(t81.c cmd) {
        kotlin.jvm.internal.o.g(cmd, "cmd");
        java.lang.String str = cmd.field_localRequestKey;
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f75754b;
        com.tencent.mm.plugin.appbrand.appcache.predownload.c0 c0Var = (com.tencent.mm.plugin.appbrand.appcache.predownload.c0) concurrentHashMap.get(cmd.field_localRequestKey);
        if (c0Var != null) {
            c0Var.f75749b.a(com.tencent.mm.plugin.appbrand.service.r6.Fail_PkgDownloadFail);
            concurrentHashMap.remove(c0Var.f75748a, c0Var);
        }
    }

    public final void c(t81.c cmd) {
        com.tencent.mm.plugin.appbrand.appcache.predownload.c0 c0Var;
        kotlin.jvm.internal.o.g(cmd, "cmd");
        java.lang.String str = cmd.field_localRequestKey;
        if ((str == null || str.length() == 0) || (c0Var = (com.tencent.mm.plugin.appbrand.appcache.predownload.c0) f75754b.get(cmd.field_localRequestKey)) == null) {
            return;
        }
        cf.d dVar = c0Var.f75750c;
        if (dVar != null) {
            dVar.a();
        } else {
            kotlin.jvm.internal.o.o("latch");
            throw null;
        }
    }
}

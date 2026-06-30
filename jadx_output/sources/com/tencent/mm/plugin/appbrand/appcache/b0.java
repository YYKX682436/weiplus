package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.b0 f75451a = new com.tencent.mm.plugin.appbrand.appcache.b0();

    public final org.chromium.net.UrlRequest a(java.lang.String url, java.util.ArrayList arrayList, com.tencent.mm.vfs.r6 filePath, long j17, org.chromium.net.apihelpers.CronetRequestCompletionListener listener, yz5.p pVar, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.plugin.appbrand.appcache.z zVar = new com.tencent.mm.plugin.appbrand.appcache.z(filePath, z17);
        zVar.f76081c = listener;
        if (pVar != null) {
            zVar.f76083e = pVar;
        }
        rc.c cVar = rc.b.f393906a;
        org.chromium.net.UrlRequest.Builder newUrlRequestBuilder = cVar.f393907a.newUrlRequestBuilder(url, zVar, cVar.f393908b);
        newUrlRequestBuilder.setHttpMethod("GET");
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                newUrlRequestBuilder.addHeader((java.lang.String) lVar.f302833d, (java.lang.String) lVar.f302834e);
            }
        }
        if (z17 && filePath.m()) {
            filePath.C();
            newUrlRequestBuilder.addHeader("Range", "bytes=" + filePath.C() + '-');
        }
        org.chromium.net.UrlRequest build = newUrlRequestBuilder.build();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.appbrand.appcache.a0 a0Var = new com.tencent.mm.plugin.appbrand.appcache.a0(build);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(a0Var, j17, null);
        build.start();
        return build;
    }
}

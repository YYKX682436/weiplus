package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class b4 implements com.tencent.mm.plugin.appbrand.appcache.va {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f84513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.f4 f84514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.me3 f84515c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m81.b[] f84516d;

    public b4(com.tencent.mm.plugin.appbrand.launching.q4 q4Var, com.tencent.mm.plugin.appbrand.launching.f4 f4Var, r45.me3 me3Var, m81.b[] bVarArr) {
        this.f84513a = q4Var;
        this.f84514b = f4Var;
        this.f84515c = me3Var;
        this.f84516d = bVarArr;
    }

    @Override // m81.d
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress progressInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress) obj;
        kotlin.jvm.internal.o.g(progressInfo, "progressInfo");
        com.tencent.mm.plugin.appbrand.launching.f4.a(this.f84514b, progressInfo);
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.va
    public void b(m81.b request) {
        kotlin.jvm.internal.o.g(request, "request");
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f84513a.f85069l;
        if (concurrentLinkedQueue != null) {
            ((java.util.LinkedList) request.f324692p).addAll(concurrentLinkedQueue);
        }
    }

    @Override // m81.d
    public void c(java.lang.String appId, m81.c errCode, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(errCode, "errCode");
        com.tencent.mm.plugin.appbrand.launching.f4.b(this.f84514b, errCode, (com.tencent.mm.plugin.appbrand.appcache.wa) obj, this.f84515c);
        m81.b bVar = this.f84516d[0];
        if (bVar != null) {
            this.f84513a.f85071n.remove(bVar);
        }
    }
}

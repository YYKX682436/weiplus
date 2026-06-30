package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class y3 implements com.tencent.mm.plugin.appbrand.appcache.va {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f85426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.f4 f85427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m81.c[] f85428c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.me3 f85429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km5.b f85430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m81.b[] f85431f;

    public y3(com.tencent.mm.plugin.appbrand.launching.q4 q4Var, com.tencent.mm.plugin.appbrand.launching.f4 f4Var, m81.c[] cVarArr, r45.me3 me3Var, km5.b bVar, m81.b[] bVarArr) {
        this.f85426a = q4Var;
        this.f85427b = f4Var;
        this.f85428c = cVarArr;
        this.f85429d = me3Var;
        this.f85430e = bVar;
        this.f85431f = bVarArr;
    }

    @Override // m81.d
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress progressInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress) obj;
        kotlin.jvm.internal.o.g(progressInfo, "progressInfo");
        com.tencent.mm.plugin.appbrand.launching.f4.a(this.f85427b, progressInfo);
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.va
    public void b(m81.b request) {
        kotlin.jvm.internal.o.g(request, "request");
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f85426a.f85069l;
        if (concurrentLinkedQueue != null) {
            ((java.util.LinkedList) request.f324692p).addAll(concurrentLinkedQueue);
        }
    }

    @Override // m81.d
    public void c(java.lang.String appId, m81.c errCode, java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.wa waVar = (com.tencent.mm.plugin.appbrand.appcache.wa) obj;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(errCode, "errCode");
        boolean G = kz5.z.G(this.f85428c, errCode);
        km5.b bVar = this.f85430e;
        if (G) {
            com.tencent.mm.plugin.appbrand.launching.f4.b(this.f85427b, errCode, waVar, this.f85429d);
            bVar.a(null);
        } else {
            bVar.resume();
        }
        m81.b bVar2 = this.f85431f[0];
        if (bVar2 != null) {
            this.f85426a.f85071n.remove(bVar2);
        }
    }
}

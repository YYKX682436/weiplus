package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class w3 implements com.tencent.mm.plugin.appbrand.appcache.va {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f85320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.f4 f85321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m81.c[] f85322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.me3 f85323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km5.b f85324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m81.b[] f85325f;

    public w3(com.tencent.mm.plugin.appbrand.launching.q4 q4Var, com.tencent.mm.plugin.appbrand.launching.f4 f4Var, m81.c[] cVarArr, r45.me3 me3Var, km5.b bVar, m81.b[] bVarArr) {
        this.f85320a = q4Var;
        this.f85321b = f4Var;
        this.f85322c = cVarArr;
        this.f85323d = me3Var;
        this.f85324e = bVar;
        this.f85325f = bVarArr;
    }

    @Override // m81.d
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress progressInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress) obj;
        kotlin.jvm.internal.o.g(progressInfo, "progressInfo");
        com.tencent.mm.plugin.appbrand.launching.f4.a(this.f85321b, progressInfo);
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.va
    public void b(m81.b request) {
        kotlin.jvm.internal.o.g(request, "request");
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f85320a.f85069l;
        if (concurrentLinkedQueue != null) {
            ((java.util.LinkedList) request.f324692p).addAll(concurrentLinkedQueue);
        }
    }

    @Override // m81.d
    public void c(java.lang.String appId, m81.c errCode, java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.wa waVar = (com.tencent.mm.plugin.appbrand.appcache.wa) obj;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(errCode, "errCode");
        boolean G = kz5.z.G(this.f85322c, errCode);
        km5.b bVar = this.f85324e;
        if (G) {
            com.tencent.mm.plugin.appbrand.launching.f4.b(this.f85321b, errCode, waVar, this.f85323d);
            bVar.a(null);
        } else {
            bVar.resume();
        }
        m81.b bVar2 = this.f85325f[0];
        if (bVar2 != null) {
            this.f85320a.f85071n.remove(bVar2);
        }
    }
}

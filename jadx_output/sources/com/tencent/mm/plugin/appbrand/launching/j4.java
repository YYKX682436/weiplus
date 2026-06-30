package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class j4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f84690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f84691e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(com.tencent.mm.plugin.appbrand.launching.q4 q4Var, yz5.p pVar) {
        super(2);
        this.f84690d = q4Var;
        this.f84691e = pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.launching.a6 err = (com.tencent.mm.plugin.appbrand.launching.a6) obj;
        java.lang.String str = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(err, "err");
        com.tencent.mm.plugin.appbrand.launching.q4 q4Var = this.f84690d;
        if (!q4Var.f85072o.get() || com.tencent.mm.plugin.appbrand.launching.a6.f84488f == err) {
            this.f84691e.invoke(err, str);
            int i17 = q4Var.f85070m;
            if (i17 > 0) {
                r81.f.INSTANCE.b(i17, 191);
            }
            com.tencent.mm.plugin.appbrand.launching.a6 a6Var = com.tencent.mm.plugin.appbrand.launching.a6.f84494o;
            com.tencent.mm.plugin.appbrand.launching.o6 request = q4Var.f85059b;
            if (a6Var == err) {
                int i18 = k91.l3.a(com.tencent.mm.plugin.appbrand.report.w0.b(request.f84851d, 0)) ? 776 : 368;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(i18, 118);
                com.tencent.mm.plugin.appbrand.report.v0.i(request.f84851d, request.f84855h.a(), request.f84854g, i18, 118, 1);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.CommonPkgFetcher", "onError, request:" + request + ", err:" + err);
            com.tencent.mm.plugin.appbrand.launching.x6.f85412a.getClass();
            java.util.Map map = com.tencent.mm.plugin.appbrand.launching.j6.f84693b;
            kotlin.jvm.internal.o.g(request, "request");
            com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
            com.tencent.mm.plugin.appbrand.app.r9.mj();
            try {
                java.util.Set g17 = com.tencent.mm.plugin.appbrand.launching.j6.f84695d.g(request);
                if (g17 != null) {
                    java.util.Iterator it = g17.iterator();
                    while (it.hasNext()) {
                        ((yz5.p) it.next()).invoke(err, str);
                    }
                }
            } finally {
                ((java.util.concurrent.ConcurrentHashMap) map).remove(request);
            }
        }
        return jz5.f0.f302826a;
    }
}

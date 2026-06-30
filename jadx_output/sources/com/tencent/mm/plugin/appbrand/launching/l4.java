package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f84751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f84752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(com.tencent.mm.plugin.appbrand.launching.q4 q4Var, yz5.l lVar) {
        super(1);
        this.f84751d = q4Var;
        this.f84752e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.p6 it = (com.tencent.mm.plugin.appbrand.launching.p6) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.launching.q4 q4Var = this.f84751d;
        if (!q4Var.f85072o.get()) {
            this.f84752e.invoke(it);
            boolean z17 = it.f84893b instanceof com.tencent.mm.plugin.appbrand.launching.q6;
            com.tencent.mm.plugin.appbrand.launching.k6 k6Var = q4Var.f85062e;
            com.tencent.mm.plugin.appbrand.launching.o6 request = q4Var.f85059b;
            if (z17) {
                if (k6Var != null) {
                    k6Var.d(request, it);
                }
            } else if (k6Var != null) {
                k6Var.e(request, it);
            }
            int i17 = q4Var.f85070m;
            if (i17 > 0) {
                r81.f.INSTANCE.b(i17, 190);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", "onSuccess, request:" + request + ", response:" + it);
            com.tencent.mm.plugin.appbrand.launching.j6 j6Var = com.tencent.mm.plugin.appbrand.launching.x6.f85412a;
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = q4Var.f85069l;
            java.util.LinkedList linkedList = concurrentLinkedQueue != null ? new java.util.LinkedList(concurrentLinkedQueue) : null;
            j6Var.getClass();
            java.util.Map map = com.tencent.mm.plugin.appbrand.launching.j6.f84693b;
            kotlin.jvm.internal.o.g(request, "request");
            com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
            com.tencent.mm.plugin.appbrand.app.r9.mj();
            try {
                java.util.Set g17 = com.tencent.mm.plugin.appbrand.launching.j6.f84694c.g(request);
                if (g17 != null) {
                    java.util.Iterator it6 = g17.iterator();
                    while (it6.hasNext()) {
                        ((yz5.l) it6.next()).invoke(it);
                    }
                }
                ((java.util.concurrent.ConcurrentHashMap) map).remove(request);
                java.util.Iterator it7 = com.tencent.mm.plugin.appbrand.launching.j6.f84697f.iterator();
                while (it7.hasNext()) {
                    ((yz5.r) it7.next()).C(request, it, q4Var.f85061d, linkedList);
                }
            } catch (java.lang.Throwable th6) {
                ((java.util.concurrent.ConcurrentHashMap) map).remove(request);
                throw th6;
            }
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class d6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.l6 f84567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.tencent.mm.plugin.appbrand.launching.l6 l6Var) {
        super(1);
        this.f84567d = l6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.q4 it = (com.tencent.mm.plugin.appbrand.launching.q4) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelPreDownloadTasks for args(scene:");
        com.tencent.mm.plugin.appbrand.launching.l6 l6Var = this.f84567d;
        sb6.append(l6Var.f84753a);
        sb6.append(", username:");
        java.lang.String str = l6Var.f84754b;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", appId:");
        java.lang.String str2 = l6Var.f84755c;
        sb6.append(str2 != null ? str2 : "");
        sb6.append("), request:");
        sb6.append(it.f85059b);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ICommonPkgFetcher", sb6.toString());
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = it.f85072o;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = it.f85071n;
        try {
            java.util.Iterator it6 = concurrentLinkedQueue.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.appbrand.appcache.ua.Ai((m81.b) it6.next());
            }
            concurrentLinkedQueue.clear();
            atomicBoolean.set(true);
            ((com.tencent.mm.plugin.appbrand.launching.j4) it.f85065h).invoke(com.tencent.mm.plugin.appbrand.launching.a6.f84488f, null);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            concurrentLinkedQueue.clear();
            atomicBoolean.set(true);
            throw th6;
        }
    }
}

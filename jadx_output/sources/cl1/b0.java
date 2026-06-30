package cl1;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl1.d0 f42852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f42853e;

    public b0(cl1.d0 d0Var, yz5.l lVar) {
        this.f42852d = d0Var;
        this.f42853e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ft.j jVar = (ft.j) i95.n0.c(ft.j.class);
        cl1.d0 d0Var = this.f42852d;
        yz5.l lVar = this.f42853e;
        synchronized (d0Var) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i17 = com.tencent.mm.plugin.appbrand.widget.recent.q0.f92038b.f91989b;
            ((com.tencent.mm.feature.appbrand.support.c0) jVar).getClass();
            int i18 = 0;
            d0Var.f42859b = com.tencent.mm.plugin.appbrand.appusage.c1.n0();
            if (d0Var.f42860c == null) {
                d0Var.f42860c = com.tencent.mm.plugin.appbrand.widget.recent.v.f92067a.c();
            }
            com.tencent.mm.plugin.appbrand.appusage.b6 b6Var = d0Var.f42860c;
            java.util.List ze6 = b6Var != null ? ((com.tencent.mm.plugin.appbrand.widget.recent.j1) b6Var).ze(d0Var.f42858a, i17 + 1) : null;
            if (ze6 != null) {
                java.util.Iterator it = ((java.util.ArrayList) kz5.n0.V(ze6)).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) it.next();
                    i18++;
                    if (i18 > i17) {
                        d0Var.f42859b = true;
                    } else {
                        cl1.n0 n0Var = new cl1.n0(1);
                        n0Var.f42888a = localUsageInfo;
                        arrayList.add(n0Var);
                        kotlin.jvm.internal.o.e(localUsageInfo, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo");
                        d0Var.f42858a = ((com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) localUsageInfo).C;
                    }
                }
            }
            lVar.invoke(arrayList);
        }
    }
}

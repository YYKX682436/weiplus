package cl1;

/* loaded from: classes7.dex */
public final class d0 extends cl1.y {

    /* renamed from: a, reason: collision with root package name */
    public long f42858a = com.tencent.wcdb.core.Database.DictDefaultMatchValue;

    /* renamed from: b, reason: collision with root package name */
    public boolean f42859b = true;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appusage.b6 f42860c;

    @Override // cl1.y
    public synchronized java.util.List a() {
        java.util.ArrayList arrayList;
        java.util.List list;
        arrayList = new java.util.ArrayList();
        if (this.f42860c == null) {
            this.f42860c = com.tencent.mm.plugin.appbrand.widget.recent.v.f92067a.c();
        }
        com.tencent.mm.plugin.appbrand.appusage.b6 b6Var = this.f42860c;
        if (b6Var != null) {
            list = ((com.tencent.mm.plugin.appbrand.widget.recent.j1) b6Var).t0(com.tencent.mm.plugin.appbrand.widget.recent.q0.f92038b.f91989b);
        } else {
            list = null;
        }
        boolean z17 = true;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) kz5.n0.V(list)).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) it.next();
                cl1.n0 n0Var = new cl1.n0(1);
                n0Var.f42888a = localUsageInfo;
                arrayList.add(n0Var);
                kotlin.jvm.internal.o.e(localUsageInfo, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo");
                this.f42858a = ((com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) localUsageInfo).C;
            }
        }
        if (arrayList.size() < com.tencent.mm.plugin.appbrand.widget.recent.q0.f92038b.f91989b) {
            z17 = false;
        }
        this.f42859b = z17;
        return arrayList;
    }

    @Override // cl1.y
    public void b(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ((com.tencent.mm.feature.appbrand.support.c0) ((ft.j) i95.n0.c(ft.j.class))).getClass();
        if (!com.tencent.mm.plugin.appbrand.appusage.c1.n0()) {
            ((ku5.t0) ku5.t0.f312615d).q(new cl1.b0(this, callback));
        } else {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.plugin.appbrand.appusage.c1.z0().u0(java.lang.System.currentTimeMillis(), false, null, 3, 2, 32, -1L, new com.tencent.mm.feature.appbrand.support.b0(new cl1.c0(this, callback)), null);
        }
    }

    @Override // cl1.y
    public boolean c() {
        return this.f42859b;
    }

    @Override // cl1.y
    public java.lang.String d() {
        java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.a0k);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // cl1.y
    public int e() {
        return 1;
    }
}

package cl1;

/* loaded from: classes7.dex */
public final class a0 extends cl1.y {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appusage.z5 f42850a;

    @Override // cl1.y
    public java.util.List a() {
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f42850a == null) {
            this.f42850a = com.tencent.mm.plugin.appbrand.widget.recent.v.f92067a.a();
        }
        com.tencent.mm.plugin.appbrand.appusage.z5 z5Var = this.f42850a;
        if (z5Var != null) {
            com.tencent.mm.plugin.appbrand.widget.recent.s1 s1Var = com.tencent.mm.plugin.appbrand.widget.recent.q0.f92037a;
            list = ((com.tencent.mm.plugin.appbrand.widget.recent.h) z5Var).xi(s1Var.f92053b, s1Var.f92054c);
        } else {
            list = null;
        }
        if (list != null) {
            for (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo : kz5.n0.V(list)) {
                cl1.n0 n0Var = new cl1.n0(2);
                n0Var.f42888a = localUsageInfo;
                arrayList.add(n0Var);
            }
        }
        return arrayList;
    }

    @Override // cl1.y
    public void b(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        callback.invoke(kz5.p0.f313996d);
    }

    @Override // cl1.y
    public java.lang.String d() {
        java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.a0j);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // cl1.y
    public int e() {
        return 2;
    }
}

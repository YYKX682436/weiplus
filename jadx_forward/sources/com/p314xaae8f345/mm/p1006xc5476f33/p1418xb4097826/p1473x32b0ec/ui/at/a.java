package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at;

/* loaded from: classes.dex */
public final class a extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f196934d;

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f196934d;
        if (arrayList != null) {
            int size = arrayList.size();
            int i17 = request.f544677b;
            if (i17 < size) {
                int size2 = arrayList.size();
                int i18 = request.f544678c;
                int size3 = size2 > i17 + i18 ? i18 + i17 : arrayList.size();
                while (i17 < size3) {
                    java.lang.Object obj = arrayList.get(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) obj, "notify@all")) {
                        java.util.ArrayList arrayList2 = dVar.f544682c;
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                        z3Var.X1("notify@all");
                        arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t(-1, z3Var, 1));
                    }
                    i17++;
                }
            }
        }
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return 0;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("notify@all");
        this.f196934d = arrayList;
    }
}

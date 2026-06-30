package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at;

/* loaded from: classes.dex */
public final class y extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.u3 f210449d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f210450e;

    public y(com.p314xaae8f345.mm.p2621x8fb0427b.u3 storageKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageKey, "storageKey");
        this.f210449d = storageKey;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f210450e;
        if (arrayList != null) {
            int size = arrayList.size();
            int i17 = request.f544677b;
            if (i17 < size) {
                int size2 = arrayList.size();
                int i18 = request.f544678c;
                int size3 = size2 > i17 + i18 ? i18 + i17 : arrayList.size();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = this.f210450e;
                if (arrayList3 != null) {
                    while (i17 < size3) {
                        arrayList2.add(arrayList3.get(i17));
                        i17++;
                    }
                    for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : g95.e.f351334a.f(arrayList3)) {
                        if (((int) z3Var.E2) != 0) {
                            java.util.ArrayList arrayList4 = dVar.f544682c;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t(-1, z3Var, 0);
                            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clm);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                            tVar.f210441n = string;
                            arrayList4.add(tVar);
                        }
                    }
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
        java.util.ArrayList arrayList;
        this.f210450e = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.a0 a0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.a0.f210408a;
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 key = this.f210449d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.Object m17 = gm0.j1.u().c().m(key, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.util.List a17 = a0Var.a((java.lang.String) m17);
        java.lang.String r17 = c01.z1.r();
        java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.z) it.next();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar.f210451a, r17) && (arrayList = this.f210450e) != null) {
                arrayList.add(zVar.f210451a);
            }
        }
    }
}

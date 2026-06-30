package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at;

/* loaded from: classes.dex */
public final class n extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f210430d;

    public n() {
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.m.f210429d);
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        int size;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f210430d;
        if (arrayList != null) {
            int size2 = arrayList.size();
            int i17 = request.f544677b;
            if (i17 < size2) {
                int size3 = arrayList.size();
                int i18 = request.f544678c;
                if (size3 > i17 + i18) {
                    dVar.f544681b = true;
                    size = i18 + i17;
                } else {
                    size = arrayList.size();
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (i17 < size) {
                    arrayList2.add(arrayList.get(i17));
                    i17++;
                }
                for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : g95.e.f351334a.f(arrayList2)) {
                    if (((int) z3Var.E2) != 0) {
                        dVar.f544682c.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t(0, z3Var, 3));
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
        return -1;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        this.f210430d = new java.util.ArrayList();
        android.database.Cursor K = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().K();
        if (K != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            while (K.moveToNext()) {
                z3Var.mo9015xbf5d97fd(K);
                java.util.ArrayList arrayList = this.f210430d;
                if (arrayList != null) {
                    arrayList.add(z3Var.d1());
                }
            }
            K.close();
        }
        java.util.ArrayList arrayList2 = this.f210430d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList2);
        arrayList2.remove(c01.z1.r());
    }
}

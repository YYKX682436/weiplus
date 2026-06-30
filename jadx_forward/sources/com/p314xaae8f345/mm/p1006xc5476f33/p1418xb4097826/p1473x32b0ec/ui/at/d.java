package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at;

/* loaded from: classes.dex */
public final class d extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f196937d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f196938e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f196939f;

    public d(java.lang.String chatroom) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroom, "chatroom");
        this.f196937d = chatroom;
        this.f196938e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.c.f196936d);
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        int size;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.List list = this.f196939f;
        if (list != null) {
            int size2 = list.size();
            int i17 = request.f544677b;
            if (i17 < size2) {
                int size3 = list.size();
                int i18 = request.f544678c;
                if (size3 > i17 + i18) {
                    dVar.f544681b = true;
                    size = i18 + i17;
                } else {
                    size = list.size();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (i17 < size) {
                    arrayList.add(list.get(i17));
                    i17++;
                }
                for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : g95.e.f351334a.f(arrayList)) {
                    if (((int) z3Var.E2) != 0 && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1())) {
                        dVar.f544682c.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.x(0, z3Var, 3, this.f196937d));
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
        android.database.Cursor B;
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f196937d;
        a17.z0(str);
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        java.util.List m17 = c01.v1.m(str);
        if (m17 != null) {
            java.util.LinkedList linkedList = (java.util.LinkedList) m17;
            linkedList.remove(c01.z1.r());
            p75.n0 n0Var = dm.e2.N1;
            p75.d dVar = dm.e2.P1;
            p75.i0 g17 = n0Var.g(kz5.b0.c(dVar));
            g17.f434189c = "FinderLiveAtGroupDataSource";
            g17.f434190d = dVar.l(m17);
            g17.f434192f = kz5.c0.i(new p75.g("showHead", true), new g95.c());
            p75.l0 a18 = g17.a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            l75.k0 Q4 = ((jm0.l) ((jz5.n) this.f196938e).mo141623x754a37bb()).Q4();
            if (Q4 != null && (B = Q4.B(a18.f434169a, a18.f434170b)) != null) {
                while (B.moveToNext()) {
                    try {
                        arrayList.add(B.getString(0));
                    } finally {
                    }
                }
                vz5.b.a(B, null);
            }
            linkedList.clear();
            linkedList.addAll(arrayList);
        } else {
            m17 = null;
        }
        this.f196939f = m17;
    }
}

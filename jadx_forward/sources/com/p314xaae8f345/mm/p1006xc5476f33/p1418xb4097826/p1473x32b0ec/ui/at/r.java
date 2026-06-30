package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at;

/* loaded from: classes.dex */
public final class r implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final ym3.c f196952d;

    /* renamed from: e, reason: collision with root package name */
    public final u26.k0 f196953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.C14286x273d7d5a f196954f;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.C14286x273d7d5a c14286x273d7d5a, ym3.c request, u26.k0 channel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        this.f196954f = c14286x273d7d5a;
        this.f196952d = request;
        this.f196953e = channel;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17;
        if (vVar != null) {
            if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar.f432690b, this.f196954f.f196933e) ? vVar : null) != null) {
                int i18 = vVar.f432691c;
                u26.k0 k0Var = this.f196953e;
                if (i18 != 0) {
                    u26.s.a(k0Var, null, 1, null);
                    return;
                }
                ym3.d dVar = new ym3.d(this.f196952d);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.List resultList = vVar.f432693e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resultList, "resultList");
                java.util.Iterator it = resultList.iterator();
                while (true) {
                    i17 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    p13.y yVar = (p13.y) it.next();
                    if (kz5.c0.i(1, 15).contains(java.lang.Integer.valueOf(yVar.f432718c))) {
                        arrayList.add(yVar);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    arrayList = null;
                }
                java.util.ArrayList arrayList2 = dVar.f544682c;
                if (arrayList != null) {
                    for (java.lang.Object obj : arrayList) {
                        int i19 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        p13.y yVar2 = (p13.y) obj;
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar2.f432720e, true);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t(i17, n17, 2);
                        tVar.f210437g = yVar2;
                        tVar.f210438h = vVar.f432692d;
                        arrayList2.add(tVar);
                        i17 = i19;
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t tVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t(0, new com.p314xaae8f345.mm.p2621x8fb0427b.z3(), 4);
                    tVar2.f210437g = null;
                    tVar2.f210438h = vVar.f432692d;
                    arrayList2.add(tVar2);
                }
                k0Var.e(dVar);
            }
        }
    }
}

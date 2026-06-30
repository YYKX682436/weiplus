package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at;

/* loaded from: classes.dex */
public final class h implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final ym3.c f196942d;

    /* renamed from: e, reason: collision with root package name */
    public final u26.k0 f196943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.C14284x86ffdfa7 f196944f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.C14284x86ffdfa7 c14284x86ffdfa7, ym3.c request, u26.k0 channel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        this.f196944f = c14284x86ffdfa7;
        this.f196942d = request;
        this.f196943e = channel;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        java.util.List list;
        if (vVar != null) {
            if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar.f432690b, this.f196944f.f196931f) ? vVar : null) != null) {
                int i17 = vVar.f432691c;
                u26.k0 k0Var = this.f196943e;
                if (i17 != 0) {
                    u26.s.a(k0Var, null, 1, null);
                    return;
                }
                ym3.d dVar = new ym3.d(this.f196942d);
                java.util.List resultList = vVar.f432693e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resultList, "resultList");
                int i18 = 0;
                p13.y yVar = (p13.y) kz5.n0.a0(resultList, 0);
                if (yVar != null) {
                    yVar.f432736u = vVar.f432692d;
                } else {
                    yVar = null;
                }
                if (yVar != null && (list = yVar.f432729n) != null) {
                    for (java.lang.Object obj : list) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(((p13.l) obj).f432647e, true);
                        java.util.ArrayList arrayList = dVar.f544682c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t(i18, n17, 2);
                        tVar.f210438h = vVar.f432692d;
                        arrayList.add(tVar);
                        i18 = i19;
                    }
                }
                k0Var.e(dVar);
            }
        }
    }
}

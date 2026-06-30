package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2652xc6fc895f;

/* loaded from: classes.dex */
public final class c implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final ym3.c f280008d;

    /* renamed from: e, reason: collision with root package name */
    public final u26.k0 f280009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2652xc6fc895f.C21652xf41b136c f280010f;

    public c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2652xc6fc895f.C21652xf41b136c c21652xf41b136c, ym3.c request, u26.k0 channel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        this.f280010f = c21652xf41b136c;
        this.f280008d = request;
        this.f280009e = channel;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        java.util.List list;
        if (vVar != null) {
            if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar.f432690b, this.f280010f.f279999f) ? vVar : null) != null) {
                int i17 = vVar.f432691c;
                boolean z17 = true;
                u26.k0 k0Var = this.f280009e;
                if (i17 != 0) {
                    u26.s.a(k0Var, null, 1, null);
                    return;
                }
                ym3.d dVar = new ym3.d(this.f280008d);
                java.util.List resultList = vVar.f432693e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resultList, "resultList");
                p13.y yVar = (p13.y) kz5.n0.a0(resultList, 0);
                if (yVar != null) {
                    yVar.f432736u = vVar.f432692d;
                } else {
                    yVar = null;
                }
                if (yVar != null && (list = yVar.f432729n) != null) {
                    java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                    int i18 = 0;
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(((p13.l) next).f432647e, z17);
                        java.util.ArrayList arrayList = dVar.f544682c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2652xc6fc895f.b bVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2652xc6fc895f.b(i18, n17, 1, null, 8, null);
                        bVar.f280003g = vVar.f432692d;
                        arrayList.add(bVar);
                        i18 = i19;
                        z17 = true;
                    }
                }
                k0Var.e(dVar);
            }
        }
    }
}

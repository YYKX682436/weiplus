package dy3;

/* loaded from: classes.dex */
public final class q implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final ym3.c f326136d;

    /* renamed from: e, reason: collision with root package name */
    public final u26.k0 f326137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.p2033xd1075a44.at.C17248xdee751ea f326138f;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.p2033xd1075a44.at.C17248xdee751ea c17248xdee751ea, ym3.c request, u26.k0 channel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        this.f326138f = c17248xdee751ea;
        this.f326136d = request;
        this.f326137e = channel;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        if (vVar != null) {
            if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar.f432690b, this.f326138f.f240113e) ? vVar : null) != null) {
                int i17 = vVar.f432691c;
                u26.k0 k0Var = this.f326137e;
                boolean z17 = true;
                if (i17 != 0) {
                    u26.s.a(k0Var, null, 1, null);
                    return;
                }
                ym3.d dVar = new ym3.d(this.f326136d);
                java.util.List list = vVar.f432693e;
                if (list != null) {
                    int i18 = 0;
                    for (java.lang.Object obj : list) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(((p13.y) obj).f432720e, z17);
                        java.util.ArrayList arrayList = dVar.f544682c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
                        dy3.p pVar = new dy3.p(i18, n17, 1, null, 8, null);
                        pVar.f326131g = vVar.f432692d;
                        arrayList.add(pVar);
                        z17 = true;
                        i18 = i19;
                    }
                }
                k0Var.e(dVar);
            }
        }
    }
}

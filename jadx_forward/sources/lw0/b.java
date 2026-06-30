package lw0;

/* loaded from: classes5.dex */
public final class b implements jx0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lw0.c f403062a;

    public b(lw0.c cVar) {
        this.f403062a = cVar;
    }

    @Override // jx0.m
    public void a(int i17) {
        lw0.c cVar = this.f403062a;
        mv0.e eVar = (mv0.e) kz5.n0.a0(cVar.f403063J, i17);
        if (eVar != null) {
            lw0.a aVar = cVar.L;
            if (aVar != null) {
                lw0.l lVar = ((lw0.j) aVar).f403073a;
                mv0.d dVar = eVar.f413072b;
                lVar.f403075o = dVar;
                if (dVar == mv0.d.f413068d) {
                    lVar.s7();
                }
            }
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = cVar.I;
            if (c1190x18d3c3fe != null) {
                c1190x18d3c3fe.m8317x940d026a(i17, false);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
        }
    }

    @Override // jx0.m
    public void b(int i17) {
    }
}

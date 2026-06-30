package hw0;

/* loaded from: classes5.dex */
public final class d implements jx0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hw0.g f366988a;

    public d(hw0.g gVar) {
        this.f366988a = gVar;
    }

    @Override // jx0.m
    public void a(int i17) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe m134215xa0cf1568;
        hw0.g gVar = this.f366988a;
        kw0.d dVar = (kw0.d) kz5.n0.a0(gVar.D, i17);
        if (dVar != null) {
            hw0.a aVar = gVar.C;
            if (aVar != null) {
                hw0.n nVar = ((hw0.m) aVar).f367001a;
                kw0.c cVar = dVar.f394332b;
                nVar.f367004p = cVar;
                int ordinal = cVar.ordinal();
                if (ordinal == 0) {
                    yy0.m7 m7Var = (yy0.m7) nVar.R6().O6();
                    p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.i3(m7Var, null), 3, null);
                } else if (ordinal == 1) {
                    yy0.m7 m7Var2 = (yy0.m7) nVar.R6().O6();
                    p3325xe03a0797.p3326xc267989b.l.d(m7Var2.Di(), null, null, new yy0.j3(m7Var2, null), 3, null);
                }
            }
            m134215xa0cf1568 = gVar.m134215xa0cf1568();
            m134215xa0cf1568.m8317x940d026a(i17, false);
        }
    }

    @Override // jx0.m
    public void b(int i17) {
    }
}

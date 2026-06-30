package ov0;

/* loaded from: classes5.dex */
public final class r implements jx0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ov0.t f430678a;

    public r(ov0.t tVar) {
        this.f430678a = tVar;
    }

    @Override // jx0.m
    public void a(int i17) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe m157195xa0cf1568;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe m157195xa0cf15682;
        ov0.t tVar;
        ov0.t tVar2 = this.f430678a;
        sw0.c cVar = (sw0.c) kz5.n0.a0(tVar2.f430685y0, i17);
        if (cVar != null) {
            ov0.e eVar = cVar.f494953b;
            tVar2.f430684x1 = eVar;
            ov0.f fVar = tVar2.f430682p1;
            if (fVar != null) {
                int ordinal = eVar.ordinal();
                ov0.i0 i0Var = ((ov0.h0) fVar).f430666a;
                if (ordinal == 0) {
                    ov0.t tVar3 = (ov0.t) i0Var.f150773i;
                    if (tVar3 != null) {
                        tVar3.O();
                    }
                } else if (ordinal == 1 && (tVar = (ov0.t) i0Var.f150773i) != null) {
                    tVar.P();
                }
            }
            m157195xa0cf1568 = tVar2.m157195xa0cf1568();
            if (m157195xa0cf1568.m8300xfda78ef6() != i17) {
                m157195xa0cf15682 = tVar2.m157195xa0cf1568();
                m157195xa0cf15682.m8317x940d026a(i17, false);
            }
        }
    }

    @Override // jx0.m
    public void b(int i17) {
    }
}

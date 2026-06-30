package ow0;

/* loaded from: classes5.dex */
public final class e implements jx0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow0.g f430832a;

    public e(ow0.g gVar) {
        this.f430832a = gVar;
    }

    @Override // jx0.m
    public void a(int i17) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe m157266xa0cf1568;
        ow0.g gVar = this.f430832a;
        sw0.n nVar = (sw0.n) kz5.n0.a0(gVar.F, i17);
        if (nVar != null) {
            ow0.b bVar = gVar.D;
            if (bVar != null) {
                ow0.a0 a0Var = ((ow0.t) bVar).f430883a;
                ((du0.o) ((jz5.n) a0Var.f430814o).mo141623x754a37bb()).U6(false);
                int ordinal = nVar.f494977b.ordinal();
                if (ordinal == 0) {
                    a0Var.I7();
                } else if (ordinal == 1) {
                    a0Var.D7();
                } else if (ordinal == 2) {
                    a0Var.F7();
                } else if (ordinal == 3) {
                    a0Var.B7();
                }
            }
            m157266xa0cf1568 = gVar.m157266xa0cf1568();
            m157266xa0cf1568.m8317x940d026a(i17, false);
        }
    }

    @Override // jx0.m
    public void b(int i17) {
    }
}

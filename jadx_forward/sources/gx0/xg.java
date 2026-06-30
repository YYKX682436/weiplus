package gx0;

/* loaded from: classes5.dex */
public final class xg implements jx0.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f358719a;

    public xg(gx0.bh bhVar) {
        this.f358719a = bhVar;
    }

    @Override // jx0.g0
    public void a(float f17) {
        gx0.bh bhVar = this.f358719a;
        yy0.m7 m7Var = (yy0.m7) bhVar.R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.z2(m7Var, null), 3, null);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a Y6 = gx0.bh.Y6(bhVar, f17);
        jx0.h0 h0Var = (jx0.h0) bhVar.L.j();
        if (h0Var != null) {
            h0Var.a(Y6);
        }
    }

    @Override // jx0.g0
    public int b() {
        return this.f358719a.B.f430447a;
    }

    @Override // jx0.g0
    public void c(float f17) {
        gx0.bh bhVar = this.f358719a;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a Y6 = gx0.bh.Y6(bhVar, f17);
        if (!Y6.m33980x66356283() || !bhVar.V6().m7()) {
            bhVar.H = Y6;
            return;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
        bhVar.H = InvalidTime;
        bhVar.V6().p7(Y6, true, 4L);
    }

    @Override // jx0.g0
    public void d() {
        this.f358719a.M = false;
    }

    @Override // jx0.g0
    public void e(float f17) {
        gx0.bh bhVar = this.f358719a;
        pf5.e.m158344xbe96bc24(bhVar, null, null, new gx0.wg(bhVar, null), 3, null);
    }
}

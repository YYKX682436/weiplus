package gx0;

/* loaded from: classes5.dex */
public final class z1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f358785d;

    public z1(gx0.u2 u2Var) {
        this.f358785d = u2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ow0.g gVar;
        cx0.c cVar = (cx0.c) obj;
        gx0.u2 u2Var = this.f358785d;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb l76 = u2Var.S7().l7();
        if (cVar.a() && (!cVar.f306034b.isEmpty()) && l76 == null && (gVar = (ow0.g) u2Var.f150773i) != null) {
            gVar.m157275x53bfe316("");
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c n76 = u2Var.n7();
        if (n76 != null) {
            n76.n(cVar);
        }
        u2Var.R7().n7();
        ex0.a0 a0Var = u2Var.S7().f358175r;
        ex0.r n17 = a0Var != null ? a0Var.n() : null;
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null) {
            return;
        }
        int ordinal = fVar.f338667j.ordinal();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a i76 = ordinal != 1 ? ordinal != 2 ? u2Var.R7().i7() : fVar.l().m34007xde00a612() : fVar.k();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) u2Var.R7().f357791y.mo3195x754a37bb();
        if (c4128x879fba0a == null) {
            c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        }
        if (i76.m33983x7b953cf2() && c4128x879fba0a.m33983x7b953cf2()) {
            u2Var.T7().i7(i76, c4128x879fba0a);
        }
    }
}

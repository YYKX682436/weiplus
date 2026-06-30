package ow0;

/* loaded from: classes5.dex */
public final class j0 implements gy0.j {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f430856a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f430857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f430858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c f430859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f430860e;

    public j0(gx0.u2 u2Var, ex0.a0 a0Var, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c c10954x76f4876c, int i17) {
        this.f430857b = u2Var;
        this.f430858c = a0Var;
        this.f430859d = c10954x76f4876c;
        this.f430860e = i17;
    }

    @Override // gy0.j
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c c10954x76f4876c = this.f430859d;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(c10954x76f4876c.m47429x4a0f3a9() / this.f430858c.s(c10954x76f4876c.getTimelineLayoutType()));
        gx0.u2 u2Var = this.f430857b;
        gx0.bf R7 = u2Var.R7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        gx0.bf.q7(R7, m33969x7905b775, true, 0L, 4, null);
        ow0.q0.e(u2Var, m33969x7905b775);
        ow0.q0.c(u2Var, m33969x7905b775, true);
        ow0.q0.f(u2Var, c10954x76f4876c);
        p3325xe03a0797.p3326xc267989b.l.d(u2Var.m158345xefc66565(), null, null, new ow0.h0(u2Var, m33969x7905b775, null), 3, null);
    }

    @Override // gy0.j
    public void b(boolean z17, boolean z18) {
        double s17;
        double m33988x124aa384;
        double s18;
        ex0.r n17 = this.f430858c.n();
        if (n17 != null && z18) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a k17 = z17 ? n17.k() : n17.l().m34007xde00a612().sub(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(0.1d));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
            gx0.u2 u2Var = this.f430857b;
            u2Var.b8(k17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(u2Var, "<this>");
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c timelineView = this.f430859d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineView, "timelineView");
            ex0.a0 a0Var = u2Var.S7().f358175r;
            if (a0Var != null) {
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a k18 = z17 ? n17.k() : n17.l().m34007xde00a612();
                if (z17) {
                    s17 = a0Var.s(timelineView.getTimelineLayoutType());
                    m33988x124aa384 = k18.m33988x124aa384();
                } else if (a0Var.E(n17.f338701b) || n17.f338703d) {
                    s17 = a0Var.s(timelineView.getTimelineLayoutType());
                    m33988x124aa384 = k18.m33988x124aa384();
                } else {
                    s18 = (a0Var.s(timelineView.getTimelineLayoutType()) * k18.m33988x124aa384()) - (timelineView.m47177x16c9c206() / 2);
                    timelineView.g(s18);
                }
                s18 = s17 * m33988x124aa384;
                timelineView.g(s18);
            }
            p3325xe03a0797.p3326xc267989b.l.d(u2Var.m158345xefc66565(), null, null, new ow0.i0(u2Var, k17, this, null), 3, null);
        }
    }

    @Override // gy0.j
    public void c(boolean z17) {
        this.f430857b.R6().V6();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) this.f430858c.f338639p.mo3195x754a37bb();
        if (c4128x879fba0a == null) {
            c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        }
        this.f430856a = c4128x879fba0a;
    }

    @Override // gy0.j
    public void d() {
    }

    @Override // gy0.j
    public void e() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(this.f430859d.m47429x4a0f3a9() / this.f430858c.s(r0.getTimelineLayoutType()));
        gx0.u2 u2Var = this.f430857b;
        gx0.bf R7 = u2Var.R7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        gx0.bf.q7(R7, m33969x7905b775, false, 0L, 4, null);
        ow0.q0.e(u2Var, m33969x7905b775);
    }

    @Override // gy0.j
    public void f() {
    }

    @Override // gy0.j
    public void g() {
    }

    @Override // gy0.j
    public void h() {
    }

    @Override // gy0.j
    public void i() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c c10954x76f4876c;
        bx0.h timelineLayoutCalc;
        ex0.r n17 = this.f430858c.n();
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null || (timelineLayoutCalc = (c10954x76f4876c = this.f430859d).getTimelineLayoutCalc()) == null) {
            return;
        }
        int ordinal = fVar.f338667j.ordinal();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = fVar.f338701b;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(((ordinal != 1 ? ordinal != 2 ? timelineLayoutCalc.b(c3971x241f78, false).left : timelineLayoutCalc.b(c3971x241f78, false).right : timelineLayoutCalc.b(c3971x241f78, false).left) - this.f430860e) / r0.s(c10954x76f4876c.getTimelineLayoutType()));
        gx0.bf R7 = this.f430857b.R7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        R7.p7(m33969x7905b775, false, 8L);
    }
}

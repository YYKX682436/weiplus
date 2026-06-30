package rv0;

/* loaded from: classes5.dex */
public final class s0 implements gy0.j {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f481759a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481761c;

    public s0(rv0.n1 n1Var, ex0.a0 a0Var) {
        this.f481760b = n1Var;
        this.f481761c = a0Var;
    }

    @Override // gy0.j
    public void a(boolean z17) {
        rv0.n1 n1Var = this.f481760b;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(n1Var.r7().m47429x4a0f3a9() / this.f481761c.s(n1Var.r7().getTimelineLayoutType()));
        gx0.bf p76 = n1Var.p7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        gx0.bf.q7(p76, m33969x7905b775, true, 0L, 4, null);
        n1Var.v7(m33969x7905b775);
        p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.o0(n1Var, m33969x7905b775, null), 3, null);
    }

    @Override // gy0.j
    public void b(boolean z17, boolean z18) {
        double s17;
        double m33988x124aa384;
        double s18;
        ex0.r n17 = this.f481761c.n();
        if (n17 == null) {
            return;
        }
        rv0.n1 n1Var = this.f481760b;
        if (!z18) {
            p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.p0(n1Var, null), 3, null);
            return;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a k17 = z17 ? n17.k() : n17.l().m34007xde00a612().sub(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(0.1d));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
        n1Var.y7(k17);
        n1Var.getClass();
        ex0.a0 s76 = n1Var.s7();
        if (s76 != null) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a k18 = z17 ? n17.k() : n17.l().m34007xde00a612();
            if (z17) {
                s17 = s76.s(n1Var.r7().getTimelineLayoutType());
                m33988x124aa384 = k18.m33988x124aa384();
            } else if (s76.E(n17.f338701b) || n17.f338703d) {
                s17 = s76.s(n1Var.r7().getTimelineLayoutType());
                m33988x124aa384 = k18.m33988x124aa384();
            } else {
                s18 = (s76.s(n1Var.r7().getTimelineLayoutType()) * k18.m33988x124aa384()) - (n1Var.r7().m47136x16c9c206() / 2);
                n1Var.r7().g(s18);
            }
            s18 = s17 * m33988x124aa384;
            n1Var.r7().g(s18);
        }
        p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.q0(n1Var, k17, this, null), 3, null);
    }

    @Override // gy0.j
    public void c(boolean z17) {
        rv0.n1 n1Var = this.f481760b;
        n1Var.R6().V6();
        ex0.a0 a0Var = this.f481761c;
        ex0.r n17 = a0Var.n();
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar != null) {
            ex0.r n76 = n1Var.n7();
            if ((n76 != null ? n76.f338702c : null) == ug.m.Music) {
                a0Var.I(fVar);
            }
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) a0Var.f338639p.mo3195x754a37bb();
        if (c4128x879fba0a == null) {
            c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        }
        this.f481759a = c4128x879fba0a;
        p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.r0(n1Var, null), 3, null);
    }

    @Override // gy0.j
    public void d() {
    }

    @Override // gy0.j
    public void e() {
        rv0.n1 n1Var = this.f481760b;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(n1Var.r7().m47429x4a0f3a9() / this.f481761c.s(n1Var.r7().getTimelineLayoutType()));
        gx0.bf p76 = n1Var.p7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        gx0.bf.q7(p76, m33969x7905b775, false, 0L, 4, null);
        n1Var.v7(m33969x7905b775);
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
        rv0.n1 n1Var = this.f481760b;
        p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.m1(n1Var, null), 3, null);
        ex0.a0 s76 = n1Var.s7();
        if (s76 == null) {
            return;
        }
        ex0.r n17 = s76.n();
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null) {
            return;
        }
        if (fVar.f338702c == ug.m.ImageClip) {
            gx0.bf p76 = n1Var.p7();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
            p76.b7(ZeroTime, false);
            return;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m17 = fVar.m();
        if (m17 == null) {
            return;
        }
        int ordinal = fVar.f338667j.ordinal();
        if (ordinal == 1) {
            gx0.bf p77 = n1Var.p7();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34009x8082fb99 = m17.m34009x8082fb99();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34009x8082fb99, "getStartTime(...)");
            p77.b7(m34009x8082fb99, false);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        gx0.bf p78 = n1Var.p7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = m17.m34007xde00a612();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34007xde00a612, "getEndTime(...)");
        p78.b7(m34007xde00a612, false);
    }
}

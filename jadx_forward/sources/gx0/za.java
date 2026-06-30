package gx0;

/* loaded from: classes5.dex */
public final class za implements gy0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gy0.j f358810a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358812c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f358813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f358814e;

    public za(gx0.ac acVar, ex0.a0 a0Var, int i17) {
        this.f358812c = acVar;
        this.f358813d = a0Var;
        this.f358814e = i17;
        if (!gy0.j.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(gy0.j.class.getClassLoader(), new java.lang.Class[]{gy0.j.class}, pm0.v.f438336b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.widgets.timelineview.itemDecoration.TimelineItemDecoration.TimelineItemDecorationTrimListener");
        }
        this.f358810a = (gy0.j) newProxyInstance;
        this.f358811b = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
    }

    @Override // gy0.j
    public void a(boolean z17) {
        gx0.ac acVar = this.f358812c;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(acVar.A7().m47429x4a0f3a9() / this.f358813d.s(acVar.A7().getTimelineLayoutType()));
        gx0.bf c86 = acVar.c8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        gx0.bf.q7(c86, m33969x7905b775, true, 0L, 4, null);
        acVar.g8(m33969x7905b775);
        p3325xe03a0797.p3326xc267989b.l.d(acVar.m158345xefc66565(), null, null, new gx0.xa(acVar, m33969x7905b775, null), 3, null);
    }

    @Override // gy0.j
    public void b(boolean z17, boolean z18) {
        double s17;
        double m33988x124aa384;
        double s18;
        ex0.r n17 = this.f358813d.n();
        if (n17 != null && z18) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a k17 = z17 ? n17.k() : n17.l().m34007xde00a612().sub(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(0.1d));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
            gx0.ac acVar = this.f358812c;
            acVar.k8(k17);
            acVar.getClass();
            ex0.a0 e86 = acVar.e8();
            if (e86 != null) {
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a k18 = z17 ? n17.k() : n17.l().m34007xde00a612();
                if (z17) {
                    s17 = e86.s(acVar.A7().getTimelineLayoutType());
                    m33988x124aa384 = k18.m33988x124aa384();
                } else if (e86.E(n17.f338701b) || n17.f338703d) {
                    s17 = e86.s(acVar.A7().getTimelineLayoutType());
                    m33988x124aa384 = k18.m33988x124aa384();
                } else {
                    s18 = (e86.s(acVar.A7().getTimelineLayoutType()) * k18.m33988x124aa384()) - (acVar.A7().m47148x16c9c206() / 2);
                    acVar.A7().g(s18);
                }
                s18 = s17 * m33988x124aa384;
                acVar.A7().g(s18);
            }
            p3325xe03a0797.p3326xc267989b.l.d(acVar.m158345xefc66565(), null, null, new gx0.ya(acVar, k17, this, null), 3, null);
        }
    }

    @Override // gy0.j
    public void c(boolean z17) {
        this.f358812c.R6().V6();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) this.f358813d.f338639p.mo3195x754a37bb();
        if (c4128x879fba0a == null) {
            c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        }
        this.f358811b = c4128x879fba0a;
    }

    @Override // gy0.j
    public void d() {
        this.f358810a.d();
    }

    @Override // gy0.j
    public void e() {
        gx0.ac acVar = this.f358812c;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(acVar.A7().m47429x4a0f3a9() / this.f358813d.s(acVar.A7().getTimelineLayoutType()));
        gx0.bf c86 = acVar.c8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        gx0.bf.q7(c86, m33969x7905b775, false, 0L, 4, null);
        acVar.g8(m33969x7905b775);
    }

    @Override // gy0.j
    public void f() {
        this.f358810a.f();
    }

    @Override // gy0.j
    public void g() {
        this.f358810a.g();
    }

    @Override // gy0.j
    public void h() {
        this.f358810a.h();
    }

    @Override // gy0.j
    public void i() {
        ex0.r n17 = this.f358813d.n();
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null) {
            return;
        }
        gx0.ac acVar = this.f358812c;
        if (acVar.A7().getTimelineLayoutCalc() == null) {
            return;
        }
        int ordinal = fVar.f338667j.ordinal();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = fVar.f338701b;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(((ordinal != 1 ? ordinal != 2 ? r3.b(c3971x241f78, false).left : r3.b(c3971x241f78, false).right : r3.b(c3971x241f78, false).left) - this.f358814e) / r0.s(acVar.A7().getTimelineLayoutType()));
        gx0.bf c86 = acVar.c8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        c86.p7(m33969x7905b775, false, 8L);
    }
}

package yv0;

/* loaded from: classes5.dex */
public final class m implements gy0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 f547512a;

    public m(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 c10943x503f3e16) {
        this.f547512a = c10943x503f3e16;
    }

    @Override // gy0.j
    public void a(boolean z17) {
        gy0.j jVar = this.f547512a.K;
        if (jVar != null) {
            jVar.a(z17);
        }
    }

    @Override // gy0.j
    public void b(boolean z17, boolean z18) {
        ex0.a0 timelineVM;
        ex0.o o17;
        int i17 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16.L;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 c10943x503f3e16 = this.f547512a;
        bx0.h timelineLayoutCalc = c10943x503f3e16.getTimelineLayoutCalc();
        if (timelineLayoutCalc != null && (timelineVM = c10943x503f3e16.getTimelineVM()) != null && (o17 = timelineVM.o()) != null) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 q17 = timelineVM.q();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = o17.f338700a;
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 v17 = c4190xd8dd3713.v();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v17, "getAbsoluteTimeRange(...)");
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34009x8082fb99 = v17.m34009x8082fb99();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34009x8082fb99, "getStartTime(...)");
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34009x8082fb992 = q17.m34009x8082fb99();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34009x8082fb992, "getStartTime(...)");
            boolean z19 = true;
            boolean z27 = m34009x8082fb99.m33986x9f3f7b48(m34009x8082fb992) || m34009x8082fb99.m33975x22a7969a(m34009x8082fb992);
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 v18 = c4190xd8dd3713.v();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v18, "getAbsoluteTimeRange(...)");
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = v18.m34007xde00a612();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34007xde00a612, "getEndTime(...)");
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a6122 = q17.m34007xde00a612();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34007xde00a6122, "getEndTime(...)");
            if (!m34007xde00a612.m33971xf922bec1(m34007xde00a6122) && !m34007xde00a612.m33975x22a7969a(m34007xde00a6122)) {
                z19 = false;
            }
            if (!z27 || !z19) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e c4188xeef5596e = o17.f338687q;
                c4188xeef5596e.getClass();
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4188xeef5596e.D();
                if (D != null) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.M1(c4188xeef5596e, false, D);
                }
                c4188xeef5596e.getClass();
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4188xeef5596e.D();
                if (D2 != null) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.z1(c4188xeef5596e, false, D2);
                }
            }
            timelineVM.g();
            timelineLayoutCalc.a();
        }
        c10943x503f3e16.o();
        gy0.j jVar = c10943x503f3e16.K;
        if (jVar != null) {
            jVar.b(z17, z18);
        }
    }

    @Override // gy0.j
    public void c(boolean z17) {
        ex0.r n17;
        bx0.h timelineLayoutCalc;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 c10943x503f3e16 = this.f547512a;
        gy0.j jVar = c10943x503f3e16.K;
        if (jVar != null) {
            jVar.c(z17);
        }
        ex0.a0 timelineVM = c10943x503f3e16.getTimelineVM();
        if (timelineVM == null || (n17 = timelineVM.n()) == null || (timelineLayoutCalc = c10943x503f3e16.getTimelineLayoutCalc()) == null) {
            return;
        }
        android.graphics.Rect b17 = timelineLayoutCalc.b(n17.f338701b, false);
        if (kz5.z.G(new ug.m[]{ug.m.ImageClip, ug.m.VideoClip, ug.m.MovieClip}, n17.f338702c)) {
            ex0.a0 timelineVM2 = c10943x503f3e16.getTimelineVM();
            ex0.r n18 = timelineVM2 != null ? timelineVM2.n() : null;
            ex0.f fVar = n18 instanceof ex0.f ? (ex0.f) n18 : null;
            if (fVar != null) {
                if (z17) {
                    bx0.h timelineLayoutCalc2 = c10943x503f3e16.getTimelineLayoutCalc();
                    if (timelineLayoutCalc2 != null) {
                        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = fVar.f338701b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
                        timelineLayoutCalc2.f117818l = timelineLayoutCalc2.b(segmentID, false).width();
                    }
                } else {
                    bx0.h timelineLayoutCalc3 = c10943x503f3e16.getTimelineLayoutCalc();
                    if (timelineLayoutCalc3 != null) {
                        timelineLayoutCalc3.f117817k = 0;
                        timelineLayoutCalc3.f117818l = 0;
                    }
                }
            }
            e3.d b18 = e3.d.b(c10943x503f3e16.getInitTimelineInsets().f328577a + b17.width(), c10943x503f3e16.getInitTimelineInsets().f328578b, c10943x503f3e16.getInitTimelineInsets().f328579c + b17.width(), c10943x503f3e16.getInitTimelineInsets().f328580d);
            int width = b17.width();
            bx0.h timelineLayoutCalc4 = c10943x503f3e16.getTimelineLayoutCalc();
            if (timelineLayoutCalc4 != null) {
                bx0.f fVar2 = timelineLayoutCalc4.f117810d;
                fVar2.getClass();
                fVar2.f117799r = b18;
                fVar2.f117798q = true;
                fVar2.f117800s.m34344xfffbdf83();
                fVar2.b();
            }
            fy0.o insetsItemDecoration = c10943x503f3e16.getInsetsItemDecoration();
            if (insetsItemDecoration != null) {
                c10943x503f3e16.m47437x4905e9fa().S0(insetsItemDecoration);
            }
            fy0.o oVar = new fy0.o(b18);
            c10943x503f3e16.m47437x4905e9fa().N(oVar);
            c10943x503f3e16.m47450x6d7fa83b(oVar);
            bx0.j uiStyle = c10943x503f3e16.getUiStyle();
            uiStyle.getClass();
            uiStyle.f117828a = b18;
            ex0.a0 timelineVM3 = c10943x503f3e16.getTimelineVM();
            if (timelineVM3 != null) {
                java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f306043f);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(of6, "of(...)");
                timelineVM3.J(of6, null);
            }
            fy0.r scrollHelper = c10943x503f3e16.getScrollHelper();
            if (scrollHelper != null) {
                scrollHelper.d(c10943x503f3e16.m47441x185482f6() + width, false);
            }
            c10943x503f3e16.j();
            c10943x503f3e16.m47437x4905e9fa().D0();
        }
    }

    @Override // gy0.j
    public void d() {
    }

    @Override // gy0.j
    public void e() {
        gy0.j jVar = this.f547512a.K;
        if (jVar != null) {
            jVar.e();
        }
    }

    @Override // gy0.j
    public void f() {
    }

    @Override // gy0.j
    public void g() {
        gy0.j jVar = this.f547512a.K;
        if (jVar != null) {
            jVar.g();
        }
    }

    @Override // gy0.j
    public void h() {
    }

    @Override // gy0.j
    public void i() {
        gy0.j jVar = this.f547512a.K;
        if (jVar != null) {
            jVar.i();
        }
    }
}

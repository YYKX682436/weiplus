package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ey extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fy f215839g;

    public ey(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fy fyVar) {
        this.f215839g = fyVar;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return ((event instanceof ec2.f) && ((ec2.f) event).f332492d == 3) || ((event instanceof fc2.t) && ((fc2.t) event).f342518d == 6);
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        java.lang.Object obj;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof ec2.f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fy fyVar = this.f215839g;
        jz5.f0 f0Var = null;
        if (z17) {
            ec2.f fVar = (ec2.f) ev6;
            if (fVar.f332492d == 3) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 O6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fy.O6(fyVar);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = O6 != null ? O6.mo7946xf939df19() : null;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
                if (c22848x6ddd90cf != null) {
                    java.util.Iterator it = c22848x6ddd90cf.m82898xfb7e5820().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it.next();
                            if (((in5.c) obj2).mo2128x1ed62e84() == fVar.f332498j) {
                                break;
                            }
                        }
                    }
                    in5.c cVar = (in5.c) obj2;
                    so2.u1 u1Var = cVar instanceof so2.u1 ? (so2.u1) cVar : null;
                    if (u1Var != null) {
                        kd2.j0 j0Var = fyVar.f215977f;
                        long j17 = fVar.f332496h;
                        j0Var.getClass();
                        if (u1Var.h() == 4 && !hc2.o0.E(u1Var.getFeedObject().getFeedObject(), false, 1, null)) {
                            kd2.i0 i0Var = j0Var.f388296b;
                            if (i0Var != null) {
                                if (!(i0Var.f388289a.mo2128x1ed62e84() == u1Var.mo2128x1ed62e84())) {
                                    i0Var = null;
                                }
                                if (i0Var != null) {
                                    i0Var.f388290b = j17;
                                    if (!i0Var.f388291c && j17 > 1) {
                                        ((q04.y) ((xs.k1) i95.n0.c(xs.k1.class))).Di(j0Var.f388295a, 2, j0Var.b(j0Var.f388296b));
                                        i0Var.f388291c = true;
                                    }
                                    f0Var = jz5.f0.f384359a;
                                }
                            }
                            if (f0Var == null) {
                                j0Var.f388296b = new kd2.i0(u1Var, j17, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (ev6 instanceof fc2.t) {
            fc2.t tVar = (fc2.t) ev6;
            if (tVar.f342518d == 6) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 O62 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fy.O6(fyVar);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = O62 != null ? O62.mo7946xf939df19() : null;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = mo7946xf939df192 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df192 : null;
                if (c22848x6ddd90cf2 != null) {
                    java.util.Iterator it6 = c22848x6ddd90cf2.m82898xfb7e5820().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it6.next();
                            if (((in5.c) obj).mo2128x1ed62e84() == tVar.f342525k) {
                                break;
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
                    if (abstractC14490x69736cb5 != null) {
                        fyVar.f215975d = abstractC14490x69736cb5;
                        kd2.j0 j0Var2 = fyVar.f215977f;
                        j0Var2.getClass();
                        eo2.f fVar2 = eo2.f.f337098a;
                        ya2.b2 contact = abstractC14490x69736cb5.getContact();
                        eo2.d c17 = fVar2.c(contact != null ? contact.D0() : "");
                        boolean d17 = fVar2.d(c17 != null ? java.lang.Integer.valueOf(c17.f337094c) : null);
                        if (abstractC14490x69736cb5.h() == 4 && !hc2.o0.E(abstractC14490x69736cb5.getFeedObject().getFeedObject(), false, 1, null) && d17) {
                            return;
                        }
                        j0Var2.c();
                    }
                }
            }
        }
    }
}

package ap1;

/* loaded from: classes5.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.f1 f94180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ap1.f1 f1Var) {
        super(1);
        this.f94180d = f1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof ap1.d)) {
            ap1.d dVar2 = (ap1.d) dVar;
            ap1.f1 f1Var = this.f94180d;
            f1Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report, pageId=");
            long j17 = state.f94160h;
            sb6.append(j17);
            sb6.append(", action.event=");
            ap1.e eVar = dVar2.f94165a;
            sb6.append(eVar);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = f1Var.f94194d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.S;
            if (j17 == 9) {
                int ordinal = eVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.X;
                    } else if (ordinal == 2) {
                        y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.V;
                    } else if (ordinal == 3) {
                        y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.W;
                    } else if (ordinal == 4) {
                        y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.T;
                    } else {
                        if (ordinal != 5) {
                            throw new jz5.j();
                        }
                        y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.U;
                    }
                }
            } else {
                y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174485t;
                if (j17 == 4) {
                    int ordinal2 = eVar.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 == 2) {
                                y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174488w;
                            } else if (ordinal2 == 3) {
                                y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174489x;
                            } else if (ordinal2 == 4) {
                                y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174486u;
                            } else {
                                if (ordinal2 != 5) {
                                    throw new jz5.j();
                                }
                                y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174487v;
                            }
                        }
                    }
                } else {
                    y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174493y0;
                    if (j17 == 11) {
                        int ordinal3 = eVar.ordinal();
                        if (ordinal3 != 0) {
                            if (ordinal3 == 1) {
                                y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174496z1;
                            } else if (ordinal3 == 2) {
                                y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174491x1;
                            } else if (ordinal3 == 3) {
                                y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174494y1;
                            } else if (ordinal3 == 4) {
                                y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174475l1;
                            } else {
                                if (ordinal3 != 5) {
                                    throw new jz5.j();
                                }
                                y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174481p1;
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "Skip report for pageId=" + j17);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + y1Var);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
            c6839x89375b51.f141599d = y1Var.f174497d;
            c6839x89375b51.f141600e = y1Var.f174498e;
            yz5.l lVar = dVar2.f94166b;
            if (lVar != null) {
                lVar.mo146xb9724478(c6839x89375b51);
            }
            c6839x89375b51.k();
        }
        return jz5.f0.f384359a;
    }
}

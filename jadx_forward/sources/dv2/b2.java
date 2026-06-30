package dv2;

/* loaded from: classes2.dex */
public final class b2 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dv2.e2 f325351g;

    public b2(dv2.e2 e2Var) {
        this.f325351g = e2Var;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    @Override // fc2.d
    public void G0(fc2.a ev6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof ec2.f;
        boolean z18 = true;
        dv2.e2 e2Var = this.f325351g;
        if (z17) {
            ec2.f fVar = (ec2.f) ev6;
            if (fVar.f332492d == 3) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 O6 = dv2.e2.O6(e2Var);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = O6 != null ? O6.mo7946xf939df19() : null;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
                if (c22848x6ddd90cf != null) {
                    java.util.Iterator it = c22848x6ddd90cf.m82898xfb7e5820().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((in5.c) obj).mo2128x1ed62e84() == fVar.f332498j) {
                                break;
                            }
                        }
                    }
                    in5.c cVar = (in5.c) obj;
                    so2.u1 u1Var = cVar instanceof so2.u1 ? (so2.u1) cVar : null;
                    if (u1Var != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = e2Var.f325380g;
                        abstractC14490x69736cb52 = abstractC14490x69736cb53 != null && (abstractC14490x69736cb53.mo2128x1ed62e84() > ((so2.u1) cVar).mo2128x1ed62e84() ? 1 : (abstractC14490x69736cb53.mo2128x1ed62e84() == ((so2.u1) cVar).mo2128x1ed62e84() ? 0 : -1)) == 0 ? u1Var : null;
                        if (abstractC14490x69736cb52 != null) {
                            dv2.y1 y1Var = new dv2.y1(abstractC14490x69736cb52.mo2128x1ed62e84(), fVar.f332496h, ((java.lang.Number) ((jz5.n) e2Var.f325378e).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) e2Var.f325379f).mo141623x754a37bb()).intValue(), 0L, 16, null);
                            if (((java.lang.Boolean) ((jz5.n) e2Var.f325377d).mo141623x754a37bb()).booleanValue()) {
                                int i17 = dv2.e2.f325375i;
                                int i18 = y1Var.f325512c;
                                int i19 = y1Var.f325513d;
                                if ((i18 != 25 || (i19 != 1 && i19 != 2 && i19 != 3 && i19 != 11)) && (i18 != 38 || i19 != 3)) {
                                    z18 = false;
                                }
                                if (z18) {
                                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = dv2.e2.f325376m;
                                    copyOnWriteArrayList.removeIf(new dv2.d2(y1Var));
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWatchHistoryUIC", "saveOrUpdateWatchItem: " + y1Var + " size: " + copyOnWriteArrayList.size());
                                    copyOnWriteArrayList.add(y1Var);
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
                return;
            }
        }
        if (ev6 instanceof fc2.t) {
            fc2.t tVar = (fc2.t) ev6;
            if (tVar.f342518d == 6) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 O62 = dv2.e2.O6(e2Var);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = O62 != null ? O62.mo7946xf939df19() : null;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = mo7946xf939df192 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df192 : null;
                if (c22848x6ddd90cf2 != null) {
                    java.util.Iterator it6 = c22848x6ddd90cf2.m82898xfb7e5820().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            abstractC14490x69736cb5 = 0;
                            break;
                        } else {
                            abstractC14490x69736cb5 = it6.next();
                            if (((in5.c) abstractC14490x69736cb5).mo2128x1ed62e84() == tVar.f342525k && tVar.f342527m > 0) {
                                break;
                            }
                        }
                    }
                    abstractC14490x69736cb52 = abstractC14490x69736cb5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? abstractC14490x69736cb5 : null;
                    if (abstractC14490x69736cb52 != null) {
                        e2Var.f325380g = abstractC14490x69736cb52;
                    }
                }
            }
        }
    }
}

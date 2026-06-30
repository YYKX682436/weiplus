package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class a2 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f215240g;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f2Var) {
        this.f215240g = f2Var;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return (event instanceof ec2.f) && ((ec2.f) event).f332492d == 3;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            if (fVar.f332492d == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f2Var = this.f215240g;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 R6 = f2Var.R6();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = R6 != null ? R6.mo7946xf939df19() : null;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
                if (c22848x6ddd90cf != null) {
                    java.util.Iterator it = c22848x6ddd90cf.m82898xfb7e5820().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((so2.j5) obj).mo2128x1ed62e84() == fVar.f332498j) {
                                break;
                            }
                        }
                    }
                    so2.j5 j5Var = (so2.j5) obj;
                    so2.u1 u1Var = j5Var instanceof so2.u1 ? (so2.u1) j5Var : null;
                    if (u1Var == null || !u1Var.getFeedObject().m59314x4d5c4d55()) {
                        return;
                    }
                    int intValue = ((java.lang.Number) ((jz5.n) f2Var.f215851f).mo141623x754a37bb()).intValue();
                    int i17 = fVar.f332497i;
                    jz5.g gVar = f2Var.f215852g;
                    int intValue2 = i17 - ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
                    int i18 = fVar.f332496h;
                    if (intValue <= i18 && i18 <= intValue2) {
                        u1Var.f492164e = false;
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.y1(f2Var));
                    }
                    if (fVar.f332496h < fVar.f332497i - ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() || u1Var.f492164e) {
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAddHistoryUIC", "onEventHappen: delete from history, offset = " + fVar.f332496h + ", total = " + fVar.f332497i + ", feedId = " + fVar.f332498j);
                    u1Var.f492164e = true;
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.z1(f2Var, ev6));
                }
            }
        }
    }
}

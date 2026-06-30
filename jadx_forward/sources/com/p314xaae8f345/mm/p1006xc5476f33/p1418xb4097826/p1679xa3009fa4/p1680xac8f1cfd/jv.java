package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class jv extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pv f216432g;

    public jv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pv pvVar) {
        this.f216432g = pvVar;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return event instanceof ec2.f;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        in5.s0 s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        boolean containsKey;
        r45.qq2 qq2Var;
        r45.gr2 gr2Var;
        r45.qq2 qq2Var2;
        r45.gr2 gr2Var2;
        r45.qq2 qq2Var3;
        r45.gr2 gr2Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pv pvVar = this.f216432g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) pvVar.f217161d).mo141623x754a37bb();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7946xf939df19() : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (c22848x6ddd90cf != null && (ev6 instanceof ec2.f)) {
            ec2.f fVar = (ec2.f) ev6;
            int i17 = fVar.f332492d;
            if (i17 == 2) {
                in5.s0 s0Var2 = (in5.s0) in5.n0.Y(c22848x6ddd90cf, fVar.f332498j, false, 2, null);
                if (s0Var2 == null || (abstractC14490x69736cb52 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var2.f374658i) == null) {
                    return;
                }
                pvVar.Q6(abstractC14490x69736cb52);
                return;
            }
            if (i17 != 3 || (s0Var = (in5.s0) in5.n0.Y(c22848x6ddd90cf, fVar.f332498j, false, 2, null)) == null || (abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i) == null) {
                return;
            }
            r45.dm2 m76806xdef68064 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
            boolean z17 = false;
            if (m76806xdef68064 != null && (qq2Var3 = (r45.qq2) m76806xdef68064.m75936x14adae67(3)) != null && (gr2Var3 = (r45.gr2) qq2Var3.m75936x14adae67(4)) != null) {
                z17 = gr2Var3.m75933x41a8a7f2(0);
            }
            r45.dm2 m76806xdef680642 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
            int m75939xb282bd08 = (m76806xdef680642 == null || (qq2Var2 = (r45.qq2) m76806xdef680642.m75936x14adae67(3)) == null || (gr2Var2 = (r45.gr2) qq2Var2.m75936x14adae67(4)) == null) ? -1 : gr2Var2.m75939xb282bd08(1);
            r45.dm2 m76806xdef680643 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
            if (m76806xdef680643 != null && (qq2Var = (r45.qq2) m76806xdef680643.m75936x14adae67(3)) != null && (gr2Var = (r45.gr2) qq2Var.m75936x14adae67(4)) != null) {
                gVar = gr2Var.m75934xbce7f2f(2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfilePreloadUIC", "[handlePreloadOnProgress] isPreload:" + z17 + ", preloadWaitTime:" + m75939xb282bd08 + ", offset:" + fVar.f332496h);
            if (z17) {
                java.lang.String userName = abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c();
                r45.xk m59211x37f6d02b = abstractC14490x69736cb5.getFeedObject().m59211x37f6d02b();
                if (m75939xb282bd08 <= 0 || fVar.f332496h < m75939xb282bd08 || abstractC14490x69736cb5.getIsDeepEnjoy()) {
                    return;
                }
                java.util.Set set = pvVar.f217162e;
                if (set.contains(userName) || m59211x37f6d02b != null) {
                    return;
                }
                bu2.g0 g0Var = bu2.g0.f106044a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                synchronized (g0Var) {
                    containsKey = bu2.g0.f106045b.containsKey(userName);
                }
                if (containsKey) {
                    return;
                }
                set.add(userName);
                pvVar.R6(userName, "handlePreloadOnProgress", abstractC14490x69736cb5.getFeedObject(), gVar);
            }
        }
    }
}

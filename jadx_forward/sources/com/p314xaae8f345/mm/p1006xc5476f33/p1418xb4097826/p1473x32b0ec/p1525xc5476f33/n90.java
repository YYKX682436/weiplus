package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class n90 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 f195134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f195135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var, r45.ch1 ch1Var) {
        super(0);
        this.f195134d = ea0Var;
        this.f195135e = ch1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var = this.f195134d;
        so2.j5 j5Var = ((mm2.f6) ea0Var.P0(mm2.f6.class)).f410582w;
        cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
        if (m0Var != null && (m75934xbce7f2f = this.f195135e.m75934xbce7f2f(4)) != null) {
            byte[] g17 = m75934xbce7f2f.g();
            r45.od2 od2Var = new r45.od2();
            try {
                od2Var.mo11468x92b714fd(g17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                od2Var = null;
            }
            if (od2Var != null && m0Var.f124918d == od2Var.m75942xfb822ef2(1)) {
                r45.y23 y23Var = m0Var.f124901v;
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = od2Var.m75934xbce7f2f(0);
                if (m75934xbce7f2f2 != null) {
                    byte[] g18 = m75934xbce7f2f2.g();
                    r45.ax4 ax4Var = new r45.ax4();
                    try {
                        ax4Var.mo11468x92b714fd(g18);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                        ax4Var = null;
                    }
                    if (ax4Var != null) {
                        java.util.Iterator it = ax4Var.m75941xfb821914(0).iterator();
                        while (it.hasNext()) {
                            r45.gs6 gs6Var = (r45.gs6) it.next();
                            r45.y23 y23Var2 = (r45.y23) gs6Var.m75936x14adae67(1);
                            if (y23Var2 != null) {
                                if (gs6Var.m75939xb282bd08(2) == 1) {
                                    r45.bd5 b17 = st2.w1.b(y23Var2);
                                    java.lang.Integer valueOf = b17 != null ? java.lang.Integer.valueOf(b17.m75939xb282bd08(13)) : null;
                                    r45.bd5 b18 = st2.w1.b(y23Var);
                                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, b18 != null ? java.lang.Integer.valueOf(b18.m75939xb282bd08(13)) : null)) {
                                    }
                                }
                                int m75939xb282bd08 = gs6Var.m75939xb282bd08(0);
                                if (m75939xb282bd08 == 1) {
                                    y23Var.set(54, y23Var2.m75941xfb821914(54));
                                } else if (m75939xb282bd08 == 2) {
                                    y23Var.set(70, (r45.bd5) y23Var2.m75936x14adae67(70));
                                    r45.mw3 mw3Var = (r45.mw3) y23Var.m75936x14adae67(44);
                                    if (mw3Var != null) {
                                        r45.mw3 mw3Var2 = (r45.mw3) y23Var2.m75936x14adae67(44);
                                        mw3Var.set(4, mw3Var2 != null ? (r45.bd5) mw3Var2.m75936x14adae67(4) : null);
                                    }
                                }
                            }
                        }
                        xt2.e3.j(ea0Var.y1(), m0Var.f124901v, true, false, 4, null);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}

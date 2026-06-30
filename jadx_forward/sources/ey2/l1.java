package ey2;

/* loaded from: classes2.dex */
public final class l1 extends pf5.o0 implements xy2.l {
    public void N6(r45.xb1 resp) {
        r45.db1 db1Var;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(30);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_config_item(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            db1Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj).m75945x2fec8307(0), "help_promotion_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = yy0Var != null ? yy0Var.m75934xbce7f2f(1) : null;
        if (m75934xbce7f2f != null) {
            db1Var = new r45.db1();
            db1Var.mo11468x92b714fd(m75934xbce7f2f.g());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPromotionVM", "[initPromotionInfo] promotionInfo:" + db1Var);
        boolean m75933x41a8a7f2 = db1Var != null ? db1Var.m75933x41a8a7f2(0) : false;
        boolean m75933x41a8a7f22 = db1Var != null ? db1Var.m75933x41a8a7f2(1) : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPromotionVM", "modify promotionInfo switch " + m75933x41a8a7f2 + " isHide " + m75933x41a8a7f22);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_PROMOTION_SWITCH_BOOLEAN_SYNC, java.lang.Boolean.valueOf(m75933x41a8a7f2));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_PROMOTION_HIDE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(m75933x41a8a7f22));
    }

    public boolean O6() {
        return gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_PROMOTION_HIDE_BOOLEAN_SYNC, false);
    }
}

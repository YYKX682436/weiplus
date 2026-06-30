package ey2;

/* loaded from: classes2.dex */
public final class v0 extends pf5.o0 implements xy2.i {
    public void N6(r45.xb1 resp) {
        java.lang.Object obj;
        r45.ac1 ac1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(30);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_config_item(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj).m75945x2fec8307(0), "interaction_strong_toast_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = yy0Var != null ? yy0Var.m75934xbce7f2f(1) : null;
        if (m75934xbce7f2f != null) {
            ac1Var = new r45.ac1();
            ac1Var.mo11468x92b714fd(m75934xbce7f2f.g());
        } else {
            ac1Var = null;
        }
        java.lang.Integer valueOf = ac1Var != null ? java.lang.Integer.valueOf(ac1Var.m75939xb282bd08(0)) : null;
        java.util.LinkedList m75941xfb8219142 = ac1Var != null ? ac1Var.m75941xfb821914(1) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderInteractionStrongLikeToastConfigVM", "modify interactionStrongLikeToastConfig, globalFeatureSwitch" + valueOf + ", breakPoints:" + m75941xfb8219142);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_INTERACTION_STRONG_LIKE_TOAST_INT_SYNC, valueOf);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_INTERACTION_STRONG_LIKE_TOAST_BREAK_POINTS_STRING_SYNC, m75941xfb8219142 != null ? kz5.n0.g0(m75941xfb8219142, ",", null, null, 0, null, null, 62, null) : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderInteractionStrongLikeToastConfigVM", "initInteractionStrongLikeToastConfig, config: " + ac1Var);
    }
}

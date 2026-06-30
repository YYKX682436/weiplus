package ey2;

/* loaded from: classes2.dex */
public final class b2 extends pf5.o0 implements xy2.m {
    public void N6(r45.xb1 resp) {
        java.lang.Object obj;
        r45.ys2 ys2Var;
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
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj).m75945x2fec8307(0), "finder_reddot_enhance_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = yy0Var != null ? yy0Var.m75934xbce7f2f(1) : null;
        if (m75934xbce7f2f != null) {
            ys2Var = new r45.ys2();
            ys2Var.mo11468x92b714fd(m75934xbce7f2f.g());
        } else {
            ys2Var = null;
        }
        java.lang.Integer valueOf = ys2Var != null ? java.lang.Integer.valueOf(ys2Var.m75939xb282bd08(0)) : null;
        java.lang.Integer valueOf2 = ys2Var != null ? java.lang.Integer.valueOf(ys2Var.m75939xb282bd08(1)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReddotEnhanceConfigVM", "modify reddotEnhanceInfo, n: " + valueOf + ", m: " + valueOf2);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_REDDOT_ENHANCE_N_INT_SYNC, valueOf);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_REDDOT_ENHANCE_M_INT_SYNC, valueOf2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReddotEnhanceConfigVM", "initReddotEnhanceInfo, reddotEnhanceInfo: " + ys2Var);
    }
}

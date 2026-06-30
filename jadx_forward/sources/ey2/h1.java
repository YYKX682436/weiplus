package ey2;

/* loaded from: classes2.dex */
public final class h1 extends pf5.o0 implements xy2.k {
    public void N6(r45.xb1 resp) {
        java.lang.Object obj;
        r45.gt4 gt4Var;
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
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj).m75945x2fec8307(0), "native_drama_info")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = yy0Var != null ? yy0Var.m75934xbce7f2f(1) : null;
        if (m75934xbce7f2f != null) {
            gt4Var = new r45.gt4();
            gt4Var.mo11468x92b714fd(m75934xbce7f2f.g());
        } else {
            gt4Var = null;
        }
        java.lang.Integer valueOf = gt4Var != null ? java.lang.Integer.valueOf(gt4Var.m75939xb282bd08(0)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNativeDramaConfigVM", "setNativeDramaInfo, entrySwitch: " + valueOf);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NATIVE_DRAMA_TAB_SWITCH_INT_SYNC, java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNativeDramaConfigVM", "initNativeDramaInfo, nativeDramaInfo: " + gt4Var + ' ');
    }

    public boolean O6() {
        cq.k1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209213ed).mo141623x754a37bb()).r()).booleanValue()) {
            return true;
        }
        cq.k1.a();
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209194dd).mo141623x754a37bb()).r()).booleanValue()) {
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NATIVE_DRAMA_TAB_SWITCH_INT_SYNC, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNativeDramaConfigVM", "hasEntrySwitch storedValue=" + r17);
            if (r17 == 1) {
                return true;
            }
        }
        return false;
    }
}

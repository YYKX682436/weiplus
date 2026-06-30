package ig2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ig2.e f372905a = new ig2.e();

    public final boolean a(r45.nw1 liveinfo) {
        r45.nw1 nw1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveinfo, "liveinfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchABTes", "isFluentEnable finderObject liveId: " + liveinfo.m75942xfb822ef2(0));
        long m75942xfb822ef2 = liveinfo.m75942xfb822ef2(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchABTes", "isFluentEnable finderObject liveId: " + m75942xfb822ef2);
        if (m75942xfb822ef2 == 0) {
            return false;
        }
        gk2.e eVar = gk2.e.f354004n;
        return eVar != null && (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) != null && (m75942xfb822ef2 > nw1Var.m75942xfb822ef2(0) ? 1 : (m75942xfb822ef2 == nw1Var.m75942xfb822ef2(0) ? 0 : -1)) == 0;
    }

    public final boolean b(zy2.nc feedData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedData, "feedData");
        r45.nw1 nw1Var = feedData.f559031d;
        if (nw1Var == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchABTes", "isFluentEnable finderObject liveId: " + nw1Var.m75942xfb822ef2(0));
        return f372905a.a(nw1Var);
    }

    public final boolean c() {
        ae2.b2 b2Var = ae2.b2.f84994a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.L).mo141623x754a37bb()).r()).intValue() == 1 && d();
    }

    public final boolean d() {
        ae2.b2 b2Var = ae2.b2.f84994a;
        return (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f84993J).mo141623x754a37bb()).r()).intValue() != 1 || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.d0()) ? false : true;
    }
}

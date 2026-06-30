package yl2;

/* loaded from: classes3.dex */
public final class j {
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final jz5.l a() {
        int i17;
        int b17 = b();
        if (!c()) {
            return null;
        }
        if (b17 == 1) {
            i17 = 64;
        } else if (b17 != 2) {
            i17 = 4;
            if (b17 != 3) {
                i17 = b17 != 4 ? b17 != 5 ? 0 : 124 : 8;
            }
        } else {
            i17 = 32;
        }
        return new jz5.l(java.lang.Integer.valueOf(i17), "https://weixin110.qq.com/security/newreadtemplate?t=roomlive/verify");
    }

    public final int b() {
        return ((java.lang.Number) ae2.in.f85221a.S().r()).intValue();
    }

    public final boolean c() {
        int intValue = ((java.lang.Number) ae2.in.f85221a.S().r()).intValue();
        return 1 <= intValue && intValue < 6;
    }

    public final boolean d() {
        if (c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "isUserVerified: mock mode (type=" + b() + ") - returning not verified");
            return false;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_VERIFY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) m17).booleanValue();
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f85443w4).mo141623x754a37bb()).r()).booleanValue()) {
            booleanValue = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "isUserVerified: localState=" + booleanValue);
        return booleanValue;
    }
}

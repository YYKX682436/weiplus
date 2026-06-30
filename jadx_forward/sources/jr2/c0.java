package jr2;

/* loaded from: classes8.dex */
public final class c0 implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 p27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p27, "p2");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "finderuserreinit")) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1279L, 25L, 1L);
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_USER_VERSION_INT_SYNC, 0);
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(".sysmsg.userver"), 0);
        java.lang.String str2 = (java.lang.String) values.get(".sysmsg.username");
        int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(".sysmsg.usertype"), 0);
        boolean z17 = D12 == 1 ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g92.b.f351302e.T0(), str2) : D12 == 2 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.z1.r(), str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ReInitSysMsgConsumer", "[consumeNewXml] subType=" + str + " userVersion=" + D1 + " curUserVersion=" + r17 + " username=" + str2 + " userType=" + D12 + " isValid=" + z17);
        if (!z17) {
            return null;
        }
        if (D12 == 1) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC, "");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_REINIT_USER_VERSION_INT_SYNC, 0);
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC, str2);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_REINIT_USER_VERSION_INT_SYNC, java.lang.Integer.valueOf(D1));
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_USER_HARD_REINIT_INT_SYNC, 1);
        return null;
    }
}

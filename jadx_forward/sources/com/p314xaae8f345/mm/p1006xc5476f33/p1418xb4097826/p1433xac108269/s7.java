package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class s7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s7 f184071a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s7();

    public boolean a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        m92.b j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(context), false, 2, null);
        return ((j37 != null ? j37.f68698x26b1b2e8 : 0) & 262144) != 0;
    }

    public boolean b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        i95.m c17 = i95.n0.c(l40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        int dh6 = l40.e.dh((l40.e) c17, context, null, 2, null);
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.R0).mo141623x754a37bb()).r()).intValue();
        if (intValue == 1) {
            mo168058x74219ae7 = true;
        } else if (intValue == 2) {
            dh6 = 1;
        } else if (intValue == 3) {
            dh6 = 4;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSwitchApi", "showFinderEntryAtWxMe teenMode:" + mo168058x74219ae7 + ", state:" + dh6);
        if (mo168058x74219ae7) {
            return false;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("finder");
        boolean z17 = xy2.c.e(context).length() > 0;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.S0).mo141623x754a37bb()).r()).intValue() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSwitchApi", "ME_FINDER_ENTRY_INDEPENDENCE_SWITCH hasCreatedIdentity:" + z17);
            return z17;
        }
        if (dh6 == 1 || dh6 == 4 || dh6 == 5) {
            return false;
        }
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Z0).mo141623x754a37bb()).r()).intValue();
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.T0).mo141623x754a37bb()).r()).intValue() == 1;
        boolean z19 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.U0).mo141623x754a37bb()).r()).intValue() == 1;
        boolean z27 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.V0).mo141623x754a37bb()).r()).intValue() == 1;
        boolean a17 = a(context);
        boolean z28 = (c01.z1.j() & 34359738368L) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSwitchApi", "[showFinderEntryAtWxMe] enable:" + intValue2 + ", switchA:" + z18 + ", switchB:" + z19 + ", switchC:" + z27 + ", showFinderAtWxProfile:" + a17 + " hasCreatedIdentity:" + z17 + " isCloseInFindMorePage:" + z28);
        if (intValue2 != 0) {
            return intValue2 == 1 && z17 && !z28;
        }
        if (z18) {
            return true;
        }
        return z19 && z27 && a17;
    }

    public boolean c() {
        boolean vk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.V0).mo141623x754a37bb()).r()).intValue() == 1;
        m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
        boolean v07 = I1 != null ? I1.v0() : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSwitchApi", "showFinderEntrySetting hasFinderAccount" + vk6 + ", switch:" + z17 + ", accountLimited: " + v07);
        return vk6 && z17 && !v07;
    }

    public boolean d(zy2.nb nbVar, zy2.nb nbVar2) {
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q7.f184020a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r7 r7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r7(nbVar);
        java.lang.Integer num = (java.lang.Integer) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q7.f184020a.get(1);
        if (num == null) {
            num = 0;
        }
        if (c01.id.e() - num.intValue() > com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q7.f184021b) {
            new db2.s1(kz5.b0.c(1)).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p7(nbVar2, 1, r7Var));
        }
        return gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHOW_FINDER_RECENT_LIKE_INT_SYNC, 0) == 1;
    }
}

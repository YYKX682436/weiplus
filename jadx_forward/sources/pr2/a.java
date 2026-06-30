package pr2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final pr2.a f439482a = new pr2.a();

    public final boolean a() {
        if (!gm0.j1.a()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("account not Ready!");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.EntrancePermission", sb6.toString());
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.P0).mo141623x754a37bb()).r()).intValue();
        if (intValue != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.EntrancePermission", "[hasFinderEntrancePermission] debugConfig=" + intValue);
            return intValue == 1;
        }
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderTimelineEntry", 100);
        boolean z18 = b17 != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.EntrancePermission", "[hasFinderEntrancePermission] hasPermission=" + z18 + " serverConfig=" + b17 + " isSpam=" + (hz2.d.f367846a.b("entrance") == 2));
        return z18;
    }

    public final void b(long j17, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        long j18 = j17 & (-34359738369L);
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(j18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "openFinderEntrance extstatus:" + j18);
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 57;
        p53Var.f464295e = 1;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
    }
}

package o72;

/* loaded from: classes9.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final o72.d3 f424854a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f424855b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f424856c = true;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.fav.C20149xaaea51e2 f424857d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f424858e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f424859f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f424860g;

    static {
        boolean z17;
        o72.d3 d3Var = new o72.d3();
        f424854a = d3Var;
        f424857d = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.fav.C20149xaaea51e2();
        boolean z18 = true;
        f424858e = true;
        d3Var.e();
        d3Var.d();
        f424858e = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.fav.C20150x19a443b4().p();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSwitchManager", "[pullFavLogicOpSwitch] logicOpSwitch = " + f424858e);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.api.C13544x6fe5609d c13544x6fe5609d = new com.p314xaae8f345.mm.p1006xc5476f33.fav.api.C13544x6fe5609d();
        bm5.o1 o1Var = bm5.o1.f104252a;
        if (o1Var.m(c13544x6fe5609d) == 0) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.q1) ((o72.v3) i95.n0.c(o72.v3.class))).getClass();
            z17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.k.f299227b.e(c01.z1.r());
        } else {
            z17 = o1Var.h(c13544x6fe5609d) == 1;
        }
        f424859f = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.api.C13545x4f9859b2 c13545x4f9859b2 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.api.C13545x4f9859b2();
        if (o1Var.m(c13545x4f9859b2) == 0) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.q1) ((o72.v3) i95.n0.c(o72.v3.class))).getClass();
            z18 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.k.f299227b.d(c01.z1.r());
        } else if (o1Var.h(c13545x4f9859b2) != 1) {
            z18 = false;
        }
        f424860g = z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSwitchManager", "[pullMarkdownNoteSwitch] markdownNoteSwitch = " + f424859f + ", markdownNotePublishSwitch = " + f424860g);
    }

    public final boolean a() {
        return f424858e;
    }

    public final boolean b() {
        if (((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi()) {
            return f424859f;
        }
        return false;
    }

    public final boolean c() {
        if (((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi()) {
            return f424860g;
        }
        return false;
    }

    public final void d() {
        f424856c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_new_tag_open, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSwitchManager", "[pullFavNewTagSwitch] newTagSwitch = " + f424856c);
    }

    public final void e() {
        f424855b = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.fav.C20151x6a5c6f7c().p();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSwitchManager", "[pullFavXmlSerialSwitch] xmlSerial = " + f424855b);
    }
}

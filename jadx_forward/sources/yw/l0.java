package yw;

/* loaded from: classes11.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.l0 f547922a = new yw.l0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f547923b = true;

    public final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g1 a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterDataMigrateHelper", "doDataMigration");
        f547923b = false;
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.s1> d17 = r01.q3.nj().d1(285212721, 100);
        if (d17.isEmpty()) {
            f547923b = true;
            jx3.f.INSTANCE.w(1971L, 23L, 1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterDataMigrateHelper", "doDataMigration infoList is empty");
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g1 g1Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g1.f299598i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g1Var, "getDefaultInstance(...)");
            return g1Var;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) d17;
        long j17 = (((com.p314xaae8f345.mm.p2621x8fb0427b.s1) linkedList.get(0)).f67296x8340ced5 & (-4294967296L)) >> 32;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g1 g1Var2 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g1();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var : d17) {
            if (s1Var.v0()) {
                g1Var2.f299599d.add(yw.q3.f547970a.a(s1Var, ((s1Var.f67296x8340ced5 & (-4294967296L)) >> 32) == j17));
                g1Var2.f299603h[1] = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterDataMigrateHelper", "doDataMigration size = " + linkedList.size());
        f547923b = true;
        return g1Var2;
    }
}

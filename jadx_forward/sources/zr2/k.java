package zr2;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f556729a = jz5.h.b(zr2.e.f556716d);

    public static final void a(zr2.k kVar, java.util.LinkedList linkedList, int i17, int i18) {
        kVar.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SEARCH_PREFETCH_TIME_LONG_SYNC;
        long t17 = c17.t(u3Var, 0L);
        long a17 = c01.id.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSearchRelPreLoader", "last " + t17 + " interval 2000 cur " + a17 + " objectSize " + linkedList.size());
        long j17 = t17 + ((long) 2000);
        if (j17 > a17) {
            ((ku5.t0) ku5.t0.f394148d).l(new zr2.g(kVar, linkedList, i17, i18), j17 - a17, "FinderSearchRelPreLoader");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSearchRelPreLoader", "doTask %d", java.lang.Long.valueOf(a17));
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(a17));
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(i17));
        if (i18 == 0) {
            i18 = 2;
        }
        new az2.a(linkedList, qt2Var, i18).l().H(new zr2.i(i17, linkedList));
    }
}

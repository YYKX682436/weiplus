package hm4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final hm4.c f363826a = new hm4.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f363827b;

    /* renamed from: c, reason: collision with root package name */
    public static w71.m1 f363828c;

    static {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
        copyOnWriteArraySet.add(new hm4.b());
        f363827b = copyOnWriteArraySet;
        f70.e eVar = (f70.e) i95.n0.c(f70.e.class);
        em4.a aVar = new em4.a();
        ((h70.a) eVar).getClass();
        w71.l1.f524951a.add(aVar);
        ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).Ai();
    }

    public final w71.m1 a() {
        if (f363828c == null) {
            w71.m1 wi6 = ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).wi();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reddotSyncManager: ");
            sb6.append(wi6 != null ? java.lang.Integer.valueOf(wi6.hashCode()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingSyncExtension", sb6.toString());
            f363828c = wi6;
        }
        return f363828c;
    }

    public final boolean b() {
        ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).getClass();
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20770x7317c1e2()) == 1;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "disableTingDiscoverEntryRedDotSync");
        }
        if (!z17) {
            return ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi();
        }
        w71.m1 a17 = a();
        if (a17 != null) {
            p3380x6a61f93.p3386xf51b86f1.C30596x21b1ccf3.m170133x21b231ae(((w71.n1) a17).m105978x2737f10(), 10);
        }
        return false;
    }
}

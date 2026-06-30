package cz2;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final cz2.e f306524a = new cz2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f306525b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f306526c;

    /* renamed from: d, reason: collision with root package name */
    public static int f306527d;

    /* renamed from: e, reason: collision with root package name */
    public static cz2.a f306528e;

    /* renamed from: f, reason: collision with root package name */
    public static cz2.a f306529f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f306530g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f306531h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f306532i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f306533j;

    /* renamed from: k, reason: collision with root package name */
    public static long f306534k;

    static {
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = new java.util.concurrent.ConcurrentSkipListSet();
        f306525b = concurrentSkipListSet;
        f306526c = new java.util.concurrent.ConcurrentSkipListSet();
        f306528e = new cz2.a(200, 60L);
        f306529f = new cz2.a(1000, 60L);
        f306530g = new java.util.concurrent.ConcurrentHashMap();
        f306531h = new java.util.concurrent.ConcurrentHashMap();
        f306532i = new java.util.concurrent.ConcurrentSkipListSet();
        f306533j = new java.util.concurrent.ConcurrentSkipListSet();
        concurrentSkipListSet.add("finderstatsreport");
        concurrentSkipListSet.add("findergetlivemsg");
        concurrentSkipListSet.add("findermarkread");
    }

    public final jz5.l a(java.util.concurrent.ConcurrentHashMap concurrentHashMap, cz2.a aVar, java.lang.String str) {
        java.lang.Object putIfAbsent;
        if (str == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return new jz5.l(java.lang.Boolean.TRUE, null);
        }
        java.lang.String p07 = r26.n0.p0(str, "/", str);
        java.lang.Object obj = concurrentHashMap.get(p07);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(p07, (obj = new cz2.b(0, android.os.SystemClock.elapsedRealtime())))) != null) {
            obj = putIfAbsent;
        }
        cz2.b bVar = (cz2.b) obj;
        if (bVar.f306516a >= aVar.f306514a) {
            if (android.os.SystemClock.elapsedRealtime() - bVar.f306517b <= aVar.f306515b * 60 * 1000) {
                return new jz5.l(java.lang.Boolean.TRUE, bVar);
            }
            bVar.f306516a = 0;
            bVar.f306517b = android.os.SystemClock.elapsedRealtime();
        }
        bVar.f306516a++;
        return new jz5.l(java.lang.Boolean.FALSE, null);
    }

    public final void b() {
        fp.j jVar = new fp.j();
        lb2.j jVar2 = kb2.d.f387763a;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_cgi_block_limit, "200, 60, 1000, 60", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi, "getExpt(...)");
        java.util.List O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(Zi, ",");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(O1);
        java.lang.String str = (java.lang.String) kz5.n0.a0(O1, 0);
        f306528e = new cz2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str != null ? r26.n0.u0(str).toString() : null, 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(((java.lang.String) kz5.n0.a0(O1, 1)) != null ? r26.n0.u0(r11).toString() : null, 0));
        java.lang.String str2 = (java.lang.String) kz5.n0.a0(O1, 2);
        f306529f = new cz2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str2 != null ? r26.n0.u0(str2).toString() : null, 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(((java.lang.String) kz5.n0.a0(O1, 3)) != null ? r26.n0.u0(r6).toString() : null, 0));
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.d0 d0Var = e42.d0.clicfg_finder_cgi_blocklist;
        java.lang.String Zi2 = ((h62.d) e0Var).Zi(d0Var, "", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi2, "getExpt(...)");
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(r26.n0.u0(Zi2).toString(), 0);
        f306527d = D1;
        if (D1 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.CgiStrategy", "blockAll cgi " + f306527d);
            return;
        }
        java.lang.String Zi3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(d0Var, "", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi3, "getExpt(...)");
        java.util.List O12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(Zi3, ",");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiStrategy", "init blockString " + Zi2 + " limitString " + Zi + " size " + O12.size() + " autoLimitErrorBlock:" + f306528e.f306514a + ' ' + f306528e.f306515b + " autoLimitBlock:" + f306529f.f306514a + ' ' + f306529f.f306515b + " errorReport " + f306532i.size() + ' ' + f306533j.size() + " cost:" + jVar.a());
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = f306526c;
        concurrentSkipListSet.clear();
        concurrentSkipListSet.addAll(O12);
    }
}

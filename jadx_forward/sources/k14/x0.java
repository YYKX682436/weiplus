package k14;

/* loaded from: classes11.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f384935a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f384936b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f384937c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f384938d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f384939e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f384940f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f384941g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f384942h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f384943i = new java.util.HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashSet f384944j = new java.util.HashSet();

    /* renamed from: k, reason: collision with root package name */
    public k14.w0 f384945k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hq f384946l;

    /* renamed from: m, reason: collision with root package name */
    public long f384947m;

    /* renamed from: n, reason: collision with root package name */
    public wu5.b f384948n;

    public x0(boolean z17, boolean z18, boolean z19, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hq hqVar) {
        this.f384935a = z17;
        this.f384936b = z18;
        this.f384937c = z19;
        int i17 = (z18 ? 1 : 0) + (z17 ? 1 : 0) + (z19 ? 1 : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactEngine", "[UnfamiliarContactEngine] count:%s [%s:%s:%s]", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z19));
        this.f384938d = new java.util.concurrent.CountDownLatch(i17);
        this.f384939e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("UnfamiliarContactEngine");
        this.f384946l = hqVar;
    }

    public final void a(java.util.LinkedList linkedList, int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i18 = i17 + 10;
        if (i18 >= linkedList.size()) {
            i18 = linkedList.size();
        }
        int i19 = i18;
        java.util.List subList = linkedList.subList(i17, i19);
        p13.u uVar = new p13.u();
        uVar.f432673b = 8;
        uVar.f432674c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(subList, ",");
        uVar.f432684m = new k14.t0(this, i19, subList, linkedList, currentTimeMillis);
        uVar.f432685n = this.f384939e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }
}

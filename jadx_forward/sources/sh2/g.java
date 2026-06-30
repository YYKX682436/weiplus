package sh2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final sh2.g f489553e = new sh2.g();

    /* renamed from: a, reason: collision with root package name */
    public final fp0.o f489554a = new fp0.o(new gp0.g(new gp0.b(100, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "finder_action_like_post_quene"));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f489555b = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f489556c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f489557d = new sh2.f(this);

    public final void a() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f489555b;
        sh2.a aVar = (sh2.a) concurrentLinkedQueue.poll();
        if (aVar == null) {
            return;
        }
        boolean z17 = aVar.f489542b < 2 && c01.id.a() - aVar.f489543c <= ((long) 1200000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLikeActionMgr", "tryNext isValid:" + z17 + " action:" + aVar + " size:" + concurrentLinkedQueue.size());
        if (z17) {
            this.f489554a.b(new sh2.j(aVar), new sh2.e(this, aVar));
        } else {
            a();
        }
    }
}

package gr3;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final gr3.c f356381a = new gr3.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f356382b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f356383c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f356384d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f356385e = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f356386f = new java.util.concurrent.atomic.AtomicLong(0);

    public static final void c(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2127L, j17, 1L, false);
    }

    public static final void d(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String b17 = f356381a.b(activity);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f356382b;
        java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(b17);
        if (l17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizProfileMonitor", "recordFirstScreenLoadEnd: startTime is null for " + b17);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - l17.longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(2127L, 11L, currentTimeMillis, false);
        if (currentTimeMillis > 3000) {
            g0Var.mo68477x336bdfd8(2127L, 13L, 1L, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizProfileMonitor", "recordFirstScreenLoadEnd: white screen, duration=" + currentTimeMillis + "ms");
        }
        concurrentHashMap.remove(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileMonitor", "bobkw recordFirstScreenLoadEnd: duration=" + currentTimeMillis + "ms");
    }

    public static final void e(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String a17 = f356381a.a(activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f356384d;
        java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(a17);
        if (l17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizProfileMonitor", "recordProfileDataFetchEnd: startTime is null for " + a17);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2127L, 30L, java.lang.System.currentTimeMillis() - l17.longValue(), false);
            concurrentHashMap.remove(a17);
        }
    }

    public static final void f(android.app.Activity activity, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        f356383c.put(f356381a.b(activity) + "_tab_" + i17, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final java.lang.String a(android.app.Activity activity, java.lang.String str) {
        return b(activity) + '_' + str;
    }

    public final java.lang.String b(android.app.Activity activity) {
        if (activity == null) {
            return java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        return activity.getClass().getSimpleName() + '_' + java.lang.System.identityHashCode(activity);
    }
}

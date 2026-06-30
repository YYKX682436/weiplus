package l36;

/* loaded from: classes16.dex */
public final class t {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.Executor f397171g;

    /* renamed from: a, reason: collision with root package name */
    public final int f397172a;

    /* renamed from: b, reason: collision with root package name */
    public final long f397173b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f397174c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Deque f397175d;

    /* renamed from: e, reason: collision with root package name */
    public final o36.e f397176e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f397177f;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        java.util.concurrent.SynchronousQueue synchronousQueue = new java.util.concurrent.SynchronousQueue();
        byte[] bArr = m36.e.f404919a;
        f397171g = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new m36.d("OkHttp ConnectionPool", true));
    }

    public t() {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        this.f397174c = new l36.s(this);
        this.f397175d = new java.util.ArrayDeque();
        this.f397176e = new o36.e();
        this.f397172a = 5;
        this.f397173b = timeUnit.toNanos(5L);
    }

    public final int a(o36.d dVar, long j17) {
        java.util.List list = dVar.f424304n;
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (i17 >= arrayList.size()) {
                return arrayList.size();
            }
            java.lang.ref.Reference reference = (java.lang.ref.Reference) arrayList.get(i17);
            if (reference.get() != null) {
                i17++;
            } else {
                t36.k.f496994a.m("A connection to " + dVar.f424293c.f397008a.f396977a + " was leaked. Did you forget to close a response body?", ((o36.i) reference).f424318a);
                arrayList.remove(i17);
                dVar.f424301k = true;
                if (arrayList.isEmpty()) {
                    dVar.f424305o = j17 - this.f397173b;
                    return 0;
                }
            }
        }
    }
}

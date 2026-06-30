package ll;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: e, reason: collision with root package name */
    public static ll.m f400645e;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f400646a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ThreadPoolExecutor f400647b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f400648c;

    /* renamed from: d, reason: collision with root package name */
    public int f400649d;

    public m() {
        java.util.concurrent.PriorityBlockingQueue priorityBlockingQueue = new java.util.concurrent.PriorityBlockingQueue(33);
        this.f400648c = new java.util.LinkedList();
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(availableProcessors)};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioThreadPool", "getNormalCorePoolSize cpuCount:%d", objArr);
        int i18 = (availableProcessors * 2) + 2;
        if (i18 > 32) {
            i18 = 32;
        } else if (i18 < 8) {
            i18 = 8;
        }
        this.f400649d = i18;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i18, 32, 120L, java.util.concurrent.TimeUnit.SECONDS, priorityBlockingQueue, new ll.l());
        this.f400647b = threadPoolExecutor;
        threadPoolExecutor.setMaximumPoolSize(32);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioThreadPool", "new AudioThreadPool poolSize:%d", java.lang.Integer.valueOf(i18));
    }

    public static ll.m a() {
        if (f400645e == null) {
            synchronized (ll.m.class) {
                if (f400645e == null) {
                    f400645e = new ll.m();
                }
            }
        }
        return f400645e;
    }

    public static void b(ll.n nVar) {
        ll.m a17 = a();
        synchronized (a17.f400646a) {
            nVar.h();
            a17.f400648c.add(nVar);
            int i17 = a17.f400649d;
            if (a17.f400648c.size() > i17) {
                a17.d(i17 + 2);
            }
        }
        a17.f400647b.execute(nVar);
    }

    public static void c(ll.n nVar) {
        ll.m a17 = a();
        synchronized (a17.f400646a) {
            a17.f400648c.remove(nVar);
            if (a17.f400648c.size() <= 4) {
                a17.f400649d = 4;
                a17.d(4);
            }
        }
        a17.f400647b.remove(nVar);
    }

    public void d(int i17) {
        if (i17 > 32) {
            this.f400649d = 32;
        } else if (i17 < 4) {
            this.f400649d = 4;
        } else {
            this.f400649d = i17;
        }
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioThreadPool", "setCorePoolSize poolSize:%d", objArr);
        this.f400647b.setCorePoolSize(i17);
    }
}

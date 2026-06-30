package p012xc85e97e9.p094xbe953013.p095x38b73479;

/* loaded from: classes13.dex */
public abstract class m {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.Executor f93219i;

    /* renamed from: m, reason: collision with root package name */
    public static p012xc85e97e9.p094xbe953013.p095x38b73479.j f93220m;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p094xbe953013.p095x38b73479.l f93221d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.FutureTask f93222e;

    /* renamed from: f, reason: collision with root package name */
    public volatile p012xc85e97e9.p094xbe953013.p095x38b73479.k f93223f = p012xc85e97e9.p094xbe953013.p095x38b73479.k.PENDING;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f93224g = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f93225h = new java.util.concurrent.atomic.AtomicBoolean();

    static {
        p012xc85e97e9.p094xbe953013.p095x38b73479.f fVar = new p012xc85e97e9.p094xbe953013.p095x38b73479.f();
        f93219i = new java.util.concurrent.ThreadPoolExecutor(5, 128, 1L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(10), fVar);
    }

    public m() {
        p012xc85e97e9.p094xbe953013.p095x38b73479.g gVar = new p012xc85e97e9.p094xbe953013.p095x38b73479.g(this);
        this.f93221d = gVar;
        this.f93222e = new p012xc85e97e9.p094xbe953013.p095x38b73479.h(this, gVar);
    }

    public java.lang.Object a(java.lang.Object obj) {
        p012xc85e97e9.p094xbe953013.p095x38b73479.j jVar;
        synchronized (p012xc85e97e9.p094xbe953013.p095x38b73479.m.class) {
            if (f93220m == null) {
                f93220m = new p012xc85e97e9.p094xbe953013.p095x38b73479.j();
            }
            jVar = f93220m;
        }
        jVar.obtainMessage(1, new p012xc85e97e9.p094xbe953013.p095x38b73479.i(this, obj)).sendToTarget();
        return obj;
    }
}

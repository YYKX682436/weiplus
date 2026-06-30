package androidx.loader.content;

/* loaded from: classes13.dex */
public abstract class m {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.Executor f11686i;

    /* renamed from: m, reason: collision with root package name */
    public static androidx.loader.content.j f11687m;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.loader.content.l f11688d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.FutureTask f11689e;

    /* renamed from: f, reason: collision with root package name */
    public volatile androidx.loader.content.k f11690f = androidx.loader.content.k.PENDING;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f11691g = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f11692h = new java.util.concurrent.atomic.AtomicBoolean();

    static {
        androidx.loader.content.f fVar = new androidx.loader.content.f();
        f11686i = new java.util.concurrent.ThreadPoolExecutor(5, 128, 1L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(10), fVar);
    }

    public m() {
        androidx.loader.content.g gVar = new androidx.loader.content.g(this);
        this.f11688d = gVar;
        this.f11689e = new androidx.loader.content.h(this, gVar);
    }

    public java.lang.Object a(java.lang.Object obj) {
        androidx.loader.content.j jVar;
        synchronized (androidx.loader.content.m.class) {
            if (f11687m == null) {
                f11687m = new androidx.loader.content.j();
            }
            jVar = f11687m;
        }
        jVar.obtainMessage(1, new androidx.loader.content.i(this, obj)).sendToTarget();
        return obj;
    }
}

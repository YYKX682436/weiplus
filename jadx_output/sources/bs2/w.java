package bs2;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore f23963a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23964b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f23965c;

    /* renamed from: d, reason: collision with root package name */
    public db2.o4 f23966d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.f f23967e;

    /* renamed from: f, reason: collision with root package name */
    public long f23968f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f23969g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f23970h;

    public w(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore core) {
        kotlin.jvm.internal.o.g(core, "core");
        this.f23963a = core;
        this.f23964b = 39;
        this.f23965c = new java.util.concurrent.locks.ReentrantLock();
    }

    public final boolean a(java.lang.String str) {
        boolean z17 = this.f23967e != null;
        com.tencent.mars.xlog.Log.i("Finder.NativeDramaTabPreloadWorker", "clearCache source=" + str + " hadCache=" + z17);
        this.f23967e = null;
        this.f23968f = 0L;
        return z17;
    }

    public final com.tencent.mm.modelbase.f b() {
        com.tencent.mm.modelbase.f fVar = this.f23967e;
        if (fVar == null) {
            return null;
        }
        if (this.f23968f <= 0 || android.os.SystemClock.elapsedRealtime() - this.f23968f >= 3600000) {
            return null;
        }
        return fVar;
    }
}

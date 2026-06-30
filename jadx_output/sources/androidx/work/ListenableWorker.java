package androidx.work;

/* loaded from: classes13.dex */
public abstract class ListenableWorker {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f12458d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.WorkerParameters f12459e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f12460f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12461g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12462h;

    public ListenableWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new java.lang.IllegalArgumentException("WorkerParameters is null");
        }
        this.f12458d = context;
        this.f12459e = workerParameters;
    }

    public wa.a b() {
        l5.m mVar = new l5.m();
        mVar.j(new java.lang.IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return mVar;
    }

    public boolean c() {
        return this.f12462h;
    }

    public void d() {
    }

    public abstract wa.a e();

    public final void g() {
        this.f12460f = true;
        d();
    }
}

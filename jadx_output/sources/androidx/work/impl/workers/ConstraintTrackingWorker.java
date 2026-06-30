package androidx.work.impl.workers;

/* loaded from: classes13.dex */
public class ConstraintTrackingWorker extends androidx.work.ListenableWorker implements f5.c {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f12496q = a5.a0.e("ConstraintTrkngWrkr");

    /* renamed from: i, reason: collision with root package name */
    public final androidx.work.WorkerParameters f12497i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f12498m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f12499n;

    /* renamed from: o, reason: collision with root package name */
    public final l5.m f12500o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.work.ListenableWorker f12501p;

    public ConstraintTrackingWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f12497i = workerParameters;
        this.f12498m = new java.lang.Object();
        this.f12499n = false;
        this.f12500o = new l5.m();
    }

    @Override // f5.c
    public void a(java.util.List list) {
        a5.a0.c().a(f12496q, java.lang.String.format("Constraints changed for %s", list), new java.lang.Throwable[0]);
        synchronized (this.f12498m) {
            this.f12499n = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public boolean c() {
        androidx.work.ListenableWorker listenableWorker = this.f12501p;
        return listenableWorker != null && listenableWorker.c();
    }

    @Override // androidx.work.ListenableWorker
    public void d() {
        androidx.work.ListenableWorker listenableWorker = this.f12501p;
        if (listenableWorker == null || listenableWorker.f12460f) {
            return;
        }
        this.f12501p.g();
    }

    @Override // androidx.work.ListenableWorker
    public wa.a e() {
        this.f12459e.f12468d.execute(new n5.a(this));
        return this.f12500o;
    }

    @Override // f5.c
    public void f(java.util.List list) {
    }
}

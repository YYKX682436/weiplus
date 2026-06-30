package androidx.work;

/* loaded from: classes13.dex */
public abstract class Worker extends androidx.work.ListenableWorker {

    /* renamed from: i, reason: collision with root package name */
    public l5.m f12464i;

    public Worker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final wa.a e() {
        this.f12464i = new l5.m();
        this.f12459e.f12468d.execute(new a5.u0(this));
        return this.f12464i;
    }

    public abstract a5.y h();
}

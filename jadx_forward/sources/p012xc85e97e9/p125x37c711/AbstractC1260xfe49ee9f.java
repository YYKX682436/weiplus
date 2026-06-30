package p012xc85e97e9.p125x37c711;

/* renamed from: androidx.work.ListenableWorker */
/* loaded from: classes13.dex */
public abstract class AbstractC1260xfe49ee9f {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f93991d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p125x37c711.C1264xcd547028 f93992e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f93993f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93994g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93995h;

    public AbstractC1260xfe49ee9f(android.content.Context context, p012xc85e97e9.p125x37c711.C1264xcd547028 c1264xcd547028) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Application Context is null");
        }
        if (c1264xcd547028 == null) {
            throw new java.lang.IllegalArgumentException("WorkerParameters is null");
        }
        this.f93991d = context;
        this.f93992e = c1264xcd547028;
    }

    public wa.a b() {
        l5.m mVar = new l5.m();
        mVar.j(new java.lang.IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return mVar;
    }

    public boolean c() {
        return this.f93995h;
    }

    public void d() {
    }

    public abstract wa.a e();

    public final void g() {
        this.f93993f = true;
        d();
    }
}

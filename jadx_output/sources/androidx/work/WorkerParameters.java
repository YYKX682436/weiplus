package androidx.work;

/* loaded from: classes13.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.UUID f12465a;

    /* renamed from: b, reason: collision with root package name */
    public final a5.m f12466b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12467c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Executor f12468d;

    /* renamed from: e, reason: collision with root package name */
    public final m5.a f12469e;

    /* renamed from: f, reason: collision with root package name */
    public final a5.w0 f12470f;

    /* renamed from: g, reason: collision with root package name */
    public final a5.p f12471g;

    public WorkerParameters(java.util.UUID uuid, a5.m mVar, java.util.Collection collection, a5.x0 x0Var, int i17, java.util.concurrent.Executor executor, m5.a aVar, a5.w0 w0Var, a5.n0 n0Var, a5.p pVar) {
        this.f12465a = uuid;
        this.f12466b = mVar;
        new java.util.HashSet(collection);
        this.f12467c = i17;
        this.f12468d = executor;
        this.f12469e = aVar;
        this.f12470f = w0Var;
        this.f12471g = pVar;
    }
}

package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes13.dex */
public abstract class CoroutineWorker extends androidx.work.ListenableWorker {

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.c0 f12455i;

    /* renamed from: m, reason: collision with root package name */
    public final l5.m f12456m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f12457n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(android.content.Context appContext, androidx.work.WorkerParameters params) {
        super(appContext, params);
        kotlin.jvm.internal.o.g(appContext, "appContext");
        kotlin.jvm.internal.o.g(params, "params");
        this.f12455i = kotlinx.coroutines.v2.a(null, 1, null);
        l5.m mVar = new l5.m();
        this.f12456m = mVar;
        mVar.addListener(new a5.i(this), ((m5.c) this.f12459e.f12469e).f323470a);
        this.f12457n = kotlinx.coroutines.q1.f310568a;
    }

    @Override // androidx.work.ListenableWorker
    public final wa.a b() {
        kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
        kotlinx.coroutines.y0 a18 = kotlinx.coroutines.z0.a(this.f12457n.plus(a17));
        a5.u uVar = new a5.u(a17, null, 2, null);
        kotlinx.coroutines.l.d(a18, null, null, new a5.j(uVar, this, null), 3, null);
        return uVar;
    }

    @Override // androidx.work.ListenableWorker
    public final void d() {
        this.f12456m.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final wa.a e() {
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(this.f12457n.plus(this.f12455i)), null, null, new a5.k(this, null), 3, null);
        return this.f12456m;
    }

    public abstract java.lang.Object h(kotlin.coroutines.Continuation continuation);
}

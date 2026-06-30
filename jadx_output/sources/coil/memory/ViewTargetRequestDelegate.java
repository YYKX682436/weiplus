package coil.memory;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcoil/memory/ViewTargetRequestDelegate;", "Lcoil/memory/RequestDelegate;", "Lr5/j;", "imageLoader", "Lc6/j;", "request", "La6/b0;", "targetDelegate", "Lkotlinx/coroutines/r2;", "job", "<init>", "(Lr5/j;Lc6/j;La6/b0;Lkotlinx/coroutines/r2;)V", "coil-base_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes14.dex */
public final class ViewTargetRequestDelegate extends coil.memory.RequestDelegate {

    /* renamed from: d, reason: collision with root package name */
    public final r5.j f43907d;

    /* renamed from: e, reason: collision with root package name */
    public final c6.j f43908e;

    /* renamed from: f, reason: collision with root package name */
    public final a6.b0 f43909f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.r2 f43910g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTargetRequestDelegate(r5.j imageLoader, c6.j request, a6.b0 targetDelegate, kotlinx.coroutines.r2 job) {
        super(null);
        kotlin.jvm.internal.o.g(imageLoader, "imageLoader");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(targetDelegate, "targetDelegate");
        kotlin.jvm.internal.o.g(job, "job");
        this.f43907d = imageLoader;
        this.f43908e = request;
        this.f43909f = targetDelegate;
        this.f43910g = job;
    }

    @Override // coil.memory.RequestDelegate
    public void b() {
        kotlinx.coroutines.p2.a(this.f43910g, null, 1, null);
        a6.b0 b0Var = this.f43909f;
        b0Var.a();
        h6.d.d(b0Var, null);
        c6.j jVar = this.f43908e;
        e6.b bVar = jVar.f38831c;
        if (bVar instanceof androidx.lifecycle.x) {
            jVar.f38841m.c((androidx.lifecycle.x) bVar);
        }
        jVar.f38841m.c(this);
    }
}

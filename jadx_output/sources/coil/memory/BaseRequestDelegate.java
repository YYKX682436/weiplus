package coil.memory;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil/memory/BaseRequestDelegate;", "Lcoil/memory/RequestDelegate;", "Landroidx/lifecycle/o;", "lifecycle", "Lkotlinx/coroutines/r2;", "job", "<init>", "(Landroidx/lifecycle/o;Lkotlinx/coroutines/r2;)V", "coil-base_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes14.dex */
public final class BaseRequestDelegate extends coil.memory.RequestDelegate {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.o f43900d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.r2 f43901e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRequestDelegate(androidx.lifecycle.o lifecycle, kotlinx.coroutines.r2 job) {
        super(null);
        kotlin.jvm.internal.o.g(lifecycle, "lifecycle");
        kotlin.jvm.internal.o.g(job, "job");
        this.f43900d = lifecycle;
        this.f43901e = job;
    }

    @Override // coil.memory.RequestDelegate
    public void a() {
        this.f43900d.c(this);
    }

    @Override // coil.memory.RequestDelegate
    public void b() {
        kotlinx.coroutines.p2.a(this.f43901e, null, 1, null);
    }
}

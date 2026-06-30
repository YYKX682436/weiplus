package androidx.lifecycle;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/q;", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/o;", "lifecycle", "Loz5/l;", "coroutineContext", "<init>", "(Landroidx/lifecycle/o;Loz5/l;)V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class LifecycleCoroutineScopeImpl extends androidx.lifecycle.q implements androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.o f11581d;

    /* renamed from: e, reason: collision with root package name */
    public final oz5.l f11582e;

    public LifecycleCoroutineScopeImpl(androidx.lifecycle.o lifecycle, oz5.l coroutineContext) {
        kotlin.jvm.internal.o.g(lifecycle, "lifecycle");
        kotlin.jvm.internal.o.g(coroutineContext, "coroutineContext");
        this.f11581d = lifecycle;
        this.f11582e = coroutineContext;
        if (lifecycle.b() == androidx.lifecycle.n.DESTROYED) {
            kotlinx.coroutines.v2.c(coroutineContext, null, 1, null);
        }
    }

    @Override // kotlinx.coroutines.y0
    /* renamed from: getCoroutineContext, reason: from getter */
    public oz5.l getF11582e() {
        return this.f11582e;
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        androidx.lifecycle.o oVar = this.f11581d;
        if (oVar.b().compareTo(androidx.lifecycle.n.DESTROYED) <= 0) {
            oVar.c(this);
            kotlinx.coroutines.v2.c(this.f11582e, null, 1, null);
        }
    }
}

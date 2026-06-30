package androidx.lifecycle;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/y;", ya.b.SOURCE, "Landroidx/lifecycle/m;", "<anonymous parameter 1>", "Ljz5/f0;", "onStateChanged", "(Landroidx/lifecycle/y;Landroidx/lifecycle/m;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes2.dex */
final class LifecycleController$observer$1 implements androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f11580d;

    public LifecycleController$observer$1(androidx.lifecycle.p pVar, kotlinx.coroutines.r2 r2Var) {
        this.f11580d = r2Var;
    }

    @Override // androidx.lifecycle.v
    public final void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m mVar) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(mVar, "<anonymous parameter 1>");
        androidx.lifecycle.o mo133getLifecycle = source.mo133getLifecycle();
        kotlin.jvm.internal.o.f(mo133getLifecycle, "source.lifecycle");
        if (mo133getLifecycle.b() == androidx.lifecycle.n.DESTROYED) {
            kotlinx.coroutines.p2.a(this.f11580d, null, 1, null);
            throw null;
        }
        androidx.lifecycle.o mo133getLifecycle2 = source.mo133getLifecycle();
        kotlin.jvm.internal.o.f(mo133getLifecycle2, "source.lifecycle");
        mo133getLifecycle2.b();
        throw null;
    }
}

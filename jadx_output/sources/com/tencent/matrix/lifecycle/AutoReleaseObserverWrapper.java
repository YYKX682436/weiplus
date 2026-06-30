package com.tencent.matrix.lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\r"}, d2 = {"Lcom/tencent/matrix/lifecycle/AutoReleaseObserverWrapper;", "Lcom/tencent/matrix/lifecycle/r0;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "release", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "targetObservable", "Lcom/tencent/matrix/lifecycle/k;", "observer", "<init>", "(Landroidx/lifecycle/y;Lcom/tencent/matrix/lifecycle/StatefulOwner;Lcom/tencent/matrix/lifecycle/k;)V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class AutoReleaseObserverWrapper extends com.tencent.matrix.lifecycle.r0 implements androidx.lifecycle.x {

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.y f52686f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoReleaseObserverWrapper(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.StatefulOwner targetObservable, com.tencent.matrix.lifecycle.k observer) {
        super(observer, targetObservable);
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(targetObservable, "targetObservable");
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f52686f = lifecycleOwner;
        androidx.lifecycle.o mo133getLifecycle = lifecycleOwner.mo133getLifecycle();
        kotlin.jvm.internal.o.f(mo133getLifecycle, "lifecycleOwner.lifecycle");
        if (mo133getLifecycle.b() == androidx.lifecycle.n.DESTROYED) {
            throw new java.lang.IllegalStateException("NOT allow to observe with DESTROYED lifecycle owner");
        }
        lifecycleOwner.mo133getLifecycle().a(this);
    }

    @Override // com.tencent.matrix.lifecycle.r0
    public boolean a(androidx.lifecycle.y yVar) {
        return kotlin.jvm.internal.o.b(this.f52686f, yVar);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void release() {
        this.f52788e.removeObserver(this.f52787d);
    }
}

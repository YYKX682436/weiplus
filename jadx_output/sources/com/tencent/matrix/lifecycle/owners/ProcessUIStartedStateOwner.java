package com.tencent.matrix.lifecycle.owners;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0097\u0001J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\nH\u0097\u0001J\t\u0010\u000b\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001J\u0019\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0096\u0001J\u0011\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u0011\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\nH\u0097\u0001J\u0011\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¨\u0006\u0014"}, d2 = {"Lcom/tencent/matrix/lifecycle/owners/ProcessUIStartedStateOwner;", "Lcom/tencent/matrix/lifecycle/IForegroundStatefulOwner;", "", "active", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lcom/tencent/matrix/lifecycle/h;", "callback", "Ljz5/f0;", "addLifecycleCallback", "Lcom/tencent/matrix/lifecycle/i;", "isForeground", "Lcom/tencent/matrix/lifecycle/k;", "observer", "observeForever", "observeWithLifecycle", "removeLifecycleCallback", "removeObserver", "<init>", "()V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ProcessUIStartedStateOwner implements com.tencent.matrix.lifecycle.IForegroundStatefulOwner {
    public static final com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner INSTANCE = new com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner();
    private final /* synthetic */ com.tencent.matrix.lifecycle.IForegroundStatefulOwner $$delegate_0;

    private ProcessUIStartedStateOwner() {
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        this.$$delegate_0 = com.tencent.matrix.lifecycle.owners.f0.f52733o;
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner, com.tencent.matrix.lifecycle.l
    public boolean active() {
        return this.$$delegate_0.active();
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public void addLifecycleCallback(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.h callback) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.$$delegate_0.addLifecycleCallback(lifecycleOwner, callback);
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public boolean isForeground() {
        return this.$$delegate_0.isForeground();
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner
    public void observeForever(com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        this.$$delegate_0.observeForever(observer);
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner
    public void observeWithLifecycle(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(observer, "observer");
        this.$$delegate_0.observeWithLifecycle(lifecycleOwner, observer);
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public void removeLifecycleCallback(com.tencent.matrix.lifecycle.h callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.$$delegate_0.removeLifecycleCallback(callback);
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner
    public void removeObserver(com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        this.$$delegate_0.removeObserver(observer);
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public void addLifecycleCallback(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public void removeLifecycleCallback(com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public void addLifecycleCallback(com.tencent.matrix.lifecycle.h callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.$$delegate_0.addLifecycleCallback(callback);
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public void addLifecycleCallback(com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }
}

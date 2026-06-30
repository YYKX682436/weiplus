package com.tencent.matrix.lifecycle.owners;

@kotlin.Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001\r\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/matrix/lifecycle/owners/ProcessDeepBackgroundOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/IBackgroundStatefulOwner;", "", "active", "Lcom/tencent/matrix/lifecycle/k;", "observer", "Ljz5/f0;", "observeForever", "Landroidx/lifecycle/y;", "lifecycleOwner", "observeWithLifecycle", "removeObserver", "com/tencent/matrix/lifecycle/owners/ProcessDeepBackgroundOwner$delegate$1", "delegate", "Lcom/tencent/matrix/lifecycle/owners/ProcessDeepBackgroundOwner$delegate$1;", "<init>", "()V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ProcessDeepBackgroundOwner extends com.tencent.matrix.lifecycle.StatefulOwner implements com.tencent.matrix.lifecycle.IBackgroundStatefulOwner {
    public static final com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner INSTANCE = new com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner();
    private static final com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner$delegate$1 delegate;

    static {
        com.tencent.matrix.lifecycle.s0 s0Var = com.tencent.matrix.lifecycle.s0.f52790d;
        com.tencent.matrix.lifecycle.owners.ProcessUICreatedStateOwner reverse = com.tencent.matrix.lifecycle.owners.ProcessUICreatedStateOwner.INSTANCE;
        kotlin.jvm.internal.o.g(reverse, "$this$reverse");
        com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner reverse2 = com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner.INSTANCE;
        kotlin.jvm.internal.o.g(reverse2, "$this$reverse");
        delegate = new com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner$delegate$1(s0Var, new com.tencent.matrix.lifecycle.IStatefulOwner[]{new com.tencent.matrix.lifecycle.StatefulOwnerKt$reverse$1(reverse), com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE, new com.tencent.matrix.lifecycle.StatefulOwnerKt$reverse$1(reverse2)});
    }

    private ProcessDeepBackgroundOwner() {
        super(false, 1, null);
    }

    @Override // com.tencent.matrix.lifecycle.StatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner, com.tencent.matrix.lifecycle.l
    public boolean active() {
        return delegate.active();
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void addLifecycleCallback(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public boolean isBackground() {
        return active();
    }

    @Override // com.tencent.matrix.lifecycle.StatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner
    public void observeForever(com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        delegate.observeForever(observer);
    }

    @Override // com.tencent.matrix.lifecycle.StatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner
    public void observeWithLifecycle(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(observer, "observer");
        delegate.observeWithLifecycle(lifecycleOwner, observer);
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void removeLifecycleCallback(com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }

    @Override // com.tencent.matrix.lifecycle.StatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner
    public void removeObserver(com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        delegate.removeObserver(observer);
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void addLifecycleCallback(com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void removeLifecycleCallback(com.tencent.matrix.lifecycle.g callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.matrix.lifecycle.b.c(this, callback);
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void addLifecycleCallback(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.g callback) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.matrix.lifecycle.b.a(this, lifecycleOwner, callback);
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void addLifecycleCallback(com.tencent.matrix.lifecycle.g callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.matrix.lifecycle.b.b(this, callback);
    }
}

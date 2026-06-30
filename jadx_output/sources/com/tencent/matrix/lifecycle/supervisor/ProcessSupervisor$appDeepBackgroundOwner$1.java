package com.tencent.matrix.lifecycle.supervisor;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/matrix/lifecycle/supervisor/ProcessSupervisor$appDeepBackgroundOwner$1", "Lcom/tencent/matrix/lifecycle/supervisor/DispatcherStateOwner;", "Lcom/tencent/matrix/lifecycle/IBackgroundStatefulOwner;", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ProcessSupervisor$appDeepBackgroundOwner$1 extends com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner implements com.tencent.matrix.lifecycle.IBackgroundStatefulOwner {
    final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessSupervisor$appDeepBackgroundOwner$1(com.tencent.matrix.lifecycle.supervisor.d0 d0Var, yz5.l lVar, com.tencent.matrix.lifecycle.IStatefulOwner iStatefulOwner, java.lang.String str) {
        super(lVar, iStatefulOwner, str);
        this.this$0 = d0Var;
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

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void removeLifecycleCallback(com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
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

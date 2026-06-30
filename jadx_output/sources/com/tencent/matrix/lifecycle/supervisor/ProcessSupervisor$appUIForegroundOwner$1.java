package com.tencent.matrix.lifecycle.supervisor;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/matrix/lifecycle/supervisor/ProcessSupervisor$appUIForegroundOwner$1", "Lcom/tencent/matrix/lifecycle/supervisor/DispatcherStateOwner;", "Lcom/tencent/matrix/lifecycle/IForegroundStatefulOwner;", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ProcessSupervisor$appUIForegroundOwner$1 extends com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner implements com.tencent.matrix.lifecycle.IForegroundStatefulOwner {
    final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessSupervisor$appUIForegroundOwner$1(com.tencent.matrix.lifecycle.supervisor.d0 d0Var, yz5.l lVar, com.tencent.matrix.lifecycle.IStatefulOwner iStatefulOwner, java.lang.String str) {
        super(lVar, iStatefulOwner, str);
        this.this$0 = d0Var;
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public void addLifecycleCallback(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public boolean isForeground() {
        return active();
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public void removeLifecycleCallback(com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public void addLifecycleCallback(com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public void removeLifecycleCallback(com.tencent.matrix.lifecycle.h callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.matrix.lifecycle.k stateObserver$matrix_android_lib_release = callback.getStateObserver$matrix_android_lib_release();
        if (stateObserver$matrix_android_lib_release != null) {
            removeObserver(stateObserver$matrix_android_lib_release);
        }
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public void addLifecycleCallback(com.tencent.matrix.lifecycle.h callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.matrix.lifecycle.e eVar = new com.tencent.matrix.lifecycle.e(callback);
        callback.setStateObserver$matrix_android_lib_release(eVar);
        observeForever(eVar);
    }

    @Override // com.tencent.matrix.lifecycle.IForegroundStatefulOwner
    public void addLifecycleCallback(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.h callback) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.matrix.lifecycle.f fVar = new com.tencent.matrix.lifecycle.f(callback);
        callback.setStateObserver$matrix_android_lib_release(fVar);
        observeWithLifecycle(lifecycleOwner, fVar);
    }
}

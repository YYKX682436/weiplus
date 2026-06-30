package com.tencent.matrix.lifecycle.owners;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/tencent/matrix/lifecycle/owners/ProcessUILifecycleOwner$AsyncOwner", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/IForegroundStatefulOwner;", "Ljz5/f0;", "turnOnAsync", "turnOffAsync", "<init>", "()V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public class ProcessUILifecycleOwner$AsyncOwner extends com.tencent.matrix.lifecycle.StatefulOwner implements com.tencent.matrix.lifecycle.IForegroundStatefulOwner {
    public ProcessUILifecycleOwner$AsyncOwner() {
        super(false, 1, null);
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

    public void turnOffAsync() {
        turnOff();
    }

    public void turnOnAsync() {
        turnOn();
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

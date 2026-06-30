package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public abstract class h {
    private com.tencent.matrix.lifecycle.k stateObserver;

    public final com.tencent.matrix.lifecycle.k getStateObserver$matrix_android_lib_release() {
        return this.stateObserver;
    }

    public abstract void onEnterForeground();

    public abstract void onExitForeground();

    public final void setStateObserver$matrix_android_lib_release(com.tencent.matrix.lifecycle.k kVar) {
        this.stateObserver = kVar;
    }
}

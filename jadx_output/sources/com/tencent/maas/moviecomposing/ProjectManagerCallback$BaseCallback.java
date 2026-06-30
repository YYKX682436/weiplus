package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
abstract class ProjectManagerCallback$BaseCallback<T> extends com.tencent.maas.internal.a {
    private final java.lang.ref.WeakReference<com.tencent.maas.moviecomposing.ProjectManager> projectManagerWeakReference;

    public ProjectManagerCallback$BaseCallback(com.tencent.maas.moviecomposing.ProjectManager projectManager) {
        this.projectManagerWeakReference = new java.lang.ref.WeakReference<>(projectManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.maas.internal.a
    public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        onInvoke(this.projectManagerWeakReference.get(), callbackArgs);
    }

    public abstract void onInvoke(com.tencent.maas.moviecomposing.ProjectManager projectManager, T t17);

    public ProjectManagerCallback$BaseCallback(com.tencent.maas.moviecomposing.ProjectManager projectManager, boolean z17) {
        super(z17);
        this.projectManagerWeakReference = new java.lang.ref.WeakReference<>(projectManager);
    }
}

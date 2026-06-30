package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public abstract class UnregisterListenerMethod<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zaa;

    public UnregisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> listenerKey) {
        this.zaa = listenerKey;
    }

    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaa;
    }

    public abstract void unregisterListener(A a17, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource);
}

package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public abstract class RegisterListenerMethod<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder zaa;
    private final com.google.android.gms.common.Feature[] zab;
    private final boolean zac;
    private final int zad;

    public RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolder, com.google.android.gms.common.Feature[] featureArr, boolean z17, int i17) {
        this.zaa = listenerHolder;
        this.zab = featureArr;
        this.zac = z17;
        this.zad = i17;
    }

    public void clearListener() {
        this.zaa.clear();
    }

    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaa.getListenerKey();
    }

    public com.google.android.gms.common.Feature[] getRequiredFeatures() {
        return this.zab;
    }

    public abstract void registerListener(A a17, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource);

    public final int zaa() {
        return this.zad;
    }

    public final boolean zab() {
        return this.zac;
    }

    public RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolder) {
        this(listenerHolder, null, false, 0);
    }

    public RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolder, com.google.android.gms.common.Feature[] featureArr, boolean z17) {
        this(listenerHolder, featureArr, z17, 0);
    }
}

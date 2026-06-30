package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzag extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.wearable.internal.zzhg, com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener> {
    private final com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener zzby;

    private zzag(com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener> listenerKey) {
        super(listenerKey);
        this.zzby = onCapabilityChangedListener;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final /* synthetic */ void unregisterListener(com.google.android.gms.wearable.internal.zzhg zzhgVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        zzhgVar.zza(new com.google.android.gms.wearable.internal.zzgg(taskCompletionSource), this.zzby);
    }
}

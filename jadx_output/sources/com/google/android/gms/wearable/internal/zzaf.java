package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzaf extends com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.wearable.internal.zzhg, com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener> {
    private final android.content.IntentFilter[] zzba;
    private final com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener zzby;
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.CapabilityApi.CapabilityListener> zzbz;

    private zzaf(com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, android.content.IntentFilter[] intentFilterArr, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener> listenerHolder) {
        super(listenerHolder);
        this.zzby = onCapabilityChangedListener;
        this.zzba = intentFilterArr;
        this.zzbz = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final /* synthetic */ void registerListener(com.google.android.gms.wearable.internal.zzhg zzhgVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        zzhgVar.zza(new com.google.android.gms.wearable.internal.zzgh(taskCompletionSource), this.zzby, this.zzbz, this.zzba);
    }
}

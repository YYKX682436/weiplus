package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzt implements com.google.android.gms.wearable.internal.zzc<com.google.android.gms.wearable.CapabilityApi.CapabilityListener> {
    private final /* synthetic */ android.content.IntentFilter[] zzbr;

    public zzt(android.content.IntentFilter[] intentFilterArr) {
        this.zzbr = intentFilterArr;
    }

    @Override // com.google.android.gms.wearable.internal.zzc
    public final /* synthetic */ void zza(com.google.android.gms.wearable.internal.zzhg zzhgVar, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.CapabilityApi.CapabilityListener> listenerHolder) {
        zzhgVar.zza((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>) resultHolder, capabilityListener, listenerHolder, this.zzbr);
    }
}

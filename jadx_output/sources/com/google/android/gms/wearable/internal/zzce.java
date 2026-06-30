package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzce implements com.google.android.gms.wearable.internal.zzc<com.google.android.gms.wearable.DataApi.DataListener> {
    private final /* synthetic */ android.content.IntentFilter[] zzbr;

    public zzce(android.content.IntentFilter[] intentFilterArr) {
        this.zzbr = intentFilterArr;
    }

    @Override // com.google.android.gms.wearable.internal.zzc
    public final /* synthetic */ void zza(com.google.android.gms.wearable.internal.zzhg zzhgVar, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, com.google.android.gms.wearable.DataApi.DataListener dataListener, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.DataApi.DataListener> listenerHolder) {
        zzhgVar.zza((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>) resultHolder, dataListener, listenerHolder, this.zzbr);
    }
}

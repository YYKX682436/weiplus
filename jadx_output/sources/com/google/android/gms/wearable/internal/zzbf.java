package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzbf implements com.google.android.gms.wearable.internal.zzc<com.google.android.gms.wearable.ChannelApi.ChannelListener> {
    private final /* synthetic */ android.content.IntentFilter[] zzbr;
    private final /* synthetic */ java.lang.String zzcs;

    public zzbf(java.lang.String str, android.content.IntentFilter[] intentFilterArr) {
        this.zzcs = str;
        this.zzbr = intentFilterArr;
    }

    @Override // com.google.android.gms.wearable.internal.zzc
    public final /* synthetic */ void zza(com.google.android.gms.wearable.internal.zzhg zzhgVar, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.ChannelApi.ChannelListener> listenerHolder) {
        zzhgVar.zza((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>) resultHolder, channelListener, listenerHolder, this.zzcs, this.zzbr);
    }
}

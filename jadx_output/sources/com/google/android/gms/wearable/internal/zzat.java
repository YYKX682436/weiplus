package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzat extends com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.wearable.internal.zzhg, com.google.android.gms.wearable.ChannelClient.ChannelCallback> {
    private final android.content.IntentFilter[] zzba;
    private final java.lang.String zzce;
    private final com.google.android.gms.wearable.ChannelApi.ChannelListener zzcf;
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.ChannelApi.ChannelListener> zzci;

    public zzat(com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener, java.lang.String str, android.content.IntentFilter[] intentFilterArr, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.ChannelClient.ChannelCallback> listenerHolder, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.ChannelApi.ChannelListener> listenerHolder2) {
        super(listenerHolder);
        this.zzcf = channelListener;
        this.zzba = intentFilterArr;
        this.zzce = str;
        this.zzci = listenerHolder2;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final /* synthetic */ void registerListener(com.google.android.gms.wearable.internal.zzhg zzhgVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        zzhgVar.zza(new com.google.android.gms.wearable.internal.zzgh(taskCompletionSource), this.zzcf, this.zzci, this.zzce, this.zzba);
    }
}

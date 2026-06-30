package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzau extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.wearable.internal.zzhg, com.google.android.gms.wearable.ChannelClient.ChannelCallback> {
    private final java.lang.String zzce;
    private final com.google.android.gms.wearable.ChannelApi.ChannelListener zzcf;

    public zzau(com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener, java.lang.String str, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.wearable.ChannelClient.ChannelCallback> listenerKey) {
        super(listenerKey);
        this.zzcf = channelListener;
        this.zzce = str;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final /* synthetic */ void unregisterListener(com.google.android.gms.wearable.internal.zzhg zzhgVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        zzhgVar.zza(new com.google.android.gms.wearable.internal.zzgg(taskCompletionSource), this.zzcf, this.zzce);
    }
}

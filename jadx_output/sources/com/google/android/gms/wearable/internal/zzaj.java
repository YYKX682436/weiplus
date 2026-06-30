package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzaj implements com.google.android.gms.wearable.ChannelApi {
    @Override // com.google.android.gms.wearable.ChannelApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client is null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(channelListener, "listener is null");
        return com.google.android.gms.wearable.internal.zzb.zza(googleApiClient, new com.google.android.gms.wearable.internal.zzal(new android.content.IntentFilter[]{com.google.android.gms.wearable.internal.zzgj.zzc("com.google.android.gms.wearable.CHANNEL_EVENT")}), channelListener);
    }

    @Override // com.google.android.gms.wearable.ChannelApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.ChannelApi.OpenChannelResult> openChannel(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client is null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "nodeId is null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str2, "path is null");
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzak(this, googleApiClient, str, str2));
    }

    @Override // com.google.android.gms.wearable.ChannelApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client is null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(channelListener, "listener is null");
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzan(googleApiClient, channelListener, null));
    }
}

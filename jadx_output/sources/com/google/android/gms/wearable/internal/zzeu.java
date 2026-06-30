package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzeu implements com.google.android.gms.wearable.MessageApi {
    private static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.MessageApi.MessageListener messageListener, android.content.IntentFilter[] intentFilterArr) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzex(googleApiClient, messageListener, googleApiClient.registerListener(messageListener), intentFilterArr, null));
    }

    @Override // com.google.android.gms.wearable.MessageApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.MessageApi.MessageListener messageListener) {
        return zza(googleApiClient, messageListener, new android.content.IntentFilter[]{com.google.android.gms.wearable.internal.zzgj.zzc("com.google.android.gms.wearable.MESSAGE_RECEIVED")});
    }

    @Override // com.google.android.gms.wearable.MessageApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.MessageApi.MessageListener messageListener) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzew(this, googleApiClient, messageListener));
    }

    @Override // com.google.android.gms.wearable.MessageApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.MessageApi.SendMessageResult> sendMessage(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2, byte[] bArr) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzev(this, googleApiClient, str, str2, bArr));
    }

    @Override // com.google.android.gms.wearable.MessageApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.MessageApi.MessageListener messageListener, android.net.Uri uri, int i17) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(uri, "uri must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(i17 == 0 || i17 == 1, "invalid filter type");
        return zza(googleApiClient, messageListener, new android.content.IntentFilter[]{com.google.android.gms.wearable.internal.zzgj.zza("com.google.android.gms.wearable.MESSAGE_RECEIVED", uri, i17)});
    }
}

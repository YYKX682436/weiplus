package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
final class zzj extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.wearable.internal.zzhg, com.google.android.gms.wearable.Wearable.WearableOptions> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.wearable.internal.zzhg buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.wearable.Wearable.WearableOptions wearableOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        if (wearableOptions == null) {
            new com.google.android.gms.wearable.Wearable.WearableOptions(new com.google.android.gms.wearable.Wearable.WearableOptions.Builder(), null);
        }
        return new com.google.android.gms.wearable.internal.zzhg(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }
}

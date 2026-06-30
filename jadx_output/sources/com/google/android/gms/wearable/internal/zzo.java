package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzo implements com.google.android.gms.wearable.CapabilityApi {
    private static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener, android.content.IntentFilter[] intentFilterArr) {
        return com.google.android.gms.wearable.internal.zzb.zza(googleApiClient, new com.google.android.gms.wearable.internal.zzt(intentFilterArr), capabilityListener);
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addCapabilityListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener, java.lang.String str) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(str, "capability must not be null");
        com.google.android.gms.wearable.internal.zzv zzvVar = new com.google.android.gms.wearable.internal.zzv(capabilityListener, str);
        android.content.IntentFilter zzc = com.google.android.gms.wearable.internal.zzgj.zzc("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if (!str.startsWith("/")) {
            str = str.length() != 0 ? "/".concat(str) : new java.lang.String("/");
        }
        zzc.addDataPath(str, 0);
        return zza(googleApiClient, zzvVar, new android.content.IntentFilter[]{zzc});
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener, android.net.Uri uri, int i17) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(uri, "uri must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(i17 == 0 || i17 == 1, "invalid filter type");
        return zza(googleApiClient, capabilityListener, new android.content.IntentFilter[]{com.google.android.gms.wearable.internal.zzgj.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i17)});
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult> addLocalCapability(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzr(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult> getAllCapabilities(com.google.android.gms.common.api.GoogleApiClient googleApiClient, int i17) {
        boolean z17 = true;
        if (i17 != 0 && i17 != 1) {
            z17 = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z17);
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzq(this, googleApiClient, i17));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult> getCapability(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, int i17) {
        boolean z17 = true;
        if (i17 != 0 && i17 != 1) {
            z17 = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z17);
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzp(this, googleApiClient, str, i17));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeCapabilityListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener, java.lang.String str) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzz(googleApiClient, new com.google.android.gms.wearable.internal.zzv(capabilityListener, str), null));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzz(googleApiClient, capabilityListener, null));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult> removeLocalCapability(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzs(this, googleApiClient, str));
    }
}

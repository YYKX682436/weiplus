package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzz extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.common.api.Status> {
    private com.google.android.gms.wearable.CapabilityApi.CapabilityListener zzbs;

    private zzz(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener) {
        super(googleApiClient);
        this.zzbs = capabilityListener;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        this.zzbs = null;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        zzhgVar.zza(this, this.zzbs);
        this.zzbs = null;
    }

    public /* synthetic */ zzz(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener, com.google.android.gms.wearable.internal.zzp zzpVar) {
        this(googleApiClient, capabilityListener);
    }
}

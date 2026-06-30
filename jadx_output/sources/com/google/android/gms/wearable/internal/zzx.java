package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzx implements com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult {
    private final java.util.Map<java.lang.String, com.google.android.gms.wearable.CapabilityInfo> zzbu;
    private final com.google.android.gms.common.api.Status zzp;

    public zzx(com.google.android.gms.common.api.Status status, java.util.Map<java.lang.String, com.google.android.gms.wearable.CapabilityInfo> map) {
        this.zzp = status;
        this.zzbu = map;
    }

    @Override // com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult
    public final java.util.Map<java.lang.String, com.google.android.gms.wearable.CapabilityInfo> getAllCapabilities() {
        return this.zzbu;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzp;
    }
}

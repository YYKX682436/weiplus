package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzy implements com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult {
    private final com.google.android.gms.wearable.CapabilityInfo zzbv;
    private final com.google.android.gms.common.api.Status zzp;

    public zzy(com.google.android.gms.common.api.Status status, com.google.android.gms.wearable.CapabilityInfo capabilityInfo) {
        this.zzp = status;
        this.zzbv = capabilityInfo;
    }

    @Override // com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult
    public final com.google.android.gms.wearable.CapabilityInfo getCapability() {
        return this.zzbv;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzp;
    }
}

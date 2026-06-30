package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzu implements com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult, com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult {
    private final com.google.android.gms.common.api.Status zzp;

    public zzu(com.google.android.gms.common.api.Status status) {
        this.zzp = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzp;
    }
}

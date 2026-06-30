package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzch implements com.google.android.gms.wearable.DataApi.DeleteDataItemsResult {
    private final int zzdh;
    private final com.google.android.gms.common.api.Status zzp;

    public zzch(com.google.android.gms.common.api.Status status, int i17) {
        this.zzp = status;
        this.zzdh = i17;
    }

    @Override // com.google.android.gms.wearable.DataApi.DeleteDataItemsResult
    public final int getNumDeleted() {
        return this.zzdh;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzp;
    }
}

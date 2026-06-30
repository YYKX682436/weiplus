package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzcg implements com.google.android.gms.wearable.DataApi.DataItemResult {
    private final com.google.android.gms.wearable.DataItem zzdg;
    private final com.google.android.gms.common.api.Status zzp;

    public zzcg(com.google.android.gms.common.api.Status status, com.google.android.gms.wearable.DataItem dataItem) {
        this.zzp = status;
        this.zzdg = dataItem;
    }

    @Override // com.google.android.gms.wearable.DataApi.DataItemResult
    public final com.google.android.gms.wearable.DataItem getDataItem() {
        return this.zzdg;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzp;
    }
}

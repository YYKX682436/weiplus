package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzey implements com.google.android.gms.wearable.MessageApi.SendMessageResult {
    private final int zzeh;
    private final com.google.android.gms.common.api.Status zzp;

    public zzey(com.google.android.gms.common.api.Status status, int i17) {
        this.zzp = status;
        this.zzeh = i17;
    }

    @Override // com.google.android.gms.wearable.MessageApi.SendMessageResult
    public final int getRequestId() {
        return this.zzeh;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzp;
    }
}

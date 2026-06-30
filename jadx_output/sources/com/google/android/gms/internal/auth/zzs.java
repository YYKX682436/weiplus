package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
final class zzs implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status mStatus;

    public zzs(com.google.android.gms.common.api.Status status) {
        this.mStatus = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }
}

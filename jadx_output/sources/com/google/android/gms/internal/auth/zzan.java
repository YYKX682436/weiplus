package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public final class zzan implements com.google.android.gms.auth.api.credentials.CredentialRequestResult {
    private final com.google.android.gms.common.api.Status mStatus;
    private final com.google.android.gms.auth.api.credentials.Credential zzdq;

    public zzan(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.credentials.Credential credential) {
        this.mStatus = status;
        this.zzdq = credential;
    }

    public static com.google.android.gms.internal.auth.zzan zzf(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.auth.zzan(status, null);
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialRequestResult
    public final com.google.android.gms.auth.api.credentials.Credential getCredential() {
        return this.zzdq;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }
}

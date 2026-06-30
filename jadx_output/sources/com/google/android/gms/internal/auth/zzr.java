package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
final class zzr implements com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult {
    private final com.google.android.gms.common.api.Status mStatus;
    private final android.accounts.Account zzn;

    public zzr(com.google.android.gms.common.api.Status status, android.accounts.Account account) {
        this.mStatus = status;
        this.zzn = account;
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult
    public final android.accounts.Account getAccount() {
        return this.zzn;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }
}

package com.google.android.gms.auth.account;

/* loaded from: classes13.dex */
final class zzj implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter<com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult, android.accounts.Account> {
    public zzj(com.google.android.gms.auth.account.WorkAccountClient workAccountClient) {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ android.accounts.Account convert(com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult addAccountResult) {
        return addAccountResult.getAccount();
    }
}

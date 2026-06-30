package com.google.android.gms.auth.account;

/* loaded from: classes13.dex */
public class WorkAccountClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    private final com.google.android.gms.auth.account.WorkAccountApi zzae;

    public WorkAccountClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) com.google.android.gms.auth.account.WorkAccount.API, (com.google.android.gms.common.api.Api.ApiOptions) null, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zzae = new com.google.android.gms.internal.auth.zzk();
    }

    public com.google.android.gms.tasks.Task<android.accounts.Account> addWorkAccount(java.lang.String str) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzae.addWorkAccount(asGoogleApiClient(), str), new com.google.android.gms.auth.account.zzj(this));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeWorkAccount(android.accounts.Account account) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(this.zzae.removeWorkAccount(asGoogleApiClient(), account));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setWorkAuthenticatorEnabled(boolean z17) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(this.zzae.setWorkAuthenticatorEnabledWithResult(asGoogleApiClient(), z17));
    }

    public WorkAccountClient(android.content.Context context) {
        super(context, com.google.android.gms.auth.account.WorkAccount.API, (com.google.android.gms.common.api.Api.ApiOptions) null, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zzae = new com.google.android.gms.internal.auth.zzk();
    }
}

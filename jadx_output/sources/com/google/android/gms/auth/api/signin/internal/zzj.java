package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzj extends com.google.android.gms.auth.api.signin.internal.zzp<com.google.android.gms.auth.api.signin.GoogleSignInResult> {
    final /* synthetic */ android.content.Context val$context;
    final /* synthetic */ com.google.android.gms.auth.api.signin.GoogleSignInOptions zzew;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        super(googleApiClient);
        this.val$context = context;
        this.zzew = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInResult(null, status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.auth.api.signin.internal.zzh zzhVar) {
        ((com.google.android.gms.auth.api.signin.internal.zzv) zzhVar.getService()).zzd(new com.google.android.gms.auth.api.signin.internal.zzk(this), this.zzew);
    }
}

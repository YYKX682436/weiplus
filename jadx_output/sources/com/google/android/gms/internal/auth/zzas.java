package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
final class zzas extends com.google.android.gms.internal.auth.zzav<com.google.android.gms.common.api.Status> {
    private final /* synthetic */ com.google.android.gms.auth.api.credentials.Credential zzdt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzas(com.google.android.gms.internal.auth.zzao zzaoVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.Credential credential) {
        super(googleApiClient);
        this.zzdt = credential;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    @Override // com.google.android.gms.internal.auth.zzav
    public final void zzd(android.content.Context context, com.google.android.gms.internal.auth.zzbc zzbcVar) {
        zzbcVar.zzd(new com.google.android.gms.internal.auth.zzau(this), new com.google.android.gms.internal.auth.zzay(this.zzdt));
    }
}

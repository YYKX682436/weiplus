package com.google.android.gms.internal.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzap extends com.google.android.gms.internal.auth.zzav<com.google.android.gms.auth.api.credentials.CredentialRequestResult> {
    private final /* synthetic */ com.google.android.gms.auth.api.credentials.CredentialRequest zzdr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(com.google.android.gms.internal.auth.zzao zzaoVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.CredentialRequest credentialRequest) {
        super(googleApiClient);
        this.zzdr = credentialRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return com.google.android.gms.internal.auth.zzan.zzf(status);
    }

    @Override // com.google.android.gms.internal.auth.zzav
    public final void zzd(android.content.Context context, com.google.android.gms.internal.auth.zzbc zzbcVar) {
        zzbcVar.zzd(new com.google.android.gms.internal.auth.zzaq(this), this.zzdr);
    }
}

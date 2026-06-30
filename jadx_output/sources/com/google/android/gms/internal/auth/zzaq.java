package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
final class zzaq extends com.google.android.gms.internal.auth.zzam {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzap zzds;

    public zzaq(com.google.android.gms.internal.auth.zzap zzapVar) {
        this.zzds = zzapVar;
    }

    @Override // com.google.android.gms.internal.auth.zzam, com.google.android.gms.internal.auth.zzba
    public final void zzd(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.credentials.Credential credential) {
        this.zzds.setResult((com.google.android.gms.internal.auth.zzap) new com.google.android.gms.internal.auth.zzan(status, credential));
    }

    @Override // com.google.android.gms.internal.auth.zzam, com.google.android.gms.internal.auth.zzba
    public final void zze(com.google.android.gms.common.api.Status status) {
        this.zzds.setResult((com.google.android.gms.internal.auth.zzap) com.google.android.gms.internal.auth.zzan.zzf(status));
    }
}

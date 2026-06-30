package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
final class zzn extends com.google.android.gms.internal.auth.zzq {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzm zzah;

    public zzn(com.google.android.gms.internal.auth.zzm zzmVar) {
        this.zzah = zzmVar;
    }

    @Override // com.google.android.gms.internal.auth.zzq, com.google.android.gms.auth.account.zzd
    public final void zzf(android.accounts.Account account) {
        this.zzah.setResult((com.google.android.gms.internal.auth.zzm) new com.google.android.gms.internal.auth.zzr(account != null ? com.google.android.gms.common.api.Status.RESULT_SUCCESS : com.google.android.gms.internal.auth.zzk.zzaf, account));
    }
}

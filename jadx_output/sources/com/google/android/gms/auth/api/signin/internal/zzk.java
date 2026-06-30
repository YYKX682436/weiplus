package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
final class zzk extends com.google.android.gms.auth.api.signin.internal.zzd {
    private final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zzj zzex;

    public zzk(com.google.android.gms.auth.api.signin.internal.zzj zzjVar) {
        this.zzex = zzjVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzd, com.google.android.gms.auth.api.signin.internal.zzt
    public final void zzd(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Status status) {
        if (googleSignInAccount != null) {
            com.google.android.gms.auth.api.signin.internal.zzq.zze(this.zzex.val$context).zzd(this.zzex.zzew, googleSignInAccount);
        }
        this.zzex.setResult((com.google.android.gms.auth.api.signin.internal.zzj) new com.google.android.gms.auth.api.signin.GoogleSignInResult(googleSignInAccount, status));
    }
}

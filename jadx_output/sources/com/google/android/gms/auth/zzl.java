package com.google.android.gms.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzl implements com.google.android.gms.auth.zzm<java.lang.Boolean> {
    private final /* synthetic */ java.lang.String zzw;

    public zzl(java.lang.String str) {
        this.zzw = str;
    }

    @Override // com.google.android.gms.auth.zzm
    public final /* synthetic */ java.lang.Boolean zze(android.os.IBinder iBinder) {
        java.lang.Object zzd;
        com.google.android.gms.common.logging.Logger logger;
        zzd = com.google.android.gms.auth.zzg.zzd(com.google.android.gms.internal.auth.zzi.zzd(iBinder).zzd(this.zzw));
        android.os.Bundle bundle = (android.os.Bundle) zzd;
        java.lang.String string = bundle.getString("Error");
        android.content.Intent intent = (android.content.Intent) bundle.getParcelable("userRecoveryIntent");
        com.google.android.gms.internal.auth.zzbr zzh = com.google.android.gms.internal.auth.zzbr.zzh(string);
        if (com.google.android.gms.internal.auth.zzbr.SUCCESS.equals(zzh)) {
            return java.lang.Boolean.TRUE;
        }
        if (!com.google.android.gms.internal.auth.zzbr.zzd(zzh)) {
            throw new com.google.android.gms.auth.GoogleAuthException(string);
        }
        logger = com.google.android.gms.auth.zzg.zzq;
        java.lang.String valueOf = java.lang.String.valueOf(zzh);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 31);
        sb6.append("isUserRecoverableError status: ");
        sb6.append(valueOf);
        logger.w("GoogleAuthUtil", sb6.toString());
        throw new com.google.android.gms.auth.UserRecoverableAuthException(string, intent);
    }
}

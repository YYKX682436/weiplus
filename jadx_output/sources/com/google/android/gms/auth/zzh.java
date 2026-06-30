package com.google.android.gms.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzh implements com.google.android.gms.auth.zzm<com.google.android.gms.auth.TokenData> {
    private final /* synthetic */ android.os.Bundle val$options;
    private final /* synthetic */ android.accounts.Account zzr;
    private final /* synthetic */ java.lang.String zzs;

    public zzh(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        this.zzr = account;
        this.zzs = str;
        this.val$options = bundle;
    }

    @Override // com.google.android.gms.auth.zzm
    public final /* synthetic */ com.google.android.gms.auth.TokenData zze(android.os.IBinder iBinder) {
        java.lang.Object zzd;
        com.google.android.gms.common.logging.Logger logger;
        zzd = com.google.android.gms.auth.zzg.zzd(com.google.android.gms.internal.auth.zzi.zzd(iBinder).zzd(this.zzr, this.zzs, this.val$options));
        android.os.Bundle bundle = (android.os.Bundle) zzd;
        com.google.android.gms.auth.TokenData zzd2 = com.google.android.gms.auth.TokenData.zzd(bundle, "tokenDetails");
        if (zzd2 != null) {
            return zzd2;
        }
        java.lang.String string = bundle.getString("Error");
        android.content.Intent intent = (android.content.Intent) bundle.getParcelable("userRecoveryIntent");
        com.google.android.gms.internal.auth.zzbr zzh = com.google.android.gms.internal.auth.zzbr.zzh(string);
        if (!com.google.android.gms.internal.auth.zzbr.zzd(zzh)) {
            if (com.google.android.gms.internal.auth.zzbr.NETWORK_ERROR.equals(zzh) || com.google.android.gms.internal.auth.zzbr.SERVICE_UNAVAILABLE.equals(zzh)) {
                throw new java.io.IOException(string);
            }
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

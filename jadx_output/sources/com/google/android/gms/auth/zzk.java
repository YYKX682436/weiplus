package com.google.android.gms.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzk implements com.google.android.gms.auth.zzm<android.os.Bundle> {
    private final /* synthetic */ android.accounts.Account zzr;

    public zzk(android.accounts.Account account) {
        this.zzr = account;
    }

    @Override // com.google.android.gms.auth.zzm
    public final /* synthetic */ android.os.Bundle zze(android.os.IBinder iBinder) {
        java.lang.Object zzd;
        zzd = com.google.android.gms.auth.zzg.zzd(com.google.android.gms.internal.auth.zzi.zzd(iBinder).zzd(this.zzr));
        return (android.os.Bundle) zzd;
    }
}

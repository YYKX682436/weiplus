package com.google.android.gms.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzi implements com.google.android.gms.auth.zzm<java.lang.Void> {
    private final /* synthetic */ android.os.Bundle val$extras;
    private final /* synthetic */ java.lang.String zzt;

    public zzi(java.lang.String str, android.os.Bundle bundle) {
        this.zzt = str;
        this.val$extras = bundle;
    }

    @Override // com.google.android.gms.auth.zzm
    public final /* synthetic */ java.lang.Void zze(android.os.IBinder iBinder) {
        java.lang.Object zzd;
        zzd = com.google.android.gms.auth.zzg.zzd(com.google.android.gms.internal.auth.zzi.zzd(iBinder).zzd(this.zzt, this.val$extras));
        android.os.Bundle bundle = (android.os.Bundle) zzd;
        java.lang.String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new com.google.android.gms.auth.GoogleAuthException(string);
    }
}

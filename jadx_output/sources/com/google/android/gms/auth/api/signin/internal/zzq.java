package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
public final class zzq {
    private static com.google.android.gms.auth.api.signin.internal.zzq zzfa;
    private com.google.android.gms.auth.api.signin.internal.Storage zzfb;
    private com.google.android.gms.auth.api.signin.GoogleSignInAccount zzfc;
    private com.google.android.gms.auth.api.signin.GoogleSignInOptions zzfd;

    private zzq(android.content.Context context) {
        com.google.android.gms.auth.api.signin.internal.Storage storage = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(context);
        this.zzfb = storage;
        this.zzfc = storage.getSavedDefaultGoogleSignInAccount();
        this.zzfd = this.zzfb.getSavedDefaultGoogleSignInOptions();
    }

    public static synchronized com.google.android.gms.auth.api.signin.internal.zzq zze(android.content.Context context) {
        com.google.android.gms.auth.api.signin.internal.zzq zzf;
        synchronized (com.google.android.gms.auth.api.signin.internal.zzq.class) {
            zzf = zzf(context.getApplicationContext());
        }
        return zzf;
    }

    private static synchronized com.google.android.gms.auth.api.signin.internal.zzq zzf(android.content.Context context) {
        com.google.android.gms.auth.api.signin.internal.zzq zzqVar;
        synchronized (com.google.android.gms.auth.api.signin.internal.zzq.class) {
            if (zzfa == null) {
                zzfa = new com.google.android.gms.auth.api.signin.internal.zzq(context);
            }
            zzqVar = zzfa;
        }
        return zzqVar;
    }

    public final synchronized void clear() {
        this.zzfb.clear();
        this.zzfc = null;
        this.zzfd = null;
    }

    public final synchronized void zzd(com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this.zzfb.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
        this.zzfc = googleSignInAccount;
        this.zzfd = googleSignInOptions;
    }

    public final synchronized com.google.android.gms.auth.api.signin.GoogleSignInAccount zzo() {
        return this.zzfc;
    }

    public final synchronized com.google.android.gms.auth.api.signin.GoogleSignInOptions zzp() {
        return this.zzfd;
    }
}

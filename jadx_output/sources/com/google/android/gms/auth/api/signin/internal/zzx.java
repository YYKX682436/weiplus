package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
public final class zzx extends com.google.android.gms.auth.api.signin.internal.zzs {
    private final android.content.Context mContext;

    public zzx(android.content.Context context) {
        this.mContext = context;
    }

    private final void zzs() {
        if (com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesUid(this.mContext, android.os.Binder.getCallingUid())) {
            return;
        }
        int callingUid = android.os.Binder.getCallingUid();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(52);
        sb6.append("Calling UID ");
        sb6.append(callingUid);
        sb6.append(" is not Google Play services.");
        throw new java.lang.SecurityException(sb6.toString());
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzr
    public final void zzq() {
        zzs();
        com.google.android.gms.auth.api.signin.internal.Storage storage = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(this.mContext);
        com.google.android.gms.auth.api.signin.GoogleSignInAccount savedDefaultGoogleSignInAccount = storage.getSavedDefaultGoogleSignInAccount();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (savedDefaultGoogleSignInAccount != null) {
            googleSignInOptions = storage.getSavedDefaultGoogleSignInOptions();
        }
        com.google.android.gms.common.api.GoogleApiClient build = new com.google.android.gms.common.api.GoogleApiClient.Builder(this.mContext).addApi(com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API, googleSignInOptions).build();
        try {
            if (build.blockingConnect().isSuccess()) {
                if (savedDefaultGoogleSignInAccount != null) {
                    com.google.android.gms.auth.api.Auth.GoogleSignInApi.revokeAccess(build);
                } else {
                    build.clearDefaultAccountAndReconnect();
                }
            }
        } finally {
            build.disconnect();
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzr
    public final void zzr() {
        zzs();
        com.google.android.gms.auth.api.signin.internal.zzq.zze(this.mContext).clear();
    }
}

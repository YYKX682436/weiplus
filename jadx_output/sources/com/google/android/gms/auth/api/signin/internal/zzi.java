package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
public final class zzi {
    private static com.google.android.gms.common.logging.Logger zzer = new com.google.android.gms.common.logging.Logger("GoogleSignInCommon", new java.lang.String[0]);

    public static com.google.android.gms.auth.api.signin.GoogleSignInResult getSignInResultFromIntent(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount")) {
            return null;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
        return new com.google.android.gms.auth.api.signin.GoogleSignInResult(googleSignInAccount, status);
    }

    public static android.content.Intent zzd(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        zzer.d("getSignInIntent()", new java.lang.Object[0]);
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = new com.google.android.gms.auth.api.signin.internal.SignInConfiguration(context.getPackageName(), googleSignInOptions);
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, com.google.android.gms.auth.api.signin.internal.SignInHubActivity.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static android.content.Intent zze(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        zzer.d("getFallbackSignInIntent()", new java.lang.Object[0]);
        android.content.Intent zzd = zzd(context, googleSignInOptions);
        zzd.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return zzd;
    }

    public static android.content.Intent zzf(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        zzer.d("getNoImplementationSignInIntent()", new java.lang.Object[0]);
        android.content.Intent zzd = zzd(context, googleSignInOptions);
        zzd.setAction("com.google.android.gms.auth.NO_IMPL");
        return zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> zzd(com.google.android.gms.common.api.GoogleApiClient r5, android.content.Context r6, com.google.android.gms.auth.api.signin.GoogleSignInOptions r7, boolean r8) {
        /*
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.api.signin.internal.zzi.zzer
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "silentSignIn()"
            r0.d(r3, r2)
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.api.signin.internal.zzi.zzer
            java.lang.String r2 = "getEligibleSavedSignInResult()"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.d(r2, r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            com.google.android.gms.auth.api.signin.internal.zzq r0 = com.google.android.gms.auth.api.signin.internal.zzq.zze(r6)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r0.zzp()
            r2 = 0
            if (r0 == 0) goto L87
            android.accounts.Account r3 = r0.getAccount()
            android.accounts.Account r4 = r7.getAccount()
            if (r3 != 0) goto L31
            if (r4 != 0) goto L2f
            r3 = 1
            goto L35
        L2f:
            r3 = r1
            goto L35
        L31:
            boolean r3 = r3.equals(r4)
        L35:
            if (r3 == 0) goto L87
            boolean r3 = r7.isServerAuthCodeRequested()
            if (r3 != 0) goto L87
            boolean r3 = r7.isIdTokenRequested()
            if (r3 == 0) goto L57
            boolean r3 = r0.isIdTokenRequested()
            if (r3 == 0) goto L87
            java.lang.String r3 = r7.getServerClientId()
            java.lang.String r4 = r0.getServerClientId()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L87
        L57:
            java.util.HashSet r3 = new java.util.HashSet
            java.util.ArrayList r0 = r0.getScopes()
            r3.<init>(r0)
            java.util.HashSet r0 = new java.util.HashSet
            java.util.ArrayList r4 = r7.getScopes()
            r0.<init>(r4)
            boolean r0 = r3.containsAll(r0)
            if (r0 == 0) goto L87
            com.google.android.gms.auth.api.signin.internal.zzq r0 = com.google.android.gms.auth.api.signin.internal.zzq.zze(r6)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r0.zzo()
            if (r0 == 0) goto L87
            boolean r3 = r0.isExpired()
            if (r3 != 0) goto L87
            com.google.android.gms.auth.api.signin.GoogleSignInResult r3 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r3.<init>(r0, r4)
            goto L88
        L87:
            r3 = r2
        L88:
            if (r3 == 0) goto L98
            com.google.android.gms.common.logging.Logger r6 = com.google.android.gms.auth.api.signin.internal.zzi.zzer
            java.lang.String r7 = "Eligible saved sign in result found"
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r6.d(r7, r8)
            com.google.android.gms.common.api.OptionalPendingResult r5 = com.google.android.gms.common.api.PendingResults.immediatePendingResult(r3, r5)
            return r5
        L98:
            if (r8 == 0) goto Laa
            com.google.android.gms.auth.api.signin.GoogleSignInResult r6 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status
            r8 = 4
            r7.<init>(r8)
            r6.<init>(r2, r7)
            com.google.android.gms.common.api.OptionalPendingResult r5 = com.google.android.gms.common.api.PendingResults.immediatePendingResult(r6, r5)
            return r5
        Laa:
            com.google.android.gms.common.logging.Logger r8 = com.google.android.gms.auth.api.signin.internal.zzi.zzer
            java.lang.String r0 = "trySilentSignIn()"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r8.d(r0, r1)
            com.google.android.gms.auth.api.signin.internal.zzj r8 = new com.google.android.gms.auth.api.signin.internal.zzj
            r8.<init>(r5, r6, r7)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r5 = r5.enqueue(r8)
            com.google.android.gms.common.api.internal.OptionalPendingResultImpl r6 = new com.google.android.gms.common.api.internal.OptionalPendingResultImpl
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.zzi.zzd(com.google.android.gms.common.api.GoogleApiClient, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):com.google.android.gms.common.api.OptionalPendingResult");
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zze(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, boolean z17) {
        zzer.d("Revoking access", new java.lang.Object[0]);
        java.lang.String savedRefreshToken = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(context).getSavedRefreshToken();
        zzd(context);
        return z17 ? com.google.android.gms.auth.api.signin.internal.zze.zzg(savedRefreshToken) : googleApiClient.execute(new com.google.android.gms.auth.api.signin.internal.zzn(googleApiClient));
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zzd(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, boolean z17) {
        zzer.d("Signing out", new java.lang.Object[0]);
        zzd(context);
        return z17 ? com.google.android.gms.common.api.PendingResults.immediatePendingResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS, googleApiClient) : googleApiClient.execute(new com.google.android.gms.auth.api.signin.internal.zzl(googleApiClient));
    }

    private static void zzd(android.content.Context context) {
        com.google.android.gms.auth.api.signin.internal.zzq.zze(context).clear();
        java.util.Iterator<com.google.android.gms.common.api.GoogleApiClient> it = com.google.android.gms.common.api.GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        com.google.android.gms.common.api.internal.GoogleApiManager.reportSignOut();
    }
}

package com.google.android.gms.auth.api.signin;

/* loaded from: classes13.dex */
public class GoogleSignInClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.auth.api.signin.GoogleSignInOptions> {
    private static final com.google.android.gms.auth.api.signin.GoogleSignInClient.zzd zzef = new com.google.android.gms.auth.api.signin.GoogleSignInClient.zzd(null);
    private static int zzeg = com.google.android.gms.auth.api.signin.GoogleSignInClient.zze.zzei;

    /* loaded from: classes13.dex */
    public static class zzd implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter<com.google.android.gms.auth.api.signin.GoogleSignInResult, com.google.android.gms.auth.api.signin.GoogleSignInAccount> {
        private zzd() {
        }

        public /* synthetic */ zzd(com.google.android.gms.auth.api.signin.zzd zzdVar) {
            this();
        }

        @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
        public final /* synthetic */ com.google.android.gms.auth.api.signin.GoogleSignInAccount convert(com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
            return googleSignInResult.getSignInAccount();
        }
    }

    /* loaded from: classes13.dex */
    public enum zze {
        public static final int zzei = 1;
        public static final int zzej = 2;
        public static final int zzek = 3;
        public static final int zzel = 4;
        private static final /* synthetic */ int[] zzem = {1, 2, 3, 4};

        public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FC5N68SJFD5I2UPRDECNM2TBKD0NM2S395TPMIPRED5N2UHRFDTJMOPAJD5JMSIBE8DM6IPBEEGI4IRBGDHIMQPBEEHGN8QBFDOTG____0() {
            return (int[]) zzem.clone();
        }
    }

    public GoogleSignInClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        super(activity, com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    private final synchronized int zzl() {
        if (zzeg == com.google.android.gms.auth.api.signin.GoogleSignInClient.zze.zzei) {
            android.content.Context applicationContext = getApplicationContext();
            com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
            int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            zzeg = isGooglePlayServicesAvailable == 0 ? com.google.android.gms.auth.api.signin.GoogleSignInClient.zze.zzel : (googleApiAvailability.getErrorResolutionIntent(applicationContext, isGooglePlayServicesAvailable, null) != null || com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) ? com.google.android.gms.auth.api.signin.GoogleSignInClient.zze.zzej : com.google.android.gms.auth.api.signin.GoogleSignInClient.zze.zzek;
        }
        return zzeg;
    }

    public android.content.Intent getSignInIntent() {
        android.content.Context applicationContext = getApplicationContext();
        int i17 = com.google.android.gms.auth.api.signin.zzd.zzeh[zzl() - 1];
        return i17 != 1 ? i17 != 2 ? com.google.android.gms.auth.api.signin.internal.zzi.zzf(applicationContext, getApiOptions()) : com.google.android.gms.auth.api.signin.internal.zzi.zzd(applicationContext, getApiOptions()) : com.google.android.gms.auth.api.signin.internal.zzi.zze(applicationContext, getApiOptions());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> revokeAccess() {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.signin.internal.zzi.zze(asGoogleApiClient(), getApplicationContext(), zzl() == com.google.android.gms.auth.api.signin.GoogleSignInClient.zze.zzek));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> signOut() {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.signin.internal.zzi.zzd(asGoogleApiClient(), getApplicationContext(), zzl() == com.google.android.gms.auth.api.signin.GoogleSignInClient.zze.zzek));
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> silentSignIn() {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(com.google.android.gms.auth.api.signin.internal.zzi.zzd(asGoogleApiClient(), getApplicationContext(), getApiOptions(), zzl() == com.google.android.gms.auth.api.signin.GoogleSignInClient.zze.zzek), zzef);
    }

    public GoogleSignInClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        super(context, com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }
}

package com.google.android.gms.auth;

/* loaded from: classes13.dex */
public class zzg {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final java.lang.String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final java.lang.String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final java.lang.String WORK_ACCOUNT_TYPE = "com.google.work";
    private static final java.lang.String[] ACCEPTABLE_ACCOUNT_TYPES = {"com.google", "com.google.work", "cn.google"};
    public static final java.lang.String KEY_CALLER_UID = "callerUid";
    public static final java.lang.String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    private static final android.content.ComponentName zzp = new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final com.google.android.gms.common.logging.Logger zzq = new com.google.android.gms.common.logging.Logger("Auth", "GoogleAuthUtil");

    public static void clearToken(android.content.Context context, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context, 8400000);
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        java.lang.String str3 = KEY_ANDROID_PACKAGE_NAME;
        if (!bundle.containsKey(str3)) {
            bundle.putString(str3, str2);
        }
        zzd(context, zzp, new com.google.android.gms.auth.zzi(str, bundle));
    }

    private static void ensurePlayServicesAvailable(android.content.Context context, int i17) {
        try {
            com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context.getApplicationContext(), i17);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e17) {
            throw new com.google.android.gms.auth.GoogleAuthException(e17.getMessage());
        } catch (com.google.android.gms.common.GooglePlayServicesRepairableException e18) {
            throw new com.google.android.gms.auth.GooglePlayServicesAvailabilityException(e18.getConnectionStatusCode(), e18.getMessage(), e18.getIntent());
        }
    }

    public static java.util.List<com.google.android.gms.auth.AccountChangeEvent> getAccountChangeEvents(android.content.Context context, int i17, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "accountName must be provided");
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context, 8400000);
        return (java.util.List) zzd(context, zzp, new com.google.android.gms.auth.zzj(str, i17));
    }

    public static java.lang.String getAccountId(android.content.Context context, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "accountName must be provided");
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context, 8400000);
        return getToken(context, str, "^^_account_id_^^", new android.os.Bundle());
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str) {
        return getToken(context, account, str, new android.os.Bundle());
    }

    @java.lang.Deprecated
    public static void invalidateToken(android.content.Context context, java.lang.String str) {
        android.accounts.AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    public static android.os.Bundle removeAccount(android.content.Context context, android.accounts.Account account) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        zze(account);
        ensurePlayServicesAvailable(context, 8400000);
        return (android.os.Bundle) zzd(context, zzp, new com.google.android.gms.auth.zzk(account));
    }

    public static java.lang.Boolean requestGoogleAccountsAccess(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        ensurePlayServicesAvailable(context, 11400000);
        return (java.lang.Boolean) zzd(context, zzp, new com.google.android.gms.auth.zzl(context.getApplicationInfo().packageName));
    }

    public static com.google.android.gms.auth.TokenData zze(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Scope cannot be empty or null.");
        zze(account);
        ensurePlayServicesAvailable(context, 8400000);
        android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
        java.lang.String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        java.lang.String str3 = KEY_ANDROID_PACKAGE_NAME;
        if (android.text.TextUtils.isEmpty(bundle2.getString(str3))) {
            bundle2.putString(str3, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", android.os.SystemClock.elapsedRealtime());
        return (com.google.android.gms.auth.TokenData) zzd(context, zzp, new com.google.android.gms.auth.zzh(account, str, bundle2));
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        zze(account);
        return zze(context, account, str, bundle).zze();
    }

    private static <T> T zzd(android.content.Context context, android.content.ComponentName componentName, com.google.android.gms.auth.zzm<T> zzmVar) {
        com.google.android.gms.common.BlockingServiceConnection blockingServiceConnection = new com.google.android.gms.common.BlockingServiceConnection();
        com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(context);
        try {
            if (!gmsClientSupervisor.bindService(componentName, blockingServiceConnection, "GoogleAuthUtil")) {
                throw new java.io.IOException("Could not bind to service.");
            }
            try {
                return zzmVar.zze(blockingServiceConnection.getService());
            } catch (android.os.RemoteException | java.lang.InterruptedException e17) {
                zzq.i("GoogleAuthUtil", "Error on service connection.", e17);
                throw new java.io.IOException("Error on service connection.", e17);
            }
        } finally {
            gmsClientSupervisor.unbindService(componentName, blockingServiceConnection, "GoogleAuthUtil");
        }
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return getToken(context, new android.accounts.Account(str, "com.google"), str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T zzd(T t17) {
        if (t17 != null) {
            return t17;
        }
        zzq.w("GoogleAuthUtil", "Binder call returned null.");
        throw new java.io.IOException("Service unavailable.");
    }

    private static void zze(android.accounts.Account account) {
        if (account == null) {
            throw new java.lang.IllegalArgumentException("Account cannot be null");
        }
        if (android.text.TextUtils.isEmpty(account.name)) {
            throw new java.lang.IllegalArgumentException("Account name cannot be empty!");
        }
        for (java.lang.String str : ACCEPTABLE_ACCOUNT_TYPES) {
            if (str.equals(account.type)) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Account type not supported");
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        return getToken(context, new android.accounts.Account(str, "com.google"), str2, bundle);
    }
}

package com.google.android.gms.auth;

/* loaded from: classes13.dex */
public final class GoogleAuthUtil extends com.google.android.gms.auth.zzg {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final java.lang.String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final java.lang.String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final java.lang.String WORK_ACCOUNT_TYPE = "com.google.work";
    private static final java.lang.String KEY_CALLER_UID = com.google.android.gms.auth.zzg.KEY_CALLER_UID;
    private static final java.lang.String KEY_ANDROID_PACKAGE_NAME = com.google.android.gms.auth.zzg.KEY_ANDROID_PACKAGE_NAME;

    private GoogleAuthUtil() {
    }

    public static void clearToken(android.content.Context context, java.lang.String str) {
        com.google.android.gms.auth.zzg.clearToken(context, str);
    }

    public static java.util.List<com.google.android.gms.auth.AccountChangeEvent> getAccountChangeEvents(android.content.Context context, int i17, java.lang.String str) {
        return com.google.android.gms.auth.zzg.getAccountChangeEvents(context, i17, str);
    }

    public static java.lang.String getAccountId(android.content.Context context, java.lang.String str) {
        return com.google.android.gms.auth.zzg.getAccountId(context, str);
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str) {
        return com.google.android.gms.auth.zzg.getToken(context, account, str);
    }

    public static java.lang.String getTokenWithNotification(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        return zzd(context, account, str, bundle).zze();
    }

    @java.lang.Deprecated
    public static void invalidateToken(android.content.Context context, java.lang.String str) {
        com.google.android.gms.auth.zzg.invalidateToken(context, str);
    }

    public static android.os.Bundle removeAccount(android.content.Context context, android.accounts.Account account) {
        return com.google.android.gms.auth.zzg.removeAccount(context, account);
    }

    public static java.lang.Boolean requestGoogleAccountsAccess(android.content.Context context) {
        return com.google.android.gms.auth.zzg.requestGoogleAccountsAccess(context);
    }

    private static com.google.android.gms.auth.TokenData zzd(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        try {
            com.google.android.gms.auth.TokenData zze = com.google.android.gms.auth.zzg.zze(context, account, str, bundle);
            com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
            return zze;
        } catch (com.google.android.gms.auth.GooglePlayServicesAvailabilityException e17) {
            com.google.android.gms.common.GooglePlayServicesUtil.showErrorNotification(e17.getConnectionStatusCode(), context);
            throw new com.google.android.gms.auth.UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        } catch (com.google.android.gms.auth.UserRecoverableAuthException unused) {
            com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
            throw new com.google.android.gms.auth.UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        return com.google.android.gms.auth.zzg.getToken(context, account, str, bundle);
    }

    public static java.lang.String getTokenWithNotification(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle, android.content.Intent intent) {
        if (intent == null) {
            throw new java.lang.IllegalArgumentException("Callback cannot be null.");
        }
        try {
            android.content.Intent.parseUri(intent.toUri(1), 1);
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putParcelable("callback_intent", intent);
            bundle.putBoolean("handle_notification", true);
            return zzd(context, account, str, bundle).zze();
        } catch (java.net.URISyntaxException unused) {
            throw new java.lang.IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.google.android.gms.auth.zzg.getToken(context, str, str2);
    }

    public static java.lang.String getTokenWithNotification(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle, java.lang.String str2, android.os.Bundle bundle2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2, "Authority cannot be empty or null.");
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        if (bundle2 == null) {
            bundle2 = new android.os.Bundle();
        }
        android.content.ContentResolver.validateSyncExtrasBundle(bundle2);
        bundle.putString("authority", str2);
        bundle.putBundle("sync_extras", bundle2);
        bundle.putBoolean("handle_notification", true);
        return zzd(context, account, str, bundle).zze();
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        return com.google.android.gms.auth.zzg.getToken(context, str, str2, bundle);
    }

    @java.lang.Deprecated
    public static java.lang.String getTokenWithNotification(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        return getTokenWithNotification(context, new android.accounts.Account(str, "com.google"), str2, bundle);
    }

    @java.lang.Deprecated
    public static java.lang.String getTokenWithNotification(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, android.content.Intent intent) {
        return getTokenWithNotification(context, new android.accounts.Account(str, "com.google"), str2, bundle, intent);
    }

    @java.lang.Deprecated
    public static java.lang.String getTokenWithNotification(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3, android.os.Bundle bundle2) {
        return getTokenWithNotification(context, new android.accounts.Account(str, "com.google"), str2, bundle, str3, bundle2);
    }
}

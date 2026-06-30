package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8;

/* renamed from: com.google.android.gms.auth.GoogleAuthUtil */
/* loaded from: classes13.dex */
public final class C1637x34927343 extends com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg {

    /* renamed from: CHANGE_TYPE_ACCOUNT_ADDED */
    public static final int f5352x6d9b50d8 = 1;

    /* renamed from: CHANGE_TYPE_ACCOUNT_REMOVED */
    public static final int f5353xf98cee38 = 2;

    /* renamed from: CHANGE_TYPE_ACCOUNT_RENAMED_FROM */
    public static final int f5354xd5e3c88b = 3;

    /* renamed from: CHANGE_TYPE_ACCOUNT_RENAMED_TO */
    public static final int f5355xeb2d879c = 4;

    /* renamed from: GOOGLE_ACCOUNT_TYPE */
    public static final java.lang.String f5356x4a02672 = "com.google";

    /* renamed from: KEY_SUPPRESS_PROGRESS_SCREEN */
    public static final java.lang.String f5359xe1dbab34 = "suppressProgressScreen";

    /* renamed from: WORK_ACCOUNT_TYPE */
    public static final java.lang.String f5360x498f589a = "com.google.work";

    /* renamed from: KEY_CALLER_UID */
    private static final java.lang.String f5358xfd25bb7c = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.f5718xfd25bb7c;

    /* renamed from: KEY_ANDROID_PACKAGE_NAME */
    private static final java.lang.String f5357xa55ad8f4 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.f5717xa55ad8f4;

    private C1637x34927343() {
    }

    /* renamed from: clearToken */
    public static void m17296xd3b4fbac(android.content.Context context, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.m17575xd3b4fbac(context, str);
    }

    /* renamed from: getAccountChangeEvents */
    public static java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1632x7ecee87d> m17297x688a3c80(android.content.Context context, int i17, java.lang.String str) {
        return com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.m17577x688a3c80(context, i17, str);
    }

    /* renamed from: getAccountId */
    public static java.lang.String m17298x92872d72(android.content.Context context, java.lang.String str) {
        return com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.m17578x92872d72(context, str);
    }

    /* renamed from: getToken */
    public static java.lang.String m17299x75346043(android.content.Context context, android.accounts.Account account, java.lang.String str) {
        return com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.m17579x75346043(context, account, str);
    }

    /* renamed from: getTokenWithNotification */
    public static java.lang.String m17303x4b7a5334(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        return zzd(context, account, str, bundle).zze();
    }

    @java.lang.Deprecated
    /* renamed from: invalidateToken */
    public static void m17309xb628257e(android.content.Context context, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.m17583xb628257e(context, str);
    }

    /* renamed from: removeAccount */
    public static android.os.Bundle m17310x1154d09(android.content.Context context, android.accounts.Account account) {
        return com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.m17584x1154d09(context, account);
    }

    /* renamed from: requestGoogleAccountsAccess */
    public static java.lang.Boolean m17311xab1bf4b2(android.content.Context context) {
        return com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.m17585xab1bf4b2(context);
    }

    private static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923 zzd(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923 zze = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.zze(context, account, str, bundle);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17668x9b3d7995(context);
            return zze;
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1638x7f83bd49 e17) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1712x8c1d834d.m17666xd6620196(e17.m17312x4e7042f3(), context);
            throw new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1641xf88da04("User intervention required. Notification has been pushed.");
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1640xc0e88674 unused) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17668x9b3d7995(context);
            throw new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1641xf88da04("User intervention required. Notification has been pushed.");
        }
    }

    /* renamed from: getToken */
    public static java.lang.String m17300x75346043(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        return com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.m17580x75346043(context, account, str, bundle);
    }

    /* renamed from: getTokenWithNotification */
    public static java.lang.String m17304x4b7a5334(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle, android.content.Intent intent) {
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
    /* renamed from: getToken */
    public static java.lang.String m17301x75346043(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.m17581x75346043(context, str, str2);
    }

    /* renamed from: getTokenWithNotification */
    public static java.lang.String m17305x4b7a5334(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle, java.lang.String str2, android.os.Bundle bundle2) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18209xec737762(str2, "Authority cannot be empty or null.");
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
    /* renamed from: getToken */
    public static java.lang.String m17302x75346043(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        return com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.m17582x75346043(context, str, str2, bundle);
    }

    @java.lang.Deprecated
    /* renamed from: getTokenWithNotification */
    public static java.lang.String m17306x4b7a5334(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        return m17303x4b7a5334(context, new android.accounts.Account(str, "com.google"), str2, bundle);
    }

    @java.lang.Deprecated
    /* renamed from: getTokenWithNotification */
    public static java.lang.String m17307x4b7a5334(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, android.content.Intent intent) {
        return m17304x4b7a5334(context, new android.accounts.Account(str, "com.google"), str2, bundle, intent);
    }

    @java.lang.Deprecated
    /* renamed from: getTokenWithNotification */
    public static java.lang.String m17308x4b7a5334(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3, android.os.Bundle bundle2) {
        return m17305x4b7a5334(context, new android.accounts.Account(str, "com.google"), str2, bundle, str3, bundle2);
    }
}

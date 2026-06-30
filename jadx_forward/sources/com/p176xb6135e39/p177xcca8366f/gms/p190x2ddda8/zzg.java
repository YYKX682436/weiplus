package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8;

/* loaded from: classes13.dex */
public class zzg {

    /* renamed from: CHANGE_TYPE_ACCOUNT_ADDED */
    public static final int f5712x6d9b50d8 = 1;

    /* renamed from: CHANGE_TYPE_ACCOUNT_REMOVED */
    public static final int f5713xf98cee38 = 2;

    /* renamed from: CHANGE_TYPE_ACCOUNT_RENAMED_FROM */
    public static final int f5714xd5e3c88b = 3;

    /* renamed from: CHANGE_TYPE_ACCOUNT_RENAMED_TO */
    public static final int f5715xeb2d879c = 4;

    /* renamed from: GOOGLE_ACCOUNT_TYPE */
    public static final java.lang.String f5716x4a02672 = "com.google";

    /* renamed from: KEY_SUPPRESS_PROGRESS_SCREEN */
    public static final java.lang.String f5719xe1dbab34 = "suppressProgressScreen";

    /* renamed from: WORK_ACCOUNT_TYPE */
    public static final java.lang.String f5720x498f589a = "com.google.work";

    /* renamed from: ACCEPTABLE_ACCOUNT_TYPES */
    private static final java.lang.String[] f5711x66b7cc8a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: KEY_CALLER_UID */
    public static final java.lang.String f5718xfd25bb7c = "callerUid";

    /* renamed from: KEY_ANDROID_PACKAGE_NAME */
    public static final java.lang.String f5717xa55ad8f4 = "androidPackageName";
    private static final android.content.ComponentName zzp = new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p209x1466cb5f.C1959x87fce1b0 zzq = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p209x1466cb5f.C1959x87fce1b0("Auth", "GoogleAuthUtil");

    /* renamed from: clearToken */
    public static void m17575xd3b4fbac(android.content.Context context, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18213xfcae242e("Calling this from your main thread can lead to deadlock");
        m17576x6c218d99(context, 8400000);
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        java.lang.String str3 = f5717xa55ad8f4;
        if (!bundle.containsKey(str3)) {
            bundle.putString(str3, str2);
        }
        zzd(context, zzp, new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzi(str, bundle));
    }

    /* renamed from: ensurePlayServicesAvailable */
    private static void m17576x6c218d99(android.content.Context context, int i17) {
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17670x6c218d99(context.getApplicationContext(), i17);
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1710x6991fbce e17) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1636x9e992dae(e17.getMessage());
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1711xec211afd e18) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1638x7f83bd49(e18.m17652x4e7042f3(), e18.getMessage(), e18.m17701x1e885992());
        }
    }

    /* renamed from: getAccountChangeEvents */
    public static java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1632x7ecee87d> m17577x688a3c80(android.content.Context context, int i17, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18209xec737762(str, "accountName must be provided");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18213xfcae242e("Calling this from your main thread can lead to deadlock");
        m17576x6c218d99(context, 8400000);
        return (java.util.List) zzd(context, zzp, new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzj(str, i17));
    }

    /* renamed from: getAccountId */
    public static java.lang.String m17578x92872d72(android.content.Context context, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18209xec737762(str, "accountName must be provided");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18213xfcae242e("Calling this from your main thread can lead to deadlock");
        m17576x6c218d99(context, 8400000);
        return m17582x75346043(context, str, "^^_account_id_^^", new android.os.Bundle());
    }

    /* renamed from: getToken */
    public static java.lang.String m17579x75346043(android.content.Context context, android.accounts.Account account, java.lang.String str) {
        return m17580x75346043(context, account, str, new android.os.Bundle());
    }

    @java.lang.Deprecated
    /* renamed from: invalidateToken */
    public static void m17583xb628257e(android.content.Context context, java.lang.String str) {
        android.accounts.AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    /* renamed from: removeAccount */
    public static android.os.Bundle m17584x1154d09(android.content.Context context, android.accounts.Account account) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
        zze(account);
        m17576x6c218d99(context, 8400000);
        return (android.os.Bundle) zzd(context, zzp, new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzk(account));
    }

    /* renamed from: requestGoogleAccountsAccess */
    public static java.lang.Boolean m17585xab1bf4b2(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
        m17576x6c218d99(context, 11400000);
        return (java.lang.Boolean) zzd(context, zzp, new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzl(context.getApplicationInfo().packageName));
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923 zze(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18213xfcae242e("Calling this from your main thread can lead to deadlock");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18209xec737762(str, "Scope cannot be empty or null.");
        zze(account);
        m17576x6c218d99(context, 8400000);
        android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
        java.lang.String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        java.lang.String str3 = f5717xa55ad8f4;
        if (android.text.TextUtils.isEmpty(bundle2.getString(str3))) {
            bundle2.putString(str3, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", android.os.SystemClock.elapsedRealtime());
        return (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923) zzd(context, zzp, new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzh(account, str, bundle2));
    }

    /* renamed from: getToken */
    public static java.lang.String m17580x75346043(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        zze(account);
        return zze(context, account, str, bundle).zze();
    }

    private static <T> T zzd(android.content.Context context, android.content.ComponentName componentName, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzm<T> zzmVar) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.ServiceConnectionC1699x6b5d879e serviceConnectionC1699x6b5d879e = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.ServiceConnectionC1699x6b5d879e();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0 m18165x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0.m18165x9cf0d20b(context);
        try {
            if (!m18165x9cf0d20b.m18170x54856bb8(componentName, serviceConnectionC1699x6b5d879e, "GoogleAuthUtil")) {
                throw new java.io.IOException("Could not bind to service.");
            }
            try {
                return zzmVar.zze(serviceConnectionC1699x6b5d879e.m17596xb411027f());
            } catch (android.os.RemoteException | java.lang.InterruptedException e17) {
                zzq.i("GoogleAuthUtil", "Error on service connection.", e17);
                throw new java.io.IOException("Error on service connection.", e17);
            }
        } finally {
            m18165x9cf0d20b.m18173xa4bc737f(componentName, serviceConnectionC1699x6b5d879e, "GoogleAuthUtil");
        }
    }

    @java.lang.Deprecated
    /* renamed from: getToken */
    public static java.lang.String m17581x75346043(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return m17579x75346043(context, new android.accounts.Account(str, "com.google"), str2);
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
        for (java.lang.String str : f5711x66b7cc8a) {
            if (str.equals(account.type)) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Account type not supported");
    }

    @java.lang.Deprecated
    /* renamed from: getToken */
    public static java.lang.String m17582x75346043(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        return m17580x75346043(context, new android.accounts.Account(str, "com.google"), str2, bundle);
    }
}

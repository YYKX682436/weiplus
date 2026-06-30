package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
public final class zac {
    private static final x.n zaa = new x.n();
    private static java.util.Locale zab;

    public static java.lang.String zaa(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        try {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(context).m18637xa6cfc2fa(packageName).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
            java.lang.String str = context.getApplicationInfo().name;
            return android.text.TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static java.lang.String zab(android.content.Context context, int i17) {
        android.content.res.Resources resources = context.getResources();
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? resources.getString(android.R.string.ok) : resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5770x80194e86) : resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5779xe4352080) : resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5773x232fb43e);
    }

    public static java.lang.String zac(android.content.Context context, int i17) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String zaa2 = zaa(context);
        if (i17 == 1) {
            return resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5774x295ba539, zaa2);
        }
        if (i17 == 2) {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.m18568xbed280e8(context) ? resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5783xb055e20b) : resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5780xb1f339fb, zaa2);
        }
        if (i17 == 3) {
            return resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5771x7ef73181, zaa2);
        }
        if (i17 == 5) {
            return zag(context, "common_google_play_services_invalid_account_text", zaa2);
        }
        if (i17 == 7) {
            return zag(context, "common_google_play_services_network_error_text", zaa2);
        }
        if (i17 == 9) {
            return resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5778x1f5744df, zaa2);
        }
        if (i17 == 20) {
            return zag(context, "common_google_play_services_restricted_profile_text", zaa2);
        }
        switch (i17) {
            case 16:
                return zag(context, "common_google_play_services_api_unavailable_text", zaa2);
            case 17:
                return zag(context, "common_google_play_services_sign_in_failed_text", zaa2);
            case 18:
                return resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5782xa4894b9e, zaa2);
            default:
                return resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.R.C1721xcad56011.f5845xcb01d1bc, zaa2);
        }
    }

    public static java.lang.String zad(android.content.Context context, int i17) {
        return (i17 == 6 || i17 == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaa(context)) : zac(context, i17);
    }

    public static java.lang.String zae(android.content.Context context, int i17) {
        java.lang.String zah = i17 == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaf(context, i17);
        return zah == null ? context.getResources().getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5777xb6e5d7f6) : zah;
    }

    public static java.lang.String zaf(android.content.Context context, int i17) {
        android.content.res.Resources resources = context.getResources();
        if (i17 == 1) {
            return resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5775x21ac3cc);
        }
        if (i17 == 2) {
            return resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5781x8c75c74a);
        }
        if (i17 == 3) {
            return resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5772x5ff0c084);
        }
        if (i17 == 5) {
            return zah(context, "common_google_play_services_invalid_account_title");
        }
        if (i17 == 7) {
            return zah(context, "common_google_play_services_network_error_title");
        }
        if (i17 == 17) {
            return zah(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i17 != 20) {
            return null;
        }
        return zah(context, "common_google_play_services_restricted_profile_title");
    }

    private static java.lang.String zag(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String zah = zah(context, str);
        if (zah == null) {
            zah = resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.R.C1721xcad56011.f5845xcb01d1bc);
        }
        return java.lang.String.format(resources.getConfiguration().locale, zah, str2);
    }

    private static java.lang.String zah(android.content.Context context, java.lang.String str) {
        x.n nVar = zaa;
        synchronized (nVar) {
            java.util.Locale locale = j3.i.a(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(zab)) {
                nVar.clear();
                zab = locale;
            }
            java.lang.String str2 = (java.lang.String) nVar.m174751x4aabfc28(str, null);
            if (str2 != null) {
                return str2;
            }
            android.content.res.Resources m17659x92a7476a = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1712x8c1d834d.m17659x92a7476a(context);
            if (m17659x92a7476a == null) {
                return null;
            }
            int identifier = m17659x92a7476a.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                return null;
            }
            java.lang.String string = m17659x92a7476a.getString(identifier);
            if (android.text.TextUtils.isEmpty(string)) {
                return null;
            }
            nVar.put(str, string);
            return string;
        }
    }
}

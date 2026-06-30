package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class zac {
    private static final x.n zaa = new x.n();
    private static java.util.Locale zab;

    public static java.lang.String zaa(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        try {
            return com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
            java.lang.String str = context.getApplicationInfo().name;
            return android.text.TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static java.lang.String zab(android.content.Context context, int i17) {
        android.content.res.Resources resources = context.getResources();
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? resources.getString(android.R.string.ok) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_button) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
    }

    public static java.lang.String zac(android.content.Context context, int i17) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String zaa2 = zaa(context);
        if (i17 == 1) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, zaa2);
        }
        if (i17 == 2) {
            return com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, zaa2);
        }
        if (i17 == 3) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, zaa2);
        }
        if (i17 == 5) {
            return zag(context, "common_google_play_services_invalid_account_text", zaa2);
        }
        if (i17 == 7) {
            return zag(context, "common_google_play_services_network_error_text", zaa2);
        }
        if (i17 == 9) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, zaa2);
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
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, zaa2);
            default:
                return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, zaa2);
        }
    }

    public static java.lang.String zad(android.content.Context context, int i17) {
        return (i17 == 6 || i17 == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaa(context)) : zac(context, i17);
    }

    public static java.lang.String zae(android.content.Context context, int i17) {
        java.lang.String zah = i17 == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaf(context, i17);
        return zah == null ? context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker) : zah;
    }

    public static java.lang.String zaf(android.content.Context context, int i17) {
        android.content.res.Resources resources = context.getResources();
        if (i17 == 1) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
        }
        if (i17 == 2) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
        }
        if (i17 == 3) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
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
            zah = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
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
            java.lang.String str2 = (java.lang.String) nVar.getOrDefault(str, null);
            if (str2 != null) {
                return str2;
            }
            android.content.res.Resources remoteResource = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                return null;
            }
            java.lang.String string = remoteResource.getString(identifier);
            if (android.text.TextUtils.isEmpty(string)) {
                return null;
            }
            nVar.put(str, string);
            return string;
        }
    }
}

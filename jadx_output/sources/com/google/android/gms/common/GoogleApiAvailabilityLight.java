package com.google.android.gms.common;

/* loaded from: classes13.dex */
public class GoogleApiAvailabilityLight {
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final java.lang.String TRACKING_SOURCE_DIALOG = "d";
    static final java.lang.String TRACKING_SOURCE_NOTIFICATION = "n";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza = new com.google.android.gms.common.GoogleApiAvailabilityLight();

    public static com.google.android.gms.common.GoogleApiAvailabilityLight getInstance() {
        return zza;
    }

    public void cancelAvailabilityErrorNotifications(android.content.Context context) {
        com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    public int getApkVersion(android.content.Context context) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getApkVersion(context);
    }

    public int getClientVersion(android.content.Context context) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getClientVersion(context);
    }

    @java.lang.Deprecated
    public android.content.Intent getErrorResolutionIntent(int i17) {
        return getErrorResolutionIntent(null, i17, null);
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, int i17, int i18) {
        return getErrorResolutionPendingIntent(context, i17, i18, null);
    }

    public java.lang.String getErrorString(int i17) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorString(i17);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public int isGooglePlayServicesAvailable(android.content.Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public boolean isPlayServicesPossiblyUpdating(android.content.Context context, int i17) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i17);
    }

    public boolean isPlayStorePossiblyUpdating(android.content.Context context, int i17) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i17);
    }

    public boolean isUninstalledAppPossiblyUpdating(android.content.Context context, java.lang.String str) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.zza(context, str);
    }

    public boolean isUserResolvableError(int i17) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isUserRecoverableError(i17);
    }

    public void verifyGooglePlayServicesIsAvailable(android.content.Context context, int i17) {
        com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, i17);
    }

    public android.content.Intent getErrorResolutionIntent(android.content.Context context, int i17, java.lang.String str) {
        if (i17 != 1 && i17 != 2) {
            if (i17 != 3) {
                return null;
            }
            android.net.Uri fromParts = android.net.Uri.fromParts("package", "com.google.android.gms", null);
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(context)) {
            android.content.Intent intent2 = new android.content.Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gcore_");
        sb6.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        sb6.append("-");
        if (!android.text.TextUtils.isEmpty(str)) {
            sb6.append(str);
        }
        sb6.append("-");
        if (context != null) {
            sb6.append(context.getPackageName());
        }
        sb6.append("-");
        if (context != null) {
            try {
                sb6.append(com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        java.lang.String sb7 = sb6.toString();
        android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW");
        android.net.Uri.Builder appendQueryParameter = android.net.Uri.parse("market://details").buildUpon().appendQueryParameter(dm.i4.COL_ID, "com.google.android.gms");
        if (!android.text.TextUtils.isEmpty(sb7)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb7);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, int i17, int i18, java.lang.String str) {
        android.content.Intent errorResolutionIntent = getErrorResolutionIntent(context, i17, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(context, i18, errorResolutionIntent, com.google.android.gms.internal.common.zzd.zza | 134217728);
    }

    public int isGooglePlayServicesAvailable(android.content.Context context, int i17) {
        int isGooglePlayServicesAvailable = com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i17);
        if (com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }
}

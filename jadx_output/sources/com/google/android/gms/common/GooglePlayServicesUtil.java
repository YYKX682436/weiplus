package com.google.android.gms.common;

/* loaded from: classes13.dex */
public final class GooglePlayServicesUtil extends com.google.android.gms.common.GooglePlayServicesUtilLight {
    public static final java.lang.String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @java.lang.Deprecated
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @java.lang.Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @java.lang.Deprecated
    public static android.app.Dialog getErrorDialog(int i17, android.app.Activity activity, int i18) {
        return getErrorDialog(i17, activity, i18, null);
    }

    @java.lang.Deprecated
    public static android.app.PendingIntent getErrorPendingIntent(int i17, android.content.Context context, int i18) {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i17, i18);
    }

    @java.lang.Deprecated
    public static java.lang.String getErrorString(int i17) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorString(i17);
    }

    public static android.content.Context getRemoteContext(android.content.Context context) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    public static android.content.res.Resources getRemoteResource(android.content.Context context) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(android.content.Context context) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @java.lang.Deprecated
    public static boolean isUserRecoverableError(int i17) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isUserRecoverableError(i17);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    public static boolean showErrorDialogFragment(int i17, android.app.Activity activity, int i18) {
        return showErrorDialogFragment(i17, activity, i18, null);
    }

    @java.lang.Deprecated
    public static void showErrorNotification(int i17, android.content.Context context) {
        com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        if (com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i17) || com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i17)) {
            googleApiAvailability.zaf(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i17);
        }
    }

    @java.lang.Deprecated
    public static android.app.Dialog getErrorDialog(int i17, android.app.Activity activity, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (true == com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i17)) {
            i17 = 18;
        }
        return com.google.android.gms.common.GoogleApiAvailability.getInstance().getErrorDialog(activity, i17, i18, onCancelListener);
    }

    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(android.content.Context context, int i17) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i17);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    public static boolean showErrorDialogFragment(int i17, android.app.Activity activity, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i17, activity, null, i18, onCancelListener);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i17, android.app.Activity activity, androidx.fragment.app.Fragment fragment, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (true == com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i17)) {
            i17 = 18;
        }
        int i19 = i17;
        com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i19, i18, onCancelListener);
        }
        android.app.Dialog zaa = googleApiAvailability.zaa(activity, i19, com.google.android.gms.common.internal.zag.zac(fragment, com.google.android.gms.common.GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i19, "d"), i18), onCancelListener, null);
        if (zaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, zaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}

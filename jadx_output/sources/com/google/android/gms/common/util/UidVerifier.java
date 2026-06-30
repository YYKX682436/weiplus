package com.google.android.gms.common.util;

/* loaded from: classes13.dex */
public final class UidVerifier {
    private UidVerifier() {
    }

    public static boolean isGooglePlayServicesUid(android.content.Context context, int i17) {
        if (!uidHasPackageName(context, i17, "com.google.android.gms")) {
            return false;
        }
        try {
            return com.google.android.gms.common.GoogleSignatureVerifier.getInstance(context).isGooglePublicSignedPackage(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    public static boolean uidHasPackageName(android.content.Context context, int i17, java.lang.String str) {
        return com.google.android.gms.common.wrappers.Wrappers.packageManager(context).zza(i17, str);
    }
}

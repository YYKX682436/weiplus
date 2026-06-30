package com.google.android.gms.common.util;

/* loaded from: classes13.dex */
public class AndroidUtilsLight {
    private static volatile int zza = -1;

    @java.lang.Deprecated
    public static byte[] getPackageCertificateHashBytes(android.content.Context context, java.lang.String str) {
        java.security.MessageDigest zza2;
        android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(str, 64);
        android.content.pm.Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (zza2 = zza("SHA1")) == null) {
            return null;
        }
        return zza2.digest(packageInfo.signatures[0].toByteArray());
    }

    public static java.security.MessageDigest zza(java.lang.String str) {
        java.security.MessageDigest messageDigest;
        for (int i17 = 0; i17 < 2; i17++) {
            try {
                messageDigest = java.security.MessageDigest.getInstance(str);
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

/* renamed from: com.google.android.gms.common.util.AndroidUtilsLight */
/* loaded from: classes13.dex */
public class C1986xd2c94e94 {
    private static volatile int zza = -1;

    @java.lang.Deprecated
    /* renamed from: getPackageCertificateHashBytes */
    public static byte[] m18508x4d4b3c56(android.content.Context context, java.lang.String str) {
        java.security.MessageDigest zza2;
        android.content.pm.PackageInfo m18639xffec0de = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(context).m18639xffec0de(str, 64);
        android.content.pm.Signature[] signatureArr = m18639xffec0de.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (zza2 = zza("SHA1")) == null) {
            return null;
        }
        return zza2.digest(m18639xffec0de.signatures[0].toByteArray());
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

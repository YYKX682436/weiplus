package com.google.android.gms.common;

@com.google.errorprone.annotations.RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes13.dex */
public class PackageSignatureVerifier {
    static volatile com.google.android.gms.common.zzac zza;
    private static com.google.android.gms.common.zzad zzb;

    private static com.google.android.gms.common.zzad zza(android.content.Context context) {
        com.google.android.gms.common.zzad zzadVar;
        synchronized (com.google.android.gms.common.PackageSignatureVerifier.class) {
            if (zzb == null) {
                zzb = new com.google.android.gms.common.zzad(context);
            }
            zzadVar = zzb;
        }
        return zzadVar;
    }

    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified(android.content.Context context, java.lang.String str) {
        com.google.android.gms.common.PackageVerificationResult packageVerificationResult;
        java.lang.String str2;
        com.google.android.gms.common.PackageVerificationResult packageVerificationResult2;
        boolean honorsDebugCertificates = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        if (!com.google.android.gms.common.zzn.zzf()) {
            throw new com.google.android.gms.common.zzae();
        }
        java.lang.String concat = java.lang.String.valueOf(str).concat(true != honorsDebugCertificates ? "-0" : "-1");
        if (zza != null) {
            str2 = zza.zza;
            if (str2.equals(concat)) {
                packageVerificationResult2 = zza.zzb;
                return packageVerificationResult2;
            }
        }
        zza(context);
        com.google.android.gms.common.zzx zzc = com.google.android.gms.common.zzn.zzc(str, honorsDebugCertificates, false, false);
        if (!zzc.zza) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzc.zzb);
            return com.google.android.gms.common.PackageVerificationResult.zza(str, zzc.zzb, zzc.zzc);
        }
        zza = new com.google.android.gms.common.zzac(concat, com.google.android.gms.common.PackageVerificationResult.zzd(str, zzc.zzd));
        packageVerificationResult = zza.zzb;
        return packageVerificationResult;
    }

    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerifiedWithRetry(android.content.Context context, java.lang.String str) {
        try {
            com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            queryPackageSignatureVerified.zzb();
            return queryPackageSignatureVerified;
        } catch (java.lang.SecurityException unused) {
            com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (queryPackageSignatureVerified2.zzc()) {
            }
            return queryPackageSignatureVerified2;
        }
    }
}

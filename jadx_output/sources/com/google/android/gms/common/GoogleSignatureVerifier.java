package com.google.android.gms.common;

@com.google.errorprone.annotations.RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes13.dex */
public class GoogleSignatureVerifier {
    private static com.google.android.gms.common.GoogleSignatureVerifier zza;
    private static volatile java.util.Set zzb;
    private final android.content.Context zzc;
    private volatile java.lang.String zzd;

    public GoogleSignatureVerifier(android.content.Context context) {
        this.zzc = context.getApplicationContext();
    }

    public static com.google.android.gms.common.GoogleSignatureVerifier getInstance(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        synchronized (com.google.android.gms.common.GoogleSignatureVerifier.class) {
            if (zza == null) {
                com.google.android.gms.common.zzn.zze(context);
                zza = new com.google.android.gms.common.GoogleSignatureVerifier(context);
            }
        }
        return zza;
    }

    public static final com.google.android.gms.common.zzj zza(android.content.pm.PackageInfo packageInfo, com.google.android.gms.common.zzj... zzjVarArr) {
        android.content.pm.Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        com.google.android.gms.common.zzk zzkVar = new com.google.android.gms.common.zzk(packageInfo.signatures[0].toByteArray());
        for (int i17 = 0; i17 < zzjVarArr.length; i17++) {
            if (zzjVarArr[i17].equals(zzkVar)) {
                return zzjVarArr[i17];
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zzb(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L2a
            if (r4 == 0) goto L28
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L2a
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = r4
        L2b:
            if (r4 == 0) goto L49
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L49
            if (r5 == 0) goto L3a
            com.google.android.gms.common.zzj[] r4 = com.google.android.gms.common.zzm.zza
            com.google.android.gms.common.zzj r4 = zza(r2, r4)
            goto L46
        L3a:
            com.google.android.gms.common.zzj[] r4 = new com.google.android.gms.common.zzj[r0]
            com.google.android.gms.common.zzj[] r5 = com.google.android.gms.common.zzm.zza
            r5 = r5[r1]
            r4[r1] = r5
            com.google.android.gms.common.zzj r4 = zza(r2, r4)
        L46:
            if (r4 == 0) goto L49
            return r0
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zzb(android.content.pm.PackageInfo, boolean):boolean");
    }

    private final com.google.android.gms.common.zzx zzc(java.lang.String str, boolean z17, boolean z18) {
        com.google.android.gms.common.zzx zzc;
        android.content.pm.ApplicationInfo applicationInfo;
        if (str == null) {
            return com.google.android.gms.common.zzx.zzc("null pkg");
        }
        if (str.equals(this.zzd)) {
            return com.google.android.gms.common.zzx.zzb();
        }
        if (com.google.android.gms.common.zzn.zzg()) {
            zzc = com.google.android.gms.common.zzn.zzb(str, com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc), false, false);
        } else {
            try {
                android.content.pm.PackageInfo packageInfo = this.zzc.getPackageManager().getPackageInfo(str, 64);
                boolean honorsDebugCertificates = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc);
                if (packageInfo == null) {
                    zzc = com.google.android.gms.common.zzx.zzc("null pkg");
                } else {
                    android.content.pm.Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        zzc = com.google.android.gms.common.zzx.zzc("single cert required");
                    } else {
                        com.google.android.gms.common.zzk zzkVar = new com.google.android.gms.common.zzk(packageInfo.signatures[0].toByteArray());
                        java.lang.String str2 = packageInfo.packageName;
                        com.google.android.gms.common.zzx zza2 = com.google.android.gms.common.zzn.zza(str2, zzkVar, honorsDebugCertificates, false);
                        zzc = (!zza2.zza || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !com.google.android.gms.common.zzn.zza(str2, zzkVar, false, true).zza) ? zza2 : com.google.android.gms.common.zzx.zzc("debuggable release cert app rejected");
                    }
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                return com.google.android.gms.common.zzx.zzd("no pkg ".concat(str), e17);
            }
        }
        if (zzc.zza) {
            this.zzd = str;
        }
        return zzc;
    }

    public boolean isGooglePublicSignedPackage(android.content.pm.PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        return zzb(packageInfo, true) && com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc);
    }

    public boolean isPackageGoogleSigned(java.lang.String str) {
        com.google.android.gms.common.zzx zzc = zzc(str, false, false);
        zzc.zze();
        return zzc.zza;
    }

    public boolean isUidGoogleSigned(int i17) {
        com.google.android.gms.common.zzx zzc;
        int length;
        java.lang.String[] packagesForUid = this.zzc.getPackageManager().getPackagesForUid(i17);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzc = null;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzc);
                    break;
                }
                zzc = zzc(packagesForUid[i18], false, false);
                if (zzc.zza) {
                    break;
                }
                i18++;
            }
        } else {
            zzc = com.google.android.gms.common.zzx.zzc("no pkgs");
        }
        zzc.zze();
        return zzc.zza;
    }
}

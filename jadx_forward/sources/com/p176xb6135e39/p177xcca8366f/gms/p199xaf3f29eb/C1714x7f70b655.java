package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

@com.google.errorprone.annotations.RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: com.google.android.gms.common.GoogleSignatureVerifier */
/* loaded from: classes13.dex */
public class C1714x7f70b655 {
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1714x7f70b655 zza;
    private static volatile java.util.Set zzb;
    private final android.content.Context zzc;
    private volatile java.lang.String zzd;

    public C1714x7f70b655(android.content.Context context) {
        this.zzc = context.getApplicationContext();
    }

    /* renamed from: getInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1714x7f70b655 m17688x9cf0d20b(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1714x7f70b655.class) {
            if (zza == null) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzn.zze(context);
                zza = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1714x7f70b655(context);
            }
        }
        return zza;
    }

    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj zza(android.content.pm.PackageInfo packageInfo, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj... zzjVarArr) {
        android.content.pm.Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzk zzkVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzk(packageInfo.signatures[0].toByteArray());
        for (int i17 = 0; i17 < zzjVarArr.length; i17++) {
            if (zzjVarArr[i17].m18645xb2c87fbf(zzkVar)) {
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
            com.google.android.gms.common.zzj[] r4 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzm.zza
            com.google.android.gms.common.zzj r4 = zza(r2, r4)
            goto L46
        L3a:
            com.google.android.gms.common.zzj[] r4 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj[r0]
            com.google.android.gms.common.zzj[] r5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzm.zza
            r5 = r5[r1]
            r4[r1] = r5
            com.google.android.gms.common.zzj r4 = zza(r2, r4)
        L46:
            if (r4 == 0) goto L49
            return r0
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1714x7f70b655.zzb(android.content.pm.PackageInfo, boolean):boolean");
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzc(java.lang.String str, boolean z17, boolean z18) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzc;
        android.content.pm.ApplicationInfo applicationInfo;
        if (str == null) {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzc("null pkg");
        }
        if (str.equals(this.zzd)) {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzb();
        }
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzn.zzg()) {
            zzc = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzn.zzb(str, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17678x5882f166(this.zzc), false, false);
        } else {
            try {
                android.content.pm.PackageInfo packageInfo = this.zzc.getPackageManager().getPackageInfo(str, 64);
                boolean m17678x5882f166 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17678x5882f166(this.zzc);
                if (packageInfo == null) {
                    zzc = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzc("null pkg");
                } else {
                    android.content.pm.Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        zzc = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzc("single cert required");
                    } else {
                        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzk zzkVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzk(packageInfo.signatures[0].toByteArray());
                        java.lang.String str2 = packageInfo.packageName;
                        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zza2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzn.zza(str2, zzkVar, m17678x5882f166, false);
                        zzc = (!zza2.zza || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzn.zza(str2, zzkVar, false, true).zza) ? zza2 : com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzc("debuggable release cert app rejected");
                    }
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzd("no pkg ".concat(str), e17);
            }
        }
        if (zzc.zza) {
            this.zzd = str;
        }
        return zzc;
    }

    /* renamed from: isGooglePublicSignedPackage */
    public boolean m17689x3fdfd09e(android.content.pm.PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        return zzb(packageInfo, true) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17678x5882f166(this.zzc);
    }

    /* renamed from: isPackageGoogleSigned */
    public boolean m17690x2ec8091(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzc = zzc(str, false, false);
        zzc.zze();
        return zzc.zza;
    }

    /* renamed from: isUidGoogleSigned */
    public boolean m17691x9970fc9b(int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzc;
        int length;
        java.lang.String[] packagesForUid = this.zzc.getPackageManager().getPackagesForUid(i17);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzc = null;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zzc);
                    break;
                }
                zzc = zzc(packagesForUid[i18], false, false);
                if (zzc.zza) {
                    break;
                }
                i18++;
            }
        } else {
            zzc = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzc("no pkgs");
        }
        zzc.zze();
        return zzc.zza;
    }
}

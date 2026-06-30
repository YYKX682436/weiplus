package com.google.android.gms.common.wrappers;

/* loaded from: classes13.dex */
public class PackageManagerWrapper {
    protected final android.content.Context zza;

    public PackageManagerWrapper(android.content.Context context) {
        this.zza = context;
    }

    public int checkCallingOrSelfPermission(java.lang.String str) {
        return this.zza.checkCallingOrSelfPermission(str);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public int checkPermission(java.lang.String str, java.lang.String str2) {
        return this.zza.getPackageManager().checkPermission(str, str2);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String str, int i17) {
        return this.zza.getPackageManager().getApplicationInfo(str, i17);
    }

    public java.lang.CharSequence getApplicationLabel(java.lang.String str) {
        android.content.Context context = this.zza;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public m3.d getApplicationLabelAndIcon(java.lang.String str) {
        android.content.pm.ApplicationInfo applicationInfo = this.zza.getPackageManager().getApplicationInfo(str, 0);
        return new m3.d(this.zza.getPackageManager().getApplicationLabel(applicationInfo), this.zza.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public android.content.pm.PackageInfo getPackageInfo(java.lang.String str, int i17) {
        return this.zza.getPackageManager().getPackageInfo(str, i17);
    }

    public boolean isCallerInstantApp() {
        java.lang.String nameForUid;
        if (android.os.Binder.getCallingUid() == android.os.Process.myUid()) {
            return com.google.android.gms.common.wrappers.InstantApps.isInstantApp(this.zza);
        }
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO() || (nameForUid = this.zza.getPackageManager().getNameForUid(android.os.Binder.getCallingUid())) == null) {
            return false;
        }
        return this.zza.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean zza(int i17, java.lang.String str) {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat()) {
            try {
                android.app.AppOpsManager appOpsManager = (android.app.AppOpsManager) this.zza.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new java.lang.NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i17, str);
                return true;
            } catch (java.lang.SecurityException unused) {
                return false;
            }
        }
        java.lang.String[] packagesForUid = this.zza.getPackageManager().getPackagesForUid(i17);
        if (str != null && packagesForUid != null) {
            for (java.lang.String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}

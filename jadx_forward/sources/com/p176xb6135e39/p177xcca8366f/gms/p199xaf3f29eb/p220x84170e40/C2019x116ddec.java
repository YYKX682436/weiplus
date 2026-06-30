package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40;

/* renamed from: com.google.android.gms.common.wrappers.PackageManagerWrapper */
/* loaded from: classes13.dex */
public class C2019x116ddec {
    protected final android.content.Context zza;

    public C2019x116ddec(android.content.Context context) {
        this.zza = context;
    }

    /* renamed from: checkCallingOrSelfPermission */
    public int m18634x2890b1ba(java.lang.String str) {
        return this.zza.checkCallingOrSelfPermission(str);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: checkPermission */
    public int m18635x28e6dcf7(java.lang.String str, java.lang.String str2) {
        return this.zza.getPackageManager().checkPermission(str, str2);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: getApplicationInfo */
    public android.content.pm.ApplicationInfo m18636x9a0587e8(java.lang.String str, int i17) {
        return this.zza.getPackageManager().getApplicationInfo(str, i17);
    }

    /* renamed from: getApplicationLabel */
    public java.lang.CharSequence m18637xa6cfc2fa(java.lang.String str) {
        android.content.Context context = this.zza;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: getApplicationLabelAndIcon */
    public m3.d m18638x2805ce96(java.lang.String str) {
        android.content.pm.ApplicationInfo applicationInfo = this.zza.getPackageManager().getApplicationInfo(str, 0);
        return new m3.d(this.zza.getPackageManager().getApplicationLabel(applicationInfo), this.zza.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: getPackageInfo */
    public android.content.pm.PackageInfo m18639xffec0de(java.lang.String str, int i17) {
        return this.zza.getPackageManager().getPackageInfo(str, i17);
    }

    /* renamed from: isCallerInstantApp */
    public boolean m18640xddd753b5() {
        java.lang.String nameForUid;
        if (android.os.Binder.getCallingUid() == android.os.Process.myUid()) {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2018xe6ff33d3.m18633xb736014a(this.zza);
        }
        if (!com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18606xacc9ec63() || (nameForUid = this.zza.getPackageManager().getNameForUid(android.os.Binder.getCallingUid())) == null) {
            return false;
        }
        return this.zza.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean zza(int i17, java.lang.String str) {
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18600x48a37bb4()) {
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

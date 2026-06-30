package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzfx {
    private final com.google.android.gms.internal.measurement.zzgl zzacw;
    volatile com.google.android.gms.internal.measurement.zzr zzakw;
    private android.content.ServiceConnection zzakx;

    public zzfx(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        this.zzacw = zzglVar;
    }

    private final boolean zzji() {
        try {
            com.google.android.gms.common.wrappers.PackageManagerWrapper packageManager = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzacw.getContext());
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.zzacw.zzge().zzir().log("Failed to retrieve Package Manager to check Play Store compatibility");
            return false;
        } catch (java.lang.Exception e17) {
            this.zzacw.zzge().zzir().zzg("Failed to retrieve Play Store version", e17);
            return false;
        }
    }

    public final void zzc(android.os.Bundle bundle) {
        com.google.android.gms.internal.measurement.zzfi zzim;
        java.lang.String str;
        this.zzacw.zzab();
        if (bundle == null) {
            return;
        }
        long j17 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
        if (j17 == 0) {
            zzim = this.zzacw.zzge().zzim();
            str = "Service response is missing Install Referrer install timestamp";
        } else {
            java.lang.String string = bundle.getString("install_referrer");
            if (string == null || string.isEmpty()) {
                zzim = this.zzacw.zzge().zzim();
                str = "No referrer defined in install referrer response";
            } else {
                this.zzacw.zzge().zzit().zzg("InstallReferrer API result", string);
                android.os.Bundle zza = this.zzacw.zzgb().zza(android.net.Uri.parse(string.length() != 0 ? "?".concat(string) : new java.lang.String("?")));
                if (zza == null) {
                    zzim = this.zzacw.zzge().zzim();
                    str = "No campaign params defined in install referrer result";
                } else {
                    java.lang.String string2 = zza.getString(ya.b.MEDIUM);
                    if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                        long j18 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                        if (j18 == 0) {
                            zzim = this.zzacw.zzge().zzim();
                            str = "Install Referrer is missing click timestamp for ad campaign";
                        } else {
                            zza.putLong("click_timestamp", j18);
                        }
                    }
                    if (j17 != this.zzacw.zzgf().zzaka.get()) {
                        zza.putString("_cis", "referrer API");
                        this.zzacw.zzgf().zzaka.set(j17);
                        this.zzacw.zzfu().logEvent("auto", "_cmp", zza);
                        if (this.zzakx != null) {
                            com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.zzacw.getContext(), this.zzakx);
                            return;
                        }
                        return;
                    }
                    zzim = this.zzacw.zzge().zzit();
                    str = "Campaign has already been logged";
                }
            }
        }
        zzim.log(str);
    }

    public final void zzjh() {
        this.zzacw.zzab();
        if (!zzji()) {
            this.zzacw.zzge().zzir().log("Install Referrer Reporter is not available");
            this.zzakx = null;
            return;
        }
        this.zzakx = new com.google.android.gms.internal.measurement.zzfz(this);
        this.zzacw.zzge().zzir().log("Install Referrer Reporter is initializing");
        this.zzacw.zzab();
        android.content.Intent intent = new android.content.Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new android.content.ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        android.content.pm.PackageManager packageManager = this.zzacw.getContext().getPackageManager();
        if (packageManager == null) {
            this.zzacw.zzge().zzip().log("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.zzacw.zzge().zzir().log("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        android.content.pm.ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            java.lang.String str = serviceInfo.packageName;
            if (serviceInfo.name == null || this.zzakx == null || !"com.android.vending".equals(str) || !zzji()) {
                this.zzacw.zzge().zzir().log("Play Store missing or incompatible. Version 8.3.73 or later required");
                return;
            }
            try {
                this.zzacw.zzge().zzir().zzg("Install Referrer Service is", com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(this.zzacw.getContext(), new android.content.Intent(intent), this.zzakx, 1) ? "available" : "not available");
            } catch (java.lang.Exception e17) {
                this.zzacw.zzge().zzim().zzg("Exception occurred while binding to Install Referrer Service", e17.getMessage());
            }
        }
    }

    public final android.os.Bundle zzjj() {
        this.zzacw.zzab();
        if (this.zzakw == null) {
            this.zzacw.zzge().zzip().log("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("package_name", this.zzacw.getContext().getPackageName());
        try {
            android.os.Bundle zza = this.zzakw.zza(bundle);
            if (zza != null) {
                return zza;
            }
            this.zzacw.zzge().zzim().log("Install Referrer Service returned a null response");
            return null;
        } catch (java.lang.Exception e17) {
            this.zzacw.zzge().zzim().zzg("Exception occurred while retrieving the Install Referrer", e17.getMessage());
            return null;
        }
    }
}

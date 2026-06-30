package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzfx */
/* loaded from: classes16.dex */
public final class C2233x394c12 {

    /* renamed from: zzacw */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 f6688x6f02155;

    /* renamed from: zzakw */
    volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.zzr f6689x6f0224d;

    /* renamed from: zzakx */
    private android.content.ServiceConnection f6690x6f0224e;

    public C2233x394c12(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        this.f6688x6f02155 = c2247x394c25;
    }

    /* renamed from: zzji */
    private final boolean m19141x394c7f() {
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2019x116ddec m18642x2e2c3887 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(this.f6688x6f02155.mo18960x76847179());
            if (m18642x2e2c3887 != null) {
                return m18642x2e2c3887.m18639xffec0de("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f6688x6f02155.mo18976x394c1e().m19113x394c69().log("Failed to retrieve Package Manager to check Play Store compatibility");
            return false;
        } catch (java.lang.Exception e17) {
            this.f6688x6f02155.mo18976x394c1e().m19113x394c69().zzg("Failed to retrieve Play Store version", e17);
            return false;
        }
    }

    public final void zzc(android.os.Bundle bundle) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19108x394c64;
        java.lang.String str;
        this.f6688x6f02155.mo19164x394b61();
        if (bundle == null) {
            return;
        }
        long j17 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
        if (j17 == 0) {
            m19108x394c64 = this.f6688x6f02155.mo18976x394c1e().m19108x394c64();
            str = "Service response is missing Install Referrer install timestamp";
        } else {
            java.lang.String string = bundle.getString("install_referrer");
            if (string == null || string.isEmpty()) {
                m19108x394c64 = this.f6688x6f02155.mo18976x394c1e().m19108x394c64();
                str = "No referrer defined in install referrer response";
            } else {
                this.f6688x6f02155.mo18976x394c1e().m19115x394c6b().zzg("InstallReferrer API result", string);
                android.os.Bundle zza = this.f6688x6f02155.mo19173x394c1b().zza(android.net.Uri.parse(string.length() != 0 ? "?".concat(string) : new java.lang.String("?")));
                if (zza == null) {
                    m19108x394c64 = this.f6688x6f02155.mo18976x394c1e().m19108x394c64();
                    str = "No campaign params defined in install referrer result";
                } else {
                    java.lang.String string2 = zza.getString(ya.b.f77490x87518375);
                    if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                        long j18 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                        if (j18 == 0) {
                            m19108x394c64 = this.f6688x6f02155.mo18976x394c1e().m19108x394c64();
                            str = "Install Referrer is missing click timestamp for ad campaign";
                        } else {
                            zza.putLong("click_timestamp", j18);
                        }
                    }
                    if (j17 != this.f6688x6f02155.mo19175x394c1f().f6654x6f02237.get()) {
                        zza.putString("_cis", "referrer API");
                        this.f6688x6f02155.mo19175x394c1f().f6654x6f02237.set(j17);
                        this.f6688x6f02155.m19166x394c0f().m19195x769949b6("auto", "_cmp", zza);
                        if (this.f6690x6f0224e != null) {
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b().m18495xa4bc737f(this.f6688x6f02155.mo18960x76847179(), this.f6690x6f0224e);
                            return;
                        }
                        return;
                    }
                    m19108x394c64 = this.f6688x6f02155.mo18976x394c1e().m19115x394c6b();
                    str = "Campaign has already been logged";
                }
            }
        }
        m19108x394c64.log(str);
    }

    /* renamed from: zzjh */
    public final void m19142x394c7e() {
        this.f6688x6f02155.mo19164x394b61();
        if (!m19141x394c7f()) {
            this.f6688x6f02155.mo18976x394c1e().m19113x394c69().log("Install Referrer Reporter is not available");
            this.f6690x6f0224e = null;
            return;
        }
        this.f6690x6f0224e = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.ServiceConnectionC2235x394c14(this);
        this.f6688x6f02155.mo18976x394c1e().m19113x394c69().log("Install Referrer Reporter is initializing");
        this.f6688x6f02155.mo19164x394b61();
        android.content.Intent intent = new android.content.Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new android.content.ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        android.content.pm.PackageManager packageManager = this.f6688x6f02155.mo18960x76847179().getPackageManager();
        if (packageManager == null) {
            this.f6688x6f02155.mo18976x394c1e().m19111x394c67().log("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f6688x6f02155.mo18976x394c1e().m19113x394c69().log("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        android.content.pm.ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            java.lang.String str = serviceInfo.packageName;
            if (serviceInfo.name == null || this.f6690x6f0224e == null || !"com.android.vending".equals(str) || !m19141x394c7f()) {
                this.f6688x6f02155.mo18976x394c1e().m19113x394c69().log("Play Store missing or incompatible. Version 8.3.73 or later required");
                return;
            }
            try {
                this.f6688x6f02155.mo18976x394c1e().m19113x394c69().zzg("Install Referrer Service is", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b().m18494x54856bb8(this.f6688x6f02155.mo18960x76847179(), new android.content.Intent(intent), this.f6690x6f0224e, 1) ? "available" : "not available");
            } catch (java.lang.Exception e17) {
                this.f6688x6f02155.mo18976x394c1e().m19108x394c64().zzg("Exception occurred while binding to Install Referrer Service", e17.getMessage());
            }
        }
    }

    /* renamed from: zzjj */
    public final android.os.Bundle m19143x394c80() {
        this.f6688x6f02155.mo19164x394b61();
        if (this.f6689x6f0224d == null) {
            this.f6688x6f02155.mo18976x394c1e().m19111x394c67().log("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("package_name", this.f6688x6f02155.mo18960x76847179().getPackageName());
        try {
            android.os.Bundle zza = this.f6689x6f0224d.zza(bundle);
            if (zza != null) {
                return zza;
            }
            this.f6688x6f02155.mo18976x394c1e().m19108x394c64().log("Install Referrer Service returned a null response");
            return null;
        } catch (java.lang.Exception e17) {
            this.f6688x6f02155.mo18976x394c1e().m19108x394c64().zzg("Exception occurred while retrieving the Install Referrer", e17.getMessage());
            return null;
        }
    }
}

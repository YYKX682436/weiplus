package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzfr extends com.google.android.gms.internal.measurement.zzhh {
    static final android.util.Pair<java.lang.String, java.lang.Long> zzajs = new android.util.Pair<>("", 0L);
    private android.content.SharedPreferences zzabf;
    public com.google.android.gms.internal.measurement.zzfv zzajt;
    public final com.google.android.gms.internal.measurement.zzfu zzaju;
    public final com.google.android.gms.internal.measurement.zzfu zzajv;
    public final com.google.android.gms.internal.measurement.zzfu zzajw;
    public final com.google.android.gms.internal.measurement.zzfu zzajx;
    public final com.google.android.gms.internal.measurement.zzfu zzajy;
    public final com.google.android.gms.internal.measurement.zzfu zzajz;
    public final com.google.android.gms.internal.measurement.zzfu zzaka;
    public final com.google.android.gms.internal.measurement.zzfw zzakb;
    private java.lang.String zzakc;
    private boolean zzakd;
    private long zzake;
    private java.lang.String zzakf;
    private long zzakg;
    private final java.lang.Object zzakh;
    public final com.google.android.gms.internal.measurement.zzfu zzaki;
    public final com.google.android.gms.internal.measurement.zzfu zzakj;
    public final com.google.android.gms.internal.measurement.zzft zzakk;
    public final com.google.android.gms.internal.measurement.zzfu zzakl;
    public final com.google.android.gms.internal.measurement.zzfu zzakm;
    public boolean zzakn;

    public zzfr(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
        this.zzaju = new com.google.android.gms.internal.measurement.zzfu(this, "last_upload", 0L);
        this.zzajv = new com.google.android.gms.internal.measurement.zzfu(this, "last_upload_attempt", 0L);
        this.zzajw = new com.google.android.gms.internal.measurement.zzfu(this, "backoff", 0L);
        this.zzajx = new com.google.android.gms.internal.measurement.zzfu(this, "last_delete_stale", 0L);
        this.zzaki = new com.google.android.gms.internal.measurement.zzfu(this, "time_before_start", com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        this.zzakj = new com.google.android.gms.internal.measurement.zzfu(this, "session_timeout", 1800000L);
        this.zzakk = new com.google.android.gms.internal.measurement.zzft(this, "start_new_session", true);
        this.zzakl = new com.google.android.gms.internal.measurement.zzfu(this, "last_pause_time", 0L);
        this.zzakm = new com.google.android.gms.internal.measurement.zzfu(this, "time_active", 0L);
        this.zzajy = new com.google.android.gms.internal.measurement.zzfu(this, "midnight_offset", 0L);
        this.zzajz = new com.google.android.gms.internal.measurement.zzfu(this, "first_open_time", 0L);
        this.zzaka = new com.google.android.gms.internal.measurement.zzfu(this, "app_install_time", 0L);
        this.zzakb = new com.google.android.gms.internal.measurement.zzfw(this, "app_instance_id", null);
        this.zzakh = new java.lang.Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.content.SharedPreferences zziy() {
        zzab();
        zzch();
        return this.zzabf;
    }

    public final void setMeasurementEnabled(boolean z17) {
        zzab();
        zzge().zzit().zzg("Setting measurementEnabled", java.lang.Boolean.valueOf(z17));
        android.content.SharedPreferences.Editor edit = zziy().edit();
        edit.putBoolean("measurement_enabled", z17);
        edit.apply();
    }

    public final android.util.Pair<java.lang.String, java.lang.Boolean> zzbo(java.lang.String str) {
        zzab();
        long elapsedRealtime = zzbt().elapsedRealtime();
        if (this.zzakc != null && elapsedRealtime < this.zzake) {
            return new android.util.Pair<>(this.zzakc, java.lang.Boolean.valueOf(this.zzakd));
        }
        this.zzake = elapsedRealtime + zzgg().zza(str, com.google.android.gms.internal.measurement.zzew.zzagj);
        com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(getContext());
            if (advertisingIdInfo != null) {
                this.zzakc = advertisingIdInfo.getId();
                this.zzakd = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.zzakc == null) {
                this.zzakc = "";
            }
        } catch (java.lang.Exception e17) {
            zzge().zzis().zzg("Unable to get advertising id", e17);
            this.zzakc = "";
        }
        com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new android.util.Pair<>(this.zzakc, java.lang.Boolean.valueOf(this.zzakd));
    }

    public final java.lang.String zzbp(java.lang.String str) {
        zzab();
        java.lang.String str2 = (java.lang.String) zzbo(str).first;
        java.security.MessageDigest messageDigest = com.google.android.gms.internal.measurement.zzka.getMessageDigest("MD5");
        if (messageDigest == null) {
            return null;
        }
        return java.lang.String.format(java.util.Locale.US, "%032X", new java.math.BigInteger(1, messageDigest.digest(str2.getBytes())));
    }

    public final void zzbq(java.lang.String str) {
        zzab();
        android.content.SharedPreferences.Editor edit = zziy().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    public final void zzbr(java.lang.String str) {
        synchronized (this.zzakh) {
            this.zzakf = str;
            this.zzakg = zzbt().elapsedRealtime();
        }
    }

    public final void zzf(boolean z17) {
        zzab();
        zzge().zzit().zzg("Setting useService", java.lang.Boolean.valueOf(z17));
        android.content.SharedPreferences.Editor edit = zziy().edit();
        edit.putBoolean("use_service", z17);
        edit.apply();
    }

    public final boolean zzg(boolean z17) {
        zzab();
        return zziy().getBoolean("measurement_enabled", z17);
    }

    public final void zzh(boolean z17) {
        zzab();
        zzge().zzit().zzg("Updating deferred analytics collection", java.lang.Boolean.valueOf(z17));
        android.content.SharedPreferences.Editor edit = zziy().edit();
        edit.putBoolean("deferred_analytics_collection", z17);
        edit.apply();
    }

    @Override // com.google.android.gms.internal.measurement.zzhh
    public final boolean zzhf() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzhh
    public final void zzih() {
        android.content.SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzabf = sharedPreferences;
        boolean z17 = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzakn = z17;
        if (!z17) {
            android.content.SharedPreferences.Editor edit = this.zzabf.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzajt = new com.google.android.gms.internal.measurement.zzfv(this, "health_monitor", java.lang.Math.max(0L, com.google.android.gms.internal.measurement.zzew.zzagk.get().longValue()));
    }

    public final java.lang.String zziz() {
        zzab();
        return zziy().getString("gmp_app_id", null);
    }

    public final java.lang.String zzja() {
        synchronized (this.zzakh) {
            if (java.lang.Math.abs(zzbt().elapsedRealtime() - this.zzakg) >= 1000) {
                return null;
            }
            return this.zzakf;
        }
    }

    public final java.lang.Boolean zzjb() {
        zzab();
        if (zziy().contains("use_service")) {
            return java.lang.Boolean.valueOf(zziy().getBoolean("use_service", false));
        }
        return null;
    }

    public final void zzjc() {
        zzab();
        zzge().zzit().log("Clearing collection preferences.");
        boolean contains = zziy().contains("measurement_enabled");
        boolean zzg = contains ? zzg(true) : true;
        android.content.SharedPreferences.Editor edit = zziy().edit();
        edit.clear();
        edit.apply();
        if (contains) {
            setMeasurementEnabled(zzg);
        }
    }

    public final java.lang.String zzjd() {
        zzab();
        java.lang.String string = zziy().getString("previous_os_version", null);
        zzfw().zzch();
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(string)) {
            android.content.SharedPreferences.Editor edit = zziy().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    public final boolean zzje() {
        zzab();
        return zziy().getBoolean("deferred_analytics_collection", false);
    }

    public final boolean zzjf() {
        return this.zzabf.contains("deferred_analytics_collection");
    }
}

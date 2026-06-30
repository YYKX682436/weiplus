package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzef extends com.google.android.gms.internal.measurement.zzhg {
    private com.google.android.gms.internal.measurement.zzeh zzaet;
    private java.lang.Boolean zzxz;

    public zzef(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
        this.zzaet = com.google.android.gms.internal.measurement.zzeg.zzaeu;
    }

    public static long zzhh() {
        return com.google.android.gms.internal.measurement.zzew.zzahl.get().longValue();
    }

    public static long zzhi() {
        return com.google.android.gms.internal.measurement.zzew.zzagl.get().longValue();
    }

    public static boolean zzhk() {
        return com.google.android.gms.internal.measurement.zzew.zzagh.get().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    public final long zza(java.lang.String str, com.google.android.gms.internal.measurement.zzex<java.lang.Long> zzexVar) {
        if (str != null) {
            java.lang.String zze = this.zzaet.zze(str, zzexVar.getKey());
            if (!android.text.TextUtils.isEmpty(zze)) {
                try {
                    return zzexVar.get(java.lang.Long.valueOf(java.lang.Long.parseLong(zze))).longValue();
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return zzexVar.get().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final int zzar(java.lang.String str) {
        return zzb(str, com.google.android.gms.internal.measurement.zzew.zzagw);
    }

    public final java.lang.Boolean zzas(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        try {
            if (getContext().getPackageManager() == null) {
                zzge().zzim().log("Failed to load metadata: PackageManager is null");
                return null;
            }
            android.content.pm.ApplicationInfo applicationInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(getContext()).getApplicationInfo(getContext().getPackageName(), 128);
            if (applicationInfo == null) {
                zzge().zzim().log("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            android.os.Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                zzge().zzim().log("Failed to load metadata: Metadata bundle is null");
                return null;
            }
            if (bundle.containsKey(str)) {
                return java.lang.Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            zzge().zzim().zzg("Failed to load metadata: Package name not found", e17);
            return null;
        }
    }

    public final boolean zzat(java.lang.String str) {
        return "1".equals(this.zzaet.zze(str, "gaia_collection_enabled"));
    }

    public final boolean zzau(java.lang.String str) {
        return "1".equals(this.zzaet.zze(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzav(java.lang.String str) {
        return zzd(str, com.google.android.gms.internal.measurement.zzew.zzahu);
    }

    public final boolean zzaw(java.lang.String str) {
        return zzd(str, com.google.android.gms.internal.measurement.zzew.zzahw);
    }

    public final boolean zzax(java.lang.String str) {
        return zzd(str, com.google.android.gms.internal.measurement.zzew.zzahx);
    }

    public final boolean zzay(java.lang.String str) {
        return zzd(str, com.google.android.gms.internal.measurement.zzew.zzahy);
    }

    public final boolean zzaz(java.lang.String str) {
        return zzd(str, com.google.android.gms.internal.measurement.zzew.zzahz);
    }

    public final int zzb(java.lang.String str, com.google.android.gms.internal.measurement.zzex<java.lang.Integer> zzexVar) {
        if (str != null) {
            java.lang.String zze = this.zzaet.zze(str, zzexVar.getKey());
            if (!android.text.TextUtils.isEmpty(zze)) {
                try {
                    return zzexVar.get(java.lang.Integer.valueOf(java.lang.Integer.parseInt(zze))).intValue();
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return zzexVar.get().intValue();
    }

    public final boolean zzba(java.lang.String str) {
        return zzd(str, com.google.android.gms.internal.measurement.zzew.zzaic);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzbt() {
        return super.zzbt();
    }

    public final double zzc(java.lang.String str, com.google.android.gms.internal.measurement.zzex<java.lang.Double> zzexVar) {
        if (str != null) {
            java.lang.String zze = this.zzaet.zze(str, zzexVar.getKey());
            if (!android.text.TextUtils.isEmpty(zze)) {
                try {
                    return zzexVar.get(java.lang.Double.valueOf(java.lang.Double.parseDouble(zze))).doubleValue();
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return zzexVar.get().doubleValue();
    }

    public final boolean zzd(java.lang.String str, com.google.android.gms.internal.measurement.zzex<java.lang.Boolean> zzexVar) {
        java.lang.Boolean bool;
        if (str != null) {
            java.lang.String zze = this.zzaet.zze(str, zzexVar.getKey());
            if (!android.text.TextUtils.isEmpty(zze)) {
                bool = zzexVar.get(java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(zze)));
                return bool.booleanValue();
            }
        }
        bool = zzexVar.get();
        return bool.booleanValue();
    }

    public final boolean zzds() {
        if (this.zzxz == null) {
            synchronized (this) {
                if (this.zzxz == null) {
                    android.content.pm.ApplicationInfo applicationInfo = getContext().getApplicationInfo();
                    java.lang.String myProcessName = com.google.android.gms.common.util.ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        java.lang.String str = applicationInfo.processName;
                        this.zzxz = java.lang.Boolean.valueOf(str != null && str.equals(myProcessName));
                    }
                    if (this.zzxz == null) {
                        this.zzxz = java.lang.Boolean.TRUE;
                        zzge().zzim().log("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzxz.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfr() {
        super.zzfr();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfs() {
        super.zzfs();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzdu zzft() {
        return super.zzft();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzfu() {
        return super.zzfu();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzfv() {
        return super.zzfv();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzeo zzfw() {
        return super.zzfw();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzii zzfx() {
        return super.zzfx();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzif zzfy() {
        return super.zzfy();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfc zzfz() {
        return super.zzfz();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfe zzga() {
        return super.zzga();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzka zzgb() {
        return super.zzgb();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzjh zzgc() {
        return super.zzgc();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgg zzgd() {
        return super.zzgd();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfg zzge() {
        return super.zzge();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfr zzgf() {
        return super.zzgf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzef zzgg() {
        return super.zzgg();
    }

    public final boolean zzhg() {
        java.lang.Boolean zzas = zzas("firebase_analytics_collection_deactivated");
        return zzas != null && zzas.booleanValue();
    }

    public final java.lang.String zzhj() {
        com.google.android.gms.internal.measurement.zzfi zzim;
        java.lang.String str;
        try {
            return (java.lang.String) java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class, java.lang.String.class).invoke(null, "debug.firebase.analytics.app", "");
        } catch (java.lang.ClassNotFoundException e17) {
            e = e17;
            zzim = zzge().zzim();
            str = "Could not find SystemProperties class";
            zzim.zzg(str, e);
            return "";
        } catch (java.lang.IllegalAccessException e18) {
            e = e18;
            zzim = zzge().zzim();
            str = "Could not access SystemProperties.get()";
            zzim.zzg(str, e);
            return "";
        } catch (java.lang.NoSuchMethodException e19) {
            e = e19;
            zzim = zzge().zzim();
            str = "Could not find SystemProperties.get() method";
            zzim.zzg(str, e);
            return "";
        } catch (java.lang.reflect.InvocationTargetException e27) {
            e = e27;
            zzim = zzge().zzim();
            str = "SystemProperties.get() threw an exception";
            zzim.zzg(str, e);
            return "";
        }
    }

    public final boolean zzhl() {
        return zzd(zzfv().zzah(), com.google.android.gms.internal.measurement.zzew.zzahp);
    }

    public final java.lang.String zzhm() {
        java.lang.String zzah = zzfv().zzah();
        com.google.android.gms.internal.measurement.zzex<java.lang.String> zzexVar = com.google.android.gms.internal.measurement.zzew.zzahq;
        return zzah == null ? zzexVar.get() : zzexVar.get(this.zzaet.zze(zzah, zzexVar.getKey()));
    }

    public final void zza(com.google.android.gms.internal.measurement.zzeh zzehVar) {
        this.zzaet = zzehVar;
    }
}

package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzif extends com.google.android.gms.internal.measurement.zzhh {
    protected com.google.android.gms.internal.measurement.zzie zzaol;
    private volatile com.google.android.gms.internal.measurement.zzie zzaom;
    private com.google.android.gms.internal.measurement.zzie zzaon;
    private long zzaoo;
    private final java.util.Map<android.app.Activity, com.google.android.gms.internal.measurement.zzie> zzaop;
    private com.google.android.gms.internal.measurement.zzie zzaoq;
    private java.lang.String zzaor;

    public zzif(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
        this.zzaop = new x.b();
    }

    private final void zza(android.app.Activity activity, com.google.android.gms.internal.measurement.zzie zzieVar, boolean z17) {
        com.google.android.gms.internal.measurement.zzie zzieVar2 = this.zzaom == null ? this.zzaon : this.zzaom;
        if (zzieVar.zzaoi == null) {
            zzieVar = new com.google.android.gms.internal.measurement.zzie(zzieVar.zzul, zzca(activity.getClass().getCanonicalName()), zzieVar.zzaoj);
        }
        this.zzaon = this.zzaom;
        this.zzaoo = zzbt().elapsedRealtime();
        this.zzaom = zzieVar;
        zzgd().zzc(new com.google.android.gms.internal.measurement.zzig(this, z17, zzieVar2, zzieVar));
    }

    private static java.lang.String zzca(java.lang.String str) {
        java.lang.String[] split = str.split("\\.");
        java.lang.String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final com.google.android.gms.internal.measurement.zzie zze(android.app.Activity activity) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity);
        com.google.android.gms.internal.measurement.zzie zzieVar = this.zzaop.get(activity);
        if (zzieVar != null) {
            return zzieVar;
        }
        com.google.android.gms.internal.measurement.zzie zzieVar2 = new com.google.android.gms.internal.measurement.zzie(null, zzca(activity.getClass().getCanonicalName()), zzgb().zzlb());
        this.zzaop.put(activity, zzieVar2);
        return zzieVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("com.google.firebase.analytics.screen_service")) == null) {
            return;
        }
        this.zzaop.put(activity, new com.google.android.gms.internal.measurement.zzie(bundle2.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME), bundle2.getString("referrer_name"), bundle2.getLong(dm.i4.COL_ID)));
    }

    public final void onActivityDestroyed(android.app.Activity activity) {
        this.zzaop.remove(activity);
    }

    public final void onActivityPaused(android.app.Activity activity) {
        com.google.android.gms.internal.measurement.zzie zze = zze(activity);
        this.zzaon = this.zzaom;
        this.zzaoo = zzbt().elapsedRealtime();
        this.zzaom = null;
        zzgd().zzc(new com.google.android.gms.internal.measurement.zzih(this, zze));
    }

    public final void onActivityResumed(android.app.Activity activity) {
        zza(activity, zze(activity), false);
        com.google.android.gms.internal.measurement.zzdu zzft = zzft();
        zzft.zzgd().zzc(new com.google.android.gms.internal.measurement.zzdx(zzft, zzft.zzbt().elapsedRealtime()));
    }

    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        com.google.android.gms.internal.measurement.zzie zzieVar;
        if (bundle == null || (zzieVar = this.zzaop.get(activity)) == null) {
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putLong(dm.i4.COL_ID, zzieVar.zzaoj);
        bundle2.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, zzieVar.zzul);
        bundle2.putString("referrer_name", zzieVar.zzaoi);
        bundle.putBundle("com.google.firebase.analytics.screen_service", bundle2);
    }

    public final void setCurrentScreen(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        zzgd();
        if (!com.google.android.gms.internal.measurement.zzgg.isMainThread()) {
            zzge().zzip().log("setCurrentScreen must be called from the main thread");
            return;
        }
        if (this.zzaom == null) {
            zzge().zzip().log("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.zzaop.get(activity) == null) {
            zzge().zzip().log("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzca(activity.getClass().getCanonicalName());
        }
        boolean equals = this.zzaom.zzaoi.equals(str2);
        boolean zzs = com.google.android.gms.internal.measurement.zzka.zzs(this.zzaom.zzul, str);
        if (equals && zzs) {
            zzge().zziq().log("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > 100)) {
            zzge().zzip().zzg("Invalid screen name length in setCurrentScreen. Length", java.lang.Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
            zzge().zzip().zzg("Invalid class name length in setCurrentScreen. Length", java.lang.Integer.valueOf(str2.length()));
            return;
        }
        zzge().zzit().zze("Setting current screen to name, class", str == null ? "null" : str, str2);
        com.google.android.gms.internal.measurement.zzie zzieVar = new com.google.android.gms.internal.measurement.zzie(str, str2, zzgb().zzlb());
        this.zzaop.put(activity, zzieVar);
        zza(activity, zzieVar, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzbt() {
        return super.zzbt();
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

    @Override // com.google.android.gms.internal.measurement.zzhh
    public final boolean zzhf() {
        return false;
    }

    public final com.google.android.gms.internal.measurement.zzie zzkc() {
        zzch();
        zzab();
        return this.zzaol;
    }

    public final com.google.android.gms.internal.measurement.zzie zzkd() {
        return this.zzaom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(com.google.android.gms.internal.measurement.zzie zzieVar) {
        zzft().zzk(zzbt().elapsedRealtime());
        if (zzgc().zzl(zzieVar.zzaok)) {
            zzieVar.zzaok = false;
        }
    }

    public static void zza(com.google.android.gms.internal.measurement.zzie zzieVar, android.os.Bundle bundle, boolean z17) {
        if (bundle != null && zzieVar != null && (!bundle.containsKey("_sc") || z17)) {
            java.lang.String str = zzieVar.zzul;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", zzieVar.zzaoi);
            bundle.putLong("_si", zzieVar.zzaoj);
            return;
        }
        if (bundle != null && zzieVar == null && z17) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void zza(java.lang.String str, com.google.android.gms.internal.measurement.zzie zzieVar) {
        zzab();
        synchronized (this) {
            java.lang.String str2 = this.zzaor;
            if (str2 == null || str2.equals(str) || zzieVar != null) {
                this.zzaor = str;
                this.zzaoq = zzieVar;
            }
        }
    }
}

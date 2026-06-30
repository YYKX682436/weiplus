package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzeo extends com.google.android.gms.internal.measurement.zzhh {
    private long zzafm;
    private java.lang.String zzafn;
    private java.lang.Boolean zzafo;

    public zzeo(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzbt() {
        return super.zzbt();
    }

    public final boolean zzf(android.content.Context context) {
        if (this.zzafo == null) {
            this.zzafo = java.lang.Boolean.FALSE;
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.zzafo = java.lang.Boolean.TRUE;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        return this.zzafo.booleanValue();
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
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.zzafm = java.util.concurrent.TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), java.util.concurrent.TimeUnit.MILLISECONDS);
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.String language = locale.getLanguage();
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.lang.String lowerCase = language.toLowerCase(locale2);
        java.lang.String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(lowerCase).length() + 1 + java.lang.String.valueOf(lowerCase2).length());
        sb6.append(lowerCase);
        sb6.append("-");
        sb6.append(lowerCase2);
        this.zzafn = sb6.toString();
        return false;
    }

    public final long zzic() {
        zzch();
        return this.zzafm;
    }

    public final java.lang.String zzid() {
        zzch();
        return this.zzafn;
    }
}

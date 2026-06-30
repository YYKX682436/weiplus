package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzdu extends com.google.android.gms.internal.measurement.zzhg {
    private final java.util.Map<java.lang.String, java.lang.Long> zzadf;
    private final java.util.Map<java.lang.String, java.lang.Integer> zzadg;
    private long zzadh;

    public zzdu(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
        this.zzadg = new x.b();
        this.zzadf = new x.b();
    }

    private final void zza(long j17, com.google.android.gms.internal.measurement.zzie zzieVar) {
        if (zzieVar == null) {
            zzge().zzit().log("Not logging ad exposure. No active activity");
            return;
        }
        if (j17 < 1000) {
            zzge().zzit().zzg("Not logging ad exposure. Less than 1000 ms. exposure", java.lang.Long.valueOf(j17));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("_xt", j17);
        com.google.android.gms.internal.measurement.zzif.zza(zzieVar, bundle, true);
        zzfu().logEvent("am", "_xa", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(long j17) {
        java.util.Iterator<java.lang.String> it = this.zzadf.keySet().iterator();
        while (it.hasNext()) {
            this.zzadf.put(it.next(), java.lang.Long.valueOf(j17));
        }
        if (this.zzadf.isEmpty()) {
            return;
        }
        this.zzadh = j17;
    }

    public final void beginAdUnitExposure(java.lang.String str) {
        if (str == null || str.length() == 0) {
            zzge().zzim().log("Ad unit id must be a non-empty string");
        } else {
            zzgd().zzc(new com.google.android.gms.internal.measurement.zzdv(this, str, zzbt().elapsedRealtime()));
        }
    }

    public final void endAdUnitExposure(java.lang.String str) {
        if (str == null || str.length() == 0) {
            zzge().zzim().log("Ad unit id must be a non-empty string");
        } else {
            zzgd().zzc(new com.google.android.gms.internal.measurement.zzdw(this, str, zzbt().elapsedRealtime()));
        }
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

    public final void zzk(long j17) {
        com.google.android.gms.internal.measurement.zzie zzkc = zzfy().zzkc();
        for (java.lang.String str : this.zzadf.keySet()) {
            zza(str, j17 - this.zzadf.get(str).longValue(), zzkc);
        }
        if (!this.zzadf.isEmpty()) {
            zza(j17 - this.zzadh, zzkc);
        }
        zzl(j17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(java.lang.String str, long j17) {
        zzab();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        java.lang.Integer num = this.zzadg.get(str);
        if (num == null) {
            zzge().zzim().zzg("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        com.google.android.gms.internal.measurement.zzie zzkc = zzfy().zzkc();
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            this.zzadg.put(str, java.lang.Integer.valueOf(intValue));
            return;
        }
        this.zzadg.remove(str);
        java.lang.Long l17 = this.zzadf.get(str);
        if (l17 == null) {
            zzge().zzim().log("First ad unit exposure time was never set");
        } else {
            long longValue = j17 - l17.longValue();
            this.zzadf.remove(str);
            zza(str, longValue, zzkc);
        }
        if (this.zzadg.isEmpty()) {
            long j18 = this.zzadh;
            if (j18 == 0) {
                zzge().zzim().log("First ad exposure time was never set");
            } else {
                zza(j17 - j18, zzkc);
                this.zzadh = 0L;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(java.lang.String str, long j17) {
        zzab();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        if (this.zzadg.isEmpty()) {
            this.zzadh = j17;
        }
        java.lang.Integer num = this.zzadg.get(str);
        if (num != null) {
            this.zzadg.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
        } else if (this.zzadg.size() >= 100) {
            zzge().zzip().log("Too many ads visible");
        } else {
            this.zzadg.put(str, 1);
            this.zzadf.put(str, java.lang.Long.valueOf(j17));
        }
    }

    private final void zza(java.lang.String str, long j17, com.google.android.gms.internal.measurement.zzie zzieVar) {
        if (zzieVar == null) {
            zzge().zzit().log("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j17 < 1000) {
            zzge().zzit().zzg("Not logging ad unit exposure. Less than 1000 ms. exposure", java.lang.Long.valueOf(j17));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j17);
        com.google.android.gms.internal.measurement.zzif.zza(zzieVar, bundle, true);
        zzfu().logEvent("am", "_xu", bundle);
    }
}

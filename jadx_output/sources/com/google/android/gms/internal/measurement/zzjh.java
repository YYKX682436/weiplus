package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzjh extends com.google.android.gms.internal.measurement.zzhh {
    private android.os.Handler handler;
    private long zzapu;
    private final com.google.android.gms.internal.measurement.zzem zzapv;
    private final com.google.android.gms.internal.measurement.zzem zzapw;

    public zzjh(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
        this.zzapv = new com.google.android.gms.internal.measurement.zzji(this, this.zzacw);
        this.zzapw = new com.google.android.gms.internal.measurement.zzjj(this, this.zzacw);
        this.zzapu = zzbt().elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf(long j17) {
        com.google.android.gms.internal.measurement.zzem zzemVar;
        long max;
        zzab();
        zzki();
        this.zzapv.cancel();
        this.zzapw.cancel();
        zzge().zzit().zzg("Activity resumed, time", java.lang.Long.valueOf(j17));
        this.zzapu = j17;
        if (zzbt().currentTimeMillis() - zzgf().zzakj.get() > zzgf().zzakl.get()) {
            zzgf().zzakk.set(true);
            zzgf().zzakm.set(0L);
        }
        if (zzgf().zzakk.get()) {
            zzemVar = this.zzapv;
            max = java.lang.Math.max(0L, zzgf().zzaki.get() - zzgf().zzakm.get());
        } else {
            zzemVar = this.zzapw;
            max = java.lang.Math.max(0L, 3600000 - zzgf().zzakm.get());
        }
        zzemVar.zzh(max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzag(long j17) {
        zzab();
        zzki();
        this.zzapv.cancel();
        this.zzapw.cancel();
        zzge().zzit().zzg("Activity paused, time", java.lang.Long.valueOf(j17));
        if (this.zzapu != 0) {
            zzgf().zzakm.set(zzgf().zzakm.get() + (j17 - this.zzapu));
        }
    }

    private final void zzki() {
        synchronized (this) {
            if (this.handler == null) {
                this.handler = new android.os.Handler(android.os.Looper.getMainLooper());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzkk() {
        zzab();
        zzl(false);
        zzft().zzk(zzbt().elapsedRealtime());
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

    @Override // com.google.android.gms.internal.measurement.zzhh
    public final boolean zzhf() {
        return false;
    }

    public final void zzkj() {
        this.zzapv.cancel();
        this.zzapw.cancel();
        this.zzapu = 0L;
    }

    public final boolean zzl(boolean z17) {
        zzab();
        zzch();
        long elapsedRealtime = zzbt().elapsedRealtime();
        zzgf().zzakl.set(zzbt().currentTimeMillis());
        long j17 = elapsedRealtime - this.zzapu;
        if (!z17 && j17 < 1000) {
            zzge().zzit().zzg("Screen exposed for less than 1000 ms. Event not sent. time", java.lang.Long.valueOf(j17));
            return false;
        }
        zzgf().zzakm.set(j17);
        zzge().zzit().zzg("Recording user engagement, ms", java.lang.Long.valueOf(j17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("_et", j17);
        com.google.android.gms.internal.measurement.zzif.zza(zzfy().zzkc(), bundle, true);
        zzfu().logEvent("auto", "_e", bundle);
        this.zzapu = elapsedRealtime;
        this.zzapw.cancel();
        this.zzapw.zzh(java.lang.Math.max(0L, 3600000 - zzgf().zzakm.get()));
        return true;
    }
}

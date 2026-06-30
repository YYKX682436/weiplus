package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzhq implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzanw;
    private final /* synthetic */ long zzaoa;

    public zzhq(com.google.android.gms.internal.measurement.zzhk zzhkVar, long j17) {
        this.zzanw = zzhkVar;
        this.zzaoa = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzhk zzhkVar = this.zzanw;
        long j17 = this.zzaoa;
        zzhkVar.zzab();
        zzhkVar.zzch();
        zzhkVar.zzge().zzis().log("Resetting analytics data (FE)");
        zzhkVar.zzgc().zzkj();
        if (zzhkVar.zzgg().zzba(zzhkVar.zzfv().zzah())) {
            zzhkVar.zzgf().zzajz.set(j17);
        }
        boolean isEnabled = zzhkVar.zzacw.isEnabled();
        if (!zzhkVar.zzgg().zzhg()) {
            zzhkVar.zzgf().zzh(!isEnabled);
        }
        zzhkVar.zzfx().resetAnalyticsData();
        zzhkVar.zzanu = !isEnabled;
    }
}

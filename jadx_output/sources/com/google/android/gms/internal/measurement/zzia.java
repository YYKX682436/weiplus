package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzia implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzanw;
    private final /* synthetic */ long zzaod;

    public zzia(com.google.android.gms.internal.measurement.zzhk zzhkVar, long j17) {
        this.zzanw = zzhkVar;
        this.zzaod = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzanw.zzgf().zzaki.set(this.zzaod);
        this.zzanw.zzge().zzis().zzg("Minimum session duration set", java.lang.Long.valueOf(this.zzaod));
    }
}

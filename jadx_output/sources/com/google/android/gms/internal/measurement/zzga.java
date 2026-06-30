package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzga implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzfz zzakz;

    public zzga(com.google.android.gms.internal.measurement.zzfz zzfzVar) {
        this.zzakz = zzfzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzakz.zzaky.zzc(this.zzakz.zzaky.zzjj());
    }
}

package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzjb implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zziw zzapn;

    public zzjb(com.google.android.gms.internal.measurement.zziw zziwVar) {
        this.zzapn = zziwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzii.zza(this.zzapn.zzape, (com.google.android.gms.internal.measurement.zzey) null);
        this.zzapn.zzape.zzkg();
    }
}

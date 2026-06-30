package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzja implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zziw zzapn;

    public zzja(com.google.android.gms.internal.measurement.zziw zziwVar) {
        this.zzapn = zziwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzapn.zzape.onServiceDisconnected(new android.content.ComponentName(this.zzapn.zzape.getContext(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}

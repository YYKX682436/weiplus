package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzhr implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzanw;
    private final /* synthetic */ com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty zzaob;

    public zzhr(com.google.android.gms.internal.measurement.zzhk zzhkVar, com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.zzanw = zzhkVar;
        this.zzaob = conditionalUserProperty;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzanw.zzb(this.zzaob);
    }
}

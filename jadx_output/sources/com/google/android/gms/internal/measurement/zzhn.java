package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzhn implements java.lang.Runnable {
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zzanv;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzanw;
    private final /* synthetic */ boolean zzanz;

    public zzhn(com.google.android.gms.internal.measurement.zzhk zzhkVar, java.util.concurrent.atomic.AtomicReference atomicReference, boolean z17) {
        this.zzanw = zzhkVar;
        this.zzanv = atomicReference;
        this.zzanz = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzanw.zzfx().zza(this.zzanv, this.zzanz);
    }
}

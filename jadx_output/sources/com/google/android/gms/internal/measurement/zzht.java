package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzht implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String zzanh;
    private final /* synthetic */ java.lang.String zzani;
    private final /* synthetic */ java.lang.String zzanj;
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zzanv;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzanw;

    public zzht(com.google.android.gms.internal.measurement.zzhk zzhkVar, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zzanw = zzhkVar;
        this.zzanv = atomicReference;
        this.zzanj = str;
        this.zzanh = str2;
        this.zzani = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzanw.zzacw.zzfx().zza(this.zzanv, this.zzanj, this.zzanh, this.zzani);
    }
}

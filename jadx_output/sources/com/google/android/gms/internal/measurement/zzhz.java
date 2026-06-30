package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzhz implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzanw;
    private final /* synthetic */ boolean zzaoc;

    public zzhz(com.google.android.gms.internal.measurement.zzhk zzhkVar, boolean z17) {
        this.zzanw = zzhkVar;
        this.zzaoc = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzanw.zzi(this.zzaoc);
    }
}

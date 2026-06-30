package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzxh extends com.google.android.gms.internal.measurement.zzxe {
    private final com.google.android.gms.internal.measurement.zzxf zzbod = new com.google.android.gms.internal.measurement.zzxf();

    @Override // com.google.android.gms.internal.measurement.zzxe
    public final void zza(java.lang.Throwable th6, java.io.PrintStream printStream) {
        th6.printStackTrace(printStream);
        java.util.List<java.lang.Throwable> zza = this.zzbod.zza(th6, false);
        if (zza == null) {
            return;
        }
        synchronized (zza) {
            for (java.lang.Throwable th7 : zza) {
                printStream.print("Suppressed: ");
                th7.printStackTrace(printStream);
            }
        }
    }
}

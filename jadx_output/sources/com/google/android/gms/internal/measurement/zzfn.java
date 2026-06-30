package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzfn implements java.lang.Runnable {
    private final java.lang.String packageName;
    private final int status;
    private final com.google.android.gms.internal.measurement.zzfm zzajh;
    private final java.lang.Throwable zzaji;
    private final byte[] zzajj;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> zzajk;

    private zzfn(java.lang.String str, com.google.android.gms.internal.measurement.zzfm zzfmVar, int i17, java.lang.Throwable th6, byte[] bArr, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfmVar);
        this.zzajh = zzfmVar;
        this.status = i17;
        this.zzaji = th6;
        this.zzajj = bArr;
        this.packageName = str;
        this.zzajk = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzajh.zza(this.packageName, this.status, this.zzaji, this.zzajj, this.zzajk);
    }
}

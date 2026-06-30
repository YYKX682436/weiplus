package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzgi implements java.lang.Thread.UncaughtExceptionHandler {
    private final java.lang.String zzaly;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzgg zzalz;

    public zzgi(com.google.android.gms.internal.measurement.zzgg zzggVar, java.lang.String str) {
        this.zzalz = zzggVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzaly = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        this.zzalz.zzge().zzim().zzg(this.zzaly, th6);
    }
}

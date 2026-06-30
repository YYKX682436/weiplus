package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzgj<V> extends java.util.concurrent.FutureTask<V> implements java.lang.Comparable<com.google.android.gms.internal.measurement.zzgj> {
    private final java.lang.String zzaly;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzgg zzalz;
    private final long zzama;
    final boolean zzamb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgj(com.google.android.gms.internal.measurement.zzgg zzggVar, java.lang.Runnable runnable, boolean z17, java.lang.String str) {
        super(runnable, null);
        java.util.concurrent.atomic.AtomicLong atomicLong;
        this.zzalz = zzggVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        atomicLong = com.google.android.gms.internal.measurement.zzgg.zzalx;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzama = andIncrement;
        this.zzaly = str;
        this.zzamb = false;
        if (andIncrement == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            zzggVar.zzge().zzim().log("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(com.google.android.gms.internal.measurement.zzgj zzgjVar) {
        com.google.android.gms.internal.measurement.zzgj zzgjVar2 = zzgjVar;
        boolean z17 = this.zzamb;
        if (z17 != zzgjVar2.zzamb) {
            return z17 ? -1 : 1;
        }
        long j17 = this.zzama;
        long j18 = zzgjVar2.zzama;
        if (j17 < j18) {
            return -1;
        }
        if (j17 > j18) {
            return 1;
        }
        this.zzalz.zzge().zzin().zzg("Two tasks share the same index. index", java.lang.Long.valueOf(this.zzama));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(java.lang.Throwable th6) {
        this.zzalz.zzge().zzim().zzg(this.zzaly, th6);
        if (th6 instanceof com.google.android.gms.internal.measurement.zzgh) {
            java.lang.Thread.getDefaultUncaughtExceptionHandler().uncaughtException(java.lang.Thread.currentThread(), th6);
        }
        super.setException(th6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgj(com.google.android.gms.internal.measurement.zzgg zzggVar, java.util.concurrent.Callable<V> callable, boolean z17, java.lang.String str) {
        super(callable);
        java.util.concurrent.atomic.AtomicLong atomicLong;
        this.zzalz = zzggVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        atomicLong = com.google.android.gms.internal.measurement.zzgg.zzalx;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzama = andIncrement;
        this.zzaly = str;
        this.zzamb = z17;
        if (andIncrement == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            zzggVar.zzge().zzim().log("Tasks index overflow");
        }
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzjm {
    private long startTime;
    private final com.google.android.gms.common.util.Clock zzro;

    public zzjm(com.google.android.gms.common.util.Clock clock) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(clock);
        this.zzro = clock;
    }

    public final void clear() {
        this.startTime = 0L;
    }

    public final void start() {
        this.startTime = this.zzro.elapsedRealtime();
    }

    public final boolean zzj(long j17) {
        return this.startTime == 0 || this.zzro.elapsedRealtime() - this.startTime >= 3600000;
    }
}

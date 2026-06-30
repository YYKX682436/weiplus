package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzgd implements java.lang.Runnable {
    private final /* synthetic */ android.content.Context val$context;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzgl zzalb;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzfg zzalc;
    private final /* synthetic */ long zzald;
    private final /* synthetic */ android.os.Bundle zzale;
    private final /* synthetic */ android.content.BroadcastReceiver.PendingResult zzqu;

    public zzgd(com.google.android.gms.internal.measurement.zzgb zzgbVar, com.google.android.gms.internal.measurement.zzgl zzglVar, long j17, android.os.Bundle bundle, android.content.Context context, com.google.android.gms.internal.measurement.zzfg zzfgVar, android.content.BroadcastReceiver.PendingResult pendingResult) {
        this.zzalb = zzglVar;
        this.zzald = j17;
        this.zzale = bundle;
        this.val$context = context;
        this.zzalc = zzfgVar;
        this.zzqu = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17 = this.zzalb.zzgf().zzajz.get();
        long j18 = this.zzald;
        if (j17 > 0 && (j18 >= j17 || j18 <= 0)) {
            j18 = j17 - 1;
        }
        if (j18 > 0) {
            this.zzale.putLong("click_timestamp", j18);
        }
        this.zzale.putString("_cis", "referrer broadcast");
        com.google.android.gms.measurement.AppMeasurement.getInstance(this.val$context).logEventInternal("auto", "_cmp", this.zzale);
        this.zzalc.zzit().log("Install campaign recorded");
        android.content.BroadcastReceiver.PendingResult pendingResult = this.zzqu;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}

package com.google.android.gms.measurement;

/* loaded from: classes13.dex */
public final class AppMeasurementReceiver extends androidx.legacy.content.WakefulBroadcastReceiver implements com.google.android.gms.internal.measurement.zzge {
    private com.google.android.gms.internal.measurement.zzgb zzadd;

    @Override // com.google.android.gms.internal.measurement.zzge
    public final android.content.BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.internal.measurement.zzge
    public final void doStartService(android.content.Context context, android.content.Intent intent) {
        androidx.legacy.content.WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (this.zzadd == null) {
            this.zzadd = new com.google.android.gms.internal.measurement.zzgb(this);
        }
        this.zzadd.onReceive(context, intent);
    }
}

package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzgb {
    private final com.google.android.gms.internal.measurement.zzge zzala;

    public zzgb(com.google.android.gms.internal.measurement.zzge zzgeVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgeVar);
        this.zzala = zzgeVar;
    }

    public static boolean zza(android.content.Context context) {
        android.content.pm.ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new android.content.ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.google.android.gms.internal.measurement.zzgl zzg = com.google.android.gms.internal.measurement.zzgl.zzg(context);
        com.google.android.gms.internal.measurement.zzfg zzge = zzg.zzge();
        if (intent == null) {
            zzge.zzip().log("Receiver called with null intent");
            return;
        }
        java.lang.String action = intent.getAction();
        zzge.zzit().zzg("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            android.content.Intent className = new android.content.Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzge.zzit().log("Starting wakeful intent.");
            this.zzala.doStartService(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                zzg.zzgd().zzc(new com.google.android.gms.internal.measurement.zzgc(this, zzg, zzge));
            } catch (java.lang.Exception e17) {
                zzge.zzip().zzg("Install Referrer Reporter encountered a problem", e17);
            }
            android.content.BroadcastReceiver.PendingResult doGoAsync = this.zzala.doGoAsync();
            java.lang.String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                zzge.zzit().log("Install referrer extras are null");
                if (doGoAsync != null) {
                    doGoAsync.finish();
                    return;
                }
                return;
            }
            zzge.zzir().zzg("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                stringExtra = stringExtra.length() != 0 ? "?".concat(stringExtra) : new java.lang.String("?");
            }
            android.os.Bundle zza = zzg.zzgb().zza(android.net.Uri.parse(stringExtra));
            if (zza == null) {
                zzge.zzit().log("No campaign defined in install referrer broadcast");
                if (doGoAsync != null) {
                    doGoAsync.finish();
                    return;
                }
                return;
            }
            long longExtra = 1000 * intent.getLongExtra("referrer_timestamp_seconds", 0L);
            if (longExtra == 0) {
                zzge.zzip().log("Install referrer is missing timestamp");
            }
            zzg.zzgd().zzc(new com.google.android.gms.internal.measurement.zzgd(this, zzg, longExtra, zza, context, zzge, doGoAsync));
        }
    }
}

package com.google.android.gms.gcm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzm implements com.google.android.gms.gcm.zzn {
    private final android.app.PendingIntent zzat;
    private final android.content.Context zzk;

    public zzm(android.content.Context context) {
        this.zzk = context;
        this.zzat = android.app.PendingIntent.getBroadcast(context, 0, new android.content.Intent().setPackage("com.google.example.invalidpackage"), 0);
    }

    private final android.content.Intent zzh(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("app", this.zzat);
        intent.putExtra(ya.b.SOURCE, 4);
        intent.putExtra("source_version", com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        intent.putExtra("scheduler_action", str);
        return intent;
    }

    @Override // com.google.android.gms.gcm.zzn
    public final boolean zzd(android.content.ComponentName componentName) {
        android.content.Intent zzh = zzh("CANCEL_ALL");
        zzh.putExtra("component", componentName);
        this.zzk.sendBroadcast(zzh);
        return true;
    }

    @Override // com.google.android.gms.gcm.zzn
    public final boolean zzd(android.content.ComponentName componentName, java.lang.String str) {
        android.content.Intent zzh = zzh("CANCEL_TASK");
        zzh.putExtra("component", componentName);
        zzh.putExtra("tag", str);
        this.zzk.sendBroadcast(zzh);
        return true;
    }

    @Override // com.google.android.gms.gcm.zzn
    public final boolean zzd(com.google.android.gms.gcm.Task task) {
        android.content.Intent zzh = zzh("SCHEDULE_TASK");
        android.os.Bundle bundle = new android.os.Bundle();
        task.toBundle(bundle);
        zzh.putExtras(bundle);
        this.zzk.sendBroadcast(zzh);
        return true;
    }
}

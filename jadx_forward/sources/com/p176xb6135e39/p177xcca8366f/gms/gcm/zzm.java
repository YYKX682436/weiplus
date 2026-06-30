package com.p176xb6135e39.p177xcca8366f.gms.gcm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzm implements com.p176xb6135e39.p177xcca8366f.gms.gcm.zzn {

    /* renamed from: zzat */
    private final android.app.PendingIntent f6093x394b73;
    private final android.content.Context zzk;

    public zzm(android.content.Context context) {
        this.zzk = context;
        this.f6093x394b73 = android.app.PendingIntent.getBroadcast(context, 0, new android.content.Intent().setPackage("com.google.example.invalidpackage"), 0);
    }

    private final android.content.Intent zzh(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("app", this.f6093x394b73);
        intent.putExtra(ya.b.f77502x92235c1b, 4);
        intent.putExtra("source_version", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.f5840x7aedca50);
        intent.putExtra("scheduler_action", str);
        return intent;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.zzn
    public final boolean zzd(android.content.ComponentName componentName) {
        android.content.Intent zzh = zzh("CANCEL_ALL");
        zzh.putExtra("component", componentName);
        this.zzk.sendBroadcast(zzh);
        return true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.zzn
    public final boolean zzd(android.content.ComponentName componentName, java.lang.String str) {
        android.content.Intent zzh = zzh("CANCEL_TASK");
        zzh.putExtra("component", componentName);
        zzh.putExtra("tag", str);
        this.zzk.sendBroadcast(zzh);
        return true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.zzn
    public final boolean zzd(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5 c2046x27a9a5) {
        android.content.Intent zzh = zzh("SCHEDULE_TASK");
        android.os.Bundle bundle = new android.os.Bundle();
        c2046x27a9a5.mo18721x792022dd(bundle);
        zzh.putExtras(bundle);
        this.zzk.sendBroadcast(zzh);
        return true;
    }
}

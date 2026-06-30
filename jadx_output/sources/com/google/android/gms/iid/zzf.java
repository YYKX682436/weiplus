package com.google.android.gms.iid;

/* loaded from: classes13.dex */
final class zzf implements java.lang.Runnable {
    private final /* synthetic */ android.content.Intent zzbb;
    private final /* synthetic */ android.content.Intent zzbc;
    private final /* synthetic */ com.google.android.gms.iid.zze zzbd;

    public zzf(com.google.android.gms.iid.zze zzeVar, android.content.Intent intent, android.content.Intent intent2) {
        this.zzbd = zzeVar;
        this.zzbb = intent;
        this.zzbc = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbd.handleIntent(this.zzbb);
        this.zzbd.zzf(this.zzbc);
    }
}

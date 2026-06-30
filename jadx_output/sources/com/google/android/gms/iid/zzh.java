package com.google.android.gms.iid;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzh implements java.lang.Runnable {
    private final /* synthetic */ android.content.Intent zzbb;
    private final /* synthetic */ com.google.android.gms.iid.zzg zzbh;

    public zzh(com.google.android.gms.iid.zzg zzgVar, android.content.Intent intent) {
        this.zzbh = zzgVar;
        this.zzbb = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new java.lang.StringBuilder(java.lang.String.valueOf(this.zzbb.getAction()).length() + 61);
        this.zzbh.finish();
    }
}

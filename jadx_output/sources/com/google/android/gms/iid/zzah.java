package com.google.android.gms.iid;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzah extends android.content.BroadcastReceiver {
    private final /* synthetic */ com.google.android.gms.iid.zzaf zzcx;

    public zzah(com.google.android.gms.iid.zzaf zzafVar) {
        this.zzcx = zzafVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.util.Log.isLoggable("InstanceID", 3);
        this.zzcx.zzh(intent);
    }
}

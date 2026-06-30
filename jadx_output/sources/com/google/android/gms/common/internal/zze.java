package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class zze implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zze(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i17) {
        this.zza = baseGmsClient;
        this.zzb = i17;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        java.lang.Object obj;
        com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zza;
        if (iBinder == null) {
            com.google.android.gms.common.internal.BaseGmsClient.zzk(baseGmsClient, 16);
            return;
        }
        obj = baseGmsClient.zzq;
        synchronized (obj) {
            com.google.android.gms.common.internal.BaseGmsClient baseGmsClient2 = this.zza;
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            baseGmsClient2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof com.google.android.gms.common.internal.IGmsServiceBroker)) ? new com.google.android.gms.common.internal.zzad(iBinder) : (com.google.android.gms.common.internal.IGmsServiceBroker) queryLocalInterface;
        }
        this.zza.zzl(0, null, this.zzb);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        java.lang.Object obj;
        obj = this.zza.zzq;
        synchronized (obj) {
            this.zza.zzr = null;
        }
        com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zza;
        int i17 = this.zzb;
        android.os.Handler handler = baseGmsClient.zzb;
        handler.sendMessage(handler.obtainMessage(6, i17, 1));
    }
}

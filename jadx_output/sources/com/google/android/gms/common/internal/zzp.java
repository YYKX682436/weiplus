package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
final class zzp implements android.content.ServiceConnection, com.google.android.gms.common.internal.zzt {
    final /* synthetic */ com.google.android.gms.common.internal.zzs zza;
    private final java.util.Map zzb = new java.util.HashMap();
    private int zzc = 2;
    private boolean zzd;
    private android.os.IBinder zze;
    private final com.google.android.gms.common.internal.zzo zzf;
    private android.content.ComponentName zzg;

    public zzp(com.google.android.gms.common.internal.zzs zzsVar, com.google.android.gms.common.internal.zzo zzoVar) {
        this.zza = zzsVar;
        this.zzf = zzoVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        java.util.HashMap hashMap;
        android.os.Handler handler;
        hashMap = this.zza.zzb;
        synchronized (hashMap) {
            handler = this.zza.zzd;
            handler.removeMessages(1, this.zzf);
            this.zze = iBinder;
            this.zzg = componentName;
            java.util.Iterator it = this.zzb.values().iterator();
            while (it.hasNext()) {
                ((android.content.ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.zzc = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.HashMap hashMap;
        android.os.Handler handler;
        hashMap = this.zza.zzb;
        synchronized (hashMap) {
            handler = this.zza.zzd;
            handler.removeMessages(1, this.zzf);
            this.zze = null;
            this.zzg = componentName;
            java.util.Iterator it = this.zzb.values().iterator();
            while (it.hasNext()) {
                ((android.content.ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.zzc = 2;
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final android.content.ComponentName zzb() {
        return this.zzg;
    }

    public final android.os.IBinder zzc() {
        return this.zze;
    }

    public final void zzd(android.content.ServiceConnection serviceConnection, android.content.ServiceConnection serviceConnection2, java.lang.String str) {
        this.zzb.put(serviceConnection, serviceConnection2);
    }

    public final void zze(java.lang.String str, java.util.concurrent.Executor executor) {
        com.google.android.gms.common.stats.ConnectionTracker connectionTracker;
        android.content.Context context;
        android.content.Context context2;
        com.google.android.gms.common.stats.ConnectionTracker connectionTracker2;
        android.content.Context context3;
        android.os.Handler handler;
        android.os.Handler handler2;
        long j17;
        this.zzc = 3;
        android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastS()) {
            android.os.StrictMode.setVmPolicy(new android.os.StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            com.google.android.gms.common.internal.zzs zzsVar = this.zza;
            connectionTracker = zzsVar.zzf;
            context = zzsVar.zzc;
            com.google.android.gms.common.internal.zzo zzoVar = this.zzf;
            context2 = zzsVar.zzc;
            boolean zza = connectionTracker.zza(context, str, zzoVar.zzb(context2), this, 4225, executor);
            this.zzd = zza;
            if (zza) {
                handler = this.zza.zzd;
                android.os.Message obtainMessage = handler.obtainMessage(1, this.zzf);
                handler2 = this.zza.zzd;
                j17 = this.zza.zzh;
                handler2.sendMessageDelayed(obtainMessage, j17);
            } else {
                this.zzc = 2;
                try {
                    com.google.android.gms.common.internal.zzs zzsVar2 = this.zza;
                    connectionTracker2 = zzsVar2.zzf;
                    context3 = zzsVar2.zzc;
                    connectionTracker2.unbindService(context3, this);
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
        } finally {
            android.os.StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void zzf(android.content.ServiceConnection serviceConnection, java.lang.String str) {
        this.zzb.remove(serviceConnection);
    }

    public final void zzg(java.lang.String str) {
        android.os.Handler handler;
        com.google.android.gms.common.stats.ConnectionTracker connectionTracker;
        android.content.Context context;
        com.google.android.gms.common.internal.zzo zzoVar = this.zzf;
        handler = this.zza.zzd;
        handler.removeMessages(1, zzoVar);
        com.google.android.gms.common.internal.zzs zzsVar = this.zza;
        connectionTracker = zzsVar.zzf;
        context = zzsVar.zzc;
        connectionTracker.unbindService(context, this);
        this.zzd = false;
        this.zzc = 2;
    }

    public final boolean zzh(android.content.ServiceConnection serviceConnection) {
        return this.zzb.containsKey(serviceConnection);
    }

    public final boolean zzi() {
        return this.zzb.isEmpty();
    }

    public final boolean zzj() {
        return this.zzd;
    }
}

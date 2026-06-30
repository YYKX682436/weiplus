package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
final class zzp implements android.content.ServiceConnection, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzt {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzs zza;
    private final java.util.Map zzb = new java.util.HashMap();
    private int zzc = 2;
    private boolean zzd;
    private android.os.IBinder zze;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo zzf;
    private android.content.ComponentName zzg;

    public zzp(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzs zzsVar, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo zzoVar) {
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
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a c1980x61745a5a;
        android.content.Context context;
        android.content.Context context2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a c1980x61745a5a2;
        android.content.Context context3;
        android.os.Handler handler;
        android.os.Handler handler2;
        long j17;
        this.zzc = 3;
        android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18610xacc9ec67()) {
            android.os.StrictMode.setVmPolicy(new android.os.StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzs zzsVar = this.zza;
            c1980x61745a5a = zzsVar.zzf;
            context = zzsVar.zzc;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo zzoVar = this.zzf;
            context2 = zzsVar.zzc;
            boolean zza = c1980x61745a5a.zza(context, str, zzoVar.zzb(context2), this, 4225, executor);
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
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzs zzsVar2 = this.zza;
                    c1980x61745a5a2 = zzsVar2.zzf;
                    context3 = zzsVar2.zzc;
                    c1980x61745a5a2.m18495xa4bc737f(context3, this);
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
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a c1980x61745a5a;
        android.content.Context context;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo zzoVar = this.zzf;
        handler = this.zza.zzd;
        handler.removeMessages(1, zzoVar);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzs zzsVar = this.zza;
        c1980x61745a5a = zzsVar.zzf;
        context = zzsVar.zzc;
        c1980x61745a5a.m18495xa4bc737f(context, this);
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

package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzs extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0 {
    private final java.util.HashMap zzb = new java.util.HashMap();
    private final android.content.Context zzc;
    private volatile android.os.Handler zzd;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzr zze;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a zzf;
    private final long zzg;
    private final long zzh;
    private volatile java.util.concurrent.Executor zzi;

    public zzs(android.content.Context context, android.os.Looper looper, java.util.concurrent.Executor executor) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzr zzrVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzr(this, null);
        this.zze = zzrVar;
        this.zzc = context.getApplicationContext();
        this.zzd = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzi(looper, zzrVar);
        this.zzf = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b();
        this.zzg = 5000L;
        this.zzh = 300000L;
        this.zzi = executor;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo zzoVar, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzp zzpVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzp) this.zzb.get(zzoVar);
            if (zzpVar == null) {
                throw new java.lang.IllegalStateException("Nonexistent connection status for service config: " + zzoVar.m18407x9616526c());
            }
            if (!zzpVar.zzh(serviceConnection)) {
                throw new java.lang.IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zzoVar.m18407x9616526c());
            }
            zzpVar.zzf(serviceConnection, str);
            if (zzpVar.zzi()) {
                this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zzoVar), this.zzg);
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0
    public final boolean zzc(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo zzoVar, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor) {
        boolean zzj;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzp zzpVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzp) this.zzb.get(zzoVar);
            if (executor == null) {
                executor = this.zzi;
            }
            if (zzpVar == null) {
                zzpVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzp(this, zzoVar);
                zzpVar.zzd(serviceConnection, serviceConnection, str);
                zzpVar.zze(str, executor);
                this.zzb.put(zzoVar, zzpVar);
            } else {
                this.zzd.removeMessages(0, zzoVar);
                if (zzpVar.zzh(serviceConnection)) {
                    throw new java.lang.IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zzoVar.m18407x9616526c());
                }
                zzpVar.zzd(serviceConnection, serviceConnection, str);
                int zza = zzpVar.zza();
                if (zza == 1) {
                    serviceConnection.onServiceConnected(zzpVar.zzb(), zzpVar.zzc());
                } else if (zza == 2) {
                    zzpVar.zze(str, executor);
                }
            }
            zzj = zzpVar.zzj();
        }
        return zzj;
    }

    public final void zzi(java.util.concurrent.Executor executor) {
        synchronized (this.zzb) {
            this.zzi = executor;
        }
    }

    public final void zzj(android.os.Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzi(looper, this.zze);
        }
    }
}

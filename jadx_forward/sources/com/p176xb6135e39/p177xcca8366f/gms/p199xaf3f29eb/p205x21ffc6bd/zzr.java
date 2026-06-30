package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzr implements android.os.Handler.Callback {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzs zza;

    public /* synthetic */ zzr(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzs zzsVar, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzq zzqVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.util.HashMap hashMap3;
        java.util.HashMap hashMap4;
        java.util.HashMap hashMap5;
        int i17 = message.what;
        if (i17 == 0) {
            hashMap = this.zza.zzb;
            synchronized (hashMap) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo zzoVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo) message.obj;
                hashMap2 = this.zza.zzb;
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzp zzpVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzp) hashMap2.get(zzoVar);
                if (zzpVar != null && zzpVar.zzi()) {
                    if (zzpVar.zzj()) {
                        zzpVar.zzg("GmsClientSupervisor");
                    }
                    hashMap3 = this.zza.zzb;
                    hashMap3.remove(zzoVar);
                }
            }
            return true;
        }
        if (i17 != 1) {
            return false;
        }
        hashMap4 = this.zza.zzb;
        synchronized (hashMap4) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo zzoVar2 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo) message.obj;
            hashMap5 = this.zza.zzb;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzp zzpVar2 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzp) hashMap5.get(zzoVar2);
            if (zzpVar2 != null && zzpVar2.zza() == 3) {
                java.lang.String.valueOf(zzoVar2);
                new java.lang.Exception();
                android.content.ComponentName zzb = zzpVar2.zzb();
                if (zzb == null) {
                    zzb = zzoVar2.zza();
                }
                if (zzb == null) {
                    java.lang.String zzc = zzoVar2.zzc();
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zzc);
                    zzb = new android.content.ComponentName(zzc, com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
                }
                zzpVar2.onServiceDisconnected(zzb);
            }
        }
        return true;
    }
}

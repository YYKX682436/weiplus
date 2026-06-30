package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzb extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzi {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687, android.os.Looper looper) {
        super(looper);
        this.zza = abstractC1900x418ca687;
    }

    private static final void zza(android.os.Message message) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzc zzcVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzc) message.obj;
        zzcVar.zzc();
        zzcVar.zzg();
    }

    private static final boolean zzb(android.os.Message message) {
        int i17 = message.what;
        return i17 == 2 || i17 == 1 || i17 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseConnectionCallbacks baseConnectionCallbacks;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseConnectionCallbacks baseConnectionCallbacks2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb2;
        boolean z17;
        if (this.zza.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        int i17 = message.what;
        if ((i17 == 1 || i17 == 7 || ((i17 == 4 && !this.zza.m18093x9177a6aa()) || message.what == 5)) && !this.zza.m18115x532f7b82()) {
            zza(message);
            return;
        }
        int i18 = message.what;
        if (i18 == 4) {
            this.zza.zzB = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(message.arg2);
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.zzo(this.zza)) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687 = this.zza;
                z17 = abstractC1900x418ca687.zzC;
                if (!z17) {
                    abstractC1900x418ca687.zzp(3, null);
                    return;
                }
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca6872 = this.zza;
            c1700xff0c58bb2 = abstractC1900x418ca6872.zzB;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb3 = c1700xff0c58bb2 != null ? abstractC1900x418ca6872.zzB : new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(8);
            this.zza.zzc.mo17961x7bf20ce3(c1700xff0c58bb3);
            this.zza.m18117xce9394ba(c1700xff0c58bb3);
            return;
        }
        if (i18 == 5) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca6873 = this.zza;
            c1700xff0c58bb = abstractC1900x418ca6873.zzB;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb4 = c1700xff0c58bb != null ? abstractC1900x418ca6873.zzB : new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(8);
            this.zza.zzc.mo17961x7bf20ce3(c1700xff0c58bb4);
            this.zza.m18117xce9394ba(c1700xff0c58bb4);
            return;
        }
        if (i18 == 3) {
            java.lang.Object obj = message.obj;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb5 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(message.arg2, obj instanceof android.app.PendingIntent ? (android.app.PendingIntent) obj : null);
            this.zza.zzc.mo17961x7bf20ce3(c1700xff0c58bb5);
            this.zza.m18117xce9394ba(c1700xff0c58bb5);
            return;
        }
        if (i18 == 6) {
            this.zza.zzp(5, null);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca6874 = this.zza;
            baseConnectionCallbacks = abstractC1900x418ca6874.zzw;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks2 = abstractC1900x418ca6874.zzw;
                baseConnectionCallbacks2.mo18127x4511603e(message.arg2);
            }
            this.zza.m18118x4511603e(message.arg2);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.zzn(this.zza, 5, 1, null);
            return;
        }
        if (i18 == 2 && !this.zza.m18114x23b734ff()) {
            zza(message);
            return;
        }
        if (zzb(message)) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzc) message.obj).zze();
            return;
        }
        android.util.Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new java.lang.Exception());
    }
}

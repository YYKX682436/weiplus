package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
public final class zzf extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zza {
    public final android.os.IBinder zze;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687, int i17, android.os.IBinder iBinder, android.os.Bundle bundle) {
        super(abstractC1900x418ca687, i17, bundle);
        this.zzf = abstractC1900x418ca687;
        this.zze = iBinder;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zza
    public final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        if (this.zzf.zzx != null) {
            this.zzf.zzx.mo18128xce9394ba(c1700xff0c58bb);
        }
        this.zzf.m18117xce9394ba(c1700xff0c58bb);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zza
    public final boolean zzd() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseConnectionCallbacks baseConnectionCallbacks;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseConnectionCallbacks baseConnectionCallbacks2;
        try {
            android.os.IBinder iBinder = this.zze;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(iBinder);
            if (!this.zzf.mo17561x83e1df4e().equals(iBinder.getInterfaceDescriptor())) {
                this.zzf.mo17561x83e1df4e();
                return false;
            }
            android.os.IInterface mo17559xa50fef20 = this.zzf.mo17559xa50fef20(this.zze);
            if (mo17559xa50fef20 == null) {
                return false;
            }
            if (!com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.zzn(this.zzf, 2, 4, mo17559xa50fef20) && !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.zzn(this.zzf, 3, 4, mo17559xa50fef20)) {
                return false;
            }
            this.zzf.zzB = null;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687 = this.zzf;
            android.os.Bundle m18098x3a47ff7b = abstractC1900x418ca687.m18098x3a47ff7b();
            baseConnectionCallbacks = abstractC1900x418ca687.zzw;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks2 = this.zzf.zzw;
                baseConnectionCallbacks2.mo18126xdba42fea(m18098x3a47ff7b);
            }
            return true;
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }
}

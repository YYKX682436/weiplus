package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
public final class zze implements android.content.ServiceConnection {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 zza;
    private final int zzb;

    public zze(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687, int i17) {
        this.zza = abstractC1900x418ca687;
        this.zzb = i17;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        java.lang.Object obj;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687 = this.zza;
        if (iBinder == null) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.zzk(abstractC1900x418ca687, 16);
            return;
        }
        obj = abstractC1900x418ca687.zzq;
        synchronized (obj) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca6872 = this.zza;
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            abstractC1900x418ca6872.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1917xe04b660a)) ? new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1950x394b63(iBinder) : (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1917xe04b660a) queryLocalInterface;
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
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687 = this.zza;
        int i17 = this.zzb;
        android.os.Handler handler = abstractC1900x418ca687.zzb;
        handler.sendMessage(handler.obtainMessage(6, i17, 1));
    }
}

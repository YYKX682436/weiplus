package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
public final class zzd extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractBinderC1949x394b62 {
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 zza;
    private final int zzb;

    public zzd(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687, int i17) {
        this.zza = abstractC1900x418ca687;
        this.zzb = i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1916x8139adea
    /* renamed from: onPostInitComplete */
    public final void mo18182x4f259b28(int i17, android.os.IBinder iBinder, android.os.Bundle bundle) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zza.mo18119x66ce737b(i17, iBinder, bundle, this.zzb);
        this.zza = null;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1916x8139adea
    public final void zzb(int i17, android.os.Bundle bundle) {
        android.util.Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new java.lang.Exception());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1916x8139adea
    public final void zzc(int i17, android.os.IBinder iBinder, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzk zzkVar) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687 = this.zza;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1900x418ca687, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zzkVar);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.zzj(abstractC1900x418ca687, zzkVar);
        mo18182x4f259b28(i17, iBinder, zzkVar.zza);
    }
}

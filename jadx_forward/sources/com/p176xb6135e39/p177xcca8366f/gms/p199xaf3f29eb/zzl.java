package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* loaded from: classes13.dex */
abstract class zzl extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj {
    private static final java.lang.ref.WeakReference zza = new java.lang.ref.WeakReference(null);
    private java.lang.ref.WeakReference zzb;

    public zzl(byte[] bArr) {
        super(bArr);
        this.zzb = zza;
    }

    public abstract byte[] zzb();

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj
    public final byte[] zzf() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.zzb.get();
            if (bArr == null) {
                bArr = zzb();
                this.zzb = new java.lang.ref.WeakReference(bArr);
            }
        }
        return bArr;
    }
}

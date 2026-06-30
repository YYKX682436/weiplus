package com.google.android.gms.common;

/* loaded from: classes13.dex */
abstract class zzl extends com.google.android.gms.common.zzj {
    private static final java.lang.ref.WeakReference zza = new java.lang.ref.WeakReference(null);
    private java.lang.ref.WeakReference zzb;

    public zzl(byte[] bArr) {
        super(bArr);
        this.zzb = zza;
    }

    public abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzj
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

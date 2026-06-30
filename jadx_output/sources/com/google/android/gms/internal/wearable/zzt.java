package com.google.android.gms.internal.wearable;

/* loaded from: classes16.dex */
public abstract class zzt {
    protected volatile int zzhl = -1;

    public static final <T extends com.google.android.gms.internal.wearable.zzt> T zza(T t17, byte[] bArr, int i17, int i18) {
        try {
            com.google.android.gms.internal.wearable.zzk zza = com.google.android.gms.internal.wearable.zzk.zza(bArr, 0, i18);
            t17.zza(zza);
            zza.zzc(0);
            return t17;
        } catch (com.google.android.gms.internal.wearable.zzs e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException("Reading from a byte array threw an IOException (should never happen).", e18);
        }
    }

    public static final byte[] zzb(com.google.android.gms.internal.wearable.zzt zztVar) {
        int zzx = zztVar.zzx();
        byte[] bArr = new byte[zzx];
        try {
            com.google.android.gms.internal.wearable.zzl zzb = com.google.android.gms.internal.wearable.zzl.zzb(bArr, 0, zzx);
            zztVar.zza(zzb);
            zzb.zzr();
            return bArr;
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e17);
        }
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.wearable.zzu.zzc(this);
    }

    public abstract com.google.android.gms.internal.wearable.zzt zza(com.google.android.gms.internal.wearable.zzk zzkVar);

    public int zzg() {
        return 0;
    }

    @Override // 
    /* renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.wearable.zzt clone() {
        return (com.google.android.gms.internal.wearable.zzt) super.clone();
    }

    public final int zzx() {
        int zzg = zzg();
        this.zzhl = zzg;
        return zzg;
    }

    public void zza(com.google.android.gms.internal.wearable.zzl zzlVar) {
    }
}

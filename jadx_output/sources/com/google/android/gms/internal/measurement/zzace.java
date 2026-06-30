package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public abstract class zzace {
    protected volatile int zzbxh = -1;

    private static final <T extends com.google.android.gms.internal.measurement.zzace> T zzb(T t17, byte[] bArr, int i17, int i18) {
        try {
            com.google.android.gms.internal.measurement.zzabv zza = com.google.android.gms.internal.measurement.zzabv.zza(bArr, 0, i18);
            t17.zzb(zza);
            zza.zzaj(0);
            return t17;
        } catch (com.google.android.gms.internal.measurement.zzacd e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException("Reading from a byte array threw an IOException (should never happen).", e18);
        }
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.measurement.zzacf.zzc(this);
    }

    public int zza() {
        return 0;
    }

    public abstract com.google.android.gms.internal.measurement.zzace zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar);

    @Override // 
    /* renamed from: zzvf, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.measurement.zzace clone() {
        return (com.google.android.gms.internal.measurement.zzace) super.clone();
    }

    public final int zzvl() {
        if (this.zzbxh < 0) {
            zzvm();
        }
        return this.zzbxh;
    }

    public final int zzvm() {
        int zza = zza();
        this.zzbxh = zza;
        return zza;
    }

    public static final <T extends com.google.android.gms.internal.measurement.zzace> T zza(T t17, byte[] bArr) {
        return (T) zzb(t17, bArr, 0, bArr.length);
    }

    public void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
    }

    public static final void zza(com.google.android.gms.internal.measurement.zzace zzaceVar, byte[] bArr, int i17, int i18) {
        try {
            com.google.android.gms.internal.measurement.zzabw zzb = com.google.android.gms.internal.measurement.zzabw.zzb(bArr, 0, i18);
            zzaceVar.zza(zzb);
            zzb.zzve();
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e17);
        }
    }
}

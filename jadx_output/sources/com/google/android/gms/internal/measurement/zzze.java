package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public abstract class zzze {
    private static volatile boolean zzbrg;
    int zzbrd;
    private int zzbre;
    private boolean zzbrf;

    private zzze() {
        this.zzbrd = 100;
        this.zzbre = Integer.MAX_VALUE;
        this.zzbrf = false;
    }

    public static com.google.android.gms.internal.measurement.zzze zza(byte[] bArr, int i17, int i18, boolean z17) {
        com.google.android.gms.internal.measurement.zzzg zzzgVar = new com.google.android.gms.internal.measurement.zzzg(bArr, i17, i18);
        try {
            zzzgVar.zzaf(i18);
            return zzzgVar;
        } catch (com.google.android.gms.internal.measurement.zzzt e17) {
            throw new java.lang.IllegalArgumentException(e17);
        }
    }

    public abstract int zzsz();
}

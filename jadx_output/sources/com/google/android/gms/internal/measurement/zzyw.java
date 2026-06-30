package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public abstract class zzyw implements java.io.Serializable, java.lang.Iterable<java.lang.Byte> {
    public static final com.google.android.gms.internal.measurement.zzyw zzbqx = new com.google.android.gms.internal.measurement.zzzc(com.google.android.gms.internal.measurement.zzzr.zzbsq);
    private static final com.google.android.gms.internal.measurement.zzza zzbqy;
    private int zzboc = 0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.google.android.gms.internal.measurement.zzyx zzyxVar = null;
        zzbqy = com.google.android.gms.internal.measurement.zzyv.zzsv() ? new com.google.android.gms.internal.measurement.zzzd(zzyxVar) : new com.google.android.gms.internal.measurement.zzyy(zzyxVar);
    }

    public static int zzb(int i17, int i18, int i19) {
        int i27 = i18 - i17;
        if ((i17 | i18 | i27 | (i19 - i18)) >= 0) {
            return i27;
        }
        if (i17 < 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
            sb6.append("Beginning index: ");
            sb6.append(i17);
            sb6.append(" < 0");
            throw new java.lang.IndexOutOfBoundsException(sb6.toString());
        }
        if (i18 < i17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(66);
            sb7.append("Beginning index larger than ending index: ");
            sb7.append(i17);
            sb7.append(", ");
            sb7.append(i18);
            throw new java.lang.IndexOutOfBoundsException(sb7.toString());
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(37);
        sb8.append("End index: ");
        sb8.append(i18);
        sb8.append(" >= ");
        sb8.append(i19);
        throw new java.lang.IndexOutOfBoundsException(sb8.toString());
    }

    public static com.google.android.gms.internal.measurement.zzyw zzfi(java.lang.String str) {
        return new com.google.android.gms.internal.measurement.zzzc(str.getBytes(com.google.android.gms.internal.measurement.zzzr.UTF_8));
    }

    public abstract boolean equals(java.lang.Object obj);

    public final int hashCode() {
        int i17 = this.zzboc;
        if (i17 == 0) {
            int size = size();
            i17 = zza(size, 0, size);
            if (i17 == 0) {
                i17 = 1;
            }
            this.zzboc = i17;
        }
        return i17;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return new com.google.android.gms.internal.measurement.zzyx(this);
    }

    public abstract int size();

    public final java.lang.String toString() {
        return java.lang.String.format("<ByteString@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
    }

    public abstract int zza(int i17, int i18, int i19);

    public abstract byte zzae(int i17);

    public abstract com.google.android.gms.internal.measurement.zzyw zzb(int i17, int i18);

    public final int zzsx() {
        return this.zzboc;
    }
}

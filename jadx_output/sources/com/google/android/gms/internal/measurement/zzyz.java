package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzyz extends com.google.android.gms.internal.measurement.zzzc {
    private final int zzbra;
    private final int zzbrb;

    public zzyz(byte[] bArr, int i17, int i18) {
        super(bArr);
        com.google.android.gms.internal.measurement.zzyw.zzb(i17, i17 + i18, bArr.length);
        this.zzbra = i17;
        this.zzbrb = i18;
    }

    @Override // com.google.android.gms.internal.measurement.zzzc, com.google.android.gms.internal.measurement.zzyw
    public final int size() {
        return this.zzbrb;
    }

    @Override // com.google.android.gms.internal.measurement.zzzc, com.google.android.gms.internal.measurement.zzyw
    public final byte zzae(int i17) {
        int size = size();
        if (((size - (i17 + 1)) | i17) >= 0) {
            return this.zzbrc[this.zzbra + i17];
        }
        if (i17 < 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(22);
            sb6.append("Index < 0: ");
            sb6.append(i17);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb6.toString());
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(40);
        sb7.append("Index > length: ");
        sb7.append(i17);
        sb7.append(", ");
        sb7.append(size);
        throw new java.lang.ArrayIndexOutOfBoundsException(sb7.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzzc
    public final int zzsy() {
        return this.zzbra;
    }
}

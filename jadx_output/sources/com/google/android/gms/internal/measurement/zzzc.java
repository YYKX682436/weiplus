package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class zzzc extends com.google.android.gms.internal.measurement.zzzb {
    protected final byte[] zzbrc;

    public zzzc(byte[] bArr) {
        this.zzbrc = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzyw
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzyw) || size() != ((com.google.android.gms.internal.measurement.zzyw) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzzc)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.measurement.zzzc zzzcVar = (com.google.android.gms.internal.measurement.zzzc) obj;
        int zzsx = zzsx();
        int zzsx2 = zzzcVar.zzsx();
        if (zzsx == 0 || zzsx2 == 0 || zzsx == zzsx2) {
            return zza(zzzcVar, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzyw
    public int size() {
        return this.zzbrc.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzyw
    public final int zza(int i17, int i18, int i19) {
        return com.google.android.gms.internal.measurement.zzzr.zza(i17, this.zzbrc, zzsy(), i19);
    }

    @Override // com.google.android.gms.internal.measurement.zzyw
    public byte zzae(int i17) {
        return this.zzbrc[i17];
    }

    @Override // com.google.android.gms.internal.measurement.zzyw
    public final com.google.android.gms.internal.measurement.zzyw zzb(int i17, int i18) {
        int zzb = com.google.android.gms.internal.measurement.zzyw.zzb(0, i18, size());
        return zzb == 0 ? com.google.android.gms.internal.measurement.zzyw.zzbqx : new com.google.android.gms.internal.measurement.zzyz(this.zzbrc, zzsy(), zzb);
    }

    public int zzsy() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzzb
    public final boolean zza(com.google.android.gms.internal.measurement.zzyw zzywVar, int i17, int i18) {
        if (i18 > zzywVar.size()) {
            int size = size();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(40);
            sb6.append("Length too large: ");
            sb6.append(i18);
            sb6.append(size);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
        if (i18 > zzywVar.size()) {
            int size2 = zzywVar.size();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(59);
            sb7.append("Ran off end of other: 0, ");
            sb7.append(i18);
            sb7.append(", ");
            sb7.append(size2);
            throw new java.lang.IllegalArgumentException(sb7.toString());
        }
        if (!(zzywVar instanceof com.google.android.gms.internal.measurement.zzzc)) {
            return zzywVar.zzb(0, i18).equals(zzb(0, i18));
        }
        com.google.android.gms.internal.measurement.zzzc zzzcVar = (com.google.android.gms.internal.measurement.zzzc) zzywVar;
        byte[] bArr = this.zzbrc;
        byte[] bArr2 = zzzcVar.zzbrc;
        int zzsy = zzsy() + i18;
        int zzsy2 = zzsy();
        int zzsy3 = zzzcVar.zzsy();
        while (zzsy2 < zzsy) {
            if (bArr[zzsy2] != bArr2[zzsy3]) {
                return false;
            }
            zzsy2++;
            zzsy3++;
        }
        return true;
    }
}

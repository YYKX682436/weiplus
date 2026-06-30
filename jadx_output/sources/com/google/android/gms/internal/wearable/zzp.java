package com.google.android.gms.internal.wearable;

/* loaded from: classes16.dex */
public final class zzp implements java.lang.Cloneable {
    private static final com.google.android.gms.internal.wearable.zzq zzhe = new com.google.android.gms.internal.wearable.zzq();
    private int mSize;
    private boolean zzhf;
    private int[] zzhg;
    private com.google.android.gms.internal.wearable.zzq[] zzhh;

    public zzp() {
        this(10);
    }

    private static int idealIntArraySize(int i17) {
        int i18 = i17 << 2;
        int i19 = 4;
        while (true) {
            if (i19 >= 32) {
                break;
            }
            int i27 = (1 << i19) - 12;
            if (i18 <= i27) {
                i18 = i27;
                break;
            }
            i19++;
        }
        return i18 / 4;
    }

    private final int zzq(int i17) {
        int i18 = this.mSize - 1;
        int i19 = 0;
        while (i19 <= i18) {
            int i27 = (i19 + i18) >>> 1;
            int i28 = this.zzhg[i27];
            if (i28 < i17) {
                i19 = i27 + 1;
            } else {
                if (i28 <= i17) {
                    return i27;
                }
                i18 = i27 - 1;
            }
        }
        return ~i19;
    }

    public final /* synthetic */ java.lang.Object clone() {
        int i17 = this.mSize;
        com.google.android.gms.internal.wearable.zzp zzpVar = new com.google.android.gms.internal.wearable.zzp(i17);
        java.lang.System.arraycopy(this.zzhg, 0, zzpVar.zzhg, 0, i17);
        for (int i18 = 0; i18 < i17; i18++) {
            com.google.android.gms.internal.wearable.zzq zzqVar = this.zzhh[i18];
            if (zzqVar != null) {
                zzpVar.zzhh[i18] = (com.google.android.gms.internal.wearable.zzq) zzqVar.clone();
            }
        }
        zzpVar.mSize = i17;
        return zzpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z17;
        boolean z18;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.wearable.zzp)) {
            return false;
        }
        com.google.android.gms.internal.wearable.zzp zzpVar = (com.google.android.gms.internal.wearable.zzp) obj;
        int i17 = this.mSize;
        if (i17 != zzpVar.mSize) {
            return false;
        }
        int[] iArr = this.zzhg;
        int[] iArr2 = zzpVar.zzhg;
        int i18 = 0;
        while (true) {
            if (i18 >= i17) {
                z17 = true;
                break;
            }
            if (iArr[i18] != iArr2[i18]) {
                z17 = false;
                break;
            }
            i18++;
        }
        if (z17) {
            com.google.android.gms.internal.wearable.zzq[] zzqVarArr = this.zzhh;
            com.google.android.gms.internal.wearable.zzq[] zzqVarArr2 = zzpVar.zzhh;
            int i19 = this.mSize;
            int i27 = 0;
            while (true) {
                if (i27 >= i19) {
                    z18 = true;
                    break;
                }
                if (!zzqVarArr[i27].equals(zzqVarArr2[i27])) {
                    z18 = false;
                    break;
                }
                i27++;
            }
            if (z18) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i17 = 17;
        for (int i18 = 0; i18 < this.mSize; i18++) {
            i17 = (((i17 * 31) + this.zzhg[i18]) * 31) + this.zzhh[i18].hashCode();
        }
        return i17;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    public final int size() {
        return this.mSize;
    }

    public final void zza(int i17, com.google.android.gms.internal.wearable.zzq zzqVar) {
        int zzq = zzq(i17);
        if (zzq >= 0) {
            this.zzhh[zzq] = zzqVar;
            return;
        }
        int i18 = ~zzq;
        int i19 = this.mSize;
        if (i18 < i19) {
            com.google.android.gms.internal.wearable.zzq[] zzqVarArr = this.zzhh;
            if (zzqVarArr[i18] == zzhe) {
                this.zzhg[i18] = i17;
                zzqVarArr[i18] = zzqVar;
                return;
            }
        }
        if (i19 >= this.zzhg.length) {
            int idealIntArraySize = idealIntArraySize(i19 + 1);
            int[] iArr = new int[idealIntArraySize];
            com.google.android.gms.internal.wearable.zzq[] zzqVarArr2 = new com.google.android.gms.internal.wearable.zzq[idealIntArraySize];
            int[] iArr2 = this.zzhg;
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            com.google.android.gms.internal.wearable.zzq[] zzqVarArr3 = this.zzhh;
            java.lang.System.arraycopy(zzqVarArr3, 0, zzqVarArr2, 0, zzqVarArr3.length);
            this.zzhg = iArr;
            this.zzhh = zzqVarArr2;
        }
        int i27 = this.mSize;
        if (i27 - i18 != 0) {
            int[] iArr3 = this.zzhg;
            int i28 = i18 + 1;
            java.lang.System.arraycopy(iArr3, i18, iArr3, i28, i27 - i18);
            com.google.android.gms.internal.wearable.zzq[] zzqVarArr4 = this.zzhh;
            java.lang.System.arraycopy(zzqVarArr4, i18, zzqVarArr4, i28, this.mSize - i18);
        }
        this.zzhg[i18] = i17;
        this.zzhh[i18] = zzqVar;
        this.mSize++;
    }

    public final com.google.android.gms.internal.wearable.zzq zzo(int i17) {
        com.google.android.gms.internal.wearable.zzq zzqVar;
        int zzq = zzq(i17);
        if (zzq < 0 || (zzqVar = this.zzhh[zzq]) == zzhe) {
            return null;
        }
        return zzqVar;
    }

    public final com.google.android.gms.internal.wearable.zzq zzp(int i17) {
        return this.zzhh[i17];
    }

    private zzp(int i17) {
        this.zzhf = false;
        int idealIntArraySize = idealIntArraySize(i17);
        this.zzhg = new int[idealIntArraySize];
        this.zzhh = new com.google.android.gms.internal.wearable.zzq[idealIntArraySize];
        this.mSize = 0;
    }
}

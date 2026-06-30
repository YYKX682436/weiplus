package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzaca implements java.lang.Cloneable {
    private static final com.google.android.gms.internal.measurement.zzacb zzbxa = new com.google.android.gms.internal.measurement.zzacb();
    private int mSize;
    private boolean zzbxb;
    private int[] zzbxc;
    private com.google.android.gms.internal.measurement.zzacb[] zzbxd;

    public zzaca() {
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

    private final int zzav(int i17) {
        int i18 = this.mSize - 1;
        int i19 = 0;
        while (i19 <= i18) {
            int i27 = (i19 + i18) >>> 1;
            int i28 = this.zzbxc[i27];
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
        com.google.android.gms.internal.measurement.zzaca zzacaVar = new com.google.android.gms.internal.measurement.zzaca(i17);
        java.lang.System.arraycopy(this.zzbxc, 0, zzacaVar.zzbxc, 0, i17);
        for (int i18 = 0; i18 < i17; i18++) {
            com.google.android.gms.internal.measurement.zzacb zzacbVar = this.zzbxd[i18];
            if (zzacbVar != null) {
                zzacaVar.zzbxd[i18] = (com.google.android.gms.internal.measurement.zzacb) zzacbVar.clone();
            }
        }
        zzacaVar.mSize = i17;
        return zzacaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z17;
        boolean z18;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzaca)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = (com.google.android.gms.internal.measurement.zzaca) obj;
        int i17 = this.mSize;
        if (i17 != zzacaVar.mSize) {
            return false;
        }
        int[] iArr = this.zzbxc;
        int[] iArr2 = zzacaVar.zzbxc;
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
            com.google.android.gms.internal.measurement.zzacb[] zzacbVarArr = this.zzbxd;
            com.google.android.gms.internal.measurement.zzacb[] zzacbVarArr2 = zzacaVar.zzbxd;
            int i19 = this.mSize;
            int i27 = 0;
            while (true) {
                if (i27 >= i19) {
                    z18 = true;
                    break;
                }
                if (!zzacbVarArr[i27].equals(zzacbVarArr2[i27])) {
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
            i17 = (((i17 * 31) + this.zzbxc[i18]) * 31) + this.zzbxd[i18].hashCode();
        }
        return i17;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    public final int size() {
        return this.mSize;
    }

    public final void zza(int i17, com.google.android.gms.internal.measurement.zzacb zzacbVar) {
        int zzav = zzav(i17);
        if (zzav >= 0) {
            this.zzbxd[zzav] = zzacbVar;
            return;
        }
        int i18 = ~zzav;
        int i19 = this.mSize;
        if (i18 < i19) {
            com.google.android.gms.internal.measurement.zzacb[] zzacbVarArr = this.zzbxd;
            if (zzacbVarArr[i18] == zzbxa) {
                this.zzbxc[i18] = i17;
                zzacbVarArr[i18] = zzacbVar;
                return;
            }
        }
        if (i19 >= this.zzbxc.length) {
            int idealIntArraySize = idealIntArraySize(i19 + 1);
            int[] iArr = new int[idealIntArraySize];
            com.google.android.gms.internal.measurement.zzacb[] zzacbVarArr2 = new com.google.android.gms.internal.measurement.zzacb[idealIntArraySize];
            int[] iArr2 = this.zzbxc;
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            com.google.android.gms.internal.measurement.zzacb[] zzacbVarArr3 = this.zzbxd;
            java.lang.System.arraycopy(zzacbVarArr3, 0, zzacbVarArr2, 0, zzacbVarArr3.length);
            this.zzbxc = iArr;
            this.zzbxd = zzacbVarArr2;
        }
        int i27 = this.mSize;
        if (i27 - i18 != 0) {
            int[] iArr3 = this.zzbxc;
            int i28 = i18 + 1;
            java.lang.System.arraycopy(iArr3, i18, iArr3, i28, i27 - i18);
            com.google.android.gms.internal.measurement.zzacb[] zzacbVarArr4 = this.zzbxd;
            java.lang.System.arraycopy(zzacbVarArr4, i18, zzacbVarArr4, i28, this.mSize - i18);
        }
        this.zzbxc[i18] = i17;
        this.zzbxd[i18] = zzacbVar;
        this.mSize++;
    }

    public final com.google.android.gms.internal.measurement.zzacb zzat(int i17) {
        com.google.android.gms.internal.measurement.zzacb zzacbVar;
        int zzav = zzav(i17);
        if (zzav < 0 || (zzacbVar = this.zzbxd[zzav]) == zzbxa) {
            return null;
        }
        return zzacbVar;
    }

    public final com.google.android.gms.internal.measurement.zzacb zzau(int i17) {
        return this.zzbxd[i17];
    }

    private zzaca(int i17) {
        this.zzbxb = false;
        int idealIntArraySize = idealIntArraySize(i17);
        this.zzbxc = new int[idealIntArraySize];
        this.zzbxd = new com.google.android.gms.internal.measurement.zzacb[idealIntArraySize];
        this.mSize = 0;
    }
}

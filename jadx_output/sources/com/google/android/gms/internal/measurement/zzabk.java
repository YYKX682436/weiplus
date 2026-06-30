package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public final class zzabk {
    private static final com.google.android.gms.internal.measurement.zzabk zzbuj = new com.google.android.gms.internal.measurement.zzabk(0, new int[0], new java.lang.Object[0], false);
    private int count;
    private int zzbrz;
    private int[] zzbuk;
    private java.lang.Object[] zzbul;
    private boolean zzbum;

    private zzabk() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    public static com.google.android.gms.internal.measurement.zzabk zzuq() {
        return zzbuj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof com.google.android.gms.internal.measurement.zzabk);
    }

    public final int hashCode() {
        return 506991;
    }

    private zzabk(int i17, int[] iArr, java.lang.Object[] objArr, boolean z17) {
        this.zzbrz = -1;
        this.count = 0;
        this.zzbuk = iArr;
        this.zzbul = objArr;
        this.zzbum = z17;
    }
}

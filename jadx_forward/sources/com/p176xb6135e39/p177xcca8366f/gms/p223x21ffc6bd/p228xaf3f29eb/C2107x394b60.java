package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb;

/* renamed from: com.google.android.gms.internal.common.zzaa */
/* loaded from: classes13.dex */
class C2107x394b60 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2108x394b61 {
    java.lang.Object[] zza = new java.lang.Object[4];
    int zzb = 0;
    boolean zzc;

    public C2107x394b60(int i17) {
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2107x394b60 zza(java.lang.Object obj) {
        obj.getClass();
        int i17 = this.zzb + 1;
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i17) {
            int i18 = length + (length >> 1) + 1;
            if (i18 < i17) {
                int highestOneBit = java.lang.Integer.highestOneBit(i17 - 1);
                i18 = highestOneBit + highestOneBit;
            }
            if (i18 < 0) {
                i18 = Integer.MAX_VALUE;
            }
            this.zza = java.util.Arrays.copyOf(objArr, i18);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (java.lang.Object[]) objArr.clone();
            this.zzc = false;
        }
        java.lang.Object[] objArr2 = this.zza;
        int i19 = this.zzb;
        this.zzb = i19 + 1;
        objArr2[i19] = obj;
        return this;
    }
}

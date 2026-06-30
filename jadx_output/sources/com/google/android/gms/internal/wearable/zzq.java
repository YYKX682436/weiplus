package com.google.android.gms.internal.wearable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzq implements java.lang.Cloneable {
    private java.lang.Object value;
    private com.google.android.gms.internal.wearable.zzo<?, ?> zzhi;
    private java.util.List<com.google.android.gms.internal.wearable.zzv> zzhj = new java.util.ArrayList();

    private final byte[] toByteArray() {
        byte[] bArr = new byte[zzg()];
        zza(com.google.android.gms.internal.wearable.zzl.zzb(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.wearable.zzq clone() {
        java.lang.Object clone;
        com.google.android.gms.internal.wearable.zzq zzqVar = new com.google.android.gms.internal.wearable.zzq();
        try {
            zzqVar.zzhi = this.zzhi;
            java.util.List<com.google.android.gms.internal.wearable.zzv> list = this.zzhj;
            if (list == null) {
                zzqVar.zzhj = null;
            } else {
                zzqVar.zzhj.addAll(list);
            }
            java.lang.Object obj = this.value;
            if (obj != null) {
                if (obj instanceof com.google.android.gms.internal.wearable.zzt) {
                    clone = (com.google.android.gms.internal.wearable.zzt) ((com.google.android.gms.internal.wearable.zzt) obj).clone();
                } else if (obj instanceof byte[]) {
                    clone = ((byte[]) obj).clone();
                } else {
                    int i17 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length];
                        zzqVar.value = bArr2;
                        while (i17 < bArr.length) {
                            bArr2[i17] = (byte[]) bArr[i17].clone();
                            i17++;
                        }
                    } else if (obj instanceof boolean[]) {
                        clone = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        clone = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        clone = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        clone = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        clone = ((double[]) obj).clone();
                    } else if (obj instanceof com.google.android.gms.internal.wearable.zzt[]) {
                        com.google.android.gms.internal.wearable.zzt[] zztVarArr = (com.google.android.gms.internal.wearable.zzt[]) obj;
                        com.google.android.gms.internal.wearable.zzt[] zztVarArr2 = new com.google.android.gms.internal.wearable.zzt[zztVarArr.length];
                        zzqVar.value = zztVarArr2;
                        while (i17 < zztVarArr.length) {
                            zztVarArr2[i17] = (com.google.android.gms.internal.wearable.zzt) zztVarArr[i17].clone();
                            i17++;
                        }
                    }
                }
                zzqVar.value = clone;
            }
            return zzqVar;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        java.util.List<com.google.android.gms.internal.wearable.zzv> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.wearable.zzq)) {
            return false;
        }
        com.google.android.gms.internal.wearable.zzq zzqVar = (com.google.android.gms.internal.wearable.zzq) obj;
        if (this.value == null || zzqVar.value == null) {
            java.util.List<com.google.android.gms.internal.wearable.zzv> list2 = this.zzhj;
            if (list2 != null && (list = zzqVar.zzhj) != null) {
                return list2.equals(list);
            }
            try {
                return java.util.Arrays.equals(toByteArray(), zzqVar.toByteArray());
            } catch (java.io.IOException e17) {
                throw new java.lang.IllegalStateException(e17);
            }
        }
        com.google.android.gms.internal.wearable.zzo<?, ?> zzoVar = this.zzhi;
        if (zzoVar != zzqVar.zzhi) {
            return false;
        }
        if (!zzoVar.zzhd.isArray()) {
            return this.value.equals(zzqVar.value);
        }
        java.lang.Object obj2 = this.value;
        return obj2 instanceof byte[] ? java.util.Arrays.equals((byte[]) obj2, (byte[]) zzqVar.value) : obj2 instanceof int[] ? java.util.Arrays.equals((int[]) obj2, (int[]) zzqVar.value) : obj2 instanceof long[] ? java.util.Arrays.equals((long[]) obj2, (long[]) zzqVar.value) : obj2 instanceof float[] ? java.util.Arrays.equals((float[]) obj2, (float[]) zzqVar.value) : obj2 instanceof double[] ? java.util.Arrays.equals((double[]) obj2, (double[]) zzqVar.value) : obj2 instanceof boolean[] ? java.util.Arrays.equals((boolean[]) obj2, (boolean[]) zzqVar.value) : java.util.Arrays.deepEquals((java.lang.Object[]) obj2, (java.lang.Object[]) zzqVar.value);
    }

    public final int hashCode() {
        try {
            return java.util.Arrays.hashCode(toByteArray()) + com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX;
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }

    public final void zza(com.google.android.gms.internal.wearable.zzl zzlVar) {
        if (this.value != null) {
            throw new java.lang.NoSuchMethodError();
        }
        for (com.google.android.gms.internal.wearable.zzv zzvVar : this.zzhj) {
            zzlVar.zzl(zzvVar.tag);
            zzlVar.zzc(zzvVar.zzhm);
        }
    }

    public final int zzg() {
        if (this.value != null) {
            throw new java.lang.NoSuchMethodError();
        }
        int i17 = 0;
        for (com.google.android.gms.internal.wearable.zzv zzvVar : this.zzhj) {
            i17 += com.google.android.gms.internal.wearable.zzl.zzm(zzvVar.tag) + 0 + zzvVar.zzhm.length;
        }
        return i17;
    }

    public final void zza(com.google.android.gms.internal.wearable.zzv zzvVar) {
        java.util.List<com.google.android.gms.internal.wearable.zzv> list = this.zzhj;
        if (list != null) {
            list.add(zzvVar);
            return;
        }
        java.lang.Object obj = this.value;
        if (!(obj instanceof com.google.android.gms.internal.wearable.zzt)) {
            boolean z17 = obj instanceof com.google.android.gms.internal.wearable.zzt[];
            java.util.Collections.singletonList(zzvVar);
            if (!z17) {
                throw new java.lang.NoSuchMethodError();
            }
            throw new java.lang.NoSuchMethodError();
        }
        byte[] bArr = zzvVar.zzhm;
        com.google.android.gms.internal.wearable.zzk zza = com.google.android.gms.internal.wearable.zzk.zza(bArr, 0, bArr.length);
        int zzk = zza.zzk();
        if (zzk != bArr.length - com.google.android.gms.internal.wearable.zzl.zzi(zzk)) {
            throw com.google.android.gms.internal.wearable.zzs.zzu();
        }
        com.google.android.gms.internal.wearable.zzt zza2 = ((com.google.android.gms.internal.wearable.zzt) this.value).zza(zza);
        this.zzhi = this.zzhi;
        this.value = zza2;
        this.zzhj = null;
    }
}

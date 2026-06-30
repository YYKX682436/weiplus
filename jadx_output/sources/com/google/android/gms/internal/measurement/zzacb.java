package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzacb implements java.lang.Cloneable {
    private java.lang.Object value;
    private com.google.android.gms.internal.measurement.zzabz<?, ?> zzbxe;
    private java.util.List<com.google.android.gms.internal.measurement.zzacg> zzbxf = new java.util.ArrayList();

    private final byte[] toByteArray() {
        byte[] bArr = new byte[zza()];
        zza(com.google.android.gms.internal.measurement.zzabw.zzj(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzvg, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzacb clone() {
        java.lang.Object clone;
        com.google.android.gms.internal.measurement.zzacb zzacbVar = new com.google.android.gms.internal.measurement.zzacb();
        try {
            zzacbVar.zzbxe = this.zzbxe;
            java.util.List<com.google.android.gms.internal.measurement.zzacg> list = this.zzbxf;
            if (list == null) {
                zzacbVar.zzbxf = null;
            } else {
                zzacbVar.zzbxf.addAll(list);
            }
            java.lang.Object obj = this.value;
            if (obj != null) {
                if (obj instanceof com.google.android.gms.internal.measurement.zzace) {
                    clone = (com.google.android.gms.internal.measurement.zzace) ((com.google.android.gms.internal.measurement.zzace) obj).clone();
                } else if (obj instanceof byte[]) {
                    clone = ((byte[]) obj).clone();
                } else {
                    int i17 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length];
                        zzacbVar.value = bArr2;
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
                    } else if (obj instanceof com.google.android.gms.internal.measurement.zzace[]) {
                        com.google.android.gms.internal.measurement.zzace[] zzaceVarArr = (com.google.android.gms.internal.measurement.zzace[]) obj;
                        com.google.android.gms.internal.measurement.zzace[] zzaceVarArr2 = new com.google.android.gms.internal.measurement.zzace[zzaceVarArr.length];
                        zzacbVar.value = zzaceVarArr2;
                        while (i17 < zzaceVarArr.length) {
                            zzaceVarArr2[i17] = (com.google.android.gms.internal.measurement.zzace) zzaceVarArr[i17].clone();
                            i17++;
                        }
                    }
                }
                zzacbVar.value = clone;
            }
            return zzacbVar;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        java.util.List<com.google.android.gms.internal.measurement.zzacg> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzacb)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzacb zzacbVar = (com.google.android.gms.internal.measurement.zzacb) obj;
        if (this.value == null || zzacbVar.value == null) {
            java.util.List<com.google.android.gms.internal.measurement.zzacg> list2 = this.zzbxf;
            if (list2 != null && (list = zzacbVar.zzbxf) != null) {
                return list2.equals(list);
            }
            try {
                return java.util.Arrays.equals(toByteArray(), zzacbVar.toByteArray());
            } catch (java.io.IOException e17) {
                throw new java.lang.IllegalStateException(e17);
            }
        }
        com.google.android.gms.internal.measurement.zzabz<?, ?> zzabzVar = this.zzbxe;
        if (zzabzVar != zzacbVar.zzbxe) {
            return false;
        }
        if (!zzabzVar.zzbwx.isArray()) {
            return this.value.equals(zzacbVar.value);
        }
        java.lang.Object obj2 = this.value;
        return obj2 instanceof byte[] ? java.util.Arrays.equals((byte[]) obj2, (byte[]) zzacbVar.value) : obj2 instanceof int[] ? java.util.Arrays.equals((int[]) obj2, (int[]) zzacbVar.value) : obj2 instanceof long[] ? java.util.Arrays.equals((long[]) obj2, (long[]) zzacbVar.value) : obj2 instanceof float[] ? java.util.Arrays.equals((float[]) obj2, (float[]) zzacbVar.value) : obj2 instanceof double[] ? java.util.Arrays.equals((double[]) obj2, (double[]) zzacbVar.value) : obj2 instanceof boolean[] ? java.util.Arrays.equals((boolean[]) obj2, (boolean[]) zzacbVar.value) : java.util.Arrays.deepEquals((java.lang.Object[]) obj2, (java.lang.Object[]) zzacbVar.value);
    }

    public final int hashCode() {
        try {
            return java.util.Arrays.hashCode(toByteArray()) + com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX;
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }

    public final int zza() {
        java.lang.Object obj = this.value;
        if (obj == null) {
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.zzacg zzacgVar : this.zzbxf) {
                i17 += com.google.android.gms.internal.measurement.zzabw.zzas(zzacgVar.tag) + 0 + zzacgVar.zzbrc.length;
            }
            return i17;
        }
        com.google.android.gms.internal.measurement.zzabz<?, ?> zzabzVar = this.zzbxe;
        if (!zzabzVar.zzbwy) {
            return zzabzVar.zzv(obj);
        }
        int length = java.lang.reflect.Array.getLength(obj);
        int i18 = 0;
        for (int i19 = 0; i19 < length; i19++) {
            if (java.lang.reflect.Array.get(obj, i19) != null) {
                i18 += zzabzVar.zzv(java.lang.reflect.Array.get(obj, i19));
            }
        }
        return i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T zzb(com.google.android.gms.internal.measurement.zzabz<?, T> zzabzVar) {
        if (this.value == null) {
            this.zzbxe = zzabzVar;
            this.value = zzabzVar.zzi(this.zzbxf);
            this.zzbxf = null;
        } else if (!this.zzbxe.equals(zzabzVar)) {
            throw new java.lang.IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return (T) this.value;
    }

    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        java.lang.Object obj = this.value;
        if (obj == null) {
            for (com.google.android.gms.internal.measurement.zzacg zzacgVar : this.zzbxf) {
                zzabwVar.zzar(zzacgVar.tag);
                zzabwVar.zzk(zzacgVar.zzbrc);
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzabz<?, ?> zzabzVar = this.zzbxe;
        if (!zzabzVar.zzbwy) {
            zzabzVar.zza(obj, zzabwVar);
            return;
        }
        int length = java.lang.reflect.Array.getLength(obj);
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj2 = java.lang.reflect.Array.get(obj, i17);
            if (obj2 != null) {
                zzabzVar.zza(obj2, zzabwVar);
            }
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzacg zzacgVar) {
        java.lang.Object zzi;
        java.util.List<com.google.android.gms.internal.measurement.zzacg> list = this.zzbxf;
        if (list != null) {
            list.add(zzacgVar);
            return;
        }
        java.lang.Object obj = this.value;
        if (obj instanceof com.google.android.gms.internal.measurement.zzace) {
            byte[] bArr = zzacgVar.zzbrc;
            com.google.android.gms.internal.measurement.zzabv zza = com.google.android.gms.internal.measurement.zzabv.zza(bArr, 0, bArr.length);
            int zzuy = zza.zzuy();
            if (zzuy != bArr.length - com.google.android.gms.internal.measurement.zzabw.zzao(zzuy)) {
                throw com.google.android.gms.internal.measurement.zzacd.zzvh();
            }
            zzi = ((com.google.android.gms.internal.measurement.zzace) this.value).zzb(zza);
        } else if (obj instanceof com.google.android.gms.internal.measurement.zzace[]) {
            com.google.android.gms.internal.measurement.zzace[] zzaceVarArr = (com.google.android.gms.internal.measurement.zzace[]) this.zzbxe.zzi(java.util.Collections.singletonList(zzacgVar));
            com.google.android.gms.internal.measurement.zzace[] zzaceVarArr2 = (com.google.android.gms.internal.measurement.zzace[]) this.value;
            com.google.android.gms.internal.measurement.zzace[] zzaceVarArr3 = (com.google.android.gms.internal.measurement.zzace[]) java.util.Arrays.copyOf(zzaceVarArr2, zzaceVarArr2.length + zzaceVarArr.length);
            java.lang.System.arraycopy(zzaceVarArr, 0, zzaceVarArr3, zzaceVarArr2.length, zzaceVarArr.length);
            zzi = zzaceVarArr3;
        } else {
            zzi = this.zzbxe.zzi(java.util.Collections.singletonList(zzacgVar));
        }
        this.zzbxe = this.zzbxe;
        this.value = zzi;
        this.zzbxf = null;
    }
}

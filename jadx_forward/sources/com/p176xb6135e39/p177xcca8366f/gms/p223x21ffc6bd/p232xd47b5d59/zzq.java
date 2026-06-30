package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzq implements java.lang.Cloneable {

    /* renamed from: value */
    private java.lang.Object f7315x6ac9171;

    /* renamed from: zzhi */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzo<?, ?> f7316x394c41;

    /* renamed from: zzhj */
    private java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzv> f7317x394c42 = new java.util.ArrayList();

    /* renamed from: toByteArray */
    private final byte[] m19449x5f01b1f6() {
        byte[] bArr = new byte[zzg()];
        zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl.zzb(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq m19450x5a5dd5d() {
        java.lang.Object clone;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq zzqVar = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq();
        try {
            zzqVar.f7316x394c41 = this.f7316x394c41;
            java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzv> list = this.f7317x394c42;
            if (list == null) {
                zzqVar.f7317x394c42 = null;
            } else {
                zzqVar.f7317x394c42.addAll(list);
            }
            java.lang.Object obj = this.f7315x6ac9171;
            if (obj != null) {
                if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt) {
                    clone = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt) ((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt) obj).mo19439x5a5dd5d();
                } else if (obj instanceof byte[]) {
                    clone = ((byte[]) obj).clone();
                } else {
                    int i17 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length];
                        zzqVar.f7315x6ac9171 = bArr2;
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
                    } else if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt[]) {
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt[] zztVarArr = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt[]) obj;
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt[] zztVarArr2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt[zztVarArr.length];
                        zzqVar.f7315x6ac9171 = zztVarArr2;
                        while (i17 < zztVarArr.length) {
                            zztVarArr2[i17] = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt) zztVarArr[i17].mo19439x5a5dd5d();
                            i17++;
                        }
                    }
                }
                zzqVar.f7315x6ac9171 = clone;
            }
            return zzqVar;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    /* renamed from: equals */
    public final boolean m19451xb2c87fbf(java.lang.Object obj) {
        java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzv> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq zzqVar = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq) obj;
        if (this.f7315x6ac9171 == null || zzqVar.f7315x6ac9171 == null) {
            java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzv> list2 = this.f7317x394c42;
            if (list2 != null && (list = zzqVar.f7317x394c42) != null) {
                return list2.equals(list);
            }
            try {
                return java.util.Arrays.equals(m19449x5f01b1f6(), zzqVar.m19449x5f01b1f6());
            } catch (java.io.IOException e17) {
                throw new java.lang.IllegalStateException(e17);
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzo<?, ?> zzoVar = this.f7316x394c41;
        if (zzoVar != zzqVar.f7316x394c41) {
            return false;
        }
        if (!zzoVar.f7309x394c3c.isArray()) {
            return this.f7315x6ac9171.equals(zzqVar.f7315x6ac9171);
        }
        java.lang.Object obj2 = this.f7315x6ac9171;
        return obj2 instanceof byte[] ? java.util.Arrays.equals((byte[]) obj2, (byte[]) zzqVar.f7315x6ac9171) : obj2 instanceof int[] ? java.util.Arrays.equals((int[]) obj2, (int[]) zzqVar.f7315x6ac9171) : obj2 instanceof long[] ? java.util.Arrays.equals((long[]) obj2, (long[]) zzqVar.f7315x6ac9171) : obj2 instanceof float[] ? java.util.Arrays.equals((float[]) obj2, (float[]) zzqVar.f7315x6ac9171) : obj2 instanceof double[] ? java.util.Arrays.equals((double[]) obj2, (double[]) zzqVar.f7315x6ac9171) : obj2 instanceof boolean[] ? java.util.Arrays.equals((boolean[]) obj2, (boolean[]) zzqVar.f7315x6ac9171) : java.util.Arrays.deepEquals((java.lang.Object[]) obj2, (java.lang.Object[]) zzqVar.f7315x6ac9171);
    }

    /* renamed from: hashCode */
    public final int m19452x8cdac1b() {
        try {
            return java.util.Arrays.hashCode(m19449x5f01b1f6()) + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de;
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl zzlVar) {
        if (this.f7315x6ac9171 != null) {
            throw new java.lang.NoSuchMethodError();
        }
        for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzv zzvVar : this.f7317x394c42) {
            zzlVar.zzl(zzvVar.tag);
            zzlVar.zzc(zzvVar.f7322x394c45);
        }
    }

    public final int zzg() {
        if (this.f7315x6ac9171 != null) {
            throw new java.lang.NoSuchMethodError();
        }
        int i17 = 0;
        for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzv zzvVar : this.f7317x394c42) {
            i17 += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl.zzm(zzvVar.tag) + 0 + zzvVar.f7322x394c45.length;
        }
        return i17;
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzv zzvVar) {
        java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzv> list = this.f7317x394c42;
        if (list != null) {
            list.add(zzvVar);
            return;
        }
        java.lang.Object obj = this.f7315x6ac9171;
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt)) {
            boolean z17 = obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt[];
            java.util.Collections.singletonList(zzvVar);
            if (!z17) {
                throw new java.lang.NoSuchMethodError();
            }
            throw new java.lang.NoSuchMethodError();
        }
        byte[] bArr = zzvVar.f7322x394c45;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzk zza = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzk.zza(bArr, 0, bArr.length);
        int zzk = zza.zzk();
        if (zzk != bArr.length - com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl.zzi(zzk)) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs.zzu();
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt zza2 = ((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt) this.f7315x6ac9171).zza(zza);
        this.f7316x394c41 = this.f7316x394c41;
        this.f7315x6ac9171 = zza2;
        this.f7317x394c42 = null;
    }
}

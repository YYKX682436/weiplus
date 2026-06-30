package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzacb */
/* loaded from: classes16.dex */
public final class C2171x6f02140 implements java.lang.Cloneable {

    /* renamed from: value */
    private java.lang.Object f6395x6ac9171;

    /* renamed from: zzbxe */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2169x6f02139<?, ?> f6396x6f0278f;

    /* renamed from: zzbxf */
    private java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145> f6397x6f02790 = new java.util.ArrayList();

    /* renamed from: toByteArray */
    private final byte[] m18935x5f01b1f6() {
        byte[] bArr = new byte[zza()];
        zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzj(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzvg, reason: merged with bridge method [inline-methods] */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140 m18937x5a5dd5d() {
        java.lang.Object clone;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140 c2171x6f02140 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140();
        try {
            c2171x6f02140.f6396x6f0278f = this.f6396x6f0278f;
            java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145> list = this.f6397x6f02790;
            if (list == null) {
                c2171x6f02140.f6397x6f02790 = null;
            } else {
                c2171x6f02140.f6397x6f02790.addAll(list);
            }
            java.lang.Object obj = this.f6395x6ac9171;
            if (obj != null) {
                if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143) {
                    clone = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143) ((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143) obj).mo18921x5a5dd5d();
                } else if (obj instanceof byte[]) {
                    clone = ((byte[]) obj).clone();
                } else {
                    int i17 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length];
                        c2171x6f02140.f6395x6ac9171 = bArr2;
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
                    } else if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143[]) {
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143[] abstractC2174x6f02143Arr = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143[]) obj;
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143[] abstractC2174x6f02143Arr2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143[abstractC2174x6f02143Arr.length];
                        c2171x6f02140.f6395x6ac9171 = abstractC2174x6f02143Arr2;
                        while (i17 < abstractC2174x6f02143Arr.length) {
                            abstractC2174x6f02143Arr2[i17] = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143) abstractC2174x6f02143Arr[i17].mo18921x5a5dd5d();
                            i17++;
                        }
                    }
                }
                c2171x6f02140.f6395x6ac9171 = clone;
            }
            return c2171x6f02140;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    /* renamed from: equals */
    public final boolean m18938xb2c87fbf(java.lang.Object obj) {
        java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140 c2171x6f02140 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140) obj;
        if (this.f6395x6ac9171 == null || c2171x6f02140.f6395x6ac9171 == null) {
            java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145> list2 = this.f6397x6f02790;
            if (list2 != null && (list = c2171x6f02140.f6397x6f02790) != null) {
                return list2.equals(list);
            }
            try {
                return java.util.Arrays.equals(m18935x5f01b1f6(), c2171x6f02140.m18935x5f01b1f6());
            } catch (java.io.IOException e17) {
                throw new java.lang.IllegalStateException(e17);
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2169x6f02139<?, ?> c2169x6f02139 = this.f6396x6f0278f;
        if (c2169x6f02139 != c2171x6f02140.f6396x6f0278f) {
            return false;
        }
        if (!c2169x6f02139.f6387x6f02783.isArray()) {
            return this.f6395x6ac9171.equals(c2171x6f02140.f6395x6ac9171);
        }
        java.lang.Object obj2 = this.f6395x6ac9171;
        return obj2 instanceof byte[] ? java.util.Arrays.equals((byte[]) obj2, (byte[]) c2171x6f02140.f6395x6ac9171) : obj2 instanceof int[] ? java.util.Arrays.equals((int[]) obj2, (int[]) c2171x6f02140.f6395x6ac9171) : obj2 instanceof long[] ? java.util.Arrays.equals((long[]) obj2, (long[]) c2171x6f02140.f6395x6ac9171) : obj2 instanceof float[] ? java.util.Arrays.equals((float[]) obj2, (float[]) c2171x6f02140.f6395x6ac9171) : obj2 instanceof double[] ? java.util.Arrays.equals((double[]) obj2, (double[]) c2171x6f02140.f6395x6ac9171) : obj2 instanceof boolean[] ? java.util.Arrays.equals((boolean[]) obj2, (boolean[]) c2171x6f02140.f6395x6ac9171) : java.util.Arrays.deepEquals((java.lang.Object[]) obj2, (java.lang.Object[]) c2171x6f02140.f6395x6ac9171);
    }

    /* renamed from: hashCode */
    public final int m18939x8cdac1b() {
        try {
            return java.util.Arrays.hashCode(m18935x5f01b1f6()) + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de;
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }

    public final int zza() {
        java.lang.Object obj = this.f6395x6ac9171;
        if (obj == null) {
            int i17 = 0;
            for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145 c2176x6f02145 : this.f6397x6f02790) {
                i17 += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18917x394b72(c2176x6f02145.tag) + 0 + c2176x6f02145.f6402x6f026d3.length;
            }
            return i17;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2169x6f02139<?, ?> c2169x6f02139 = this.f6396x6f0278f;
        if (!c2169x6f02139.f6388x6f02784) {
            return c2169x6f02139.zzv(obj);
        }
        int length = java.lang.reflect.Array.getLength(obj);
        int i18 = 0;
        for (int i19 = 0; i19 < length; i19++) {
            if (java.lang.reflect.Array.get(obj, i19) != null) {
                i18 += c2169x6f02139.zzv(java.lang.reflect.Array.get(obj, i19));
            }
        }
        return i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2169x6f02139<?, T> c2169x6f02139) {
        if (this.f6395x6ac9171 == null) {
            this.f6396x6f0278f = c2169x6f02139;
            this.f6395x6ac9171 = c2169x6f02139.zzi(this.f6397x6f02790);
            this.f6397x6f02790 = null;
        } else if (!this.f6396x6f0278f.m18923xb2c87fbf(c2169x6f02139)) {
            throw new java.lang.IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return (T) this.f6395x6ac9171;
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        java.lang.Object obj = this.f6395x6ac9171;
        if (obj == null) {
            for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145 c2176x6f02145 : this.f6397x6f02790) {
                c2166x6f02136.m18919x394b71(c2176x6f02145.tag);
                c2166x6f02136.zzk(c2176x6f02145.f6402x6f026d3);
            }
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2169x6f02139<?, ?> c2169x6f02139 = this.f6396x6f0278f;
        if (!c2169x6f02139.f6388x6f02784) {
            c2169x6f02139.zza(obj, c2166x6f02136);
            return;
        }
        int length = java.lang.reflect.Array.getLength(obj);
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj2 = java.lang.reflect.Array.get(obj, i17);
            if (obj2 != null) {
                c2169x6f02139.zza(obj2, c2166x6f02136);
            }
        }
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145 c2176x6f02145) {
        java.lang.Object zzi;
        java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145> list = this.f6397x6f02790;
        if (list != null) {
            list.add(c2176x6f02145);
            return;
        }
        java.lang.Object obj = this.f6395x6ac9171;
        if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143) {
            byte[] bArr = c2176x6f02145.f6402x6f026d3;
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 zza = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135.zza(bArr, 0, bArr.length);
            int m18907x394de4 = zza.m18907x394de4();
            if (m18907x394de4 != bArr.length - com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18913x394b6e(m18907x394de4)) {
                throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142.m18947x394df2();
            }
            zzi = ((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143) this.f6395x6ac9171).zzb(zza);
        } else if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143[]) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143[] abstractC2174x6f02143Arr = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143[]) this.f6396x6f0278f.zzi(java.util.Collections.singletonList(c2176x6f02145));
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143[] abstractC2174x6f02143Arr2 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143[]) this.f6395x6ac9171;
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143[] abstractC2174x6f02143Arr3 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143[]) java.util.Arrays.copyOf(abstractC2174x6f02143Arr2, abstractC2174x6f02143Arr2.length + abstractC2174x6f02143Arr.length);
            java.lang.System.arraycopy(abstractC2174x6f02143Arr, 0, abstractC2174x6f02143Arr3, abstractC2174x6f02143Arr2.length, abstractC2174x6f02143Arr.length);
            zzi = abstractC2174x6f02143Arr3;
        } else {
            zzi = this.f6396x6f0278f.zzi(java.util.Collections.singletonList(c2176x6f02145));
        }
        this.f6396x6f0278f = this.f6396x6f0278f;
        this.f6395x6ac9171 = zzi;
        this.f6397x6f02790 = null;
    }
}

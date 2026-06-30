package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzacc */
/* loaded from: classes16.dex */
public final class C2172x6f02141 {

    /* renamed from: UTF_8 */
    protected static final java.nio.charset.Charset f6399x4d50f80 = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);

    /* renamed from: ISO_8859_1 */
    private static final java.nio.charset.Charset f6398xcdcb9570 = java.nio.charset.Charset.forName(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);

    /* renamed from: zzbxg */
    public static final java.lang.Object f6400x6f02791 = new java.lang.Object();

    /* renamed from: equals */
    public static boolean m18941xb2c87fbf(int[] iArr, int[] iArr2) {
        return (iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : java.util.Arrays.equals(iArr, iArr2);
    }

    /* renamed from: hashCode */
    public static int m18944x8cdac1b(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return java.util.Arrays.hashCode(iArr);
    }

    public static void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138 abstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138 abstractC2168x6f021382) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = abstractC2168x6f02138.f6385x6f02782;
        if (c2170x6f0213f != null) {
            abstractC2168x6f021382.f6385x6f02782 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f) c2170x6f0213f.m18928x5a5dd5d();
        }
    }

    /* renamed from: equals */
    public static boolean m18942xb2c87fbf(long[] jArr, long[] jArr2) {
        return (jArr == null || jArr.length == 0) ? jArr2 == null || jArr2.length == 0 : java.util.Arrays.equals(jArr, jArr2);
    }

    /* renamed from: hashCode */
    public static int m18945x8cdac1b(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return java.util.Arrays.hashCode(jArr);
    }

    /* renamed from: equals */
    public static boolean m18943xb2c87fbf(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i17 >= length || objArr[i17] != null) {
                while (i18 < length2 && objArr2[i18] == null) {
                    i18++;
                }
                boolean z17 = i17 >= length;
                boolean z18 = i18 >= length2;
                if (z17 && z18) {
                    return true;
                }
                if (z17 != z18 || !objArr[i17].equals(objArr2[i18])) {
                    return false;
                }
                i17++;
                i18++;
            } else {
                i17++;
            }
        }
    }

    /* renamed from: hashCode */
    public static int m18946x8cdac1b(java.lang.Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            java.lang.Object obj = objArr[i18];
            if (obj != null) {
                i17 = (i17 * 31) + obj.hashCode();
            }
        }
        return i17;
    }
}

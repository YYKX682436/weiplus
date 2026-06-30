package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59;

/* loaded from: classes16.dex */
public final class zzr {

    /* renamed from: UTF_8 */
    protected static final java.nio.charset.Charset f7319x4d50f80 = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);

    /* renamed from: ISO_8859_1 */
    private static final java.nio.charset.Charset f7318xcdcb9570 = java.nio.charset.Charset.forName(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);

    /* renamed from: zzhk */
    public static final java.lang.Object f7320x394c43 = new java.lang.Object();

    /* renamed from: equals */
    public static boolean m19454xb2c87fbf(float[] fArr, float[] fArr2) {
        return (fArr == null || fArr.length == 0) ? fArr2 == null || fArr2.length == 0 : java.util.Arrays.equals(fArr, fArr2);
    }

    /* renamed from: hashCode */
    public static int m19457x8cdac1b(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return java.util.Arrays.hashCode(fArr);
    }

    public static void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzn zznVar, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzn zznVar2) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp zzpVar = zznVar.f7308x394c3b;
        if (zzpVar != null) {
            zznVar2.f7308x394c3b = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp) zzpVar.m19444x5a5dd5d();
        }
    }

    /* renamed from: equals */
    public static boolean m19455xb2c87fbf(long[] jArr, long[] jArr2) {
        return (jArr == null || jArr.length == 0) ? jArr2 == null || jArr2.length == 0 : java.util.Arrays.equals(jArr, jArr2);
    }

    /* renamed from: hashCode */
    public static int m19458x8cdac1b(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return java.util.Arrays.hashCode(jArr);
    }

    /* renamed from: equals */
    public static boolean m19456xb2c87fbf(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
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
    public static int m19459x8cdac1b(java.lang.Object[] objArr) {
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

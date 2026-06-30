package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final int f132383a = 37;

    /* renamed from: b, reason: collision with root package name */
    private static final int f132384b = 17;

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f132385c;

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f132386d;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i17 = 0; i17 < 256; i17++) {
            bArr2[i17] = bArr[i17 >>> 4];
            bArr3[i17] = bArr[i17 & 15];
        }
        f132385c = bArr2;
        f132386d = bArr3;
    }

    private static int a(byte b17) {
        return b17 + 629;
    }

    private static int b(byte b17, byte b18) {
        if (b17 < b18) {
            return -1;
        }
        return b17 > b18 ? 1 : 0;
    }

    private static int a(char c17) {
        return c17 + 629;
    }

    private static int b(char c17, char c18) {
        if (c17 < c18) {
            return -1;
        }
        return c17 > c18 ? 1 : 0;
    }

    private static int a(int i17) {
        return i17 + 629;
    }

    private static int b(double d17, double d18) {
        if (d17 < d18) {
            return -1;
        }
        return d17 > d18 ? 1 : 0;
    }

    private static int a(long j17) {
        return ((int) (j17 ^ (j17 >> 32))) + 629;
    }

    private static int b(float f17, float f18) {
        if (f17 < f18) {
            return -1;
        }
        return f17 > f18 ? 1 : 0;
    }

    private static int a(short s17) {
        return s17 + 629;
    }

    private static int b(int i17, int i18) {
        if (i17 < i18) {
            return -1;
        }
        return i17 > i18 ? 1 : 0;
    }

    private static int a(boolean z17) {
        return (!z17 ? 1 : 0) + 629;
    }

    private static int b(long j17, long j18) {
        if (j17 < j18) {
            return -1;
        }
        return j17 > j18 ? 1 : 0;
    }

    public static boolean a(byte b17, byte b18) {
        return b17 == b18;
    }

    private static int b(short s17, short s18) {
        if (s17 < s18) {
            return -1;
        }
        return s17 > s18 ? 1 : 0;
    }

    private static boolean a(char c17, char c18) {
        return c17 == c18;
    }

    private static int b(boolean z17, boolean z18) {
        return (z17 ? 1 : 0) - (z18 ? 1 : 0);
    }

    private static boolean a(double d17, double d18) {
        return d17 == d18;
    }

    private static java.lang.String b(byte[] bArr) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        if (remaining == 0) {
            return "empty";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer((wrap.remaining() * 3) - 1);
        int position = wrap.position();
        int i17 = wrap.get() & 255;
        stringBuffer.append((char) f132385c[i17]);
        stringBuffer.append((char) f132386d[i17]);
        while (true) {
            remaining--;
            if (remaining > 0) {
                stringBuffer.append(' ');
                int i18 = wrap.get() & 255;
                stringBuffer.append((char) f132385c[i18]);
                stringBuffer.append((char) f132386d[i18]);
            } else {
                wrap.position(position);
                return stringBuffer.toString();
            }
        }
    }

    private static boolean a(float f17, float f18) {
        return f17 == f18;
    }

    public static boolean a(int i17, int i18) {
        return i17 == i18;
    }

    public static boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static boolean a(short s17, short s18) {
        return s17 == s18;
    }

    private static boolean a(boolean z17, boolean z18) {
        return z17 == z18;
    }

    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj == obj2;
        }
        return obj.equals(obj2);
    }

    private static <T extends java.lang.Comparable<T>> int a(T t17, T t18) {
        return t17.compareTo(t18);
    }

    private static <T extends java.lang.Comparable<T>> int a(java.util.List<T> list, java.util.List<T> list2) {
        java.util.Iterator<T> it = list.iterator();
        java.util.Iterator<T> it6 = list2.iterator();
        while (it.hasNext() && it6.hasNext()) {
            int compareTo = it.next().compareTo(it6.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return b(it.hasNext(), it6.hasNext());
    }

    private static <T extends java.lang.Comparable<T>> int a(T[] tArr, T[] tArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < tArr.length && i18 < tArr2.length; i18++) {
            int compareTo = tArr[i17].compareTo(tArr2[i18]);
            if (compareTo != 0) {
                return compareTo;
            }
            i17++;
        }
        return b(tArr.length, tArr2.length);
    }

    private static java.lang.String b(java.nio.ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return "empty";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer((byteBuffer.remaining() * 3) - 1);
        int position = byteBuffer.position();
        int i17 = byteBuffer.get() & 255;
        stringBuffer.append((char) f132385c[i17]);
        stringBuffer.append((char) f132386d[i17]);
        while (true) {
            remaining--;
            if (remaining > 0) {
                stringBuffer.append(' ');
                int i18 = byteBuffer.get() & 255;
                stringBuffer.append((char) f132385c[i18]);
                stringBuffer.append((char) f132386d[i18]);
            } else {
                byteBuffer.position(position);
                return stringBuffer.toString();
            }
        }
    }

    private static int a(boolean[] zArr, boolean[] zArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < zArr.length && i18 < zArr2.length; i18++) {
            int b17 = b(zArr[i17], zArr2[i18]);
            if (b17 != 0) {
                return b17;
            }
            i17++;
        }
        return b(zArr.length, zArr2.length);
    }

    private static int a(byte[] bArr, byte[] bArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < bArr.length && i18 < bArr2.length; i18++) {
            byte b17 = bArr[i17];
            byte b18 = bArr2[i18];
            int i19 = b17 < b18 ? -1 : b17 > b18 ? 1 : 0;
            if (i19 != 0) {
                return i19;
            }
            i17++;
        }
        return b(bArr.length, bArr2.length);
    }

    private static int a(char[] cArr, char[] cArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < cArr.length && i18 < cArr2.length; i18++) {
            char c17 = cArr[i17];
            char c18 = cArr2[i18];
            int i19 = c17 < c18 ? -1 : c17 > c18 ? 1 : 0;
            if (i19 != 0) {
                return i19;
            }
            i17++;
        }
        return b(cArr.length, cArr2.length);
    }

    private static int a(short[] sArr, short[] sArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < sArr.length && i18 < sArr2.length; i18++) {
            short s17 = sArr[i17];
            short s18 = sArr2[i18];
            int i19 = s17 < s18 ? -1 : s17 > s18 ? 1 : 0;
            if (i19 != 0) {
                return i19;
            }
            i17++;
        }
        return b(sArr.length, sArr2.length);
    }

    private static int a(int[] iArr, int[] iArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < iArr.length && i18 < iArr2.length; i18++) {
            int b17 = b(iArr[i17], iArr2[i18]);
            if (b17 != 0) {
                return b17;
            }
            i17++;
        }
        return b(iArr.length, iArr2.length);
    }

    private static int a(long[] jArr, long[] jArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < jArr.length && i18 < jArr2.length; i18++) {
            long j17 = jArr[i17];
            long j18 = jArr2[i18];
            int i19 = j17 < j18 ? -1 : j17 > j18 ? 1 : 0;
            if (i19 != 0) {
                return i19;
            }
            i17++;
        }
        return b(jArr.length, jArr2.length);
    }

    private static int a(float[] fArr, float[] fArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < fArr.length && i18 < fArr2.length; i18++) {
            float f17 = fArr[i17];
            float f18 = fArr2[i18];
            int i19 = f17 < f18 ? -1 : f17 > f18 ? 1 : 0;
            if (i19 != 0) {
                return i19;
            }
            i17++;
        }
        return b(fArr.length, fArr2.length);
    }

    private static int a(double[] dArr, double[] dArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < dArr.length && i18 < dArr2.length; i18++) {
            double d17 = dArr[i17];
            double d18 = dArr2[i18];
            int i19 = d17 < d18 ? -1 : d17 > d18 ? 1 : 0;
            if (i19 != 0) {
                return i19;
            }
            i17++;
        }
        return b(dArr.length, dArr2.length);
    }

    private static int a(boolean[] zArr) {
        if (zArr == null) {
            return 629;
        }
        int i17 = 17;
        for (boolean z17 : zArr) {
            i17 = (i17 * 37) + (!z17 ? 1 : 0);
        }
        return i17;
    }

    private static int a(byte[] bArr) {
        if (bArr == null) {
            return 629;
        }
        int i17 = 17;
        for (byte b17 : bArr) {
            i17 = (i17 * 37) + b17;
        }
        return i17;
    }

    private static int a(char[] cArr) {
        if (cArr == null) {
            return 629;
        }
        int i17 = 17;
        for (char c17 : cArr) {
            i17 = (i17 * 37) + c17;
        }
        return i17;
    }

    private static int a(double d17) {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(d17);
        return ((int) (doubleToLongBits ^ (doubleToLongBits >> 32))) + 629;
    }

    private static int a(double[] dArr) {
        if (dArr == null) {
            return 629;
        }
        int i17 = 17;
        for (int i18 = 0; i18 < dArr.length; i18++) {
            i17 = (i17 * 37) + ((int) (java.lang.Double.doubleToLongBits(dArr[i18]) ^ (java.lang.Double.doubleToLongBits(dArr[i18]) >> 32)));
        }
        return i17;
    }

    private static int a(float f17) {
        return java.lang.Float.floatToIntBits(f17) + 629;
    }

    private static int a(float[] fArr) {
        if (fArr == null) {
            return 629;
        }
        int i17 = 17;
        for (float f17 : fArr) {
            i17 = (i17 * 37) + java.lang.Float.floatToIntBits(f17);
        }
        return i17;
    }

    private static int a(short[] sArr) {
        if (sArr == null) {
            return 629;
        }
        int i17 = 17;
        for (short s17 : sArr) {
            i17 = (i17 * 37) + s17;
        }
        return i17;
    }

    private static int a(int[] iArr) {
        if (iArr == null) {
            return 629;
        }
        int i17 = 17;
        for (int i18 : iArr) {
            i17 = (i17 * 37) + i18;
        }
        return i17;
    }

    private static int a(long[] jArr) {
        if (jArr == null) {
            return 629;
        }
        int i17 = 17;
        for (long j17 : jArr) {
            i17 = (i17 * 37) + ((int) (j17 ^ (j17 >> 32)));
        }
        return i17;
    }

    private static int a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p[] pVarArr) {
        if (pVarArr == null) {
            return 629;
        }
        int i17 = 17;
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p pVar : pVarArr) {
            i17 = (i17 * 37) + pVar.hashCode();
        }
        return i17;
    }

    private static int a(java.lang.Object obj) {
        while (obj != null) {
            if (obj.getClass().isArray()) {
                if (obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p[]) {
                    int i17 = 17;
                    for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p pVar : (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p[]) obj) {
                        i17 = (i17 * 37) + pVar.hashCode();
                    }
                    return i17;
                }
                obj = (java.lang.Object[]) obj;
            } else {
                return obj.hashCode() + 629;
            }
        }
        return 629;
    }

    public static byte[] a(java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byte[] bArr = new byte[position];
        java.lang.System.arraycopy(byteBuffer.array(), 0, bArr, 0, position);
        return bArr;
    }
}

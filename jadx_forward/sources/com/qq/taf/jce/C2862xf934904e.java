package com.qq.taf.jce;

/* renamed from: com.qq.taf.jce.JceUtil */
/* loaded from: classes13.dex */
public final class C2862xf934904e {

    /* renamed from: highDigits */
    private static final byte[] f9766xd10a3528;

    /* renamed from: iConstant */
    private static final int f9767xb213cf2d = 37;

    /* renamed from: iTotal */
    private static final int f9768xb800c45b = 17;

    /* renamed from: lowDigits */
    private static final byte[] f9769xa8886d5a;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i17 = 0; i17 < 256; i17++) {
            bArr2[i17] = bArr[i17 >>> 4];
            bArr3[i17] = bArr[i17 & 15];
        }
        f9766xd10a3528 = bArr2;
        f9769xa8886d5a = bArr3;
    }

    /* renamed from: compareTo */
    public static int m21375xabcba240(byte b17, byte b18) {
        if (b17 < b18) {
            return -1;
        }
        return b17 > b18 ? 1 : 0;
    }

    /* renamed from: equals */
    public static boolean m21394xb2c87fbf(byte b17, byte b18) {
        return b17 == b18;
    }

    /* renamed from: getHexdump */
    public static java.lang.String m21404x6e790359(byte[] bArr) {
        return m21403x6e790359(java.nio.ByteBuffer.wrap(bArr));
    }

    /* renamed from: getJceBufArray */
    public static byte[] m21405x1f0d4cdc(java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byte[] bArr = new byte[position];
        java.lang.System.arraycopy(byteBuffer.array(), 0, bArr, 0, position);
        return bArr;
    }

    /* renamed from: hashCode */
    public static int m21406x8cdac1b(byte b17) {
        return b17 + 629;
    }

    /* renamed from: compareTo */
    public static int m21376xabcba240(char c17, char c18) {
        if (c17 < c18) {
            return -1;
        }
        return c17 > c18 ? 1 : 0;
    }

    /* renamed from: equals */
    public static boolean m21395xb2c87fbf(char c17, char c18) {
        return c17 == c18;
    }

    /* renamed from: getHexdump */
    public static java.lang.String m21403x6e790359(java.nio.ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return "empty";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer((byteBuffer.remaining() * 3) - 1);
        int position = byteBuffer.position();
        int i17 = byteBuffer.get() & 255;
        stringBuffer.append((char) f9766xd10a3528[i17]);
        stringBuffer.append((char) f9769xa8886d5a[i17]);
        while (true) {
            remaining--;
            if (remaining <= 0) {
                byteBuffer.position(position);
                return stringBuffer.toString();
            }
            stringBuffer.append(' ');
            int i18 = byteBuffer.get() & 255;
            stringBuffer.append((char) f9766xd10a3528[i18]);
            stringBuffer.append((char) f9769xa8886d5a[i18]);
        }
    }

    /* renamed from: hashCode */
    public static int m21407x8cdac1b(char c17) {
        return c17 + 629;
    }

    /* renamed from: compareTo */
    public static int m21377xabcba240(double d17, double d18) {
        if (d17 < d18) {
            return -1;
        }
        return d17 > d18 ? 1 : 0;
    }

    /* renamed from: equals */
    public static boolean m21396xb2c87fbf(double d17, double d18) {
        return d17 == d18;
    }

    /* renamed from: hashCode */
    public static int m21410x8cdac1b(int i17) {
        return i17 + 629;
    }

    /* renamed from: compareTo */
    public static int m21378xabcba240(float f17, float f18) {
        if (f17 < f18) {
            return -1;
        }
        return f17 > f18 ? 1 : 0;
    }

    /* renamed from: equals */
    public static boolean m21397xb2c87fbf(float f17, float f18) {
        return f17 == f18;
    }

    /* renamed from: hashCode */
    public static int m21411x8cdac1b(long j17) {
        return ((int) (j17 ^ (j17 >> 32))) + 629;
    }

    /* renamed from: compareTo */
    public static int m21379xabcba240(int i17, int i18) {
        if (i17 < i18) {
            return -1;
        }
        return i17 > i18 ? 1 : 0;
    }

    /* renamed from: equals */
    public static boolean m21398xb2c87fbf(int i17, int i18) {
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public static int m21413x8cdac1b(short s17) {
        return s17 + 629;
    }

    /* renamed from: compareTo */
    public static int m21380xabcba240(long j17, long j18) {
        if (j17 < j18) {
            return -1;
        }
        return j17 > j18 ? 1 : 0;
    }

    /* renamed from: equals */
    public static boolean m21399xb2c87fbf(long j17, long j18) {
        return j17 == j18;
    }

    /* renamed from: hashCode */
    public static int m21414x8cdac1b(boolean z17) {
        return (!z17 ? 1 : 0) + 629;
    }

    /* renamed from: compareTo */
    public static int m21383xabcba240(short s17, short s18) {
        if (s17 < s18) {
            return -1;
        }
        return s17 > s18 ? 1 : 0;
    }

    /* renamed from: equals */
    public static boolean m21401xb2c87fbf(short s17, short s18) {
        return s17 == s18;
    }

    /* renamed from: hashCode */
    public static int m21423x8cdac1b(boolean[] zArr) {
        if (zArr == null) {
            return 629;
        }
        int i17 = 17;
        for (boolean z17 : zArr) {
            i17 = (i17 * 37) + (!z17 ? 1 : 0);
        }
        return i17;
    }

    /* renamed from: compareTo */
    public static int m21384xabcba240(boolean z17, boolean z18) {
        return (z17 ? 1 : 0) - (z18 ? 1 : 0);
    }

    /* renamed from: equals */
    public static boolean m21402xb2c87fbf(boolean z17, boolean z18) {
        return z17 == z18;
    }

    /* renamed from: compareTo */
    public static <T extends java.lang.Comparable<T>> int m21381xabcba240(T t17, T t18) {
        return t17.compareTo(t18);
    }

    /* renamed from: equals */
    public static boolean m21400xb2c87fbf(java.lang.Object obj, java.lang.Object obj2) {
        return obj.equals(obj2);
    }

    /* renamed from: hashCode */
    public static int m21415x8cdac1b(byte[] bArr) {
        if (bArr == null) {
            return 629;
        }
        int i17 = 17;
        for (byte b17 : bArr) {
            i17 = (i17 * 37) + b17;
        }
        return i17;
    }

    /* renamed from: compareTo */
    public static <T extends java.lang.Comparable<T>> int m21382xabcba240(java.util.List<T> list, java.util.List<T> list2) {
        java.util.Iterator<T> it = list.iterator();
        java.util.Iterator<T> it6 = list2.iterator();
        while (it.hasNext() && it6.hasNext()) {
            int compareTo = it.next().compareTo(it6.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return m21384xabcba240(it.hasNext(), it6.hasNext());
    }

    /* renamed from: hashCode */
    public static int m21416x8cdac1b(char[] cArr) {
        if (cArr == null) {
            return 629;
        }
        int i17 = 17;
        for (char c17 : cArr) {
            i17 = (i17 * 37) + c17;
        }
        return i17;
    }

    /* renamed from: hashCode */
    public static int m21408x8cdac1b(double d17) {
        return m21411x8cdac1b(java.lang.Double.doubleToLongBits(d17));
    }

    /* renamed from: compareTo */
    public static <T extends java.lang.Comparable<T>> int m21391xabcba240(T[] tArr, T[] tArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < tArr.length && i18 < tArr2.length; i18++) {
            int compareTo = tArr[i17].compareTo(tArr2[i18]);
            if (compareTo != 0) {
                return compareTo;
            }
            i17++;
        }
        return m21379xabcba240(tArr.length, tArr2.length);
    }

    /* renamed from: hashCode */
    public static int m21417x8cdac1b(double[] dArr) {
        if (dArr == null) {
            return 629;
        }
        int i17 = 17;
        for (int i18 = 0; i18 < dArr.length; i18++) {
            i17 = (i17 * 37) + ((int) (java.lang.Double.doubleToLongBits(dArr[i18]) ^ (java.lang.Double.doubleToLongBits(dArr[i18]) >> 32)));
        }
        return i17;
    }

    /* renamed from: hashCode */
    public static int m21409x8cdac1b(float f17) {
        return java.lang.Float.floatToIntBits(f17) + 629;
    }

    /* renamed from: compareTo */
    public static int m21393xabcba240(boolean[] zArr, boolean[] zArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < zArr.length && i18 < zArr2.length; i18++) {
            int m21384xabcba240 = m21384xabcba240(zArr[i17], zArr2[i18]);
            if (m21384xabcba240 != 0) {
                return m21384xabcba240;
            }
            i17++;
        }
        return m21379xabcba240(zArr.length, zArr2.length);
    }

    /* renamed from: hashCode */
    public static int m21418x8cdac1b(float[] fArr) {
        if (fArr == null) {
            return 629;
        }
        int i17 = 17;
        for (float f17 : fArr) {
            i17 = (i17 * 37) + java.lang.Float.floatToIntBits(f17);
        }
        return i17;
    }

    /* renamed from: hashCode */
    public static int m21422x8cdac1b(short[] sArr) {
        if (sArr == null) {
            return 629;
        }
        int i17 = 17;
        for (short s17 : sArr) {
            i17 = (i17 * 37) + s17;
        }
        return i17;
    }

    /* renamed from: compareTo */
    public static int m21385xabcba240(byte[] bArr, byte[] bArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < bArr.length && i18 < bArr2.length; i18++) {
            int m21375xabcba240 = m21375xabcba240(bArr[i17], bArr2[i18]);
            if (m21375xabcba240 != 0) {
                return m21375xabcba240;
            }
            i17++;
        }
        return m21379xabcba240(bArr.length, bArr2.length);
    }

    /* renamed from: hashCode */
    public static int m21419x8cdac1b(int[] iArr) {
        if (iArr == null) {
            return 629;
        }
        int i17 = 17;
        for (int i18 : iArr) {
            i17 = (i17 * 37) + i18;
        }
        return i17;
    }

    /* renamed from: compareTo */
    public static int m21386xabcba240(char[] cArr, char[] cArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < cArr.length && i18 < cArr2.length; i18++) {
            int m21376xabcba240 = m21376xabcba240(cArr[i17], cArr2[i18]);
            if (m21376xabcba240 != 0) {
                return m21376xabcba240;
            }
            i17++;
        }
        return m21379xabcba240(cArr.length, cArr2.length);
    }

    /* renamed from: hashCode */
    public static int m21420x8cdac1b(long[] jArr) {
        if (jArr == null) {
            return 629;
        }
        int i17 = 17;
        for (long j17 : jArr) {
            i17 = (i17 * 37) + ((int) (j17 ^ (j17 >> 32)));
        }
        return i17;
    }

    /* renamed from: hashCode */
    public static int m21421x8cdac1b(com.qq.taf.jce.AbstractC2861x7aec4921[] abstractC2861x7aec4921Arr) {
        if (abstractC2861x7aec4921Arr == null) {
            return 629;
        }
        int i17 = 17;
        for (com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921 : abstractC2861x7aec4921Arr) {
            i17 = (i17 * 37) + abstractC2861x7aec4921.hashCode();
        }
        return i17;
    }

    /* renamed from: compareTo */
    public static int m21392xabcba240(short[] sArr, short[] sArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < sArr.length && i18 < sArr2.length; i18++) {
            int m21383xabcba240 = m21383xabcba240(sArr[i17], sArr2[i18]);
            if (m21383xabcba240 != 0) {
                return m21383xabcba240;
            }
            i17++;
        }
        return m21379xabcba240(sArr.length, sArr2.length);
    }

    /* renamed from: hashCode */
    public static int m21412x8cdac1b(java.lang.Object obj) {
        if (obj == null) {
            return 629;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof long[]) {
                return m21420x8cdac1b((long[]) obj);
            }
            if (obj instanceof int[]) {
                return m21419x8cdac1b((int[]) obj);
            }
            if (obj instanceof short[]) {
                return m21422x8cdac1b((short[]) obj);
            }
            if (obj instanceof char[]) {
                return m21416x8cdac1b((char[]) obj);
            }
            if (obj instanceof byte[]) {
                return m21415x8cdac1b((byte[]) obj);
            }
            if (obj instanceof double[]) {
                return m21417x8cdac1b((double[]) obj);
            }
            if (obj instanceof float[]) {
                return m21418x8cdac1b((float[]) obj);
            }
            if (obj instanceof boolean[]) {
                return m21423x8cdac1b((boolean[]) obj);
            }
            if (obj instanceof com.qq.taf.jce.AbstractC2861x7aec4921[]) {
                return m21421x8cdac1b((com.qq.taf.jce.AbstractC2861x7aec4921[]) obj);
            }
            return m21412x8cdac1b((java.lang.Object[]) obj);
        }
        if (obj instanceof com.qq.taf.jce.AbstractC2861x7aec4921) {
            return obj.hashCode();
        }
        return obj.hashCode() + 629;
    }

    /* renamed from: compareTo */
    public static int m21389xabcba240(int[] iArr, int[] iArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < iArr.length && i18 < iArr2.length; i18++) {
            int m21379xabcba240 = m21379xabcba240(iArr[i17], iArr2[i18]);
            if (m21379xabcba240 != 0) {
                return m21379xabcba240;
            }
            i17++;
        }
        return m21379xabcba240(iArr.length, iArr2.length);
    }

    /* renamed from: compareTo */
    public static int m21390xabcba240(long[] jArr, long[] jArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < jArr.length && i18 < jArr2.length; i18++) {
            int m21380xabcba240 = m21380xabcba240(jArr[i17], jArr2[i18]);
            if (m21380xabcba240 != 0) {
                return m21380xabcba240;
            }
            i17++;
        }
        return m21379xabcba240(jArr.length, jArr2.length);
    }

    /* renamed from: compareTo */
    public static int m21388xabcba240(float[] fArr, float[] fArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < fArr.length && i18 < fArr2.length; i18++) {
            int m21378xabcba240 = m21378xabcba240(fArr[i17], fArr2[i18]);
            if (m21378xabcba240 != 0) {
                return m21378xabcba240;
            }
            i17++;
        }
        return m21379xabcba240(fArr.length, fArr2.length);
    }

    /* renamed from: compareTo */
    public static int m21387xabcba240(double[] dArr, double[] dArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < dArr.length && i18 < dArr2.length; i18++) {
            int m21377xabcba240 = m21377xabcba240(dArr[i17], dArr2[i18]);
            if (m21377xabcba240 != 0) {
                return m21377xabcba240;
            }
            i17++;
        }
        return m21379xabcba240(dArr.length, dArr2.length);
    }
}

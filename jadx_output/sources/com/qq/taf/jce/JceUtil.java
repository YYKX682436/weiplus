package com.qq.taf.jce;

/* loaded from: classes13.dex */
public final class JceUtil {
    private static final byte[] highDigits;
    private static final int iConstant = 37;
    private static final int iTotal = 17;
    private static final byte[] lowDigits;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i17 = 0; i17 < 256; i17++) {
            bArr2[i17] = bArr[i17 >>> 4];
            bArr3[i17] = bArr[i17 & 15];
        }
        highDigits = bArr2;
        lowDigits = bArr3;
    }

    public static int compareTo(byte b17, byte b18) {
        if (b17 < b18) {
            return -1;
        }
        return b17 > b18 ? 1 : 0;
    }

    public static boolean equals(byte b17, byte b18) {
        return b17 == b18;
    }

    public static java.lang.String getHexdump(byte[] bArr) {
        return getHexdump(java.nio.ByteBuffer.wrap(bArr));
    }

    public static byte[] getJceBufArray(java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byte[] bArr = new byte[position];
        java.lang.System.arraycopy(byteBuffer.array(), 0, bArr, 0, position);
        return bArr;
    }

    public static int hashCode(byte b17) {
        return b17 + 629;
    }

    public static int compareTo(char c17, char c18) {
        if (c17 < c18) {
            return -1;
        }
        return c17 > c18 ? 1 : 0;
    }

    public static boolean equals(char c17, char c18) {
        return c17 == c18;
    }

    public static java.lang.String getHexdump(java.nio.ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return "empty";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer((byteBuffer.remaining() * 3) - 1);
        int position = byteBuffer.position();
        int i17 = byteBuffer.get() & 255;
        stringBuffer.append((char) highDigits[i17]);
        stringBuffer.append((char) lowDigits[i17]);
        while (true) {
            remaining--;
            if (remaining <= 0) {
                byteBuffer.position(position);
                return stringBuffer.toString();
            }
            stringBuffer.append(' ');
            int i18 = byteBuffer.get() & 255;
            stringBuffer.append((char) highDigits[i18]);
            stringBuffer.append((char) lowDigits[i18]);
        }
    }

    public static int hashCode(char c17) {
        return c17 + 629;
    }

    public static int compareTo(double d17, double d18) {
        if (d17 < d18) {
            return -1;
        }
        return d17 > d18 ? 1 : 0;
    }

    public static boolean equals(double d17, double d18) {
        return d17 == d18;
    }

    public static int hashCode(int i17) {
        return i17 + 629;
    }

    public static int compareTo(float f17, float f18) {
        if (f17 < f18) {
            return -1;
        }
        return f17 > f18 ? 1 : 0;
    }

    public static boolean equals(float f17, float f18) {
        return f17 == f18;
    }

    public static int hashCode(long j17) {
        return ((int) (j17 ^ (j17 >> 32))) + 629;
    }

    public static int compareTo(int i17, int i18) {
        if (i17 < i18) {
            return -1;
        }
        return i17 > i18 ? 1 : 0;
    }

    public static boolean equals(int i17, int i18) {
        return i17 == i18;
    }

    public static int hashCode(short s17) {
        return s17 + 629;
    }

    public static int compareTo(long j17, long j18) {
        if (j17 < j18) {
            return -1;
        }
        return j17 > j18 ? 1 : 0;
    }

    public static boolean equals(long j17, long j18) {
        return j17 == j18;
    }

    public static int hashCode(boolean z17) {
        return (!z17 ? 1 : 0) + 629;
    }

    public static int compareTo(short s17, short s18) {
        if (s17 < s18) {
            return -1;
        }
        return s17 > s18 ? 1 : 0;
    }

    public static boolean equals(short s17, short s18) {
        return s17 == s18;
    }

    public static int hashCode(boolean[] zArr) {
        if (zArr == null) {
            return 629;
        }
        int i17 = 17;
        for (boolean z17 : zArr) {
            i17 = (i17 * 37) + (!z17 ? 1 : 0);
        }
        return i17;
    }

    public static int compareTo(boolean z17, boolean z18) {
        return (z17 ? 1 : 0) - (z18 ? 1 : 0);
    }

    public static boolean equals(boolean z17, boolean z18) {
        return z17 == z18;
    }

    public static <T extends java.lang.Comparable<T>> int compareTo(T t17, T t18) {
        return t17.compareTo(t18);
    }

    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        return obj.equals(obj2);
    }

    public static int hashCode(byte[] bArr) {
        if (bArr == null) {
            return 629;
        }
        int i17 = 17;
        for (byte b17 : bArr) {
            i17 = (i17 * 37) + b17;
        }
        return i17;
    }

    public static <T extends java.lang.Comparable<T>> int compareTo(java.util.List<T> list, java.util.List<T> list2) {
        java.util.Iterator<T> it = list.iterator();
        java.util.Iterator<T> it6 = list2.iterator();
        while (it.hasNext() && it6.hasNext()) {
            int compareTo = it.next().compareTo(it6.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return compareTo(it.hasNext(), it6.hasNext());
    }

    public static int hashCode(char[] cArr) {
        if (cArr == null) {
            return 629;
        }
        int i17 = 17;
        for (char c17 : cArr) {
            i17 = (i17 * 37) + c17;
        }
        return i17;
    }

    public static int hashCode(double d17) {
        return hashCode(java.lang.Double.doubleToLongBits(d17));
    }

    public static <T extends java.lang.Comparable<T>> int compareTo(T[] tArr, T[] tArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < tArr.length && i18 < tArr2.length; i18++) {
            int compareTo = tArr[i17].compareTo(tArr2[i18]);
            if (compareTo != 0) {
                return compareTo;
            }
            i17++;
        }
        return compareTo(tArr.length, tArr2.length);
    }

    public static int hashCode(double[] dArr) {
        if (dArr == null) {
            return 629;
        }
        int i17 = 17;
        for (int i18 = 0; i18 < dArr.length; i18++) {
            i17 = (i17 * 37) + ((int) (java.lang.Double.doubleToLongBits(dArr[i18]) ^ (java.lang.Double.doubleToLongBits(dArr[i18]) >> 32)));
        }
        return i17;
    }

    public static int hashCode(float f17) {
        return java.lang.Float.floatToIntBits(f17) + 629;
    }

    public static int compareTo(boolean[] zArr, boolean[] zArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < zArr.length && i18 < zArr2.length; i18++) {
            int compareTo = compareTo(zArr[i17], zArr2[i18]);
            if (compareTo != 0) {
                return compareTo;
            }
            i17++;
        }
        return compareTo(zArr.length, zArr2.length);
    }

    public static int hashCode(float[] fArr) {
        if (fArr == null) {
            return 629;
        }
        int i17 = 17;
        for (float f17 : fArr) {
            i17 = (i17 * 37) + java.lang.Float.floatToIntBits(f17);
        }
        return i17;
    }

    public static int hashCode(short[] sArr) {
        if (sArr == null) {
            return 629;
        }
        int i17 = 17;
        for (short s17 : sArr) {
            i17 = (i17 * 37) + s17;
        }
        return i17;
    }

    public static int compareTo(byte[] bArr, byte[] bArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < bArr.length && i18 < bArr2.length; i18++) {
            int compareTo = compareTo(bArr[i17], bArr2[i18]);
            if (compareTo != 0) {
                return compareTo;
            }
            i17++;
        }
        return compareTo(bArr.length, bArr2.length);
    }

    public static int hashCode(int[] iArr) {
        if (iArr == null) {
            return 629;
        }
        int i17 = 17;
        for (int i18 : iArr) {
            i17 = (i17 * 37) + i18;
        }
        return i17;
    }

    public static int compareTo(char[] cArr, char[] cArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < cArr.length && i18 < cArr2.length; i18++) {
            int compareTo = compareTo(cArr[i17], cArr2[i18]);
            if (compareTo != 0) {
                return compareTo;
            }
            i17++;
        }
        return compareTo(cArr.length, cArr2.length);
    }

    public static int hashCode(long[] jArr) {
        if (jArr == null) {
            return 629;
        }
        int i17 = 17;
        for (long j17 : jArr) {
            i17 = (i17 * 37) + ((int) (j17 ^ (j17 >> 32)));
        }
        return i17;
    }

    public static int hashCode(com.qq.taf.jce.JceStruct[] jceStructArr) {
        if (jceStructArr == null) {
            return 629;
        }
        int i17 = 17;
        for (com.qq.taf.jce.JceStruct jceStruct : jceStructArr) {
            i17 = (i17 * 37) + jceStruct.hashCode();
        }
        return i17;
    }

    public static int compareTo(short[] sArr, short[] sArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < sArr.length && i18 < sArr2.length; i18++) {
            int compareTo = compareTo(sArr[i17], sArr2[i18]);
            if (compareTo != 0) {
                return compareTo;
            }
            i17++;
        }
        return compareTo(sArr.length, sArr2.length);
    }

    public static int hashCode(java.lang.Object obj) {
        if (obj == null) {
            return 629;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof long[]) {
                return hashCode((long[]) obj);
            }
            if (obj instanceof int[]) {
                return hashCode((int[]) obj);
            }
            if (obj instanceof short[]) {
                return hashCode((short[]) obj);
            }
            if (obj instanceof char[]) {
                return hashCode((char[]) obj);
            }
            if (obj instanceof byte[]) {
                return hashCode((byte[]) obj);
            }
            if (obj instanceof double[]) {
                return hashCode((double[]) obj);
            }
            if (obj instanceof float[]) {
                return hashCode((float[]) obj);
            }
            if (obj instanceof boolean[]) {
                return hashCode((boolean[]) obj);
            }
            if (obj instanceof com.qq.taf.jce.JceStruct[]) {
                return hashCode((com.qq.taf.jce.JceStruct[]) obj);
            }
            return hashCode((java.lang.Object[]) obj);
        }
        if (obj instanceof com.qq.taf.jce.JceStruct) {
            return obj.hashCode();
        }
        return obj.hashCode() + 629;
    }

    public static int compareTo(int[] iArr, int[] iArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < iArr.length && i18 < iArr2.length; i18++) {
            int compareTo = compareTo(iArr[i17], iArr2[i18]);
            if (compareTo != 0) {
                return compareTo;
            }
            i17++;
        }
        return compareTo(iArr.length, iArr2.length);
    }

    public static int compareTo(long[] jArr, long[] jArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < jArr.length && i18 < jArr2.length; i18++) {
            int compareTo = compareTo(jArr[i17], jArr2[i18]);
            if (compareTo != 0) {
                return compareTo;
            }
            i17++;
        }
        return compareTo(jArr.length, jArr2.length);
    }

    public static int compareTo(float[] fArr, float[] fArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < fArr.length && i18 < fArr2.length; i18++) {
            int compareTo = compareTo(fArr[i17], fArr2[i18]);
            if (compareTo != 0) {
                return compareTo;
            }
            i17++;
        }
        return compareTo(fArr.length, fArr2.length);
    }

    public static int compareTo(double[] dArr, double[] dArr2) {
        int i17 = 0;
        for (int i18 = 0; i17 < dArr.length && i18 < dArr2.length; i18++) {
            int compareTo = compareTo(dArr[i17], dArr2[i18]);
            if (compareTo != 0) {
                return compareTo;
            }
            i17++;
        }
        return compareTo(dArr.length, dArr2.length);
    }
}

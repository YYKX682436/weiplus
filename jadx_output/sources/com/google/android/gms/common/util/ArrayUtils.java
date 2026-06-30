package com.google.android.gms.common.util;

/* loaded from: classes13.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> T[] concat(T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass(), 0));
        }
        int i17 = 0;
        for (T[] tArr2 : tArr) {
            i17 += tArr2.length;
        }
        T[] tArr3 = (T[]) java.util.Arrays.copyOf(tArr[0], i17);
        int length = tArr[0].length;
        for (int i18 = 1; i18 < tArr.length; i18++) {
            T[] tArr4 = tArr[i18];
            int length2 = tArr4.length;
            java.lang.System.arraycopy(tArr4, 0, tArr3, length, length2);
            length += length2;
        }
        return tArr3;
    }

    public static byte[] concatByteArrays(byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int i17 = 0;
        for (byte[] bArr2 : bArr) {
            i17 += bArr2.length;
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr[0], i17);
        int length = bArr[0].length;
        for (int i18 = 1; i18 < bArr.length; i18++) {
            byte[] bArr3 = bArr[i18];
            int length2 = bArr3.length;
            java.lang.System.arraycopy(bArr3, 0, copyOf, length, length2);
            length += length2;
        }
        return copyOf;
    }

    public static boolean contains(int[] iArr, int i17) {
        if (iArr != null) {
            for (int i18 : iArr) {
                if (i18 == i17) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> java.util.ArrayList<T> newArrayList() {
        return new java.util.ArrayList<>();
    }

    public static <T> T[] removeAll(T[] tArr, T... tArr2) {
        int length;
        int i17;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || (length = tArr2.length) == 0) {
            return (T[]) java.util.Arrays.copyOf(tArr, tArr.length);
        }
        java.lang.Class<?> cls = tArr2.getClass();
        T[] tArr3 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(cls.getComponentType(), tArr.length));
        if (length == 1) {
            i17 = 0;
            for (T t17 : tArr) {
                if (!com.google.android.gms.common.internal.Objects.equal(tArr2[0], t17)) {
                    tArr3[i17] = t17;
                    i17++;
                }
            }
        } else {
            int i18 = 0;
            for (T t18 : tArr) {
                if (!contains(tArr2, t18)) {
                    tArr3[i18] = t18;
                    i18++;
                }
            }
            i17 = i18;
        }
        if (tArr3 == null) {
            return null;
        }
        return i17 == tArr3.length ? tArr3 : (T[]) java.util.Arrays.copyOf(tArr3, i17);
    }

    public static <T> java.util.ArrayList<T> toArrayList(T[] tArr) {
        java.util.ArrayList<T> arrayList = new java.util.ArrayList<>(tArr.length);
        for (T t17 : tArr) {
            arrayList.add(t17);
        }
        return arrayList;
    }

    public static int[] toPrimitiveArray(java.util.Collection<java.lang.Integer> collection) {
        int i17 = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        java.util.Iterator<java.lang.Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArr[i17] = it.next().intValue();
            i17++;
        }
        return iArr;
    }

    public static java.lang.Integer[] toWrapperArray(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        java.lang.Integer[] numArr = new java.lang.Integer[length];
        for (int i17 = 0; i17 < length; i17++) {
            numArr[i17] = java.lang.Integer.valueOf(iArr[i17]);
        }
        return numArr;
    }

    public static void writeArray(java.lang.StringBuilder sb6, double[] dArr) {
        int length = dArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 != 0) {
                sb6.append(",");
            }
            sb6.append(dArr[i17]);
        }
    }

    public static void writeStringArray(java.lang.StringBuilder sb6, java.lang.String[] strArr) {
        int length = strArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 != 0) {
                sb6.append(",");
            }
            sb6.append("\"");
            sb6.append(strArr[i17]);
            sb6.append("\"");
        }
    }

    public static <T> boolean contains(T[] tArr, T t17) {
        int length = tArr != null ? tArr.length : 0;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            if (!com.google.android.gms.common.internal.Objects.equal(tArr[i17], t17)) {
                i17++;
            } else if (i17 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static void writeArray(java.lang.StringBuilder sb6, float[] fArr) {
        int length = fArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 != 0) {
                sb6.append(",");
            }
            sb6.append(fArr[i17]);
        }
    }

    public static void writeArray(java.lang.StringBuilder sb6, int[] iArr) {
        int length = iArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 != 0) {
                sb6.append(",");
            }
            sb6.append(iArr[i17]);
        }
    }

    public static void writeArray(java.lang.StringBuilder sb6, long[] jArr) {
        int length = jArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 != 0) {
                sb6.append(",");
            }
            sb6.append(jArr[i17]);
        }
    }

    public static <T> void writeArray(java.lang.StringBuilder sb6, T[] tArr) {
        int length = tArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 != 0) {
                sb6.append(",");
            }
            sb6.append(tArr[i17]);
        }
    }

    public static void writeArray(java.lang.StringBuilder sb6, boolean[] zArr) {
        int length = zArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 != 0) {
                sb6.append(",");
            }
            sb6.append(zArr[i17]);
        }
    }
}

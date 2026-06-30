package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6;

/* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelReader */
/* loaded from: classes13.dex */
public class C1938x1676c679 {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    /* loaded from: classes13.dex */
    public static class ParseException extends java.lang.RuntimeException {
        public ParseException(java.lang.String str, android.os.Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private C1938x1676c679() {
    }

    /* renamed from: createBigDecimal */
    public static java.math.BigDecimal m18244x4bbd004d(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return new java.math.BigDecimal(new java.math.BigInteger(createByteArray), readInt);
    }

    /* renamed from: createBigDecimalArray */
    public static java.math.BigDecimal[] m18245x991aa0c(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        java.math.BigDecimal[] bigDecimalArr = new java.math.BigDecimal[readInt];
        for (int i18 = 0; i18 < readInt; i18++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i18] = new java.math.BigDecimal(new java.math.BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return bigDecimalArr;
    }

    /* renamed from: createBigInteger */
    public static java.math.BigInteger m18246x64856e3a(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return new java.math.BigInteger(createByteArray);
    }

    /* renamed from: createBigIntegerArray */
    public static java.math.BigInteger[] m18247xc271e83f(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        java.math.BigInteger[] bigIntegerArr = new java.math.BigInteger[readInt];
        for (int i18 = 0; i18 < readInt; i18++) {
            bigIntegerArr[i18] = new java.math.BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return bigIntegerArr;
    }

    /* renamed from: createBooleanArray */
    public static boolean[] m18248x372eca2d(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return createBooleanArray;
    }

    /* renamed from: createBooleanList */
    public static java.util.ArrayList<java.lang.Boolean> m18249xbfbc0e4a(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Boolean> arrayList = new java.util.ArrayList<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            arrayList.add(java.lang.Boolean.valueOf(parcel.readInt() != 0));
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return arrayList;
    }

    /* renamed from: createBundle */
    public static android.os.Bundle m18250x3e94109e(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        android.os.Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return readBundle;
    }

    /* renamed from: createByteArray */
    public static byte[] m18251x2cc26095(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return createByteArray;
    }

    /* renamed from: createByteArrayArray */
    public static byte[][] m18252x4fc536c4(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i18 = 0; i18 < readInt; i18++) {
            bArr[i18] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return bArr;
    }

    /* renamed from: createByteArraySparseArray */
    public static android.util.SparseArray<byte[]> m18253xc871f444(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        android.util.SparseArray<byte[]> sparseArray = new android.util.SparseArray<>(readInt);
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return sparseArray;
    }

    /* renamed from: createCharArray */
    public static char[] m18254x42b6f07(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        char[] createCharArray = parcel.createCharArray();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return createCharArray;
    }

    /* renamed from: createDoubleArray */
    public static double[] m18255xcb0a926c(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return createDoubleArray;
    }

    /* renamed from: createDoubleList */
    public static java.util.ArrayList<java.lang.Double> m18256x9b36c22b(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Double> arrayList = new java.util.ArrayList<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            arrayList.add(java.lang.Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return arrayList;
    }

    /* renamed from: createDoubleSparseArray */
    public static android.util.SparseArray<java.lang.Double> m18257x8a1df1ec(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        android.util.SparseArray<java.lang.Double> sparseArray = new android.util.SparseArray<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseArray.append(parcel.readInt(), java.lang.Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return sparseArray;
    }

    /* renamed from: createFloatArray */
    public static float[] m18258x2e8beb79(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return createFloatArray;
    }

    /* renamed from: createFloatList */
    public static java.util.ArrayList<java.lang.Float> m18259x2acf937e(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            arrayList.add(java.lang.Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return arrayList;
    }

    /* renamed from: createFloatSparseArray */
    public static android.util.SparseArray<java.lang.Float> m18260x43298d39(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        android.util.SparseArray<java.lang.Float> sparseArray = new android.util.SparseArray<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseArray.append(parcel.readInt(), java.lang.Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return sparseArray;
    }

    /* renamed from: createIBinderArray */
    public static android.os.IBinder[] m18261x22323dc2(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        android.os.IBinder[] createBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return createBinderArray;
    }

    /* renamed from: createIBinderList */
    public static java.util.ArrayList<android.os.IBinder> m18262x9615415(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        java.util.ArrayList<android.os.IBinder> createBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return createBinderArrayList;
    }

    /* renamed from: createIBinderSparseArray */
    public static android.util.SparseArray<android.os.IBinder> m18263x36f144c2(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        android.util.SparseArray<android.os.IBinder> sparseArray = new android.util.SparseArray<>(readInt);
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return sparseArray;
    }

    /* renamed from: createIntArray */
    public static int[] m18264x5701d0c6(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return createIntArray;
    }

    /* renamed from: createIntegerList */
    public static java.util.ArrayList<java.lang.Integer> m18265x5cb9a860(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            arrayList.add(java.lang.Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return arrayList;
    }

    /* renamed from: createLongArray */
    public static long[] m18266xaea743a1(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return createLongArray;
    }

    /* renamed from: createLongList */
    public static java.util.ArrayList<java.lang.Long> m18267xbb549656(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Long> arrayList = new java.util.ArrayList<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            arrayList.add(java.lang.Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return arrayList;
    }

    /* renamed from: createParcel */
    public static android.os.Parcel m18268x555fe025(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, m18302xcc49f2b7);
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return obtain;
    }

    /* renamed from: createParcelArray */
    public static android.os.Parcel[] m18269xae78f134(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        android.os.Parcel[] parcelArr = new android.os.Parcel[readInt];
        for (int i18 = 0; i18 < readInt; i18++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                android.os.Parcel obtain = android.os.Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i18] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i18] = null;
            }
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return parcelArr;
    }

    /* renamed from: createParcelList */
    public static java.util.ArrayList<android.os.Parcel> m18270xe49d6a63(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        java.util.ArrayList<android.os.Parcel> arrayList = new java.util.ArrayList<>();
        for (int i18 = 0; i18 < readInt; i18++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                android.os.Parcel obtain = android.os.Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                arrayList.add(obtain);
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                arrayList.add(null);
            }
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return arrayList;
    }

    /* renamed from: createParcelSparseArray */
    public static android.util.SparseArray<android.os.Parcel> m18271x80ac1ab4(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        android.util.SparseArray<android.os.Parcel> sparseArray = new android.util.SparseArray<>();
        for (int i18 = 0; i18 < readInt; i18++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            if (readInt3 != 0) {
                int dataPosition2 = parcel.dataPosition();
                android.os.Parcel obtain = android.os.Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt3);
                sparseArray.append(readInt2, obtain);
                parcel.setDataPosition(dataPosition2 + readInt3);
            } else {
                sparseArray.append(readInt2, null);
            }
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return sparseArray;
    }

    /* renamed from: createParcelable */
    public static <T extends android.os.Parcelable> T m18272xe4a6daff(android.os.Parcel parcel, int i17, android.os.Parcelable.Creator<T> creator) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return createFromParcel;
    }

    /* renamed from: createSparseBooleanArray */
    public static android.util.SparseBooleanArray m18273x4d1f936d(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        android.util.SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return readSparseBooleanArray;
    }

    /* renamed from: createSparseIntArray */
    public static android.util.SparseIntArray m18274x1d493a06(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return sparseIntArray;
    }

    /* renamed from: createSparseLongArray */
    public static android.util.SparseLongArray m18275xb14d0261(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        android.util.SparseLongArray sparseLongArray = new android.util.SparseLongArray();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return sparseLongArray;
    }

    /* renamed from: createString */
    public static java.lang.String m18276x5b8a402d(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        java.lang.String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return readString;
    }

    /* renamed from: createStringArray */
    public static java.lang.String[] m18277xd171562c(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        java.lang.String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return createStringArray;
    }

    /* renamed from: createStringList */
    public static java.util.ArrayList<java.lang.String> m18278xf08866b(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return createStringArrayList;
    }

    /* renamed from: createStringSparseArray */
    public static android.util.SparseArray<java.lang.String> m18279xb7d2e5ac(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        android.util.SparseArray<java.lang.String> sparseArray = new android.util.SparseArray<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return sparseArray;
    }

    /* renamed from: createTypedArray */
    public static <T> T[] m18280x32364e2b(android.os.Parcel parcel, int i17, android.os.Parcelable.Creator<T> creator) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return tArr;
    }

    /* renamed from: createTypedList */
    public static <T> java.util.ArrayList<T> m18281xc7d5128c(android.os.Parcel parcel, int i17, android.os.Parcelable.Creator<T> creator) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        java.util.ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return createTypedArrayList;
    }

    /* renamed from: createTypedSparseArray */
    public static <T> android.util.SparseArray<T> m18282x4a17a26b(android.os.Parcel parcel, int i17, android.os.Parcelable.Creator<T> creator) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        android.util.SparseArray<T> sparseArray = new android.util.SparseArray<>();
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return sparseArray;
    }

    /* renamed from: ensureAtEnd */
    public static void m18283x91a1e0a(android.os.Parcel parcel, int i17) {
        if (parcel.dataPosition() == i17) {
            return;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.ParseException("Overread allowed size end=" + i17, parcel);
    }

    /* renamed from: getFieldId */
    public static int m18284xa778f7f(int i17) {
        return (char) i17;
    }

    /* renamed from: readBoolean */
    public static boolean m18285xd7c8d5b2(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: readBooleanObject */
    public static java.lang.Boolean m18286xc58fd791(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        zza(parcel, i17, m18302xcc49f2b7, 4);
        return java.lang.Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: readByte */
    public static byte m18287xcc4273be(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: readChar */
    public static char m18288xcc42a60c(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 4);
        return (char) parcel.readInt();
    }

    /* renamed from: readDouble */
    public static double m18289xc851b907(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 8);
        return parcel.readDouble();
    }

    /* renamed from: readDoubleObject */
    public static java.lang.Double m18290xe7142726(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        zza(parcel, i17, m18302xcc49f2b7, 8);
        return java.lang.Double.valueOf(parcel.readDouble());
    }

    /* renamed from: readFloat */
    public static float m18291xbc3e6666(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 4);
        return parcel.readFloat();
    }

    /* renamed from: readFloatObject */
    public static java.lang.Float m18292x717b1145(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        zza(parcel, i17, m18302xcc49f2b7, 4);
        return java.lang.Float.valueOf(parcel.readFloat());
    }

    /* renamed from: readHeader */
    public static int m18293xce8f1fc3(android.os.Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: readIBinder */
    public static android.os.IBinder m18294xfcf6b8fd(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return readStrongBinder;
    }

    /* renamed from: readInt */
    public static int m18295x40655679(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 4);
        return parcel.readInt();
    }

    /* renamed from: readIntegerObject */
    public static java.lang.Integer m18296x198f4427(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        zza(parcel, i17, m18302xcc49f2b7, 4);
        return java.lang.Integer.valueOf(parcel.readInt());
    }

    /* renamed from: readList */
    public static void m18297xcc46c354(android.os.Parcel parcel, int i17, java.util.List list, java.lang.ClassLoader classLoader) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
    }

    /* renamed from: readLong */
    public static long m18298xcc46d932(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 8);
        return parcel.readLong();
    }

    /* renamed from: readLongObject */
    public static java.lang.Long m18299x95d3b11(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        zza(parcel, i17, m18302xcc49f2b7, 8);
        return java.lang.Long.valueOf(parcel.readLong());
    }

    /* renamed from: readPendingIntent */
    public static android.app.PendingIntent m18300x683f791d(android.os.Parcel parcel, int i17) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (m18302xcc49f2b7 == 0) {
            return null;
        }
        android.app.PendingIntent readPendingIntentOrNullFromParcel = android.app.PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m18302xcc49f2b7);
        return readPendingIntentOrNullFromParcel;
    }

    /* renamed from: readShort */
    public static short m18301xbcf3c886(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: readSize */
    public static int m18302xcc49f2b7(android.os.Parcel parcel, int i17) {
        return (i17 & (-65536)) != -65536 ? (char) (i17 >> 16) : parcel.readInt();
    }

    /* renamed from: skipUnknownField */
    public static void m18303x9a4a15ef(android.os.Parcel parcel, int i17) {
        parcel.setDataPosition(parcel.dataPosition() + m18302xcc49f2b7(parcel, i17));
    }

    /* renamed from: validateObjectHeader */
    public static int m18304xfa7642e2(android.os.Parcel parcel) {
        int m18293xce8f1fc3 = m18293xce8f1fc3(parcel);
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, m18293xce8f1fc3);
        int m18284xa778f7f = m18284xa778f7f(m18293xce8f1fc3);
        int dataPosition = parcel.dataPosition();
        if (m18284xa778f7f != 20293) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.ParseException("Expected object header. Got 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(m18293xce8f1fc3))), parcel);
        }
        int i17 = m18302xcc49f2b7 + dataPosition;
        if (i17 >= dataPosition && i17 <= parcel.dataSize()) {
            return i17;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.ParseException("Size read is invalid start=" + dataPosition + " end=" + i17, parcel);
    }

    private static void zza(android.os.Parcel parcel, int i17, int i18, int i19) {
        if (i18 == i19) {
            return;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.ParseException("Expected size " + i19 + " got " + i18 + " (0x" + java.lang.Integer.toHexString(i18) + ")", parcel);
    }

    private static void zzb(android.os.Parcel parcel, int i17, int i18) {
        int m18302xcc49f2b7 = m18302xcc49f2b7(parcel, i17);
        if (m18302xcc49f2b7 == i18) {
            return;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.ParseException("Expected size " + i18 + " got " + m18302xcc49f2b7 + " (0x" + java.lang.Integer.toHexString(m18302xcc49f2b7) + ")", parcel);
    }
}

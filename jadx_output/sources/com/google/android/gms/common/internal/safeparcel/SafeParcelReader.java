package com.google.android.gms.common.internal.safeparcel;

/* loaded from: classes13.dex */
public class SafeParcelReader {

    /* loaded from: classes13.dex */
    public static class ParseException extends java.lang.RuntimeException {
        public ParseException(java.lang.String str, android.os.Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private SafeParcelReader() {
    }

    public static java.math.BigDecimal createBigDecimal(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + readSize);
        return new java.math.BigDecimal(new java.math.BigInteger(createByteArray), readInt);
    }

    public static java.math.BigDecimal[] createBigDecimalArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        java.math.BigDecimal[] bigDecimalArr = new java.math.BigDecimal[readInt];
        for (int i18 = 0; i18 < readInt; i18++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i18] = new java.math.BigDecimal(new java.math.BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return bigDecimalArr;
    }

    public static java.math.BigInteger createBigInteger(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + readSize);
        return new java.math.BigInteger(createByteArray);
    }

    public static java.math.BigInteger[] createBigIntegerArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        java.math.BigInteger[] bigIntegerArr = new java.math.BigInteger[readInt];
        for (int i18 = 0; i18 < readInt; i18++) {
            bigIntegerArr[i18] = new java.math.BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return bigIntegerArr;
    }

    public static boolean[] createBooleanArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createBooleanArray;
    }

    public static java.util.ArrayList<java.lang.Boolean> createBooleanList(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Boolean> arrayList = new java.util.ArrayList<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            arrayList.add(java.lang.Boolean.valueOf(parcel.readInt() != 0));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    public static android.os.Bundle createBundle(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        android.os.Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + readSize);
        return readBundle;
    }

    public static byte[] createByteArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createByteArray;
    }

    public static byte[][] createByteArrayArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i18 = 0; i18 < readInt; i18++) {
            bArr[i18] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + readSize);
        return bArr;
    }

    public static android.util.SparseArray<byte[]> createByteArraySparseArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        android.util.SparseArray<byte[]> sparseArray = new android.util.SparseArray<>(readInt);
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static char[] createCharArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        char[] createCharArray = parcel.createCharArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createCharArray;
    }

    public static double[] createDoubleArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createDoubleArray;
    }

    public static java.util.ArrayList<java.lang.Double> createDoubleList(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Double> arrayList = new java.util.ArrayList<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            arrayList.add(java.lang.Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    public static android.util.SparseArray<java.lang.Double> createDoubleSparseArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        android.util.SparseArray<java.lang.Double> sparseArray = new android.util.SparseArray<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseArray.append(parcel.readInt(), java.lang.Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static float[] createFloatArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createFloatArray;
    }

    public static java.util.ArrayList<java.lang.Float> createFloatList(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            arrayList.add(java.lang.Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    public static android.util.SparseArray<java.lang.Float> createFloatSparseArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        android.util.SparseArray<java.lang.Float> sparseArray = new android.util.SparseArray<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseArray.append(parcel.readInt(), java.lang.Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static android.os.IBinder[] createIBinderArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        android.os.IBinder[] createBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createBinderArray;
    }

    public static java.util.ArrayList<android.os.IBinder> createIBinderList(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        java.util.ArrayList<android.os.IBinder> createBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(dataPosition + readSize);
        return createBinderArrayList;
    }

    public static android.util.SparseArray<android.os.IBinder> createIBinderSparseArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        android.util.SparseArray<android.os.IBinder> sparseArray = new android.util.SparseArray<>(readInt);
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static int[] createIntArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createIntArray;
    }

    public static java.util.ArrayList<java.lang.Integer> createIntegerList(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            arrayList.add(java.lang.Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    public static long[] createLongArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createLongArray;
    }

    public static java.util.ArrayList<java.lang.Long> createLongList(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Long> arrayList = new java.util.ArrayList<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            arrayList.add(java.lang.Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    public static android.os.Parcel createParcel(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, readSize);
        parcel.setDataPosition(dataPosition + readSize);
        return obtain;
    }

    public static android.os.Parcel[] createParcelArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
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
        parcel.setDataPosition(dataPosition + readSize);
        return parcelArr;
    }

    public static java.util.ArrayList<android.os.Parcel> createParcelList(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
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
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    public static android.util.SparseArray<android.os.Parcel> createParcelSparseArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
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
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static <T extends android.os.Parcelable> T createParcelable(android.os.Parcel parcel, int i17, android.os.Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + readSize);
        return createFromParcel;
    }

    public static android.util.SparseBooleanArray createSparseBooleanArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        android.util.SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(dataPosition + readSize);
        return readSparseBooleanArray;
    }

    public static android.util.SparseIntArray createSparseIntArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseIntArray;
    }

    public static android.util.SparseLongArray createSparseLongArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        android.util.SparseLongArray sparseLongArray = new android.util.SparseLongArray();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseLongArray;
    }

    public static java.lang.String createString(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        java.lang.String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + readSize);
        return readString;
    }

    public static java.lang.String[] createStringArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        java.lang.String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createStringArray;
    }

    public static java.util.ArrayList<java.lang.String> createStringList(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + readSize);
        return createStringArrayList;
    }

    public static android.util.SparseArray<java.lang.String> createStringSparseArray(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        android.util.SparseArray<java.lang.String> sparseArray = new android.util.SparseArray<>();
        int readInt = parcel.readInt();
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static <T> T[] createTypedArray(android.os.Parcel parcel, int i17, android.os.Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + readSize);
        return tArr;
    }

    public static <T> java.util.ArrayList<T> createTypedList(android.os.Parcel parcel, int i17, android.os.Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        java.util.ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + readSize);
        return createTypedArrayList;
    }

    public static <T> android.util.SparseArray<T> createTypedSparseArray(android.os.Parcel parcel, int i17, android.os.Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        android.util.SparseArray<T> sparseArray = new android.util.SparseArray<>();
        for (int i18 = 0; i18 < readInt; i18++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static void ensureAtEnd(android.os.Parcel parcel, int i17) {
        if (parcel.dataPosition() == i17) {
            return;
        }
        throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Overread allowed size end=" + i17, parcel);
    }

    public static int getFieldId(int i17) {
        return (char) i17;
    }

    public static boolean readBoolean(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 4);
        return parcel.readInt() != 0;
    }

    public static java.lang.Boolean readBooleanObject(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i17, readSize, 4);
        return java.lang.Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte readByte(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 4);
        return (byte) parcel.readInt();
    }

    public static char readChar(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 4);
        return (char) parcel.readInt();
    }

    public static double readDouble(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 8);
        return parcel.readDouble();
    }

    public static java.lang.Double readDoubleObject(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i17, readSize, 8);
        return java.lang.Double.valueOf(parcel.readDouble());
    }

    public static float readFloat(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 4);
        return parcel.readFloat();
    }

    public static java.lang.Float readFloatObject(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i17, readSize, 4);
        return java.lang.Float.valueOf(parcel.readFloat());
    }

    public static int readHeader(android.os.Parcel parcel) {
        return parcel.readInt();
    }

    public static android.os.IBinder readIBinder(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + readSize);
        return readStrongBinder;
    }

    public static int readInt(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 4);
        return parcel.readInt();
    }

    public static java.lang.Integer readIntegerObject(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i17, readSize, 4);
        return java.lang.Integer.valueOf(parcel.readInt());
    }

    public static void readList(android.os.Parcel parcel, int i17, java.util.List list, java.lang.ClassLoader classLoader) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + readSize);
    }

    public static long readLong(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 8);
        return parcel.readLong();
    }

    public static java.lang.Long readLongObject(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i17, readSize, 8);
        return java.lang.Long.valueOf(parcel.readLong());
    }

    public static android.app.PendingIntent readPendingIntent(android.os.Parcel parcel, int i17) {
        int readSize = readSize(parcel, i17);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        android.app.PendingIntent readPendingIntentOrNullFromParcel = android.app.PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(dataPosition + readSize);
        return readPendingIntentOrNullFromParcel;
    }

    public static short readShort(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17, 4);
        return (short) parcel.readInt();
    }

    public static int readSize(android.os.Parcel parcel, int i17) {
        return (i17 & (-65536)) != -65536 ? (char) (i17 >> 16) : parcel.readInt();
    }

    public static void skipUnknownField(android.os.Parcel parcel, int i17) {
        parcel.setDataPosition(parcel.dataPosition() + readSize(parcel, i17));
    }

    public static int validateObjectHeader(android.os.Parcel parcel) {
        int readHeader = readHeader(parcel);
        int readSize = readSize(parcel, readHeader);
        int fieldId = getFieldId(readHeader);
        int dataPosition = parcel.dataPosition();
        if (fieldId != 20293) {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Expected object header. Got 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(readHeader))), parcel);
        }
        int i17 = readSize + dataPosition;
        if (i17 >= dataPosition && i17 <= parcel.dataSize()) {
            return i17;
        }
        throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Size read is invalid start=" + dataPosition + " end=" + i17, parcel);
    }

    private static void zza(android.os.Parcel parcel, int i17, int i18, int i19) {
        if (i18 == i19) {
            return;
        }
        throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Expected size " + i19 + " got " + i18 + " (0x" + java.lang.Integer.toHexString(i18) + ")", parcel);
    }

    private static void zzb(android.os.Parcel parcel, int i17, int i18) {
        int readSize = readSize(parcel, i17);
        if (readSize == i18) {
            return;
        }
        throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Expected size " + i18 + " got " + readSize + " (0x" + java.lang.Integer.toHexString(readSize) + ")", parcel);
    }
}

package com.google.android.gms.common.internal.safeparcel;

/* loaded from: classes13.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(android.os.Parcel parcel) {
        return zza(parcel, 20293);
    }

    public static void finishObjectHeader(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17);
    }

    public static void writeBigDecimal(android.os.Parcel parcel, int i17, java.math.BigDecimal bigDecimal, boolean z17) {
        if (bigDecimal == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            zzb(parcel, zza);
        }
    }

    public static void writeBigDecimalArray(android.os.Parcel parcel, int i17, java.math.BigDecimal[] bigDecimalArr, boolean z17) {
        if (bigDecimalArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i18 = 0; i18 < length; i18++) {
            parcel.writeByteArray(bigDecimalArr[i18].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i18].scale());
        }
        zzb(parcel, zza);
    }

    public static void writeBigInteger(android.os.Parcel parcel, int i17, java.math.BigInteger bigInteger, boolean z17) {
        if (bigInteger == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeByteArray(bigInteger.toByteArray());
            zzb(parcel, zza);
        }
    }

    public static void writeBigIntegerArray(android.os.Parcel parcel, int i17, java.math.BigInteger[] bigIntegerArr, boolean z17) {
        if (bigIntegerArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        parcel.writeInt(bigIntegerArr.length);
        for (java.math.BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzb(parcel, zza);
    }

    public static void writeBoolean(android.os.Parcel parcel, int i17, boolean z17) {
        zzc(parcel, i17, 4);
        parcel.writeInt(z17 ? 1 : 0);
    }

    public static void writeBooleanArray(android.os.Parcel parcel, int i17, boolean[] zArr, boolean z17) {
        if (zArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeBooleanArray(zArr);
            zzb(parcel, zza);
        }
    }

    public static void writeBooleanList(android.os.Parcel parcel, int i17, java.util.List<java.lang.Boolean> list, boolean z17) {
        if (list == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeInt(list.get(i18).booleanValue() ? 1 : 0);
        }
        zzb(parcel, zza);
    }

    public static void writeBooleanObject(android.os.Parcel parcel, int i17, java.lang.Boolean bool, boolean z17) {
        if (bool != null) {
            zzc(parcel, i17, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z17) {
            zzc(parcel, i17, 0);
        }
    }

    public static void writeBundle(android.os.Parcel parcel, int i17, android.os.Bundle bundle, boolean z17) {
        if (bundle == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeBundle(bundle);
            zzb(parcel, zza);
        }
    }

    public static void writeByte(android.os.Parcel parcel, int i17, byte b17) {
        zzc(parcel, i17, 4);
        parcel.writeInt(b17);
    }

    public static void writeByteArray(android.os.Parcel parcel, int i17, byte[] bArr, boolean z17) {
        if (bArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeByteArray(bArr);
            zzb(parcel, zza);
        }
    }

    public static void writeByteArrayArray(android.os.Parcel parcel, int i17, byte[][] bArr, boolean z17) {
        if (bArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzb(parcel, zza);
    }

    public static void writeByteArraySparseArray(android.os.Parcel parcel, int i17, android.util.SparseArray<byte[]> sparseArray, boolean z17) {
        if (sparseArray == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeInt(sparseArray.keyAt(i18));
            parcel.writeByteArray(sparseArray.valueAt(i18));
        }
        zzb(parcel, zza);
    }

    public static void writeChar(android.os.Parcel parcel, int i17, char c17) {
        zzc(parcel, i17, 4);
        parcel.writeInt(c17);
    }

    public static void writeCharArray(android.os.Parcel parcel, int i17, char[] cArr, boolean z17) {
        if (cArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeCharArray(cArr);
            zzb(parcel, zza);
        }
    }

    public static void writeDouble(android.os.Parcel parcel, int i17, double d17) {
        zzc(parcel, i17, 8);
        parcel.writeDouble(d17);
    }

    public static void writeDoubleArray(android.os.Parcel parcel, int i17, double[] dArr, boolean z17) {
        if (dArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeDoubleArray(dArr);
            zzb(parcel, zza);
        }
    }

    public static void writeDoubleList(android.os.Parcel parcel, int i17, java.util.List<java.lang.Double> list, boolean z17) {
        if (list == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeDouble(list.get(i18).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeDoubleObject(android.os.Parcel parcel, int i17, java.lang.Double d17, boolean z17) {
        if (d17 != null) {
            zzc(parcel, i17, 8);
            parcel.writeDouble(d17.doubleValue());
        } else if (z17) {
            zzc(parcel, i17, 0);
        }
    }

    public static void writeDoubleSparseArray(android.os.Parcel parcel, int i17, android.util.SparseArray<java.lang.Double> sparseArray, boolean z17) {
        if (sparseArray == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeInt(sparseArray.keyAt(i18));
            parcel.writeDouble(sparseArray.valueAt(i18).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloat(android.os.Parcel parcel, int i17, float f17) {
        zzc(parcel, i17, 4);
        parcel.writeFloat(f17);
    }

    public static void writeFloatArray(android.os.Parcel parcel, int i17, float[] fArr, boolean z17) {
        if (fArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeFloatArray(fArr);
            zzb(parcel, zza);
        }
    }

    public static void writeFloatList(android.os.Parcel parcel, int i17, java.util.List<java.lang.Float> list, boolean z17) {
        if (list == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeFloat(list.get(i18).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloatObject(android.os.Parcel parcel, int i17, java.lang.Float f17, boolean z17) {
        if (f17 != null) {
            zzc(parcel, i17, 4);
            parcel.writeFloat(f17.floatValue());
        } else if (z17) {
            zzc(parcel, i17, 0);
        }
    }

    public static void writeFloatSparseArray(android.os.Parcel parcel, int i17, android.util.SparseArray<java.lang.Float> sparseArray, boolean z17) {
        if (sparseArray == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeInt(sparseArray.keyAt(i18));
            parcel.writeFloat(sparseArray.valueAt(i18).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIBinder(android.os.Parcel parcel, int i17, android.os.IBinder iBinder, boolean z17) {
        if (iBinder == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeStrongBinder(iBinder);
            zzb(parcel, zza);
        }
    }

    public static void writeIBinderArray(android.os.Parcel parcel, int i17, android.os.IBinder[] iBinderArr, boolean z17) {
        if (iBinderArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeBinderArray(iBinderArr);
            zzb(parcel, zza);
        }
    }

    public static void writeIBinderList(android.os.Parcel parcel, int i17, java.util.List<android.os.IBinder> list, boolean z17) {
        if (list == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeBinderList(list);
            zzb(parcel, zza);
        }
    }

    public static void writeIBinderSparseArray(android.os.Parcel parcel, int i17, android.util.SparseArray<android.os.IBinder> sparseArray, boolean z17) {
        if (sparseArray == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeInt(sparseArray.keyAt(i18));
            parcel.writeStrongBinder(sparseArray.valueAt(i18));
        }
        zzb(parcel, zza);
    }

    public static void writeInt(android.os.Parcel parcel, int i17, int i18) {
        zzc(parcel, i17, 4);
        parcel.writeInt(i18);
    }

    public static void writeIntArray(android.os.Parcel parcel, int i17, int[] iArr, boolean z17) {
        if (iArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeIntArray(iArr);
            zzb(parcel, zza);
        }
    }

    public static void writeIntegerList(android.os.Parcel parcel, int i17, java.util.List<java.lang.Integer> list, boolean z17) {
        if (list == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeInt(list.get(i18).intValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIntegerObject(android.os.Parcel parcel, int i17, java.lang.Integer num, boolean z17) {
        if (num != null) {
            zzc(parcel, i17, 4);
            parcel.writeInt(num.intValue());
        } else if (z17) {
            zzc(parcel, i17, 0);
        }
    }

    public static void writeList(android.os.Parcel parcel, int i17, java.util.List list, boolean z17) {
        if (list == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeList(list);
            zzb(parcel, zza);
        }
    }

    public static void writeLong(android.os.Parcel parcel, int i17, long j17) {
        zzc(parcel, i17, 8);
        parcel.writeLong(j17);
    }

    public static void writeLongArray(android.os.Parcel parcel, int i17, long[] jArr, boolean z17) {
        if (jArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeLongArray(jArr);
            zzb(parcel, zza);
        }
    }

    public static void writeLongList(android.os.Parcel parcel, int i17, java.util.List<java.lang.Long> list, boolean z17) {
        if (list == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeLong(list.get(i18).longValue());
        }
        zzb(parcel, zza);
    }

    public static void writeLongObject(android.os.Parcel parcel, int i17, java.lang.Long l17, boolean z17) {
        if (l17 != null) {
            zzc(parcel, i17, 8);
            parcel.writeLong(l17.longValue());
        } else if (z17) {
            zzc(parcel, i17, 0);
        }
    }

    public static void writeParcel(android.os.Parcel parcel, int i17, android.os.Parcel parcel2, boolean z17) {
        if (parcel2 == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            zzb(parcel, zza);
        }
    }

    public static void writeParcelArray(android.os.Parcel parcel, int i17, android.os.Parcel[] parcelArr, boolean z17) {
        if (parcelArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        parcel.writeInt(parcelArr.length);
        for (android.os.Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelList(android.os.Parcel parcel, int i17, java.util.List<android.os.Parcel> list, boolean z17) {
        if (list == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            android.os.Parcel parcel2 = list.get(i18);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelSparseArray(android.os.Parcel parcel, int i17, android.util.SparseArray<android.os.Parcel> sparseArray, boolean z17) {
        if (sparseArray == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeInt(sparseArray.keyAt(i18));
            android.os.Parcel valueAt = sparseArray.valueAt(i18);
            if (valueAt != null) {
                parcel.writeInt(valueAt.dataSize());
                parcel.appendFrom(valueAt, 0, valueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelable(android.os.Parcel parcel, int i17, android.os.Parcelable parcelable, int i18, boolean z17) {
        if (parcelable == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcelable.writeToParcel(parcel, i18);
            zzb(parcel, zza);
        }
    }

    public static void writePendingIntent(android.os.Parcel parcel, int i17, android.app.PendingIntent pendingIntent, boolean z17) {
        if (pendingIntent == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            android.app.PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            zzb(parcel, zza);
        }
    }

    public static void writeShort(android.os.Parcel parcel, int i17, short s17) {
        zzc(parcel, i17, 4);
        parcel.writeInt(s17);
    }

    public static void writeSparseBooleanArray(android.os.Parcel parcel, int i17, android.util.SparseBooleanArray sparseBooleanArray, boolean z17) {
        if (sparseBooleanArray == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            zzb(parcel, zza);
        }
    }

    public static void writeSparseIntArray(android.os.Parcel parcel, int i17, android.util.SparseIntArray sparseIntArray, boolean z17) {
        if (sparseIntArray == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeInt(sparseIntArray.keyAt(i18));
            parcel.writeInt(sparseIntArray.valueAt(i18));
        }
        zzb(parcel, zza);
    }

    public static void writeSparseLongArray(android.os.Parcel parcel, int i17, android.util.SparseLongArray sparseLongArray, boolean z17) {
        if (sparseLongArray == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeInt(sparseLongArray.keyAt(i18));
            parcel.writeLong(sparseLongArray.valueAt(i18));
        }
        zzb(parcel, zza);
    }

    public static void writeString(android.os.Parcel parcel, int i17, java.lang.String str, boolean z17) {
        if (str == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeString(str);
            zzb(parcel, zza);
        }
    }

    public static void writeStringArray(android.os.Parcel parcel, int i17, java.lang.String[] strArr, boolean z17) {
        if (strArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeStringArray(strArr);
            zzb(parcel, zza);
        }
    }

    public static void writeStringList(android.os.Parcel parcel, int i17, java.util.List<java.lang.String> list, boolean z17) {
        if (list == null) {
            if (z17) {
                zzc(parcel, i17, 0);
            }
        } else {
            int zza = zza(parcel, i17);
            parcel.writeStringList(list);
            zzb(parcel, zza);
        }
    }

    public static void writeStringSparseArray(android.os.Parcel parcel, int i17, android.util.SparseArray<java.lang.String> sparseArray, boolean z17) {
        if (sparseArray == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeInt(sparseArray.keyAt(i18));
            parcel.writeString(sparseArray.valueAt(i18));
        }
        zzb(parcel, zza);
    }

    public static <T extends android.os.Parcelable> void writeTypedArray(android.os.Parcel parcel, int i17, T[] tArr, int i18, boolean z17) {
        if (tArr == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        parcel.writeInt(tArr.length);
        for (T t17 : tArr) {
            if (t17 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t17, i18);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends android.os.Parcelable> void writeTypedList(android.os.Parcel parcel, int i17, java.util.List<T> list, boolean z17) {
        if (list == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            T t17 = list.get(i18);
            if (t17 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t17, 0);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends android.os.Parcelable> void writeTypedSparseArray(android.os.Parcel parcel, int i17, android.util.SparseArray<T> sparseArray, boolean z17) {
        if (sparseArray == null) {
            if (z17) {
                zzc(parcel, i17, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i17);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeInt(sparseArray.keyAt(i18));
            T valueAt = sparseArray.valueAt(i18);
            if (valueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, valueAt, 0);
            }
        }
        zzb(parcel, zza);
    }

    private static int zza(android.os.Parcel parcel, int i17) {
        parcel.writeInt(i17 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzb(android.os.Parcel parcel, int i17) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i17 - 4);
        parcel.writeInt(dataPosition - i17);
        parcel.setDataPosition(dataPosition);
    }

    private static void zzc(android.os.Parcel parcel, int i17, int i18) {
        parcel.writeInt(i17 | (i18 << 16));
    }

    private static void zzd(android.os.Parcel parcel, android.os.Parcelable parcelable, int i17) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i17);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}

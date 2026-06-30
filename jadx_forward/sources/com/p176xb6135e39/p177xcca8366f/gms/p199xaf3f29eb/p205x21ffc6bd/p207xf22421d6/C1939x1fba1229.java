package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6;

/* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelWriter */
/* loaded from: classes13.dex */
public class C1939x1fba1229 {
    private C1939x1fba1229() {
    }

    /* renamed from: beginObjectHeader */
    public static int m18305xd0e7ddf5(android.os.Parcel parcel) {
        return zza(parcel, 20293);
    }

    /* renamed from: finishObjectHeader */
    public static void m18306x351c62df(android.os.Parcel parcel, int i17) {
        zzb(parcel, i17);
    }

    /* renamed from: writeBigDecimal */
    public static void m18307xbdf8b770(android.os.Parcel parcel, int i17, java.math.BigDecimal bigDecimal, boolean z17) {
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

    /* renamed from: writeBigDecimalArray */
    public static void m18308x46c9f0c9(android.os.Parcel parcel, int i17, java.math.BigDecimal[] bigDecimalArr, boolean z17) {
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

    /* renamed from: writeBigInteger */
    public static void m18309xd6c1255d(android.os.Parcel parcel, int i17, java.math.BigInteger bigInteger, boolean z17) {
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

    /* renamed from: writeBigIntegerArray */
    public static void m18310xffaa2efc(android.os.Parcel parcel, int i17, java.math.BigInteger[] bigIntegerArr, boolean z17) {
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

    /* renamed from: writeBoolean */
    public static void m18311xa577e349(android.os.Parcel parcel, int i17, boolean z17) {
        zzc(parcel, i17, 4);
        parcel.writeInt(z17 ? 1 : 0);
    }

    /* renamed from: writeBooleanArray */
    public static void m18312x9594490(android.os.Parcel parcel, int i17, boolean[] zArr, boolean z17) {
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

    /* renamed from: writeBooleanList */
    public static void m18313x94f73b87(android.os.Parcel parcel, int i17, java.util.List<java.lang.Boolean> list, boolean z17) {
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

    /* renamed from: writeBooleanObject */
    public static void m18314x38ce17e8(android.os.Parcel parcel, int i17, java.lang.Boolean bool, boolean z17) {
        if (bool != null) {
            zzc(parcel, i17, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z17) {
            zzc(parcel, i17, 0);
        }
    }

    /* renamed from: writeBundle */
    public static void m18315x3736d141(android.os.Parcel parcel, int i17, android.os.Bundle bundle, boolean z17) {
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

    /* renamed from: writeByte */
    public static void m18316xac252587(android.os.Parcel parcel, int i17, byte b17) {
        zzc(parcel, i17, 4);
        parcel.writeInt(b17);
    }

    /* renamed from: writeByteArray */
    public static void m18317x3071b912(android.os.Parcel parcel, int i17, byte[] bArr, boolean z17) {
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

    /* renamed from: writeByteArrayArray */
    public static void m18318x413aa467(android.os.Parcel parcel, int i17, byte[][] bArr, boolean z17) {
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

    /* renamed from: writeByteArraySparseArray */
    public static void m18319xc3f95ba7(android.os.Parcel parcel, int i17, android.util.SparseArray<byte[]> sparseArray, boolean z17) {
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

    /* renamed from: writeChar */
    public static void m18320xac2557d5(android.os.Parcel parcel, int i17, char c17) {
        zzc(parcel, i17, 4);
        parcel.writeInt(c17);
    }

    /* renamed from: writeCharArray */
    public static void m18321x7dac784(android.os.Parcel parcel, int i17, char[] cArr, boolean z17) {
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

    /* renamed from: writeDouble */
    public static void m18322x3a4f1c90(android.os.Parcel parcel, int i17, double d17) {
        zzc(parcel, i17, 8);
        parcel.writeDouble(d17);
    }

    /* renamed from: writeDoubleArray */
    public static void m18323xa045bfa9(android.os.Parcel parcel, int i17, double[] dArr, boolean z17) {
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

    /* renamed from: writeDoubleList */
    public static void m18324xd72794e(android.os.Parcel parcel, int i17, java.util.List<java.lang.Double> list, boolean z17) {
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

    /* renamed from: writeDoubleObject */
    public static void m18325x7f70ffef(android.os.Parcel parcel, int i17, java.lang.Double d17, boolean z17) {
        if (d17 != null) {
            zzc(parcel, i17, 8);
            parcel.writeDouble(d17.doubleValue());
        } else if (z17) {
            zzc(parcel, i17, 0);
        }
    }

    /* renamed from: writeDoubleSparseArray */
    public static void m18326x5a5f7d69(android.os.Parcel parcel, int i17, android.util.SparseArray<java.lang.Double> sparseArray, boolean z17) {
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

    /* renamed from: writeFloat */
    public static void m18327xd8b1edbd(android.os.Parcel parcel, int i17, float f17) {
        zzc(parcel, i17, 4);
        parcel.writeFloat(f17);
    }

    /* renamed from: writeFloatArray */
    public static void m18328xa0c7a29c(android.os.Parcel parcel, int i17, float[] fArr, boolean z17) {
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

    /* renamed from: writeFloatList */
    public static void m18329x2e7eebfb(android.os.Parcel parcel, int i17, java.util.List<java.lang.Float> list, boolean z17) {
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

    /* renamed from: writeFloatObject */
    public static void m18330x8f2b7b5c(android.os.Parcel parcel, int i17, java.lang.Float f17, boolean z17) {
        if (f17 != null) {
            zzc(parcel, i17, 4);
            parcel.writeFloat(f17.floatValue());
        } else if (z17) {
            zzc(parcel, i17, 0);
        }
    }

    /* renamed from: writeFloatSparseArray */
    public static void m18331xacfa1e1c(android.os.Parcel parcel, int i17, android.util.SparseArray<java.lang.Float> sparseArray, boolean z17) {
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

    /* renamed from: writeIBinder */
    public static void m18332xcaa5c694(android.os.Parcel parcel, int i17, android.os.IBinder iBinder, boolean z17) {
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

    /* renamed from: writeIBinderArray */
    public static void m18333xf45cb825(android.os.Parcel parcel, int i17, android.os.IBinder[] iBinderArr, boolean z17) {
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

    /* renamed from: writeIBinderList */
    public static void m18334xde9c8152(android.os.Parcel parcel, int i17, java.util.List<android.os.IBinder> list, boolean z17) {
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

    /* renamed from: writeIBinderSparseArray */
    public static void m18335x6ee128e5(android.os.Parcel parcel, int i17, android.util.SparseArray<android.os.IBinder> sparseArray, boolean z17) {
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

    /* renamed from: writeInt */
    public static void m18336x91f0c790(android.os.Parcel parcel, int i17, int i18) {
        zzc(parcel, i17, 4);
        parcel.writeInt(i18);
    }

    /* renamed from: writeIntArray */
    public static void m18337xb1f6f4a9(android.os.Parcel parcel, int i17, int[] iArr, boolean z17) {
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

    /* renamed from: writeIntegerList */
    public static void m18338x31f4d59d(android.os.Parcel parcel, int i17, java.util.List<java.lang.Integer> list, boolean z17) {
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

    /* renamed from: writeIntegerObject */
    public static void m18339x8ccd847e(android.os.Parcel parcel, int i17, java.lang.Integer num, boolean z17) {
        if (num != null) {
            zzc(parcel, i17, 4);
            parcel.writeInt(num.intValue());
        } else if (z17) {
            zzc(parcel, i17, 0);
        }
    }

    /* renamed from: writeList */
    public static void m18340xac29751d(android.os.Parcel parcel, int i17, java.util.List list, boolean z17) {
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

    /* renamed from: writeLong */
    public static void m18341xac298afb(android.os.Parcel parcel, int i17, long j17) {
        zzc(parcel, i17, 8);
        parcel.writeLong(j17);
    }

    /* renamed from: writeLongArray */
    public static void m18342xb2569c1e(android.os.Parcel parcel, int i17, long[] jArr, boolean z17) {
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

    /* renamed from: writeLongList */
    public static void m18343x1649ba39(android.os.Parcel parcel, int i17, java.util.List<java.lang.Long> list, boolean z17) {
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

    /* renamed from: writeLongObject */
    public static void m18344xaf7bb21a(android.os.Parcel parcel, int i17, java.lang.Long l17, boolean z17) {
        if (l17 != null) {
            zzc(parcel, i17, 8);
            parcel.writeLong(l17.longValue());
        } else if (z17) {
            zzc(parcel, i17, 0);
        }
    }

    /* renamed from: writeParcel */
    public static void m18345x4e02a0c8(android.os.Parcel parcel, int i17, android.os.Parcel parcel2, boolean z17) {
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

    /* renamed from: writeParcelArray */
    public static void m18346x83b41e71(android.os.Parcel parcel, int i17, android.os.Parcel[] parcelArr, boolean z17) {
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

    /* renamed from: writeParcelList */
    public static void m18347x56d92186(android.os.Parcel parcel, int i17, java.util.List<android.os.Parcel> list, boolean z17) {
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

    /* renamed from: writeParcelSparseArray */
    public static void m18348x50eda631(android.os.Parcel parcel, int i17, android.util.SparseArray<android.os.Parcel> sparseArray, boolean z17) {
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

    /* renamed from: writeParcelable */
    public static void m18349x56e29222(android.os.Parcel parcel, int i17, android.os.Parcelable parcelable, int i18, boolean z17) {
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

    /* renamed from: writePendingIntent */
    public static void m18350xdb7db974(android.os.Parcel parcel, int i17, android.app.PendingIntent pendingIntent, boolean z17) {
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

    /* renamed from: writeShort */
    public static void m18351xd9674fdd(android.os.Parcel parcel, int i17, short s17) {
        zzc(parcel, i17, 4);
        parcel.writeInt(s17);
    }

    /* renamed from: writeSparseBooleanArray */
    public static void m18352x850f7790(android.os.Parcel parcel, int i17, android.util.SparseBooleanArray sparseBooleanArray, boolean z17) {
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

    /* renamed from: writeSparseIntArray */
    public static void m18353xebea7a9(android.os.Parcel parcel, int i17, android.util.SparseIntArray sparseIntArray, boolean z17) {
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

    /* renamed from: writeSparseLongArray */
    public static void m18354xee85491e(android.os.Parcel parcel, int i17, android.util.SparseLongArray sparseLongArray, boolean z17) {
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

    /* renamed from: writeString */
    public static void m18355x542d00d0(android.os.Parcel parcel, int i17, java.lang.String str, boolean z17) {
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

    /* renamed from: writeStringArray */
    public static void m18356xa6ac8369(android.os.Parcel parcel, int i17, java.lang.String[] strArr, boolean z17) {
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

    /* renamed from: writeStringList */
    public static void m18357x81443d8e(android.os.Parcel parcel, int i17, java.util.List<java.lang.String> list, boolean z17) {
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

    /* renamed from: writeStringSparseArray */
    public static void m18358x88147129(android.os.Parcel parcel, int i17, android.util.SparseArray<java.lang.String> sparseArray, boolean z17) {
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

    /* renamed from: writeTypedArray */
    public static <T extends android.os.Parcelable> void m18359xa472054e(android.os.Parcel parcel, int i17, T[] tArr, int i18, boolean z17) {
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

    /* renamed from: writeTypedList */
    public static <T extends android.os.Parcelable> void m18360xcb846b09(android.os.Parcel parcel, int i17, java.util.List<T> list, boolean z17) {
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

    /* renamed from: writeTypedSparseArray */
    public static <T extends android.os.Parcelable> void m18361xb3e8334e(android.os.Parcel parcel, int i17, android.util.SparseArray<T> sparseArray, boolean z17) {
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

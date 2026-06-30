package com.google.android.gms.common.util;

/* loaded from: classes12.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean isEmpty(java.util.Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf() {
        return java.util.Collections.emptyList();
    }

    public static <K, V> java.util.Map<K, V> mapOf(K k17, V v17, K k18, V v18, K k19, V v19) {
        java.util.Map zza = zza(3, false);
        zza.put(k17, v17);
        zza.put(k18, v18);
        zza.put(k19, v19);
        return java.util.Collections.unmodifiableMap(zza);
    }

    public static <K, V> java.util.Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new java.lang.IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return java.util.Collections.emptyMap();
        }
        if (length == 1) {
            return java.util.Collections.singletonMap(kArr[0], vArr[0]);
        }
        java.util.Map zza = zza(length, false);
        for (int i17 = 0; i17 < kArr.length; i17++) {
            zza.put(kArr[i17], vArr[i17]);
        }
        return java.util.Collections.unmodifiableMap(zza);
    }

    public static <T> java.util.Set<T> mutableSetOfWithSize(int i17) {
        return i17 == 0 ? new x.d(0) : zzb(i17, true);
    }

    @java.lang.Deprecated
    public static <T> java.util.Set<T> setOf(T t17, T t18, T t19) {
        java.util.Set zzb = zzb(3, false);
        zzb.add(t17);
        zzb.add(t18);
        zzb.add(t19);
        return java.util.Collections.unmodifiableSet(zzb);
    }

    private static java.util.Map zza(int i17, boolean z17) {
        return i17 <= 256 ? new x.b(i17) : new java.util.HashMap(i17, 1.0f);
    }

    private static java.util.Set zzb(int i17, boolean z17) {
        if (i17 <= (true != z17 ? 256 : 128)) {
            return new x.d(i17);
        }
        return new java.util.HashSet(i17, true != z17 ? 1.0f : 0.75f);
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf(T t17) {
        return java.util.Collections.singletonList(t17);
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return java.util.Collections.emptyList();
        }
        if (length != 1) {
            return java.util.Collections.unmodifiableList(java.util.Arrays.asList(tArr));
        }
        return java.util.Collections.singletonList(tArr[0]);
    }

    public static <K, V> java.util.Map<K, V> mapOf(K k17, V v17, K k18, V v18, K k19, V v19, K k27, V v27, K k28, V v28, K k29, V v29) {
        java.util.Map zza = zza(6, false);
        zza.put(k17, v17);
        zza.put(k18, v18);
        zza.put(k19, v19);
        zza.put(k27, v27);
        zza.put(k28, v28);
        zza.put(k29, v29);
        return java.util.Collections.unmodifiableMap(zza);
    }

    @java.lang.Deprecated
    public static <T> java.util.Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return java.util.Collections.emptySet();
        }
        if (length == 1) {
            return java.util.Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t17 = tArr[0];
            T t18 = tArr[1];
            java.util.Set zzb = zzb(2, false);
            zzb.add(t17);
            zzb.add(t18);
            return java.util.Collections.unmodifiableSet(zzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            java.util.Set zzb2 = zzb(length, false);
            java.util.Collections.addAll(zzb2, tArr);
            return java.util.Collections.unmodifiableSet(zzb2);
        }
        T t19 = tArr[0];
        T t27 = tArr[1];
        T t28 = tArr[2];
        T t29 = tArr[3];
        java.util.Set zzb3 = zzb(4, false);
        zzb3.add(t19);
        zzb3.add(t27);
        zzb3.add(t28);
        zzb3.add(t29);
        return java.util.Collections.unmodifiableSet(zzb3);
    }
}

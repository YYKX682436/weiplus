package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.CollectionUtil */
/* loaded from: classes5.dex */
public final class C29291xd6d05fe0 {
    private C29291xd6d05fe0() {
    }

    /* renamed from: booleanListToBooleanArray */
    public static boolean[] m152284xb5ba6fb2(java.util.List<java.lang.Boolean> list) {
        boolean[] zArr = new boolean[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            zArr[i17] = list.get(i17).booleanValue();
        }
        return zArr;
    }

    /* renamed from: integerCollectionToIntArray */
    public static int[] m152285xbafa56e1(java.util.Collection<java.lang.Integer> collection) {
        int[] iArr = new int[collection.size()];
        java.util.Iterator<java.lang.Integer> it = collection.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            iArr[i17] = it.next().intValue();
            i17++;
        }
        return iArr;
    }

    /* renamed from: longListToLongArray */
    public static long[] m152286xa0964768(java.util.List<java.lang.Long> list) {
        long[] jArr = new long[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            jArr[i17] = list.get(i17).longValue();
        }
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.SafeVarargs
    /* renamed from: newHashMap */
    public static <K, V> java.util.HashMap<K, V> m152287x4d0603ae(android.util.Pair<? extends K, ? extends V>... pairArr) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.e.AnonymousClass2 anonymousClass2 = (java.util.HashMap<K, V>) new java.util.HashMap();
        for (android.util.Pair<? extends K, ? extends V> pair : pairArr) {
            anonymousClass2.put(pair.first, pair.second);
        }
        return anonymousClass2;
    }

    @java.lang.SafeVarargs
    /* renamed from: newHashSet */
    public static <E> java.util.HashSet<E> m152288x4d061ab4(E... eArr) {
        java.util.HashSet<E> hashSet = new java.util.HashSet<>(eArr.length);
        java.util.Collections.addAll(hashSet, eArr);
        return hashSet;
    }

    /* renamed from: strengthen */
    public static <T> java.util.List<T> m152289xceb250aa(java.util.Collection<java.lang.ref.WeakReference<T>> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        java.util.Iterator<java.lang.ref.WeakReference<T>> it = collection.iterator();
        while (it.hasNext()) {
            T t17 = it.next().get();
            if (t17 == null) {
                it.remove();
            } else {
                arrayList.add(t17);
            }
        }
        return arrayList;
    }
}

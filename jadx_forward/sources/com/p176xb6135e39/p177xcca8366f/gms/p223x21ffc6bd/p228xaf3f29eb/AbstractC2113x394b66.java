package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb;

@org.jspecify.nullness.NullMarked
/* renamed from: com.google.android.gms.internal.common.zzag */
/* loaded from: classes13.dex */
public abstract class AbstractC2113x394b66 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62 implements java.util.List, java.util.RandomAccess {
    private static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2117x394b6a zza = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2111x394b64(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2115x394b68.zza, 0);

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 zzi(java.lang.Object[] objArr, int i17) {
        return i17 == 0 ? com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2115x394b68.zza : new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2115x394b68(objArr, i17);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 zzj(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            return zzk((java.util.Collection) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2115x394b68.zza;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return zzm(next);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2110x394b63 c2110x394b63 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2110x394b63(4);
        c2110x394b63.zzb(next);
        c2110x394b63.zzc(it);
        c2110x394b63.zzc = true;
        return zzi(c2110x394b63.zza, c2110x394b63.zzb);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 zzk(java.util.Collection collection) {
        if (!(collection instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62)) {
            java.lang.Object[] array = collection.toArray();
            int length = array.length;
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2114x394b67.zza(array, length);
            return zzi(array, length);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 zzd = ((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62) collection).zzd();
        if (!zzd.zzf()) {
            return zzd;
        }
        java.lang.Object[] array2 = zzd.toArray();
        return zzi(array2, array2.length);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 zzl() {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2115x394b68.zza;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 zzm(java.lang.Object obj) {
        java.lang.Object[] objArr = {obj};
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2114x394b67.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 zzn(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr = {obj, obj2};
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2114x394b67.zza(objArr, 2);
        return zzi(objArr, 2);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int i17, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (int i17 = 0; i17 < size; i17++) {
                        if (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzr.zza(get(i17), list.get(i17))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = iterator();
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it6.hasNext() || !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzr.zza(it.next(), it6.next())) {
                            break;
                        }
                    } else if (!it6.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i17 = 1;
        for (int i18 = 0; i18 < size; i18++) {
            i17 = (i17 * 31) + get(i18).hashCode();
        }
        return i17;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i17 = 0; i17 < size; i17++) {
            if (obj.equals(get(i17))) {
                return i17;
            }
        }
        return -1;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object remove(int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object set(int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62
    public int zza(java.lang.Object[] objArr, int i17) {
        int size = size();
        for (int i18 = 0; i18 < size; i18++) {
            objArr[i18] = get(i18);
        }
        return size;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62
    @java.lang.Deprecated
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 zzd() {
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62
    /* renamed from: zze */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2116x394b69 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 subList(int i17, int i18) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzs.zzc(i17, i18, size());
        int i19 = i18 - i17;
        return i19 == size() ? this : i19 == 0 ? com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2115x394b68.zza : new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2112x394b65(this, i17, i19);
    }

    @Override // java.util.List
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2117x394b6a listIterator(int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzs.zzb(i17, size(), ya.b.f77479x42930b2);
        return isEmpty() ? zza : new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2111x394b64(this, i17);
    }
}

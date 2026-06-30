package com.google.android.gms.internal.common;

@org.jspecify.nullness.NullMarked
/* loaded from: classes13.dex */
public abstract class zzag extends com.google.android.gms.internal.common.zzac implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.common.zzak zza = new com.google.android.gms.internal.common.zzae(com.google.android.gms.internal.common.zzai.zza, 0);

    public static com.google.android.gms.internal.common.zzag zzi(java.lang.Object[] objArr, int i17) {
        return i17 == 0 ? com.google.android.gms.internal.common.zzai.zza : new com.google.android.gms.internal.common.zzai(objArr, i17);
    }

    public static com.google.android.gms.internal.common.zzag zzj(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            return zzk((java.util.Collection) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return com.google.android.gms.internal.common.zzai.zza;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return zzm(next);
        }
        com.google.android.gms.internal.common.zzad zzadVar = new com.google.android.gms.internal.common.zzad(4);
        zzadVar.zzb(next);
        zzadVar.zzc(it);
        zzadVar.zzc = true;
        return zzi(zzadVar.zza, zzadVar.zzb);
    }

    public static com.google.android.gms.internal.common.zzag zzk(java.util.Collection collection) {
        if (!(collection instanceof com.google.android.gms.internal.common.zzac)) {
            java.lang.Object[] array = collection.toArray();
            int length = array.length;
            com.google.android.gms.internal.common.zzah.zza(array, length);
            return zzi(array, length);
        }
        com.google.android.gms.internal.common.zzag zzd = ((com.google.android.gms.internal.common.zzac) collection).zzd();
        if (!zzd.zzf()) {
            return zzd;
        }
        java.lang.Object[] array2 = zzd.toArray();
        return zzi(array2, array2.length);
    }

    public static com.google.android.gms.internal.common.zzag zzl() {
        return com.google.android.gms.internal.common.zzai.zza;
    }

    public static com.google.android.gms.internal.common.zzag zzm(java.lang.Object obj) {
        java.lang.Object[] objArr = {obj};
        com.google.android.gms.internal.common.zzah.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static com.google.android.gms.internal.common.zzag zzn(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr = {obj, obj2};
        com.google.android.gms.internal.common.zzah.zza(objArr, 2);
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
                        if (com.google.android.gms.internal.common.zzr.zza(get(i17), list.get(i17))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = iterator();
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it6.hasNext() || !com.google.android.gms.internal.common.zzr.zza(it.next(), it6.next())) {
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

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.common.zzac
    public int zza(java.lang.Object[] objArr, int i17) {
        int size = size();
        for (int i18 = 0; i18 < size; i18++) {
            objArr[i18] = get(i18);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @java.lang.Deprecated
    public final com.google.android.gms.internal.common.zzag zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: zze */
    public final com.google.android.gms.internal.common.zzaj iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public com.google.android.gms.internal.common.zzag subList(int i17, int i18) {
        com.google.android.gms.internal.common.zzs.zzc(i17, i18, size());
        int i19 = i18 - i17;
        return i19 == size() ? this : i19 == 0 ? com.google.android.gms.internal.common.zzai.zza : new com.google.android.gms.internal.common.zzaf(this, i17, i19);
    }

    @Override // java.util.List
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.common.zzak listIterator(int i17) {
        com.google.android.gms.internal.common.zzs.zzb(i17, size(), ya.b.INDEX);
        return isEmpty() ? zza : new com.google.android.gms.internal.common.zzae(this, i17);
    }
}

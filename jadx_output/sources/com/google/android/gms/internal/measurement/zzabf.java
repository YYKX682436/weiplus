package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzabf extends java.util.AbstractSet {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzaay zzbuf;

    private zzabf(com.google.android.gms.internal.measurement.zzaay zzaayVar) {
        this.zzbuf = zzaayVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzbuf.zza((com.google.android.gms.internal.measurement.zzaay) entry.getKey(), (java.lang.Comparable) entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zzbuf.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.zzbuf.get(entry.getKey());
        java.lang.Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.measurement.zzabe(this.zzbuf, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzbuf.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzbuf.size();
    }

    public /* synthetic */ zzabf(com.google.android.gms.internal.measurement.zzaay zzaayVar, com.google.android.gms.internal.measurement.zzaaz zzaazVar) {
        this(zzaayVar);
    }
}

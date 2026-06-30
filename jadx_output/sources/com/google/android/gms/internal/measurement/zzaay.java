package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class zzaay<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private boolean zzbls;
    private final int zzbtx;
    private java.util.List<com.google.android.gms.internal.measurement.zzabd> zzbty;
    private java.util.Map<K, V> zzbtz;
    private volatile com.google.android.gms.internal.measurement.zzabf zzbua;
    private java.util.Map<K, V> zzbub;

    private zzaay(int i17) {
        this.zzbtx = i17;
        this.zzbty = java.util.Collections.emptyList();
        this.zzbtz = java.util.Collections.emptyMap();
        this.zzbub = java.util.Collections.emptyMap();
    }

    private final int zza(K k17) {
        int size = this.zzbty.size() - 1;
        if (size >= 0) {
            int compareTo = k17.compareTo((java.lang.Comparable) this.zzbty.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i17 = 0;
        while (i17 <= size) {
            int i18 = (i17 + size) / 2;
            int compareTo2 = k17.compareTo((java.lang.Comparable) this.zzbty.get(i18).getKey());
            if (compareTo2 < 0) {
                size = i18 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i18;
                }
                i17 = i18 + 1;
            }
        }
        return -(i17 + 1);
    }

    public static <FieldDescriptorType extends com.google.android.gms.internal.measurement.zzzo<FieldDescriptorType>> com.google.android.gms.internal.measurement.zzaay<FieldDescriptorType, java.lang.Object> zzag(int i17) {
        return new com.google.android.gms.internal.measurement.zzaaz(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzai(int i17) {
        zzul();
        V v17 = (V) this.zzbty.remove(i17).getValue();
        if (!this.zzbtz.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = zzum().entrySet().iterator();
            this.zzbty.add(new com.google.android.gms.internal.measurement.zzabd(this, it.next()));
            it.remove();
        }
        return v17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzul() {
        if (this.zzbls) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final java.util.SortedMap<K, V> zzum() {
        zzul();
        if (this.zzbtz.isEmpty() && !(this.zzbtz instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.zzbtz = treeMap;
            this.zzbub = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.zzbtz;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzul();
        if (!this.zzbty.isEmpty()) {
            this.zzbty.clear();
        }
        if (this.zzbtz.isEmpty()) {
            return;
        }
        this.zzbtz.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return zza((com.google.android.gms.internal.measurement.zzaay<K, V>) comparable) >= 0 || this.zzbtz.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.zzbua == null) {
            this.zzbua = new com.google.android.gms.internal.measurement.zzabf(this, null);
        }
        return this.zzbua;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzaay)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.zzaay zzaayVar = (com.google.android.gms.internal.measurement.zzaay) obj;
        int size = size();
        if (size != zzaayVar.size()) {
            return false;
        }
        int zzuj = zzuj();
        if (zzuj != zzaayVar.zzuj()) {
            return entrySet().equals(zzaayVar.entrySet());
        }
        for (int i17 = 0; i17 < zzuj; i17++) {
            if (!zzah(i17).equals(zzaayVar.zzah(i17))) {
                return false;
            }
        }
        if (zzuj != size) {
            return this.zzbtz.equals(zzaayVar.zzbtz);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zza = zza((com.google.android.gms.internal.measurement.zzaay<K, V>) comparable);
        return zza >= 0 ? (V) this.zzbty.get(zza).getValue() : this.zzbtz.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzuj = zzuj();
        int i17 = 0;
        for (int i18 = 0; i18 < zzuj; i18++) {
            i17 += this.zzbty.get(i18).hashCode();
        }
        return this.zzbtz.size() > 0 ? i17 + this.zzbtz.hashCode() : i17;
    }

    public final boolean isImmutable() {
        return this.zzbls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return zza((com.google.android.gms.internal.measurement.zzaay<K, V>) obj, (java.lang.Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        zzul();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zza = zza((com.google.android.gms.internal.measurement.zzaay<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzai(zza);
        }
        if (this.zzbtz.isEmpty()) {
            return null;
        }
        return this.zzbtz.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzbty.size() + this.zzbtz.size();
    }

    public final java.util.Map.Entry<K, V> zzah(int i17) {
        return this.zzbty.get(i17);
    }

    public void zzrg() {
        if (this.zzbls) {
            return;
        }
        this.zzbtz = this.zzbtz.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzbtz);
        this.zzbub = this.zzbub.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzbub);
        this.zzbls = true;
    }

    public final int zzuj() {
        return this.zzbty.size();
    }

    public final java.lang.Iterable<java.util.Map.Entry<K, V>> zzuk() {
        return this.zzbtz.isEmpty() ? com.google.android.gms.internal.measurement.zzaba.zzun() : this.zzbtz.entrySet();
    }

    public /* synthetic */ zzaay(int i17, com.google.android.gms.internal.measurement.zzaaz zzaazVar) {
        this(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k17, V v17) {
        zzul();
        int zza = zza((com.google.android.gms.internal.measurement.zzaay<K, V>) k17);
        if (zza >= 0) {
            return (V) this.zzbty.get(zza).setValue(v17);
        }
        zzul();
        if (this.zzbty.isEmpty() && !(this.zzbty instanceof java.util.ArrayList)) {
            this.zzbty = new java.util.ArrayList(this.zzbtx);
        }
        int i17 = -(zza + 1);
        if (i17 >= this.zzbtx) {
            return zzum().put(k17, v17);
        }
        int size = this.zzbty.size();
        int i18 = this.zzbtx;
        if (size == i18) {
            com.google.android.gms.internal.measurement.zzabd remove = this.zzbty.remove(i18 - 1);
            zzum().put((java.lang.Comparable) remove.getKey(), remove.getValue());
        }
        this.zzbty.add(i17, new com.google.android.gms.internal.measurement.zzabd(this, k17, v17));
        return null;
    }
}

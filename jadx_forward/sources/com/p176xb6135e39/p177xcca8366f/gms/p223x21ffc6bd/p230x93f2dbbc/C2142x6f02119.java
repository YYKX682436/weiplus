package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzaay */
/* loaded from: classes13.dex */
public class C2142x6f02119<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {

    /* renamed from: zzbls */
    private boolean f6293x6f02629;

    /* renamed from: zzbtx */
    private final int f6294x6f02726;

    /* renamed from: zzbty */
    private java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2147x6f02123> f6295x6f02727;

    /* renamed from: zzbtz */
    private java.util.Map<K, V> f6296x6f02728;

    /* renamed from: zzbua */
    private volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2149x6f02125 f6297x6f0272e;

    /* renamed from: zzbub */
    private java.util.Map<K, V> f6298x6f0272f;

    private C2142x6f02119(int i17) {
        this.f6294x6f02726 = i17;
        this.f6295x6f02727 = java.util.Collections.emptyList();
        this.f6296x6f02728 = java.util.Collections.emptyMap();
        this.f6298x6f0272f = java.util.Collections.emptyMap();
    }

    private final int zza(K k17) {
        int size = this.f6295x6f02727.size() - 1;
        if (size >= 0) {
            int compareTo = k17.compareTo((java.lang.Comparable) this.f6295x6f02727.get(size).getKey());
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
            int compareTo2 = k17.compareTo((java.lang.Comparable) this.f6295x6f02727.get(i18).getKey());
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

    /* renamed from: zzag */
    public static <FieldDescriptorType extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2401x394e75<FieldDescriptorType>> com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119<FieldDescriptorType, java.lang.Object> m18863x394b66(int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2143x6f0211a(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzai */
    public final V m18864x394b68(int i17) {
        m18865x394dd7();
        V v17 = (V) this.f6295x6f02727.remove(i17).getValue();
        if (!this.f6296x6f02728.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = m18866x394dd8().entrySet().iterator();
            this.f6295x6f02727.add(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2147x6f02123(this, it.next()));
            it.remove();
        }
        return v17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzul */
    public final void m18865x394dd7() {
        if (this.f6293x6f02629) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    /* renamed from: zzum */
    private final java.util.SortedMap<K, V> m18866x394dd8() {
        m18865x394dd7();
        if (this.f6296x6f02728.isEmpty() && !(this.f6296x6f02728 instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.f6296x6f02728 = treeMap;
            this.f6298x6f0272f = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.f6296x6f02728;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m18865x394dd7();
        if (!this.f6295x6f02727.isEmpty()) {
            this.f6295x6f02727.clear();
        }
        if (this.f6296x6f02728.isEmpty()) {
            return;
        }
        this.f6296x6f02728.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return zza((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119<K, V>) comparable) >= 0 || this.f6296x6f02728.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.f6297x6f0272e == null) {
            this.f6297x6f0272e = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2149x6f02125(this, null);
        }
        return this.f6297x6f0272e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119)) {
            return super.equals(obj);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119 c2142x6f02119 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119) obj;
        int size = size();
        if (size != c2142x6f02119.size()) {
            return false;
        }
        int m18870x394dd5 = m18870x394dd5();
        if (m18870x394dd5 != c2142x6f02119.m18870x394dd5()) {
            return entrySet().equals(c2142x6f02119.entrySet());
        }
        for (int i17 = 0; i17 < m18870x394dd5; i17++) {
            if (!m18868x394b67(i17).equals(c2142x6f02119.m18868x394b67(i17))) {
                return false;
            }
        }
        if (m18870x394dd5 != size) {
            return this.f6296x6f02728.equals(c2142x6f02119.f6296x6f02728);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zza = zza((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119<K, V>) comparable);
        return zza >= 0 ? (V) this.f6295x6f02727.get(zza).getValue() : this.f6296x6f02728.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m18870x394dd5 = m18870x394dd5();
        int i17 = 0;
        for (int i18 = 0; i18 < m18870x394dd5; i18++) {
            i17 += this.f6295x6f02727.get(i18).hashCode();
        }
        return this.f6296x6f02728.size() > 0 ? i17 + this.f6296x6f02728.hashCode() : i17;
    }

    /* renamed from: isImmutable */
    public final boolean m18867xa56d5b78() {
        return this.f6293x6f02629;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return zza((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119<K, V>) obj, (java.lang.Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        m18865x394dd7();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zza = zza((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119<K, V>) comparable);
        if (zza >= 0) {
            return (V) m18864x394b68(zza);
        }
        if (this.f6296x6f02728.isEmpty()) {
            return null;
        }
        return this.f6296x6f02728.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f6295x6f02727.size() + this.f6296x6f02728.size();
    }

    /* renamed from: zzah */
    public final java.util.Map.Entry<K, V> m18868x394b67(int i17) {
        return this.f6295x6f02727.get(i17);
    }

    /* renamed from: zzrg */
    public void mo18869x394d75() {
        if (this.f6293x6f02629) {
            return;
        }
        this.f6296x6f02728 = this.f6296x6f02728.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.f6296x6f02728);
        this.f6298x6f0272f = this.f6298x6f0272f.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.f6298x6f0272f);
        this.f6293x6f02629 = true;
    }

    /* renamed from: zzuj */
    public final int m18870x394dd5() {
        return this.f6295x6f02727.size();
    }

    /* renamed from: zzuk */
    public final java.lang.Iterable<java.util.Map.Entry<K, V>> m18871x394dd6() {
        return this.f6296x6f02728.isEmpty() ? com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2144x6f02120.m18873x394dd9() : this.f6296x6f02728.entrySet();
    }

    public /* synthetic */ C2142x6f02119(int i17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2143x6f0211a c2143x6f0211a) {
        this(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k17, V v17) {
        m18865x394dd7();
        int zza = zza((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119<K, V>) k17);
        if (zza >= 0) {
            return (V) this.f6295x6f02727.get(zza).setValue(v17);
        }
        m18865x394dd7();
        if (this.f6295x6f02727.isEmpty() && !(this.f6295x6f02727 instanceof java.util.ArrayList)) {
            this.f6295x6f02727 = new java.util.ArrayList(this.f6294x6f02726);
        }
        int i17 = -(zza + 1);
        if (i17 >= this.f6294x6f02726) {
            return m18866x394dd8().put(k17, v17);
        }
        int size = this.f6295x6f02727.size();
        int i18 = this.f6294x6f02726;
        if (size == i18) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2147x6f02123 remove = this.f6295x6f02727.remove(i18 - 1);
            m18866x394dd8().put((java.lang.Comparable) remove.getKey(), remove.getValue());
        }
        this.f6295x6f02727.add(i17, new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2147x6f02123(this, k17, v17));
        return null;
    }
}

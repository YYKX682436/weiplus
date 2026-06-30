package com.eclipsesource.mmv8.utils;

/* loaded from: classes7.dex */
class V8PropertyMap<V> implements java.util.Map<java.lang.String, V> {
    private java.util.Hashtable<java.lang.String, V> map = new java.util.Hashtable<>();
    private java.util.Set<java.lang.String> nulls = new java.util.HashSet();

    @Override // java.util.Map
    public void clear() {
        this.map.clear();
        this.nulls.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.map.containsKey(obj) || this.nulls.contains(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        if (obj == null && !this.nulls.isEmpty()) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<java.lang.String, V>> entrySet() {
        java.util.HashSet hashSet = new java.util.HashSet(this.map.entrySet());
        java.util.Iterator<java.lang.String> it = this.nulls.iterator();
        while (it.hasNext()) {
            hashSet.add(new java.util.AbstractMap.SimpleEntry(it.next(), null));
        }
        return hashSet;
    }

    @Override // java.util.Map
    public V get(java.lang.Object obj) {
        if (this.nulls.contains(obj)) {
            return null;
        }
        return this.map.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty() && this.nulls.isEmpty();
    }

    @Override // java.util.Map
    public java.util.Set<java.lang.String> keySet() {
        java.util.HashSet hashSet = new java.util.HashSet(this.map.keySet());
        hashSet.addAll(this.nulls);
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.String str, java.lang.Object obj) {
        return put2(str, (java.lang.String) obj);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends java.lang.String, ? extends V> map) {
        for (java.util.Map.Entry<? extends java.lang.String, ? extends V> entry : map.entrySet()) {
            put2(entry.getKey(), (java.lang.String) entry.getValue());
        }
    }

    @Override // java.util.Map
    public V remove(java.lang.Object obj) {
        if (!this.nulls.contains(obj)) {
            return this.map.remove(obj);
        }
        this.nulls.remove(obj);
        return null;
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size() + this.nulls.size();
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.map.values());
        for (int i17 = 0; i17 < this.nulls.size(); i17++) {
            arrayList.add(null);
        }
        return arrayList;
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public V put2(java.lang.String str, V v17) {
        if (v17 == null) {
            if (this.map.containsKey(str)) {
                this.map.remove(str);
            }
            this.nulls.add(str);
            return null;
        }
        if (this.nulls.contains(str)) {
            this.nulls.remove(str);
        }
        return this.map.put(str, v17);
    }
}

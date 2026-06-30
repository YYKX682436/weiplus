package com.p159x477cd522.p160x333422.p164x6a710b1;

/* renamed from: com.eclipsesource.mmv8.utils.V8PropertyMap */
/* loaded from: classes7.dex */
class C1527x83350745<V> implements java.util.Map<java.lang.String, V> {
    private java.util.Hashtable<java.lang.String, V> map = new java.util.Hashtable<>();

    /* renamed from: nulls */
    private java.util.Set<java.lang.String> f5061x644ebcc = new java.util.HashSet();

    @Override // java.util.Map
    public void clear() {
        this.map.clear();
        this.f5061x644ebcc.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.map.containsKey(obj) || this.f5061x644ebcc.contains(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        if (obj == null && !this.f5061x644ebcc.isEmpty()) {
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
        java.util.Iterator<java.lang.String> it = this.f5061x644ebcc.iterator();
        while (it.hasNext()) {
            hashSet.add(new java.util.AbstractMap.SimpleEntry(it.next(), null));
        }
        return hashSet;
    }

    @Override // java.util.Map
    public V get(java.lang.Object obj) {
        if (this.f5061x644ebcc.contains(obj)) {
            return null;
        }
        return this.map.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty() && this.f5061x644ebcc.isEmpty();
    }

    @Override // java.util.Map
    public java.util.Set<java.lang.String> keySet() {
        java.util.HashSet hashSet = new java.util.HashSet(this.map.keySet());
        hashSet.addAll(this.f5061x644ebcc);
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
        if (!this.f5061x644ebcc.contains(obj)) {
            return this.map.remove(obj);
        }
        this.f5061x644ebcc.remove(obj);
        return null;
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size() + this.f5061x644ebcc.size();
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.map.values());
        for (int i17 = 0; i17 < this.f5061x644ebcc.size(); i17++) {
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
            this.f5061x644ebcc.add(str);
            return null;
        }
        if (this.f5061x644ebcc.contains(str)) {
            this.f5061x644ebcc.remove(str);
        }
        return this.map.put(str, v17);
    }
}

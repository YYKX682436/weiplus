package com.eclipsesource.mmv8.utils;

/* loaded from: classes7.dex */
public class V8Map<V> implements java.util.Map<com.eclipsesource.mmv8.V8Value, V>, com.eclipsesource.mmv8.Releasable {
    private java.util.Map<com.eclipsesource.mmv8.V8Value, V> map = new java.util.HashMap();
    private java.util.Map<com.eclipsesource.mmv8.V8Value, com.eclipsesource.mmv8.V8Value> twinMap = new java.util.HashMap();

    @Override // java.util.Map
    public void clear() {
        this.map.clear();
        java.util.Iterator<com.eclipsesource.mmv8.V8Value> it = this.twinMap.keySet().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.twinMap.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<com.eclipsesource.mmv8.V8Value, V>> entrySet() {
        return this.map.entrySet();
    }

    @Override // java.util.Map
    public V get(java.lang.Object obj) {
        return this.map.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public java.util.Set<com.eclipsesource.mmv8.V8Value> keySet() {
        return this.map.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(com.eclipsesource.mmv8.V8Value v8Value, java.lang.Object obj) {
        return put2(v8Value, (com.eclipsesource.mmv8.V8Value) obj);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends com.eclipsesource.mmv8.V8Value, ? extends V> map) {
        for (java.util.Map.Entry<? extends com.eclipsesource.mmv8.V8Value, ? extends V> entry : map.entrySet()) {
            put2(entry.getKey(), (com.eclipsesource.mmv8.V8Value) entry.getValue());
        }
    }

    @Override // com.eclipsesource.mmv8.Releasable
    public void release() {
        clear();
    }

    @Override // java.util.Map
    public V remove(java.lang.Object obj) {
        V remove = this.map.remove(obj);
        com.eclipsesource.mmv8.V8Value remove2 = this.twinMap.remove(obj);
        if (remove2 != null) {
            remove2.release();
        }
        return remove;
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size();
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
        return this.map.values();
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public V put2(com.eclipsesource.mmv8.V8Value v8Value, V v17) {
        remove(v8Value);
        com.eclipsesource.mmv8.V8Value twin = v8Value.twin();
        this.twinMap.put(twin, twin);
        return this.map.put(twin, v17);
    }
}

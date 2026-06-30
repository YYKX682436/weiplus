package com.p159x477cd522.p160x333422.p164x6a710b1;

/* renamed from: com.eclipsesource.mmv8.utils.V8Map */
/* loaded from: classes7.dex */
public class C1525x4d6875a<V> implements java.util.Map<com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef, V>, com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98 {
    private java.util.Map<com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef, V> map = new java.util.HashMap();

    /* renamed from: twinMap */
    private java.util.Map<com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> f5057xc95e5d54 = new java.util.HashMap();

    @Override // java.util.Map
    public void clear() {
        this.map.clear();
        java.util.Iterator<com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> it = this.f5057xc95e5d54.keySet().iterator();
        while (it.hasNext()) {
            it.next().mo15825x41012807();
        }
        this.f5057xc95e5d54.clear();
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
    public java.util.Set<java.util.Map.Entry<com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef, V>> entrySet() {
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
    public java.util.Set<com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> keySet() {
        return this.map.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef, java.lang.Object obj) {
        return put2(abstractC1488x29d0ebef, (com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) obj);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef, ? extends V> map) {
        for (java.util.Map.Entry<? extends com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef, ? extends V> entry : map.entrySet()) {
            put2(entry.getKey(), (com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) entry.getValue());
        }
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98
    /* renamed from: release */
    public void mo15825x41012807() {
        clear();
    }

    @Override // java.util.Map
    public V remove(java.lang.Object obj) {
        V remove = this.map.remove(obj);
        com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef remove2 = this.f5057xc95e5d54.remove(obj);
        if (remove2 != null) {
            remove2.mo15825x41012807();
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
    public V put2(com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef, V v17) {
        remove(abstractC1488x29d0ebef);
        com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef mo16314x3686e8 = abstractC1488x29d0ebef.mo16314x3686e8();
        this.f5057xc95e5d54.put(mo16314x3686e8, mo16314x3686e8);
        return this.map.put(mo16314x3686e8, v17);
    }
}

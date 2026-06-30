package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPHashMapBuilder */
/* loaded from: classes16.dex */
public class C26571x7baf53e9<K, V> {
    private java.util.Map<K, V> map = new java.util.HashMap();

    /* renamed from: build */
    public java.util.Map<K, V> m104306x59bc66e() {
        return this.map;
    }

    public com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9<K, V> put(K k17, V v17) {
        this.map.put(k17, v17);
        return this;
    }

    /* renamed from: readOnly */
    public java.util.Map<K, V> m104307xcc483262() {
        return java.util.Collections.unmodifiableMap(this.map);
    }
}

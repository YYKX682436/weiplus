package com.google.protobuf;

/* loaded from: classes13.dex */
public class b8 implements java.util.Map {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.z8 f44927d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f44928e;

    public b8(com.google.protobuf.z8 z8Var, java.util.Map map) {
        this.f44927d = z8Var;
        this.f44928e = map;
    }

    @Override // java.util.Map
    public void clear() {
        ((com.google.protobuf.d8) this.f44927d).c();
        this.f44928e.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.f44928e.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return this.f44928e.containsValue(obj);
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
        return new com.google.protobuf.a8(this.f44927d, this.f44928e.entrySet());
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return this.f44928e.equals(obj);
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.f44928e.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f44928e.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f44928e.isEmpty();
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
        return new com.google.protobuf.a8(this.f44927d, this.f44928e.keySet());
    }

    @Override // java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        ((com.google.protobuf.d8) this.f44927d).c();
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        obj.getClass();
        obj2.getClass();
        return this.f44928e.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        ((com.google.protobuf.d8) this.f44927d).c();
        for (java.lang.Object obj : map.keySet()) {
            java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
            obj.getClass();
            map.get(obj).getClass();
        }
        this.f44928e.putAll(map);
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        ((com.google.protobuf.d8) this.f44927d).c();
        return this.f44928e.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f44928e.size();
    }

    public java.lang.String toString() {
        return this.f44928e.toString();
    }

    @Override // java.util.Map
    public java.util.Collection values() {
        return new com.google.protobuf.y7(this.f44927d, this.f44928e.values());
    }
}

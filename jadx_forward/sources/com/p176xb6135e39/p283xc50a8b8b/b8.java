package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes13.dex */
public class b8 implements java.util.Map {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.z8 f126460d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f126461e;

    public b8(com.p176xb6135e39.p283xc50a8b8b.z8 z8Var, java.util.Map map) {
        this.f126460d = z8Var;
        this.f126461e = map;
    }

    @Override // java.util.Map
    public void clear() {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f126460d).c();
        this.f126461e.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.f126461e.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return this.f126461e.containsValue(obj);
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
        return new com.p176xb6135e39.p283xc50a8b8b.a8(this.f126460d, this.f126461e.entrySet());
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return this.f126461e.equals(obj);
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.f126461e.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f126461e.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f126461e.isEmpty();
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
        return new com.p176xb6135e39.p283xc50a8b8b.a8(this.f126460d, this.f126461e.keySet());
    }

    @Override // java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f126460d).c();
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        obj.getClass();
        obj2.getClass();
        return this.f126461e.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f126460d).c();
        for (java.lang.Object obj : map.keySet()) {
            java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
            obj.getClass();
            map.get(obj).getClass();
        }
        this.f126461e.putAll(map);
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f126460d).c();
        return this.f126461e.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f126461e.size();
    }

    /* renamed from: toString */
    public java.lang.String m20576x9616526c() {
        return this.f126461e.toString();
    }

    @Override // java.util.Map
    public java.util.Collection values() {
        return new com.p176xb6135e39.p283xc50a8b8b.y7(this.f126460d, this.f126461e.values());
    }
}

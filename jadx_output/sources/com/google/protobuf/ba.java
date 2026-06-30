package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class ba extends java.util.AbstractMap {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f44929m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f44930d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f44933g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.google.protobuf.aa f44934h;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f44931e = java.util.Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f44932f = java.util.Collections.emptyMap();

    /* renamed from: i, reason: collision with root package name */
    public java.util.Map f44935i = java.util.Collections.emptyMap();

    public ba(int i17, com.google.protobuf.u9 u9Var) {
        this.f44930d = i17;
    }

    public final int a(java.lang.Comparable comparable) {
        int size = this.f44931e.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((com.google.protobuf.y9) this.f44931e.get(size)).f45746d);
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
            int compareTo2 = comparable.compareTo(((com.google.protobuf.y9) this.f44931e.get(i18)).f45746d);
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

    public final void b() {
        if (this.f44933g) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public java.util.Map.Entry c(int i17) {
        return (java.util.Map.Entry) this.f44931e.get(i17);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        b();
        if (!this.f44931e.isEmpty()) {
            this.f44931e.clear();
        }
        if (this.f44932f.isEmpty()) {
            return;
        }
        this.f44932f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return a(comparable) >= 0 || this.f44932f.containsKey(comparable);
    }

    public int d() {
        return this.f44931e.size();
    }

    public java.lang.Iterable e() {
        return this.f44932f.isEmpty() ? com.google.protobuf.x9.f45705b : this.f44932f.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        if (this.f44934h == null) {
            this.f44934h = new com.google.protobuf.aa(this, null);
        }
        return this.f44934h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.ba)) {
            return super.equals(obj);
        }
        com.google.protobuf.ba baVar = (com.google.protobuf.ba) obj;
        int size = size();
        if (size != baVar.size()) {
            return false;
        }
        int d17 = d();
        if (d17 != baVar.d()) {
            return entrySet().equals(baVar.entrySet());
        }
        for (int i17 = 0; i17 < d17; i17++) {
            if (!c(i17).equals(baVar.c(i17))) {
                return false;
            }
        }
        if (d17 != size) {
            return this.f44932f.equals(baVar.f44932f);
        }
        return true;
    }

    public final java.util.SortedMap f() {
        b();
        if (this.f44932f.isEmpty() && !(this.f44932f instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.f44932f = treeMap;
            this.f44935i = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.f44932f;
    }

    public abstract void g();

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int a17 = a(comparable);
        return a17 >= 0 ? ((com.google.protobuf.y9) this.f44931e.get(a17)).f45747e : this.f44932f.get(comparable);
    }

    public java.lang.Object h(java.lang.Comparable comparable, java.lang.Object obj) {
        b();
        int a17 = a(comparable);
        if (a17 >= 0) {
            return ((com.google.protobuf.y9) this.f44931e.get(a17)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f44931e.isEmpty();
        int i17 = this.f44930d;
        if (isEmpty && !(this.f44931e instanceof java.util.ArrayList)) {
            this.f44931e = new java.util.ArrayList(i17);
        }
        int i18 = -(a17 + 1);
        if (i18 >= i17) {
            return f().put(comparable, obj);
        }
        if (this.f44931e.size() == i17) {
            com.google.protobuf.y9 y9Var = (com.google.protobuf.y9) this.f44931e.remove(i17 - 1);
            f().put(y9Var.f45746d, y9Var.f45747e);
        }
        this.f44931e.add(i18, new com.google.protobuf.y9(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int d17 = d();
        int i17 = 0;
        for (int i18 = 0; i18 < d17; i18++) {
            i17 += ((com.google.protobuf.y9) this.f44931e.get(i18)).hashCode();
        }
        return this.f44932f.size() > 0 ? i17 + this.f44932f.hashCode() : i17;
    }

    public final java.lang.Object i(int i17) {
        b();
        java.lang.Object obj = ((com.google.protobuf.y9) this.f44931e.remove(i17)).f45747e;
        if (!this.f44932f.isEmpty()) {
            java.util.Iterator it = f().entrySet().iterator();
            java.util.List list = this.f44931e;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            list.add(new com.google.protobuf.y9(this, (java.lang.Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        b();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int a17 = a(comparable);
        if (a17 >= 0) {
            return i(a17);
        }
        if (this.f44932f.isEmpty()) {
            return null;
        }
        return this.f44932f.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f44931e.size() + this.f44932f.size();
    }
}

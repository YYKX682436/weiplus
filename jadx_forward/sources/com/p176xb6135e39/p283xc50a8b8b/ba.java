package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class ba extends java.util.AbstractMap {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f126462m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f126463d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f126466g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.p176xb6135e39.p283xc50a8b8b.aa f126467h;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f126464e = java.util.Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f126465f = java.util.Collections.emptyMap();

    /* renamed from: i, reason: collision with root package name */
    public java.util.Map f126468i = java.util.Collections.emptyMap();

    public ba(int i17, com.p176xb6135e39.p283xc50a8b8b.u9 u9Var) {
        this.f126463d = i17;
    }

    public final int a(java.lang.Comparable comparable) {
        int size = this.f126464e.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((com.p176xb6135e39.p283xc50a8b8b.y9) this.f126464e.get(size)).f127279d);
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
            int compareTo2 = comparable.compareTo(((com.p176xb6135e39.p283xc50a8b8b.y9) this.f126464e.get(i18)).f127279d);
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
        if (this.f126466g) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public java.util.Map.Entry c(int i17) {
        return (java.util.Map.Entry) this.f126464e.get(i17);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        b();
        if (!this.f126464e.isEmpty()) {
            this.f126464e.clear();
        }
        if (this.f126465f.isEmpty()) {
            return;
        }
        this.f126465f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return a(comparable) >= 0 || this.f126465f.containsKey(comparable);
    }

    public int d() {
        return this.f126464e.size();
    }

    public java.lang.Iterable e() {
        return this.f126465f.isEmpty() ? com.p176xb6135e39.p283xc50a8b8b.x9.f127238b : this.f126465f.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        if (this.f126467h == null) {
            this.f126467h = new com.p176xb6135e39.p283xc50a8b8b.aa(this, null);
        }
        return this.f126467h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.ba)) {
            return super.equals(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.ba baVar = (com.p176xb6135e39.p283xc50a8b8b.ba) obj;
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
            return this.f126465f.equals(baVar.f126465f);
        }
        return true;
    }

    public final java.util.SortedMap f() {
        b();
        if (this.f126465f.isEmpty() && !(this.f126465f instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.f126465f = treeMap;
            this.f126468i = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.f126465f;
    }

    public abstract void g();

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int a17 = a(comparable);
        return a17 >= 0 ? ((com.p176xb6135e39.p283xc50a8b8b.y9) this.f126464e.get(a17)).f127280e : this.f126465f.get(comparable);
    }

    public java.lang.Object h(java.lang.Comparable comparable, java.lang.Object obj) {
        b();
        int a17 = a(comparable);
        if (a17 >= 0) {
            return ((com.p176xb6135e39.p283xc50a8b8b.y9) this.f126464e.get(a17)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f126464e.isEmpty();
        int i17 = this.f126463d;
        if (isEmpty && !(this.f126464e instanceof java.util.ArrayList)) {
            this.f126464e = new java.util.ArrayList(i17);
        }
        int i18 = -(a17 + 1);
        if (i18 >= i17) {
            return f().put(comparable, obj);
        }
        if (this.f126464e.size() == i17) {
            com.p176xb6135e39.p283xc50a8b8b.y9 y9Var = (com.p176xb6135e39.p283xc50a8b8b.y9) this.f126464e.remove(i17 - 1);
            f().put(y9Var.f127279d, y9Var.f127280e);
        }
        this.f126464e.add(i18, new com.p176xb6135e39.p283xc50a8b8b.y9(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int d17 = d();
        int i17 = 0;
        for (int i18 = 0; i18 < d17; i18++) {
            i17 += ((com.p176xb6135e39.p283xc50a8b8b.y9) this.f126464e.get(i18)).hashCode();
        }
        return this.f126465f.size() > 0 ? i17 + this.f126465f.hashCode() : i17;
    }

    public final java.lang.Object i(int i17) {
        b();
        java.lang.Object obj = ((com.p176xb6135e39.p283xc50a8b8b.y9) this.f126464e.remove(i17)).f127280e;
        if (!this.f126465f.isEmpty()) {
            java.util.Iterator it = f().entrySet().iterator();
            java.util.List list = this.f126464e;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            list.add(new com.p176xb6135e39.p283xc50a8b8b.y9(this, (java.lang.Comparable) entry.getKey(), entry.getValue()));
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
        if (this.f126465f.isEmpty()) {
            return null;
        }
        return this.f126465f.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f126464e.size() + this.f126465f.size();
    }
}

package p16;

/* loaded from: classes15.dex */
public abstract class w0 extends java.util.AbstractMap {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f432896i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f432897d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f432898e = java.util.Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f432899f = java.util.Collections.emptyMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f432900g;

    /* renamed from: h, reason: collision with root package name */
    public volatile p16.v0 f432901h;

    public w0(int i17, p16.p0 p0Var) {
        this.f432897d = i17;
    }

    public final int a(java.lang.Comparable comparable) {
        int size = this.f432898e.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((p16.t0) this.f432898e.get(size)).f432883d);
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
            int compareTo2 = comparable.compareTo(((p16.t0) this.f432898e.get(i18)).f432883d);
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
        if (this.f432900g) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public java.lang.Iterable c() {
        return this.f432899f.isEmpty() ? p16.s0.f432878b : this.f432899f.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        b();
        if (!this.f432898e.isEmpty()) {
            this.f432898e.clear();
        }
        if (this.f432899f.isEmpty()) {
            return;
        }
        this.f432899f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return a(comparable) >= 0 || this.f432899f.containsKey(comparable);
    }

    public final java.util.SortedMap d() {
        b();
        if (this.f432899f.isEmpty() && !(this.f432899f instanceof java.util.TreeMap)) {
            this.f432899f = new java.util.TreeMap();
        }
        return (java.util.SortedMap) this.f432899f;
    }

    public java.lang.Object e(java.lang.Comparable comparable, java.lang.Object obj) {
        b();
        int a17 = a(comparable);
        if (a17 >= 0) {
            return ((p16.t0) this.f432898e.get(a17)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f432898e.isEmpty();
        int i17 = this.f432897d;
        if (isEmpty && !(this.f432898e instanceof java.util.ArrayList)) {
            this.f432898e = new java.util.ArrayList(i17);
        }
        int i18 = -(a17 + 1);
        if (i18 >= i17) {
            return d().put(comparable, obj);
        }
        if (this.f432898e.size() == i17) {
            p16.t0 t0Var = (p16.t0) this.f432898e.remove(i17 - 1);
            d().put(t0Var.f432883d, t0Var.f432884e);
        }
        this.f432898e.add(i18, new p16.t0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        if (this.f432901h == null) {
            this.f432901h = new p16.v0(this, null);
        }
        return this.f432901h;
    }

    public final java.lang.Object f(int i17) {
        b();
        java.lang.Object obj = ((p16.t0) this.f432898e.remove(i17)).f432884e;
        if (!this.f432899f.isEmpty()) {
            java.util.Iterator it = d().entrySet().iterator();
            java.util.List list = this.f432898e;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            list.add(new p16.t0(this, (java.lang.Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int a17 = a(comparable);
        return a17 >= 0 ? ((p16.t0) this.f432898e.get(a17)).f432884e : this.f432899f.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        b();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int a17 = a(comparable);
        if (a17 >= 0) {
            return f(a17);
        }
        if (this.f432899f.isEmpty()) {
            return null;
        }
        return this.f432899f.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f432898e.size() + this.f432899f.size();
    }
}

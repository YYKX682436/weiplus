package lz5;

/* loaded from: classes16.dex */
public final class d implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final lz5.e f403923d;

    /* renamed from: e, reason: collision with root package name */
    public int f403924e;

    /* renamed from: f, reason: collision with root package name */
    public int f403925f;

    /* renamed from: g, reason: collision with root package name */
    public int f403926g;

    public d(lz5.e list, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f403923d = list;
        this.f403924e = i17;
        this.f403925f = -1;
        i18 = ((java.util.AbstractList) list).modCount;
        this.f403926g = i18;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        int i17;
        b();
        int i18 = this.f403924e;
        this.f403924e = i18 + 1;
        lz5.e eVar = this.f403923d;
        eVar.add(i18, obj);
        this.f403925f = -1;
        i17 = ((java.util.AbstractList) eVar).modCount;
        this.f403926g = i17;
    }

    public final void b() {
        int i17;
        i17 = ((java.util.AbstractList) this.f403923d).modCount;
        if (i17 != this.f403926g) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f403924e < this.f403923d.f403929e;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f403924e > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        b();
        int i17 = this.f403924e;
        lz5.e eVar = this.f403923d;
        if (i17 >= eVar.f403929e) {
            throw new java.util.NoSuchElementException();
        }
        this.f403924e = i17 + 1;
        this.f403925f = i17;
        return eVar.f403928d[i17];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f403924e;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        b();
        int i17 = this.f403924e;
        if (i17 <= 0) {
            throw new java.util.NoSuchElementException();
        }
        int i18 = i17 - 1;
        this.f403924e = i18;
        this.f403925f = i18;
        return this.f403923d.f403928d[i18];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f403924e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i17;
        b();
        int i18 = this.f403925f;
        if (!(i18 != -1)) {
            throw new java.lang.IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
        lz5.e eVar = this.f403923d;
        eVar.e(i18);
        this.f403924e = this.f403925f;
        this.f403925f = -1;
        i17 = ((java.util.AbstractList) eVar).modCount;
        this.f403926g = i17;
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        b();
        int i17 = this.f403925f;
        if (!(i17 != -1)) {
            throw new java.lang.IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
        this.f403923d.set(i17, obj);
    }
}

package lz5;

/* loaded from: classes16.dex */
public final class b implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final lz5.c f403914d;

    /* renamed from: e, reason: collision with root package name */
    public int f403915e;

    /* renamed from: f, reason: collision with root package name */
    public int f403916f;

    /* renamed from: g, reason: collision with root package name */
    public int f403917g;

    public b(lz5.c list, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f403914d = list;
        this.f403915e = i17;
        this.f403916f = -1;
        i18 = ((java.util.AbstractList) list).modCount;
        this.f403917g = i18;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        int i17;
        b();
        int i18 = this.f403915e;
        this.f403915e = i18 + 1;
        lz5.c cVar = this.f403914d;
        cVar.add(i18, obj);
        this.f403916f = -1;
        i17 = ((java.util.AbstractList) cVar).modCount;
        this.f403917g = i17;
    }

    public final void b() {
        int i17;
        i17 = ((java.util.AbstractList) this.f403914d.f403922h).modCount;
        if (i17 != this.f403917g) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f403915e < this.f403914d.f403920f;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f403915e > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        b();
        int i17 = this.f403915e;
        lz5.c cVar = this.f403914d;
        if (i17 >= cVar.f403920f) {
            throw new java.util.NoSuchElementException();
        }
        this.f403915e = i17 + 1;
        this.f403916f = i17;
        return cVar.f403918d[cVar.f403919e + i17];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f403915e;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        b();
        int i17 = this.f403915e;
        if (i17 <= 0) {
            throw new java.util.NoSuchElementException();
        }
        int i18 = i17 - 1;
        this.f403915e = i18;
        this.f403916f = i18;
        lz5.c cVar = this.f403914d;
        return cVar.f403918d[cVar.f403919e + i18];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f403915e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i17;
        b();
        int i18 = this.f403916f;
        if (!(i18 != -1)) {
            throw new java.lang.IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
        lz5.c cVar = this.f403914d;
        cVar.e(i18);
        this.f403915e = this.f403916f;
        this.f403916f = -1;
        i17 = ((java.util.AbstractList) cVar).modCount;
        this.f403917g = i17;
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        b();
        int i17 = this.f403916f;
        if (!(i17 != -1)) {
            throw new java.lang.IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
        this.f403914d.set(i17, obj);
    }
}

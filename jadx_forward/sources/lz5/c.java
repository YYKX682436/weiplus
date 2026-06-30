package lz5;

/* loaded from: classes16.dex */
public final class c extends kz5.l implements java.util.RandomAccess, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f403918d;

    /* renamed from: e, reason: collision with root package name */
    public final int f403919e;

    /* renamed from: f, reason: collision with root package name */
    public int f403920f;

    /* renamed from: g, reason: collision with root package name */
    public final lz5.c f403921g;

    /* renamed from: h, reason: collision with root package name */
    public final lz5.e f403922h;

    public c(java.lang.Object[] backing, int i17, int i18, lz5.c cVar, lz5.e root) {
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backing, "backing");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f403918d = backing;
        this.f403919e = i17;
        this.f403920f = i18;
        this.f403921g = cVar;
        this.f403922h = root;
        i19 = ((java.util.AbstractList) root).modCount;
        ((java.util.AbstractList) this).modCount = i19;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        l();
        k();
        j(this.f403919e + this.f403920f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        l();
        k();
        int size = elements.size();
        h(this.f403919e + this.f403920f, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        l();
        k();
        n(this.f403919e, this.f403920f);
    }

    @Override // kz5.l
    public int d() {
        k();
        return this.f403920f;
    }

    @Override // kz5.l
    public java.lang.Object e(int i17) {
        l();
        k();
        int i18 = this.f403920f;
        if (i17 >= 0 && i17 < i18) {
            return m(this.f403919e + i17);
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        k();
        if (obj != this) {
            if (obj instanceof java.util.List) {
                if (lz5.f.a(this.f403918d, this.f403919e, this.f403920f, (java.util.List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        k();
        int i18 = this.f403920f;
        if (i17 >= 0 && i17 < i18) {
            return this.f403918d[this.f403919e + i17];
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    public final void h(int i17, java.util.Collection collection, int i18) {
        ((java.util.AbstractList) this).modCount++;
        lz5.e eVar = this.f403922h;
        lz5.c cVar = this.f403921g;
        if (cVar != null) {
            cVar.h(i17, collection, i18);
        } else {
            lz5.e eVar2 = lz5.e.f403927g;
            eVar.h(i17, collection, i18);
        }
        this.f403918d = eVar.f403928d;
        this.f403920f += i18;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        k();
        java.lang.Object[] objArr = this.f403918d;
        int i17 = this.f403920f;
        int i18 = 1;
        for (int i19 = 0; i19 < i17; i19++) {
            java.lang.Object obj = objArr[this.f403919e + i19];
            i18 = (i18 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i18;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        k();
        for (int i17 = 0; i17 < this.f403920f; i17++) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f403918d[this.f403919e + i17], obj)) {
                return i17;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        k();
        return this.f403920f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i17, java.lang.Object obj) {
        ((java.util.AbstractList) this).modCount++;
        lz5.e eVar = this.f403922h;
        lz5.c cVar = this.f403921g;
        if (cVar != null) {
            cVar.j(i17, obj);
        } else {
            lz5.e eVar2 = lz5.e.f403927g;
            eVar.j(i17, obj);
        }
        this.f403918d = eVar.f403928d;
        this.f403920f++;
    }

    public final void k() {
        int i17;
        i17 = ((java.util.AbstractList) this.f403922h).modCount;
        if (i17 != ((java.util.AbstractList) this).modCount) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final void l() {
        if (this.f403922h.f403930f) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        k();
        for (int i17 = this.f403920f - 1; i17 >= 0; i17--) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f403918d[this.f403919e + i17], obj)) {
                return i17;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    public final java.lang.Object m(int i17) {
        java.lang.Object m17;
        ((java.util.AbstractList) this).modCount++;
        lz5.c cVar = this.f403921g;
        if (cVar != null) {
            m17 = cVar.m(i17);
        } else {
            lz5.e eVar = lz5.e.f403927g;
            m17 = this.f403922h.m(i17);
        }
        this.f403920f--;
        return m17;
    }

    public final void n(int i17, int i18) {
        if (i18 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        lz5.c cVar = this.f403921g;
        if (cVar != null) {
            cVar.n(i17, i18);
        } else {
            lz5.e eVar = lz5.e.f403927g;
            this.f403922h.n(i17, i18);
        }
        this.f403920f -= i18;
    }

    public final int o(int i17, int i18, java.util.Collection collection, boolean z17) {
        int o17;
        lz5.c cVar = this.f403921g;
        if (cVar != null) {
            o17 = cVar.o(i17, i18, collection, z17);
        } else {
            lz5.e eVar = lz5.e.f403927g;
            o17 = this.f403922h.o(i17, i18, collection, z17);
        }
        if (o17 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        this.f403920f -= o17;
        return o17;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        l();
        k();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            e(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        l();
        k();
        return o(this.f403919e, this.f403920f, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        l();
        k();
        return o(this.f403919e, this.f403920f, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        l();
        k();
        int i18 = this.f403920f;
        if (i17 < 0 || i17 >= i18) {
            throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
        }
        java.lang.Object[] objArr = this.f403918d;
        int i19 = this.f403919e;
        java.lang.Object obj2 = objArr[i19 + i17];
        objArr[i19 + i17] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.List subList(int i17, int i18) {
        kz5.h.f395506d.a(i17, i18, this.f403920f);
        return new lz5.c(this.f403918d, this.f403919e + i17, i18 - i17, this, this.f403922h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        k();
        int length = array.length;
        int i17 = this.f403920f;
        int i18 = this.f403919e;
        if (length < i17) {
            java.lang.Object[] copyOfRange = java.util.Arrays.copyOfRange(this.f403918d, i18, i17 + i18, array.getClass());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        kz5.v.k(this.f403918d, array, 0, i18, i17 + i18);
        int i19 = this.f403920f;
        if (i19 < array.length) {
            array[i19] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        k();
        return lz5.f.b(this.f403918d, this.f403919e, this.f403920f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i17) {
        k();
        int i18 = this.f403920f;
        if (i17 >= 0 && i17 <= i18) {
            return new lz5.b(this, i17);
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        l();
        k();
        int i18 = this.f403920f;
        if (i17 >= 0 && i17 <= i18) {
            j(this.f403919e + i17, obj);
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i17, java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        l();
        k();
        int i18 = this.f403920f;
        if (i17 >= 0 && i17 <= i18) {
            int size = elements.size();
            h(this.f403919e + i17, elements, size);
            return size > 0;
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
        k();
        java.lang.Object[] objArr = this.f403918d;
        int i17 = this.f403920f;
        int i18 = this.f403919e;
        return kz5.v.s(objArr, i18, i17 + i18);
    }
}

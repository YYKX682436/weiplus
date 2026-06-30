package o0;

/* loaded from: classes14.dex */
public final class f implements java.util.List, zz5.d {

    /* renamed from: d, reason: collision with root package name */
    public final o0.i f423377d;

    public f(o0.i vector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vector, "vector");
        this.f423377d = vector;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(java.lang.Object obj) {
        this.f423377d.b(obj);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i17, java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return this.f423377d.c(i17, elements);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f423377d.e();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f423377d.f(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        o0.i iVar = this.f423377d;
        iVar.getClass();
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!iVar.f(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        o0.j.a(this, i17);
        return this.f423377d.f423383d[i17];
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        return this.f423377d.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f423377d.i();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new o0.h(this, 0);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        o0.i iVar = this.f423377d;
        int i17 = iVar.f423385f;
        if (i17 <= 0) {
            return -1;
        }
        int i18 = i17 - 1;
        java.lang.Object[] objArr = iVar.f423383d;
        while (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, objArr[i18])) {
            i18--;
            if (i18 < 0) {
                return -1;
            }
        }
        return i18;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return new o0.h(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return this.f423377d.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        o0.i iVar = this.f423377d;
        iVar.getClass();
        if (elements.isEmpty()) {
            return false;
        }
        int i17 = iVar.f423385f;
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            iVar.k(it.next());
        }
        return i17 != iVar.f423385f;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        o0.i iVar = this.f423377d;
        iVar.getClass();
        int i17 = iVar.f423385f;
        for (int i18 = i17 - 1; -1 < i18; i18--) {
            if (!elements.contains(iVar.f423383d[i18])) {
                iVar.m(i18);
            }
        }
        return i17 != iVar.f423385f;
    }

    @Override // java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        o0.j.a(this, i17);
        java.lang.Object[] objArr = this.f423377d.f423383d;
        java.lang.Object obj2 = objArr[i17];
        objArr[i17] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f423377d.f423385f;
    }

    @Override // java.util.List
    public java.util.List subList(int i17, int i18) {
        o0.j.b(this, i17, i18);
        return new o0.g(this, i17, i18);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.a(this);
    }

    @Override // java.util.List
    public void add(int i17, java.lang.Object obj) {
        this.f423377d.a(i17, obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        o0.i iVar = this.f423377d;
        iVar.getClass();
        return iVar.c(iVar.f423385f, elements);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i17) {
        return new o0.h(this, i17);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i17) {
        o0.j.a(this, i17);
        return this.f423377d.m(i17);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.b(this, array);
    }
}

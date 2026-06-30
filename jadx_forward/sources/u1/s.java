package u1;

/* loaded from: classes13.dex */
public final class s implements java.util.List, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f505198d = new java.lang.Object[16];

    /* renamed from: e, reason: collision with root package name */
    public long[] f505199e = new long[16];

    /* renamed from: f, reason: collision with root package name */
    public int f505200f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f505201g;

    @Override // java.util.List
    public void add(int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i17, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f505200f = -1;
        g();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final long d() {
        long a17 = u1.t.a(Float.POSITIVE_INFINITY, false);
        int i17 = this.f505200f + 1;
        int h17 = kz5.c0.h(this);
        if (i17 <= h17) {
            while (true) {
                long j17 = this.f505199e[i17];
                if (u1.k.a(j17, a17) < 0) {
                    a17 = j17;
                }
                if (java.lang.Float.intBitsToFloat((int) (a17 >> 32)) < 0.0f && u1.k.b(a17)) {
                    return a17;
                }
                if (i17 == h17) {
                    break;
                }
                i17++;
            }
        }
        return a17;
    }

    public final void e(java.lang.Object obj, float f17, boolean z17, yz5.a childHitTest) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(childHitTest, "childHitTest");
        int i17 = this.f505200f;
        int i18 = i17 + 1;
        this.f505200f = i18;
        java.lang.Object[] objArr = this.f505198d;
        if (i18 >= objArr.length) {
            int length = objArr.length + 16;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(this, newSize)");
            this.f505198d = copyOf;
            long[] copyOf2 = java.util.Arrays.copyOf(this.f505199e, length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf2, "copyOf(this, newSize)");
            this.f505199e = copyOf2;
        }
        java.lang.Object[] objArr2 = this.f505198d;
        int i19 = this.f505200f;
        objArr2[i19] = obj;
        this.f505199e[i19] = u1.t.a(f17, z17);
        g();
        childHitTest.mo152xb9724478();
        this.f505200f = i17;
    }

    public final void g() {
        int i17 = this.f505200f + 1;
        int h17 = kz5.c0.h(this);
        if (i17 <= h17) {
            while (true) {
                this.f505198d[i17] = null;
                if (i17 == h17) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f505201g = this.f505200f + 1;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        return this.f505198d[i17];
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        int h17 = kz5.c0.h(this);
        if (h17 < 0) {
            return -1;
        }
        int i17 = 0;
        while (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f505198d[i17], obj)) {
            if (i17 == h17) {
                return -1;
            }
            i17++;
        }
        return i17;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f505201g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new u1.q(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        for (int h17 = kz5.c0.h(this); -1 < h17; h17--) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f505198d[h17], obj)) {
                return h17;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return new u1.q(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public java.lang.Object remove(int i17) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f505201g;
    }

    @Override // java.util.List
    public void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.util.List subList(int i17, int i18) {
        return new u1.r(this, i17, i18);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i17) {
        return new u1.q(this, i17, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.b(this, array);
    }
}

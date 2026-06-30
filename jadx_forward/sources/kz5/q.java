package kz5;

/* loaded from: classes12.dex */
public final class q extends kz5.l {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object[] f395530g = new java.lang.Object[0];

    /* renamed from: d, reason: collision with root package name */
    public int f395531d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object[] f395532e;

    /* renamed from: f, reason: collision with root package name */
    public int f395533f;

    public q(int i17) {
        java.lang.Object[] objArr;
        if (i17 == 0) {
            objArr = f395530g;
        } else if (i17 > 0) {
            objArr = new java.lang.Object[i17];
        } else {
            throw new java.lang.IllegalArgumentException("Illegal Capacity: " + i17);
        }
        this.f395532e = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        int i18 = this.f395533f;
        if (i17 < 0 || i17 > i18) {
            throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
        }
        if (i17 == i18) {
            m144678xbb8646d7(obj);
            return;
        }
        if (i17 == 0) {
            m144677xb4f1a68f(obj);
            return;
        }
        o();
        h(this.f395533f + 1);
        int n17 = n(this.f395531d + i17);
        int i19 = this.f395533f;
        if (i17 < ((i19 + 1) >> 1)) {
            int P = n17 == 0 ? kz5.z.P(this.f395532e) : n17 - 1;
            int i27 = this.f395531d;
            int P2 = i27 == 0 ? kz5.z.P(this.f395532e) : i27 - 1;
            int i28 = this.f395531d;
            if (P >= i28) {
                java.lang.Object[] objArr = this.f395532e;
                objArr[P2] = objArr[i28];
                kz5.v.k(objArr, objArr, i28, i28 + 1, P + 1);
            } else {
                java.lang.Object[] objArr2 = this.f395532e;
                kz5.v.k(objArr2, objArr2, i28 - 1, i28, objArr2.length);
                java.lang.Object[] objArr3 = this.f395532e;
                objArr3[objArr3.length - 1] = objArr3[0];
                kz5.v.k(objArr3, objArr3, 0, 1, P + 1);
            }
            this.f395532e[P] = obj;
            this.f395531d = P2;
        } else {
            int n18 = n(this.f395531d + i19);
            if (n17 < n18) {
                java.lang.Object[] objArr4 = this.f395532e;
                kz5.v.k(objArr4, objArr4, n17 + 1, n17, n18);
            } else {
                java.lang.Object[] objArr5 = this.f395532e;
                kz5.v.k(objArr5, objArr5, 1, 0, n18);
                java.lang.Object[] objArr6 = this.f395532e;
                objArr6[0] = objArr6[objArr6.length - 1];
                kz5.v.k(objArr6, objArr6, n17 + 1, n17, objArr6.length - 1);
            }
            this.f395532e[n17] = obj;
        }
        this.f395533f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i17, java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        int d17 = d();
        if (i17 >= 0 && i17 <= d17) {
            if (elements.isEmpty()) {
                return false;
            }
            if (i17 == d()) {
                return addAll(elements);
            }
            o();
            h(d() + elements.size());
            int n17 = n(this.f395531d + d());
            int n18 = n(this.f395531d + i17);
            int size = elements.size();
            if (i17 < ((d() + 1) >> 1)) {
                int i18 = this.f395531d;
                int i19 = i18 - size;
                if (n18 < i18) {
                    java.lang.Object[] objArr = this.f395532e;
                    kz5.v.k(objArr, objArr, i19, i18, objArr.length);
                    if (size >= n18) {
                        java.lang.Object[] objArr2 = this.f395532e;
                        kz5.v.k(objArr2, objArr2, objArr2.length - size, 0, n18);
                    } else {
                        java.lang.Object[] objArr3 = this.f395532e;
                        kz5.v.k(objArr3, objArr3, objArr3.length - size, 0, size);
                        java.lang.Object[] objArr4 = this.f395532e;
                        kz5.v.k(objArr4, objArr4, 0, size, n18);
                    }
                } else if (i19 >= 0) {
                    java.lang.Object[] objArr5 = this.f395532e;
                    kz5.v.k(objArr5, objArr5, i19, i18, n18);
                } else {
                    java.lang.Object[] objArr6 = this.f395532e;
                    i19 += objArr6.length;
                    int i27 = n18 - i18;
                    int length = objArr6.length - i19;
                    if (length >= i27) {
                        kz5.v.k(objArr6, objArr6, i19, i18, n18);
                    } else {
                        kz5.v.k(objArr6, objArr6, i19, i18, i18 + length);
                        java.lang.Object[] objArr7 = this.f395532e;
                        kz5.v.k(objArr7, objArr7, 0, this.f395531d + length, n18);
                    }
                }
                this.f395531d = i19;
                g(l(n18 - size), elements);
            } else {
                int i28 = n18 + size;
                if (n18 < n17) {
                    int i29 = size + n17;
                    java.lang.Object[] objArr8 = this.f395532e;
                    if (i29 <= objArr8.length) {
                        kz5.v.k(objArr8, objArr8, i28, n18, n17);
                    } else if (i28 >= objArr8.length) {
                        kz5.v.k(objArr8, objArr8, i28 - objArr8.length, n18, n17);
                    } else {
                        int length2 = n17 - (i29 - objArr8.length);
                        kz5.v.k(objArr8, objArr8, 0, length2, n17);
                        java.lang.Object[] objArr9 = this.f395532e;
                        kz5.v.k(objArr9, objArr9, i28, n18, length2);
                    }
                } else {
                    java.lang.Object[] objArr10 = this.f395532e;
                    kz5.v.k(objArr10, objArr10, size, 0, n17);
                    java.lang.Object[] objArr11 = this.f395532e;
                    if (i28 >= objArr11.length) {
                        kz5.v.k(objArr11, objArr11, i28 - objArr11.length, n18, objArr11.length);
                    } else {
                        kz5.v.k(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                        java.lang.Object[] objArr12 = this.f395532e;
                        kz5.v.k(objArr12, objArr12, i28, n18, objArr12.length - size);
                    }
                }
                g(n18, elements);
            }
            return true;
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + d17);
    }

    /* renamed from: addFirst */
    public final void m144677xb4f1a68f(java.lang.Object obj) {
        o();
        h(this.f395533f + 1);
        int i17 = this.f395531d;
        int P = i17 == 0 ? kz5.z.P(this.f395532e) : i17 - 1;
        this.f395531d = P;
        this.f395532e[P] = obj;
        this.f395533f++;
    }

    /* renamed from: addLast */
    public final void m144678xbb8646d7(java.lang.Object obj) {
        o();
        h(d() + 1);
        this.f395532e[n(this.f395531d + d())] = obj;
        this.f395533f = d() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            o();
            m(this.f395531d, n(this.f395531d + d()));
        }
        this.f395531d = 0;
        this.f395533f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kz5.l
    public int d() {
        return this.f395533f;
    }

    @Override // kz5.l
    public java.lang.Object e(int i17) {
        int d17 = d();
        if (i17 < 0 || i17 >= d17) {
            throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + d17);
        }
        if (i17 == kz5.c0.h(this)) {
            return m144680x41771d3a();
        }
        if (i17 == 0) {
            return m144679xed1b9c8c();
        }
        o();
        int n17 = n(this.f395531d + i17);
        java.lang.Object obj = this.f395532e[n17];
        if (i17 < (d() >> 1)) {
            int i18 = this.f395531d;
            if (n17 >= i18) {
                java.lang.Object[] objArr = this.f395532e;
                kz5.v.k(objArr, objArr, i18 + 1, i18, n17);
            } else {
                java.lang.Object[] objArr2 = this.f395532e;
                kz5.v.k(objArr2, objArr2, 1, 0, n17);
                java.lang.Object[] objArr3 = this.f395532e;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i19 = this.f395531d;
                kz5.v.k(objArr3, objArr3, i19 + 1, i19, objArr3.length - 1);
            }
            java.lang.Object[] objArr4 = this.f395532e;
            int i27 = this.f395531d;
            objArr4[i27] = null;
            this.f395531d = k(i27);
        } else {
            int n18 = n(this.f395531d + kz5.c0.h(this));
            if (n17 <= n18) {
                java.lang.Object[] objArr5 = this.f395532e;
                kz5.v.k(objArr5, objArr5, n17, n17 + 1, n18 + 1);
            } else {
                java.lang.Object[] objArr6 = this.f395532e;
                kz5.v.k(objArr6, objArr6, n17, n17 + 1, objArr6.length);
                java.lang.Object[] objArr7 = this.f395532e;
                objArr7[objArr7.length - 1] = objArr7[0];
                kz5.v.k(objArr7, objArr7, 0, 1, n18 + 1);
            }
            this.f395532e[n18] = null;
        }
        this.f395533f = d() - 1;
        return obj;
    }

    public final void g(int i17, java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        int length = this.f395532e.length;
        while (i17 < length && it.hasNext()) {
            this.f395532e[i17] = it.next();
            i17++;
        }
        int i18 = this.f395531d;
        for (int i19 = 0; i19 < i18 && it.hasNext(); i19++) {
            this.f395532e[i19] = it.next();
        }
        this.f395533f = d() + collection.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        int d17 = d();
        if (i17 >= 0 && i17 < d17) {
            return this.f395532e[n(this.f395531d + i17)];
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + d17);
    }

    public final void h(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalStateException("Deque is too big.");
        }
        java.lang.Object[] objArr = this.f395532e;
        if (i17 <= objArr.length) {
            return;
        }
        if (objArr == f395530g) {
            if (i17 < 10) {
                i17 = 10;
            }
            this.f395532e = new java.lang.Object[i17];
            return;
        }
        int length = objArr.length;
        int i18 = length + (length >> 1);
        if (i18 - i17 < 0) {
            i18 = i17;
        }
        if (i18 - 2147483639 > 0) {
            i18 = i17 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[i18];
        java.lang.Object[] objArr3 = this.f395532e;
        kz5.v.k(objArr3, objArr2, 0, this.f395531d, objArr3.length);
        java.lang.Object[] objArr4 = this.f395532e;
        int length2 = objArr4.length;
        int i19 = this.f395531d;
        kz5.v.k(objArr4, objArr2, length2 - i19, 0, i19);
        this.f395531d = 0;
        this.f395532e = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        int i17;
        int n17 = n(this.f395531d + d());
        int i18 = this.f395531d;
        if (i18 < n17) {
            while (i18 < n17) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f395532e[i18])) {
                    i17 = this.f395531d;
                } else {
                    i18++;
                }
            }
            return -1;
        }
        if (i18 < n17) {
            return -1;
        }
        int length = this.f395532e.length;
        while (true) {
            if (i18 >= length) {
                for (int i19 = 0; i19 < n17; i19++) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f395532e[i19])) {
                        i18 = i19 + this.f395532e.length;
                        i17 = this.f395531d;
                    }
                }
                return -1;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f395532e[i18])) {
                i17 = this.f395531d;
                break;
            }
            i18++;
        }
        return i18 - i17;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return d() == 0;
    }

    public final java.lang.Object j() {
        if (isEmpty()) {
            return null;
        }
        return this.f395532e[this.f395531d];
    }

    public final int k(int i17) {
        if (i17 == kz5.z.P(this.f395532e)) {
            return 0;
        }
        return i17 + 1;
    }

    public final int l(int i17) {
        return i17 < 0 ? i17 + this.f395532e.length : i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        int P;
        int i17;
        int n17 = n(this.f395531d + d());
        int i18 = this.f395531d;
        if (i18 < n17) {
            P = n17 - 1;
            if (i18 <= P) {
                while (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f395532e[P])) {
                    if (P != i18) {
                        P--;
                    }
                }
                i17 = this.f395531d;
                return P - i17;
            }
            return -1;
        }
        if (i18 > n17) {
            int i19 = n17 - 1;
            while (true) {
                if (-1 >= i19) {
                    P = kz5.z.P(this.f395532e);
                    int i27 = this.f395531d;
                    if (i27 <= P) {
                        while (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f395532e[P])) {
                            if (P != i27) {
                                P--;
                            }
                        }
                        i17 = this.f395531d;
                    }
                } else {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f395532e[i19])) {
                        P = i19 + this.f395532e.length;
                        i17 = this.f395531d;
                        break;
                    }
                    i19--;
                }
            }
        }
        return -1;
    }

    public final void m(int i17, int i18) {
        if (i17 < i18) {
            kz5.v.t(this.f395532e, null, i17, i18);
            return;
        }
        java.lang.Object[] objArr = this.f395532e;
        kz5.v.t(objArr, null, i17, objArr.length);
        kz5.v.t(this.f395532e, null, 0, i18);
    }

    public final int n(int i17) {
        java.lang.Object[] objArr = this.f395532e;
        return i17 >= objArr.length ? i17 - objArr.length : i17;
    }

    public final void o() {
        ((java.util.AbstractList) this).modCount++;
    }

    public final java.lang.Object p() {
        if (isEmpty()) {
            return null;
        }
        return m144679xed1b9c8c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        e(indexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection elements) {
        int n17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        boolean z17 = false;
        z17 = false;
        z17 = false;
        if (!isEmpty()) {
            if ((this.f395532e.length == 0) == false) {
                int n18 = n(this.f395531d + d());
                int i17 = this.f395531d;
                if (i17 < n18) {
                    n17 = i17;
                    while (i17 < n18) {
                        java.lang.Object obj = this.f395532e[i17];
                        if (!elements.contains(obj)) {
                            this.f395532e[n17] = obj;
                            n17++;
                        } else {
                            z17 = true;
                        }
                        i17++;
                    }
                    kz5.v.t(this.f395532e, null, n17, n18);
                } else {
                    int length = this.f395532e.length;
                    boolean z18 = false;
                    int i18 = i17;
                    while (i17 < length) {
                        java.lang.Object[] objArr = this.f395532e;
                        java.lang.Object obj2 = objArr[i17];
                        objArr[i17] = null;
                        if (!elements.contains(obj2)) {
                            this.f395532e[i18] = obj2;
                            i18++;
                        } else {
                            z18 = true;
                        }
                        i17++;
                    }
                    n17 = n(i18);
                    for (int i19 = 0; i19 < n18; i19++) {
                        java.lang.Object[] objArr2 = this.f395532e;
                        java.lang.Object obj3 = objArr2[i19];
                        objArr2[i19] = null;
                        if (!elements.contains(obj3)) {
                            this.f395532e[n17] = obj3;
                            n17 = k(n17);
                        } else {
                            z18 = true;
                        }
                    }
                    z17 = z18;
                }
                if (z17) {
                    o();
                    this.f395533f = l(n17 - this.f395531d);
                }
            }
        }
        return z17;
    }

    /* renamed from: removeFirst */
    public final java.lang.Object m144679xed1b9c8c() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        java.lang.Object[] objArr = this.f395532e;
        int i17 = this.f395531d;
        java.lang.Object obj = objArr[i17];
        objArr[i17] = null;
        this.f395531d = k(i17);
        this.f395533f = d() - 1;
        return obj;
    }

    /* renamed from: removeLast */
    public final java.lang.Object m144680x41771d3a() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        int n17 = n(this.f395531d + kz5.c0.h(this));
        java.lang.Object[] objArr = this.f395532e;
        java.lang.Object obj = objArr[n17];
        objArr[n17] = null;
        this.f395533f = d() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i17, int i18) {
        kz5.h.f395506d.a(i17, i18, d());
        int i19 = i18 - i17;
        if (i19 == 0) {
            return;
        }
        if (i19 == d()) {
            clear();
            return;
        }
        if (i19 == 1) {
            e(i17);
            return;
        }
        o();
        if (i17 < d() - i18) {
            int n17 = n(this.f395531d + (i17 - 1));
            int n18 = n(this.f395531d + (i18 - 1));
            while (i17 > 0) {
                int i27 = n17 + 1;
                int min = java.lang.Math.min(i17, java.lang.Math.min(i27, n18 + 1));
                java.lang.Object[] objArr = this.f395532e;
                int i28 = n18 - min;
                int i29 = n17 - min;
                kz5.v.k(objArr, objArr, i28 + 1, i29 + 1, i27);
                n17 = l(i29);
                n18 = l(i28);
                i17 -= min;
            }
            int n19 = n(this.f395531d + i19);
            m(this.f395531d, n19);
            this.f395531d = n19;
        } else {
            int n27 = n(this.f395531d + i18);
            int n28 = n(this.f395531d + i17);
            int d17 = d();
            while (true) {
                d17 -= i18;
                if (d17 <= 0) {
                    break;
                }
                java.lang.Object[] objArr2 = this.f395532e;
                i18 = java.lang.Math.min(d17, java.lang.Math.min(objArr2.length - n27, objArr2.length - n28));
                java.lang.Object[] objArr3 = this.f395532e;
                int i37 = n27 + i18;
                kz5.v.k(objArr3, objArr3, n28, n27, i37);
                n27 = n(i37);
                n28 = n(n28 + i18);
            }
            int n29 = n(this.f395531d + d());
            m(l(n29 - i19), n29);
        }
        this.f395533f = d() - i19;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection elements) {
        int n17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        boolean z17 = false;
        z17 = false;
        z17 = false;
        if (!isEmpty()) {
            if ((this.f395532e.length == 0) == false) {
                int n18 = n(this.f395531d + d());
                int i17 = this.f395531d;
                if (i17 < n18) {
                    n17 = i17;
                    while (i17 < n18) {
                        java.lang.Object obj = this.f395532e[i17];
                        if (elements.contains(obj)) {
                            this.f395532e[n17] = obj;
                            n17++;
                        } else {
                            z17 = true;
                        }
                        i17++;
                    }
                    kz5.v.t(this.f395532e, null, n17, n18);
                } else {
                    int length = this.f395532e.length;
                    boolean z18 = false;
                    int i18 = i17;
                    while (i17 < length) {
                        java.lang.Object[] objArr = this.f395532e;
                        java.lang.Object obj2 = objArr[i17];
                        objArr[i17] = null;
                        if (elements.contains(obj2)) {
                            this.f395532e[i18] = obj2;
                            i18++;
                        } else {
                            z18 = true;
                        }
                        i17++;
                    }
                    n17 = n(i18);
                    for (int i19 = 0; i19 < n18; i19++) {
                        java.lang.Object[] objArr2 = this.f395532e;
                        java.lang.Object obj3 = objArr2[i19];
                        objArr2[i19] = null;
                        if (elements.contains(obj3)) {
                            this.f395532e[n17] = obj3;
                            n17 = k(n17);
                        } else {
                            z18 = true;
                        }
                    }
                    z17 = z18;
                }
                if (z17) {
                    o();
                    this.f395533f = l(n17 - this.f395531d);
                }
            }
        }
        return z17;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        int d17 = d();
        if (i17 < 0 || i17 >= d17) {
            throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + d17);
        }
        int n17 = n(this.f395531d + i17);
        java.lang.Object[] objArr = this.f395532e;
        java.lang.Object obj2 = objArr[n17];
        objArr[n17] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[d()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        int length = array.length;
        int i17 = this.f395533f;
        if (length < i17) {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (java.lang.Object[]) newInstance;
        }
        int n17 = n(this.f395531d + this.f395533f);
        int i18 = this.f395531d;
        if (i18 < n17) {
            kz5.v.p(this.f395532e, array, 0, i18, n17, 2, null);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr = this.f395532e;
            kz5.v.k(objArr, array, 0, this.f395531d, objArr.length);
            java.lang.Object[] objArr2 = this.f395532e;
            kz5.v.k(objArr2, array, objArr2.length - this.f395531d, 0, n17);
        }
        int i19 = this.f395533f;
        if (i19 < array.length) {
            array[i19] = null;
        }
        return array;
    }

    public q() {
        this.f395532e = f395530g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        m144678xbb8646d7(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        o();
        h(d() + elements.size());
        g(n(this.f395531d + d()), elements);
        return true;
    }
}

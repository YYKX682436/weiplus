package q0;

/* loaded from: classes14.dex */
public final class h extends kz5.l implements p0.d {

    /* renamed from: d, reason: collision with root package name */
    public p0.e f440759d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object[] f440760e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object[] f440761f;

    /* renamed from: g, reason: collision with root package name */
    public int f440762g;

    /* renamed from: h, reason: collision with root package name */
    public t0.d f440763h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object[] f440764i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object[] f440765m;

    /* renamed from: n, reason: collision with root package name */
    public int f440766n;

    /* JADX WARN: Multi-variable type inference failed */
    public h(p0.e vector, java.lang.Object[] objArr, java.lang.Object[] vectorTail, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vector, "vector");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vectorTail, "vectorTail");
        this.f440759d = vector;
        this.f440760e = objArr;
        this.f440761f = vectorTail;
        this.f440762g = i17;
        this.f440763h = new t0.d();
        this.f440764i = objArr;
        this.f440765m = vectorTail;
        this.f440766n = ((kz5.b) vector).d();
    }

    public final java.lang.Object[] A(java.lang.Object[] objArr, int i17, int i18, java.util.Iterator it) {
        if (!it.hasNext()) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!(i18 >= 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (i18 == 0) {
            return (java.lang.Object[]) it.next();
        }
        java.lang.Object[] p17 = p(objArr);
        int i19 = (i17 >> i18) & 31;
        int i27 = i18 - 5;
        p17[i19] = A((java.lang.Object[]) p17[i19], i17, i27, it);
        while (true) {
            i19++;
            if (i19 >= 32 || !it.hasNext()) {
                break;
            }
            p17[i19] = A((java.lang.Object[]) p17[i19], 0, i27, it);
        }
        return p17;
    }

    public final java.lang.Object[] B(java.lang.Object[] objArr, int i17, java.lang.Object[][] objArr2) {
        java.util.Iterator a17 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(objArr2);
        int i18 = i17 >> 5;
        int i19 = this.f440762g;
        java.lang.Object[] A = i18 < (1 << i19) ? A(objArr, i17, i19, a17) : p(objArr);
        while (((p3321xbce91901.jvm.p3324x21ffc6bd.b) a17).hasNext()) {
            this.f440762g += 5;
            A = t(A);
            int i27 = this.f440762g;
            A(A, 1 << i27, i27, a17);
        }
        return A;
    }

    public final void D(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
        int d17 = d() >> 5;
        int i17 = this.f440762g;
        if (d17 > (1 << i17)) {
            this.f440764i = E(t(objArr), objArr2, this.f440762g + 5);
            this.f440765m = objArr3;
            this.f440762g += 5;
            this.f440766n = d() + 1;
            return;
        }
        if (objArr == null) {
            this.f440764i = objArr2;
            this.f440765m = objArr3;
            this.f440766n = d() + 1;
        } else {
            this.f440764i = E(objArr, objArr2, i17);
            this.f440765m = objArr3;
            this.f440766n = d() + 1;
        }
    }

    public final java.lang.Object[] E(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i17) {
        int d17 = ((d() - 1) >> i17) & 31;
        java.lang.Object[] p17 = p(objArr);
        if (i17 == 5) {
            p17[d17] = objArr2;
        } else {
            p17[d17] = E((java.lang.Object[]) p17[d17], objArr2, i17 - 5);
        }
        return p17;
    }

    public final int G(yz5.l lVar, java.lang.Object[] objArr, int i17, int i18, q0.e eVar, java.util.List list, java.util.List list2) {
        if (n(objArr)) {
            list.add(objArr);
        }
        java.lang.Object obj = eVar.f440753a;
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
        java.lang.Object[] objArr3 = objArr2;
        for (int i19 = 0; i19 < i17; i19++) {
            java.lang.Object obj2 = objArr[i19];
            if (!((java.lang.Boolean) lVar.mo146xb9724478(obj2)).booleanValue()) {
                if (i18 == 32) {
                    objArr3 = list.isEmpty() ^ true ? (java.lang.Object[]) list.remove(list.size() - 1) : s();
                    i18 = 0;
                }
                objArr3[i18] = obj2;
                i18++;
            }
        }
        eVar.f440753a = objArr3;
        if (objArr2 != objArr3) {
            list2.add(objArr2);
        }
        return i18;
    }

    public final int H(yz5.l lVar, java.lang.Object[] objArr, int i17, q0.e eVar) {
        java.lang.Object[] objArr2 = objArr;
        int i18 = i17;
        boolean z17 = false;
        for (int i19 = 0; i19 < i17; i19++) {
            java.lang.Object obj = objArr[i19];
            if (((java.lang.Boolean) lVar.mo146xb9724478(obj)).booleanValue()) {
                if (!z17) {
                    objArr2 = p(objArr);
                    z17 = true;
                    i18 = i19;
                }
            } else if (z17) {
                objArr2[i18] = obj;
                i18++;
            }
        }
        eVar.f440753a = objArr2;
        return i18;
    }

    public final int K(yz5.l lVar, int i17, q0.e eVar) {
        int H = H(lVar, this.f440765m, i17, eVar);
        if (H == i17) {
            return i17;
        }
        java.lang.Object obj = eVar.f440753a;
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        java.util.Arrays.fill(objArr, H, i17, (java.lang.Object) null);
        this.f440765m = objArr;
        this.f440766n = d() - (i17 - H);
        return H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r0 != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (K(r20, r10, r11) != r10) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L(yz5.l r20) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h.L(yz5.l):boolean");
    }

    public final java.lang.Object[] M(java.lang.Object[] objArr, int i17, int i18, q0.e eVar) {
        int i19 = (i18 >> i17) & 31;
        if (i17 == 0) {
            java.lang.Object obj = objArr[i19];
            java.lang.Object[] p17 = p(objArr);
            kz5.v.k(objArr, p17, i19, i19 + 1, 32);
            p17[31] = eVar.f440753a;
            eVar.f440753a = obj;
            return p17;
        }
        int O = objArr[31] == null ? 31 & ((O() - 1) >> i17) : 31;
        java.lang.Object[] p18 = p(objArr);
        int i27 = i17 - 5;
        int i28 = i19 + 1;
        if (i28 <= O) {
            while (true) {
                java.lang.Object obj2 = p18[O];
                if (obj2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                p18[O] = M((java.lang.Object[]) obj2, i27, 0, eVar);
                if (O == i28) {
                    break;
                }
                O--;
            }
        }
        java.lang.Object obj3 = p18[i19];
        if (obj3 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        p18[i19] = M((java.lang.Object[]) obj3, i27, i18, eVar);
        return p18;
    }

    public final java.lang.Object N(java.lang.Object[] objArr, int i17, int i18, int i19) {
        int d17 = d() - i17;
        if (d17 == 1) {
            java.lang.Object obj = this.f440765m[0];
            y(objArr, i17, i18);
            return obj;
        }
        java.lang.Object[] objArr2 = this.f440765m;
        java.lang.Object obj2 = objArr2[i19];
        java.lang.Object[] p17 = p(objArr2);
        kz5.v.k(objArr2, p17, i19, i19 + 1, d17);
        p17[d17 - 1] = null;
        this.f440764i = objArr;
        this.f440765m = p17;
        this.f440766n = (i17 + d17) - 1;
        this.f440762g = i18;
        return obj2;
    }

    public final int O() {
        if (d() <= 32) {
            return 0;
        }
        return (d() - 1) & (-32);
    }

    public final java.lang.Object[] P(java.lang.Object[] objArr, int i17, int i18, java.lang.Object obj, q0.e eVar) {
        int i19 = (i18 >> i17) & 31;
        java.lang.Object[] p17 = p(objArr);
        if (i17 == 0) {
            if (p17 != objArr) {
                ((java.util.AbstractList) this).modCount++;
            }
            eVar.f440753a = p17[i19];
            p17[i19] = obj;
            return p17;
        }
        java.lang.Object obj2 = p17[i19];
        if (obj2 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        p17[i19] = P((java.lang.Object[]) obj2, i17 - 5, i18, obj, eVar);
        return p17;
    }

    public final void Q(java.util.Collection collection, int i17, java.lang.Object[] objArr, int i18, java.lang.Object[][] objArr2, int i19, java.lang.Object[] objArr3) {
        java.lang.Object[] s17;
        if (!(i19 >= 1)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.Object[] p17 = p(objArr);
        objArr2[0] = p17;
        int i27 = i17 & 31;
        int size = ((i17 + collection.size()) - 1) & 31;
        int i28 = (i18 - i27) + size;
        if (i28 < 32) {
            kz5.v.k(p17, objArr3, size + 1, i27, i18);
        } else {
            int i29 = (i28 - 32) + 1;
            if (i19 == 1) {
                s17 = p17;
            } else {
                s17 = s();
                i19--;
                objArr2[i19] = s17;
            }
            int i37 = i18 - i29;
            kz5.v.k(p17, objArr3, 0, i37, i18);
            kz5.v.k(p17, s17, size + 1, i27, i37);
            objArr3 = s17;
        }
        java.util.Iterator it = collection.iterator();
        h(p17, i27, it);
        for (int i38 = 1; i38 < i19; i38++) {
            java.lang.Object[] s18 = s();
            h(s18, 0, it);
            objArr2[i38] = s18;
        }
        h(objArr3, 0, it);
    }

    public final int R() {
        int i17 = this.f440766n;
        return i17 <= 32 ? i17 : i17 - ((i17 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        t0.c.b(i17, d());
        if (i17 == d()) {
            add(obj);
            return;
        }
        ((java.util.AbstractList) this).modCount++;
        int O = O();
        if (i17 >= O) {
            m(this.f440764i, i17 - O, obj);
            return;
        }
        q0.e eVar = new q0.e(null);
        java.lang.Object[] objArr = this.f440764i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
        m(l(objArr, this.f440762g, i17, obj, eVar), 0, eVar.f440753a);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i17, java.util.Collection elements) {
        java.lang.Object[] s17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        t0.c.b(i17, this.f440766n);
        if (i17 == this.f440766n) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((java.util.AbstractList) this).modCount++;
        int i18 = (i17 >> 5) << 5;
        int size = (((this.f440766n - i18) + elements.size()) - 1) / 32;
        if (size == 0) {
            int i19 = i17 & 31;
            int size2 = ((elements.size() + i17) - 1) & 31;
            java.lang.Object[] objArr = this.f440765m;
            java.lang.Object[] p17 = p(objArr);
            kz5.v.k(objArr, p17, size2 + 1, i19, R());
            h(p17, i19, elements.iterator());
            this.f440765m = p17;
            this.f440766n += elements.size();
            return true;
        }
        java.lang.Object[][] objArr2 = new java.lang.Object[size];
        int R = R();
        int size3 = this.f440766n + elements.size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i17 >= O()) {
            s17 = s();
            Q(elements, i17, this.f440765m, R, objArr2, size, s17);
        } else if (size3 > R) {
            int i27 = size3 - R;
            s17 = r(this.f440765m, i27);
            k(elements, i17, i27, objArr2, size, s17);
        } else {
            java.lang.Object[] objArr3 = this.f440765m;
            s17 = s();
            int i28 = R - size3;
            kz5.v.k(objArr3, s17, 0, i28, R);
            int i29 = 32 - i28;
            java.lang.Object[] r17 = r(this.f440765m, i29);
            int i37 = size - 1;
            objArr2[i37] = r17;
            k(elements, i17, i29, objArr2, i37, r17);
        }
        this.f440764i = B(this.f440764i, i18, objArr2);
        this.f440765m = s17;
        this.f440766n += elements.size();
        return true;
    }

    @Override // kz5.l
    public int d() {
        return this.f440766n;
    }

    @Override // kz5.l
    public java.lang.Object e(int i17) {
        t0.c.a(i17, d());
        ((java.util.AbstractList) this).modCount++;
        int O = O();
        if (i17 >= O) {
            return N(this.f440764i, O, this.f440762g, i17 - O);
        }
        q0.e eVar = new q0.e(this.f440765m[0]);
        java.lang.Object[] objArr = this.f440764i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
        N(M(objArr, this.f440762g, i17, eVar), O, this.f440762g, 0);
        return eVar.f440753a;
    }

    public p0.e g() {
        p0.e fVar;
        java.lang.Object[] objArr = this.f440764i;
        if (objArr == this.f440760e && this.f440765m == this.f440761f) {
            fVar = this.f440759d;
        } else {
            this.f440763h = new t0.d();
            this.f440760e = objArr;
            java.lang.Object[] objArr2 = this.f440765m;
            this.f440761f = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    fVar = q0.l.f440774f;
                } else {
                    java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.f440765m, d());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(this, newSize)");
                    fVar = new q0.l(copyOf);
                }
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
                fVar = new q0.f(objArr, this.f440765m, d(), this.f440762g);
            }
        }
        this.f440759d = fVar;
        return fVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        java.lang.Object[] objArr;
        t0.c.a(i17, d());
        if (O() <= i17) {
            objArr = this.f440765m;
        } else {
            objArr = this.f440764i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
            for (int i18 = this.f440762g; i18 > 0; i18 -= 5) {
                java.lang.Object obj = objArr[(i17 >> i18) & 31];
                if (obj == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArr = (java.lang.Object[]) obj;
            }
        }
        return objArr[i17 & 31];
    }

    public final java.lang.Object[] h(java.lang.Object[] objArr, int i17, java.util.Iterator it) {
        while (i17 < 32 && it.hasNext()) {
            objArr[i17] = it.next();
            i17++;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return listIterator(0);
    }

    public final int j() {
        return ((java.util.AbstractList) this).modCount;
    }

    public final void k(java.util.Collection collection, int i17, int i18, java.lang.Object[][] objArr, int i19, java.lang.Object[] objArr2) {
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4 = this.f440764i;
        if (objArr4 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        int i27 = i17 >> 5;
        if (objArr4 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        java.util.ListIterator o17 = o(O() >> 5);
        java.lang.Object[] objArr5 = objArr2;
        int i28 = i19;
        while (((q0.a) o17).f440749d - 1 != i27) {
            java.lang.Object[] objArr6 = (java.lang.Object[]) o17.previous();
            kz5.v.k(objArr6, objArr5, 0, 32 - i18, 32);
            objArr5 = r(objArr6, i18);
            i28--;
            objArr[i28] = objArr5;
        }
        java.lang.Object[] objArr7 = (java.lang.Object[]) o17.previous();
        int O = i19 - (((O() >> 5) - 1) - i27);
        if (O < i19) {
            java.lang.Object[] objArr8 = objArr[O];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr8);
            objArr3 = objArr8;
        } else {
            objArr3 = objArr2;
        }
        Q(collection, i17, objArr7, 32, objArr, O, objArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object[] l(java.lang.Object[] r9, int r10, int r11, java.lang.Object r12, q0.e r13) {
        /*
            r8 = this;
            int r0 = r11 >> r10
            r1 = 31
            r0 = r0 & r1
            if (r10 != 0) goto L17
            r10 = r9[r1]
            r13.f440753a = r10
            java.lang.Object[] r10 = r8.p(r9)
            int r11 = r0 + 1
            kz5.v.k(r9, r10, r11, r0, r1)
            r10[r0] = r12
            return r10
        L17:
            java.lang.Object[] r9 = r8.p(r9)
            int r10 = r10 + (-5)
            r1 = r9[r0]
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            if (r1 == 0) goto L54
            r2 = r1
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object[] r11 = r1.l(r2, r3, r4, r5, r6)
            r9[r0] = r11
        L31:
            int r0 = r0 + 1
            r11 = 32
            if (r0 >= r11) goto L53
            r11 = r9[r0]
            if (r11 == 0) goto L53
            if (r11 == 0) goto L4d
            r2 = r11
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r4 = 0
            java.lang.Object r5 = r13.f440753a
            r1 = r8
            r3 = r10
            r6 = r13
            java.lang.Object[] r11 = r1.l(r2, r3, r4, r5, r6)
            r9[r0] = r11
            goto L31
        L4d:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r7)
            throw r9
        L53:
            return r9
        L54:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h.l(java.lang.Object[], int, int, java.lang.Object, q0.e):java.lang.Object[]");
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i17) {
        t0.c.b(i17, d());
        return new q0.j(this, i17);
    }

    public final void m(java.lang.Object[] objArr, int i17, java.lang.Object obj) {
        int R = R();
        java.lang.Object[] p17 = p(this.f440765m);
        if (R < 32) {
            kz5.v.k(this.f440765m, p17, i17 + 1, i17, R);
            p17[i17] = obj;
            this.f440764i = objArr;
            this.f440765m = p17;
            this.f440766n = d() + 1;
            return;
        }
        java.lang.Object[] objArr2 = this.f440765m;
        java.lang.Object obj2 = objArr2[31];
        kz5.v.k(objArr2, p17, i17 + 1, i17, 31);
        p17[i17] = obj;
        D(objArr, p17, t(obj2));
    }

    public final boolean n(java.lang.Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f440763h;
    }

    public final java.util.ListIterator o(int i17) {
        if (this.f440764i == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        int O = O() >> 5;
        t0.c.b(i17, O);
        int i18 = this.f440762g;
        if (i18 == 0) {
            java.lang.Object[] objArr = this.f440764i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
            return new q0.k(objArr, i17);
        }
        java.lang.Object[] objArr2 = this.f440764i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr2);
        return new q0.m(objArr2, i17, O, i18 / 5);
    }

    public final java.lang.Object[] p(java.lang.Object[] objArr) {
        if (objArr == null) {
            return s();
        }
        if (n(objArr)) {
            return objArr;
        }
        java.lang.Object[] s17 = s();
        int length = objArr.length;
        kz5.v.p(objArr, s17, 0, 0, length > 32 ? 32 : length, 6, null);
        return s17;
    }

    public final java.lang.Object[] r(java.lang.Object[] objArr, int i17) {
        if (n(objArr)) {
            kz5.v.k(objArr, objArr, i17, 0, 32 - i17);
            return objArr;
        }
        java.lang.Object[] s17 = s();
        kz5.v.k(objArr, s17, i17, 0, 32 - i17);
        return s17;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return L(new q0.g(elements));
    }

    public final java.lang.Object[] s() {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[32] = this.f440763h;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        t0.c.a(i17, d());
        if (O() > i17) {
            q0.e eVar = new q0.e(null);
            java.lang.Object[] objArr = this.f440764i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
            this.f440764i = P(objArr, this.f440762g, i17, obj, eVar);
            return eVar.f440753a;
        }
        java.lang.Object[] p17 = p(this.f440765m);
        if (p17 != this.f440765m) {
            ((java.util.AbstractList) this).modCount++;
        }
        int i18 = i17 & 31;
        java.lang.Object obj2 = p17[i18];
        p17[i18] = obj;
        this.f440765m = p17;
        return obj2;
    }

    public final java.lang.Object[] t(java.lang.Object obj) {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[0] = obj;
        objArr[32] = this.f440763h;
        return objArr;
    }

    public final java.lang.Object[] u(java.lang.Object[] objArr, int i17, int i18) {
        if (!(i18 >= 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (i18 == 0) {
            return objArr;
        }
        int i19 = (i17 >> i18) & 31;
        java.lang.Object obj = objArr[i19];
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        java.lang.Object u17 = u((java.lang.Object[]) obj, i17, i18 - 5);
        if (i19 < 31) {
            int i27 = i19 + 1;
            if (objArr[i27] != null) {
                if (n(objArr)) {
                    java.util.Arrays.fill(objArr, i27, 32, (java.lang.Object) null);
                }
                java.lang.Object[] s17 = s();
                kz5.v.k(objArr, s17, 0, 0, i27);
                objArr = s17;
            }
        }
        if (u17 == objArr[i19]) {
            return objArr;
        }
        java.lang.Object[] p17 = p(objArr);
        p17[i19] = u17;
        return p17;
    }

    public final java.lang.Object[] w(java.lang.Object[] objArr, int i17, int i18, q0.e eVar) {
        java.lang.Object[] w17;
        int i19 = ((i18 - 1) >> i17) & 31;
        if (i17 == 5) {
            eVar.f440753a = objArr[i19];
            w17 = null;
        } else {
            java.lang.Object obj = objArr[i19];
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            w17 = w((java.lang.Object[]) obj, i17 - 5, i18, eVar);
        }
        if (w17 == null && i19 == 0) {
            return null;
        }
        java.lang.Object[] p17 = p(objArr);
        p17[i19] = w17;
        return p17;
    }

    public final void y(java.lang.Object[] objArr, int i17, int i18) {
        if (i18 == 0) {
            this.f440764i = null;
            if (objArr == null) {
                objArr = new java.lang.Object[0];
            }
            this.f440765m = objArr;
            this.f440766n = i17;
            this.f440762g = i18;
            return;
        }
        q0.e eVar = new q0.e(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
        java.lang.Object[] w17 = w(objArr, i18, i17, eVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w17);
        java.lang.Object obj = eVar.f440753a;
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        this.f440765m = (java.lang.Object[]) obj;
        this.f440766n = i17;
        if (w17[1] == null) {
            this.f440764i = (java.lang.Object[]) w17[0];
            this.f440762g = i18 - 5;
        } else {
            this.f440764i = w17;
            this.f440762g = i18;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        ((java.util.AbstractList) this).modCount++;
        int R = R();
        if (R < 32) {
            java.lang.Object[] p17 = p(this.f440765m);
            p17[R] = obj;
            this.f440765m = p17;
            this.f440766n = d() + 1;
        } else {
            D(this.f440764i, this.f440765m, t(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((java.util.AbstractList) this).modCount++;
        int R = R();
        java.util.Iterator it = elements.iterator();
        if (32 - R >= elements.size()) {
            java.lang.Object[] p17 = p(this.f440765m);
            h(p17, R, it);
            this.f440765m = p17;
            this.f440766n = d() + elements.size();
        } else {
            int size = ((elements.size() + R) - 1) / 32;
            java.lang.Object[][] objArr = new java.lang.Object[size];
            java.lang.Object[] p18 = p(this.f440765m);
            h(p18, R, it);
            objArr[0] = p18;
            for (int i17 = 1; i17 < size; i17++) {
                java.lang.Object[] s17 = s();
                h(s17, 0, it);
                objArr[i17] = s17;
            }
            this.f440764i = B(this.f440764i, O(), objArr);
            java.lang.Object[] s18 = s();
            h(s18, 0, it);
            this.f440765m = s18;
            this.f440766n = d() + elements.size();
        }
        return true;
    }
}

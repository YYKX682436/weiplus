package o0;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int[] f423373a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f423374b;

    /* renamed from: c, reason: collision with root package name */
    public o0.d[] f423375c;

    /* renamed from: d, reason: collision with root package name */
    public int f423376d;

    public e() {
        int[] iArr = new int[50];
        for (int i17 = 0; i17 < 50; i17++) {
            iArr[i17] = i17;
        }
        this.f423373a = iArr;
        this.f423374b = new java.lang.Object[50];
        this.f423375c = new o0.d[50];
    }

    public final boolean a(java.lang.Object value, java.lang.Object scope) {
        int i17;
        o0.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        if (this.f423376d > 0) {
            i17 = b(value);
            if (i17 >= 0) {
                dVar = d(i17);
                return dVar.add(scope);
            }
        } else {
            i17 = -1;
        }
        int i18 = -(i17 + 1);
        int i19 = this.f423376d;
        int[] iArr = this.f423373a;
        if (i19 < iArr.length) {
            int i27 = iArr[i19];
            this.f423374b[i27] = value;
            o0.d[] dVarArr = this.f423375c;
            o0.d dVar2 = dVarArr[i27];
            if (dVar2 == null) {
                dVar2 = new o0.d();
                dVarArr[i27] = dVar2;
            }
            dVar = dVar2;
            if (i18 < i19) {
                kz5.v.j(iArr, iArr, i18 + 1, i18, i19);
            }
            this.f423373a[i18] = i27;
            this.f423376d++;
        } else {
            int length = iArr.length * 2;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.f423375c, length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(this, newSize)");
            o0.d[] dVarArr2 = (o0.d[]) copyOf;
            this.f423375c = dVarArr2;
            o0.d dVar3 = new o0.d();
            dVarArr2[i19] = dVar3;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.f423374b, length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf2, "copyOf(this, newSize)");
            this.f423374b = copyOf2;
            copyOf2[i19] = value;
            int[] iArr2 = new int[length];
            int i28 = this.f423376d;
            while (true) {
                i28++;
                if (i28 >= length) {
                    break;
                }
                iArr2[i28] = i28;
            }
            int i29 = this.f423376d;
            if (i18 < i29) {
                kz5.v.j(this.f423373a, iArr2, i18 + 1, i18, i29);
            }
            iArr2[i18] = i19;
            if (i18 > 0) {
                kz5.v.n(this.f423373a, iArr2, 0, 0, i18, 6, null);
            }
            this.f423373a = iArr2;
            this.f423376d++;
            dVar = dVar3;
        }
        return dVar.add(scope);
    }

    public final int b(java.lang.Object obj) {
        int identityHashCode = java.lang.System.identityHashCode(obj);
        int i17 = this.f423376d - 1;
        int i18 = 0;
        while (i18 <= i17) {
            int i19 = (i18 + i17) >>> 1;
            java.lang.Object obj2 = this.f423374b[this.f423373a[i19]];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
            int identityHashCode2 = java.lang.System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i18 = i19 + 1;
            } else {
                if (identityHashCode2 <= identityHashCode) {
                    if (obj == obj2) {
                        return i19;
                    }
                    for (int i27 = i19 - 1; -1 < i27; i27--) {
                        java.lang.Object obj3 = this.f423374b[this.f423373a[i27]];
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
                        if (obj3 == obj) {
                            return i27;
                        }
                        if (java.lang.System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        }
                    }
                    int i28 = i19 + 1;
                    int i29 = this.f423376d;
                    while (true) {
                        if (i28 >= i29) {
                            i28 = this.f423376d;
                            break;
                        }
                        java.lang.Object obj4 = this.f423374b[this.f423373a[i28]];
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj4);
                        if (obj4 == obj) {
                            return i28;
                        }
                        if (java.lang.System.identityHashCode(obj4) != identityHashCode) {
                            break;
                        }
                        i28++;
                    }
                    return -(i28 + 1);
                }
                i17 = i19 - 1;
            }
        }
        return -(i18 + 1);
    }

    public final boolean c(java.lang.Object value, java.lang.Object scope) {
        int i17;
        o0.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        int b17 = b(value);
        if (b17 < 0 || (dVar = this.f423375c[(i17 = this.f423373a[b17])]) == null) {
            return false;
        }
        boolean remove = dVar.remove(scope);
        if (dVar.f423371d == 0) {
            int i18 = b17 + 1;
            int i19 = this.f423376d;
            if (i18 < i19) {
                int[] iArr = this.f423373a;
                kz5.v.j(iArr, iArr, b17, i18, i19);
            }
            int[] iArr2 = this.f423373a;
            int i27 = this.f423376d;
            iArr2[i27 - 1] = i17;
            this.f423374b[i17] = null;
            this.f423376d = i27 - 1;
        }
        return remove;
    }

    public final o0.d d(int i17) {
        o0.d dVar = this.f423375c[this.f423373a[i17]];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        return dVar;
    }
}

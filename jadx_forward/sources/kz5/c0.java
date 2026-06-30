package kz5;

/* loaded from: classes5.dex */
public abstract class c0 extends kz5.b0 {
    public static final java.util.ArrayList d(java.lang.Object... elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return elements.length == 0 ? new java.util.ArrayList() : new java.util.ArrayList(new kz5.p(elements, true));
    }

    public static final int e(java.util.List list, int i17, int i18, yz5.l comparison) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comparison, "comparison");
        m(list.size(), i17, i18);
        int i19 = i18 - 1;
        while (i17 <= i19) {
            int i27 = (i17 + i19) >>> 1;
            int intValue = ((java.lang.Number) comparison.mo146xb9724478(list.get(i27))).intValue();
            if (intValue < 0) {
                i17 = i27 + 1;
            } else {
                if (intValue <= 0) {
                    return i27;
                }
                i19 = i27 - 1;
            }
        }
        return -(i17 + 1);
    }

    public static int f(java.util.List list, java.lang.Comparable comparable, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i17 = 0;
        }
        if ((i19 & 4) != 0) {
            i18 = list.size();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        m(list.size(), i17, i18);
        int i27 = i18 - 1;
        while (i17 <= i27) {
            int i28 = (i17 + i27) >>> 1;
            int b17 = mz5.a.b((java.lang.Comparable) list.get(i28), comparable);
            if (b17 < 0) {
                i17 = i28 + 1;
            } else {
                if (b17 <= 0) {
                    return i28;
                }
                i27 = i28 - 1;
            }
        }
        return -(i17 + 1);
    }

    public static final e06.k g(java.util.Collection collection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection, "<this>");
        return new e06.k(0, collection.size() - 1);
    }

    public static final int h(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        return list.size() - 1;
    }

    public static final java.util.List i(java.lang.Object... elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return elements.length > 0 ? kz5.v.f(elements) : kz5.p0.f395529d;
    }

    public static final java.util.List j(java.lang.Object obj) {
        return obj != null ? kz5.b0.c(obj) : kz5.p0.f395529d;
    }

    public static final java.util.List k(java.lang.Object... elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return elements.length == 0 ? new java.util.ArrayList() : new java.util.ArrayList(new kz5.p(elements, true));
    }

    public static final java.util.List l(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : kz5.b0.c(list.get(0)) : kz5.p0.f395529d;
    }

    public static final void m(int i17, int i18, int i19) {
        if (i18 > i19) {
            throw new java.lang.IllegalArgumentException("fromIndex (" + i18 + ") is greater than toIndex (" + i19 + ").");
        }
        if (i18 < 0) {
            throw new java.lang.IndexOutOfBoundsException("fromIndex (" + i18 + ") is less than zero.");
        }
        if (i19 <= i17) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i19 + ") is greater than size (" + i17 + ").");
    }

    public static final java.util.List n(java.lang.Iterable iterable, c06.e random) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iterable, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(random, "random");
        java.util.List U0 = kz5.n0.U0(iterable);
        for (int h17 = h(U0); h17 > 0; h17--) {
            int d17 = random.d(h17 + 1);
            U0.set(d17, U0.set(h17, U0.get(d17)));
        }
        return U0;
    }

    public static final void o() {
        throw new java.lang.ArithmeticException("Count overflow has happened.");
    }

    public static final void p() {
        throw new java.lang.ArithmeticException("Index overflow has happened.");
    }
}

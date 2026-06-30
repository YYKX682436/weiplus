package q26;

/* loaded from: classes12.dex */
public abstract class h0 extends q26.z {
    public static final int f(q26.n nVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        java.util.Iterator mo144672x467c086e = nVar.mo144672x467c086e();
        int i17 = 0;
        while (mo144672x467c086e.hasNext()) {
            mo144672x467c086e.next();
            i17++;
            if (i17 < 0) {
                kz5.c0.o();
                throw null;
            }
        }
        return i17;
    }

    public static final java.lang.Object g(q26.n nVar, int i17, yz5.l defaultValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultValue, "defaultValue");
        if (i17 < 0) {
            return defaultValue.mo146xb9724478(java.lang.Integer.valueOf(i17));
        }
        int i18 = 0;
        for (java.lang.Object obj : nVar) {
            int i19 = i18 + 1;
            if (i17 == i18) {
                return obj;
            }
            i18 = i19;
        }
        return defaultValue.mo146xb9724478(java.lang.Integer.valueOf(i17));
    }

    public static final java.lang.Object h(q26.n nVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        if (i17 < 0) {
            return null;
        }
        int i18 = 0;
        for (java.lang.Object obj : nVar) {
            int i19 = i18 + 1;
            if (i17 == i18) {
                return obj;
            }
            i18 = i19;
        }
        return null;
    }

    public static final q26.n i(q26.n nVar, yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return new q26.i(nVar, true, predicate);
    }

    public static final q26.n j(q26.n nVar, yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return new q26.i(nVar, false, predicate);
    }

    public static final java.lang.Object k(q26.n nVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        java.util.Iterator mo144672x467c086e = nVar.mo144672x467c086e();
        if (mo144672x467c086e.hasNext()) {
            return mo144672x467c086e.next();
        }
        throw new java.util.NoSuchElementException("Sequence is empty.");
    }

    public static final java.lang.Object l(q26.n nVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        java.util.Iterator mo144672x467c086e = nVar.mo144672x467c086e();
        if (mo144672x467c086e.hasNext()) {
            return mo144672x467c086e.next();
        }
        return null;
    }

    public static final q26.n m(q26.n nVar, yz5.l transform) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transform, "transform");
        return new q26.k(nVar, transform, q26.d0.f441368d);
    }

    public static final int n(q26.n nVar, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        int i17 = 0;
        for (java.lang.Object obj2 : nVar) {
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, obj2)) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    public static final q26.n o(q26.n nVar, yz5.l transform) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transform, "transform");
        return new q26.r0(nVar, transform);
    }

    public static final q26.n p(q26.n nVar, yz5.l transform) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transform, "transform");
        return j(new q26.r0(nVar, transform), q26.c0.f441365d);
    }

    public static final java.lang.Comparable q(q26.n nVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        java.util.Iterator mo144672x467c086e = nVar.mo144672x467c086e();
        if (!mo144672x467c086e.hasNext()) {
            return null;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) mo144672x467c086e.next();
        while (mo144672x467c086e.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) mo144672x467c086e.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final q26.n r(q26.n nVar, yz5.l action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return o(nVar, new q26.e0(action));
    }

    public static final q26.n s(q26.n nVar, java.lang.Iterable elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return q26.y.c(kz5.z.C(new q26.n[]{nVar, kz5.n0.J(elements)}));
    }

    public static final q26.n t(q26.n nVar, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        return q26.y.c(kz5.z.C(new q26.n[]{nVar, kz5.z.C(new java.lang.Object[]{obj})}));
    }

    public static final q26.n u(q26.n nVar, q26.n elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return q26.y.c(kz5.z.C(new q26.n[]{nVar, elements}));
    }

    public static final q26.n v(q26.n nVar, java.util.Comparator comparator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comparator, "comparator");
        return new q26.g0(nVar, comparator);
    }

    public static final q26.n w(q26.n nVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        if (i17 >= 0) {
            return i17 == 0 ? q26.g.f441373a : nVar instanceof q26.f ? ((q26.f) nVar).b(i17) : new q26.l0(nVar, i17);
        }
        throw new java.lang.IllegalArgumentException(("Requested element count " + i17 + " is less than zero.").toString());
    }

    public static final java.util.Collection x(q26.n nVar, java.util.Collection destination) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destination, "destination");
        java.util.Iterator mo144672x467c086e = nVar.mo144672x467c086e();
        while (mo144672x467c086e.hasNext()) {
            destination.add(mo144672x467c086e.next());
        }
        return destination;
    }

    public static final java.util.List y(q26.n nVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        java.util.Iterator mo144672x467c086e = nVar.mo144672x467c086e();
        if (!mo144672x467c086e.hasNext()) {
            return kz5.p0.f395529d;
        }
        java.lang.Object next = mo144672x467c086e.next();
        if (!mo144672x467c086e.hasNext()) {
            return kz5.b0.c(next);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(next);
        while (mo144672x467c086e.hasNext()) {
            arrayList.add(mo144672x467c086e.next());
        }
        return arrayList;
    }

    public static final java.util.List z(q26.n nVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        x(nVar, arrayList);
        return arrayList;
    }
}
